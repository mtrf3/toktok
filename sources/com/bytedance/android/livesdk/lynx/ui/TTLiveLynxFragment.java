package com.bytedance.android.livesdk.lynx.ui;

import X.ActivityC45651qj;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C15410j3;
import X.C15450j7;
import X.C15610jN;
import X.C16880lQ;
import X.C1E4;
import X.C29S;
import X.C30786C6k;
import X.C30868C9o;
import X.C31886CfK;
import X.C38113ExZ;
import X.C3C5;
import X.C40690Fy2;
import X.C47121t6;
import X.C76800UCe;
import X.C76884UFk;
import X.C76885UFl;
import X.C90903hW;
import X.CN1;
import X.CNM;
import X.CO5;
import X.CO7;
import X.COL;
import X.InterfaceC31935Cg7;
import X.OFH;
import X.VNS;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDbS382S0100000_5;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageMethod;
import com.bytedance.android.livesdk.livesetting.hybrid.EnableLynxDebugBadgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.lynx.ILiveLynxService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class TTLiveLynxFragment extends AbsHybridFragment implements InterfaceC31935Cg7 {
    public final boolean LJLJLLL;
    public boolean LJLL;
    public CO7 LJLLI;
    public View LJLLILLLL;
    public final ILiveLynxService LJLLJ;
    public int LJLLLL;
    public Integer LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public ChooseImageMethod LL;
    public C76884UFk LLD;
    public C76885UFl LLF;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public String LJLLL = "";

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public TTLiveLynxFragment() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        boolean z = false;
        if (iHostAppContext != null && iHostAppContext.isLocalTest() && EnableLynxDebugBadgeSetting.INSTANCE.getValue()) {
            z = true;
        }
        this.LJLJLLL = z;
        this.LJLLJ = (ILiveLynxService) CN1.LIZ(ILiveLynxService.class);
        this.LJLJJI = CNM.LIZ();
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment
    public final View re() {
        CO7 co7 = this.LJLLI;
        if (co7 != null) {
            return co7.G1();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.core.widget.BaseDialogFragment, X.COE] */
    @Override // X.InterfaceC31935Cg7
    public final void LLLZIL() {
        String string;
        Boolean valueOf;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("fallback_url")) != null && string.length() > 0) {
            Context context = null;
            if (1 != 0) {
                ?? r0 = this.LJLILLLLZI;
                if (r0 != 0) {
                    r0.LLLZIL();
                }
                if (this.LJZL) {
                    ActivityC45651qj mo49getActivity = mo49getActivity();
                    if (mo49getActivity != null) {
                        mo49getActivity.finish();
                    }
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
                    Context context2 = getContext();
                    if (context2 != null) {
                        context = C16880lQ.LLLLL(context2);
                    }
                    valueOf = Boolean.valueOf(iActionHandlerService.handle(context, string));
                } else {
                    valueOf = Boolean.valueOf(((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(getContext(), string));
                }
                if (valueOf != null) {
                    return;
                }
            }
        }
        if (this.LJLJLLL) {
            C30868C9o.LJI("Lynx fallback with no fallback_url!!");
        }
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(this, 166));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        C0NB.LJIIIZ("LiveLynx.LiveLynxFragment", "onDetach()");
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            S2(new JSONObject(), "container_disappear");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", false));
            S2(jSONObject, "H5_appStateChange");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0NB.LJIIIZ("LiveLynx.LiveLynxFragment", "onResume()");
        try {
            S2(new JSONObject(), "container_appear");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "app");
            jSONObject.put("args", new JSONObject().put("foreground", true));
            S2(jSONObject, "H5_appStateChange");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.InterfaceC31935Cg7
    public final void Xh(VNS view) {
        o.LJIIIZ(view, "view");
        View view2 = this.LJLLILLLL;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        C0NB.LJIIIZ("LiveLynx.LiveLynxFragment", "onAttach()");
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, X.InterfaceC31238CNu
    public final boolean onBackPressed(String str) {
        super.onBackPressed(str);
        CO5 co5 = this.LJLJJLL;
        if (co5 == null || co5.LJLIL == 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.lynx.ui.AbsHybridFragment, com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String queryParameter;
        boolean z;
        String queryParameter2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("url", "");
            o.LJIIIIZZ(string, "bundle.getString(AppConstants.BUNDLE_URL, \"\")");
            this.LJLLL = string;
            if (!TextUtils.isEmpty(string)) {
                Uri parse = UriProtector.parse(this.LJLLL);
                this.LJZI = arguments.getBoolean("hide_status_bar", false);
                this.LJZ = arguments.getBoolean("is_fullscreen", false);
                arguments.getString("title");
                this.LJLLLLLL = Integer.valueOf(arguments.getInt("bundle_preset_width"));
                this.LJLZ = arguments.getString("original_scheme", "");
                this.LJZL = arguments.getBoolean("is_dummy_host", false);
                String string2 = arguments.getString("soft_input_mode", "");
                o.LJIIIIZZ(string2, "bundle.getString(SOFT_INPUT_MODE, \"\")");
                this.LJLJJL = string2;
                String str = null;
                if (parse == null) {
                    queryParameter = null;
                } else {
                    try {
                        queryParameter = UriProtector.getQueryParameter(parse, "web_bg_color");
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                if (!TextUtils.isEmpty(queryParameter) && (queryParameter2 = UriProtector.getQueryParameter(parse, "web_bg_color")) != null) {
                    this.LJLLLL = Color.parseColor(C40690Fy2.LIZ(queryParameter2));
                }
                if (parse != null) {
                    try {
                        boolean z2 = true;
                        if (UriProtector.getQueryParameter(parse, "hide_loading") != null) {
                            if (C1E4.LJJIFFI(UriProtector.getQueryParameter(parse, "hide_loading")) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.LJLL = z;
                        }
                        if (parse != null) {
                            if (UriProtector.getQueryParameter(parse, "hide_status_bar") != null) {
                                String queryParameter3 = UriProtector.getQueryParameter(parse, "hide_status_bar");
                                o.LJI(queryParameter3);
                                if (CastIntegerProtector.parseInt(queryParameter3) != 1) {
                                    z2 = false;
                                }
                                this.LJZI = z2;
                            }
                            if (parse != null) {
                                str = UriProtector.getQueryParameter(parse, "title");
                            }
                        }
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    UriProtector.getQueryParameter(parse, "title");
                }
            }
        }
        if (this.LJZI && this.LJZ) {
            if (C15410j3.LIZJ(mo49getActivity())) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity == null) {
                    return;
                }
                Window window = mo49getActivity.getWindow();
                window.clearFlags(67108864);
                window.getDecorView().setSystemUiVisibility(1280);
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                window.setStatusBarColor(0);
                return;
            }
            C15450j7.LIZIZ(mo49getActivity());
        }
    }

    @Override // X.COJ
    public final void S2(Object obj, String str) {
        CO7 co7 = this.LJLLI;
        if (co7 != null) {
            co7.S2(obj, str);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C30786C6k.LIZ(view, this.LJLLL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ChooseImageMethod chooseImageMethod = this.LL;
        if (chooseImageMethod != null) {
            chooseImageMethod.onActivityResult(i, i2, intent);
        }
        C76884UFk c76884UFk = this.LLD;
        if (c76884UFk != null) {
            c76884UFk.onActivityResult(i, i2, intent);
        }
        C76885UFl c76885UFl = this.LLF;
        if (c76885UFl != null) {
            c76885UFl.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bytedance.android.live.core.widget.BaseDialogFragment, X.CAu] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.de8, viewGroup, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.FrameLayout");
        ViewGroup viewGroup2 = (ViewGroup) LLLLIILL;
        View findViewById = viewGroup2.findViewById(R.id.fxc);
        this.LJLLILLLL = findViewById;
        if (this.LJLL) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        ILiveLynxService iLiveLynxService = this.LJLLJ;
        o.LJI(iLiveLynxService);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        CO7 GY = iLiveLynxService.GY(mo49getActivity, this.LJLLL, this.LJLLLLLL, this.LJLZ, this.LJLJJI, this);
        C29S c29s = null;
        if (GY != null) {
            OFH ofh = OFH.LIZLLL;
            String str = this.LJLJL;
            COL col = new COL(GY.G1(), "lynx");
            ofh.getClass();
            OFH.LIZ(str, col);
            VNS G1 = GY.G1();
            G1.setScrollBarStyle(0);
            G1.setBackgroundColor(this.LJLLLL);
            viewGroup2.addView(G1, 0, new FrameLayout.LayoutParams(-1, -1));
            ?? r1 = this.LJLIL;
            if (r1 != 0) {
                r1.Vb(GY.F4());
            }
            C31886CfK F4 = GY.F4();
            CO5 co5 = new CO5();
            this.LJLJJLL = co5;
            C38113ExZ c38113ExZ = F4.LJLILLLLZI;
            if (c38113ExZ != null) {
                c38113ExZ.LIZLLL("viewController", co5);
            }
            C38113ExZ c38113ExZ2 = F4.LJLILLLLZI;
            if (c38113ExZ2 != null) {
                c38113ExZ2.LIZJ("chooseImage", new IDbS382S0100000_5(this, 0));
            }
            C38113ExZ c38113ExZ3 = F4.LJLILLLLZI;
            if (c38113ExZ3 != null) {
                c38113ExZ3.LIZJ("chooseImageForSub", new IDbS382S0100000_5(this, 1));
            }
            C38113ExZ c38113ExZ4 = F4.LJLILLLLZI;
            if (c38113ExZ4 != null) {
                c38113ExZ4.LIZJ("editImageForSub", new IDbS382S0100000_5(this, 2));
            }
            C38113ExZ c38113ExZ5 = F4.LJLILLLLZI;
            if (c38113ExZ5 != null) {
                c38113ExZ5.LIZJ("openCameraForSub", new IDbS382S0100000_5(this, 3));
            }
            this.LJLLI = GY;
            if (this.LJLJLLL) {
                AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 458);
                C47121t6 c47121t6 = new C47121t6(getContext(), null);
                c47121t6.setText("Lynx");
                c47121t6.setTextSize(14.0f);
                c47121t6.setTextColor(ColorProtector.parseColor("#FFFFFF"));
                c47121t6.setBackgroundColor(ColorProtector.parseColor("#88008800"));
                C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5(aqS171S0100000_5, 198));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388661;
                viewGroup2.addView(c47121t6, layoutParams);
            }
        } else {
            LLLZIL();
        }
        try {
            ViewTreeLifecycleOwner.set(viewGroup2, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewGroup2, this);
            C10A.LIZIZ(viewGroup2, this);
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 instanceof C29S) {
                c29s = (C29S) mo49getActivity2;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return viewGroup2;
    }
}
