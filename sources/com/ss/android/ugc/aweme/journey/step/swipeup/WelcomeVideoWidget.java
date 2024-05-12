package com.ss.android.ugc.aweme.journey.step.swipeup;

import X.C16880lQ;
import X.C16970lZ;
import X.C24060x0;
import X.C38874FNm;
import X.C46757IWr;
import X.C62846OlW;
import X.C780334l;
import X.C85492Xgu;
import X.C85493Xgv;
import X.EF7;
import X.EXY;
import X.InterfaceC85498Xh0;
import X.JBR;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.zhiliaoapp.musically.R;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class WelcomeVideoWidget extends Widget implements InterfaceC85498Xh0 {
    public final String LJLJLJ;
    public final Integer LJLJLLL;
    public final boolean LJLL;
    public final float LJLLI;
    public final boolean LJLLILLLL;
    public final int LJLLJ;
    public C62846OlW LJLLL;
    public View LJLLLL;
    public C85493Xgv LJLLLLLL;
    public boolean LJLZ;
    public final String LJZ;
    public boolean LJZI;

    @Override // X.InterfaceC85498Xh0
    public final void LJII() {
        this.LJLZ = true;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (this.LJZI) {
            C85493Xgv c85493Xgv = this.LJLLLLLL;
            if (c85493Xgv != null) {
                c85493Xgv.LJI = false;
                int i = c85493Xgv.LJFF.LIZ;
                if (i != 1 && i != 2 && i != 4) {
                    return;
                }
                C24060x0 c24060x0 = c85493Xgv.LJ;
                if (c24060x0 != null) {
                    ((VideoViewComponent) c24060x0.LIZ).LLIIIILZ((OnUIPlayListener) c24060x0.LIZIZ);
                    C46757IWr c46757IWr = ((VideoViewComponent) c24060x0.LIZ).LJLILLLLZI;
                    if (c46757IWr != null) {
                        c46757IWr.LJJJZ();
                    }
                    ((VideoViewComponent) c24060x0.LIZ).LJIIJJI();
                    ((VideoViewComponent) c24060x0.LIZ).LJIIIZ();
                    c85493Xgv.LJFF.LIZ = 0;
                    C62846OlW c62846OlW = c85493Xgv.LIZLLL;
                    if (c62846OlW != null) {
                        c62846OlW.setVisibility(0);
                        return;
                    } else {
                        o.LJIJI("mCoverView");
                        throw null;
                    }
                }
                o.LJIJI("mPlayVideoHelper");
                throw null;
            }
            o.LJIJI("mWelcomeVideoHolder");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if ((!this.LJLLILLLL || !this.LJLZ) && this.LJZI) {
            C85493Xgv c85493Xgv = this.LJLLLLLL;
            if (c85493Xgv != null) {
                c85493Xgv.LIZ();
            } else {
                o.LJIJI("mWelcomeVideoHolder");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        if ((!this.LJLLILLLL || !this.LJLZ) && this.LJZI) {
            C85493Xgv c85493Xgv = this.LJLLLLLL;
            if (c85493Xgv != null) {
                c85493Xgv.LIZIZ();
            } else {
                o.LJIJI("mWelcomeVideoHolder");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        if (C38874FNm.LIZ()) {
            Context context = this.LJLIL;
            if (context instanceof Activity) {
                o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
                o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
                C16970lZ.LIZJ(R.layout.dub, (Activity) context, (ViewGroup) view, true);
                XKX.LIZLLL(C780334l.LJLIL, EXY.LIZ, null, new C85492Xgu(this, view, null), 2);
            }
        }
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLIL);
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C16880lQ.LLLZIIL(R.layout.dub, LLZIL, (ViewGroup) view);
        XKX.LIZLLL(C780334l.LJLIL, EXY.LIZ, null, new C85492Xgu(this, view, null), 2);
    }

    public WelcomeVideoWidget(String videoFileName, Integer num) {
        String LJFF;
        o.LJIIIZ(videoFileName, "videoFileName");
        this.LJLJLJ = videoFileName;
        this.LJLJLLL = num;
        this.LJLL = false;
        this.LJLLI = 1.7777778f;
        this.LJLLILLLL = false;
        this.LJLLJ = 10;
        Context LIZIZ = EF7.LIZIZ();
        if (C16880lQ.LLIIIZ(LIZIZ) == null) {
            LJFF = "";
        } else {
            StringBuilder LIZ = X1D.LIZ();
            File LLIIIZ = C16880lQ.LLIIIZ(LIZIZ);
            o.LJI(LLIIIZ);
            LIZ.append(LLIIIZ.getAbsolutePath());
            LJFF = JBR.LJFF(LIZ, File.separator, videoFileName, LIZ);
        }
        this.LJZ = LJFF;
    }
}
