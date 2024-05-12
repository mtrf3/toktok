package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C58096Mr6;
import X.C65352Pkq;
import X.C65776Prg;
import X.JMH;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService;

/* loaded from: classes9.dex */
public final class SearchSingleCardTemplateServiceImpl implements SearchSingleCardTemplateService {
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService
    public final C65776Prg LIZ() {
        return C65352Pkq.LIZ(SearchBuiltInBottomAssem.class);
    }

    public static SearchSingleCardTemplateService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(SearchSingleCardTemplateService.class, false);
        if (LIZ != null) {
            return (SearchSingleCardTemplateService) LIZ;
        }
        if (C58096Mr6.D4 == null) {
            synchronized (SearchSingleCardTemplateService.class) {
                if (C58096Mr6.D4 == null) {
                    C58096Mr6.D4 = new SearchSingleCardTemplateServiceImpl();
                }
            }
        }
        return C58096Mr6.D4;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.utils.SearchSingleCardTemplateService
    public final SearchSingleCardTemplateAssem LIZIZ(JMH jmh) {
        return new SearchSingleCardTemplateAssem(jmh);
    }
}
