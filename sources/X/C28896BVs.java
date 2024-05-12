package X;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BVs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28896BVs extends C0A6 implements C0A3, Handler.Callback {
    public final RecyclerView LJLIL;
    public final long LJLILLLLZI = 1000;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 346));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 345));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C2307093q.LJLIL);
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJLL;

    public C28896BVs(RecyclerView recyclerView) {
        this.LJLIL = recyclerView;
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        RecyclerView.ViewHolder LJJJJJL;
        o.LJIIIZ(view, "view");
        try {
            RecyclerView recyclerView = this.LJLIL;
            if (recyclerView != null && (LJJJJJL = recyclerView.LJJJJJL(view)) != null) {
                ((java.util.Set) this.LJLJJL.getValue()).remove(Integer.valueOf(LJJJJJL.getBindingAdapterPosition()));
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        RecyclerView.ViewHolder LJJJJJL;
        o.LJIIIZ(view, "view");
        try {
            RecyclerView recyclerView = this.LJLIL;
            if (recyclerView != null && (LJJJJJL = recyclerView.LJJJJJL(view)) != null) {
                ((java.util.Set) this.LJLJJL.getValue()).add(Integer.valueOf(LJJJJJL.getBindingAdapterPosition()));
                ((Handler) this.LJLJJI.getValue()).sendEmptyMessageDelayed(1, this.LJLILLLLZI);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        if (msg.what == 1) {
            Iterator it = ((java.util.Set) this.LJLJJL.getValue()).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.LJLJI.getValue();
                if (linearLayoutManager != null && linearLayoutManager.LLIL() <= intValue && intValue <= linearLayoutManager.LLILLIZIL()) {
                    InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJLL;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Integer.valueOf(intValue));
                    }
                    it.remove();
                }
            }
        }
        return true;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i != 0 && i != 1) {
            return;
        }
        ((Handler) this.LJLJJI.getValue()).sendEmptyMessage(1);
    }
}
