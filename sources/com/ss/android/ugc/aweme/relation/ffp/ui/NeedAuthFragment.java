package com.ss.android.ugc.aweme.relation.ffp.ui;

import X.AnonymousClass636;
import X.C04330Ez;
import X.C110614Vt;
import X.C16880lQ;
import X.C1JX;
import X.C221018lt;
import X.C221108m2;
import X.C32151Nz;
import X.C51029K0z;
import X.C57571Mid;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C99W;
import X.C9UA;
import X.EnumC58046MqI;
import X.HG3;
import X.InterfaceC65350Pko;
import X.OSZ;
import X.Q8U;
import X.RBX;
import X.SY4;
import X.W5F;
import Y.ACListenerS35S0300000_9;
import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.FFPMainFragmentVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class NeedAuthFragment extends FFPBaseFragment {
    public LinearLayout LJLJJL;
    public LinearLayout LJLJJLL;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 527));
    public final Map<EnumC58046MqI, Boolean> LJLJJI = new LinkedHashMap();
    public final int LJLJL = R.layout.axv;

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLJ;
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

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void Il() {
        int i;
        LinearLayout linearLayout = this.LJLJJL;
        if (linearLayout != null) {
            int i2 = 0;
            if (!EnumC58046MqI.CONTACT.isGrant()) {
                i = 0;
            } else {
                i = 8;
            }
            linearLayout.setVisibility(i);
            LinearLayout linearLayout2 = this.LJLJJLL;
            if (linearLayout2 != null) {
                if (!(!EnumC58046MqI.FACEBOOK.isGrant())) {
                    i2 = 8;
                }
                linearLayout2.setVisibility(i2);
                return;
            }
            o.LJIJI("facebookAuthButton");
            throw null;
        }
        o.LJIJI("contactAuthButton");
        throw null;
    }

    public final void Jl() {
        ((LinkedHashMap) this.LJLJJI).clear();
        Map<EnumC58046MqI, Boolean> map = this.LJLJJI;
        EnumC58046MqI[] values = EnumC58046MqI.values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EnumC58046MqI enumC58046MqI : values) {
            OSZ osz = new OSZ(enumC58046MqI, Boolean.valueOf(enumC58046MqI.isGrant()));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        map.putAll(linkedHashMap);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        for (EnumC58046MqI enumC58046MqI : EnumC58046MqI.values()) {
            if (enumC58046MqI.isGrant() && o.LJ(((LinkedHashMap) this.LJLJJI).get(enumC58046MqI), Boolean.FALSE)) {
                ((FFPMainFragmentVM) this.LJLJI.getValue()).gv0(C65352Pkq.LIZ(RecFriendsFragment.class));
            }
        }
        Il();
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final int getLayoutRes() {
        return this.LJLJL;
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Dl(InterfaceC65350Pko<? extends Fragment> interfaceC65350Pko) {
        C221018lt.LJFF("[ffp]", "Need Auth show again!");
        Jl();
        Il();
        new C9UA("authorize", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
    }

    @Override // com.ss.android.ugc.aweme.relation.ffp.ui.FFPBaseFragment
    public final void Gl(View view) {
        int i;
        float LJIIZILJ;
        float LJIIZILJ2;
        o.LJIIIZ(view, "view");
        Jl();
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.gvq);
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null) {
            W5F LJI = C1JX.LJI(curUser);
            LJI.LJJIIJ = smartImageView;
            LJI.LIZIZ("[ffp]");
            C16880lQ.LLJJJ(LJI);
        }
        View findViewById = view.findViewById(R.id.l7i);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = Integer.valueOf(C04330Ez.LIZIZ(findViewById.getContext(), R.color.ey));
        c110614Vt.LIZJ = C61328O5c.LIZJ(14);
        Context context = findViewById.getContext();
        o.LJIIIIZZ(context, "context");
        findViewById.setBackground(c110614Vt.LIZ(context));
        TextView textView = (TextView) view.findViewById(R.id.title);
        String string = getString(R.string.gh1);
        o.LJIIIIZZ(string, "getString(R.string.find_…te_v2_rejected_all_title)");
        String string2 = getString(R.string.gh2);
        o.LJIIIIZZ(string2, "getString(R.string.find_…jected_all_title_friends)");
        int i2 = 0;
        int LJJLIIIJL = s.LJJLIIIJL(string, "%s", 0, false, 6);
        int length = string2.length() + LJJLIIIJL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q8U.LIZIZ(new Object[]{string2}, 1, string, "format(this, *args)"));
        if (LJJLIIIJL != -1 && LJJLIIIJL <= length) {
            Context context2 = textView.getContext();
            o.LJIIIIZZ(context2, "context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eh, context2)), LJJLIIIJL, length, 33);
        }
        textView.setText(spannableStringBuilder);
        C57571Mid c57571Mid = new C57571Mid(vl().getState().LJLJJL.LJLIL, "find_friends", null, 12);
        View findViewById2 = view.findViewById(R.id.bs2);
        LinearLayout setupView$lambda$6 = (LinearLayout) findViewById2;
        o.LJIIIIZZ(setupView$lambda$6, "setupView$lambda$6");
        if (!EnumC58046MqI.CONTACT.isGrant()) {
            i = 0;
        } else {
            i = 8;
        }
        setupView$lambda$6.setVisibility(i);
        C110614Vt c110614Vt2 = new C110614Vt();
        boolean z = C99W.LIZ;
        if (z) {
            LJIIZILJ = C32151Nz.LJIIZILJ(8);
        } else {
            LJIIZILJ = C32151Nz.LJIIZILJ(2);
        }
        c110614Vt2.LIZJ = Float.valueOf(LJIIZILJ);
        c110614Vt2.LIZ = Integer.valueOf(C04330Ez.LIZIZ(setupView$lambda$6.getContext(), R.color.l4));
        Context context3 = setupView$lambda$6.getContext();
        o.LJIIIIZZ(context3, "context");
        setupView$lambda$6.setBackground(c110614Vt2.LIZ(context3));
        C16880lQ.LJIIZILJ(setupView$lambda$6, new ACListenerS35S0300000_9(setupView$lambda$6, c57571Mid, this, 2));
        o.LJIIIIZZ(findViewById2, "view.findViewById<Linear…)\n            }\n        }");
        this.LJLJJL = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.d5l);
        LinearLayout setupView$lambda$8 = (LinearLayout) findViewById3;
        o.LJIIIIZZ(setupView$lambda$8, "setupView$lambda$8");
        if (!(true ^ EnumC58046MqI.FACEBOOK.isGrant())) {
            i2 = 8;
        }
        setupView$lambda$8.setVisibility(i2);
        C110614Vt c110614Vt3 = new C110614Vt();
        if (z) {
            LJIIZILJ2 = C32151Nz.LJIIZILJ(8);
        } else {
            LJIIZILJ2 = C32151Nz.LJIIZILJ(2);
        }
        c110614Vt3.LIZJ = Float.valueOf(LJIIZILJ2);
        c110614Vt3.LIZ = Integer.valueOf(C04330Ez.LIZIZ(setupView$lambda$8.getContext(), R.color.l5));
        Context context4 = setupView$lambda$8.getContext();
        o.LJIIIIZZ(context4, "context");
        setupView$lambda$8.setBackground(c110614Vt3.LIZ(context4));
        C16880lQ.LJIIZILJ(setupView$lambda$8, new ACListenerS35S0300000_9(setupView$lambda$8, c57571Mid, this, 3));
        o.LJIIIIZZ(findViewById3, "view.findViewById<Linear…)\n            }\n        }");
        this.LJLJJLL = (LinearLayout) findViewById3;
        SY4 sy4 = (SY4) view.findViewById(R.id.ert);
        C16880lQ.LJJIZ(sy4, new ACListenerS44S0200000_9(c57571Mid, sy4, 17));
        if (z) {
            sy4.setButtonVariant(5);
        }
        new C9UA("authorize", wl().getPreviousPage(), wl().getNewMafCount()).LIZLLL(null);
    }
}
