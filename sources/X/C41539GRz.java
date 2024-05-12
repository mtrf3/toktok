package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.GRz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41539GRz extends LinearLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    private final SmartImageView getIvMain() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-ivMain>(...)");
        return (SmartImageView) value;
    }

    public final SY4 getBtnDismiss() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-btnDismiss>(...)");
        return (SY4) value;
    }

    public final ImageView getIvClose() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-ivClose>(...)");
        return (ImageView) value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41539GRz(C29S context, String language) {
        super(context, null, 0);
        Object LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(language, "language");
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 313));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 314));
        this.LJLJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 315));
        View inflate = View.inflate(context, R.layout.c9_, this);
        ((TextView) inflate.findViewById(R.id.er8)).setText(inflate.getResources().getString(R.string.dci, language));
        String string = inflate.getResources().getString(R.string.dby);
        o.LJIIIIZZ(string, "resources.getString(\n   …ings_title6\n            )");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(inflate.getResources().getString(R.string.dch));
        int LJJLIIIJL = s.LJJLIIIJL(spannableStringBuilder, string, 0, false, 6);
        if (LJJLIIIJL >= 0) {
            spannableStringBuilder.setSpan(new StyleSpan(1), LJJLIIIJL, string.length() + LJJLIIIJL, 33);
        }
        ((TextView) inflate.findViewById(R.id.m96)).setText(spannableStringBuilder);
        try {
            SettingsManager.LIZLLL().getClass();
            LIZ = SettingsManager.LJI("fixed_caption_half_sheet", "");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        String str = (String) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        W5F LJIIIIZZ = W5U.LJIIIIZZ((str == null || str.length() == 0) ? "https://p16-sg-default.akamaized.net/obj/tiktok-obj/fixed_caption_half_sheet_new.png" : str);
        LJIIIIZZ.LJJIIJ = getIvMain();
        LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_INSIDE;
        C16880lQ.LLJJJ(LJIIIIZZ);
    }
}
