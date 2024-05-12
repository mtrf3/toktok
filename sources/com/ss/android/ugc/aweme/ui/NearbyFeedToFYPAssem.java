package com.ss.android.ugc.aweme.ui;

import X.C04330Ez;
import X.C16880lQ;
import X.C214298b3;
import X.C2K0;
import X.C32151Nz;
import X.C47704Ins;
import X.C54485LZx;
import X.C54486LZy;
import X.C55096Ljo;
import X.C55749LuL;
import X.C57092Lx;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.FMX;
import X.InterfaceC55102Lju;
import X.LZV;
import X.O6R;
import X.OSZ;
import X.SY4;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDTListenerS118S0100000_9;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyFeedToFYPAssem extends UISlotAssem implements INearbyToFYPAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public boolean LJLL;
    public final C55749LuL LJLLI;
    public NearbyFeedFragmentPanel LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public int LJLLLL;
    public SY4 LJLLLLLL;
    public TuxTextView LJLZ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2054121039) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bw5;
    }

    public NearbyFeedToFYPAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyFeedListViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 689), C54486LZy.INSTANCE, null);
        this.LJLLI = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
        this.LJLLLL = 10;
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyToFYPAssemAbility
    public final boolean LJLJLJ() {
        return ((Boolean) withState((AssemViewModel) this.LJLJLLL.getValue(), new AqS175S0100000_9(this, 341))).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyToFYPAssemAbility
    public final void LJLLL() {
        if (this._isViewValid && this.LJLL) {
            getContainerView().postDelayed(new ARunnableS45S0100000_9(this, 103), 200L);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C54485LZx.LIZIZ = false;
        C54485LZx.LIZIZ();
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.ui.INearbyToFYPAssemAbility
    public final boolean LJJLIIIJILLIZJL() {
        return this.LJLL;
    }

    public final void H3(String str) {
        FMX.LJIILL("homepage_return_guide", new OSZ("homepage_nearby", "enter_from"), new OSZ(str, "action_type"));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        o.LJIIIZ(view, "view");
        if (!(getContainerView() instanceof FrameLayout)) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            i = ViewConfiguration.get(context).getScaledTouchSlop();
        } else {
            i = 10;
        }
        this.LJLLLL = i;
        this.LJLLILLLL = ((LZV) this.LJLLI.getValue()).LJLIL;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 76), getContainerView());
        getContainerView().setOnTouchListener(new IDTListenerS118S0100000_9(this, 4));
        SY4 sy4 = (SY4) view.findViewById(R.id.auw);
        C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 168));
        ViewGroup.LayoutParams layoutParams = null;
        if (!NearbyTabConfig.LIZLLL() || !NearbyTabConfig.LJI()) {
            ViewGroup.LayoutParams layoutParams2 = sy4.getLayoutParams();
            if (layoutParams2 != null) {
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    C57092Lx.LIZ.getClass();
                    marginLayoutParams.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(38)) + C61447O9r.LIZ();
                }
            } else {
                layoutParams2 = null;
            }
            sy4.setLayoutParams(layoutParams2);
        }
        this.LJLLLLLL = sy4;
        SY4 sy42 = (SY4) view.findViewById(R.id.aw3);
        if (!NearbyTabConfig.LIZLLL() || !NearbyTabConfig.LJI()) {
            sy42.setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams3 = sy42.getLayoutParams();
            if (layoutParams3 != null) {
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    C57092Lx.LIZ.getClass();
                    marginLayoutParams2.bottomMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(38)) + C61447O9r.LIZ();
                }
                layoutParams = layoutParams3;
            }
            sy42.setLayoutParams(layoutParams);
            C16880lQ.LJJIZ(sy42, new ACListenerS29S0100000_9(this, 77));
        }
        this.LJLZ = (TuxTextView) view.findViewById(R.id.c7z);
        View findViewById = view.findViewById(R.id.bd0);
        if (findViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setColors(new int[]{C04330Ez.LIZIZ(view.getContext(), R.color.yi), C04330Ez.LIZIZ(view.getContext(), R.color.ey)});
            findViewById.setBackground(gradientDrawable);
        }
    }
}
