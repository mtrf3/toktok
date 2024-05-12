package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C221108m2;
import X.C47704Ins;
import X.C49357JYr;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.InterfaceC49025JLx;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.JYG;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLiveTagAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPlayerSoundIconAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;

/* loaded from: classes9.dex */
public final class SearchComponentServiceImpl implements SearchComponentService {

    /* loaded from: classes9.dex */
    public static final class ConfigurableSearchCardFeedBackAssem extends SearchCardFeedbackAssem<InterfaceC49025JLx> {
        public final C55749LuL LLD;
        public final C62822Ol8 LLF;
        public final C62822Ol8 LLFF;
        public final C62822Ol8 LLFFF;
        public final C62822Ol8 LLFII;
        public final C62822Ol8 LLFZ;

        public ConfigurableSearchCardFeedBackAssem() {
            new LinkedHashMap();
            this.LLD = new C55749LuL(C47704Ins.LJ(this, C49357JYr.class, null), checkSupervisorPrepared());
            this.LLF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 130));
            this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 131));
            this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 132));
            this.LLFII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 129));
            this.LLFZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 133));
        }

        @Override // X.JY1
        public final int LLJJJIL() {
            return ((Number) this.LLF.getValue()).intValue();
        }

        @Override // X.JY1
        public final List<Integer> LLLLLLL() {
            return (List) this.LLFF.getValue();
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
        public final InterfaceC65784Pro<List<View>> a4() {
            return (InterfaceC65784Pro) this.LLFII.getValue();
        }

        @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
        public final boolean c4() {
            return ((Boolean) this.LLFZ.getValue()).booleanValue();
        }

        public final C49357JYr k4() {
            return (C49357JYr) this.LLD.getValue();
        }

        @Override // X.JY1
        public final List<Integer> l2() {
            return (List) this.LLFFF.getValue();
        }

        @Override // X.JY1
        public final String LLLLZIL() {
            InterfaceC65784Pro<String> interfaceC65784Pro;
            C49357JYr k4 = k4();
            if (k4 != null && (interfaceC65784Pro = k4.LJLIL) != null) {
                return interfaceC65784Pro.invoke();
            }
            return null;
        }

        @Override // X.JY1
        public final void n2(JYG jyg) {
            InterfaceC88472Yns<? super JYG, C76800UCe> interfaceC88472Yns;
            C49357JYr k4 = k4();
            if (k4 != null && (interfaceC88472Yns = k4.LJLJJL) != null) {
                interfaceC88472Yns.invoke(jyg);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(ConfigurableSearchCardFeedBackAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C65776Prg LIZIZ() {
        return C65352Pkq.LIZ(SearchCardLivePlayerAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C65776Prg LIZJ() {
        return C65352Pkq.LIZ(SearchFollowAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C65776Prg LIZLLL() {
        return C65352Pkq.LIZ(SearchCardLiveTagAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentService
    public final C65776Prg LJ() {
        return C65352Pkq.LIZ(SearchCardPlayerSoundIconAssem.class);
    }
}
