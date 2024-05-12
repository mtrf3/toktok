package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gww, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43170Gww {
    public static final /* synthetic */ int LIZLLL = 0;
    public final WeakReference<Activity> LIZ;
    public final C8BR<?, ?> LIZIZ;
    public final OSZ<Integer, String> LIZJ;

    public C43170Gww(WeakReference<Activity> weakReference, Integer num) {
        OSZ<Integer, String> osz;
        this.LIZ = weakReference;
        C8BR<?, ?> c8br = new C8BR<>();
        this.LIZIZ = c8br;
        c8br.LJJ(new C43169Gwv());
        if (num != null) {
            osz = C193657ir.LJFF(num.intValue());
        } else {
            osz = null;
        }
        this.LIZJ = osz;
    }

    public void LIZ(String url, InterfaceC43172Gwy interfaceC43172Gwy, C42593Gnd c42593Gnd) {
        o.LJIIIZ(url, "url");
        Activity activity = this.LIZ.get();
        if (activity != null) {
            StringBuilder LIZ = X1D.LIZ();
            String LIZIZ = b1.LIZIZ(url, LIZ, ".png", LIZ);
            String LJIJ = C66580QBc.LJIJ(activity);
            C39579Fg7.LJ(LJIJ, false);
            X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(url);
            with.LIZJ = LIZIZ;
            LJIJ.toString();
            with.LJ = LJIJ;
            with.LJIIJJI = new IDDListenerS58S0100000_7(interfaceC43172Gwy, 2);
            with.LIZJ();
        }
    }

    public String LIZIZ(Aweme aweme, int i, C42593Gnd c42593Gnd) {
        int i2;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel displayImageNoWatermark;
        List<String> urlList;
        String str;
        UrlModel userWatermarkImage;
        List<String> urlList2;
        UrlModel ownerWatermarkImage;
        List<String> urlList3;
        List<PhotoModeImageUrlModel> imageList2;
        o.LJIIIZ(aweme, "aweme");
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList2 = photoModeImageInfo.getImageList()) != null) {
            i2 = imageList2.size();
        } else {
            i2 = 0;
        }
        String str2 = null;
        if (i2 <= i) {
            return null;
        }
        if (c42593Gnd.LIZIZ) {
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null) {
                photoModeImageUrlModel = photoModeImageInfo2.getImagePostCover();
            }
            photoModeImageUrlModel = null;
        } else {
            PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo3 != null && (imageList = photoModeImageInfo3.getImageList()) != null) {
                photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(imageList, i);
            }
            photoModeImageUrlModel = null;
        }
        ACLCommonShare aCLCommonShare = c42593Gnd.LIZ;
        if (aCLCommonShare == null) {
            return null;
        }
        int transcode = aCLCommonShare.getTranscode();
        if (transcode != 1) {
            if (transcode != 2) {
                if (transcode != 3) {
                    return null;
                }
                IAccountUserService LJIILL = HG3.LJIILL();
                User author = aweme.getAuthor();
                if (author != null) {
                    str = author.getUid();
                } else {
                    str = null;
                }
                if (((RBX) LJIILL).isMe(str)) {
                    if (photoModeImageUrlModel == null || (ownerWatermarkImage = photoModeImageUrlModel.getOwnerWatermarkImage()) == null || (urlList3 = ownerWatermarkImage.getUrlList()) == null) {
                        return null;
                    }
                    return (String) ListProtector.get(urlList3, 0);
                }
                if (photoModeImageUrlModel == null || (userWatermarkImage = photoModeImageUrlModel.getUserWatermarkImage()) == null || (urlList2 = userWatermarkImage.getUrlList()) == null) {
                    return null;
                }
                return (String) ListProtector.get(urlList2, 0);
            }
            C44896Hjg.LIZLLL = 1;
            return null;
        }
        if (photoModeImageUrlModel == null || (displayImageNoWatermark = photoModeImageUrlModel.getDisplayImageNoWatermark()) == null || (urlList = displayImageNoWatermark.getUrlList()) == null) {
            return null;
        }
        Iterator<String> it = urlList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            String it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (!ujb.o.LJJJLIIL(it2, "file", false)) {
                str2 = next;
                break;
            }
        }
        return str2;
    }
}
