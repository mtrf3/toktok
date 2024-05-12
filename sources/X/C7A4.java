package X;

import com.ss.android.ugc.aweme.nows.interaction.assem.NowCommentAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7A4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7A4 extends AbstractC65781Prl implements InterfaceC88471Ynr<NowCommentAssem, Long, C76800UCe> {
    public static final C7A4 LJLIL = new C7A4();

    public C7A4() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowCommentAssem nowCommentAssem, Long l) {
        NowCommentAssem selectSubscribe = nowCommentAssem;
        long longValue = l.longValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.q4(longValue);
        return C76800UCe.LIZ;
    }
}
