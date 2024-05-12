package X;

import Y.IDCSpanS30S0100000_4;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS104S0101000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9lm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246429lm extends AbstractC65781Prl implements InterfaceC88472Yns<M78, C76800UCe> {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C246429lm(int i, View view, AqS104S0101000_4 aqS104S0101000_4) {
        super(1);
        this.LJLIL = view;
        this.LJLILLLLZI = i;
        this.LJLJI = aqS104S0101000_4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(M78 m78) {
        M78 wrapper = m78;
        o.LJIIIZ(wrapper, "wrapper");
        AKH akh = new AKH((ViewGroup) this.LJLIL);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_music_note_s_alt;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), false);
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "parent.context");
        String string = context.getString(R.string.ifd);
        o.LJIIIIZZ(string, "context.getString(R.stri…b_newSongAddedPrompt_cta)");
        String string2 = context.getString(R.string.ife);
        o.LJIIIIZZ(string2, "context.getString(R.stri…newSongAddedPrompt_title)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new IDCSpanS30S0100000_4(context, 5), 0, spannableString.length(), 17);
        SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) spannableString);
        o.LJIIIIZZ(append, "builder.append(clickableSpan)");
        A21 a21 = akh.LIZ;
        a21.LJ = append;
        a21.LJIIIZ = 0;
        a21.LJIILIIL = true;
        a21.LIZJ = false;
        a21.LJIIIIZZ = this.LJLILLLLZI;
        akh.LIZ.LJIIL = new AqS170S0100000_4(wrapper, 1420);
        C246349le.LIZ = akh;
        akh.LIZIZ();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "personal_homepage");
        FMX.LJIIL("artist_popup_show", c188727au.LIZ);
        return C76800UCe.LIZ;
    }
}
