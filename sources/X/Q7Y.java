package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q7Y extends Q7M<ShareContent<?, ?>, Q6O>.b {
    public final /* synthetic */ Q7O LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q7Y(Q7O this$0) {
        super(this$0);
        o.LJIIIZ(this$0, "this$0");
        this.LIZIZ = this$0;
    }

    @Override // X.Q7M.b
    public final Q6H LIZIZ(ShareContent shareContent) {
        Bundle LIZ;
        String LIZLLL;
        String jSONObject;
        List<String> unmodifiableList;
        this.LIZIZ.LJ(shareContent, Q7V.WEB);
        Q6H LIZIZ = this.LIZIZ.LIZIZ();
        C66474Q7a.LIZ(shareContent, C66474Q7a.LIZ);
        boolean z = shareContent instanceof ShareLinkContent;
        String str = null;
        if (z) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            LIZ = C66481Q7h.LIZ(shareLinkContent);
            C66373Q3d.LJJIII(shareLinkContent.contentUrl, LIZ, "href");
            C66373Q3d.LJJII("quote", shareLinkContent.quote, LIZ);
        } else if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            UUID callId = LIZIZ.LIZ();
            C66482Q7i c66482Q7i = new C66482Q7i();
            c66482Q7i.LIZ = sharePhotoContent.contentUrl;
            List<String> list = sharePhotoContent.peopleIds;
            if (list == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            c66482Q7i.LIZIZ = unmodifiableList;
            c66482Q7i.LIZJ = sharePhotoContent.placeId;
            c66482Q7i.LIZLLL = sharePhotoContent.pageId;
            c66482Q7i.LJ = sharePhotoContent.ref;
            c66482Q7i.LJFF = sharePhotoContent.shareHashtag;
            c66482Q7i.LIZ(sharePhotoContent.photos);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = sharePhotoContent.photos.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    SharePhoto sharePhoto = sharePhotoContent.photos.get(i);
                    Bitmap bitmap = sharePhoto.bitmap;
                    if (bitmap != null) {
                        o.LJIIIZ(callId, "callId");
                        C66379Q3j c66379Q3j = new C66379Q3j(bitmap, null, callId);
                        C66491Q7r c66491Q7r = new C66491Q7r();
                        c66491Q7r.LIZ(sharePhoto);
                        c66491Q7r.LIZLLL = android.net.Uri.parse(c66379Q3j.LIZLLL);
                        c66491Q7r.LIZJ = null;
                        sharePhoto = new SharePhoto(c66491Q7r);
                        arrayList2.add(c66379Q3j);
                    }
                    arrayList.add(sharePhoto);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            ((ArrayList) c66482Q7i.LJI).clear();
            c66482Q7i.LIZ(arrayList);
            C66378Q3i.LIZ(arrayList2);
            SharePhotoContent sharePhotoContent2 = new SharePhotoContent(c66482Q7i);
            LIZ = C66481Q7h.LIZ(sharePhotoContent2);
            List list2 = sharePhotoContent2.photos;
            if (list2 == null) {
                list2 = C61878OQg.INSTANCE;
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(String.valueOf(((SharePhoto) it.next()).imageUrl));
            }
            Object[] array = arrayList3.toArray(new String[0]);
            if (array != null) {
                LIZ.putStringArray("media", (String[]) array);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            if (!(shareContent instanceof ShareOpenGraphContent)) {
                return null;
            }
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            LIZ = C66481Q7h.LIZ(shareOpenGraphContent);
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.action;
            if (shareOpenGraphAction == null) {
                LIZLLL = null;
            } else {
                LIZLLL = shareOpenGraphAction.LIZLLL();
            }
            C66373Q3d.LJJII("action_type", LIZLLL, LIZ);
            try {
                JSONObject LJIIIIZZ = Q6F.LJIIIIZZ(Q6P.LIZ(shareOpenGraphContent.action, new Q89()), false);
                if (LJIIIIZZ == null) {
                    jSONObject = null;
                } else {
                    jSONObject = LJIIIIZZ.toString();
                }
                C66373Q3d.LJJII("action_properties", jSONObject, LIZ);
            } catch (JSONException e) {
                throw new Q4W("Unable to serialize the ShareOpenGraphContent to JSON", e);
            }
        }
        if (z || (shareContent instanceof SharePhotoContent)) {
            str = "share";
        } else if (shareContent instanceof ShareOpenGraphContent) {
            str = "share_open_graph";
        }
        Q5D.LJ(LIZIZ, str, LIZ);
        return LIZIZ;
    }

    @Override // X.Q7M.b
    public final boolean LIZ(ShareContent shareContent, boolean z) {
        Class<?> cls = shareContent.getClass();
        if (!ShareLinkContent.class.isAssignableFrom(cls) && !ShareOpenGraphContent.class.isAssignableFrom(cls)) {
            if (!SharePhotoContent.class.isAssignableFrom(cls)) {
                return false;
            }
            AccessToken.Companion.getClass();
            if (!C66382Q3m.LIZJ()) {
                return false;
            }
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                Q6P.LIZ(((ShareOpenGraphContent) shareContent).action, new Q89());
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
