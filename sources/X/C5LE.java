package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5LE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LE {
    public static final String LIZIZ(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<TextStickerTextWrap> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getText());
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static boolean LIZ(TextStickerData textStickerData, TextStickerData textStickerData2) {
        if (Math.abs(textStickerData2.getX() - textStickerData.getX()) > 5.0f) {
            return true;
        }
        if (Math.abs(textStickerData2.getY() - textStickerData.getY()) > 5.0f || textStickerData.getFontSize() != textStickerData2.getFontSize() || textStickerData.getColor() != textStickerData2.getColor() || textStickerData.getScale() != textStickerData2.getScale() || textStickerData.getRotation() != textStickerData2.getRotation() || textStickerData.getBgMode() != textStickerData2.getBgMode() || textStickerData.getAlign() != textStickerData2.getAlign() || !o.LJ(LIZIZ(textStickerData.getTextWrapList()), LIZIZ(textStickerData2.getTextWrapList()))) {
            return true;
        }
        return false;
    }
}
