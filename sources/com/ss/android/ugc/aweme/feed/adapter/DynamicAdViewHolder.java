package com.ss.android.ugc.aweme.feed.adapter;

import X.AnonymousClass901;
import X.C201697vp;
import X.C207668Da;
import X.C222588oQ;
import X.C42625Go9;
import X.C46319IFv;
import X.C46586IQc;
import X.IE5;
import X.InterfaceC2302191t;
import X.NQH;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class DynamicAdViewHolder extends VideoViewCell implements IE5 {
    public final NQH LLZZ;

    @Override // X.IE5
    public final boolean LJIJJ() {
        if (this.LLZZ.isPlaying()) {
            pausePlayer();
            return false;
        }
        LJJJJLI();
        return true;
    }

    @Override // X.InterfaceC212318Ux
    public final void LJJJJLI() {
        this.LLZZ.LJJJJLI();
        AnonymousClass901 anonymousClass901 = this.LLJLILLLLZIIL;
        if (anonymousClass901 != null) {
            anonymousClass901.Z2();
        }
        C46586IQc.LIZ.tryPlay();
    }

    @Override // X.InterfaceC212318Ux
    public final void pausePlayer() {
        this.LLZZ.pausePlayer();
        C46586IQc.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LL() {
        super.LL();
        this.LLLILZ.iv0("ad_on_holder_resume", this, false);
        this.LLLILZ.iv0("ad_on_fragment_pager_resume", this, false);
        this.LLLILZ.iv0("ad_on_holder_pause", this, false);
        this.LLLILZ.iv0("ad_on_fragment_pager_pause", this, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicAdViewHolder(C222588oQ params) {
        super(params);
        o.LJIIIZ(params, "params");
        IFeedAdService LJJIJLIJ = FeedAdServiceImpl.LJJIJLIJ();
        FrameLayout mRootView = this.LLILZ;
        o.LJIIIIZZ(mRootView, "mRootView");
        this.LLZZ = LJJIJLIJ.LJIJI(mRootView);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLLLL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        super.LJLLLL(aweme);
        this.LLZZ.LIZIZ(this.LJLLL);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000c. Please report as an issue. */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: LLJJ */
    public final void onChanged(C207668Da c207668Da) {
        super.onChanged(c207668Da);
        if (c207668Da == null) {
            return;
        }
        String str = c207668Da.LIZ;
        switch (str.hashCode()) {
            case -2066092964:
                if (!str.equals("ad_on_holder_resume")) {
                    return;
                }
                LJJJJLI();
                return;
            case -895459340:
                if (!str.equals("ad_on_fragment_pager_resume")) {
                    return;
                }
                LJJJJLI();
                return;
            case 347029479:
                if (!str.equals("ad_on_holder_pause")) {
                    return;
                }
                pausePlayer();
                return;
            case 1493170511:
                if (!str.equals("ad_on_fragment_pager_pause")) {
                    return;
                }
                pausePlayer();
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void l8(int i) {
        C46319IFv dynamicOnUIPlayDelegate;
        super.l8(i);
        NQH controller = this.LLZZ;
        o.LJIIIZ(controller, "controller");
        C201697vp.LIZ = new WeakReference<>(controller);
        C42625Go9.LIZIZ(this.LLZZ);
        InterfaceC2302191t interfaceC2302191t = this.LLLLZIL;
        if (interfaceC2302191t != null && (dynamicOnUIPlayDelegate = interfaceC2302191t.getDynamicOnUIPlayDelegate()) != null) {
            this.LLZZ.LIZJ(dynamicOnUIPlayDelegate);
        }
        this.LLZZ.LJJJJLI();
        this.LLZZ.show();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        onChanged((C207668Da) obj);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.C2MA
    public final void t7(boolean z) {
        C46319IFv dynamicOnUIPlayDelegate;
        super.t7(z);
        C201697vp.LIZ = null;
        C42625Go9.LIZJ(this.LLZZ);
        InterfaceC2302191t interfaceC2302191t = this.LLLLZIL;
        if (interfaceC2302191t != null && (dynamicOnUIPlayDelegate = interfaceC2302191t.getDynamicOnUIPlayDelegate()) != null) {
            this.LLZZ.LIZ(dynamicOnUIPlayDelegate);
        }
        this.LLZZ.stopPlayer();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC55219Lln
    public final void ug(Video video) {
        SmartImageView smartImageView = this.LLFII;
        if (smartImageView != null) {
            smartImageView.setVisibility(8);
        }
        this.LLLIIIL = false;
    }
}
