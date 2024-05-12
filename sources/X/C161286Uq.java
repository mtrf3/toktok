package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161286Uq {
    public static String LIZ(Aweme aweme) {
        InteractStickerStruct next;
        QaStruct qaStruct;
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs != null) {
            Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
            if (it.hasNext() && (next = it.next()) != null && (qaStruct = next.getQaStruct()) != null) {
                return qaStruct.getCategory_meta();
            }
        }
        return null;
    }
}
