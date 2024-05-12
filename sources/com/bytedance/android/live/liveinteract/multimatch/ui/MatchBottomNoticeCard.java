package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.C20780ri;
import X.C212428Vi;
import X.C2A7;
import X.C2K0;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C76128TuG;
import X.C76450TzS;
import X.C76624U5k;
import X.EnumC76178Tv4;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import X.U1X;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowMatchItemGuideEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchBottomNoticeCard extends UIContentAssem implements IBottomNoticeAbility, InterfaceC55102Lju {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C76450TzS.class, null), checkSupervisorPrepared());
    public ConstraintLayout LJLILLLLZI;
    public U1X LJLJI;
    public C2A7 LJLJJI;
    public C76624U5k LJLJJL;
    public FrameLayout LJLJJLL;
    public DataChannel LJLJL;
    public boolean LJLJLJ;
    public EnumC76178Tv4 LJLJLLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1086323985) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        DataChannel dataChannel = this.LJLJL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        InterfaceC55235Lm3 LJIIZILJ;
        super.onCreate();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIL(LJIIZILJ, this, IBottomNoticeAbility.class, null, this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        InterfaceC55235Lm3 LJIIZILJ;
        super.onParentSet();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            LJIIZILJ = C55230Lly.LIZJ(LIZLLL, null);
        } else {
            LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        }
        C55096Ljo.LJIIL(LJIIZILJ, this, IBottomNoticeAbility.class, null, this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            int i = 0;
            do {
                C20780ri.LIZLLL(R.layout.de9, view.getContext());
                i++;
            } while (i < 6);
        }
        this.LJLJL = ((C76450TzS) this.LJLIL.getValue()).LJLILLLLZI;
        this.LJLILLLLZI = (ConstraintLayout) view;
        View findViewById = view.findViewById(R.id.fkd);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.l…out_pk_mvp_container_new)");
        this.LJLJI = (U1X) findViewById;
        View findViewById2 = view.findViewById(R.id.av4);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.btn_battle_rematch_new)");
        this.LJLJJI = (C2A7) findViewById2;
        View findViewById3 = view.findViewById(R.id.av3);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.b…_battle_rematch_draw_new)");
        this.LJLJJL = (C76624U5k) findViewById3;
        View findViewById4 = view.findViewById(R.id.fiy);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.layout_inner_content)");
        this.LJLJJLL = (FrameLayout) findViewById4;
        if (!C76128TuG.LIZIZ(this.LJLJL, false, 6)) {
            ConstraintLayout constraintLayout = this.LJLILLLLZI;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
                return;
            } else {
                o.LJIJI("bottomNoticeLayout");
                throw null;
            }
        }
        DataChannel dataChannel = this.LJLJL;
        if (dataChannel != null) {
            dataChannel.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 223));
            dataChannel.mv0(BattleShowMatchItemGuideEvent.class, this, new AqS179S0100000_13(this, 224));
        }
    }
}
