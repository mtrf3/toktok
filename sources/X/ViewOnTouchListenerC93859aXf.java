package X;

import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.o;

/* renamed from: X.aXf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnTouchListenerC93859aXf implements View.OnTouchListener {
    public float LJLIL;
    public float LJLILLLLZI;
    public final /* synthetic */ C94855anj LJLJI;
    public final /* synthetic */ C94389agD LJLJJI;
    public final /* synthetic */ AbstractC94471ahX LJLJJL;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf;
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
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
            } else if (valueOf.intValue() == 2) {
                if (this.LJLJI.LJLJL.hasMessages(0) || this.LJLJI.LJLJL.hasMessages(1)) {
                    if (Math.abs(motionEvent.getX() - this.LJLIL) > this.LJLJI.LJLL || Math.abs(motionEvent.getY() - this.LJLILLLLZI) > this.LJLJI.LJLL) {
                        this.LJLJI.LJLJL.removeCallbacksAndMessages(null);
                    } else {
                        this.LJLIL = motionEvent.getX();
                        this.LJLILLLLZI = motionEvent.getY();
                    }
                } else {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(this.LJLJI.getContext());
                    o.LJIIIIZZ(viewConfiguration, "ViewConfiguration.get(context)");
                    float scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
                    if (Math.abs(motionEvent.getX() - this.LJLIL) > scaledTouchSlop || Math.abs(motionEvent.getY() - this.LJLILLLLZI) > scaledTouchSlop) {
                        this.LJLJI.LJLJL.removeCallbacksAndMessages(null);
                        if (!ORY.LJJIJIIJIL(this.LJLJJL.LJFF().LJLJJI, this.LJLJI.LJLJLLL)) {
                            HandlerC93864aXk handlerC93864aXk3 = this.LJLJI.LJLJL;
                            Message message2 = new Message();
                            message2.obj = Integer.valueOf(this.LJLJJI.getAdapterPosition());
                            message2.what = 2;
                            handlerC93864aXk3.sendMessage(message2);
                        } else {
                            C94855anj.LLIIIILZ(this.LJLJI, false, null, null, false, 24);
                        }
                    }
                }
            } else if (valueOf.intValue() == 1) {
                InterfaceC93865aXl interfaceC93865aXl = this.LJLJI.LJLJLJ;
                if (interfaceC93865aXl != null) {
                    interfaceC93865aXl.s3();
                }
                this.LJLJI.LJLJL.removeCallbacksAndMessages(null);
                C93651aUJ<C94291aed> c93651aUJ = this.LJLJI.LJLLJ;
                if (c93651aUJ != null && c93651aUJ.isShowing()) {
                    return true;
                }
            }
        }
        return false;
    }

    public ViewOnTouchListenerC93859aXf(C94855anj c94855anj, C94389agD c94389agD, AbstractC94471ahX abstractC94471ahX) {
        this.LJLJI = c94855anj;
        this.LJLJJI = c94389agD;
        this.LJLJJL = abstractC94471ahX;
    }
}
