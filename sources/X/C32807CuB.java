package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.CuB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32807CuB implements InterfaceC76911UGl {
    public final /* synthetic */ C32802Cu6 LIZ;
    public final /* synthetic */ C32816CuK LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC76911UGl
    public final void LIZ() {
        C32825CuT c32825CuT;
        String str;
        String str2 = this.LIZ.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showNewConfirmDialog sendGiftWithRetrofit ");
        FT5.LJ(LIZ, this.LIZJ, LIZ, str2);
        LinkedList<UVP> linkedList = this.LIZIZ.LIZ;
        C32802Cu6 c32802Cu6 = this.LIZ;
        boolean z = this.LIZJ;
        Iterator<UVP> it = linkedList.iterator();
        while (it.hasNext()) {
            UV2 uv2 = it.next().LIZ;
            if ((uv2 instanceof C32825CuT) && (c32825CuT = (C32825CuT) uv2) != null) {
                UVW uvw = UVW.LJI;
                Gift gift = c32825CuT.LJIILLIIL;
                Room room = c32825CuT.LJIIZILJ;
                C32822CuQ c32822CuQ = c32825CuT.LJIJ;
                String str3 = c32825CuT.LJIIL;
                HashMap LJIIJ = V16.LJIIJ(c32825CuT.LJIIZILJ, c32802Cu6.LJI());
                boolean z2 = c32825CuT.LJIJI;
                if (z) {
                    str = "first_popup_new";
                } else {
                    str = "first_popup";
                }
                uvw.LIZ(new C32825CuT(gift, room, c32822CuQ, str3, LJIIJ, z2, str, c32825CuT.LJJIIJ, true), null, null, null, null, null);
            }
        }
    }

    @Override // X.InterfaceC76911UGl
    public final boolean LIZIZ() {
        boolean LJIILJJIL = this.LIZ.LJIILJJIL(this.LIZIZ);
        String str = this.LIZ.LIZLLL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showNewConfirmDialog isEnoughBalance: ");
        FT5.LJ(LIZ, !LJIILJJIL, LIZ, str);
        return !LJIILJJIL;
    }

    public C32807CuB(C32802Cu6 c32802Cu6, C32816CuK c32816CuK, boolean z) {
        this.LIZ = c32802Cu6;
        this.LIZIZ = c32816CuK;
        this.LIZJ = z;
    }
}
