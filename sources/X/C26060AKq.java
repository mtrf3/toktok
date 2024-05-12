package X;

import Y.ACListenerS39S0200000_4;
import Y.ARunnableS5S1100000_4;
import Y.IDCSpanS2S0200000_4;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.Arrays;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

@InterfaceC55642Lsc("promote_web_creation_popup")
/* renamed from: X.AKq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26060AKq extends M71 {
    public final ViewGroup LJLIL;
    public AKH LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    public final void LJIIIIZZ(Context context) {
        C26062AKs.LIZ().storeBoolean("key_has_open_h5_page", true);
        AL0.LIZIZ.LIZLLL(context);
        AKH akh = this.LJLILLLLZI;
        if (akh != null) {
            akh.LIZ();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("web_creation_promote_banner_click", c188727au.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26060AKq(ViewGroup view, C235769Nc c235769Nc) {
        super(c235769Nc);
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        int LIZ;
        String string;
        String LJFF;
        View findViewById;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        C26064AKu preloadManager = C26064AKu.LIZIZ;
        o.LJIIIZ(preloadManager, "preloadManager");
        C38995FSd.LIZJ().submit(new ARunnableS5S1100000_4(preloadManager, 8));
        if (context.LIZJ() != null) {
            if (C53765L8f.LJIIJJI()) {
                LIZ = 0;
            } else {
                C57092Lx.LIZ.getClass();
                LIZ = C61447O9r.LIZ();
            }
            AKH akh = new AKH(this.LJLIL);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_computer_cursor;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
            String string2 = context.LIZ.getString(R.string.tvy);
            A21 a21 = akh.LIZ;
            a21.LIZLLL = string2;
            a21.LJIILIIL = true;
            Context context2 = context.LIZ;
            if (C26062AKs.LIZ().getInt("key_cancel_profile_gudie_time", 0) == 0) {
                string = context2.getString(R.string.tvx);
            } else {
                string = context2.getString(R.string.tvw);
            }
            o.LJIIIIZZ(string, "if (WebCreationKevaCache…lePage_bottomNotif_body1)");
            String string3 = context2.getString(R.string.tvv);
            o.LJIIIIZZ(string3, "context.getString(R.stri…Promo_FYP_learnMore_body)");
            String LJJJJLL = ujb.o.LJJJJLL(string3, ' ', (char) 160, false);
            try {
                LJFF = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{LJJJJLL}, 1));
                o.LJIIIIZZ(LJFF, "format(format, *args)");
            } catch (Exception unused) {
                LJFF = i0.LJFF(string, LJJJJLL);
            }
            int LJJLIIIJL = s.LJJLIIIJL(LJFF, LJJJJLL, 0, false, 6);
            SpannableString spannableString = new SpannableString(LJFF);
            spannableString.setSpan(new IDCSpanS2S0200000_4(context2, this, 3), 0, spannableString.length(), 34);
            spannableString.setSpan(new ForegroundColorSpan(C04330Ez.LIZIZ(context2, R.color.c7)), LJJLIIIJL, LJJJJLL.length() + LJJLIIIJL, 17);
            spannableString.setSpan(new T5U(63, false), LJJLIIIJL, LJJJJLL.length() + LJJLIIIJL, 17);
            A21 a212 = akh.LIZ;
            a212.LJ = spannableString;
            a212.LJIIIZ = 0;
            a212.LIZJ = false;
            a212.LJIIIIZZ = LIZ;
            akh.LIZ.LJIIL = new AqS170S0100000_4(wrapper, 1412);
            this.LJLILLLLZI = akh;
            akh.LIZJ();
            AKJ akj = akh.LJ;
            if (akj != null && (findViewById = akj.findViewById(R.id.btt)) != null) {
                findViewById.setClickable(true);
                C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, context, 99), findViewById);
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            FMX.LJIIL("web_creation_promote_banner_show", c188727au.LIZ);
        }
    }
}
