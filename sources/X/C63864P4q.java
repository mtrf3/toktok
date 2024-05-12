package X;

import com.ss.android.vesdk.VEConfigCenter;

/* renamed from: X.P4q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C63864P4q {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VEConfigCenter.DataType.values().length];
        try {
            iArr[VEConfigCenter.DataType.LONG.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VEConfigCenter.DataType.BOOLEAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VEConfigCenter.DataType.FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VEConfigCenter.DataType.INTEGER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VEConfigCenter.DataType.STRING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        LIZ = iArr;
    }
}
