package X;

import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m43.u;
import ujb.o;
import ujb.s;

/* renamed from: X.Q7b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66475Q7b {
    public boolean LIZ;

    public static void LJI(ShareVideo shareVideo) {
        if (shareVideo != null) {
            android.net.Uri uri = shareVideo.localUrl;
            if (uri != null) {
                if (o.LJJJJIZL("content", uri.getScheme(), true) || o.LJJJJIZL("file", uri.getScheme(), true)) {
                    return;
                } else {
                    throw new Q4W("ShareVideo must reference a video that is on the device");
                }
            }
            throw new Q4W("ShareVideo does not have a LocalUrl specified");
        }
        throw new Q4W("Cannot share a null ShareVideo");
    }

    public void LIZ(ShareLinkContent shareLinkContent) {
        android.net.Uri uri = shareLinkContent.contentUrl;
        if (uri == null || C66373Q3d.LJIJJLI(uri)) {
        } else {
            throw new Q4W("Content Url must be an http:// or https:// url");
        }
    }

    public final void LIZIZ(ShareMedia<?, ?> medium) {
        kotlin.jvm.internal.o.LJIIIZ(medium, "medium");
        if (medium instanceof SharePhoto) {
            LJ((SharePhoto) medium);
        } else if (medium instanceof ShareVideo) {
            LJI((ShareVideo) medium);
        } else {
            throw new Q4W(C63144OqK.LIZIZ(new Object[]{C16880lQ.LJLLJ(medium.getClass())}, 1, Locale.ROOT, "Invalid media type: %s", "java.lang.String.format(locale, format, *args)"));
        }
    }

    public void LIZJ(ShareMediaContent shareMediaContent) {
        List<ShareMedia<?, ?>> list = shareMediaContent.media;
        if (list != null && !list.isEmpty()) {
            if (list.size() <= 6) {
                Iterator<ShareMedia<?, ?>> it = list.iterator();
                while (it.hasNext()) {
                    LIZIZ(it.next());
                }
                return;
            }
            throw new Q4W(C63144OqK.LIZIZ(new Object[]{6}, 1, Locale.ROOT, "Cannot add more than %d media.", "java.lang.String.format(locale, format, *args)"));
        }
        throw new Q4W("Must specify at least one medium in ShareMediaContent.");
    }

    public void LJ(SharePhoto photo) {
        kotlin.jvm.internal.o.LJIIIZ(photo, "photo");
        C66474Q7a.LIZJ(photo, this);
        if (photo.bitmap != null || !C66373Q3d.LJIJJLI(photo.imageUrl)) {
            Context LIZJ = u.LIZJ();
            String LIZLLL = u.LIZLLL();
            PackageManager packageManager = LIZJ.getPackageManager();
            if (packageManager != null) {
                String LJIILLIIL = kotlin.jvm.internal.o.LJIILLIIL(LIZLLL, "com.facebook.app.FacebookContentProvider");
                if (packageManager.resolveContentProvider(LJIILLIIL, 0) != null) {
                    return;
                }
                String LIZIZ = Q8U.LIZIZ(new Object[]{LJIILLIIL}, 1, "A ContentProvider for this app was not set up in the AndroidManifest.xml, please add %s as a provider to your AndroidManifest.xml file. See https://developers.facebook.com/docs/sharing/android for more info.", "java.lang.String.format(format, *args)");
                LIZIZ.toString();
                throw new IllegalStateException(LIZIZ);
            }
        }
    }

    public void LJFF(ShareStoryContent shareStoryContent) {
        C66474Q7a.LIZLLL(shareStoryContent, this);
    }

    public void LJII(ShareVideoContent shareVideoContent) {
        LJI(shareVideoContent.video);
        SharePhoto sharePhoto = shareVideoContent.previewPhoto;
        if (sharePhoto != null) {
            LJ(sharePhoto);
        }
    }

    public final void LIZLLL(ShareOpenGraphValueContainer<?, ?> openGraphValueContainer, boolean z) {
        kotlin.jvm.internal.o.LJIIIZ(openGraphValueContainer, "openGraphValueContainer");
        for (String key : openGraphValueContainer.LJ()) {
            kotlin.jvm.internal.o.LJIIIIZZ(key, "key");
            if (z) {
                Object[] array = s.LJLJJL(key, new String[]{":"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    if (strArr.length >= 2) {
                        int length = strArr.length;
                        int i = 0;
                        while (i < length) {
                            String str = strArr[i];
                            i++;
                            if (str.length() == 0) {
                                throw new Q4W("Invalid key found in Open Graph dictionary: %s", key);
                            }
                        }
                    } else {
                        throw new Q4W("Open Graph keys must be namespaced: %s", key);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            Object LIZ = openGraphValueContainer.LIZ(key);
            if (LIZ instanceof List) {
                for (Object obj : (List) LIZ) {
                    if (obj != null) {
                        C66474Q7a.LIZIZ(obj, this);
                    } else {
                        throw new Q4W("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
            } else {
                C66474Q7a.LIZIZ(LIZ, this);
            }
        }
    }
}
