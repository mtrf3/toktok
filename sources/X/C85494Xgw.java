package X;

import android.content.Context;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.Xgw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85494Xgw extends C222898ov {
    public final /* synthetic */ C85493Xgv LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        this.LJLIL.LIZIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayFailed(IPG ipg) {
        C62846OlW c62846OlW = this.LJLIL.LIZLLL;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(0);
        } else {
            o.LJIJI("mCoverView");
            throw null;
        }
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(float f) {
        Context context = this.LJLIL.LIZ.getContext();
        o.LJIIIIZZ(context, "mRootView.context");
        if (!V1B.LJJZZI(C45804HyK.LJIJJ(context), false)) {
            C85493Xgv c85493Xgv = this.LJLIL;
            if (c85493Xgv.LJFF.LIZ != 3) {
                c85493Xgv.LIZ();
            }
        }
        if (this.LJLILLLLZI) {
            this.LJLIL.getClass();
            if (f >= 85.0f) {
                C24060x0 c24060x0 = this.LJLIL.LJ;
                if (c24060x0 != null) {
                    ((VideoViewComponent) c24060x0.LIZ).LJIIJ(90.0f);
                    this.LJLIL.LIZIZ.LJII();
                    this.LJLIL.LIZ();
                    return;
                }
                o.LJIJI("mPlayVideoHelper");
                throw null;
            }
        }
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderReady(IPH iph) {
        C62846OlW c62846OlW = this.LJLIL.LIZLLL;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(8);
        } else {
            o.LJIJI("mCoverView");
            throw null;
        }
    }

    @Override // X.C222898ov, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
        C62846OlW c62846OlW = this.LJLIL.LIZLLL;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(8);
        } else {
            o.LJIJI("mCoverView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onRenderFirstFrame(IT4 it4) {
    }

    public C85494Xgw(C85493Xgv c85493Xgv, boolean z) {
        this.LJLIL = c85493Xgv;
        this.LJLILLLLZI = z;
    }
}
