package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ftn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40427Ftn extends AbstractC40428Fto {
    @Override // X.AbstractC40428Fto
    public final void LIZ() {
        try {
            String feHelp = C2YJ.LIZIZ.LIZ.getFeedbackConf().getFeHelp();
            o.LJIIIIZZ(feHelp, "get().feedbackConf.feHelp");
            C61200O0e.LIZLLL().LJII(C86034Xpe.LIZIZ.buildFeedbackUrl(feHelp, C51029K0z.LJJIIZI(new OSZ("feedback_id", "15203"))));
        } catch (C158056If unused) {
        }
    }

    @Override // X.AbstractC40428Fto
    public final C40429Ftp LIZIZ() {
        String string = this.LIZ.getString(R.string.tu3);
        o.LJIIIIZZ(string, "activity.getString(R.str…aper_praise_dialog_title)");
        String string2 = this.LIZ.getString(R.string.tu0);
        o.LJIIIIZZ(string2, "activity.getString(R.str…er_praise_dialog_content)");
        String string3 = this.LIZ.getString(R.string.tu1);
        o.LJIIIIZZ(string3, "activity.getString(R.str…r_praise_dialog_feedback)");
        String string4 = this.LIZ.getString(R.string.tu2);
        o.LJIIIIZZ(string4, "activity.getString(R.str…r_praise_dialog_positive)");
        String string5 = this.LIZ.getString(R.string.cel);
        o.LJIIIIZZ(string5, "activity.getString(R.string.button_cancel)");
        return new C40429Ftp(string, string2, string3, string4, string5, "com.zhiliao.musically.livewallpaper");
    }

    public C40427Ftn(Activity activity) {
        super(activity, EnumC40416Ftc.WALLPAPER);
    }
}
