package X;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.aXi, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnTouchListenerC93862aXi implements View.OnTouchListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public final /* synthetic */ C94855anj LJLJI;
    public final /* synthetic */ C94389agD LJLJJI;

    public ViewOnTouchListenerC93862aXi(C94855anj c94855anj, C94389agD c94389agD) {
        this.LJLJI = c94855anj;
        this.LJLJJI = c94389agD;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer num;
        LinearLayout linearLayout;
        C93651aUJ<C94291aed> c93651aUJ;
        C93651aUJ<C94291aed> c93651aUJ2;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getAction());
        } else {
            num = null;
        }
        if (num == null) {
            return false;
        }
        if (num.intValue() == 0) {
            this.LJLIL = motionEvent.getX();
            this.LJLILLLLZI = motionEvent.getY();
            HandlerC93864aXk handlerC93864aXk = this.LJLJI.LJLJL;
            Message obtain = Message.obtain();
            obtain.obj = Integer.valueOf(this.LJLJJI.getAdapterPosition());
            obtain.what = 1;
            handlerC93864aXk.sendMessageDelayed(obtain, 300L);
            HandlerC93864aXk handlerC93864aXk2 = this.LJLJI.LJLJL;
            Message message = new Message();
            message.obj = Integer.valueOf(this.LJLJJI.getAdapterPosition());
            message.what = 0;
            handlerC93864aXk2.sendMessageDelayed(message, 600L);
            return false;
        }
        if (num.intValue() == 2) {
            if (this.LJLJI.LJLJL.hasMessages(0) || this.LJLJI.LJLJL.hasMessages(1)) {
                float f = 5;
                if (Math.abs(motionEvent.getX() - this.LJLIL) > f || Math.abs(motionEvent.getY() - this.LJLILLLLZI) > f) {
                    this.LJLJI.LJLJL.removeCallbacksAndMessages(null);
                    return false;
                }
                this.LJLIL = motionEvent.getX();
                this.LJLILLLLZI = motionEvent.getY();
                return false;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.LJLJI.getContext());
            o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
            float scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
            if ((Math.abs(motionEvent.getX() - this.LJLIL) <= scaledTouchSlop && Math.abs(motionEvent.getY() - this.LJLILLLLZI) <= scaledTouchSlop) || (c93651aUJ2 = this.LJLJI.LJLLJ) == null || !c93651aUJ2.isShowing()) {
                return false;
            }
            this.LJLJI.LJLJL.removeCallbacksAndMessages(null);
            HandlerC93864aXk handlerC93864aXk3 = this.LJLJI.LJLJL;
            Message message2 = new Message();
            message2.obj = Integer.valueOf(this.LJLJJI.getAdapterPosition());
            message2.what = 2;
            handlerC93864aXk3.sendMessage(message2);
            return false;
        }
        if (num.intValue() != 1) {
            return false;
        }
        InterfaceC93865aXl interfaceC93865aXl = this.LJLJI.LJLJLJ;
        if (interfaceC93865aXl != null) {
            interfaceC93865aXl.s3();
        }
        this.LJLJI.LJLJL.removeCallbacksAndMessages(null);
        C93651aUJ<C94291aed> c93651aUJ3 = this.LJLJI.LJLLJ;
        if (c93651aUJ3 != null && (linearLayout = c93651aUJ3.LIZIZ) != null && linearLayout.getChildCount() == 0 && (c93651aUJ = this.LJLJI.LJLLJ) != null) {
            c93651aUJ.dismiss();
        }
        C93651aUJ<C94291aed> c93651aUJ4 = this.LJLJI.LJLLJ;
        if (c93651aUJ4 == null || !c93651aUJ4.isShowing()) {
            return false;
        }
        return true;
    }
}
