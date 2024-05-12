package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IZI extends C46742IWc {
    public IZI(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        C46882Iac player;
        IZG izg;
        Object barrageMaskInfo;
        Object value = IZ8.LLII.getValue();
        o.LJIIIIZZ(value, "<get-enableBarrageMask>(...)");
        if (!((Boolean) value).booleanValue() || (player = this.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        if (map.get("meta_info") != null) {
            izg = (IZG) map.get("meta_info");
        } else {
            izg = null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SourceId: ");
        LIZ.append(this.LJLILLLLZI.getSourceId());
        LIZ.append("，barrageMaskInfo: ");
        if (izg == null) {
            barrageMaskInfo = " null";
        } else {
            barrageMaskInfo = izg.getBarrageMaskInfo();
        }
        LIZ.append(barrageMaskInfo);
        X1D.LIZIZ(LIZ);
        if (izg == null || izg.getBarrageMaskInfo() == null) {
            return;
        }
        IZH barrageMaskInfo2 = izg.getBarrageMaskInfo();
        if (!barrageMaskInfo2.isValid()) {
            return;
        }
        player.LJLLLL(510, 1);
        player.LJLLLL(1300, 1);
        player.LJLLLL(1301, 1);
        player.LJLLLL(1302, 1);
        player.LJJZZIII(barrageMaskInfo2.getBarrageMaskUrl(), barrageMaskInfo2.getFileId());
        if (barrageMaskInfo2.getHeadLen() > 0) {
            player.LJJZZI(barrageMaskInfo2.getHeadLen());
        }
        C46882Iac player2 = this.LJLILLLLZI.getPlayer();
        if (player2 == null) {
            return;
        }
        player2.LLFZ(new IZJ(this));
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJJIII(boolean z) {
        C46882Iac player;
        Object value = IZ8.LLII.getValue();
        o.LJIIIIZZ(value, "<get-enableBarrageMask>(...)");
        if (!((Boolean) value).booleanValue() || (player = this.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        player.LJLLLL(510, 0);
        player.LJJZZIII("", "");
        player.LJJZZI(0);
        player.LLFZ(null);
        player.LJLLLL(499, 0);
    }
}
