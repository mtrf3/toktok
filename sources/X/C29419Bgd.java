package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.zhiliaoapp.musically.R;
import ujb.s;

/* renamed from: X.Bgd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29419Bgd extends C29818Bn4 {
    @Override // X.C29818Bn4, X.CQL
    public final CharSequence LJJZZIII() {
        int i;
        int i2;
        if (((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).m90() != null) {
            i = R.color.a8j;
        } else {
            i = -16777216;
        }
        if (LJLJJL()) {
            i2 = R.string.oq5;
        } else {
            i2 = R.string.oq7;
        }
        String LJIILJJIL = C15380j0.LJIILJJIL(i2);
        String str = "";
        if (LJIILJJIL == null) {
            LJIILJJIL = "";
        }
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.oq6);
        if (LJIILJJIL2 != null) {
            str = LJIILJJIL2;
        }
        String LIZIZ = Q8U.LIZIZ(new Object[]{LJIILJJIL}, 1, str, "format(format, *args)");
        int LJJLIIIJL = s.LJJLIIIJL(LIZIZ, LJIILJJIL, 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZIZ);
        C23010vJ.LJFF(spannableStringBuilder, LJJLIIIJL, LJIILJJIL.length() + LJJLIIIJL, 18, 700);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(i)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public C29419Bgd(RoomMessage roomMessage) {
        super(roomMessage);
    }
}
