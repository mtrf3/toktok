package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YMY extends AbstractC65781Prl implements InterfaceC88472Yns<YN9, C76800UCe> {
    public static final YMY LJLIL = new YMY();

    public YMY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(YN9 yn9) {
        YN9 setConfig = yn9;
        o.LJIIIZ(setConfig, "$this$setConfig");
        YMZ init = YMZ.LJLIL;
        o.LJIIIZ(init, "init");
        init.invoke(setConfig.LIZ);
        C87263YMp handle = C87263YMp.LJLIL;
        o.LJIIIZ(handle, "handle");
        setConfig.LIZLLL = handle;
        return C76800UCe.LIZ;
    }
}
