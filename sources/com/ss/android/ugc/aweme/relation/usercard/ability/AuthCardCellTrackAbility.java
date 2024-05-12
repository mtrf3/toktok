package com.ss.android.ugc.aweme.relation.usercard.ability;

import X.AbstractC57896Mns;
import X.C57454Mgk;
import X.C57819Mmd;
import X.C57834Mms;
import X.C57900Mnw;
import X.C57905Mo1;
import X.C57908Mo4;
import X.C57962Mow;
import X.C5H3;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78983UzD;
import X.InterfaceC57910Mo6;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.X1D;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.settings.AuthCardFreqParams;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AuthCardCellTrackAbility implements ICellTrackAbility<C57834Mms> {
    public final InterfaceC65784Pro<C57819Mmd> LJLIL;
    public final C5H3<C57962Mow> LJLILLLLZI;
    public final InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe>, C76800UCe> LJLJI;

    public final void LIZ(int i, C57834Mms c57834Mms) {
        C57900Mnw element = c57834Mms.LJLJI;
        C57962Mow value = this.LJLILLLLZI.getValue();
        o.LJIIIZ(value, "<this>");
        o.LJIIIZ(element, "element");
        if (!((CopyOnWriteArraySet) value.LJLL).add(element.getElementId())) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("social_permission_card_freq_");
        LIZ.append(C78983UzD.LJJII());
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + curUid)");
        C57908Mo4.LIZ.getClass();
        AuthCardFreqParams settings = (AuthCardFreqParams) C57908Mo4.LIZJ.getValue();
        o.LJIIIZ(settings, "settings");
        AbstractC57896Mns abstractC57896Mns = element.LJLILLLLZI;
        if (!abstractC57896Mns.LIZJ && !abstractC57896Mns.LIZLLL) {
            int i2 = 0;
            int i3 = repo.getInt(C78983UzD.LJJIJIL(element, "key_exp_count_"), 0) + 1;
            if (i3 >= settings.maxExposureCount) {
                repo.storeLong(C78983UzD.LJJIJIL(element, "key_auto_hide_ts_"), System.currentTimeMillis());
            } else {
                i2 = i3;
            }
            repo.storeInt(C78983UzD.LJJIJIL(element, "key_exp_count_"), i2);
        }
        C57819Mmd invoke = this.LJLIL.invoke();
        new C57454Mgk(invoke.LIZ, invoke.LIZIZ, invoke.LIZLLL, invoke.LIZJ, element.LJLIL, invoke.LJFF).LIZLLL(null);
        InterfaceC88472Yns<InterfaceC88472Yns<? super InterfaceC57910Mo6, C76800UCe>, C76800UCe> interfaceC88472Yns = this.LJLJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new AqS97S0101000_9(element, i, 1));
        }
    }

    public AuthCardCellTrackAbility(AqS159S0100000_9 aqS159S0100000_9, C62822Ol8 c62822Ol8, C57905Mo1 c57905Mo1) {
        this.LJLIL = aqS159S0100000_9;
        this.LJLILLLLZI = c62822Ol8;
        this.LJLJI = c57905Mo1;
    }
}
