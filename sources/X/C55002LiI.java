package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.LiI, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55002LiI {
    public final int LIZ;
    public final Aweme LIZIZ;
    public final String LIZJ;
    public final EnumC55042Liw LIZLLL;
    public volatile int LJ;

    public final void LIZIZ() {
        int i = this.LJ;
        if (i != 0 && i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                LIZ(5);
                return;
            }
            LIZ(6);
            return;
        }
        LIZ(2);
    }

    public final void LIZ(int i) {
        if (i > this.LJ && this.LJ != 2 && this.LJ != 5 && this.LJ != 6) {
            this.LJ = i;
        }
    }

    public C55002LiI(Aweme aweme, int i, String str, EnumC55042Liw enumC55042Liw) {
        this.LIZIZ = aweme;
        this.LIZ = i;
        this.LIZLLL = enumC55042Liw;
        this.LIZJ = str;
    }
}
