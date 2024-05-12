package X;

import Y.ARunnableS46S0100000_10;
import Y.IDrS49S0100000_10;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NAU extends MusicShowOverChecker {
    public final RecyclerView LJLL;
    public final LinearLayoutManager LJLLI;
    public final IDrS49S0100000_10 LJLLILLLL;

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final boolean LIZ() {
        LinearLayoutManager linearLayoutManager = this.LJLLI;
        if (linearLayoutManager == null) {
            return false;
        }
        C40517FvF c40517FvF = new C40517FvF(linearLayoutManager.LLIL(), this.LJLLI.LLILLIZIL());
        Integer num = this.LJLJJI;
        if (num == null || !c40517FvF.LJIILJJIL(num.intValue()) || this.LJLL.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZIZ() {
        this.LJLL.LJJLL(this.LJLLILLLL);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZJ() {
        if (this.LJLLI == null) {
            C78983UzD.LJIILJJIL();
            return;
        }
        this.LJLL.LJIIJJI(this.LJLLILLLL);
        LJ();
        this.LJLL.postDelayed(new ARunnableS46S0100000_10(this, 223), MusicShowOverChecker.LJLJLLL);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NAU(RecyclerView recyclerView, MusicModel musicModel, int i) {
        this(recyclerView, musicModel, i, false);
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(musicModel, "musicModel");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NAU(androidx.recyclerview.widget.RecyclerView r10, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r11, int r12, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "musicModel"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            long r3 = r11.getId()
            java.lang.String r5 = r11.getName()
            java.lang.String r0 = "musicModel.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            java.lang.String r6 = r11.getRecommendTag()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            r2 = r9
            r8 = r13
            r2.<init>(r3, r5, r6, r7, r8)
            r2.LJLL = r10
            X.0A2 r1 = r10.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L3b
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L30:
            r2.LJLLI = r1
            Y.IDrS49S0100000_10 r1 = new Y.IDrS49S0100000_10
            r0 = 2
            r1.<init>(r2, r0)
            r2.LJLLILLLL = r1
            return
        L3b:
            r1 = 0
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NAU.<init>(androidx.recyclerview.widget.RecyclerView, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int, boolean):void");
    }
}
