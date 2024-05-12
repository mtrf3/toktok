package X;

import android.graphics.Bitmap;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.Q7a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66474Q7a {
    public static final C66479Q7f LIZ = new C66479Q7f();
    public static final C66475Q7b LIZIZ = new C66475Q7b();
    public static final C66484Q7k LIZJ;

    static {
        new C66478Q7e();
        LIZJ = new C66484Q7k();
    }

    public static void LIZ(ShareContent shareContent, C66475Q7b c66475Q7b) {
        if (shareContent instanceof ShareLinkContent) {
            c66475Q7b.LIZ((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            c66475Q7b.getClass();
            List<SharePhoto> list = ((SharePhotoContent) shareContent).photos;
            if (list != null && !list.isEmpty()) {
                if (list.size() <= 6) {
                    Iterator<SharePhoto> it = list.iterator();
                    while (it.hasNext()) {
                        c66475Q7b.LJ(it.next());
                    }
                    return;
                }
                throw new Q4W(C63144OqK.LIZIZ(new Object[]{6}, 1, Locale.ROOT, "Cannot add more than %d photos.", "java.lang.String.format(locale, format, *args)"));
            }
            throw new Q4W("Must specify at least one Photo in SharePhotoContent.");
        }
        if (shareContent instanceof ShareVideoContent) {
            c66475Q7b.LJII((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
            c66475Q7b.getClass();
            c66475Q7b.LIZ = true;
            ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.action;
            if (shareOpenGraphAction != null) {
                if (!C66373Q3d.LJIJJ(shareOpenGraphAction.LIZLLL())) {
                    c66475Q7b.LIZLLL(shareOpenGraphAction, false);
                    String str = shareOpenGraphContent.previewPropertyName;
                    if (!C66373Q3d.LJIJJ(str)) {
                        ShareOpenGraphAction shareOpenGraphAction2 = shareOpenGraphContent.action;
                        if (shareOpenGraphAction2 != null && shareOpenGraphAction2.LIZ(str) != null) {
                            return;
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Property \"");
                        LIZ2.append((Object) str);
                        LIZ2.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
                        throw new Q4W(X1D.LIZIZ(LIZ2));
                    }
                    throw new Q4W("Must specify a previewPropertyName.");
                }
                throw new Q4W("ShareOpenGraphAction must have a non-empty actionType");
            }
            throw new Q4W("Must specify a non-null ShareOpenGraphAction");
        }
        if (shareContent instanceof ShareMediaContent) {
            c66475Q7b.LIZJ((ShareMediaContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            c66475Q7b.getClass();
            if (!C66373Q3d.LJIJJ(((ShareCameraEffectContent) shareContent).effectId)) {
            } else {
                throw new Q4W("Must specify a non-empty effectId");
            }
        } else {
            if (!(shareContent instanceof ShareStoryContent)) {
                return;
            }
            c66475Q7b.LJFF((ShareStoryContent) shareContent);
        }
    }

    public static void LIZIZ(Object obj, C66475Q7b c66475Q7b) {
        if (obj instanceof ShareOpenGraphObject) {
            ShareOpenGraphValueContainer<?, ?> shareOpenGraphValueContainer = (ShareOpenGraphValueContainer) obj;
            c66475Q7b.getClass();
            if (shareOpenGraphValueContainer != null) {
                c66475Q7b.LIZLLL(shareOpenGraphValueContainer, true);
                return;
            }
            throw new Q4W("Cannot share a null ShareOpenGraphObject");
        }
        if (!(obj instanceof SharePhoto)) {
            return;
        }
        c66475Q7b.LJ((SharePhoto) obj);
    }

    public static void LIZJ(SharePhoto sharePhoto, C66475Q7b c66475Q7b) {
        if (sharePhoto != null) {
            Bitmap bitmap = sharePhoto.bitmap;
            android.net.Uri uri = sharePhoto.imageUrl;
            if (bitmap == null) {
                if (uri != null) {
                    if (!C66373Q3d.LJIJJLI(uri) || c66475Q7b.LIZ) {
                        return;
                    } else {
                        throw new Q4W("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
                    }
                }
                throw new Q4W("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new Q4W("Cannot share a null SharePhoto");
    }

    public static void LIZLLL(ShareStoryContent shareStoryContent, C66475Q7b c66475Q7b) {
        ShareMedia<?, ?> shareMedia = shareStoryContent.backgroundAsset;
        if (shareMedia == null) {
            if (shareStoryContent.stickerAsset == null) {
                throw new Q4W("Must pass the Facebook app a background asset, a sticker asset, or both");
            }
        } else {
            c66475Q7b.LIZIZ(shareMedia);
        }
        SharePhoto sharePhoto = shareStoryContent.stickerAsset;
        if (sharePhoto != null) {
            c66475Q7b.LJ(sharePhoto);
        }
    }
}
