package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PhotoSourceFromScene;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GZt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41741GZt extends AbstractC43455H3r {
    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.REPLACE_LOCAL_IMAGE;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        Object obj2;
        long j;
        ArrayList arrayList;
        Aweme aweme;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        VideoPublishEditModel videoPublishEditModel;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData;
        ImageSynthesisResult synthesisData;
        String path;
        List<String> urlList;
        VideoPublishEditModel videoPublishEditModel2;
        ImageAlbumData imageAlbumData2;
        List<SingleImageData> imageList3;
        String str;
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (obj instanceof C43403H1r) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (!(obj instanceof C43403H1r)) {
            obj = null;
        }
        C43403H1r c43403H1r = (C43403H1r) obj;
        Iterator<Object> it2 = args.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj2 = it2.next();
                if (obj2 instanceof CreateAwemeResponse) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        if (!(obj2 instanceof CreateAwemeResponse)) {
            obj2 = null;
        }
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) obj2;
        if (C41743GZv.LIZ) {
            long j2 = 1024;
            j = (CommonFeedServiceImpl.LJJIJLIJ().LJIJJLI(FKM.LIZ()) / j2) / j2;
        } else {
            j = 0;
        }
        if (c43403H1r != null && (videoPublishEditModel2 = c43403H1r.LIZ) != null && (imageAlbumData2 = videoPublishEditModel2.getImageAlbumData()) != null && (imageList3 = imageAlbumData2.getImageList()) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(imageList3, 10));
            Iterator<SingleImageData> it3 = imageList3.iterator();
            while (it3.hasNext()) {
                ImageSynthesisResult synthesisData2 = it3.next().getSynthesisData();
                if (synthesisData2 != null) {
                    str = synthesisData2.getPath();
                } else {
                    str = null;
                }
                arrayList2.add(str);
            }
            arrayList = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                String str2 = (String) next;
                if (str2 == null) {
                    str2 = "";
                }
                if (C41743GZv.LIZ(j, str2)) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        if (createAwemeResponse != null && (aweme = createAwemeResponse.aweme) != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            int i = 0;
            for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                int i2 = i + 1;
                if (i >= 0) {
                    PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                    photoModeImageUrlModel2.setSourceFrom(PhotoSourceFromScene.PUBLISH);
                    if (c43403H1r != null && (videoPublishEditModel = c43403H1r.LIZ) != null && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList2 = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) ORZ.LJLLLLLL(i, imageList2)) != null && (synthesisData = singleImageData.getSynthesisData()) != null && (path = synthesisData.getPath()) != null && (!TextUtils.isEmpty(path))) {
                        if (arrayList != null && arrayList.contains(path)) {
                            String LJIIL = C8SG.LIZIZ.LIZ.LJIIL(path);
                            UrlModel displayImageNoWatermark = photoModeImageUrlModel2.getDisplayImageNoWatermark();
                            if (displayImageNoWatermark != null && (urlList = displayImageNoWatermark.getUrlList()) != null) {
                                ListProtector.add(urlList, 0, LJIIL);
                            }
                        } else {
                            C38891fp.LJIILJJIL(path);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        c67996QmO.LJ(createAwemeResponse, false);
    }
}
