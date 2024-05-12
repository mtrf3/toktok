package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

/* renamed from: X.XnA, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85880XnA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TextView textView, Text text) {
        String str;
        if (textView == null || text == null) {
            return;
        }
        com.bytedance.android.livesdk.model.message.common.Text text2 = new com.bytedance.android.livesdk.model.message.common.Text();
        text2.key = text.getKey();
        String defaultPattern = text.getDefaultPattern();
        text2.defaultPattern = defaultPattern;
        String defaultPattern2 = text.getDefaultPattern();
        String pieces = text.getPieces();
        if (!TextUtils.isEmpty(defaultPattern2)) {
            try {
                text2.defaultFormat = (TextFormat) C69432nz.LIZ().LJI(defaultPattern2, TextFormat.class);
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(pieces)) {
            try {
                text2.pieces = (List) C69432nz.LIZ().LJII(pieces, new C85881XnB().getType());
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(text2.key)) {
            str = LiveOuterService.LJJJLL().LJJIJIL().LJLIIIL(text2.key);
        } else {
            str = null;
        }
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (!TextUtils.isEmpty(str)) {
            defaultPattern = str;
        }
        textView.setText(LJJIJIL.LJJIFFI(text2, defaultPattern));
    }
}
