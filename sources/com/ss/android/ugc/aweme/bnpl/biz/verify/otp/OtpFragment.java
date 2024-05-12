package com.ss.android.ugc.aweme.bnpl.biz.verify.otp;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C252949wI;
import X.C26045AKb;
import X.C29S;
import X.C36636EZk;
import X.C39647FhD;
import X.C3C3;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.C90903hW;
import X.C91826a0s;
import X.C91924a2S;
import X.C91928a2W;
import X.C92031a4B;
import X.C92217a7B;
import X.C92604aDQ;
import X.C92605aDR;
import X.C93140aM4;
import X.C93141aM5;
import X.C93142aM6;
import X.C93143aM7;
import X.C93148aMC;
import X.C93158aMM;
import X.C93159aMN;
import X.EnumC91923a2R;
import X.InterfaceC61213O0r;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.InterfaceC91805a0X;
import X.JBR;
import X.JBS;
import X.OSZ;
import X.QD3;
import X.V1M;
import X.XKX;
import Y.IDeS152S0200000_13;
import Y.IDeS153S0200000_15;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.arg.RouteArgExtension;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class OtpFragment extends BaseFragment implements InterfaceC91805a0X, JBS, DialogInterface.OnCancelListener {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public String LJLILLLLZI;
    public JSONObject LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public Integer LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public boolean LJLJLLL;
    public long LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C5H3 LJLIL = RouteArgExtension.INSTANCE.navArg(this);

    @Override // X.InterfaceC91805a0X
    public final void LJJLIL(String str) {
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.JBS
    public final /* synthetic */ void onActivityResult_Activity(int i, int i2, Intent intent) {
        JBR.LIZ(this, i, i2, intent);
    }

    @Override // X.JBS
    public final /* synthetic */ void onBeforeActivityCreated(Activity activity) {
    }

    @Override // X.JBS
    public final /* synthetic */ void onNewIntent(Intent intent) {
    }

    @Override // X.JBS
    public final void onBackPressed_Activity() {
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("CANCEL", "bnpl_activate_otp", null);
        }
        JBR.LIZIZ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        EditText bnpl_otp_input = (EditText) _$_findCachedViewById(R.id.f5);
        o.LJIIIIZZ(bnpl_otp_input, "bnpl_otp_input");
        C91928a2W.LIZ(bnpl_otp_input);
    }

    public final void vl() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        IDqS418S0100000_31 iDqS418S0100000_31 = new IDqS418S0100000_31(this, 33);
        C93158aMM c93158aMM = new C93158aMM(this);
        C93159aMN c93159aMN = new C93159aMN(this);
        V1M.LJJIJIIJIL(new IDeS153S0200000_15(new IDeS152S0200000_13(new IDeS152S0200000_13((InterfaceC88471Ynr) new C93141aM5(c93158aMM, null), V1M.LJIIZILJ(C36636EZk.LIZ, new C3C3(new C93140aM4(60, null))), 2), new C93142aM6(c93159aMN, null), 1), new C93143aM7(iDqS418S0100000_31, null), 0), lifecycleScope);
    }

    public final void xl() {
        ((C252949wI) _$_findCachedViewById(R.id.f3)).LIZ();
        _$_findCachedViewById(R.id.f3).setVisibility(8);
        ((C92604aDQ) _$_findCachedViewById(R.id.f5)).LJII();
    }

    @Override // X.InterfaceC91805a0X
    public final void LLFZ() {
        xl();
    }

    public final void Al(String str) {
        if (str == null) {
            str = getString(R.string.f3f);
        } else if (str.length() == 0) {
            str = getString(R.string.f3g);
        }
        o.LJIIIIZZ(str, "when {\n            error…-> errorContent\n        }");
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
        ((TextView) _$_findCachedViewById(R.id.f5)).setText("");
        EditText bnpl_otp_input = (EditText) _$_findCachedViewById(R.id.f5);
        o.LJIIIIZZ(bnpl_otp_input, "bnpl_otp_input");
        C91928a2W.LIZ(bnpl_otp_input);
    }

    public final void Dl(String str) {
        Integer num;
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.LJLJI = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "verify_detail"));
            String optString = jSONObject.optString("verify_id");
            if (optString == null) {
                optString = "";
            }
            this.LJLJJI = optString;
            String optString2 = jSONObject.optString("verify_type");
            if (optString2 == null) {
                optString2 = "OTP";
            }
            this.LJLJJL = optString2;
            JSONObject jSONObject2 = this.LJLJI;
            String str3 = null;
            if (jSONObject2 != null) {
                num = Integer.valueOf(jSONObject2.optInt("code_type"));
            } else {
                num = null;
            }
            this.LJLJJLL = num;
            JSONObject jSONObject3 = this.LJLJI;
            if (jSONObject3 != null) {
                str2 = jSONObject3.optString("verify_center_host");
            } else {
                str2 = null;
            }
            this.LJLJL = str2;
            if (str2 == null || str2.length() == 0) {
                this.LJLJL = C91826a0s.LIZ;
            }
            JSONObject jSONObject4 = this.LJLJI;
            if (jSONObject4 != null) {
                str3 = jSONObject4.optString("mobile");
            }
            this.LJLJLJ = str3;
        } catch (Exception unused) {
            C91924a2S.LIZ.LIZLLL("otp", EnumC91923a2R.PARAM, "parse verify info fail", "");
        }
    }

    @Override // X.InterfaceC91805a0X
    public final void LJLL(String str) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C93148aMC(this, str, null), 3);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("CANCEL", "bnpl_activate_otp", null);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        fragmentConfiguration(C92605aDR.LJLIL);
        super.onCreate(bundle);
        Window window = requireActivity().getWindow();
        if (window != null) {
            window.setSoftInputMode(16);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke("CANCEL", "bnpl_activate_otp", null);
        }
        if (this.LJLJLLL) {
            ASQ.LJ(this, ASX.LIZ);
        } else {
            requireActivity().finish();
        }
    }

    public final void onEventClick(String str) {
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_otp_click", "bnpl_activate_otp", this.LJLILLLLZI, C113554cx.LJJL(new OSZ("obj_id", str), new OSZ("click_use_time", String.valueOf(System.currentTimeMillis() - this.LJLL))), 8);
    }

    public final void onEventFillIn(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C91924a2S.LIZ(C91924a2S.LIZ, "fp_sdk_bnpl_otp_fillin", "bnpl_activate_otp", this.LJLILLLLZI, C113554cx.LJJL(new OSZ("obj_id", "otp"), new OSZ("finish_timestamp", String.valueOf(currentTimeMillis)), new OSZ("duration", String.valueOf(currentTimeMillis - this.LJLL)), new OSZ("otp_error_code", str)), 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x016b  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bnpl.biz.verify.otp.OtpFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void wl(String str, String str2) {
        InterfaceC88473Ynt<? super String, ? super String, ? super String, C76800UCe> interfaceC88473Ynt = C92031a4B.LIZJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(str, "bnpl_activate_otp", str2);
        }
        if (this.LJLJLLL) {
            ASQ.LJ(this, ASX.LIZ);
        } else {
            requireActivity().finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a9, viewGroup, false);
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
