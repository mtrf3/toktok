package X;

import android.content.Context;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86413Xvl extends AbstractC86411Xvj {
    public final C86412Xvk LIZJ = new C86412Xvk();

    @Override // X.AbstractC86411Xvj
    public final void LJIIIIZZ(C86415Xvn c86415Xvn, C86410Xvi c86410Xvi, EnumC37847EtH type) {
        int hashCode;
        int i;
        o.LJIIIZ(type, "type");
        Context context = (Context) LJII(Context.class);
        if (context == null) {
            c86410Xvi.LIZ(0, "Context is null.");
            return;
        }
        String str = c86415Xvn.LIZIZ;
        Locale locale = Locale.ENGLISH;
        String LIZJ = OKG.LIZJ(locale, "ENGLISH", str, locale, "this as java.lang.String).toUpperCase(locale)");
        try {
            hashCode = LIZJ.hashCode();
        } catch (Exception unused) {
            c86410Xvi.LIZ(0, "Can not get vibrate service.");
        }
        if (hashCode != 682443965) {
            if (hashCode != 1177358740) {
                if (hashCode == 1477167247 && LIZJ.equals("NOTIFICATION_SUCCESS")) {
                    i = 2;
                    new C61996OUu(context).LIZ(i);
                    c86410Xvi.LIZIZ(new C61335O5j());
                }
                C86412Xvk c86412Xvk = this.LIZJ;
                c86412Xvk.LIZ = this.LIZ;
                c86412Xvk.LJIIIIZZ(c86415Xvn, c86410Xvi, type);
                c86410Xvi.LIZIZ(new C61335O5j());
            }
            if (LIZJ.equals("NOTIFICATION_ERROR")) {
                i = 3;
                new C61996OUu(context).LIZ(i);
                c86410Xvi.LIZIZ(new C61335O5j());
            } else {
                C86412Xvk c86412Xvk2 = this.LIZJ;
                c86412Xvk2.LIZ = this.LIZ;
                c86412Xvk2.LJIIIIZZ(c86415Xvn, c86410Xvi, type);
                c86410Xvi.LIZIZ(new C61335O5j());
            }
        }
        if (!LIZJ.equals("IMPACT_LIGHT")) {
            C86412Xvk c86412Xvk22 = this.LIZJ;
            c86412Xvk22.LIZ = this.LIZ;
            c86412Xvk22.LJIIIIZZ(c86415Xvn, c86410Xvi, type);
            c86410Xvi.LIZIZ(new C61335O5j());
        }
        i = 0;
        new C61996OUu(context).LIZ(i);
        c86410Xvi.LIZIZ(new C61335O5j());
    }
}
