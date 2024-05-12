package X;

import Y.IDDListenerS144S0100000_4;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("tiktok_beta_app_ready")
/* renamed from: X.A1c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25552A1c extends M71 {
    public static final String LJLJI;
    public static final Keva LJLJJI;
    public final int LJLIL;
    public TuxSheet LJLILLLLZI;

    static {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sheet_beta_ready_showed-");
        LJLJI = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
        LJLJJI = Keva.getRepo("beta_testing");
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLIL;
    }

    public C25552A1c(InterfaceC55643Lsd interfaceC55643Lsd) {
        super(interfaceC55643Lsd);
        this.LJLIL = 491;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        Context context2 = context.LIZ;
        int LIZIZ = C7MY.LIZIZ(62);
        C26224AQy c26224AQy = new C26224AQy();
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_tiktok_beta;
        c2068389v.LIZIZ = LIZIZ;
        c2068389v.LIZJ = LIZIZ;
        SY9 LIZ = c2068389v.LIZ(context2);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LJII = LIZIZ;
        c110614Vt.LJI = LIZIZ;
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d4);
        c110614Vt.LIZJ = C61328O5c.LIZJ(16);
        c26224AQy.LIZ = C26338AVi.LJIIJ(LIZ, c110614Vt.LIZ(context2));
        c26224AQy.LIZLLL = 2;
        String string = context2.getString(R.string.c6e);
        o.LJIIIIZZ(string, "ctx.getString(R.string.b…oid_success_popup_header)");
        c26224AQy.LJ = string;
        String string2 = context2.getString(R.string.c6d);
        o.LJIIIIZZ(string2, "ctx.getString(R.string.b…droid_success_popup_desc)");
        c26224AQy.LIZIZ(string2);
        String string3 = context2.getString(R.string.c68);
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(context2, 1227);
        c26224AQy.LJII = string3;
        c26224AQy.LJIIIZ = aqS170S0100000_4;
        c26224AQy.LJIILIIL = true;
        ASL LIZ2 = c26224AQy.LIZ();
        IDDListenerS144S0100000_4 iDDListenerS144S0100000_4 = new IDDListenerS144S0100000_4(wrapper, 16);
        TuxSheet tuxSheet = LIZ2.LIZ;
        tuxSheet.LJLILLLLZI = iDDListenerS144S0100000_4;
        this.LJLILLLLZI = tuxSheet;
        Object obj = this.scene;
        o.LJII(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        FragmentManager fragmentManager = ((Fragment) obj).getFragmentManager();
        if (fragmentManager != null) {
            TuxSheet tuxSheet2 = this.LJLILLLLZI;
            if (tuxSheet2 != null) {
                tuxSheet2.show(fragmentManager, (String) null);
            }
            LJLJJI.storeBoolean(LJLJI, true);
            return;
        }
        wrapper.LIZ();
    }
}
