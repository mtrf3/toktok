package com.ss.android.ugc.aweme.setting.page.security;

import X.C16880lQ;
import X.C221108m2;
import X.C235119Kp;
import X.C252709vu;
import X.C253629xO;
import X.C253639xP;
import X.C253649xQ;
import X.C56642Ke;
import X.C5S1;
import X.C62822Ol8;
import X.C78840Uwu;
import X.C79045V0n;
import X.InterfaceC61213O0r;
import X.QD3;
import X.SYL;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.cell.DividerCell;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class SecurityPage extends BasePage {
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 807));

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cla;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        MutableLiveData<Boolean> mutableLiveData;
        super.onResume();
        SecurityViewModel securityViewModel = (SecurityViewModel) this.LJLJI.getValue();
        if (securityViewModel == null || (mutableLiveData = securityViewModel.LJLIL) == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fragmentConfiguration(C253649xQ.LJLIL);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C56642Ke event) {
        o.LJIIIZ(event, "event");
        try {
            if (TextUtils.equals("incomePlusVerificationSuccess", JSONObjectProtectorUtils.getString(event.LJLIL, "eventName"))) {
                C5S1 c5s1 = new C5S1(getContext());
                c5s1.LIZJ(R.string.qfg);
                c5s1.LJ();
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C252709vu c252709vu = (C252709vu) view.findViewById(R.id.la4);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.r2d);
        o.LJIIIIZZ(string, "getString(R.string.settingsredesign_titlene)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS154S0100000_4(this, 806));
        c252709vu.setNavActions(c235119Kp);
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        Integer LJI = C79045V0n.LJI(R.attr.c9, requireContext);
        o.LJI(LJI);
        c252709vu.setNavBackground(LJI.intValue());
        c252709vu.LJIILJJIL(false);
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        Integer LJI2 = C79045V0n.LJI(R.attr.c9, requireContext2);
        o.LJI(LJI2);
        view.setBackgroundColor(LJI2.intValue());
        ((SYL) _$_findCachedViewById(R.id.ftq)).LLLF.LJZL(SecurityAlertsCell.class, SecurityDeviceCell.class, SecurityVerificationCell.class, SecuritySaveInfoCell.class, SecurityIncomeCell.class, SecurityPermissionsCell.class, DividerCell.class);
        SYL list = (SYL) _$_findCachedViewById(R.id.ftq);
        o.LJIIIIZZ(list, "list");
        C253629xO collection = C253629xO.LJLIL;
        o.LJIIIZ(collection, "collection");
        C253639xP c253639xP = new C253639xP();
        collection.invoke(c253639xP);
        list.getState().LJ(c253639xP.LIZ);
        list.setViewTypeMap(c253639xP.LIZIZ);
    }
}
