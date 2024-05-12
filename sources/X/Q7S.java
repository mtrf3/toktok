package X;

import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareStoryContent;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q7S extends Q7M<ShareContent<?, ?>, Q6O>.b {
    public final /* synthetic */ Q7O LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7S(Q7O this$0) {
        super(this$0);
        o.LJIIIZ(this$0, "this$0");
        this.LIZIZ = this$0;
    }

    @Override // X.Q7M.b
    public final Q6H LIZIZ(ShareContent shareContent) {
        this.LIZIZ.LJ(shareContent, Q7V.NATIVE);
        C66474Q7a.LIZ(shareContent, C66474Q7a.LIZIZ);
        Q6H LIZIZ = this.LIZIZ.LIZIZ();
        this.LIZIZ.getClass();
        InterfaceC66439Q5r LIZ = Q7P.LIZ(shareContent.getClass());
        if (LIZ == null) {
            return null;
        }
        Q5D.LIZJ(LIZIZ, new Q7X(LIZIZ, shareContent), LIZ);
        return LIZIZ;
    }

    @Override // X.Q7M.b
    public final boolean LIZ(ShareContent shareContent, boolean z) {
        boolean z2;
        String str;
        if ((shareContent instanceof ShareCameraEffectContent) || (shareContent instanceof ShareStoryContent)) {
            return false;
        }
        if (!z) {
            if (shareContent.shareHashtag != null) {
                z2 = Q5D.LIZ(Q7Q.HASHTAG);
            } else {
                z2 = true;
            }
            if (!(shareContent instanceof ShareLinkContent) || (str = ((ShareLinkContent) shareContent).quote) == null || str.length() == 0) {
                if (!z2) {
                    return false;
                }
            } else if (!z2 || !Q5D.LIZ(Q7Q.LINK_SHARE_QUOTES)) {
                return false;
            }
        }
        InterfaceC66439Q5r LIZ = Q7P.LIZ(shareContent.getClass());
        if (LIZ == null || !Q5D.LIZ(LIZ)) {
            return false;
        }
        return true;
    }
}
