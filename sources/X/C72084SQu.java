package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.SQu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72084SQu extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, C73296Spg> {
    public static final C72084SQu LJLIL = new C72084SQu();

    public C72084SQu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C73296Spg invoke(ViewGroup viewGroup) {
        ViewGroup parent = viewGroup;
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        return new C73296Spg(context, null);
    }
}
