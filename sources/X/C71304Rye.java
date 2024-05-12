package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Rye, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71304Rye extends AbstractC65781Prl implements InterfaceC88471Ynr<ViewGroup, InterfaceC65784Pro<? extends C76800UCe>, InterfaceC73206SoE> {
    public static final C71304Rye INSTANCE = new C71304Rye();

    public C71304Rye() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final InterfaceC73206SoE invoke2(ViewGroup parent, InterfaceC65784Pro<C76800UCe> onErrorRetry) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(onErrorRetry, "onErrorRetry");
        return new C71305Ryf(C1FL.LIZIZ(parent, R.layout.an9, parent, false, "from(parent.context).inf…ading_row, parent, false)"));
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ InterfaceC73206SoE invoke(ViewGroup viewGroup, InterfaceC65784Pro<? extends C76800UCe> interfaceC65784Pro) {
        return invoke2(viewGroup, (InterfaceC65784Pro<C76800UCe>) interfaceC65784Pro);
    }
}
