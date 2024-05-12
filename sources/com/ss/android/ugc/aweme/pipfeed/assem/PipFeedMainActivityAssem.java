package com.ss.android.ugc.aweme.pipfeed.assem;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C221108m2;
import X.C48772JCe;
import X.C54258LRe;
import X.C55096Ljo;
import X.C62822Ol8;
import X.INR;
import X.InterfaceC55058LjC;
import X.InterfaceC59622Vq;
import X.JD9;
import X.JDE;
import X.JDK;
import X.LRD;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pipfeed.PipFeedManager;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel;
import com.ss.android.ugc.aweme.pipfeed.vm.shared.FeedPipViewModel$currentAweme$1;
import com.ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class PipFeedMainActivityAssem extends BaseMainContainerAssem {
    public static WeakReference<PipFeedMainActivityAssem> LJLJI = new WeakReference<>(null);
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 97));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C48772JCe.LJLIL);

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        PipFeedManager.Companion.getClass();
        JD9.LIZ.onPrevActivityDestroyed$pipfeed_release();
        LJLJI = new WeakReference<>(null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
        this.LJLIL.getValue();
        LJLJI = new WeakReference<>(this);
    }

    @Override // X.C8W0
    public final void onStop() {
        ActivityC45651qj LIZ;
        FeedPanelStateViewModel.DialogStateLiveData LJFF;
        InterfaceC59622Vq stateRequestHandler;
        FeedPanelStateViewModel.DialogStateLiveData LJFF2;
        InterfaceC59622Vq stateRequestHandler2;
        FeedPanelStateViewModel.DialogStateLiveData LJFF3;
        InterfaceC59622Vq stateRequestHandler3;
        FeedPanelStateViewModel.DialogStateLiveData LJFF4;
        InterfaceC59622Vq stateRequestHandler4;
        FeedPanelStateViewModel.DialogStateLiveData LJFF5;
        InterfaceC59622Vq stateRequestHandler5;
        super.onStop();
        if (!JDE.LIZ()) {
            return;
        }
        if (!v3(false)) {
            FeedPipViewModel feedPipViewModel = (FeedPipViewModel) this.LJLIL.getValue();
            feedPipViewModel.LJLIL.setValue((FeedPipViewModel$currentAweme$1) null);
            feedPipViewModel.LJLJJL = false;
            feedPipViewModel.LJLJJI = null;
            feedPipViewModel.LJLJLJ = null;
            ((ArrayList) feedPipViewModel.LJLJLLL).clear();
            feedPipViewModel.LJLL.clear();
            feedPipViewModel.LJZI.LIZ = 0;
            feedPipViewModel.kv0(0);
            feedPipViewModel.LJZI.LIZIZ = 0.0f;
            ((IPipFeedService) this.LJLILLLLZI.getValue()).LJII(null);
        }
        PipFeedManager.Companion.getClass();
        if (JD9.LIZ.canStartPipNow$pipfeed_release() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C54258LRe LIZ2 = LRD.LIZ(LIZ);
            if (LIZ2.LIZ("long_press_layer") && (LJFF5 = LIZ2.LJFF("long_press_panel")) != null && (stateRequestHandler5 = LJFF5.getStateRequestHandler()) != null) {
                stateRequestHandler5.LIZ();
            }
            if (LIZ2.LIZLLL() && (LJFF4 = LIZ2.LJFF("share_panel")) != null && (stateRequestHandler4 = LJFF4.getStateRequestHandler()) != null) {
                stateRequestHandler4.LIZ();
            }
            if (LIZ2.LIZ("downloaded_video_share_dialog") && (LJFF3 = LIZ2.LJFF("downloaded_video_share_dialog")) != null && (stateRequestHandler3 = LJFF3.getStateRequestHandler()) != null) {
                stateRequestHandler3.LIZ();
            }
            if (LIZ2.LIZ("ad_explain_static_dynamic") && (LJFF2 = LIZ2.LJFF("ad_explain_static_dynamic")) != null && (stateRequestHandler2 = LJFF2.getStateRequestHandler()) != null) {
                stateRequestHandler2.LIZ();
            }
            if (LIZ2.LIZIZ() && (LJFF = LIZ2.LJFF("comment_panel")) != null && (stateRequestHandler = LJFF.getStateRequestHandler()) != null) {
                stateRequestHandler.LIZ();
            }
        }
    }

    @Override // X.C8W0
    public final void onStart() {
        super.onStart();
    }

    public final boolean v3(boolean z) {
        ActivityC45651qj LIZ;
        Aweme aweme;
        if (!(ActivityStack.getTopActivity() instanceof InterfaceC55058LjC) || (LIZ = C212428Vi.LIZ(this)) == null) {
            return false;
        }
        Iterator<String> it = ((IPipFeedService) this.LJLILLLLZI.getValue()).LJIILIIL().iterator();
        while (it.hasNext()) {
            if (Hox.LJLLI.LIZ(LIZ).vv0(it.next())) {
                if (!z) {
                    FeedPipViewModel feedPipViewModel = (FeedPipViewModel) this.LJLIL.getValue();
                    Aweme value = feedPipViewModel.LJLIL.getValue();
                    if (value == null || value.getVideo() == null || !(!((ArrayList) feedPipViewModel.hv0()).isEmpty()) || feedPipViewModel.LJLJJL || feedPipViewModel.LJLJLJ == null) {
                        return false;
                    }
                    if (((Number) JDK.LIZ.getValue()).intValue() == 1 && ((aweme = ((FeedPipViewModel) this.LJLIL.getValue()).LJLILLLLZI) == null || !INR.LIZ(aweme))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
