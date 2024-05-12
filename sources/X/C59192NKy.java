package X;

import Y.ARunnableS46S0100000_10;
import android.os.Handler;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.NKy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59192NKy implements NRT {
    public final ViewStub LIZ;
    public Aweme LIZIZ;
    public int LIZJ;
    public FrameLayout LIZLLL;
    public C59193NKz LJ;
    public final Handler LJFF = new Handler(C16880lQ.LLJJJJ());

    public final boolean LJ() {
        Aweme aweme = this.LIZIZ;
        if (aweme != null && aweme.isAd() && C63081OpJ.LLII(this.LIZIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.NRT
    public final void LIZ() {
        if (!LJ()) {
            return;
        }
        this.LJFF.removeCallbacksAndMessages(null);
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // X.NRT
    public final void LIZIZ() {
        if (!LJ()) {
            return;
        }
        C59193NKz c59193NKz = this.LJ;
        if (c59193NKz != null) {
            C42625Go9.LIZJ(c59193NKz);
            c59193NKz.LIZIZ();
        }
        Aweme aweme = this.LIZIZ;
        if (aweme == null) {
            return;
        }
        aweme.setAdDescMaxLines(4);
    }

    @Override // X.NRT
    public final void LIZJ() {
        long j;
        if (!LJ()) {
            return;
        }
        Aweme aweme = this.LIZIZ;
        if (aweme != null) {
            aweme.setAdDescMaxLines(2);
        }
        ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(this, 210);
        int i = this.LIZJ;
        if (i > 0) {
            j = i * 1000;
        } else {
            j = 0;
        }
        this.LJFF.postDelayed(aRunnableS46S0100000_10, j);
    }

    public C59192NKy(ViewStub viewStub) {
        this.LIZ = viewStub;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0030  */
    @Override // X.NRT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r8) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59192NKy.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
