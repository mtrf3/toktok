package com.ss.android.ugc.aweme.base.assem;

import X.AnonymousClass391;
import X.C110614Vt;
import X.C16880lQ;
import X.C184077Kh;
import X.C1JD;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C32151Nz;
import X.C47704Ins;
import X.C54602Lbq;
import X.C54621Lc9;
import X.C55749LuL;
import X.C61328O5c;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.InterfaceC65784Pro;
import X.O6R;
import X.TBT;
import Y.ACListenerS29S0100000_9;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.base.vm.FeedSkylightContainerViewModel;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FeedSkylightBubbleAssem extends UISlotAssem {
    public final C62822Ol8 LJLJLLL;
    public final C214378bB LJLL;
    public final C55749LuL LJLLI;
    public final AnimatorSet LJLLILLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.avj;
    }

    public FeedSkylightBubbleAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 65));
        C65776Prg LIZ = C65352Pkq.LIZ(FeedSkylightContainerViewModel.class);
        C54621Lc9 c54621Lc9 = C54621Lc9.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS159S0100000_9((C8W0) this, 66);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLL = new C214378bB(LIZ, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c54621Lc9, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLLI = new C55749LuL(C47704Ins.LJ(this, C54602Lbq.class, "feed_skylight_hierarchy_data_key"), checkSupervisorPrepared());
        this.LJLLILLLL = new AnimatorSet();
    }

    public final FeedSkylightContainerViewModel H3() {
        return (FeedSkylightContainerViewModel) this.LJLL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        IFeedCleanAbility LJI;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View containerView = getContainerView();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(16);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cd);
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dh);
        Context context = containerView.getContext();
        o.LJIIIIZZ(context, "context");
        containerView.setBackground(c110614Vt.LIZ(context));
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 7), containerView);
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-bubbleText>(...)");
        ((TextView) value).setText(view.getContext().getString(R.string.rrw));
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (LJI = C1JD.LJI(LIZLLL)) != null) {
            LJI.xT(getContainerView());
        }
        Context context2 = getContainerView().getContext();
        o.LJIIIIZZ(context2, "containerView.context");
        int LJJJJLI = C63081OpJ.LJJJJLI(context2);
        ViewGroup.LayoutParams layoutParams = getContainerView().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)) + LJJJJLI + marginLayoutParams.topMargin;
        getContainerView().setLayoutParams(marginLayoutParams);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.LcA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54617Lc5) obj).LJLJJI;
            }
        }, null, new AqS191S0100000_9(this, 99), 6);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.8a9
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C54617Lc5) obj).LJLILLLLZI);
            }
        }, null, new AqS191S0100000_9(this, 100), 6);
    }
}
