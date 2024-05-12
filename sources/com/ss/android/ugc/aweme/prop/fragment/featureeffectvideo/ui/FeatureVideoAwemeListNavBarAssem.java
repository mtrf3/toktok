package com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.C109824Ss;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C234509Ig;
import X.C235119Kp;
import X.C243239gd;
import X.C243249ge;
import X.C243259gf;
import X.C243279gh;
import X.C243369gq;
import X.C252709vu;
import X.C45804HyK;
import X.C47704Ins;
import X.C55749LuL;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.C9KF;
import X.EnumC252729vw;
import X.InterfaceC198557ql;
import X.InterfaceC243269gg;
import X.InterfaceC243339gn;
import X.TBT;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeatureVideoAwemeListNavBarViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FeatureVideoAwemeListNavBarAssem extends UIContentAssem implements InterfaceC243339gn {
    public final C214298b3 LJLJI;
    public Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJ(this, C243369gq.class, "hierarchy_data_feature_video"), checkSupervisorPrepared());
    public final C5H3 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 757));

    private final void F3() {
        C8YN.LJII(this, C3(), new TBT() { // from class: X.9gk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C243319gl) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 184), 6);
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLJJI.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC243339gn, X.C8VB, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public FeatureVideoAwemeListNavBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeatureVideoAwemeListNavBarViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 758), C243259gf.INSTANCE, null);
    }

    private final C252709vu A3() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-navBar>(...)");
        return (C252709vu) value;
    }

    public final FeatureVideoAwemeListNavBarViewModel C3() {
        return (FeatureVideoAwemeListNavBarViewModel) this.LJLJI.getValue();
    }

    public final void H3() {
        Aweme i4 = ((InterfaceC243269gg) C8VC.LIZ(this, C65352Pkq.LIZ(InterfaceC243269gg.class), null)).i4();
        Intent intent = new Intent();
        intent.putExtra("extra_related_item", i4);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            LIZ.setResult(-1, intent);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            LIZ2.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9gh] */
    @Override // X.C8VB
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public C243279gh defaultObservableData() {
        return new InterfaceC198557ql() { // from class: X.9gh
        };
    }

    public final C243369gq x3() {
        return (C243369gq) this.LJLIL.getValue();
    }

    private final void E3() {
        String str;
        String str2;
        Resources resources;
        String string;
        Resources resources2;
        Resources resources3;
        C252709vu A3 = A3();
        A3.LJIILJJIL(true);
        C235119Kp c235119Kp = new C235119Kp();
        AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
        C234509Ig c234509Ig = new C234509Ig();
        Context context = A3.getContext();
        String str3 = "";
        if (context == null || (resources3 = context.getResources()) == null || (str = resources3.getString(R.string.gcu)) == null) {
            str = "";
        }
        c234509Ig.LIZJ = str;
        c234509Ig.LJ = true;
        c234509Ig.LIZ(EnumC252729vw.SECONDARY);
        c234509Ig.LIZ = new C109824Ss(new AqS154S0100000_4(this, 756));
        abstractC234519IhArr[0] = c234509Ig;
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, abstractC234519IhArr);
        Context context2 = A3.getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (str2 = resources2.getString(R.string.gd0)) == null) {
            str2 = "";
        }
        LIZLLL.LIZJ = str2;
        c235119Kp.LIZJ = LIZLLL;
        AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
        C234509Ig c234509Ig2 = new C234509Ig();
        c234509Ig2.LIZIZ = "save";
        Context context3 = A3.getContext();
        if (context3 != null && (resources = context3.getResources()) != null && (string = resources.getString(R.string.gcy)) != null) {
            str3 = string;
        }
        c234509Ig2.LIZJ = str3;
        c234509Ig2.LJ = false;
        c234509Ig2.LIZ(EnumC252729vw.PRIMARY);
        c234509Ig2.LIZ = new C109824Ss(new AqS151S0200000_4(this, A3, 18));
        abstractC234519IhArr2[0] = c234509Ig2;
        c235119Kp.LIZIZ(abstractC234519IhArr2);
        c235119Kp.LIZLLL = true;
        A3.setNavActions(c235119Kp);
    }

    @Override // X.InterfaceC243339gn
    public void LJJIIJZLJL() {
        A3().LJIJ("save", C243249ge.LJLIL);
    }

    @Override // X.InterfaceC243339gn
    public void LJJJI() {
        A3().LJIJ("save", C243239gd.LJLIL);
    }

    public final void I3(int i) {
        Activity LJIJJ;
        Context context = getContext();
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            AnonymousClass114.LIZ(LJIJJ, i);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        E3();
        F3();
    }
}
