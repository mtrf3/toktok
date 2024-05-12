package X;

import android.content.Context;
import android.content.DialogInterface;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UaT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogInterfaceOnClickListenerC77449UaT implements DialogInterface.OnClickListener {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;

    public DialogInterfaceOnClickListenerC77449UaT(Context context, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C77448UaS.LIZ(1, "anchor_income", this.LJLIL, true);
        C77448UaS.LIZIZ(2, "anchor_income", this.LJLIL);
        C77437UaH c77437UaH = new C77437UaH(this.LJLILLLLZI);
        c77437UaH.LJJII = false;
        c77437UaH.LJI(R.string.kbu);
        c77437UaH.LJ(R.string.l4p, new DialogInterfaceOnClickListenerC77450UaU(2, this.LJLIL), false);
        c77437UaH.LIZJ(R.string.l3z, new DialogInterfaceOnClickListenerC77451UaV(2, this.LJLIL), false);
        DialogC77438UaI LIZ = c77437UaH.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-4025445571513062495")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
