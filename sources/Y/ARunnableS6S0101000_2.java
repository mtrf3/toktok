package Y;

import X.AbstractC167696i5;
import X.AnonymousClass658;
import X.C0A2;
import X.C130595Ap;
import X.C150135ur;
import X.C1545864w;
import X.C156426By;
import X.C156436Bz;
import X.C157376Fp;
import X.C161946Xe;
import X.C2PN;
import X.C5L7;
import X.C5S1;
import X.C69P;
import X.C69V;
import X.C6AA;
import X.C6AL;
import X.C6BL;
import X.C6BU;
import X.C6DT;
import X.C6JD;
import X.C6JU;
import X.C6LV;
import X.C74275TDb;
import X.C80796VnM;
import X.C81184Vtc;
import X.C90193gN;
import X.EnumC1551166x;
import X.H78;
import X.H7B;
import X.H7R;
import X.InterfaceC133835Nb;
import X.InterfaceC153045zY;
import X.KL4;
import X.ViewTreeObserverOnDrawListenerC55314LnK;
import X.X1D;
import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.pns.universalpopup.api.ui.UniversalPopupUI;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS53S0201000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS6S0101000_2 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int LJZL;
        List<C156426By> list;
        ((Handler) ((C6BU) this.l0).LJLLLL.getValue()).postDelayed(this, 16L);
        InterfaceC153045zY value = ((C6BU) this.l0).getEditPreviewApi().Kh().getValue();
        if (value == null || !((C6BU) this.l0).LJLJJLL.LJIILLIIL() || (LJZL = value.LJZL()) == this.i1) {
            return;
        }
        this.i1 = LJZL;
        C6BL c6bl = ((C6BU) this.l0).LJLJJLL;
        long j = LJZL;
        if (!c6bl.LJIILLIIL() || (list = c6bl.LJLLI) == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C156426By c156426By = (C156426By) it.next();
            c156426By.setPlayPosition(j);
            if (c6bl.LLFF) {
                c156426By.LJIILL();
            } else {
                c156426By.LJIILIIL();
            }
        }
    }

    public final void LIZ$1() {
        int LJZL;
        ((Handler) ((C6JU) this.l0).LJLLJ.getValue()).postDelayed(this, 16L);
        InterfaceC153045zY value = ((C6JU) this.l0).getEditPreviewApi().Kh().getValue();
        if (value == null || !((C6JU) this.l0).LLJJ().LJIILLIIL() || (LJZL = value.LJZL()) == this.i1) {
            return;
        }
        this.i1 = LJZL;
        ((C6JU) this.l0).LLJJ().LJJIJIIJIL(Long.valueOf(LJZL));
    }

    public final void LIZ$2() {
        int LJZL;
        ((Handler) ((C6JD) this.l0).LJLLJ.getValue()).postDelayed(this, 16L);
        InterfaceC153045zY value = ((C6JD) this.l0).getEditPreviewApi().Kh().getValue();
        if (value == null || !((C6JD) this.l0).LLJJI().LJIILLIIL() || (LJZL = value.LJZL()) == this.i1) {
            return;
        }
        this.i1 = LJZL;
        ((C6JD) this.l0).LLJJI().LJJIJIIJIL(Long.valueOf(LJZL));
    }

    public final void LIZ$3() {
        int LJZL;
        Handler handler = (Handler) ((C157376Fp) this.l0).LJLLLL.getValue();
        if (handler != null) {
            handler.postDelayed(this, 16L);
        }
        InterfaceC153045zY value = ((C157376Fp) this.l0).getEditPreviewApi().Kh().getValue();
        if (value == null || !((C157376Fp) this.l0).LJIJJLI() || (LJZL = value.LJZL()) == this.i1) {
            return;
        }
        this.i1 = LJZL;
        ((C157376Fp) this.l0).LLJJIII().LJJIJIIJIL(Long.valueOf(LJZL));
    }

    public final void LIZ$4() {
        if (H7R.LJJJJL(((C1545864w) this.l0).getEditModel())) {
            long createTime = ((C1545864w) this.l0).getEditModel().creativeModel.onThisDayData.getCreateTime();
            C1545864w c1545864w = (C1545864w) this.l0;
            Activity activity = c1545864w.mActivity;
            if (activity != null) {
                AnonymousClass658 anonymousClass658 = new AnonymousClass658(createTime, activity, c1545864w.getEditPreviewApi());
                anonymousClass658.LIZJ(new AqS53S0201000_2((C1545864w) this.l0, this.i1, anonymousClass658, 3));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (((C1545864w) this.l0).getEditModel().creativeModel.onThisDayData.getForwardType() == 3 || ((C1545864w) this.l0).getEditModel().creativeModel.onThisDayData.getForwardType() == 2) {
            long createTime2 = ((C1545864w) this.l0).getEditModel().creativeModel.onThisDayData.getCreateTime();
            C1545864w c1545864w2 = (C1545864w) this.l0;
            Activity activity2 = c1545864w2.mActivity;
            if (activity2 != null) {
                AnonymousClass658 anonymousClass6582 = new AnonymousClass658(createTime2, activity2, c1545864w2.getEditPreviewApi());
                anonymousClass6582.LIZJ(new AqS133S0200000_2((C1545864w) this.l0, anonymousClass6582, 93));
                return;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        long createTime3 = ((C1545864w) this.l0).getEditModel().creativeModel.onThisDayData.getCreateTime();
        C1545864w c1545864w3 = (C1545864w) this.l0;
        Activity activity3 = c1545864w3.mActivity;
        if (activity3 != null) {
            AnonymousClass658 anonymousClass6583 = new AnonymousClass658(createTime3, activity3, c1545864w3.getEditPreviewApi());
            anonymousClass6583.LIZJ(new AqS133S0200000_2((C1545864w) this.l0, anonymousClass6583, 94));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LIZ$5() {
        C69V c69v;
        C6DT c6dt;
        RecyclerView recyclerView = ((C69P) this.l0).LJLJLJ;
        RecyclerView.ViewHolder viewHolder = null;
        if (recyclerView != null) {
            viewHolder = recyclerView.LJJIZ(this.i1);
        }
        if ((viewHolder instanceof C69V) && (c69v = (C69V) viewHolder) != null && (c6dt = c69v.LJLIL) != null) {
            int i = this.i1;
            C69P c69p = (C69P) this.l0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> requestFocusAtPos: requestFocus fmc pos ");
            LIZ.append(i);
            H7B.LJ(X1D.LIZIZ(LIZ));
            c6dt.requestFocus();
            c69p.LJLJJL.Wa(c6dt);
        }
    }

    public static final void run$0(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        ViewTreeObserver viewTreeObserver;
        float width;
        int LJ;
        ImageView imageView;
        switch (aRunnableS6S0101000_2.i1) {
            case 0:
                ((AbsAudienceInteractionFragment) aRunnableS6S0101000_2.l0).lambda$prepareChildWidgets$0();
                return;
            case 1:
                WebView webView = (WebView) aRunnableS6S0101000_2.l0;
                WeakHashMap<WebView, WebViewPort.JSInterface> weakHashMap = WebViewPort.JSInterface.LIZJ;
                if (weakHashMap.get(webView) != null) {
                    return;
                }
                WebViewPort.JSInterface jSInterface = new WebViewPort.JSInterface();
                webView.addJavascriptInterface(jSInterface, "pia_bridge");
                weakHashMap.put(webView, jSInterface);
                return;
            case 2:
                ((KeyboardDialogFragment) aRunnableS6S0101000_2.l0).LJLZ.setVisibility(0);
                return;
            case 3:
                ViewTreeObserverOnDrawListenerC55314LnK viewTreeObserverOnDrawListenerC55314LnK = (ViewTreeObserverOnDrawListenerC55314LnK) aRunnableS6S0101000_2.l0;
                C80796VnM c80796VnM = viewTreeObserverOnDrawListenerC55314LnK.LJLILLLLZI.mViewPager;
                if (c80796VnM != null && (viewTreeObserver = c80796VnM.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(viewTreeObserverOnDrawListenerC55314LnK);
                    return;
                }
                return;
            case 4:
                ((C156426By) aRunnableS6S0101000_2.l0).LJFF(true);
                return;
            case 5:
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) aRunnableS6S0101000_2.l0;
                List<Pair<Aweme, Integer>> list = profilePageFragment.LL;
                profilePageFragment.pm(0, list);
                profilePageFragment.LL = list;
                return;
            case 6:
                final VEVideoPublishPreviewScene vEVideoPublishPreviewScene = (VEVideoPublishPreviewScene) aRunnableS6S0101000_2.l0;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vEVideoPublishPreviewScene.LJLLLL.getLayoutParams();
                if (vEVideoPublishPreviewScene.LLIIIL.getVideoWidth() != null && vEVideoPublishPreviewScene.LLIIIL.getVideoWidth().intValue() != 0) {
                    width = vEVideoPublishPreviewScene.LJLLLL.getWidth() * 1.0f;
                    LJ = vEVideoPublishPreviewScene.LLIIIL.getVideoWidth().intValue();
                } else {
                    width = vEVideoPublishPreviewScene.LJLLLL.getWidth() * 1.0f;
                    LJ = C81184Vtc.LJ(C5L7.LIZ());
                }
                float f = width / LJ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("renderCaption surface width ");
                LIZ.append(vEVideoPublishPreviewScene.LJLLLL.getWidth());
                H78.LJI(X1D.LIZIZ(LIZ));
                float height = (vEVideoPublishPreviewScene.LJLLLL.getHeight() - vEVideoPublishPreviewScene.LJLLL.LJIIIZ.LLILZ().height) / 2;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vEVideoPublishPreviewScene.LLIIIJ.getLayoutParams();
                int i = C156436Bz.LLILZ;
                int i2 = C156436Bz.LLILLL;
                if (vEVideoPublishPreviewScene.LLIIIL.getMarginStart() != null && vEVideoPublishPreviewScene.LLIIIL.getMarginStart().intValue() > 0) {
                    i = vEVideoPublishPreviewScene.LLIIIL.getMarginStart().intValue();
                    i2 = vEVideoPublishPreviewScene.LLIIIL.getMarginTop().intValue();
                }
                if (vEVideoPublishPreviewScene.LLIIIL.getLocation() == EnumC1551166x.LEFT_BOTTOM.getValue()) {
                    layoutParams2.gravity = 80;
                    layoutParams2.bottomMargin = (int) (C74275TDb.LIZIZ(vEVideoPublishPreviewScene.requireActivity(), 8.0f) + vEVideoPublishPreviewScene.LJZI.getBottomMarginForCaptionSticker());
                } else {
                    layoutParams2.gravity = 48;
                    layoutParams2.topMargin = (int) ((i2 * f) + height + layoutParams.topMargin);
                }
                if (C90193gN.LIZ()) {
                    layoutParams2.rightMargin = (int) ((i * f) + layoutParams.rightMargin);
                } else {
                    layoutParams2.leftMargin = (int) ((i * f) + layoutParams.leftMargin);
                }
                vEVideoPublishPreviewScene.LLIIIJ.bringToFront();
                vEVideoPublishPreviewScene.LLIIIJ.setLayoutParams(layoutParams2);
                vEVideoPublishPreviewScene.LJLLL.LJIIIZ.LLJLIL(new InterfaceC133835Nb() { // from class: X.6XG
                    @Override // X.InterfaceC133835Nb
                    public final void LIZ(int i3) {
                        VEVideoPublishPreviewScene vEVideoPublishPreviewScene2 = VEVideoPublishPreviewScene.this;
                        String LIZ2 = vEVideoPublishPreviewScene2.LJLLLLLL.LIZ(i3);
                        if (TextUtils.isEmpty(LIZ2)) {
                            vEVideoPublishPreviewScene2.LLIIIJ.setVisibility(4);
                        } else {
                            vEVideoPublishPreviewScene2.LLIIIJ.setVisibility(0);
                            vEVideoPublishPreviewScene2.LLIIIJ.setText(LIZ2);
                        }
                    }
                });
                return;
            default:
                ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) aRunnableS6S0101000_2.l0;
                if (!chooseCoverActivity.LJLZ && (imageView = chooseCoverActivity.LJLJLJ) != null && imageView.getVisibility() == 0) {
                    chooseCoverActivity.LJLJLJ.setVisibility(4);
                    return;
                }
                return;
        }
    }

    public static final void run$1(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        switch (aRunnableS6S0101000_2.i1) {
            case 0:
                DetailFragmentPanel detailFragmentPanel = ((ViewTreeObserverOnDrawListenerC55314LnK) aRunnableS6S0101000_2.l0).LJLILLLLZI;
                detailFragmentPanel.getClass();
                if (((Boolean) C2PN.LIZIZ.getValue()).booleanValue()) {
                    detailFragmentPanel.LJJJLL(true);
                    return;
                } else {
                    detailFragmentPanel.LJJJJZI(1);
                    return;
                }
            case 1:
                UniversalPopupUI this$0 = (UniversalPopupUI) aRunnableS6S0101000_2.l0;
                o.LJIIIZ(this$0, "this$0");
                this$0.LJLIL.set(false);
                return;
            case 2:
                KL4 kl4 = (KL4) aRunnableS6S0101000_2.l0;
                kl4.LJ();
                kl4.LJLJJL = true;
                return;
            default:
                ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) aRunnableS6S0101000_2.l0;
                chooseCoverActivity.getClass();
                if (C161946Xe.LIZ()) {
                    ImageView imageView = chooseCoverActivity.LJLJLJ;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        chooseCoverActivity.LJLJLJ.setVisibility(8);
                    }
                    chooseCoverActivity.LJLJL.setVisibility(8);
                    return;
                }
                return;
        }
    }

    public static final void run$10(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        C69V c69v;
        C6DT c6dt;
        try {
            RecyclerView recyclerView = ((C6AA) aRunnableS6S0101000_2.l0).LJLJL;
            RecyclerView.ViewHolder viewHolder = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.LJJIZ(aRunnableS6S0101000_2.i1);
            }
            if ((viewHolder instanceof C69V) && (c69v = (C69V) viewHolder) != null && (c6dt = c69v.LJLIL) != null) {
                C6AA c6aa = (C6AA) aRunnableS6S0101000_2.l0;
                c6dt.requestFocus();
                C6AL c6al = c6aa.LJLIL;
                c6al.getClass();
                c6al.LJI.showSoftInput(c6dt, 1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        C0A2 layoutManager;
        try {
            RecyclerView recyclerView = ((AbstractC167696i5) aRunnableS6S0101000_2.l0).LJLIL;
            if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                layoutManager.LJZL(aRunnableS6S0101000_2.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            C130595Ap c130595Ap = ((AudioBeatsPanelFragment) aRunnableS6S0101000_2.l0).LLF;
            if (c130595Ap != null) {
                c130595Ap.scrollTo((int) (aRunnableS6S0101000_2.i1 * c130595Ap.LJLJJI), 0);
            } else {
                o.LJIJI("audioTrack");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            C69P c69p = (C69P) aRunnableS6S0101000_2.l0;
            c69p.LJLLL = false;
            LinearLayoutManager linearLayoutManager = c69p.LJLJLLL;
            if (linearLayoutManager != null) {
                int i = aRunnableS6S0101000_2.i1;
                int LLIL = linearLayoutManager.LLIL();
                int LLILLIZIL = linearLayoutManager.LLILLIZIL();
                int i2 = i - 1;
                if (LLIL > i2 || i2 > LLILLIZIL) {
                    linearLayoutManager.LJZL(i2);
                }
            }
            C69P c69p2 = (C69P) aRunnableS6S0101000_2.l0;
            int i3 = aRunnableS6S0101000_2.i1 - 1;
            RecyclerView recyclerView = c69p2.LJLJLJ;
            if (recyclerView != null) {
                recyclerView.post(new ARunnableS6S0101000_2(i3, c69p2, 14));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0101000_2.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            if (((RecyclerView) aRunnableS6S0101000_2.l0).getItemDecorationCount() == 0) {
                ((RecyclerView) aRunnableS6S0101000_2.l0).LJII(new C150135ur(aRunnableS6S0101000_2.i1), -1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            C5S1 c5s1 = new C5S1((Activity) aRunnableS6S0101000_2.l0);
            c5s1.LIZJ(aRunnableS6S0101000_2.i1);
            c5s1.LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0101000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0101000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0101000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0101000_2.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            RelativeLayout relativeLayout = ((C6LV) aRunnableS6S0101000_2.l0).LJLZ;
            if (relativeLayout != null) {
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = aRunnableS6S0101000_2.i1;
                RelativeLayout relativeLayout2 = ((C6LV) aRunnableS6S0101000_2.l0).LJLZ;
                if (relativeLayout2 != null) {
                    relativeLayout2.setLayoutParams(layoutParams);
                    return;
                } else {
                    o.LJIJI("contentLayout");
                    throw null;
                }
            }
            o.LJIJI("contentLayout");
            throw null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            aRunnableS6S0101000_2.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS6S0101000_2 aRunnableS6S0101000_2) {
        boolean LIZ;
        try {
            C6AA c6aa = (C6AA) aRunnableS6S0101000_2.l0;
            c6aa.LJLLJ = false;
            LinearLayoutManager linearLayoutManager = c6aa.LJLLLL;
            if (linearLayoutManager != null) {
                int i = aRunnableS6S0101000_2.i1;
                int LLIL = linearLayoutManager.LLIL();
                int LLILLIZIL = linearLayoutManager.LLILLIZIL();
                int i2 = i - 1;
                if (LLIL > i2 || i2 > LLILLIZIL) {
                    linearLayoutManager.LJZL(i2);
                }
            }
            C6AA c6aa2 = (C6AA) aRunnableS6S0101000_2.l0;
            int i3 = aRunnableS6S0101000_2.i1 - 1;
            RecyclerView recyclerView = c6aa2.LJLJL;
            if (recyclerView != null) {
                recyclerView.post(new ARunnableS6S0101000_2(i3, c6aa2, 10));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S0101000_2(C6BU c6bu, C6BU<Object> c6bu2) {
        this.$t = c6bu2;
        this.l0 = c6bu;
        this.i1 = -1;
    }

    public ARunnableS6S0101000_2(C157376Fp c157376Fp, int i) {
        this.$t = i;
        this.l0 = c157376Fp;
        this.i1 = -1;
    }

    public ARunnableS6S0101000_2(C6JD c6jd, int i) {
        this.$t = i;
        this.l0 = c6jd;
        this.i1 = -1;
    }

    public ARunnableS6S0101000_2(C6JU c6ju, int i) {
        this.$t = i;
        this.l0 = c6ju;
        this.i1 = -1;
    }

    public ARunnableS6S0101000_2(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
