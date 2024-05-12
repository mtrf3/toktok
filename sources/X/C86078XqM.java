package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.PNSAgeConfirmOption;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSDialogModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.XqM, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86078XqM extends AbstractC86076XqK {
    public final Context LIZIZ;

    @Override // X.AbstractC86076XqK, X.InterfaceC86091XqZ
    public final PNSFeedbackModel LIZIZ() {
        return new PNSFeedbackModel(null, null, null, 7, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final C86057Xq1 LJ() {
        return new C86057Xq1(this.LIZIZ.getString(R.string.doj), this.LIZIZ.getString(R.string.c_p), this.LIZIZ.getString(R.string.ce7), this.LIZIZ.getString(R.string.iae), null, this.LIZIZ.getString(R.string.iad), new Date(System.currentTimeMillis() - 31536000000L), AbstractC86076XqK.LJIIIIZZ(), null, EnumC86081XqP.HIDE, C47261Igj.LJJIJ(new PNSNavButton(EnumC86082XqQ.LEFT, EnumC86085XqT.BACK, null, "", "")), null, Boolean.TRUE);
    }

    @Override // X.InterfaceC86091XqZ
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C86078XqM(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJFF(C62962OnO c62962OnO, java.util.Map<String, String> logParams) {
        o.LJIIIZ(logParams, "logParams");
        int i = C63012OoC.LIZ[c62962OnO.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return LJII(c62962OnO.LIZLLL);
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{this.LIZIZ.getString(R.string.c_v), this.LIZIZ.getString(R.string.c_w)}, 2, "%s\n\n%s", "java.lang.String.format(format, *args)");
            String string = this.LIZIZ.getString(R.string.c_u);
            o.LJIIIIZZ(string, "context.getString(R.stri…thdayscreen_modal_button)");
            return new PNSFeedbackModel(null, new PNSDialogModel(LIZIZ, null, C47261Igj.LJJIJ(new PNSAgeConfirmOption(string, null, EnumC86061Xq5.CONTINUE.getType(), 2, null)), Integer.valueOf(EnumC86062Xq6.BUTTON.getValue()), 0, false, false, false, null, 498, null), null, 5, null);
        }
        return null;
    }
}
