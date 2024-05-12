package X;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.aVx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93753aVx implements View.OnClickListener {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

    public ViewOnClickListenerC93753aVx(long j, InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        AtomicBoolean atomicBoolean = C93750aVu.LIZIZ;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            C93750aVu.LIZ.postDelayed(RunnableC93752aVw.LJLIL, this.LJLIL);
            InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI;
            o.LJIIIIZZ(it, "it");
            interfaceC88472Yns.invoke(it);
        }
    }
}
