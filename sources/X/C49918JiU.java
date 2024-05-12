package X;

import Y.ARunnableS11S0201000_8;
import Y.ARunnableS12S0101000_8;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PatchConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.JiU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49918JiU implements InterfaceC66632QDc<SearchMixFeedList> {
    public final /* synthetic */ C49915JiR LIZ;
    public final /* synthetic */ C10K LIZIZ;
    public final /* synthetic */ C49914JiQ LIZJ;

    @Override // X.InterfaceC66632QDc
    public final void onComplete() {
        this.LIZJ.LLIIIL.o10();
        if (this.LIZ.LLIILZL) {
            return;
        }
        this.LIZJ.mHandler.post(new ARunnableS12S0101000_8(4, this, 9));
    }

    @Override // X.InterfaceC66632QDc
    public final void onFailed(Throwable th) {
        C49914JiQ c49914JiQ = this.LIZJ;
        c49914JiQ.LLIIII = true;
        c49914JiQ.LJJJJ(5);
        this.LIZJ.LLIIIL.WN();
        this.LIZJ.LLIIIL.o10();
        if (this.LIZ.LLIILZL) {
            return;
        }
        if (th instanceof Exception) {
            this.LIZJ.LJJJ((Exception) th, this.LIZIZ);
        } else {
            this.LIZJ.LJJJ(this.LIZIZ.LJIIJ(), this.LIZIZ);
            this.LIZJ.LJLJLJ = false;
        }
    }

    @Override // X.InterfaceC66632QDc
    public final void onNext(SearchMixFeedList searchMixFeedList) {
        K k;
        SearchMixFeedList searchMixFeedList2 = searchMixFeedList;
        C49914JiQ c49914JiQ = this.LIZJ;
        if (c49914JiQ.LLFZ == 5) {
            return;
        }
        if (c49914JiQ.LLIIIJ) {
            C49919JiV c49919JiV = c49914JiQ.LLIIIL;
            if (c49919JiV.LJLIL != 0 && (k = c49919JiV.LJLILLLLZI) != 0) {
                ((InterfaceC49926Jic) k).Tc();
            }
            c49914JiQ.LLIIIJ = false;
        }
        if (this.LIZ.LLIILZL) {
            this.LIZJ.LLIIIL.WN();
            this.LIZJ.LLIIIL.o10();
            return;
        }
        System.currentTimeMillis();
        C49914JiQ c49914JiQ2 = this.LIZJ;
        if (c49914JiQ2.LLIFFJFJJ || c49914JiQ2.LLIIIILZ) {
            C49956Jj6.LIZLLL(searchMixFeedList2, false);
            C49914JiQ c49914JiQ3 = this.LIZJ;
            if (c49914JiQ3.LLIIIILZ) {
                c49914JiQ3.LLIIIILZ = false;
            }
        }
        C49914JiQ c49914JiQ4 = this.LIZJ;
        if (c49914JiQ4.LLIFFJFJJ) {
            if (c49914JiQ4.LLFF == null) {
                c49914JiQ4.LLFF = new C49847JhL();
            }
            C49856JhU.LIZ(c49914JiQ4.LLFF);
        }
        C49491Jbb.LJIIIZ.compareAndSet(1, 2);
        this.LIZJ.LLIIJI = System.currentTimeMillis();
        searchMixFeedList2.LJLJJL = true;
        PatchConfig patchConfig = searchMixFeedList2.patchConfig;
        if (patchConfig != null && Boolean.TRUE.equals(patchConfig.enablePreDisplay)) {
            C49920JiW LJ = C49921JiX.LJ(this.LIZJ.LJLJJI);
            LJ.getClass();
            if (!o.LJ(LJ, C49567Jcp.LIZ)) {
                LJ.LJJIJLIJ = true;
            }
            C49923JiZ LIZLLL = C49922JiY.LIZLLL(this.LIZJ.LJLJJI);
            LIZLLL.getClass();
            if (!o.LJ(LIZLLL, C49936Jim.LIZ)) {
                LIZLLL.LJJI = true;
            }
            this.LIZJ.mHandler.postAtFrontOfQueue(new ARunnableS12S0101000_8(4, this, 35));
        }
        this.LIZJ.mHandler.post(new ARunnableS11S0201000_8(3, this, searchMixFeedList2, 5));
    }

    public C49918JiU(C49914JiQ c49914JiQ, C49915JiR c49915JiR, C10K c10k) {
        this.LIZJ = c49914JiQ;
        this.LIZ = c49915JiR;
        this.LIZIZ = c10k;
    }
}
