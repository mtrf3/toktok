package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Lpn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC55467Lpn extends Handler {
    public final /* synthetic */ C55468Lpo LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        MotionEvent motionEvent;
        o.LJIIIZ(msg, "msg");
        super.handleMessage(msg);
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C55468Lpo c55468Lpo = this.LIZ;
            c55468Lpo.LJI.removeMessages(1);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = c55468Lpo.LJ;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
            c55468Lpo.LIZLLL = false;
            C55468Lpo c55468Lpo2 = this.LIZ;
            View view = c55468Lpo2.LJFF;
            if (view != null) {
                view.setVisibility(8);
            }
            C77869UhF c77869UhF = c55468Lpo2.LIZJ;
            if (c77869UhF != null) {
                c77869UhF.clearAnimation();
            }
            c55468Lpo2.LJI.removeMessages(2);
            return;
        }
        Object obj = msg.obj;
        if ((obj instanceof MotionEvent) && (motionEvent = (MotionEvent) obj) != null) {
            this.LIZ.LIZIZ.B30(motionEvent.getX(), motionEvent.getY());
        }
        this.LIZ.LIZLLL = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC55467Lpn(C55468Lpo c55468Lpo, Looper looper) {
        super(looper);
        this.LIZ = c55468Lpo;
    }
}
