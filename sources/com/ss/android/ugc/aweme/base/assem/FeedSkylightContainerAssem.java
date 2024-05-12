package com.ss.android.ugc.aweme.base.assem;

import X.C184077Kh;
import X.C1JD;
import X.C212428Vi;
import X.C213708a6;
import X.C213718a7;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VV;
import X.C8W0;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedSkylightContainerAssem extends UISlotAssem {
    public final C214378bB LJLJLLL;
    public final C62822Ol8 LJLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.avk;
    }

    public FeedSkylightContainerAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSkylightContainerViewModel.class);
        C213718a7 c213718a7 = C213718a7.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 73);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJLLL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c213718a7, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 72));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IFeedCleanAbility LJI;
        o.LJIIIZ(view, "view");
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 62));
        C8YN.LJII(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.8a8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C54617Lc5) obj).LJLILLLLZI);
            }
        }, null, C213708a6.LJLIL, 6);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (LJI = C1JD.LJI(LIZLLL)) != null) {
            Object value = this.LJLL.getValue();
            o.LJIIIIZZ(value, "<get-skylightListContainer>(...)");
            LJI.xT((View) value);
        }
        Context context = getContainerView().getContext();
        o.LJIIIIZZ(context, "containerView.context");
        int LJJJJLI = C63081OpJ.LJJJJLI(context);
        ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin += LJJJJLI;
        getContainerView().setLayoutParams(marginLayoutParams);
    }
}
