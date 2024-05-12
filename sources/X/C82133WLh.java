package X;

import Y.ARunnableS18S0101000_14;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.WLh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82133WLh implements InterfaceC83388Wo4 {
    public final /* synthetic */ C83374Wnq LIZ;

    @Override // X.InterfaceC83388Wo4
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC83388Wo4
    public final void LIZ() {
        C83374Wnq c83374Wnq = this.LIZ;
        c83374Wnq.LLFFF = false;
        if (!c83374Wnq.LJLILLLLZI.isShowing(c83374Wnq.LJLLJ)) {
            return;
        }
        Iterator<InterfaceC83391Wo7> it = this.LIZ.LLFZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(false);
        }
        InterfaceC83370Wnm interfaceC83370Wnm = this.LIZ.LJLJJL;
        if (interfaceC83370Wnm != null) {
            interfaceC83370Wnm.uU((int) (C81184Vtc.LIZLLL(C60903NvH.LJ) * 0.65d));
        }
        ViewGroup.LayoutParams layoutParams = this.LIZ.LJLLJ.LLJILJIL().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "actionAIScene.getBottomMask().layoutParams");
        layoutParams.height = C7MY.LIZIZ(100);
        this.LIZ.LJLLJ.LLJILJIL().setLayoutParams(layoutParams);
    }

    public C82133WLh(C83374Wnq c83374Wnq) {
        this.LIZ = c83374Wnq;
    }

    @Override // X.InterfaceC83388Wo4
    public final void keyBoardShow(int i) {
        C83374Wnq c83374Wnq = this.LIZ;
        c83374Wnq.LLFFF = true;
        if (!c83374Wnq.LJLILLLLZI.isShowing(c83374Wnq.LJLLJ)) {
            return;
        }
        Iterator<InterfaceC83391Wo7> it = this.LIZ.LLFZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(true);
        }
        C83374Wnq c83374Wnq2 = this.LIZ;
        View view = c83374Wnq2.LJLLJ.mView;
        if (view != null) {
            view.post(new ARunnableS18S0101000_14(i, c83374Wnq2, 3));
        }
        ViewGroup.LayoutParams layoutParams = this.LIZ.LJLLJ.LLJILJIL().getLayoutParams();
        o.LJIIIIZZ(layoutParams, "actionAIScene.getBottomMask().layoutParams");
        layoutParams.height = C7MY.LIZIZ(56);
        this.LIZ.LJLLJ.LLJILJIL().setLayoutParams(layoutParams);
    }
}
