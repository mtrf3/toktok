package X;

import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareStoryContent;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q7U extends Q7M<ShareContent<?, ?>, Q6O>.b {
    public final /* synthetic */ Q7O LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7U(Q7O this$0) {
        super(this$0);
        o.LJIIIZ(this$0, "this$0");
        this.LIZIZ = this$0;
    }

    @Override // X.Q7M.b
    public final Q6H LIZIZ(ShareContent shareContent) {
        C66474Q7a.LIZ(shareContent, C66474Q7a.LIZJ);
        Q6H LIZIZ = this.LIZIZ.LIZIZ();
        this.LIZIZ.getClass();
        InterfaceC66439Q5r LIZ = Q7P.LIZ(shareContent.getClass());
        if (LIZ == null) {
            return null;
        }
        Q5D.LIZJ(LIZIZ, new C66480Q7g(LIZIZ, shareContent), LIZ);
        return LIZIZ;
    }

    @Override // X.Q7M.b
    public final boolean LIZ(ShareContent shareContent, boolean z) {
        InterfaceC66439Q5r LIZ;
        if (!(shareContent instanceof ShareStoryContent) || (LIZ = Q7P.LIZ(shareContent.getClass())) == null || !Q5D.LIZ(LIZ)) {
            return false;
        }
        return true;
    }
}
