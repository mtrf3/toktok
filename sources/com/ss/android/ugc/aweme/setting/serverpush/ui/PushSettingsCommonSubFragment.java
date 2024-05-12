package com.ss.android.ugc.aweme.setting.serverpush.ui;

import X.AG6;
import X.ActivityC45651qj;
import X.C235119Kp;
import X.C252709vu;
import X.C25851ACp;
import X.C26045AKb;
import X.C40322Fs6;
import X.C75792yF;
import X.C78840Uwu;
import X.C85854Xmk;
import X.C85897XnR;
import X.C85925Xnt;
import X.C85931Xnz;
import X.C85934Xo2;
import X.EF7;
import X.InterfaceC61213O0r;
import X.InterfaceC85903XnX;
import X.InterfaceC85949XoH;
import X.KL2;
import X.SYL;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushCategory;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettingDynamicUI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes16.dex */
public final class PushSettingsCommonSubFragment extends BasePage implements InterfaceC85903XnX {
    public C252709vu LJLJI;
    public C25851ACp LJLJJI;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C85897XnR LJLJJL = new C85897XnR();
    public final ArrayList<InterfaceC85949XoH> LJLJJLL = new ArrayList<>();
    public String LJLJL = "";
    public String LJLJLLL = "";
    public final C85925Xnt LJLL = new C85925Xnt(this);

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.ss.android.ugc.aweme.setting.page.BasePage
    public final int getLayout() {
        return R.layout.cks;
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        C26045AKb c26045AKb = new C26045AKb(this);
        c26045AKb.LJIIIIZZ(R.string.im9);
        c26045AKb.LJIIJ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJL.LIZIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean LIZJ = C40322Fs6.LIZJ(EF7.LIZIZ());
        if (this.LJLJLJ && !LIZJ) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.onBackPressed();
                return;
            }
            return;
        }
        Iterator<InterfaceC85949XoH> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            InterfaceC85949XoH next = it.next();
            next.LIZIZ(LIZJ);
            Context context = getContext();
            if (context != null) {
                next.LJ(context);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.AEC] */
    @Override // com.ss.android.ugc.aweme.setting.page.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        C85854Xmk c85854Xmk;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = (C252709vu) view.findViewById(R.id.la4);
        View findViewById = view.findViewById(R.id.igb);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.push_list)");
        SYL syl = (SYL) findViewById;
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        syl.setPadding(0, LIZJ, 0, LIZJ);
        this.LJLJJI = new C25851ACp(syl);
        Bundle arguments = getArguments();
        if (arguments != null) {
            str = arguments.getString("param_content");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getBoolean("param_require_sys_permission")) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLJ = z;
        if (str != null) {
            PushSettingDynamicUI pushSettingDynamicUI = (PushSettingDynamicUI) C75792yF.LIZ(str, PushSettingDynamicUI.class);
            this.LJLJL = pushSettingDynamicUI.title;
            C25851ACp c25851ACp = this.LJLJJI;
            if (c25851ACp != null) {
                this.LJLJLLL = pushSettingDynamicUI.pageLabel;
                for (PushCategory pushCategory : pushSettingDynamicUI.categoryList) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("category: ");
                    LIZ.append(pushCategory.categoryTitle);
                    C85934Xo2.LIZ(X1D.LIZIZ(LIZ));
                    if (pushCategory.categoryTitle.length() > 0 && (!pushCategory.itemList.isEmpty())) {
                        c85854Xmk = new C85854Xmk(pushCategory);
                        this.LJLJJLL.add(c85854Xmk);
                        c25851ACp.LIZ(c85854Xmk);
                    } else {
                        c85854Xmk = null;
                    }
                    Iterator<PushItem> it = pushCategory.itemList.iterator();
                    boolean z2 = false;
                    while (it.hasNext()) {
                        AG6<?> LIZ2 = C85931Xnz.LIZ(it.next(), this.LJLL, getLayoutInflater());
                        this.LJLJJLL.add(LIZ2);
                        c25851ACp.LIZ(LIZ2);
                        z2 |= LIZ2.LJFF().LIZIZ();
                    }
                    if (c85854Xmk != null) {
                        c85854Xmk.LJIIIZ(z2);
                    }
                }
            }
        }
        C252709vu c252709vu = this.LJLJI;
        if (c252709vu != null) {
            C235119Kp c235119Kp = new C235119Kp();
            C78840Uwu.LJJIZ(c235119Kp, this.LJLJL, new AqS165S0100000_15(this, 819));
            c235119Kp.LIZLLL = false;
            c252709vu.setNavActions(c235119Kp);
        }
        C85897XnR c85897XnR = this.LJLJJL;
        c85897XnR.LJLILLLLZI = this;
        c85897XnR.LJLJI = false;
    }
}
