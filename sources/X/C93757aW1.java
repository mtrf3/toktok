package X;

/* renamed from: X.aW1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93757aW1 {
    public static final /* synthetic */ int LIZ = 0;

    public static C78862UxG LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("ending reason: ");
                    LIZ2.append(i);
                    C93756aW0.LIZ(X1D.LIZIZ(LIZ2));
                    return C78857UxB.LJJIIJ(1476788483, "bpea-voice_search_end_fallback");
                }
                return C78857UxB.LJJIIJ(1476788483, "bpea-voice_search_end_fallback");
            }
            return C78857UxB.LJJIIJ(1476788483, "bpea-voice_search_end_exit");
        }
        return C78857UxB.LJJIIJ(1476788483, "bpea-voice_search_end_manual");
    }
}
