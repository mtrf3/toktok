package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.wallet.model.TaxDialogParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Uat, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC77475Uat implements DialogInterface.OnClickListener {
    public final /* synthetic */ InterfaceC77474Uas LJLIL;
    public final /* synthetic */ TaxDialogParams LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    public DialogInterfaceOnClickListenerC77475Uat(Context context, C77473Uar c77473Uar, TaxDialogParams taxDialogParams) {
        this.LJLIL = c77473Uar;
        this.LJLILLLLZI = taxDialogParams;
        this.LJLJI = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        User user;
        InterfaceC77474Uas interfaceC77474Uas = this.LJLIL;
        if (interfaceC77474Uas != null) {
            C77472Uaq c77472Uaq = ((C77473Uar) interfaceC77474Uas).LIZ;
            c77472Uaq.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("complete", 1);
            } catch (JSONException unused) {
                c77472Uaq.finishWithFailure();
            }
            c77472Uaq.finishWithResult(jSONObject);
        }
        C77476Uau.LIZJ(this.LJLILLLLZI, "continue");
        Context context = this.LJLJI;
        TaxDialogParams taxDialogParams = this.LJLILLLLZI;
        if (!(context instanceof Activity)) {
            return;
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        C32364Cn2 c32364Cn2 = new C32364Cn2(taxDialogParams.taxSchema);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        c32364Cn2.LIZJ("display_id", C05170If.LJ(user));
        c32364Cn2.LIZJ("exchange_source", taxDialogParams.exchangeSource);
        c32364Cn2.LIZJ("exchange_way", taxDialogParams.exchangeWay);
        c32364Cn2.LIZ(taxDialogParams.isAutoExchange, "is_auto");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, c32364Cn2.LIZLLL());
    }
}
