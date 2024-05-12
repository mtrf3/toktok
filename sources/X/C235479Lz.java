package X;

import com.bytedance.keva.Keva;

/* renamed from: X.9Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C235479Lz {
    public static String LIZJ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static C235479Lz LIZLLL;
    public final Keva LIZ;
    public volatile boolean LIZIZ;

    public C235479Lz() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("maf_red_point_repo");
        LIZ.append(LIZJ);
        this.LIZ = Keva.getRepo(X1D.LIZIZ(LIZ));
    }
}
