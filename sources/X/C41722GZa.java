package X;

import android.content.Context;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GZa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41722GZa {
    public static C73390SrC LIZIZ(int i, Context context, StickerItemModel textStickerModel, String stickerOutputPath) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(textStickerModel, "textStickerModel");
        o.LJIIIZ(stickerOutputPath, "stickerOutputPath");
        return AbstractC73672Svk.LJIIJ(new C41985Gdp(i, context, textStickerModel, stickerOutputPath));
    }

    public static OSZ LIZ(OSZ osz, C41723GZb bitmapInfo, OSZ canvasSize, float f, int i) {
        float f2;
        float floatValue;
        o.LJIIIZ(bitmapInfo, "bitmapInfo");
        o.LJIIIZ(canvasSize, "canvasSize");
        if (osz != null) {
            float floatValue2 = ((Number) ((OSZ) osz.getFirst()).getFirst()).floatValue();
            OSZ osz2 = (OSZ) osz.getSecond();
            float floatValue3 = ((Number) osz2.getFirst()).floatValue();
            float floatValue4 = ((Number) osz2.getSecond()).floatValue();
            float f3 = bitmapInfo.LIZJ * f;
            float f4 = (bitmapInfo.LIZIZ * f) / 2.0f;
            if (bitmapInfo.LIZLLL) {
                f2 = floatValue3 - f4;
            } else {
                f2 = f4 + floatValue2;
            }
            float floatValue5 = f2 / ((Number) canvasSize.getFirst()).floatValue();
            if (i == 0) {
                floatValue = (floatValue4 - (f3 / 2.0f)) / ((Number) canvasSize.getSecond()).floatValue();
            } else {
                floatValue = ((f3 / 2.0f) + floatValue4) / ((Number) canvasSize.getSecond()).floatValue();
            }
            return new OSZ(Float.valueOf(floatValue5), Float.valueOf(floatValue));
        }
        return new OSZ(Float.valueOf(0.5f), Float.valueOf(0.5f));
    }
}
