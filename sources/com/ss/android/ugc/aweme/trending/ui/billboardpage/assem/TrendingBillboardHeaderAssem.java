package com.ss.android.ugc.aweme.trending.ui.billboardpage.assem;

import X.AnonymousClass391;
import X.C118154kN;
import X.C16880lQ;
import X.C214298b3;
import X.C26338AVi;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C9BE;
import X.InterfaceC65350Pko;
import X.TBT;
import X.W5F;
import X.W5U;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS12S0300000_1;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrendingBillboardHeaderAssem extends DynamicAssem {
    public final C214298b3 LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public View LJLLILLLL;
    public LinearLayout LJLLJ;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.cto;
    }

    public TrendingBillboardHeaderAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingBillboardViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 725), C118154kN.INSTANCE, null);
    }

    public final void L3(String str) {
        SmartImageView smartImageView = new SmartImageView(getContext());
        LinearLayout linearLayout = this.LJLLJ;
        if (linearLayout != null) {
            linearLayout.addView(smartImageView);
            smartImageView.getLayoutParams().height = C7MY.LIZIZ(164);
            smartImageView.getLayoutParams().width = C7MY.LIZIZ(164);
            LinearLayout linearLayout2 = this.LJLLJ;
            if (linearLayout2 != null) {
                if (linearLayout2.getChildCount() < 2) {
                    C26338AVi.LJI(smartImageView, AnonymousClass391.LIZJ(-48), null, null, null, false, 30);
                } else {
                    C26338AVi.LJI(smartImageView, AnonymousClass391.LIZJ(4), null, null, null, false, 30);
                }
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LJJIIJ = smartImageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
                return;
            }
            o.LJIJI("bannerContainer");
            throw null;
        }
        o.LJIJI("bannerContainer");
        throw null;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        CharSequence charSequence;
        o.LJIIIZ(view, "view");
        assembleChildren();
        View findViewById = view.findViewById(R.id.lla);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.trending_title)");
        this.LJLL = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.muj);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.update_time)");
        this.LJLLI = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.agc);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.banner_back_btn)");
        this.LJLLILLLL = findViewById3;
        View findViewById4 = view.findViewById(R.id.agf);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.banner_container)");
        this.LJLLJ = (LinearLayout) findViewById4;
        Context context = getContext();
        if (context == null || (charSequence = context.getText(R.string.sjv)) == null) {
            charSequence = "Trending";
        }
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.dj);
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.e3y);
            frameLayout.getLayoutParams().height = C7MY.LIZIZ(UserLevelGeckoUpdateSetting.DEFAULT);
            frameLayout.requestLayout();
            frameLayout.post(new ARunnableS12S0300000_1(frameLayout, this, charSequence, 5));
            View view2 = this.LJLLILLLL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 119), view2);
                AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.4kM
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        C118114kJ c118114kJ = (C118114kJ) obj;
                        c118114kJ.getClass();
                        return C208708Ha.LIZLLL(c118114kJ);
                    }
                }, null, null, null, new AqS105S0300000_1(view, frameLayout, this, 4), 14, null);
                return;
            } else {
                o.LJIJI("backBtn");
                throw null;
            }
        }
        o.LJIJI("trendingText");
        throw null;
    }
}
