package X;

import android.content.DialogInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UhD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC77867UhD implements DialogInterface.OnClickListener {
    public final /* synthetic */ C38048EwW LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C77868UhE LJLJI;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C77868UhE c77868UhE = this.LJLJI;
        C38048EwW c38048EwW = this.LJLIL;
        int i2 = 1;
        boolean z = !this.LJLILLLLZI;
        c77868UhE.getClass();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            i2 = 0;
        }
        try {
            jSONObject.put("code", i2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        c77868UhE.LJLIL.LIZLLL(c38048EwW.LIZIZ, jSONObject);
    }

    public DialogInterfaceOnClickListenerC77867UhD(C77868UhE c77868UhE, C38048EwW c38048EwW, boolean z) {
        this.LJLJI = c77868UhE;
        this.LJLIL = c38048EwW;
        this.LJLILLLLZI = z;
    }
}