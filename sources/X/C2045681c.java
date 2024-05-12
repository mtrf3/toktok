package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.81c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045681c {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final InterfaceC65784Pro<C76800UCe> LIZIZ;
    public boolean LIZLLL;
    public Aweme LJ;
    public int LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public AqS153S0100000_3 LJIIJ;
    public boolean LIZJ = true;
    public String LJFF = "";
    public String LJI = "";

    public final void LIZ() {
        int i;
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("logVideoPlayFinishEventIfNotReported -> ");
        LIZ.append(this.LIZJ);
        LIZ.append(", ");
        LIZ.append(this.LIZLLL);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ));
        if (!this.LIZJ || !this.LIZLLL || C84763XOl.LJIIJJI) {
            return;
        }
        long j = this.LJIIIIZZ + this.LJIIIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("logVideoPlayFinishEvent: ");
        LIZ2.append(this.LJIIIIZZ);
        LIZ2.append(", ");
        LIZ2.append(this.LJIIIZ);
        C201467vS.LJIIJ(X1D.LIZIZ(LIZ2));
        Aweme aweme = this.LJ;
        if (aweme != null) {
            i = V16.LJJIFFI(aweme);
        } else {
            i = 0;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C2047381t.LIZ() == 1 || C2047381t.LIZ() == 2) {
            long j2 = j / 1000;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("logVideoPlayFinishEvent: ");
            LIZ3.append(j);
            LIZ3.append(", isSinglePicMode: ");
            LIZ3.append(z);
            String msg = X1D.LIZIZ(LIZ3);
            o.LJIIIZ(msg, "msg");
            if (C2047381t.LIZ() == 1 && z) {
                if (j2 < ((Number) AnonymousClass823.LIZ.getValue()).intValue()) {
                    return;
                }
            } else if (C2047381t.LIZ() == 2 && j2 < ((Number) AnonymousClass823.LIZ.getValue()).intValue()) {
                return;
            }
        }
        this.LIZJ = false;
        AqS153S0100000_3 aqS153S0100000_3 = this.LJIIJ;
        if (aqS153S0100000_3 != null) {
            aqS153S0100000_3.invoke();
        }
        C38995FSd.LIZIZ().execute(new ARunnableS39S0100000_3(this, 225));
    }

    public C2045681c(AqS153S0100000_3 aqS153S0100000_3, AqS153S0100000_3 aqS153S0100000_32) {
        this.LIZ = aqS153S0100000_3;
        this.LIZIZ = aqS153S0100000_32;
    }

    public final void LIZIZ(long j, long j2) {
        this.LJIIIZ = j2;
        this.LJIIIIZZ = j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoPlayEventTracker setPhotoStayTime totalFeedStayTimeMs: ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", totalFullPageStayTime: ");
        LIZ.append(this.LJIIIZ);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }
}
