package X;

import kotlin.jvm.internal.o;

/* renamed from: X.OpL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63083OpL extends AbstractC65781Prl implements InterfaceC88472Yns<F4V, Boolean> {
    public static final C63083OpL INSTANCE = new C63083OpL();

    public C63083OpL() {
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
