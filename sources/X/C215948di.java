package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8di, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215948di extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends String>, C76800UCe> {
    public static final C215948di LJLIL = new C215948di();

    public C215948di() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends String> c43i) {
        long j;
        Aweme aweme;
        Video video;
        String str;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        C43I<? extends String> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ != 0) {
            DanmakuViewModel r4 = selectSubscribe.r4();
            EnumC216188e6 enumC216188e6 = EnumC216188e6.START;
            InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
            if (LJJLIIIIJ != null) {
                j = LJJLIIIIJ.getCurrentPosition();
            } else {
                j = 0;
            }
            C215938dh c215938dh = new C215938dh(enumC216188e6, true, j, 0.0f, 16);
            r4.getClass();
            r4.setState(new AqS169S0100000_3(c215938dh, 841));
            if (!C215608dA.LIZIZ && (aweme = selectSubscribe.getAweme()) != null && (video = aweme.getVideo()) != null && video.getVideoLength() >= 10000) {
                Aweme aweme2 = selectSubscribe.getAweme();
                if (aweme2 != null) {
                    str = aweme2.getAuthorUid();
                } else {
                    str = null;
                }
                if (!o.LJ(str, C214838bv.LIZ().LJFF().getCurUserId())) {
                    selectSubscribe.LLIILZL.postDelayed(selectSubscribe.LLIL, 3000L);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
