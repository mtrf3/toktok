package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.496, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass496 extends AbstractC1036945d<C1023940d> {
    public final C99033ud LIZIZ;
    public final AnonymousClass494 LIZJ;

    @Override // X.AbstractC1036945d
    public final void LIZIZ() {
        TuxSheet tuxSheet;
        AnonymousClass494 anonymousClass494 = this.LIZJ;
        TuxSheet tuxSheet2 = anonymousClass494.LJLJJL;
        if (tuxSheet2 != null && !tuxSheet2.isStateSaved() && (tuxSheet = anonymousClass494.LJLJJL) != null) {
            tuxSheet.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass496(Context context, C99033ud sessionInfo) {
        super(C41X.MEDIA_NUDE_FILTER);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        this.LIZIZ = sessionInfo;
        this.LIZJ = new AnonymousClass494(context);
    }

    @Override // X.AbstractC1036945d
    public final Object LJ(C1023940d c1023940d, InterfaceC67352kd<? super C3WY> interfaceC67352kd) {
        FragmentManager supportFragmentManager;
        AnonymousClass494 anonymousClass494 = this.LIZJ;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(anonymousClass494.LJLIL);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && anonymousClass494.LIZ()) {
            C26224AQy c26224AQy = new C26224AQy();
            C33381Ss c33381Ss = new C33381Ss();
            c33381Ss.LJLIL = R.drawable.bjd;
            c26224AQy.LIZ = c33381Ss.LIZ(anonymousClass494.LJLIL);
            String string = anonymousClass494.LJLIL.getString(R.string.eq8);
            o.LJIIIIZZ(string, "context.getString(R.stri…eFilter_intro_mainHeader)");
            c26224AQy.LJ = string;
            c26224AQy.LIZLLL = 1;
            String string2 = anonymousClass494.LJLIL.getString(R.string.eq9);
            String string3 = anonymousClass494.LJLIL.getString(R.string.eq_);
            o.LJIIIIZZ(string3, "context.getString(R.stri…lter_intro_subhead1_desc)");
            String string4 = anonymousClass494.LJLIL.getString(R.string.eqa);
            String string5 = anonymousClass494.LJLIL.getString(R.string.eqb);
            o.LJIIIIZZ(string5, "context.getString(R.stri…lter_intro_subhead2_desc)");
            String string6 = anonymousClass494.LJLIL.getString(R.string.eqc);
            String string7 = anonymousClass494.LJLIL.getString(R.string.eqd);
            o.LJIIIIZZ(string7, "context.getString(R.stri…lter_intro_subhead3_desc)");
            String string8 = anonymousClass494.LJLIL.getString(R.string.eqe);
            String string9 = anonymousClass494.LJLIL.getString(R.string.eqf);
            o.LJIIIIZZ(string9, "context.getString(R.stri…lter_intro_subhead4_desc)");
            c26224AQy.LIZLLL(new AR6(R.raw.icon_shield_tick, string2, string3), new AR6(R.raw.icon_video, string4, string5), new AR6(R.raw.icon_eye_slash, string6, string7), new AR6(R.raw.icon_gear, string8, string9));
            c26224AQy.LJIILIIL = true;
            String string10 = anonymousClass494.LJLIL.getString(R.string.eq7);
            AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(anonymousClass494, 216);
            c26224AQy.LJII = string10;
            c26224AQy.LJIIIZ = aqS167S0100000_1;
            String string11 = anonymousClass494.LJLIL.getString(R.string.eq6);
            AnonymousClass498 anonymousClass498 = AnonymousClass498.LJLIL;
            c26224AQy.LJIIIIZZ = string11;
            c26224AQy.LJIIJ = anonymousClass498;
            ASL LIZ = c26224AQy.LIZ();
            C49C c49c = new DialogInterface.OnCancelListener() { // from class: X.49C
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    AnonymousClass499.LIZ(0);
                }
            };
            TuxSheet tuxSheet = LIZ.LIZ;
            tuxSheet.LJLIL = c49c;
            tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.497
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface it) {
                    o.LJIIIIZZ(it, "it");
                    if (ASQ.LJIIIIZZ(it) instanceof ASY) {
                        AnonymousClass499.LIZ(2);
                    }
                }
            };
            anonymousClass494.LJLJJL = tuxSheet;
            tuxSheet.show(supportFragmentManager, "DMMediaNudeFilterPopupSheet");
            Keva keva = (Keva) anonymousClass494.LJLJI.getValue();
            String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
            o.LJIIIIZZ(currentUserID, "get().getService(IUserSe…class.java).currentUserID");
            keva.storeBoolean(currentUserID, true);
            C772831o.LIZ().LIZIZ("show_dm_nude_filter_banner", C51029K0z.LJJIIZI(new OSZ("enter_from", "chat")));
        }
        return anonymousClass494;
    }

    @Override // X.AbstractC1036945d
    public final Object LJFF(C1023940d c1023940d, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        boolean z;
        if ((this.LIZ.isDebugMode() || this.LIZJ.LIZ()) && this.LIZIZ.isSingleChat()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
