package X;

import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gly, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42490Gly extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC42491Glz, CommerceToolsModel> {
    public static final C42490Gly LJLIL = new C42490Gly();

    public C42490Gly() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CommerceToolsModel invoke(InterfaceC42491Glz interfaceC42491Glz) {
        InterfaceC42491Glz inject = interfaceC42491Glz;
        o.LJIIIZ(inject, "$this$inject");
        return inject.LIZLLL().creativeModel.commerceModel;
    }
}
