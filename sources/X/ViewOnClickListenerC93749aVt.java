package X;

import Y.IDRunnableS92S0100000_42;
import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aVt, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93749aVt implements View.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns LJLJI;

    public ViewOnClickListenerC93749aVt(int i, long j, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = interfaceC88472Yns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = C93750aVu.LIZJ;
        if (concurrentHashMap.get(Integer.valueOf(this.LJLIL)) == null || o.LJ(concurrentHashMap.get(Integer.valueOf(this.LJLIL)), Boolean.FALSE)) {
            concurrentHashMap.put(Integer.valueOf(this.LJLIL), Boolean.TRUE);
            C93750aVu.LIZ.postDelayed(new IDRunnableS92S0100000_42(this, 6), this.LJLILLLLZI);
            InterfaceC88472Yns interfaceC88472Yns = this.LJLJI;
            o.LJIIIIZZ(it, "it");
            interfaceC88472Yns.invoke(it);
        }
    }
}
