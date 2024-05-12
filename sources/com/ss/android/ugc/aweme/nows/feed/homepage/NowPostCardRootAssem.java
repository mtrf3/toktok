package com.ss.android.ugc.aweme.nows.feed.homepage;

import X.C181847Bs;
import X.C212428Vi;
import X.C26338AVi;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C7XD;
import X.C8VV;
import X.O6R;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostCardRootAssem extends ReusedUIContentAssem<NowPostCardRootAssem> {
    public static final /* synthetic */ int LLF = 0;
    public final boolean LJZL;
    public final boolean LL;
    public final String LLD;

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Lifecycle lifecycle;
        o.LJIIIZ(view, "view");
        Lifecycle.State currentState = getLifecycle().getCurrentState();
        Lifecycle.State state = Lifecycle.State.DESTROYED;
        if (currentState == state) {
            return;
        }
        if (new C55749LuL(C47704Ins.LJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared()).getValue() == null) {
            StringBuilder sb = new StringBuilder("Hierarchy data not found. ");
            sb.append(C212428Vi.LIZLLL(this));
            sb.append(", fragment lifecycle state: ");
            Fragment LIZLLL = C212428Vi.LIZLLL(this);
            Lifecycle.State state2 = null;
            if (LIZLLL != null && (lifecycle = LIZLLL.getLifecycle()) != null) {
                state2 = lifecycle.getCurrentState();
            }
            sb.append(state2);
            C7XD.LIZIZ("NowPostCardRootAssem", sb.toString());
            Fragment LIZLLL2 = C212428Vi.LIZLLL(this);
            if (LIZLLL2 != null && LIZLLL2.getLifecycle().getCurrentState() != state) {
                C8VV.LIZ(LIZLLL2, false, new AqS134S0200000_3(LIZLLL2, this, 274));
            } else {
                return;
            }
        }
        C8VV.LIZLLL(this, new AqS169S0100000_3(this, 301));
        getContainerView().setBackgroundColor(-16777216);
        if (o.LJ(this.LLD, "personal_homepage") || o.LJ(this.LLD, "others_homepage")) {
            C26338AVi.LJIIIZ(getContainerView(), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(52))), null, null, 29);
        }
    }

    public NowPostCardRootAssem(boolean z, boolean z2, String eventType) {
        o.LJIIIZ(eventType, "eventType");
        new LinkedHashMap();
        this.LJZL = z;
        this.LL = z2;
        this.LLD = eventType;
    }
}
