package X;

import com.ss.android.ugc.aweme.commerce.tools.common.record.CommerceToolsRecordApiComponent;
import com.ss.android.ugc.aweme.commerce.tools.common.record.ICommerceToolsRecordApiComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.HqI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45306HqI extends AbstractC29891Fh<ICommerceToolsRecordApiComponent> implements InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final ICommerceToolsRecordApiComponent LJLILLLLZI;

    @Override // X.AbstractC29891Fh
    public final void onDestroy() {
        super.onDestroy();
        this.LJLILLLLZI.mm0();
    }

    @Override // X.AbstractC29891Fh
    public final /* bridge */ /* synthetic */ ICommerceToolsRecordApiComponent getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45306HqI(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        ICommerceToolsRecordApiComponent LIZIZ = CommerceToolsRecordApiComponent.LIZIZ(false);
        o.LJIIIIZZ(LIZIZ, "get().getService(ICommer…ApiComponent::class.java)");
        this.LJLILLLLZI = LIZIZ;
    }
}
