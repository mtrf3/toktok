package X;

import Y.ACListenerS28S0100000_8;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.J8a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48664J8a extends C25849ACn {
    public final String LJLJJL;
    public final String LJLJJLL;
    public final C2068389v LJLJL;

    @Override // X.C25849ACn
    /* renamed from: LJIIJJI */
    public final C25848ACm LJIIIIZZ() {
        C2068389v c2068389v = this.LJLJL;
        return new C25848ACm(C88547Yp5.LIZIZ.LJJI(), this.LJLJJL, new ACListenerS28S0100000_8(this, 92), false, null, null, c2068389v, this.LJLJJLL, false, false, false, null, 64248);
    }

    @Override // X.C25849ACn, X.AG6
    public final /* bridge */ /* synthetic */ C25848ACm LJIIIIZZ() {
        return LJIIIIZZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48664J8a(Fragment fragment) {
        super(null);
        o.LJIIIZ(fragment, "fragment");
        String string = fragment.getString(R.string.jc4);
        o.LJIIIIZZ(string, "fragment.getString(R.str…enonmute_settings_header)");
        this.LJLJJL = string;
        String string2 = fragment.getString(R.string.jc3);
        o.LJIIIIZZ(string2, "fragment.getString(R.str…openonmute_settings_desc)");
        this.LJLJJLL = string2;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(18));
        c2068389v.LJ = Integer.valueOf(R.attr.gp);
        c2068389v.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
        this.LJLJL = c2068389v;
    }
}
