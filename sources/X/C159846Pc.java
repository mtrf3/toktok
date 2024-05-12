package X;

import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Pc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159846Pc {
    public final /* synthetic */ C6PV LIZ;

    public C159846Pc(C6PV c6pv) {
        this.LIZ = c6pv;
    }

    public final void LIZ(int i, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 6) {
                        Iterator it = ((ArrayList) this.LIZ.LJIIL).iterator();
                        while (it.hasNext()) {
                            ((InterfaceC160026Pu) it.next()).LJIJJ();
                        }
                    }
                } else {
                    C6QO LJJJ = C30581Hy.LJJJ(i2, this.LIZ.LJIIJJI);
                    if (LJJJ != null) {
                        C6PV c6pv = this.LIZ;
                        c6pv.LJIIL().LIZIZ().LJJII(LJJJ);
                        C6PV.LJIILLIIL("duration");
                        Iterator it2 = ((ArrayList) c6pv.LJIIL).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC160026Pu) it2.next()).LJ(i2);
                        }
                    }
                }
            } else {
                C6PV c6pv2 = this.LIZ;
                List<InterfaceC160026Pu> list = c6pv2.LJIIL;
                ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator it3 = ((ArrayList) list).iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C160016Pt((InterfaceC160026Pu) it3.next()));
                }
                c6pv2.LJII(i2);
                this.LIZ.getClass();
                C6PV.LJIILLIIL("edit");
            }
        } else {
            StickerModel LIZ = this.LIZ.LIZ(i2, "CLICK_CROSS");
            if (LIZ != null) {
                C6PV c6pv3 = this.LIZ;
                if (LIZ instanceof QAStickerModel) {
                    c6pv3.LJ.LJIIIZ();
                }
            }
            this.LIZ.getClass();
            C6PV.LJIILLIIL("delete");
        }
        C6PV c6pv4 = this.LIZ;
        Iterator it4 = ((ArrayList) c6pv4.LJIIL).iterator();
        while (it4.hasNext()) {
            InterfaceC160026Pu interfaceC160026Pu = (InterfaceC160026Pu) it4.next();
            C6QO LJJJ2 = C30581Hy.LJJJ(i2, c6pv4.LJIIJJI);
            if (LJJJ2 != null) {
                interfaceC160026Pu.LJIJ(LJJJ2.LIZ(), i);
            }
        }
    }
}
