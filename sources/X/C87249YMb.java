package X;

import kotlin.jvm.internal.o;

/* renamed from: X.YMb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87249YMb extends AbstractC65781Prl implements InterfaceC88472Yns<YN9, C76800UCe> {
    public static final C87249YMb LJLIL = new C87249YMb();

    public C87249YMb() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(YN9 yn9) {
        YN9 setConfig = yn9;
        o.LJIIIZ(setConfig, "$this$setConfig");
        C87248YMa init = C87248YMa.LJLIL;
        o.LJIIIZ(init, "init");
        init.invoke(setConfig.LIZ);
        YN6 handle = YN6.LJLIL;
        o.LJIIIZ(handle, "handle");
        setConfig.LIZLLL = handle;
        return C76800UCe.LIZ;
    }
}
