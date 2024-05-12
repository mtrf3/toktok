package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8e0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216128e0 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends OSZ<? extends String, ? extends Float>>, C76800UCe> {
    public static final C216128e0 LJLIL = new C216128e0();

    public C216128e0() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends OSZ<? extends String, ? extends Float>> c43i) {
        OSZ osz;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends OSZ<? extends String, ? extends Float>> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (osz = (OSZ) c43i2.LIZ) != null) {
            DanmakuViewModel r4 = selectSubscribe.r4();
            EnumC216188e6 enumC216188e6 = EnumC216188e6.SPEED_CHANGE;
            osz.getFirst();
            C215938dh c215938dh = new C215938dh(enumC216188e6, false, 0L, ((Number) osz.getSecond()).floatValue(), 12);
            r4.getClass();
            r4.setState(new AqS169S0100000_3(c215938dh, 841));
        }
        return C76800UCe.LIZ;
    }
}
