package X;

import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216178e5 extends AbstractC65781Prl implements InterfaceC88471Ynr<DanmakuPresentAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C216178e5 LJLIL = new C216178e5();

    public C216178e5() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(DanmakuPresentAssem danmakuPresentAssem, C43I<? extends Integer> c43i) {
        Aweme aweme;
        DanmakuPresentAssem selectSubscribe = danmakuPresentAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        VideoItemParams gv0 = selectSubscribe.r4().gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        selectSubscribe.LLIIJI(c62623Ohv.LJIIIZ(aweme));
        return C76800UCe.LIZ;
    }
}
