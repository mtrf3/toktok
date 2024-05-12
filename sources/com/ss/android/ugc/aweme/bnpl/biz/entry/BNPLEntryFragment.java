package com.ss.android.ugc.aweme.bnpl.biz.entry;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C22780uw;
import X.C275916l;
import X.C276116n;
import X.C276216o;
import X.C29S;
import X.C39647FhD;
import X.C3C5;
import X.C58217Mt3;
import X.C58218Mt4;
import X.C61221O0z;
import X.C61515OCh;
import X.C61532OCy;
import X.C61572OEm;
import X.C76800UCe;
import X.C8VV;
import X.C90903hW;
import X.C91657Zy9;
import X.C91824a0q;
import X.C91825a0r;
import X.C91826a0s;
import X.C91894a1y;
import X.C91924a2S;
import X.C92217a7B;
import X.C92601aDN;
import X.EBC;
import X.EF7;
import X.InterfaceC61213O0r;
import X.OC6;
import X.OD4;
import X.QD3;
import X.X1D;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.settings.IGeckoRegister;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.bnpl.hybrid.gecko.BNPLGeckoRegister;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes20.dex */
public final class BNPLEntryFragment extends BaseFragment {
    public final Map<Integer, View> LJLILLLLZI = new LinkedHashMap();
    public String LJLIL = "";

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
        super.onDestroy();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Context context;
        fragmentConfiguration(C92601aDN.LJLIL);
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("host");
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = arguments.getString("source");
            if (string2 == null) {
                string2 = "";
            }
            String string3 = arguments.getString("token");
            if (string3 == null) {
                string3 = "";
            }
            String string4 = arguments.getString("merchant_id");
            if (string4 == null) {
                string4 = "";
            }
            String string5 = arguments.getString("merchant_user_id");
            if (string5 == null) {
                string5 = "";
            }
            String string6 = arguments.getString("landing_info");
            if (string6 == null) {
                string6 = "";
            }
            this.LJLIL = string6;
            C91826a0s.LIZ = string;
            C91824a0q.LJFF = string2;
            C91826a0s.LIZJ = string3;
            C91824a0q.LIZ = new C91825a0r(string4, string5);
            String string7 = arguments.getString("priority_region");
            if (string7 != null) {
                str = string7;
            }
            C91824a0q.LIZIZ = str;
            C91824a0q.LJIIIIZZ = System.currentTimeMillis();
        }
        C91657Zy9.LIZIZ();
        EventBus.LIZJ().LJIILJJIL(this);
        C61532OCy c61532OCy = EBC.LIZ;
        BNPLGeckoRegister bNPLGeckoRegister = new BNPLGeckoRegister();
        c61532OCy.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register gecko,update priority:");
        LIZ.append(1);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        if (!c61532OCy.LJII.get()) {
            OC6.LIZ("gecko-debug-tag", "register gecko,global gecko has not been initialized");
            C58217Mt3 c58217Mt3 = C58218Mt4.LIZ;
            Set<?> set = c58217Mt3.LIZ.get(IGeckoRegister.class);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(bNPLGeckoRegister);
            c58217Mt3.LIZ.put(IGeckoRegister.class, set);
        } else {
            c61532OCy.LIZIZ();
            GeckoGlobalConfig.ENVType env = c61532OCy.LJ.getEnv();
            c61532OCy.LIZIZ();
            GeckoGlobalConfig geckoGlobalConfig = c61532OCy.LJ;
            if (geckoGlobalConfig != null) {
                context = geckoGlobalConfig.getContext();
            } else {
                context = null;
            }
            Pair<String, Boolean> LIZ2 = C61221O0z.LIZ(context, env, bNPLGeckoRegister);
            if (LIZ2 != null) {
                String str2 = (String) LIZ2.first;
                boolean booleanValue = ((Boolean) LIZ2.second).booleanValue();
                OD4 od4 = c61532OCy.LJFF;
                if (od4 == null || !od4.LJIIIZ.get()) {
                    OC6.LIZ("gecko-debug-tag", "register gecko,gecko has not been fetched");
                } else if (booleanValue) {
                    c61532OCy.LJFF.LIZJ(0, true);
                    C61572OEm.LIZ.LIZIZ(new C61515OCh(c61532OCy, str2), 1300L);
                } else {
                    OC6.LIZ("gecko-debug-tag", "register gecko try to trigger update");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("occasion_gecko_register-");
                    LIZ3.append(str2);
                    c61532OCy.LJIIL(1, X1D.LIZIZ(LIZ3));
                }
            }
        }
        C276116n c276116n = C22780uw.LIZ;
        c276116n.getClass();
        if (!C276216o.LJIIL.LJIIJJI) {
            C275916l c275916l = new C275916l((Application) EF7.LIZIZ());
            c275916l.LIZIZ = C91826a0s.LIZ;
            c276116n.LIZJ(c275916l.LIZ());
        }
        C91894a1y.LIZ = C276116n.LIZ();
        C91924a2S.LIZ.LIZIZ("bnpl_entry_page", C91824a0q.LJFF);
    }

    @QD3
    public final void onEvent(C92217a7B event) {
        o.LJIIIZ(event, "event");
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new IDqS418S0100000_31(this, 31));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        C39647FhD.LJ(inflater.getContext());
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.y, viewGroup, false);
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
