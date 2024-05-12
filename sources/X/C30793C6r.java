package X;

import com.bytedance.android.live.base.model.user.BadgeText;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveEnableLevelBadgePaddingSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.C6r, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30793C6r {
    public static final boolean LIZ = LiveEnableLevelBadgePaddingSetting.INSTANCE.getValue();

    public static CharSequence LIZ(BadgeText badgeText) {
        if (badgeText == null) {
            return null;
        }
        Text text = new Text();
        text.key = badgeText.key;
        text.defaultPattern = badgeText.defaultPattern;
        List<String> list = badgeText.pieces;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                TextPiece textPiece = new TextPiece();
                textPiece.type = CXI.STRING.getPieceType();
                textPiece.stringValue = str;
                arrayList.add(textPiece);
            }
            text.pieces = arrayList;
        }
        return CXJ.LJFF(text, null);
    }
}
