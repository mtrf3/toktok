package com.ss.android.vesdk.utils;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes9.dex */
public class TEArrayUtils {
    public static double[] toDoubleArray(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return new double[0];
        }
        double[] dArr = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            dArr[i] = ((Double) ListProtector.get(list, i)).doubleValue();
        }
        return dArr;
    }

    public static float[] toFloatArray(List<Float> list) {
        if (list == null || list.isEmpty()) {
            return new float[0];
        }
        float[] fArr = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            fArr[i] = ((Float) ListProtector.get(list, i)).floatValue();
        }
        return fArr;
    }

    public static int[] toIntArray(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) ListProtector.get(list, i)).intValue();
        }
        return iArr;
    }

    public static long[] toLongArray(List<Long> list) {
        if (list == null || list.isEmpty()) {
            return new long[0];
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) ListProtector.get(list, i)).longValue();
        }
        return jArr;
    }

    public static String[] toStringArray(List<String> list) {
        if (list == null || list.isEmpty()) {
            return new String[0];
        }
        return (String[]) list.toArray(new String[list.size()]);
    }
}
