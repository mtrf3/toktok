package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class JSY extends C49189JSf {
    public final JSO LJIIJJI;

    public JSY(JSO groupCard) {
        o.LJIIIZ(groupCard, "groupCard");
        this.LJIIJJI = groupCard;
    }

    @Override // X.C49189JSf
    public final void LJIIIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        InterfaceC49148JQq interfaceC49148JQq;
        C49197JSn c49197JSn;
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView == null) {
            super.LJIIIZ(i, interfaceC49186JSc);
            return;
        }
        Object LJJIZ = recyclerView.LJJIZ(i);
        if (LJJIZ instanceof InterfaceC49148JQq) {
            interfaceC49148JQq = (InterfaceC49148JQq) LJJIZ;
        } else {
            interfaceC49148JQq = null;
        }
        if (interfaceC49148JQq == null) {
            return;
        }
        Taco LIZ = C49218JTi.LIZ(recyclerView, false);
        if (LIZ != null && (c49197JSn = LIZ.LJLILLLLZI) != null) {
            c49197JSn.y0(C47261Igj.LJJIJ(this.LJIIJJI));
        }
        if (interfaceC49186JSc != null) {
            interfaceC49186JSc.LIZ(interfaceC49148JQq);
        }
    }
}
