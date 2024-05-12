package com.bytedance.android.livesdk.container.ui;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C1A7;
import X.C29S;
import X.C30883CAd;
import X.C30892CAm;
import X.C31886CfK;
import X.C38113ExZ;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CN1;
import X.CNC;
import X.CNL;
import X.CNN;
import X.CNT;
import X.CNX;
import Y.IDAListenerS232S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PopupContainerFragment extends BaseDialogFragment implements CNL, View.OnLayoutChangeListener {
    public static final /* synthetic */ int LJZ = 0;
    public boolean LJLJJI;
    public FrameLayout LJLJJL;
    public ViewGroup LJLJJLL;
    public View LJLJL;
    public ViewGroup LJLJLJ;
    public HybridFragment LJLJLLL;
    public ImageView LJLL;
    public int LJLLILLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final List<View.OnClickListener> LJLLI = new ArrayList();
    public final Rect LJLLJ = new Rect();
    public final List<CNT> LJLLL = new ArrayList();
    public final C5H3 LJLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 206));
    public final C5H3 LJLLLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 208));

    public final void Al() {
        ((ArrayList) this.LJLLL).clear();
    }

    public final PopupConfig Dl() {
        return (PopupConfig) this.LJLLLL.getValue();
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        int i;
        AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(this, 207);
        String gravity = Dl().getGravity();
        if (o.LJ(gravity, "bottom")) {
            C30883CAd.LIZIZ(this.LJLJLJ, Dl().getAnimation(), this.LJLJJI, aqS155S0100000_5);
            return;
        }
        if (!o.LJ(gravity, "center")) {
            return;
        }
        ViewGroup viewGroup = this.LJLJLJ;
        String animation = Dl().getDialogAnimation();
        o.LJIIIZ(animation, "animation");
        if (viewGroup == null || viewGroup.getAnimation() != null) {
            return;
        }
        int hashCode = animation.hashCode();
        if (hashCode != -1383228885) {
            if (hashCode != -1364013995) {
                if (hashCode == 3387192) {
                    animation.equals(LiveGiftNewGifterBadgeSetting.DEFAULT);
                }
            } else if (animation.equals("center")) {
                i = R.anim.gz;
                Animation loadAnimation = AnimationUtils.loadAnimation(viewGroup.getContext(), i);
                loadAnimation.setAnimationListener(new IDAListenerS232S0100000_5(aqS155S0100000_5, 20));
                viewGroup.startAnimation(loadAnimation);
                return;
            }
            aqS155S0100000_5.invoke();
        }
        if (animation.equals("bottom")) {
            i = R.anim.ha;
            Animation loadAnimation2 = AnimationUtils.loadAnimation(viewGroup.getContext(), i);
            loadAnimation2.setAnimationListener(new IDAListenerS232S0100000_5(aqS155S0100000_5, 20));
            viewGroup.startAnimation(loadAnimation2);
            return;
        }
        aqS155S0100000_5.invoke();
    }

    @Override // X.CNR
    public final String getHybridContainerId() {
        return (String) this.LJLLLLLL.getValue();
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment
    public final String zk() {
        return (String) this.LJLLLLLL.getValue();
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C30892CAm Yd0;
        super.onDestroy();
        PopupConfig config = Dl();
        o.LJIIIZ(config, "config");
        LivePopupConfig extraConfig = config.getExtraConfig();
        if (extraConfig != null && extraConfig.getMinMarginTop() > 0) {
            Al();
        }
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZJ(this);
        }
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // X.CNR
    public final void close() {
        dismissAllowingStateLoss();
    }

    @Override // com.bytedance.android.live.BaseDialogFragmentV2, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        dismissAllowingStateLoss();
    }

    @Override // X.CNL
    public final /* bridge */ /* synthetic */ View dk() {
        return this.LJLJLJ;
    }

    public static final /* synthetic */ void xl(PopupContainerFragment popupContainerFragment) {
        super.dismissAllowingStateLoss();
    }

    @Override // X.CNL
    public final void A3(CNN cnn) {
        ((ArrayList) this.LJLLL).add(cnn);
    }

    @Override // X.CNL
    public final void Gf(String anim) {
        o.LJIIIZ(anim, "anim");
        String gravity = Dl().getGravity();
        if (o.LJ(gravity, "bottom")) {
            Dl().setAnimation(anim);
        } else {
            if (!o.LJ(gravity, "center")) {
                return;
            }
            Dl().setDialogAnimation(anim);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        Window window2;
        Window window3;
        View decorView;
        Window window4;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window4 = dialog.getWindow()) != null) {
            window4.setBackgroundDrawable(new ColorDrawable());
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return;
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window3 = dialog3.getWindow()) != null && (decorView = window3.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        attributes.dimAmount = 0.0f;
        Dialog dialog4 = getDialog();
        if (dialog4 == null || (window2 = dialog4.getWindow()) == null) {
            return;
        }
        window2.setAttributes(attributes);
    }

    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        C30892CAm Yd0;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && mo49getActivity.getRequestedOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = z;
        super.onCreate(bundle);
        IBrowserService iBrowserService = (IBrowserService) CN1.LIZ(IBrowserService.class);
        if (iBrowserService != null && (Yd0 = iBrowserService.Yd0()) != null) {
            Yd0.LIZIZ("ungroup", this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        o.LJI(context);
        CNC cnc = new CNC(this, context, getTheme());
        cnc.requestWindowFeature(1);
        return cnc;
    }

    @Override // X.CNL
    public final void Li(String str, Map<String, ? extends Object> map) {
        CNX cnx;
        C31886CfK c31886CfK;
        HybridFragment hybridFragment = this.LJLJLLL;
        if (hybridFragment != null && (cnx = hybridFragment.LJLILLLLZI) != null && (c31886CfK = cnx.LJLJJLL) != null) {
            C38113ExZ c38113ExZ = c31886CfK.LJLILLLLZI;
            if (c38113ExZ.LJFF) {
                IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
                if (C1A7.LJLIL) {
                    throw illegalStateException;
                }
            }
            c38113ExZ.LIZ.LJIILL(map, "H5_popup_container_height_state_changed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00ce  */
    @Override // com.bytedance.android.live.core.widget.BaseDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.container.ui.PopupContainerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(getLayoutInflater(), R.layout.dg7, viewGroup, false);
        this.LJLJJL = (FrameLayout) LLLLIILL.findViewById(R.id.e8m);
        this.LJLJJLL = (ViewGroup) LLLLIILL.findViewById(R.id.hxu);
        this.LJLJL = LLLLIILL.findViewById(R.id.hxy);
        this.LJLJLJ = (ViewGroup) LLLLIILL.findViewById(R.id.bsf);
        this.LJLL = (ImageView) LLLLIILL.findViewById(R.id.e8n);
        try {
            ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
            C10A.LIZIZ(LLLLIILL, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LLLLIILL;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = getView();
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(this.LJLLJ);
        }
        int height = this.LJLLJ.height();
        int i9 = this.LJLLILLLL;
        if (i9 == 0) {
            this.LJLLILLLL = height;
            return;
        }
        if (i9 == height) {
            return;
        }
        if (i9 - height > 100) {
            for (CNT cnt : this.LJLLL) {
                ViewGroup viewGroup = this.LJLJLJ;
                o.LJI(viewGroup);
                cnt.LIZIZ(viewGroup);
            }
            this.LJLLILLLL = height;
            return;
        }
        if (height - i9 > 100) {
            for (CNT cnt2 : this.LJLLL) {
                ViewGroup viewGroup2 = this.LJLJLJ;
                o.LJI(viewGroup2);
                cnt2.LIZ(viewGroup2);
            }
            this.LJLLILLLL = height;
        }
    }
}
