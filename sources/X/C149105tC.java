package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5tC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149105tC {
    public static JSONArray LIZ(VideoPublishEditModel videoPublishEditModel) {
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        for (SingleImageData singleImageData : videoPublishEditModel.getImageAlbumData().getImageList()) {
            JSONArray jSONArray2 = new JSONArray();
            for (StickerItemModel stickerItemModel : singleImageData.getStickerInfo().getStickers()) {
                if (stickerItemModel.type == 2) {
                    jSONArray2.put(C68W.LJII(((TextStickerData) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), stickerItemModel.extra, TextStickerData.class)).getTextWrapList()));
                }
            }
            if (jSONArray2.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("index", i);
                jSONObject.put("content", jSONArray2);
                jSONArray.put(jSONObject);
            }
            i++;
        }
        return jSONArray;
    }

    public static List<String> LIZIZ(StickerItemModel stickerItemModel) {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(C68W.LJII(((TextStickerData) C60903NvH.LJIIJJI().LIZ().LJI(stickerItemModel.extra, TextStickerData.class)).getTextWrapList()));
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
