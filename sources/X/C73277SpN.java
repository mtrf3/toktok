package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [VH] */
/* renamed from: X.SpN, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73277SpN<VH> extends AbstractC65781Prl implements InterfaceC88472Yns<ViewGroup, VH> {
    public static final C73277SpN LJLIL = new C73277SpN();

    public C73277SpN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(ViewGroup viewGroup) {
        final ViewGroup parent = viewGroup;
        o.LJIIIZ(parent, "parent");
        return new C73365Sqn<Object>(parent) { // from class: X.9YJ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(new View(parent.getContext()));
                o.LJIIIZ(parent, "parent");
            }
        };
    }
}
