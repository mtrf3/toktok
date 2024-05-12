package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class TTP implements TY4 {
    public final /* synthetic */ TTO LJLIL;

    @Override // X.TY4
    public final void LJJLJ() {
    }

    @Override // X.TY4
    public final boolean LLLLLLLLL() {
        return true;
    }

    @Override // X.TY4
    public final void LLILLJJLI() {
        TV2.LJII(this.LJLIL.LJLILLLLZI.LIZJ(), this.LJLIL.LJLILLLLZI.LJIIL(), true);
    }

    public TTP(TTO tto) {
        this.LJLIL = tto;
    }

    @Override // X.TY4
    public final void LJJLIIIJL(Throwable th) {
        BPP.LIZLLL(this.LJLIL.LJLIL, th, R.string.stz);
    }

    @Override // X.TY4
    public final void LLLLIILL(boolean z) {
        DataChannel LJIIL;
        if (z && (LJIIL = this.LJLIL.LJLILLLLZI.LJIIL()) != null) {
            TV2.LJII(this.LJLIL.LJLILLLLZI.LIZJ(), LJIIL, false);
        }
    }
}
