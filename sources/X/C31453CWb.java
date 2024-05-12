package X;

import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import Y.IDTListenerS115S0100000_5;
import Y.IDrS45S0100000_5;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CWb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31453CWb {
    public final RecyclerView LIZ;
    public final C47121t6 LIZIZ;
    public final DataChannel LIZJ;
    public final boolean LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public int LJFF;
    public int LJI;
    public EnumC31433CVh LJII;
    public boolean LJIIIIZZ;
    public final LinearLayoutManager LJIIIZ;

    public final void LIZIZ() {
        int i;
        AbstractC029409q adapter = this.LIZ.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        this.LIZ.LJLIL(i);
        this.LJI = i;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void LIZ(int i) {
        LIZJ(this.LJFF + i);
        if (this.LJFF >= 300) {
            this.LJII = EnumC31433CVh.NORMAL;
            LIZJ(0);
        }
        if (EnumC31433CVh.NORMAL == this.LJII || this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            LIZIZ();
        }
    }

    public final void LIZJ(int i) {
        String str;
        if (EnumC31433CVh.NORMAL == this.LJII || i <= 0) {
            this.LIZIZ.setVisibility(4);
            this.LJFF = 0;
            return;
        }
        this.LJFF = i;
        if (i < 100) {
            str = String.valueOf(i);
        } else {
            str = "99+";
        }
        this.LIZIZ.setText(C15380j0.LJIIIIZZ(R.plurals.kg, i, str));
        if (this.LIZIZ.getVisibility() != 0) {
            this.LIZIZ.post(new ARunnableS41S0100000_5(this, 333));
        }
    }

    public static void LIZLLL(C31453CWb c31453CWb, EnumC31433CVh state, int i) {
        boolean z;
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        c31453CWb.getClass();
        o.LJIIIZ(state, "state");
        if (c31453CWb.LJII == state) {
            return;
        }
        c31453CWb.LJII = state;
        if (EnumC31433CVh.NORMAL != state) {
            return;
        }
        c31453CWb.LIZJ(0);
        if (!z) {
            return;
        }
        c31453CWb.LIZIZ();
    }

    public C31453CWb(C31255COl recyclerView, C47121t6 c47121t6, DataChannel dataChannel, boolean z, C31444CVs c31444CVs) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LIZ = recyclerView;
        this.LIZIZ = c47121t6;
        this.LIZJ = dataChannel;
        this.LIZLLL = z;
        this.LJ = c31444CVs;
        this.LJII = EnumC31433CVh.NORMAL;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        this.LJIIIZ = (LinearLayoutManager) layoutManager;
        C16880lQ.LJJIIZ(c47121t6, new ACListenerS25S0100000_5(this, 442));
        recyclerView.setOnTouchListener(new IDTListenerS115S0100000_5(this, 23));
        recyclerView.setOnFlingListener(new C31454CWc(this));
        recyclerView.LJIIJJI(new IDrS45S0100000_5(this, 11));
    }
}
