package X;

import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker;

/* renamed from: X.O9i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61438O9i extends MusicShowOverChecker implements Runnable {
    public final View LJLL;
    public final Rect LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final boolean LIZ() {
        if (this.LJLL.getVisibility() == 0 && this.LJLL.getGlobalVisibleRect((Rect) this.LJLLILLLL.getValue()) && !((Rect) this.LJLLILLLL.getValue()).isEmpty() && ((Rect) this.LJLLJ.getValue()).setIntersect(this.LJLLI, (Rect) this.LJLLILLLL.getValue())) {
            Rect rect = (Rect) this.LJLLJ.getValue();
            int height = rect.height() * rect.width();
            Rect rect2 = (Rect) this.LJLLILLLL.getValue();
            if (height > (rect2.height() * rect2.width()) / 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker
    public final void LIZJ() {
        this.LJLL.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLJJLL) {
                LJ();
                this.LJLL.postDelayed(this, MusicShowOverChecker.LJLJLLL);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RunnableC61438O9i(android.view.View r11, com.ss.android.ugc.aweme.shortvideo.model.MusicModel r12, java.lang.Integer r13) {
        /*
            r10 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r0 = "musicModel"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            android.content.Context r1 = r11.getContext()
            boolean r0 = r1 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L61
            android.app.Activity r1 = (android.app.Activity) r1
            android.view.Window r0 = r1.getWindow()
            android.view.View r5 = r0.getDecorView()
            java.lang.String r0 = "context.window.decorView"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            int r4 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getWidth()
            int r0 = r5.getHeight()
            r3.<init>(r4, r2, r1, r0)
        L36:
            long r5 = r12.getId()
            java.lang.String r7 = r12.getName()
            java.lang.String r0 = "musicModel.name"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            java.lang.String r8 = r12.getRecommendTag()
            r4 = r10
            r9 = r13
            r4.<init>(r5, r7, r8, r9)
            r4.LJLL = r11
            r4.LJLLI = r3
            X.O9k r0 = X.C61440O9k.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r4.LJLLILLLL = r0
            X.O9j r0 = X.C61439O9j.LJLIL
            X.Ol8 r0 = X.C221108m2.LIZIZ(r0)
            r4.LJLLJ = r0
            return
        L61:
            android.graphics.Rect r3 = new android.graphics.Rect
            android.content.Context r0 = r11.getContext()
            java.lang.String r1 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            int r2 = X.C32151Nz.LJJII(r0)
            android.content.Context r0 = r11.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            int r1 = X.C32151Nz.LJJIFFI(r0)
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC61438O9i.<init>(android.view.View, com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Integer):void");
    }
}
