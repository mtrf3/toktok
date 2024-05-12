package Y;

import X.C68322mC;
import X.C76469Tzl;
import X.C76470Tzm;
import X.C77472Uaq;
import X.C77473Uar;
import X.C77476Uau;
import X.InterfaceC30442Bx8;
import X.InterfaceC65784Pro;
import X.InterfaceC77474Uas;
import X.UDJ;
import X.UDL;
import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.DialogMethod;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class IDCListenerS53S0200000_13 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS53S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onClick$0(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        ((MultiGuestV3GuestWidget) iDCListenerS53S0200000_13.l0).exitInteractNormal((Runnable) iDCListenerS53S0200000_13.l1, false);
    }

    public static final void onClick$1(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialogInterface, int i) {
        ((DialogMethod) iDCListenerS53S0200000_13.l0).finishWithResult(new DialogMethod.Result(1, "right"));
        ((InterfaceC65784Pro) ((C68322mC) iDCListenerS53S0200000_13.l1).element).invoke();
    }

    public static final void onClick$2(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialogInterface, int i) {
        ((DialogMethod) iDCListenerS53S0200000_13.l0).finishWithResult(new DialogMethod.Result(1, "left"));
        ((InterfaceC65784Pro) ((C68322mC) iDCListenerS53S0200000_13.l1).element).invoke();
    }

    public static final void onClick$3(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        ((VoiceChatWatchWidget) iDCListenerS53S0200000_13.l0).LL((Runnable) iDCListenerS53S0200000_13.l1, false, "live_end", true);
    }

    public static final void onClick$4(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialogInterface, int i) {
        InterfaceC77474Uas interfaceC77474Uas = (InterfaceC77474Uas) iDCListenerS53S0200000_13.l0;
        if (interfaceC77474Uas != null) {
            C77472Uaq c77472Uaq = ((C77473Uar) interfaceC77474Uas).LIZ;
            c77472Uaq.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("complete", 2);
            } catch (JSONException unused) {
                c77472Uaq.finishWithFailure();
            }
            c77472Uaq.finishWithResult(jSONObject);
        }
        C77476Uau.LIZJ((TaxDialogParams) iDCListenerS53S0200000_13.l1, "go_back");
    }

    public static final void onClick$5(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialogInterface, int i) {
        InterfaceC30442Bx8.LLIILZL.LIZ(((C68322mC) iDCListenerS53S0200000_13.l0).element);
        ((C76470Tzm) iDCListenerS53S0200000_13.l1).LLIILII.LJIIZILJ();
    }

    public static final void onClick$6(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialogInterface, int i) {
        InterfaceC30442Bx8.LLIILZL.LIZ(((C68322mC) iDCListenerS53S0200000_13.l0).element);
        ((C76469Tzl) iDCListenerS53S0200000_13.l1).LLII.LJIIZILJ();
    }

    public static final void onClick$7(IDCListenerS53S0200000_13 iDCListenerS53S0200000_13, DialogInterface dialogInterface, int i) {
        UDL udl = (UDL) iDCListenerS53S0200000_13.l0;
        UDJ udj = (UDJ) iDCListenerS53S0200000_13.l1;
        udl.getClass();
        udj.execute();
        udl.LJI();
    }
}
