package X;

import Y.ACallableS5S1000000_6;
import com.ss.android.ugc.aweme.qrcode.model.RiskUrl;

/* renamed from: X.Mi9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57541Mi9 extends AbstractC57537Mi5<RiskUrl> {
    public final void LIZ(String str) {
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS5S1000000_6(str, 5), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC57537Mi5
    public final void handleData(RiskUrl riskUrl) {
        super.handleData(riskUrl);
        this.mData = riskUrl;
    }
}
