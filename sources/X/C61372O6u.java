package X;

/* renamed from: X.O6u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61372O6u {
    public static volatile C61372O6u LIZJ;
    public volatile O7E LIZ;
    public long LIZIZ;

    public static C61372O6u LIZ() {
        if (LIZJ == null) {
            synchronized (C61372O6u.class) {
                if (LIZJ == null) {
                    LIZJ = new C61372O6u();
                }
            }
        }
        return LIZJ;
    }
}
