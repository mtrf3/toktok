package X;

import com.ss.android.ugc.aweme.image.model.ImageAlbumData;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6D1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6D1 {
    public static List LIZ(VideoPublishEditModel model) {
        List<SingleImageData> imageList;
        List<StickerModel> allStickers;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        List<StickerModel> allStickers2;
        o.LJIIIZ(model, "model");
        ArrayList arrayList = new ArrayList();
        ImageAlbumData imageAlbumData = model.getImageAlbumData();
        if (imageAlbumData != null && (stickerInfoNewEngine = imageAlbumData.getStickerInfoNewEngine()) != null && (allStickers2 = stickerInfoNewEngine.getAllStickers()) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(allStickers2, 10));
            Iterator<StickerModel> it = allStickers2.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getInteractStickerStruct());
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((InteractStickerStruct) next).getType() != 0) {
                    arrayList3.add(next);
                }
            }
            arrayList.addAll(arrayList3);
        }
        ImageAlbumData imageAlbumData2 = model.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
            int i = 0;
            for (SingleImageData singleImageData : imageList) {
                int i2 = i + 1;
                if (i >= 0) {
                    ImageStickerInfoNewEngine stickerInfoNewEngine2 = singleImageData.getStickerInfoNewEngine();
                    if (stickerInfoNewEngine2 != null && (allStickers = stickerInfoNewEngine2.getAllStickers()) != null) {
                        ArrayList arrayList4 = new ArrayList(C32I.LJJL(allStickers, 10));
                        Iterator<StickerModel> it3 = allStickers.iterator();
                        while (it3.hasNext()) {
                            InteractStickerStruct interactStickerStruct = it3.next().getInteractStickerStruct();
                            interactStickerStruct.setMaterialIndex(i);
                            arrayList4.add(interactStickerStruct);
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            if (((InteractStickerStruct) next2).getType() != 0) {
                                arrayList5.add(next2);
                            }
                        }
                        arrayList.addAll(arrayList5);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
