package X;

import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GGJ extends AbstractC65781Prl implements InterfaceC88472Yns<GGH, CommerceToolsTcmModel> {
    public static final GGJ LJLIL = new GGJ();

    public GGJ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CommerceToolsTcmModel invoke(GGH ggh) {
        GGH inject = ggh;
        o.LJIIIZ(inject, "$this$inject");
        return inject.LIZLLL().creativeModel.commerceModel.getTcmModel();
    }
}
