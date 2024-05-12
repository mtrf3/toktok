package X;

import android.os.Handler;
import android.os.Message;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: X.Eqh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC37687Eqh extends Handler implements InterfaceC37690Eqk {
    public final Handler LJLIL;
    public final WeakReference<ViewParent> LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.InterfaceC37690Eqk
    public final void start() {
        boolean z;
        ViewParent viewParent = this.LJLILLLLZI.get();
        if (viewParent == null) {
            return;
        }
        if (C37684Eqe.LIZJ(this, viewParent) && C37684Eqe.LIZIZ(this.LJLIL, this)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJI = z;
        if (z) {
        }
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        Handler handler = this.LJLIL;
        if (handler != null) {
            handler.dispatchMessage(message);
        } else {
            super.dispatchMessage(message);
        }
    }

    public HandlerC37687Eqh(Handler handler, ViewParent viewParent) {
        super(handler.getLooper());
        this.LJLIL = handler;
        this.LJLILLLLZI = new WeakReference<>(viewParent);
    }

    @Override // X.InterfaceC37690Eqk
    public final boolean LIZ(Message message, long j) {
        return sendMessageAtTime(message, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0068  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendMessageAtTime(android.os.Message r13, long r14) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC37687Eqh.sendMessageAtTime(android.os.Message, long):boolean");
    }
}
