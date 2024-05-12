package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.math.BigDecimal;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.68e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1554468e {
    public static final /* synthetic */ int LIZ = 0;

    public static InteractStickerStruct LIZIZ(StickerModel model, boolean z) {
        o.LJIIIZ(model, "model");
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(model.getStickerType().getType());
        LinkedList linkedList = new LinkedList();
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        normalTrackTimeStamp.setRotation(model.getBaseSticker().getRotation());
        normalTrackTimeStamp.setScale(Float.valueOf(model.getBaseSticker().getScale()));
        PointF LIZ2 = LIZ(new PointF(model.getBaseSticker().getTranslateX(), model.getBaseSticker().getTranslateY()), model.getBaseSticker().getMediaWidth(), model.getBaseSticker().getMediaHeight());
        normalTrackTimeStamp.setX(LIZ2.x + 0.5f);
        normalTrackTimeStamp.setY(LIZ2.y + 0.5f);
        PointF LIZ3 = LIZ(new PointF(model.getBaseSticker().getWidth(), model.getBaseSticker().getHeight()), model.getBaseSticker().getMediaWidth(), model.getBaseSticker().getMediaHeight());
        normalTrackTimeStamp.setStartTime(model.getBaseSticker().getStartTime());
        normalTrackTimeStamp.setEndTime(model.getBaseSticker().getEndTime());
        normalTrackTimeStamp.setWidth(LIZ3.x);
        normalTrackTimeStamp.setHeight(LIZ3.y);
        if (z) {
            normalTrackTimeStamp.setWidth(model.getBaseSticker().getScale() * normalTrackTimeStamp.getWidth());
            normalTrackTimeStamp.setHeight(model.getBaseSticker().getScale() * normalTrackTimeStamp.getHeight());
        }
        linkedList.add(normalTrackTimeStamp);
        if (C78886Uxe.LJJIJ(linkedList)) {
            interactStickerStruct.setTrackList("");
        } else {
            try {
                interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C6YQ.LIZ(), linkedList));
            } catch (k unused) {
            }
        }
        return interactStickerStruct;
    }

    public static PointF LIZ(PointF pointF, float f, float f2) {
        PointF pointF2 = new PointF();
        if (f == 0.0f || f2 == 0.0f) {
            return new PointF(0.0f, 0.0f);
        }
        pointF2.set(new BigDecimal(pointF.x / f).setScale(4, 1).floatValue(), new BigDecimal(pointF.y / f2).setScale(4, 1).floatValue());
        return pointF2;
    }
}
