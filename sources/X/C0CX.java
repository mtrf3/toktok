package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0CX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CX {
    public final java.util.Map<String, Object> LIZ = new HashMap();

    public final C0CY LIZ() {
        C0CY c0cy = new C0CY((java.util.Map<String, ?>) this.LIZ);
        C0CY.LIZLLL(c0cy);
        return c0cy;
    }

    public final void LIZIZ(java.util.Map map) {
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                ((HashMap) this.LIZ).put(key, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    ((HashMap) this.LIZ).put(key, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        java.util.Map<String, Object> map2 = this.LIZ;
                        boolean[] zArr = (boolean[]) value;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        ((HashMap) map2).put(key, boolArr);
                    } else if (cls == byte[].class) {
                        java.util.Map<String, Object> map3 = this.LIZ;
                        byte[] bArr = (byte[]) value;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        ((HashMap) map3).put(key, bArr2);
                    } else if (cls == int[].class) {
                        java.util.Map<String, Object> map4 = this.LIZ;
                        int[] iArr = (int[]) value;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        ((HashMap) map4).put(key, numArr);
                    } else if (cls == long[].class) {
                        java.util.Map<String, Object> map5 = this.LIZ;
                        long[] jArr = (long[]) value;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        ((HashMap) map5).put(key, lArr);
                    } else if (cls == float[].class) {
                        java.util.Map<String, Object> map6 = this.LIZ;
                        float[] fArr = (float[]) value;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        ((HashMap) map6).put(key, fArr2);
                    } else if (cls == double[].class) {
                        java.util.Map<String, Object> map7 = this.LIZ;
                        double[] dArr = (double[]) value;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        ((HashMap) map7).put(key, dArr2);
                    } else {
                        throw new IllegalArgumentException(C16880lQ.LLLZ("Key %s has invalid type %s", new Object[]{key, cls}));
                    }
                }
            }
        }
    }
}
