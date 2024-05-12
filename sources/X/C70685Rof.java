package X;

import android.text.SpannableString;
import kotlin.jvm.internal.o;

/* renamed from: X.Rof, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70685Rof extends AbstractC65781Prl implements InterfaceC88472Yns<CharSequence, SpannableString> {
    public static final C70685Rof LJLIL = new C70685Rof();

    public C70685Rof() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final SpannableString invoke(CharSequence charSequence) {
        CharSequence it = charSequence;
        o.LJIIIZ(it, "it");
        SpannableString valueOf = SpannableString.valueOf(it);
        o.LJIIIIZZ(valueOf, "valueOf(it)");
        return valueOf;
    }
}
