package X;

/* renamed from: X.0Ov, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC06890Ov {
    RUNNING(0),
    SUCCESS(1),
    FAILED(-1);

    public final int mStatus;

    public static EnumC06890Ov valueOf(String str) {
        return (EnumC06890Ov) V0N.LJJJ(EnumC06890Ov.class, str);
    }

    EnumC06890Ov(int i) {
        this.mStatus = i;
    }
}
