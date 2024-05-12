package X;

/* renamed from: X.15m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C273415m {
    public static final /* synthetic */ C273415m LIZ = new C273415m();
    public static final C39081g8 LIZIZ = new InterfaceC273615o() { // from class: X.1g8
        @Override // X.InterfaceC273615o
        public final long LJZI(long j, long j2) {
            float max = Math.max(C10430b1.LIZLLL(j2) / C10430b1.LIZLLL(j), C10430b1.LIZIZ(j2) / C10430b1.LIZIZ(j));
            return C1FP.LIZJ(max, max);
        }
    };
    public static final C39121gC LIZJ = new InterfaceC273615o() { // from class: X.1gC
        @Override // X.InterfaceC273615o
        public final long LJZI(long j, long j2) {
            float min = Math.min(C10430b1.LIZLLL(j2) / C10430b1.LIZLLL(j), C10430b1.LIZIZ(j2) / C10430b1.LIZIZ(j));
            return C1FP.LIZJ(min, min);
        }
    };
    public static final C39111gB LIZLLL = new InterfaceC273615o() { // from class: X.1gB
        @Override // X.InterfaceC273615o
        public final long LJZI(long j, long j2) {
            float LIZLLL2 = C10430b1.LIZLLL(j2) / C10430b1.LIZLLL(j);
            return C1FP.LIZJ(LIZLLL2, LIZLLL2);
        }
    };
    public static final C39131gD LJ = new InterfaceC273615o() { // from class: X.1gD
        @Override // X.InterfaceC273615o
        public final long LJZI(long j, long j2) {
            if (C10430b1.LIZLLL(j) <= C10430b1.LIZLLL(j2) && C10430b1.LIZIZ(j) <= C10430b1.LIZIZ(j2)) {
                return C1FP.LIZJ(1.0f, 1.0f);
            }
            float min = Math.min(C10430b1.LIZLLL(j2) / C10430b1.LIZLLL(j), C10430b1.LIZIZ(j2) / C10430b1.LIZIZ(j));
            return C1FP.LIZJ(min, min);
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1g8] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1gC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.1gB] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1gD] */
    static {
        new C39151gF();
    }
}
