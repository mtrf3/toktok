package X;

import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Q7c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66476Q7c {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZIZ(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        C66373Q3d.LJJIII(shareContent.contentUrl, bundle, "com.facebook.platform.extra.LINK");
        C66373Q3d.LJJII("com.facebook.platform.extra.PLACE", shareContent.placeId, bundle);
        C66373Q3d.LJJII("com.facebook.platform.extra.REF", shareContent.ref, bundle);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.peopleIds;
        if (list != null && !list.isEmpty()) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(list));
        }
        return bundle;
    }

    public static final Bundle LIZ(UUID callId, ShareContent<?, ?> shareContent, boolean z) {
        o.LJIIIZ(callId, "callId");
        o.LJIIIZ(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return LIZIZ(shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            Collection LIZJ = Q6F.LIZJ(sharePhotoContent, callId);
            if (LIZJ == null) {
                LIZJ = C61878OQg.INSTANCE;
            }
            Bundle LIZIZ = LIZIZ(sharePhotoContent, z);
            LIZIZ.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(LIZJ));
            return LIZIZ;
        }
        String str = null;
        if ((shareContent instanceof ShareVideoContent) || !(shareContent instanceof ShareOpenGraphContent)) {
            return null;
        }
        try {
            JSONObject LJIIIZ = Q6F.LJIIIZ(callId, (ShareOpenGraphContent) shareContent);
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            Bundle LIZIZ2 = LIZIZ(shareOpenGraphContent, z);
            C66373Q3d.LJJII("com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", shareOpenGraphContent.previewPropertyName, LIZIZ2);
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.action;
            if (shareOpenGraphAction != null) {
                str = shareOpenGraphAction.LIZLLL();
            }
            C66373Q3d.LJJII("com.facebook.platform.extra.ACTION_TYPE", str, LIZIZ2);
            C66373Q3d.LJJII("com.facebook.platform.extra.ACTION", String.valueOf(LJIIIZ), LIZIZ2);
            return LIZIZ2;
        } catch (JSONException e) {
            throw new Q4W(o.LJIILLIIL(e.getMessage(), "Unable to create a JSON Object from the provided ShareOpenGraphContent: "));
        }
    }
}
