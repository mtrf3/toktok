package com.ss.android.ugc.aweme.compliance.consent.serviceimpl;

import X.AbstractC37594EpC;
import X.C16880lQ;
import X.C47261Igj;
import X.C65352Pkq;
import X.C85830XmM;
import X.InterfaceC65350Pko;
import X.NDJ;
import android.app.Activity;
import android.content.Intent;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService;
import com.ss.android.ugc.aweme.compliance.consent.countrylist.MusCountryListActivity;
import com.ss.android.ugc.aweme.compliance.consent.termsconditions.component.TermsConditionsAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ConsentServiceImpl implements IConsentService {
    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final InterfaceC65350Pko<? extends UISlotAssem> LIZIZ() {
        return C65352Pkq.LIZ(TermsConditionsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJ(NDJ.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService
    public final void LIZ(Activity activity, C85830XmM c85830XmM) {
        o.LJIIIZ(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) MusCountryListActivity.class);
        intent.addFlags(131072);
        MusCountryListActivity.LJLL = c85830XmM;
        C16880lQ.LIZIZ(activity, intent);
    }
}
