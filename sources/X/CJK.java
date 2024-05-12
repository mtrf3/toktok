package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJK implements InterfaceC75158Tec {
    public final /* synthetic */ CJJ LJLIL;
    public final /* synthetic */ EmoteModel LJLILLLLZI;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
    }

    public CJK(int i, EmoteModel emoteModel, CJJ cjj) {
        this.LJLIL = cjj;
        this.LJLILLLLZI = emoteModel;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        CJJ cjj = this.LJLIL;
        CJN cjn = cjj.LJLJI;
        if (cjn != null) {
            cjn.LJJLIIIJLJLI(cjj.LJLJJI, this.LJLILLLLZI);
        }
    }
}
