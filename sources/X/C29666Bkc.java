package X;

import Y.IDCListenerS159S0100000_5;
import Y.IDCListenerS49S0200000_5;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;

/* renamed from: X.Bkc */
/* loaded from: classes6.dex */
public final class C29666Bkc extends AbstractC29665Bkb<RoomDecoration> {
    public final DataChannel LLIIIJ;
    public RoomDecoration LLIIIL;

    public static void LJLJI(DialogC77438UaI dialogC77438UaI) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveModalDialog", "show", dialogC77438UaI, new Object[0], "void", new C65300Pk0(false, "()V", "6953465786607150537")).LIZ) {
            return;
        }
        dialogC77438UaI.show();
    }

    @Override // X.AbstractC29665Bkb
    public final void LJJZ() {
    }

    @Override // X.AbstractC29665Bkb
    public final View LJJZZIII() {
        return C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.d1w, this, false);
    }

    @Override // X.AbstractC29665Bkb
    public final void LJJLJLI() {
        super.LJJLJLI();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    @Override // X.AbstractC29665Bkb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29666Bkc.LJL(android.view.View):void");
    }

    public static /* synthetic */ void LJLIL(C29666Bkc c29666Bkc, DialogInterface dialogInterface) {
        c29666Bkc.getClass();
        dialogInterface.dismiss();
        super.LJJLJLI();
    }

    @Override // X.AbstractC29665Bkb
    public final void LJJLL(AqS155S0100000_5 aqS155S0100000_5, AqS155S0100000_5 aqS155S0100000_52) {
        C77437UaH c77437UaH = new C77437UaH(getContext());
        c77437UaH.LJI(R.string.nou);
        c77437UaH.LIZIZ(R.string.kxf);
        c77437UaH.LJ(R.string.nor, new IDCListenerS49S0200000_5(this, aqS155S0100000_5, 8), false);
        c77437UaH.LIZJ(R.string.snz, new IDCListenerS159S0100000_5(aqS155S0100000_52, 19), false);
        c77437UaH.LJIILL = new DialogInterface.OnDismissListener() { // from class: X.Bke
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BKY.LIZIZ().LJ();
            }
        };
        c77437UaH.LJIILLIIL = new DialogInterface.OnShowListener() { // from class: X.Bkf
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                BKY.LIZIZ().LIZ();
            }
        };
        LJLJI(c77437UaH.LIZ());
    }

    public static /* synthetic */ void LJLILLLLZI(C29666Bkc c29666Bkc, InterfaceC65784Pro interfaceC65784Pro, DialogInterface dialogInterface) {
        c29666Bkc.getClass();
        dialogInterface.dismiss();
        super.LJJLJLI();
        interfaceC65784Pro.invoke();
    }

    public C29666Bkc(Context context, RoomDecoration roomDecoration, boolean z, int[] iArr, InterfaceC29661BkX interfaceC29661BkX, boolean z2, DataChannel dataChannel) {
        super(context, roomDecoration, z, iArr, interfaceC29661BkX, z2);
        this.LLIIIJ = dataChannel;
    }
}
