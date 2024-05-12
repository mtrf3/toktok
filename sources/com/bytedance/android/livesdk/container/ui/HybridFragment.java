package com.bytedance.android.livesdk.container.ui;

import X.ActivityC45651qj;
import X.B83;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29336BfI;
import X.C29337BfJ;
import X.C29374Bfu;
import X.C29S;
import X.C30786C6k;
import X.C30937CCf;
import X.C31221CNd;
import X.C31240CNw;
import X.C31886CfK;
import X.C31955CgR;
import X.C38113ExZ;
import X.C38118Exe;
import X.C3C5;
import X.C47121t6;
import X.C5H3;
import X.C73933Szx;
import X.C76800UCe;
import X.C78996UzQ;
import X.C90903hW;
import X.CNK;
import X.CNX;
import X.COA;
import X.COW;
import X.CVT;
import X.InterfaceC29343BfP;
import X.InterfaceC29856Bng;
import X.InterfaceC31231CNn;
import X.InterfaceC31234CNq;
import X.O5Z;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDbS382S0100000_5;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.android.livesdk.livesetting.hybrid.ShowNewContainerLabel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class HybridFragment extends BaseFragment implements COW, InterfaceC31234CNq, InterfaceC29343BfP {
    public static final /* synthetic */ int LJLL = 0;
    public CNX LJLILLLLZI;
    public FrameLayout LJLJI;
    public CVT LJLJJI;
    public PageContainerFragment LJLJJL;
    public C29336BfI LJLJL;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 203));
    public String LJLJJLL = "";
    public final Map<String, InterfaceC31231CNn> LJLJLJ = new LinkedHashMap();

    @Override // X.COW
    public final void LLLLLLL(String str) {
    }

    @Override // X.InterfaceC31234CNq
    public final boolean dispatchKeyEvent(KeyEvent event) {
        o.LJIIIZ(event, "event");
        return false;
    }

    @Override // X.COW
    public final void LJIL() {
        View re;
        FrameLayout frameLayout;
        CVT cvt = this.LJLJJI;
        if (cvt != null) {
            cvt.setVisibility(8);
        }
        if (vl().getEngineType() == CNK.LYNX && vl().getFallbackUrl().length() > 0) {
            vl().setEngineType(CNK.WEB_VIEW);
            CNX cnx = this.LJLILLLLZI;
            if (cnx != null && (re = cnx.re()) != null && (frameLayout = this.LJLJI) != null) {
                C16880lQ.LJLLLL(re, frameLayout);
            }
            CNX cnx2 = this.LJLILLLLZI;
            if (cnx2 != null) {
                cnx2.release();
            }
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            C31240CNw c31240CNw = new C31240CNw(mo49getActivity, vl(), this.LJLJJLL, this);
            this.LJLILLLLZI = c31240CNw;
            c31240CNw.LJ();
            O5Z o5z = c31240CNw.LJLJL;
            if (o5z != null) {
                FrameLayout frameLayout2 = this.LJLJI;
                if (frameLayout2 != null) {
                    frameLayout2.addView(o5z, 0);
                }
                c31240CNw.loadUrl(vl().getFallbackUrl());
            }
        }
    }

    @Override // X.COW
    public final void LJLLI() {
        CVT cvt = this.LJLJJI;
        if (cvt != null) {
            cvt.setVisibility(8);
        }
        PageContainerFragment pageContainerFragment = this.LJLJJL;
        if (pageContainerFragment != null) {
            pageContainerFragment.wl();
        }
    }

    public final HybridConfig vl() {
        return (HybridConfig) this.LJLIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CNX cnx = this.LJLILLLLZI;
        if (cnx != null) {
            cnx.release();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            CNX cnx = this.LJLILLLLZI;
            if (cnx != null) {
                cnx.LJIIIIZZ("container_disappear", new JSONObject());
            }
            CNX cnx2 = this.LJLILLLLZI;
            if (cnx2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", false));
                cnx2.LJIIIIZZ("H5_appStateChange", jSONObject);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        try {
            CNX cnx = this.LJLILLLLZI;
            if (cnx != null) {
                cnx.LJIIIIZZ("container_appear", new JSONObject());
            }
            CNX cnx2 = this.LJLILLLLZI;
            if (cnx2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", "app");
                jSONObject.put("args", new JSONObject().put("foreground", true));
                cnx2.LJIIIIZZ("H5_appStateChange", jSONObject);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC29343BfP
    public final C29336BfI getShareInfo() {
        return this.LJLJL;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        CNX c31240CNw;
        C31886CfK c31886CfK;
        C38113ExZ c38113ExZ;
        DialogFragment dialogFragment;
        C31886CfK c31886CfK2;
        C38118Exe c38118Exe;
        super.onCreate(bundle);
        if (bundle != null) {
            z = bundle.getBoolean("isRecreated");
        } else {
            z = false;
        }
        if (vl().getEngineType() == CNK.LYNX) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            o.LJI(mo49getActivity);
            c31240CNw = new C31955CgR(mo49getActivity, vl(), this.LJLJJLL, this);
        } else {
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            o.LJI(mo49getActivity2);
            c31240CNw = new C31240CNw(mo49getActivity2, vl(), this.LJLJJLL, this);
        }
        this.LJLILLLLZI = c31240CNw;
        c31240CNw.LJLJJL = z;
        c31240CNw.LJ();
        CNX cnx = this.LJLILLLLZI;
        if (cnx == null || (c31886CfK = cnx.LJLJJLL) == null || (c38113ExZ = c31886CfK.LJLILLLLZI) == null) {
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null) {
            return;
        }
        c38113ExZ.LIZLLL("close", new C30937CCf(dialogFragment));
        c38113ExZ.LIZJ("sharePanel", new IDbS382S0100000_5(this, 22));
        c38113ExZ.LIZJ("shareInfo", new IDbS382S0100000_5(this, 23));
        c38113ExZ.LIZJ("sharePanel", new IDbS382S0100000_5(this, 24));
        c38113ExZ.LIZJ("uploadPicture", new IDbS382S0100000_5(this, 25));
        c38113ExZ.LIZJ("upload", new IDbS382S0100000_5(this, 26));
        c38113ExZ.LIZJ("chooseImage", new IDbS382S0100000_5(this, 27));
        c38113ExZ.LIZJ("chooseImageForSub", new IDbS382S0100000_5(this, 28));
        c38113ExZ.LIZJ("editImageForSub", new IDbS382S0100000_5(this, 29));
        c38113ExZ.LIZJ("openCameraForSub", new IDbS382S0100000_5(this, 30));
        CNX cnx2 = this.LJLILLLLZI;
        if (cnx2 != null && (c31886CfK2 = cnx2.LJLJJLL) != null && (c38118Exe = c31886CfK2.LJLJI) != null) {
            c38118Exe.LIZIZ("share", new C29337BfJ(new WeakReference(getContext()), this));
        }
        ((InterfaceC29856Bng) ((C29374Bfu) B83.LIZ().LIZIZ()).LJIIIIZZ.LIZJ(C73933Szx.LIZLLL(this))).LIZIZ(new AfS57S0100000_5(this, 378));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("isRecreated", true);
    }

    @Override // X.InterfaceC29343BfP
    public final void ql(C29336BfI c29336BfI) {
        this.LJLJL = c29336BfI;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        View re;
        Resources resources;
        CVT cvt;
        Resources resources2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = (FrameLayout) view.findViewById(R.id.e8r);
        this.LJLJJI = (CVT) view.findViewById(R.id.e8p);
        HColor loadingBgColor = vl().getLoadingBgColor();
        if (loadingBgColor != null) {
            num = Integer.valueOf(loadingBgColor.getColor(getContext()));
        } else {
            num = null;
        }
        Context context = getContext();
        if (context != null && (resources2 = context.getResources()) != null) {
            num2 = Integer.valueOf(resources2.getColor(R.color.ar));
        } else {
            num2 = null;
        }
        if ((!o.LJ(num, num2)) && num != null) {
            int intValue = num.intValue();
            CVT cvt2 = this.LJLJJI;
            if (cvt2 != null) {
                cvt2.setBackgroundColor(intValue);
            }
        }
        if (vl().getHideLoading() && (cvt = this.LJLJJI) != null) {
            cvt.setVisibility(8);
        }
        HColor containerBgColor = vl().getContainerBgColor();
        if (containerBgColor != null) {
            num3 = Integer.valueOf(containerBgColor.getColor(getContext()));
        } else {
            num3 = null;
        }
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null) {
            num4 = Integer.valueOf(resources.getColor(R.color.ar));
        } else {
            num4 = null;
        }
        if ((!o.LJ(num3, num4)) && num3 != null) {
            int intValue2 = num3.intValue();
            FrameLayout frameLayout = this.LJLJI;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(intValue2);
            }
        }
        CNX cnx = this.LJLILLLLZI;
        if (cnx != null && (re = cnx.re()) != null) {
            FrameLayout frameLayout2 = this.LJLJI;
            if (frameLayout2 != null) {
                frameLayout2.addView(re, 0);
            }
            CNX cnx2 = this.LJLILLLLZI;
            if (cnx2 != null) {
                cnx2.loadUrl(vl().getUrl());
            }
        }
        FrameLayout frameLayout3 = this.LJLJI;
        if (frameLayout3 != null) {
            C31221CNd c31221CNd = C31221CNd.LJLIL;
            if (((Boolean) COA.LIZIZ.getValue()).booleanValue() && ShowNewContainerLabel.INSTANCE.getValue()) {
                C47121t6 c47121t6 = new C47121t6(getContext(), null);
                c47121t6.setText("new_container");
                c47121t6.setTextSize(14.0f);
                c47121t6.setTextColor(ColorProtector.parseColor("#FFFFFF"));
                c47121t6.setBackgroundColor(ColorProtector.parseColor("#88008800"));
                C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5(c31221CNd, 147));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388693;
                frameLayout3.addView(c47121t6, layoutParams);
                C30786C6k.LIZ(frameLayout3, vl().getUrl());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CNX cnx = this.LJLILLLLZI;
        if (cnx != null) {
            cnx.LJI(i, i2, intent);
        }
        Iterator it = ((LinkedHashMap) this.LJLJLJ).values().iterator();
        while (it.hasNext()) {
            ((InterfaceC31231CNn) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(getLayoutInflater(), R.layout.d6i, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
