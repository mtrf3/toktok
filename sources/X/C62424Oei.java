package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oei, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62424Oei extends AbstractC62223ObT {
    @Override // X.InterfaceC62225ObV
    public final boolean LIZ(Context context, AbstractC62625Ohx content) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(content, "content");
        return true;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJII(C62313Ocv content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final boolean LJIILIIL(C62314Ocw content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        return false;
    }

    @Override // X.InterfaceC62225ObV
    public final String key() {
        return "contact_list";
    }

    @Override // X.InterfaceC62225ObV
    public final String label() {
        String LJFF = C86V.LJFF(R.string.pyb);
        o.LJIIIIZZ(LJFF, "getString(R.string.referral_invite_contacts)");
        return LJFF;
    }

    @Override // X.InterfaceC62225ObV
    public final Drawable LIZJ(Context context) {
        if (context != null) {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_contact_circle;
            return c2068389v.LIZ(context);
        }
        return null;
    }

    public static void LJIJJLI(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("position", "contacts_list");
        c188727au.LJIIIZ("button_name", str2);
        FMX.LJIIL("leave_page_click", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // X.InterfaceC62225ObV
    public final boolean LJI(C62224ObU content, Context context, InterfaceC62573Oh7 interfaceC62573Oh7) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        String LJIJI = AbstractC62223ObT.LJIJI(content);
        Bundle bundle = new Bundle();
        C68322mC c68322mC = new C68322mC();
        String str = "";
        c68322mC.element = "";
        if (content instanceof C62079OXz) {
            Bundle bundle2 = ((C62079OXz) content).LIZLLL;
            ?? r3 = str;
            if (bundle2 != null) {
                String string = bundle2.getString("enter_from");
                r3 = str;
                if (string != null) {
                    r3 = string;
                }
            }
            c68322mC.element = r3;
            bundle.putString("enter_from", r3);
        }
        C57135Mbb.LIZIZ.LIZ(context, bundle, LJIJI, C86V.LJFF(R.string.pyc), new AqS157S0200000_10(this, (C62424Oei) c68322mC, (C68322mC<String>) 35), new AqS157S0200000_10(this, (C62424Oei) c68322mC, (C68322mC<String>) 36)).show();
        return true;
    }
}
