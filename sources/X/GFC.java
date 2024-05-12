package X;

import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GFC extends AbstractC65781Prl implements InterfaceC88472Yns<GF3, CommerceToolsModel> {
    public static final GFC LJLIL = new GFC();

    public GFC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CommerceToolsModel invoke(GF3 gf3) {
        GF3 inject = gf3;
        o.LJIIIZ(inject, "$this$inject");
        return inject.LIZLLL().creativeModel.commerceModel;
    }
}
