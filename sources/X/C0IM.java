package X;

/* renamed from: X.0IM, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0IM {
    RAW(0),
    ISO_8601(1);

    public final int value;

    public static C0IM valueOf(String str) {
        return (C0IM) V0N.LJJJ(C0IM.class, str);
    }

    C0IM(int i) {
        this.value = i;
    }
}
