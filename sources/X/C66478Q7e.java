package X;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideoContent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Q7e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66478Q7e extends C66475Q7b {
    @Override // X.C66475Q7b
    public final void LIZ(ShareLinkContent shareLinkContent) {
        if (C66373Q3d.LJIJJ(shareLinkContent.quote)) {
        } else {
            throw new Q4W("Cannot share link content with quote using the share api");
        }
    }

    @Override // X.C66475Q7b
    public final void LIZJ(ShareMediaContent shareMediaContent) {
        throw new Q4W("Cannot share ShareMediaContent using the share api");
    }

    @Override // X.C66475Q7b
    public final void LJ(SharePhoto photo) {
        o.LJIIIZ(photo, "photo");
        C66474Q7a.LIZJ(photo, this);
    }

    @Override // X.C66475Q7b
    public final void LJII(ShareVideoContent shareVideoContent) {
        if (C66373Q3d.LJIJJ(shareVideoContent.placeId)) {
            List<String> list = shareVideoContent.peopleIds;
            if (list == null || list.isEmpty()) {
                if (C66373Q3d.LJIJJ(shareVideoContent.ref)) {
                    return;
                } else {
                    throw new Q4W("Cannot share video content with referrer URL using the share api");
                }
            }
            throw new Q4W("Cannot share video content with people IDs using the share api");
        }
        throw new Q4W("Cannot share video content with place IDs using the share api");
    }
}
