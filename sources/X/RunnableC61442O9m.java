package X;

import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;
import com.ss.android.ugc.aweme.choosemusic.widgets.ViewPager2MusicBoardWidget;

/* renamed from: X.O9m, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61442O9m extends MusicShowOverChecker implements Runnable {
    public final InterfaceC61443O9n LJLL;

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final boolean LIZ() {
        boolean z;
        Integer num = this.LJLJJI;
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        ViewPager2MusicBoardWidget viewPager2MusicBoardWidget = (ViewPager2MusicBoardWidget) this.LJLL;
        XYS xys = viewPager2MusicBoardWidget.LJLJLJ;
        if (xys == null) {
            return false;
        }
        View view = xys.itemView;
        if (view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int max = Math.max(viewPager2MusicBoardWidget.LJLLI * 3, 0);
        int min = Math.min(max + 3, viewPager2MusicBoardWidget.LJZ.size());
        if (intValue < max || intValue >= min || !z || !view.getGlobalVisibleRect(viewPager2MusicBoardWidget.LLFII) || !viewPager2MusicBoardWidget.LLFII.intersect(viewPager2MusicBoardWidget.LLFZ)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLJJLL) {
                LJ();
                new Handler(C16880lQ.LLJJJJ()).postDelayed(this, MusicShowOverChecker.LJLJLLL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZJ() {
        run();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC61442O9m(X.InterfaceC61443O9n r7, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "itemIsVisible"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            long r1 = r8.getId()
            java.lang.String r3 = r8.getName()
            java.lang.String r0 = "musicModel.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            java.lang.String r4 = r8.getRecommendTag()
            r0 = r6
            r0.<init>(r1, r3, r4, r5)
            r0.LJLL = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC61442O9m.<init>(X.O9n, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, int):void");
    }
}
