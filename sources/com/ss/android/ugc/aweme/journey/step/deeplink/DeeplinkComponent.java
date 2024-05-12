package com.ss.android.ugc.aweme.journey.step.deeplink;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C35656Dz2;
import X.C35878E6g;
import X.C36223EJn;
import X.C38281F0r;
import X.C3C5;
import X.C40786Fza;
import X.C73305Spp;
import X.C76800UCe;
import X.C90903hW;
import X.G2G;
import X.G2H;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.journey.events.ExitDeeplinkEvent;
import com.ss.android.ugc.aweme.journey.events.ShowDeeplinkEvent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DeeplinkComponent extends NUJComponentFragment {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intent intent;
        String str;
        String str2;
        Intent intent2;
        String authority;
        Uri data;
        C40786Fza c40786Fza;
        o.LJIIIZ(view, "view");
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.g8y);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view2 = (View) linkedHashMap.get(valueOf);
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null && (view2 = view3.findViewById(R.id.g8y)) != null) {
                linkedHashMap.put(valueOf, view2);
            } else {
                view2 = null;
            }
        }
        C73305Spp c73305Spp = (C73305Spp) view2;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
        }
        C35878E6g.LIZ();
        C35656Dz2 wl = wl();
        if ((wl instanceof C40786Fza) && (c40786Fza = (C40786Fza) wl) != null) {
            intent = c40786Fza.LIZIZ;
        } else {
            intent = null;
        }
        ShowDeeplinkEvent showDeeplinkEvent = new ShowDeeplinkEvent();
        String str3 = "";
        if (intent == null || (data = intent.getData()) == null || (str = data.getAuthority()) == null) {
            str = "";
        }
        showDeeplinkEvent.LIZLLL(str, "deeplink_uri");
        showDeeplinkEvent.LJFF();
        if (intent != null && intent.getData() != null) {
            IDeepLinkService LIZ = DeepLinkServiceImpl.LIZ();
            Uri data2 = intent.getData();
            if (data2 != null) {
                str2 = data2.getScheme();
            } else {
                str2 = null;
            }
            if (LIZ.LJI(str2)) {
                ActivityC45651qj mo49getActivity = mo49getActivity();
                Class<? extends Activity> LIZIZ = G2G.LIZIZ.LIZIZ();
                if (LIZIZ == null) {
                    return;
                } else {
                    intent2 = new Intent(mo49getActivity, LIZIZ);
                }
            } else {
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                Class<? extends Activity> LJ = G2G.LIZIZ.LJ();
                if (LJ == null) {
                    return;
                } else {
                    intent2 = new Intent(mo49getActivity2, LJ);
                }
            }
            intent2.setFlags(536870912);
            intent2.setAction("android.intent.action.VIEW");
            C38281F0r c38281F0r = new C38281F0r(String.valueOf(intent.getData()));
            c38281F0r.LIZLLL("random", new Random(1000L).toString());
            intent2.setData(UriProtector.parse(c38281F0r.LJ()));
            intent2.putExtras(intent);
            intent2.putExtra("new_user_journey", true);
            intent2.putExtra("inner_from", "new_user_journey");
            if (intent.getBooleanExtra("from_task", false)) {
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 != null) {
                    mo49getActivity3.setResult(-1, intent2);
                }
                vl(null);
            } else {
                ActivityC45651qj mo49getActivity4 = mo49getActivity();
                if (mo49getActivity4 != null) {
                    C16880lQ.LJI(mo49getActivity4, intent2, 123);
                }
            }
            ExitDeeplinkEvent exitDeeplinkEvent = new ExitDeeplinkEvent();
            Uri data3 = intent.getData();
            if (data3 != null && (authority = data3.getAuthority()) != null) {
                str3 = authority;
            }
            exitDeeplinkEvent.LIZLLL(str3, "deeplink_uri");
            exitDeeplinkEvent.LIZLLL(Integer.valueOf(intent.getBooleanExtra("from_task", false) ? 1 : 0), "is_from_task");
            exitDeeplinkEvent.LJFF();
            return;
        }
        vl(Boolean.TRUE);
        C36223EJn.LIZ.onEventV3(G2H.DEEPLINK_EMPTY);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.beq, viewGroup, false);
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
