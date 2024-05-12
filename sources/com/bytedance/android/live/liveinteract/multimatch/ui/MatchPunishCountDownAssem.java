package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.C47121t6;
import X.C47704Ins;
import X.C55749LuL;
import X.C74039T3z;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MatchPunishCountDownAssem extends UIContentAssem {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZJ(this, C74039T3z.class, null), checkSupervisorPrepared());
    public C47121t6 LJLILLLLZI;
    public C47121t6 LJLJI;
    public LinearLayout LJLJJI;
    public DataChannel LJLJJL;

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LJLJJL = ((C74039T3z) this.LJLIL.getValue()).LJLILLLLZI;
        this.LJLJJI = (LinearLayout) view;
        View findViewById = view.findViewById(R.id.me2);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.t…k_punish_countdown_value)");
        this.LJLILLLLZI = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.me3);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.tv_pk_punish_title)");
        this.LJLJI = (C47121t6) findViewById2;
        DataChannel dataChannel = this.LJLJJL;
        if (dataChannel != null) {
            dataChannel.mv0(BattlePunishTimeLeftChannel.class, this, new AqS179S0100000_13(this, 228));
        }
    }
}
