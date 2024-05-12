package com.ss.avframework.livestreamv2.core.interact.statistic;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class Statistics {
    public List<Cell> mList = new ArrayList();
    public int mWindowSizeMs;

    public double getAverageSize() {
        synchronized (this.mList) {
            update_l(System.currentTimeMillis());
            Iterator<Cell> it = this.mList.iterator();
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            while (it.hasNext()) {
                d += it.next().data;
            }
            if (this.mList.size() <= 0) {
                return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            return d / this.mList.size();
        }
    }

    public float getRatePerSecond() {
        synchronized (this.mList) {
            long currentTimeMillis = System.currentTimeMillis();
            update_l(currentTimeMillis);
            int size = this.mList.size();
            float f = 0.0f;
            if (size <= 0) {
                return 0.0f;
            }
            float f2 = ((float) (currentTimeMillis - this.mList.get(size - 1).timeMs)) / 1000.0f;
            if (f2 != 0.0f) {
                f = size / f2;
            }
            return f;
        }
    }

    public int getSize() {
        int size;
        synchronized (this.mList) {
            update_l(System.currentTimeMillis());
            size = this.mList.size();
        }
        return size;
    }

    public int getWindowLen() {
        return this.mWindowSizeMs;
    }

    public Statistics(int i) {
        this.mWindowSizeMs = i;
    }

    public void add(double d) {
        synchronized (this.mList) {
            long currentTimeMillis = System.currentTimeMillis();
            update_l(currentTimeMillis);
            this.mList.add(new Cell(d, currentTimeMillis));
        }
    }

    public void update_l(long j) {
        long j2 = j - this.mWindowSizeMs;
        while (!this.mList.isEmpty() && ((Cell) ListProtector.get(this.mList, 0)).timeMs < j2) {
            ListProtector.remove(this.mList, 0);
        }
    }

    /* loaded from: classes12.dex */
    public class Cell {
        public double data;
        public long timeMs;

        public Cell(Statistics statistics, double d) {
            this(d, System.currentTimeMillis());
        }

        public Cell(double d, long j) {
            this.data = d;
            this.timeMs = j;
        }
    }
}
