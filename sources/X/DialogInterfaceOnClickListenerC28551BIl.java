package X;

import android.content.DialogInterface;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BIl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogInterfaceOnClickListenerC28551BIl implements DialogInterface.OnClickListener {
    public static final DialogInterfaceOnClickListenerC28551BIl LJLIL = new DialogInterfaceOnClickListenerC28551BIl();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        dialog.dismiss();
        HashMap hashMap = new HashMap();
        hashMap.put("choose_type", "dismiss");
        C75017TcL.LJJI("guest_connection_underage_popup", "click", hashMap);
    }
}
