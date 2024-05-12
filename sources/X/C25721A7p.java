package X;

import Y.IDDListenerS144S0100000_4;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.A7p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25721A7p extends ClickableSpan {
    public final /* synthetic */ C25710A7e LJLIL;
    public final /* synthetic */ AKH LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ Context LJLJJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        Context context = widget.getContext();
        o.LJIIIIZZ(context, "widget.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C25710A7e c25710A7e = this.LJLIL;
            AKH akh = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            c25710A7e.getClass();
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(LJJIFFI, R.style.uy);
            AI8 ai8 = new AI8(contextThemeWrapper, null, 6);
            AI2 ai2 = new AI2(contextThemeWrapper);
            ai2.LJIILIIL(z);
            ai2.LJIILL(new C25720A7o(new C68322mC(), new CancellationException("debounce cancel!"), c25710A7e, ai2));
            ai8.setAccessory(ai2);
            ai8.setIcon((C2068389v) null);
            ai8.setTitle(LJJIFFI.getString(R.string.jdh));
            ai8.setSubtitle(LJJIFFI.getString(R.string.jdg));
            ((TuxTextView) ai8.findViewById(R.id.ks_)).setTextColorRes(R.attr.gx);
            ai8.setOnClickListener(new AqS170S0100000_4(ai8, 42));
            ASL asl = new ASL();
            C235119Kp c235119Kp = new C235119Kp();
            C9KF c9kf = new C9KF();
            String string = LJJIFFI.getString(R.string.h2w);
            o.LJIIIIZZ(string, "context.getString(R.stri…r_link_suggestion_pop_up)");
            c9kf.LIZJ = string;
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS154S0100000_4(ai8, 16));
            c235119Kp.LIZIZ(LIZJ);
            c235119Kp.LIZLLL = true;
            asl.LIZ.LJLLL = c235119Kp;
            asl.LIZLLL(R.style.uy);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLI = ai8;
            tuxSheet.LJLILLLLZI = new IDDListenerS144S0100000_4(akh, 1);
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "context.supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "PrivacyDialog");
            FMX.LJIIL("confirm_link_privacy_pop_up", C51029K0z.LJJIIZI(new OSZ("result", "close")));
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        Integer LJI = C79045V0n.LJI(R.attr.eb, this.LJLJJI);
        if (LJI != null) {
            ds.setColor(LJI.intValue());
        }
    }

    public C25721A7p(C25710A7e c25710A7e, AKH akh, boolean z, ActivityC45651qj activityC45651qj) {
        this.LJLIL = c25710A7e;
        this.LJLILLLLZI = akh;
        this.LJLJI = z;
        this.LJLJJI = activityC45651qj;
    }
}
