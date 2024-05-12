package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.editSticker.text.bean.ForegroundColorStyle;
import com.ss.android.ugc.aweme.editSticker.text.bean.InlineRichTextStyleData;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.5yY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152425yY {
    public static final List<InlineRichTextStyleData> LIZ(String str) {
        List<InlineRichTextStyleData> list = (List) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().LIZ(), str, new TypeToken<List<? extends InlineRichTextStyleData>>() { // from class: X.5a4
        }.getType());
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public static final void LIZIZ(List<InlineRichTextStyleData> list) {
        ListIterator listIterator = ((ArrayList) list).listIterator();
        while (listIterator.hasNext()) {
            if (((InlineRichTextStyleData) listIterator.next()).inlineStyle instanceof ForegroundColorStyle) {
                listIterator.remove();
            }
        }
    }
}
