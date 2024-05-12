package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Odm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62366Odm extends AbstractC62223ObT {
    public final Context LJLIL;

    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "beta_feedback";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String string = this.LJLIL.getString(R.string.c6v);
        o.LJIIIIZZ(string, "context.getString(R.stri…FYP_bottomSheetShare_btn)");
        return string;
    }

    public C62366Odm(Context context) {
        this.LJLIL = context;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_beaker_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.gu);
            c2068389v.LIZIZ = C7MY.LIZIZ(20);
            c2068389v.LIZJ = C7MY.LIZIZ(20);
            SY9 LIZ = c2068389v.LIZ(context);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cf);
            c110614Vt.LJII = C7MY.LIZIZ(48);
            c110614Vt.LJI = C7MY.LIZIZ(48);
            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
            return C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context));
        }
        return null;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        C221018lt.LJFF("BetaFeedbackChannel", "share text");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        C221018lt.LJFF("BetaFeedbackChannel", "share photo");
        ScreenShotFeedbackService.createIScreenShotFeedbackServicebyMonsterPlugin(false).startUploadScreenShotFeedback(context, content.LIZJ);
        ScreenShotFeedbackService.createIScreenShotFeedbackServicebyMonsterPlugin(false).sendShareFeedbackEvent();
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        C221018lt.LJFF("BetaFeedbackChannel", "share video");
        return false;
    }
}
