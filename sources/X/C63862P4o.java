package X;

import com.ss.android.vesdk.VEConfigCenter;

/* renamed from: X.P4o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public /* synthetic */ class C63862P4o {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[VEConfigCenter.DataType.values().length];
        LIZIZ = iArr;
        try {
            iArr[VEConfigCenter.DataType.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZIZ[VEConfigCenter.DataType.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZIZ[VEConfigCenter.DataType.FLOAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZIZ[VEConfigCenter.DataType.LONG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZIZ[VEConfigCenter.DataType.INTEGER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[EnumC63863P4p.values().length];
        LIZ = iArr2;
        try {
            iArr2[EnumC63863P4p.VEABSetType_MobileUGCv2.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            LIZ[EnumC63863P4p.VEABSetType_MobileUGC.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            LIZ[EnumC63863P4p.VEABSetType_MobileEditor.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            LIZ[EnumC63863P4p.VEABSetType_MobileEditorv2.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
