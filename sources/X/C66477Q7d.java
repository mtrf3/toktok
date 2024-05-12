package X;

import android.os.Bundle;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import kotlin.jvm.internal.o;

/* renamed from: X.Q7d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66477Q7d extends Q7M<ShareContent<?, ?>, Q6O>.b {
    public final /* synthetic */ Q7O LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66477Q7d(Q7O this$0) {
        super(this$0);
        o.LJIIIZ(this$0, "this$0");
        this.LIZIZ = this$0;
    }

    @Override // X.Q7M.b
    public final Q6H LIZIZ(ShareContent shareContent) {
        Bundle bundle;
        String uri;
        this.LIZIZ.LJ(shareContent, Q7V.FEED);
        Q6H LIZIZ = this.LIZIZ.LIZIZ();
        String str = null;
        if (shareContent instanceof ShareLinkContent) {
            C66474Q7a.LIZ(shareContent, C66474Q7a.LIZ);
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            bundle = new Bundle();
            android.net.Uri uri2 = shareLinkContent.contentUrl;
            if (uri2 == null) {
                uri = null;
            } else {
                uri = uri2.toString();
            }
            C66373Q3d.LJJII("link", uri, bundle);
            C66373Q3d.LJJII("quote", shareLinkContent.quote, bundle);
            ShareHashtag shareHashtag = shareLinkContent.shareHashtag;
            if (shareHashtag != null) {
                str = shareHashtag.hashtag;
            }
            C66373Q3d.LJJII("hashtag", str, bundle);
        } else {
            if (!(shareContent instanceof ShareFeedContent)) {
                return null;
            }
            ShareFeedContent shareFeedContent = (ShareFeedContent) shareContent;
            bundle = new Bundle();
            C66373Q3d.LJJII("to", shareFeedContent.toId, bundle);
            C66373Q3d.LJJII("link", shareFeedContent.link, bundle);
            C66373Q3d.LJJII("picture", shareFeedContent.picture, bundle);
            C66373Q3d.LJJII("source", shareFeedContent.mediaSource, bundle);
            C66373Q3d.LJJII("name", shareFeedContent.linkName, bundle);
            C66373Q3d.LJJII("caption", shareFeedContent.linkCaption, bundle);
            C66373Q3d.LJJII("description", shareFeedContent.linkDescription, bundle);
        }
        Q5D.LJ(LIZIZ, "feed", bundle);
        return LIZIZ;
    }

    @Override // X.Q7M.b
    public final boolean LIZ(ShareContent shareContent, boolean z) {
        if ((shareContent instanceof ShareLinkContent) || (shareContent instanceof ShareFeedContent)) {
            return true;
        }
        return false;
    }
}
