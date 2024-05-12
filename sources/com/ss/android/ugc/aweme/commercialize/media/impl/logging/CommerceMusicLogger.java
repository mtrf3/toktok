package com.ss.android.ugc.aweme.commercialize.media.impl.logging;

import X.AbstractC58625Mzd;
import X.C44416Hbw;
import X.C58096Mr6;
import X.C58601MzF;
import X.C58627Mzf;
import X.C58638Mzq;
import X.C58649N0b;
import X.InterfaceC58549MyP;
import X.N46;
import X.N47;
import X.N48;
import X.N49;
import X.N4A;
import X.N4B;
import X.N4C;
import X.N4D;
import com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.AqS4S0101100_10;
import kotlin.jvm.internal.AqS59S0201000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceMusicLogger extends AbstractC58625Mzd implements ICommerceMusicLogger {
    public final C58601MzF<?>[] LJII;

    public CommerceMusicLogger() {
        super(new Object[0]);
        N4D.LIZ.getClass();
        this.LJII = new C58601MzF[]{new C58601MzF<>(N4D.LIZIZ, N46.LJLIL), new C58601MzF<>(N4D.LIZJ, N48.LJLIL), new C58601MzF<>(N4D.LIZLLL, N4B.LJLIL), new C58601MzF<>(N4D.LJ, C58638Mzq.LJLIL), new C58601MzF<>(N4D.LJI, N49.LJLIL), new C58601MzF<>(N4D.LJIIL, N47.LJLIL), new C58601MzF<>(N4D.LJIILIIL, N4A.LJLIL)};
    }

    @Override // X.AbstractC58624Mzc
    public final InterfaceC58549MyP LJJ() {
        return C58649N0b.LIZ(C58627Mzf.LIZ, C58649N0b.LIZIZ("commerce_music"));
    }

    public static ICommerceMusicLogger LJJII() {
        Object LIZ = C58096Mr6.LIZ(ICommerceMusicLogger.class, false);
        if (LIZ != null) {
            return (ICommerceMusicLogger) LIZ;
        }
        return new CommerceMusicLogger();
    }

    @Override // X.C58620MzY
    public final C58601MzF<?>[] LJIILL() {
        return this.LJII;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger
    public final void LIZLLL(Aweme aweme, long j, int i) {
        o.LJIIIZ(aweme, "aweme");
        if (!C44416Hbw.LIZLLL()) {
            return;
        }
        N4C.LIZ.getClass();
        LJIILJJIL(N4C.LJ, new AqS4S0101100_10(aweme, j, i, 0));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger
    public final void LJIIJJI(int i, Aweme aweme, MusicDetail musicDetail) {
        o.LJIIIZ(aweme, "aweme");
        if (!C44416Hbw.LIZLLL()) {
            return;
        }
        N4C.LIZ.getClass();
        LJIILJJIL(N4C.LIZJ, new AqS59S0201000_10(i, aweme, musicDetail, 5));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.media.api.logging.ICommerceMusicLogger
    public final void LJIIL(int i, Aweme aweme, MusicDetail musicDetail) {
        o.LJIIIZ(aweme, "aweme");
        if (!C44416Hbw.LIZLLL()) {
            return;
        }
        N4C.LIZ.getClass();
        LJIILJJIL(N4C.LIZLLL, new AqS59S0201000_10(i, aweme, musicDetail, 4));
    }
}
