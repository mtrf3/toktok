package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import java.util.Date;
import kotlin.jvm.internal.o;

/* renamed from: X.XqN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86079XqN extends AbstractC86076XqK {
    public final Context LIZIZ;

    @Override // X.InterfaceC86091XqZ
    public final C86057Xq1 LJ() {
        String string;
        String string2;
        Date defaultDate;
        Date upperBound;
        C63062Op0 c63062Op0 = this.LIZ;
        if (c63062Op0 == null || c63062Op0.getType() != 2) {
            string = this.LIZIZ.getString(R.string.bjs);
        } else {
            string = this.LIZIZ.getString(R.string.c_p);
        }
        String string3 = this.LIZIZ.getString(R.string.dsg);
        C63062Op0 c63062Op02 = this.LIZ;
        if (c63062Op02 == null || c63062Op02.getDescType() != 1) {
            string2 = this.LIZIZ.getString(R.string.bjr);
        } else {
            string2 = this.LIZIZ.getString(R.string.thx);
        }
        String string4 = this.LIZIZ.getString(R.string.bji);
        C63062Op0 c63062Op03 = this.LIZ;
        if (c63062Op03 == null || (defaultDate = c63062Op03.getDefaultDate()) == null) {
            defaultDate = new Date(System.currentTimeMillis() - 31536000000L);
        }
        C63062Op0 c63062Op04 = this.LIZ;
        if (c63062Op04 == null || (upperBound = c63062Op04.getUpperBound()) == null) {
            upperBound = AbstractC86076XqK.LJIIIIZZ();
        }
        return new C86057Xq1(null, string, string3, string2, null, string4, defaultDate, upperBound, null, EnumC86081XqP.HIDE, C47261Igj.LJJIJ(new PNSNavButton(EnumC86082XqQ.LEFT, EnumC86085XqT.BACK, null, "", "")), null, Boolean.TRUE, 2049, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C86079XqN(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJFF(C62962OnO c62962OnO, java.util.Map<String, String> logParams) {
        o.LJIIIZ(logParams, "logParams");
        if (C63021OoL.LIZ[c62962OnO.LIZ.ordinal()] == 1) {
            return LJI();
        }
        return null;
    }
}
