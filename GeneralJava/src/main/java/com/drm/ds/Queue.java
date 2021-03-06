package com.drm.ds;

/**
 * TODO
 * @author drm
 *
 * @param <T>
 */
public interface Queue<T> {
  void add(T t);
  T remove();
  T poll();
  void offer(T t);
  T max();
  T min();
}
