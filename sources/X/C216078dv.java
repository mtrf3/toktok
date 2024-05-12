package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216078dv extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C216078dv LJLIL = new C216078dv();

    public C216078dv() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends C195357lb> c43i) {
        C195357lb c195357lb;
        String str;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends C195357lb> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (c195357lb = (C195357lb) c43i2.LIZ) != null) {
            String str2 = c195357lb.LIZ;
            Aweme aweme = selectSubscribe.getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str)) {
                DanmakuViewModel r4 = selectSubscribe.r4();
                C215938dh c215938dh = new C215938dh(EnumC216188e6.PLAY_STOP, true, 0L, 0.0f, 24);
                r4.getClass();
                r4.setState(new AqS169S0100000_3(c215938dh, 841));
            }
        }
        return C76800UCe.LIZ;
    }
}
