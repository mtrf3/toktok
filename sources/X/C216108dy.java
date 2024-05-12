package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216108dy extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, Double, C76800UCe> {
    public static final C216108dy LJLIL = new C216108dy();

    public C216108dy() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, Double d) {
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        Double d2 = d;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (d2 != null) {
            d2.doubleValue();
            DanmakuViewModel r4 = selectSubscribe.r4();
            EnumC216188e6 enumC216188e6 = EnumC216188e6.PLAY_PROGRESS_UPDATE;
            Aweme aweme = selectSubscribe.getAweme();
            if (aweme != null) {
                aweme.getAid();
            }
            C215938dh c215938dh = new C215938dh(enumC216188e6, false, (long) (d2.doubleValue() * 1000), 0.0f, 20);
            r4.getClass();
            r4.setState(new AqS169S0100000_3(c215938dh, 841));
        }
        return C76800UCe.LIZ;
    }
}
