package X;

import android.text.Spannable;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TvB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76185TvB {
    public C47151t9 LIZ;
    public C47121t6 LIZIZ;

    public C76185TvB(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
    }

    public static int LIZ(boolean z) {
        C76280Twi c76280Twi;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        GiftModeMeta giftModeMeta = c76280Twi.LJIILLIIL;
        if (giftModeMeta == null || giftModeMeta.giftId == 0) {
            return 0;
        }
        return 37;
    }

    public final void LIZIZ(boolean z) {
        C76280Twi c76280Twi;
        List<TextPiece> list;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        GiftModeMeta giftModeMeta = c76280Twi.LJIILLIIL;
        if (giftModeMeta != null) {
            if (giftModeMeta.giftId == 0) {
                C47151t9 c47151t9 = this.LIZ;
                if (c47151t9 == null) {
                    return;
                }
                c47151t9.setVisibility(8);
                return;
            }
            C47151t9 c47151t92 = this.LIZ;
            if (c47151t92 != null) {
                c47151t92.setVisibility(0);
            }
            Spannable LJFF = CXJ.LJFF(giftModeMeta.giftModeDesc, "");
            C47121t6 c47121t6 = this.LIZIZ;
            if (c47121t6 != null) {
                c47121t6.setText(LJFF);
            }
            Text text = giftModeMeta.giftModeDesc;
            if (text == null || (list = text.pieces) == null) {
                return;
            }
            for (TextPiece textPiece : list) {
                if (textPiece.type == CXI.IMAGE.getPieceType()) {
                    ((IHostFrescoHelper) CN1.LIZ(IHostFrescoHelper.class)).EM(textPiece.imageValue.imageModel, new C76184TvA(giftModeMeta, this));
                }
            }
            return;
        }
        C47151t9 c47151t93 = this.LIZ;
        if (c47151t93 == null) {
            return;
        }
        c47151t93.setVisibility(8);
    }
}
