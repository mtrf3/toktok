package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.ActivityC45651qj;
import X.AnonymousClass636;
import X.C10A;
import X.C110614Vt;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C1JX;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C3C5;
import X.C57570Mic;
import X.C57571Mid;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C79045V0n;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EnumC58046MqI;
import X.FMX;
import X.HG3;
import X.Q8U;
import X.RBX;
import X.SY4;
import X.UQ4;
import X.W5F;
import Y.ACListenerS29S0100000_9;
import Y.ACListenerS44S0200000_9;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class FullScreenAuthFragment extends BaseFragment {
    public final C214298b3 LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 536));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 538));

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
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

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public FullScreenAuthFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MufListPageViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 537);
        C57570Mic c57570Mic = C57570Mic.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c57570Mic, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS159S0100000_9, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c57570Mic, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJI = c214298b3;
    }

    public final C57571Mid vl() {
        return (C57571Mid) this.LJLILLLLZI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        super.onResume();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.bs2);
        int i2 = 0;
        if (_$_findCachedViewById != null) {
            if (!EnumC58046MqI.CONTACT.isGrant()) {
                i = 0;
            } else {
                i = 8;
            }
            _$_findCachedViewById.setVisibility(i);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.d5l);
        if (_$_findCachedViewById2 == null) {
            return;
        }
        if (!(!EnumC58046MqI.FACEBOOK.isGrant())) {
            i2 = 8;
        }
        _$_findCachedViewById2.setVisibility(i2);
    }

    public final void wl(EnumC58046MqI enumC58046MqI) {
        String LJIIIZ = UQ4.LJIIIZ(enumC58046MqI.getString());
        String LJIIJ = UQ4.LJIIJ(enumC58046MqI.getString());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", vl().LJLIL);
        c188727au.LJIIIZ("platform", enumC58046MqI.getString());
        c188727au.LJIIIZ("position", vl().LJLJJI);
        c188727au.LJIIIZ("did_status", LJIIIZ);
        c188727au.LJIIIZ("uid_status", LJIIJ);
        FMX.LJIIL("authorize_card_click", c188727au.LIZ);
    }

    public final void xl(EnumC58046MqI enumC58046MqI) {
        String LJIIIZ = UQ4.LJIIIZ(enumC58046MqI.getString());
        String LJIIJ = UQ4.LJIIJ(enumC58046MqI.getString());
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", vl().LJLIL);
        c188727au.LJIIIZ("platform", enumC58046MqI.getString());
        c188727au.LJIIIZ("position", vl().LJLJJI);
        c188727au.LJIIIZ("did_status", LJIIIZ);
        c188727au.LJIIIZ("uid_status", LJIIJ);
        FMX.LJIIL("authorize_card_show", c188727au.LIZ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser != null) {
            W5F LJI = C1JX.LJI(curUser);
            LJI.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.gvq);
            LJI.LIZIZ("[ffp]");
            C16880lQ.LLJJJ(LJI);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.l7i);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C79045V0n.LJI(R.attr.go, context);
        c110614Vt.LIZJ = C61328O5c.LIZJ(14);
        _$_findCachedViewById.setBackground(c110614Vt.LIZ(context));
        TextView textView = (TextView) _$_findCachedViewById(R.id.title);
        String string = textView.getResources().getString(R.string.gh1);
        o.LJIIIIZZ(string, "resources.getString(R.st…te_v2_rejected_all_title)");
        String string2 = textView.getResources().getString(R.string.gh2);
        o.LJIIIIZZ(string2, "resources.getString(R.st…jected_all_title_friends)");
        int LJJLIIIJL = s.LJJLIIIJL(string, "%s", 0, false, 6);
        int length = string2.length() + LJJLIIIJL;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q8U.LIZIZ(new Object[]{string2}, 1, string, "format(this, *args)"));
        if (LJJLIIIJL != -1 && LJJLIIIJL <= length) {
            Context context2 = textView.getContext();
            o.LJIIIIZZ(context2, "context");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AnonymousClass636.LJIIIIZZ(R.attr.eh, context2)), LJJLIIIJL, length, 33);
        }
        textView.setText(spannableStringBuilder);
        LinearLayout onViewCreated$lambda$4 = (LinearLayout) _$_findCachedViewById(R.id.bs2);
        o.LJIIIIZZ(onViewCreated$lambda$4, "onViewCreated$lambda$4");
        EnumC58046MqI enumC58046MqI = EnumC58046MqI.CONTACT;
        if (!enumC58046MqI.isGrant()) {
            i = 0;
        } else {
            i = 8;
        }
        onViewCreated$lambda$4.setVisibility(i);
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZJ = C61328O5c.LIZJ(8);
        c110614Vt2.LIZ = C79045V0n.LJI(R.attr.dp, context);
        Context context3 = onViewCreated$lambda$4.getContext();
        o.LJIIIIZZ(context3, "context");
        onViewCreated$lambda$4.setBackground(c110614Vt2.LIZ(context3));
        C16880lQ.LJIIZILJ(onViewCreated$lambda$4, new ACListenerS44S0200000_9(onViewCreated$lambda$4, this, 18));
        if (onViewCreated$lambda$4.getVisibility() == 0) {
            xl(enumC58046MqI);
        }
        LinearLayout onViewCreated$lambda$6 = (LinearLayout) _$_findCachedViewById(R.id.d5l);
        o.LJIIIIZZ(onViewCreated$lambda$6, "onViewCreated$lambda$6");
        EnumC58046MqI enumC58046MqI2 = EnumC58046MqI.FACEBOOK;
        if (!enumC58046MqI2.isGrant()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        onViewCreated$lambda$6.setVisibility(i2);
        C110614Vt c110614Vt3 = new C110614Vt();
        c110614Vt3.LIZJ = C61328O5c.LIZJ(8);
        c110614Vt3.LIZ = C79045V0n.LJI(R.attr.dq, context);
        Context context4 = onViewCreated$lambda$6.getContext();
        o.LJIIIIZZ(context4, "context");
        onViewCreated$lambda$6.setBackground(c110614Vt3.LIZ(context4));
        C16880lQ.LJIIZILJ(onViewCreated$lambda$6, new ACListenerS44S0200000_9(onViewCreated$lambda$6, this, 19));
        if (onViewCreated$lambda$6.getVisibility() == 0) {
            xl(enumC58046MqI2);
        }
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.ert);
        sy4.getClass();
        sy4.setButtonVariant(5);
        C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(sy4, 58));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ay9, viewGroup, false);
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
