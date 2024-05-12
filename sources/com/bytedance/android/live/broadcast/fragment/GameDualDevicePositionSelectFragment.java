package com.bytedance.android.live.broadcast.fragment;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C15490jB;
import X.C16880lQ;
import X.C221108m2;
import X.C28408BCy;
import X.C29S;
import X.C32537Cpp;
import X.C3C5;
import X.C46881si;
import X.C51029K0z;
import X.C62705OjF;
import X.C62822Ol8;
import X.C73411SrX;
import X.C76800UCe;
import X.C90903hW;
import X.EnumC12710eh;
import X.InterfaceC48038ItG;
import X.InterfaceC92693kP;
import Y.IDCListenerS135S0100000;
import Y.IDCListenerS83S0200000;
import Y.IDfS292S0100000;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GameDualDevicePositionSelectFragment extends BaseFragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public final C62822Ol8 LJLIL;
    public int LJLILLLLZI;
    public C73411SrX LJLJI;

    public GameDualDevicePositionSelectFragment() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new C46881si(this));
        this.LJLILLLLZI = -1;
    }

    public final void vl(ImageView imageView) {
        C73411SrX c73411SrX = this.LJLJI;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        InterfaceC92693kP LJJJJZI = AbstractC73672Svk.LJJIJIL("ttlive_game_dual_device_position_selected.png").LJJIJL(new InterfaceC48038ItG() { // from class: X.1G1
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                String it = (String) obj;
                o.LJIIIZ(it, "it");
                return C15490jB.LIZ("tiktok_live_game_demand_1", it);
            }
        }).LJII(new C62705OjF()).LJJJJZI(new IDfS292S0100000(imageView, 6));
        this.LJLJI = (C73411SrX) LJJJJZI;
        register(LJJJJZI);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Integer, O] */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        View findViewById;
        Integer num;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        if (LJIILIIL != null && (num = (Integer) LJIILIIL.kv0(C28408BCy.class)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        DataChannel LJIILIIL2 = C51029K0z.LJIILIIL(this);
        if (LJIILIIL2 != null) {
            ((C32537Cpp) LJIILIIL2.gv0(C28408BCy.class)).LIZ = Integer.valueOf(i);
        }
        this.LJLILLLLZI = i;
        if (!((Boolean) this.LJLIL.getValue()).booleanValue() && (findViewById = view.findViewById(R.id.lp6)) != null) {
            C15490jB.LJFF(findViewById, "tiktok_live_game_demand_1", "ttlive_bg_game_dual_device_position_select_bg_port.png", ImageView.ScaleType.FIT_XY, null);
        }
        View findViewById2 = view.findViewById(R.id.loz);
        if (findViewById2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 80), findViewById2);
        }
        ArrayList arrayList = new ArrayList();
        for (EnumC12710eh enumC12710eh : EnumC12710eh.values()) {
            ImageView imageView = (ImageView) view.findViewById(enumC12710eh.getResId());
            if (imageView != null) {
                arrayList.add(imageView);
                imageView.setTag(enumC12710eh);
                if (enumC12710eh.ordinal() == this.LJLILLLLZI) {
                    imageView.setSelected(true);
                    vl(imageView);
                }
                C16880lQ.LJIILLIIL(imageView, new IDCListenerS83S0200000(this, arrayList, 11));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        o.LJIIIZ(inflater, "inflater");
        if (((Boolean) this.LJLIL.getValue()).booleanValue()) {
            i = R.layout.d42;
        } else {
            i = R.layout.d43;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
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
