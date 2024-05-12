package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C212428Vi;
import X.C221108m2;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C62822Ol8;
import X.C73305Spp;
import X.C7VL;
import X.InterfaceC55235Lm3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseFavoritePageAssem extends UIContentAssem implements BasicFavoritePageAbilities, VisibilityAware {
    public final Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C7VL.class, "base_favorite_page"), checkSupervisorPrepared());
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 226));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 225));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 223));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 224));

    public abstract void C3();

    public abstract void E3();

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract String v3();

    public abstract String x3();

    public final C73305Spp A3() {
        C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
        o.LJIIIIZZ(status_view, "status_view");
        return status_view;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C55096Ljo.LJIIJJI(LIZJ, this, BasicFavoritePageAbilities.class, null);
            C55096Ljo.LJIIJJI(LIZJ, this, VisibilityAware.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C55096Ljo.LJIILL(LIZJ, BasicFavoritePageAbilities.class, null);
            C55096Ljo.LJIILL(LIZJ, VisibilityAware.class, null);
        }
    }

    public void LLLFZ(boolean z) {
        if (z && ((Boolean) this.LJLILLLLZI.getValue()).booleanValue()) {
            C3();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
    }
}
