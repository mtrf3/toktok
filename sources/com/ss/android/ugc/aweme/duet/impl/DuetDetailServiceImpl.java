package com.ss.android.ugc.aweme.duet.impl;

import X.AbstractC50421Jqb;
import X.AbstractC51036K1g;
import X.C51031K1b;
import X.C7D7;
import X.C8BQ;
import com.ss.android.ugc.aweme.tools.detail.IDuetDetailService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DuetDetailServiceImpl implements IDuetDetailService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.8BQ] */
    @Override // com.ss.android.ugc.aweme.tools.detail.IDuetDetailService
    public final C8BQ LIZ(AbstractC51036K1g abstractC51036K1g) {
        return new AbstractC50421Jqb<C7D7, C51031K1b<C7D7>>(abstractC51036K1g) { // from class: X.8BQ
            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final int getPageType(int i) {
                return i + 17000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.K1b, PRESENTER extends X.K1b<MODEL>] */
            {
                this.mModel = (!(abstractC51036K1g instanceof C7D7) || abstractC51036K1g == null) ? new C7D7() : abstractC51036K1g;
                this.mPresenter = new C51031K1b();
            }

            @Override // X.AbstractC50421Jqb, X.InterfaceC51679KPz
            public final void request(int i, M89 feedParam, int i2, boolean z) {
                o.LJIIIZ(feedParam, "feedParam");
                this.mPresenter.LJIILL(Integer.valueOf(i), feedParam.getDuetId(), Integer.valueOf(feedParam.getVideoType()));
            }
        };
    }
}
