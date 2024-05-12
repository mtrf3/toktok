package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarAssemWrap;
import kotlin.jvm.internal.o;

/* renamed from: X.873, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass873 extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarAssemWrap, C202067wQ, C76800UCe> {
    public static final AnonymousClass873 LJLIL = new AnonymousClass873();

    public AnonymousClass873() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarAssemWrap feedAvatarAssemWrap, C202067wQ c202067wQ) {
        FeedAvatarAssemWrap selectSubscribe = feedAvatarAssemWrap;
        C202067wQ it = c202067wQ;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        AnonymousClass872 anonymousClass872 = selectSubscribe.LLI;
        if (anonymousClass872 != null) {
            anonymousClass872.LIZJ(it);
        }
        return C76800UCe.LIZ;
    }
}
