package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.Ubc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77520Ubc extends AbstractC77528Ubk implements InterfaceC77535Ubr {
    public static final java.util.Map<Integer, InterfaceC77521Ubd> LJIILL = C113554cx.LJJL(new OSZ(0, new C77534Ubq()), new OSZ(1, new C77533Ubp()));
    public Context LIZ;
    public final InterfaceC77524Ubg LIZIZ;
    public SpannableStringBuilder LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final java.util.Map<String, ? extends CustomErrorExtra.PopContentReplace> LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public Runnable LJIIJJI;
    public Runnable LJIIL;
    public final UI8 LJIILIIL;
    public final InterfaceC77521Ubd LJIILJJIL;

    @Override // X.InterfaceC77535Ubr
    public final void LIZ(String url) {
        o.LJIIIZ(url, "url");
        InterfaceC77524Ubg interfaceC77524Ubg = this.LIZIZ;
        if (interfaceC77524Ubg != null) {
            interfaceC77524Ubg.LIZJ();
        }
        LIZIZ(url, "secondary_cta");
    }

    public final void LIZIZ(String url, String str) {
        String LJII;
        o.LJIIIZ(url, "url");
        C32362Cn0 c32362Cn0 = new C32362Cn0(url);
        UI8 ui8 = this.LJIILIIL;
        if (ui8 != null) {
            int i = ui8.LIZIZ;
            if (i == 4005189 || i == 4005272) {
                LJII = "wallet_appeal";
            } else {
                LJII = C77541Ubx.LJII(ui8);
            }
            c32362Cn0.LIZIZ.LIZJ("enter_from", LJII);
            C77541Ubx.LJIJJ(ui8, url, str);
        }
        ((InterfaceC32361Cmz) C77607Ud1.LJ.getValue()).LIZIZ(this.LIZ, c32362Cn0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77520Ubc(Context context, CustomErrorExtra customErrorExtra, InterfaceC77524Ubg interfaceC77524Ubg, UI8 ui8) {
        super(interfaceC77524Ubg);
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = interfaceC77524Ubg;
        this.LJ = "";
        this.LJFF = "";
        this.LJI = "";
        this.LJIIIZ = 1;
        this.LIZLLL = customErrorExtra.getPopUpTitle();
        String popUpContent = customErrorExtra.getPopUpContent();
        this.LJ = popUpContent == null ? "" : popUpContent;
        String popUpDismiss = customErrorExtra.getPopUpDismiss();
        this.LJFF = popUpDismiss == null ? "" : popUpDismiss;
        String popUpPrimaryCTA = customErrorExtra.getPopUpPrimaryCTA();
        this.LJI = popUpPrimaryCTA != null ? popUpPrimaryCTA : "";
        this.LJII = customErrorExtra.getPopUpPrimaryCTASchema();
        this.LJIIIIZZ = customErrorExtra.getContentReplace();
        InterfaceC77521Ubd interfaceC77521Ubd = LJIILL.get(Integer.valueOf(customErrorExtra.getPopUpStyle()));
        this.LJIILJJIL = interfaceC77521Ubd == null ? new C77534Ubq() : interfaceC77521Ubd;
        this.LJIIIZ = customErrorExtra.getPopUpDismissAction().intValue();
        this.LJIIJ = customErrorExtra.getPopUpPrimaryAction().intValue();
        customErrorExtra.getExtraEntity();
        this.LJIILIIL = ui8;
    }
}
