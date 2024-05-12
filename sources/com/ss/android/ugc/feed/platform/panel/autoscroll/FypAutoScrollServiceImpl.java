package com.ss.android.ugc.feed.platform.panel.autoscroll;

import X.C224888s8;
import X.C48758JBq;
import X.C58096Mr6;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;

/* loaded from: classes4.dex */
public final class FypAutoScrollServiceImpl implements FypAutoScrollService {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public static FypAutoScrollService LJIIZILJ() {
        Object LIZ = C58096Mr6.LIZ(FypAutoScrollService.class, false);
        if (LIZ != null) {
            return (FypAutoScrollService) LIZ;
        }
        if (C58096Mr6.r8 == null) {
            synchronized (FypAutoScrollService.class) {
                if (C58096Mr6.r8 == null) {
                    C58096Mr6.r8 = new FypAutoScrollServiceImpl();
                }
            }
        }
        return C58096Mr6.r8;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LJII() {
        return C48758JBq.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final String LJIIIZ() {
        return C224888s8.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LIZ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LIZJ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LJIIL() {
        return this.LJI;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LJIILIIL() {
        return this.LJ;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LJIILJJIL() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LJIILL() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LIZLLL(boolean z) {
        this.LJFF = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LJ(boolean z) {
        this.LIZLLL = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LJFF(boolean z) {
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LJI(boolean z) {
        this.LJ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LJIIIIZZ(boolean z) {
        this.LJI = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final boolean LJIIJ(String str) {
        if (str == null) {
            str = "";
        }
        return C224888s8.LJ(str);
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LJIIJJI(boolean z) {
        this.LIZJ = z;
    }

    @Override // com.ss.android.ugc.aweme.feed.FypAutoScrollService
    public final void LJIILLIIL(boolean z) {
        this.LIZIZ = z;
    }
}
