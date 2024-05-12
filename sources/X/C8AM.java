package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.8AM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8AM extends AbstractC65781Prl implements InterfaceC88472Yns<Throwable, C76800UCe> {
    public static final C8AM LJLIL = new C8AM();

    public C8AM() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("success", CardStruct.IStatusCode.DEFAULT);
        FMX.LJIIL("explore_loadmore_finish", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
