package com.ss.android.ugc.aweme.account.bind;

import X.ActivityC45651qj;
import X.C188727au;
import X.C221108m2;
import X.C26338AVi;
import X.C41565GSz;
import X.C52927Kpv;
import X.C62822Ol8;
import X.C79007Uzb;
import X.C79016Uzk;
import X.C85144XbI;
import X.C85712XkS;
import X.EnumC69116RAq;
import X.FMX;
import X.V0B;
import Y.ACListenerS35S0100000_15;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BindTOTPFragment extends BaseI18nLoginFragment {
    public String LJZL;
    public Integer LL;
    public boolean LLD;
    public final Map<Integer, View> LLFF = new LinkedHashMap();
    public final C62822Ol8 LLF = C221108m2.LIZIZ(new AqS165S0100000_15(this, 50));

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Hl() {
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final void Pl() {
    }

    @Override // X.InterfaceC69056R8i
    public final void Sg(int i, String message) {
        o.LJIIIZ(message, "message");
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLFF).clear();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLFF;
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

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final C85712XkS Jl() {
        int i;
        C85712XkS c85712XkS = new C85712XkS(null, null, false, null, null, false, null, false, false, 131071);
        if (Ql()) {
            i = R.string.t7i;
        } else {
            i = R.string.sgv;
        }
        c85712XkS.LIZ = getString(i);
        boolean z = false;
        c85712XkS.LJIILIIL = false;
        if (Ql() && !Rl()) {
            z = true;
        }
        c85712XkS.LJI = z;
        return c85712XkS;
    }

    public final boolean Rl() {
        Integer num = this.LL;
        int value = EnumC69116RAq.UPDATE_TOTP.getValue();
        if (num == null || num.intValue() != value) {
            return false;
        }
        return true;
    }

    public final boolean Ql() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getInt("progress", -1) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment
    public final int getLayout() {
        if (C52927Kpv.LIZ()) {
            return R.layout.mz;
        }
        return R.layout.my;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment
    public final boolean onBackPressed() {
        if (!Ql() || Rl() || !C41565GSz.LIZJ(mo49getActivity())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            num = Integer.valueOf(arguments.getInt("current_scene"));
        } else {
            num = null;
        }
        this.LL = num;
    }

    @Override // com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        AppCompatImageView appCompatImageView;
        TextView textView2;
        View view2;
        View view3;
        View view4;
        String str;
        View findViewById;
        String string;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        View view5 = null;
        if (mo49getActivity != null) {
            textView = (TextView) mo49getActivity.findViewById(R.id.liw);
        } else {
            textView = null;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null) {
            appCompatImageView = (AppCompatImageView) mo49getActivity2.findViewById(R.id.lix);
        } else {
            appCompatImageView = null;
        }
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if (mo49getActivity3 != null) {
            textView2 = (TextView) mo49getActivity3.findViewById(R.id.liy);
        } else {
            textView2 = null;
        }
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        if (mo49getActivity4 != null) {
            view2 = mo49getActivity4.findViewById(R.id.mue);
        } else {
            view2 = null;
        }
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        if (mo49getActivity5 != null) {
            view3 = mo49getActivity5.findViewById(R.id.bv9);
        } else {
            view3 = null;
        }
        ActivityC45651qj mo49getActivity6 = mo49getActivity();
        if (mo49getActivity6 != null) {
            view4 = mo49getActivity6.findViewById(R.id.h0v);
        } else {
            view4 = null;
        }
        if (textView != null) {
            textView.setText("1. " + getString(R.string.sgt) + "\n\n2. " + getString(R.string.sgq) + "\n\n3. " + getString(R.string.sgr) + "\n\n4. " + getString(R.string.sgs));
        }
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("totp_key_uri")) != null && appCompatImageView != null) {
            C79007Uzb LJ = new C79016Uzk().LJ(string, V0B.QR_CODE, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, null);
            Bitmap createBitmap = Bitmap.createBitmap(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, LiveMaxRetainAlogMessageSizeSetting.DEFAULT, Bitmap.Config.ARGB_8888);
            int i2 = 0;
            do {
                int i3 = 0;
                do {
                    if (LJ.LIZ(i2, i3)) {
                        i = -16777216;
                    } else {
                        i = -1;
                    }
                    createBitmap.setPixel(i2, i3, i);
                    i3++;
                } while (i3 < 500);
                i2++;
            } while (i2 < 500);
            appCompatImageView.setImageBitmap(createBitmap);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("totp_secret");
        } else {
            str = null;
        }
        this.LJZL = str;
        if (textView2 != null) {
            textView2.setText(str);
        }
        if (Rl() && view2 != null) {
            view2.setVisibility(0);
        }
        String enterFrom = getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        String flowType = (String) this.LLF.getValue();
        o.LJIIIZ(flowType, "flowType");
        C188727au LJFF = C85144XbI.LJFF();
        LJFF.LJIIIZ("enter_from", enterFrom);
        LJFF.LJIIIZ("popup_type", "totp");
        LJFF.LJIIIZ("flow_type", flowType);
        FMX.LJIIL("twosv_totp_key_show", LJFF.LIZ);
        Ol(new ACListenerS35S0100000_15(this, 20), view3);
        Ol(new ACListenerS35S0100000_15(this, 21), view4);
        if (Ql()) {
            ActivityC45651qj mo49getActivity7 = mo49getActivity();
            if (mo49getActivity7 != null) {
                view5 = mo49getActivity7.findViewById(R.id.lix);
            }
            ActivityC45651qj mo49getActivity8 = mo49getActivity();
            if (mo49getActivity8 != null && (findViewById = mo49getActivity8.findViewById(R.id.hfp)) != null) {
                findViewById.setVisibility(0);
            }
            if (view5 != null) {
                C26338AVi.LJI(view5, 0, 0, 0, 0, false, 16);
            }
        }
    }
}
