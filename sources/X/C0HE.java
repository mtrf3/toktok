package X;

/* renamed from: X.0HE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HE {
    public int LIZ;
    public String LIZIZ;

    public static C0HC LIZ() {
        return new C0HC();
    }

    public final String toString() {
        EnumC65786Prq enumC65786Prq;
        int i = this.LIZ;
        C65788Prs c65788Prs = EnumC65786Prq.LJLJI;
        Integer valueOf = Integer.valueOf(i);
        if (!c65788Prs.containsKey(valueOf)) {
            enumC65786Prq = EnumC65786Prq.LJLILLLLZI;
        } else {
            enumC65786Prq = (EnumC65786Prq) c65788Prs.get(valueOf);
        }
        return C0ON.LIZJ("Response Code: ", enumC65786Prq.toString(), ", Debug Message: ", this.LIZIZ);
    }
}
