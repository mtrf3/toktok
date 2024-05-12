package com.ss.android.ugc.aweme;

import X.AbstractC241239dP;
import X.AnonymousClass925;
import X.C221108m2;
import X.C2S6;
import X.C3C8;
import X.C52623Kl1;
import X.C53277KvZ;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C74238TBq;
import X.C78605Ut7;
import X.C86718Y1q;
import X.C8XO;
import X.InterfaceC115514g7;
import X.InterfaceC55235Lm3;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.Y01;
import X.Y2S;
import android.content.Context;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ability.IDubbingAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.service.ITranslationKevaService;
import com.ss.android.ugc.aweme.translation.service.TranslationKevaServiceImpl;
import com.ss.android.ugc.aweme.ui.DubbingStatusAssem;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class DubbingServiceImpl implements IDubbingService {
    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZJ() {
        return C65352Pkq.LIZ(DubbingStatusAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final boolean LIZ() {
        return C53277KvZ.LIZ.getBoolean("dubbing_default_state_on", true);
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (C78605Ut7.LJIJ(aweme, Y01.LIZIZ.LJJIIZI()) && !C53277KvZ.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final <T extends ReusedUISlotAssem<T> & C3C8 & C8XO<X>, X> InterfaceC115514g7<Object, AssemViewModel<Y2S>> LJ(T assem, AbstractC241239dP scope) {
        o.LJIIIZ(assem, "assem");
        o.LJIIIZ(scope, "scope");
        return new C74238TBq(assem, scope);
    }

    @Override // com.ss.android.ugc.aweme.IDubbingService
    public final boolean LIZLLL(InterfaceC65784Pro<Boolean> interfaceC65784Pro, InterfaceC65784Pro<Boolean> interfaceC65784Pro2, InterfaceC55235Lm3 vScope, Aweme aweme, Context context) {
        o.LJIIIZ(vScope, "vScope");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(context, "context");
        if (((Number) C52623Kl1.LIZ.getValue()).intValue() != 0) {
            if (!(!AnonymousClass925.LIZ()) && !interfaceC65784Pro.invoke().booleanValue() && C86718Y1q.LIZIZ.LIZ()) {
                ITranslationKevaService LJIIL = TranslationKevaServiceImpl.LJIIL();
                C2S6.LIZ(context).getPageType();
                if (LJIIL.LIZJ(aweme) || interfaceC65784Pro2.invoke().booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        TranslationAbility translationAbility = (TranslationAbility) C55096Ljo.LIZ(vScope, TranslationAbility.class, null);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0200000_15((IDubbingAbility) C55096Ljo.LIZ(vScope, IDubbingAbility.class, null), translationAbility, 5));
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(new AqS165S0100000_15(translationAbility, 46));
        ITranslationKevaService LJIIL2 = TranslationKevaServiceImpl.LJIIL();
        C2S6.LIZ(context).getPageType();
        if ((LJIIL2.LIZJ(aweme) || ((Boolean) LIZIZ.getValue()).booleanValue()) && C86718Y1q.LIZIZ.LIZ() && ((Boolean) LIZIZ2.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }
}
