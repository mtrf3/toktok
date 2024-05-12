package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JSW extends JSY {
    public final float LJIIL;
    public final JSO LJIILIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSW(JSO groupCard) {
        super(groupCard);
        o.LJIIIZ(groupCard, "groupCard");
        this.LJIIL = 30.0f;
        this.LJIILIIL = groupCard;
    }

    @Override // X.C49189JSf, X.JSL
    public final void LIZIZ(int i, InterfaceC49186JSc interfaceC49186JSc) {
        C0A2 c0a2;
        C49133JQb.LIZ("HorizontalHotSpotFallbackAgent", Integer.valueOf(i));
        if (i == -1) {
            return;
        }
        RecyclerView recyclerView = this.LIZLLL;
        LinearLayoutManager linearLayoutManager = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        if (c0a2 instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) c0a2;
        }
        int LIZ = (int) C74275TDb.LIZ(this.LJIIL);
        if (linearLayoutManager != null) {
            linearLayoutManager.LJFF(i, LIZ);
        }
        RecyclerView recyclerView2 = this.LIZLLL;
        if (recyclerView2 != null) {
            if (C16330kX.LIZJ(recyclerView2) && !recyclerView2.isLayoutRequested()) {
                LJIIIZ(i, interfaceC49186JSc);
            } else {
                recyclerView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC49184JSa(this, i, interfaceC49186JSc));
            }
        }
    }
}
