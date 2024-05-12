package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSNavButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XqO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86080XqO extends AbstractC86076XqK {
    public final Context LIZIZ;

    @Override // X.InterfaceC86091XqZ
    public final C86057Xq1 LJ() {
        return new C86057Xq1("", this.LIZIZ.getString(R.string.dpm), this.LIZIZ.getString(R.string.dpl), this.LIZIZ.getString(R.string.c_o), null, this.LIZIZ.getString(R.string.iad), AbstractC86076XqK.LJIIIIZZ(), AbstractC86076XqK.LJIIIIZZ(), null, EnumC86081XqP.HIDE, C47261Igj.LJJIJ(new PNSNavButton(EnumC86082XqQ.LEFT, EnumC86085XqT.BACK, null, "", "")), null, null, 4096, null);
    }

    @Override // X.InterfaceC86091XqZ
    public final Context getContext() {
        return this.LIZIZ;
    }

    public C86080XqO(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZIZ = context;
    }

    @Override // X.InterfaceC86091XqZ
    public final PNSFeedbackModel LJFF(C62962OnO c62962OnO, java.util.Map<String, String> logParams) {
        o.LJIIIZ(logParams, "logParams");
        if (C63020OoK.LIZ[c62962OnO.LIZ.ordinal()] == 1) {
            return LJI();
        }
        return null;
    }
}
