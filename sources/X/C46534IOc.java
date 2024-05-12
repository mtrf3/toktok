package X;

/* renamed from: X.IOc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46534IOc {
    public final float LIZ;
    public final EnumC46533IOb LIZIZ;

    public C46534IOc() {
        this.LIZIZ = EnumC46533IOb.UNKNOWN;
    }

    public static C46534IOc LIZIZ(String str) {
        int length;
        if (str == null || (length = str.length()) <= 1) {
            return null;
        }
        if (str.endsWith("%")) {
            return new C46534IOc(EnumC46533IOb.PERCENTAGE, VPR.LIZIZ(str, 0.0f));
        }
        if (length <= 2 || !str.endsWith("px")) {
            return null;
        }
        return new C46534IOc(EnumC46533IOb.DEVICE_PX, VPR.LIZIZ(str, 0.0f));
    }

    public final float LIZ(float f) {
        EnumC46533IOb enumC46533IOb = this.LIZIZ;
        if (enumC46533IOb == EnumC46533IOb.PERCENTAGE) {
            return this.LIZ * f;
        }
        if (enumC46533IOb == EnumC46533IOb.DEVICE_PX) {
            return this.LIZ;
        }
        return 0.0f;
    }

    public C46534IOc(EnumC46533IOb enumC46533IOb, float f) {
        this.LIZIZ = enumC46533IOb;
        this.LIZ = f;
    }
}
