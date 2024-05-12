package X;

import android.util.SparseIntArray;

/* renamed from: X.IYq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46808IYq extends C46742IWc {
    public C46808IYq(InterfaceC46804IYm interfaceC46804IYm) {
        super(interfaceC46804IYm);
    }

    @Override // X.C46742IWc, X.IZT
    public final void LJIIZILJ(java.util.Map<String, Object> map) {
        IXO ixo;
        int intValue;
        C46882Iac player = this.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        SparseIntArray s7 = this.LJLILLLLZI.s7();
        C47282Ih4 q7 = this.LJLILLLLZI.q7();
        C78926UyI.LJJIIJ("header_url", map);
        Object obj = map.get("header_dashinfo");
        if (obj instanceof IXO) {
            ixo = (IXO) obj;
        } else {
            ixo = null;
        }
        boolean LJJIIZ = C78926UyI.LJJIIZ(ixo);
        if (ixo != null && ixo.LJIILIIL) {
            player.LJLLLL(0, q7.LJIIZILJ);
        } else if (LJJIIZ) {
            if (s7.indexOfKey(56) >= 0) {
                player.LJLLLL(0, s7.get(56));
            } else {
                player.LJLLLL(0, 15);
            }
        } else if (s7.indexOfKey(33) >= 0) {
            player.LJLLLL(0, s7.get(33));
        } else {
            player.LJLLLL(0, 15);
        }
        try {
            if (map.get("cache_duration") != null && (intValue = ((Integer) map.get("cache_duration")).intValue()) != -1) {
                player.LJLLLL(0, intValue);
            }
        } catch (Exception unused) {
        }
    }
}
