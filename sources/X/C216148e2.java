package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216148e2 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends String>, C76800UCe> {
    public static final C216148e2 LJLIL = new C216148e2();

    public C216148e2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends String> c43i) {
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ != 0) {
            DanmakuViewModel r4 = selectSubscribe.r4();
            C215938dh c215938dh = new C215938dh(EnumC216188e6.PLAY_COMPLETE, false, 0L, 0.0f, 24);
            r4.getClass();
            r4.setState(new AqS169S0100000_3(c215938dh, 841));
        }
        return C76800UCe.LIZ;
    }
}
