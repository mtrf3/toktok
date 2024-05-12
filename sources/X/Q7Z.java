package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class Q7Z {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZIZ(ShareContent shareContent, boolean z) {
        String str;
        Bundle bundle = new Bundle();
        C66373Q3d.LJJIII(shareContent.contentUrl, bundle, "LINK");
        C66373Q3d.LJJII("PLACE", shareContent.placeId, bundle);
        C66373Q3d.LJJII("PAGE", shareContent.pageId, bundle);
        C66373Q3d.LJJII("REF", shareContent.ref, bundle);
        C66373Q3d.LJJII("REF", shareContent.ref, bundle);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.peopleIds;
        if (list != null && !list.isEmpty()) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(list));
        }
        ShareHashtag shareHashtag = shareContent.shareHashtag;
        if (shareHashtag == null) {
            str = null;
        } else {
            str = shareHashtag.hashtag;
        }
        C66373Q3d.LJJII("HASHTAG", str, bundle);
        return bundle;
    }

    public static final Bundle LIZ(UUID callId, ShareContent<?, ?> shareContent, boolean z) {
        String str;
        C66379Q3j LIZ2;
        Bundle bundle;
        java.util.Set<String> keySet;
        Object LLJJIII;
        android.net.Uri uri;
        Object LLJJIII2;
        Bitmap bitmap;
        C66379Q3j c66379Q3j;
        Bundle bundle2;
        android.net.Uri uri2;
        o.LJIIIZ(callId, "callId");
        o.LJIIIZ(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            Bundle LIZIZ = LIZIZ(shareLinkContent, z);
            C66373Q3d.LJJII("QUOTE", shareLinkContent.quote, LIZIZ);
            C66373Q3d.LJJIII(shareLinkContent.contentUrl, LIZIZ, "MESSENGER_LINK");
            C66373Q3d.LJJIII(shareLinkContent.contentUrl, LIZIZ, "TARGET_DISPLAY");
            return LIZIZ;
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            Collection LIZJ = Q6F.LIZJ(sharePhotoContent, callId);
            if (LIZJ == null) {
                LIZJ = C61878OQg.INSTANCE;
            }
            Bundle LIZIZ2 = LIZIZ(sharePhotoContent, z);
            LIZIZ2.putStringArrayList("PHOTOS", new ArrayList<>(LIZJ));
            return LIZIZ2;
        }
        String str2 = null;
        String str3 = null;
        Collection collection = null;
        Bundle bundle3 = null;
        r4 = null;
        Bundle bundle4 = null;
        if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            ShareVideo shareVideo = shareVideoContent.video;
            if (shareVideo == null) {
                uri2 = null;
            } else {
                uri2 = shareVideo.localUrl;
            }
            if (uri2 != null) {
                C66379Q3j c66379Q3j2 = new C66379Q3j(null, uri2, callId);
                C66378Q3i.LIZ(C47261Igj.LJJIJ(c66379Q3j2));
                str3 = c66379Q3j2.LIZLLL;
            }
            Bundle LIZIZ3 = LIZIZ(shareVideoContent, z);
            C66373Q3d.LJJII("TITLE", shareVideoContent.contentTitle, LIZIZ3);
            C66373Q3d.LJJII("DESCRIPTION", shareVideoContent.contentDescription, LIZIZ3);
            C66373Q3d.LJJII("VIDEO", str3, LIZIZ3);
            return LIZIZ3;
        }
        boolean z2 = false;
        if (shareContent instanceof ShareOpenGraphContent) {
            try {
                JSONObject LJIIIIZZ = Q6F.LJIIIIZZ(Q6F.LJIIIZ(callId, (ShareOpenGraphContent) shareContent), false);
                ShareOpenGraphContent shareOpenGraphContent = (ShareOpenGraphContent) shareContent;
                Bundle LIZIZ4 = LIZIZ(shareOpenGraphContent, z);
                String str4 = shareOpenGraphContent.previewPropertyName;
                if (str4 == null) {
                    str = null;
                } else {
                    str = (String) Q6F.LIZIZ(str4).second;
                }
                C66373Q3d.LJJII("PREVIEW_PROPERTY_NAME", str, LIZIZ4);
                ShareOpenGraphAction shareOpenGraphAction = shareOpenGraphContent.action;
                if (shareOpenGraphAction != null) {
                    str2 = shareOpenGraphAction.LIZLLL();
                }
                C66373Q3d.LJJII("ACTION_TYPE", str2, LIZIZ4);
                C66373Q3d.LJJII("ACTION", String.valueOf(LJIIIIZZ), LIZIZ4);
                return LIZIZ4;
            } catch (JSONException e) {
                throw new Q4W(o.LJIILLIIL(e.getMessage(), "Unable to create a JSON Object from the provided ShareOpenGraphContent: "));
            }
        }
        if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            List<ShareMedia<?, ?>> list = shareMediaContent.media;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (ShareMedia<?, ?> shareMedia : list) {
                    C66379Q3j LIZ3 = Q6F.LIZ(callId, shareMedia);
                    if (LIZ3 == null) {
                        bundle2 = null;
                    } else {
                        arrayList.add(LIZ3);
                        bundle2 = new Bundle();
                        bundle2.putString("type", shareMedia.LIZ().name());
                        bundle2.putString("uri", LIZ3.LIZLLL);
                    }
                    if (bundle2 != null) {
                        arrayList2.add(bundle2);
                    }
                }
                C66378Q3i.LIZ(arrayList);
                collection = arrayList2;
            }
            if (collection == null) {
                collection = C61878OQg.INSTANCE;
            }
            Bundle LIZIZ5 = LIZIZ(shareMediaContent, z);
            LIZIZ5.putParcelableArrayList("MEDIA", new ArrayList<>(collection));
            return LIZIZ5;
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            CameraEffectTextures cameraEffectTextures = shareCameraEffectContent.textures;
            if (cameraEffectTextures != null) {
                Bundle bundle5 = new Bundle();
                ArrayList arrayList3 = new ArrayList();
                Bundle bundle6 = cameraEffectTextures.textures;
                if (bundle6 == null) {
                    keySet = null;
                } else {
                    keySet = bundle6.keySet();
                }
                if (keySet == null) {
                    keySet = OQY.INSTANCE;
                }
                for (String str5 : keySet) {
                    Bundle bundle7 = cameraEffectTextures.textures;
                    if (bundle7 == null) {
                        LLJJIII = null;
                    } else {
                        LLJJIII = C16880lQ.LLJJIII(bundle7, str5);
                    }
                    if (LLJJIII instanceof android.net.Uri) {
                        uri = (android.net.Uri) LLJJIII;
                    } else {
                        uri = null;
                    }
                    Bundle bundle8 = cameraEffectTextures.textures;
                    if (bundle8 == null) {
                        LLJJIII2 = null;
                    } else {
                        LLJJIII2 = C16880lQ.LLJJIII(bundle8, str5);
                    }
                    if (LLJJIII2 instanceof Bitmap) {
                        bitmap = (Bitmap) LLJJIII2;
                    } else {
                        bitmap = null;
                    }
                    if (bitmap != null) {
                        c66379Q3j = new C66379Q3j(bitmap, null, callId);
                    } else if (uri != null) {
                        c66379Q3j = new C66379Q3j(null, uri, callId);
                    } else {
                        c66379Q3j = null;
                    }
                    if (c66379Q3j != null) {
                        arrayList3.add(c66379Q3j);
                        bundle5.putString(str5, c66379Q3j.LIZLLL);
                    }
                }
                C66378Q3i.LIZ(arrayList3);
                bundle3 = bundle5;
            }
            Bundle LIZIZ6 = LIZIZ(shareCameraEffectContent, z);
            C66373Q3d.LJJII("effect_id", shareCameraEffectContent.effectId, LIZIZ6);
            if (bundle3 != null) {
                LIZIZ6.putBundle("effect_textures", bundle3);
            }
            try {
                JSONObject LIZ4 = N2L.LIZ(shareCameraEffectContent.arguments);
                if (LIZ4 == null) {
                    return LIZIZ6;
                }
                C66373Q3d.LJJII("effect_arguments", LIZ4.toString(), LIZIZ6);
                return LIZIZ6;
            } catch (JSONException e2) {
                throw new Q4W(o.LJIILLIIL(e2.getMessage(), "Unable to create a JSON Object from the provided CameraEffectArguments: "));
            }
        }
        if (!(shareContent instanceof ShareStoryContent)) {
            return null;
        }
        ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
        ShareMedia<?, ?> shareMedia2 = shareStoryContent.backgroundAsset;
        if (shareMedia2 == null || (LIZ2 = Q6F.LIZ(callId, shareMedia2)) == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString("type", shareMedia2.LIZ().name());
            bundle.putString("uri", LIZ2.LIZLLL);
            String LIZLLL = Q6F.LIZLLL(LIZ2.LIZJ);
            if (LIZLLL != null) {
                C66373Q3d.LJJII("extension", LIZLLL, bundle);
            }
            C66378Q3i.LIZ(C47261Igj.LJJIJ(LIZ2));
        }
        if (shareStoryContent.stickerAsset != null) {
            new ArrayList().add(shareStoryContent.stickerAsset);
            C66379Q3j LIZ5 = Q6F.LIZ(callId, shareStoryContent.stickerAsset);
            if (LIZ5 != null) {
                bundle4 = new Bundle();
                bundle4.putString("uri", LIZ5.LIZLLL);
                String LIZLLL2 = Q6F.LIZLLL(LIZ5.LIZJ);
                if (LIZLLL2 != null) {
                    C66373Q3d.LJJII("extension", LIZLLL2, bundle4);
                }
                C66378Q3i.LIZ(C47261Igj.LJJIJ(LIZ5));
            }
        }
        Bundle LIZIZ7 = LIZIZ(shareStoryContent, z);
        if (bundle != null) {
            LIZIZ7.putParcelable("bg_asset", bundle);
        }
        if (bundle4 != null) {
            LIZIZ7.putParcelable("interactive_asset_uri", bundle4);
        }
        List<String> LIZ6 = shareStoryContent.LIZ();
        if (LIZ6 == null || LIZ6.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            LIZIZ7.putStringArrayList("top_background_color_list", new ArrayList<>(LIZ6));
        }
        C66373Q3d.LJJII("content_url", shareStoryContent.attributionLink, LIZIZ7);
        return LIZIZ7;
    }
}
