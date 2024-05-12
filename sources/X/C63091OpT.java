package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OpT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63091OpT extends AbstractC65781Prl implements InterfaceC88472Yns<F4V, Boolean> {
    public static final C63091OpT INSTANCE = new C63091OpT();

    public C63091OpT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Boolean invoke(F4V f4v) {
        return Boolean.valueOf(invoke2(f4v));
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final boolean invoke2(F4V it) {
        o.LJIIIZ(it, "it");
        return it instanceof C46216IBw;
    }
}
