package com.ss.android.ugc.feed.platform.fragment;

import X.C16970lZ;
import X.C221108m2;
import X.C2MH;
import X.C62822Ol8;
import X.KR5;
import X.KR7;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class FragmentComponent extends BasePanelUIComponent implements KR7 {
    public final C62822Ol8 LJLJJI;

    @Override // X.KR6
    public void LJJJJI(View view, Bundle bundle) {
    }

    @Override // X.KR6
    public final void LJLLILLLL() {
    }

    @Override // X.KR6
    public final void LLJILJIL() {
    }

    @Override // X.KR6
    public final void LLJLLL() {
    }

    @Override // X.KR6
    public final void LLLIL() {
    }

    @Override // X.KR6
    public final void LLLLLZ(Bundle bundle) {
    }

    @Override // X.KR6
    public final void LLLLZLLLI() {
    }

    @Override // X.KR6
    public final void N1(Bundle bundle) {
    }

    @Override // X.KR6
    public final void W1() {
    }

    @Override // X.KR6
    public final void d5() {
    }

    @Override // X.KR6
    public final void v() {
    }

    public FragmentComponent() {
        new LinkedHashMap();
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 369));
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        View view = getSupervisor().LJLLL;
        if (view != null) {
            setContainerView(view);
            handleOnViewCreated(view);
        }
    }

    @Override // X.KR6
    public final void LLIIIJ(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    @Override // X.KR6
    public final void LLLII(Bundle outState) {
        o.LJIIIZ(outState, "outState");
    }

    @Override // X.KR6
    public final void j(Activity context, Fragment fragment) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(fragment, "fragment");
        C2MH.LIZ(context, fragment);
    }

    @Override // X.KR7
    public final View LLJLL(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        KR5 N20;
        o.LJIIIZ(inflater, "inflater");
        IRootAbility iRootAbility = (IRootAbility) this.LJLJJI.getValue();
        if (iRootAbility == null || (N20 = iRootAbility.N20()) == null) {
            return null;
        }
        return C16970lZ.LIZLLL(getPanelContext().LIZ(), N20.LIZJ());
    }
}
