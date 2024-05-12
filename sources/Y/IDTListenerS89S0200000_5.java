package Y;

import X.B8Y;
import X.BFS;
import X.C80797VnN;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.PreviewHideKeyboardEvent;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDTListenerS89S0200000_5 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS89S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$0(Y.IDTListenerS89S0200000_5 r18, android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDTListenerS89S0200000_5.onTouch$0(Y.IDTListenerS89S0200000_5, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$1(IDTListenerS89S0200000_5 iDTListenerS89S0200000_5, View view, MotionEvent event) {
        C80797VnN c80797VnN;
        o.LJIIIZ(event, "event");
        if (BFS.LIZIZ().LJLLILLLL == 4 && ((C80797VnN) iDTListenerS89S0200000_5.l0) != null) {
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3 && (c80797VnN = (C80797VnN) iDTListenerS89S0200000_5.l0) != null && c80797VnN.LLILIL) {
                            c80797VnN.LJII();
                        }
                    } else {
                        float y = event.getY();
                        B8Y b8y = (B8Y) iDTListenerS89S0200000_5.l1;
                        float f = y - b8y.LJLJJI;
                        b8y.LJLJJI = event.getY();
                        if (f < 0.0f || ((B8Y) iDTListenerS89S0200000_5.l1).LJLJJL < 0.0f) {
                            C80797VnN c80797VnN2 = (C80797VnN) iDTListenerS89S0200000_5.l0;
                            if (c80797VnN2 != null && !c80797VnN2.LLILIL) {
                                c80797VnN2.LIZJ();
                            }
                            C80797VnN c80797VnN3 = (C80797VnN) iDTListenerS89S0200000_5.l0;
                            if (c80797VnN3 != null) {
                                c80797VnN3.LJIIIIZZ(f);
                            }
                            ((B8Y) iDTListenerS89S0200000_5.l1).LJLJJL += f;
                        }
                    }
                } else {
                    C80797VnN c80797VnN4 = (C80797VnN) iDTListenerS89S0200000_5.l0;
                    if (c80797VnN4 != null && c80797VnN4.LLILIL) {
                        c80797VnN4.LJII();
                    }
                    B8Y b8y2 = (B8Y) iDTListenerS89S0200000_5.l1;
                    b8y2.LJLJI = 0.0f;
                    b8y2.LJLJJL = 0.0f;
                }
            } else {
                ((B8Y) iDTListenerS89S0200000_5.l1).LJLJI = event.getY();
                B8Y b8y3 = (B8Y) iDTListenerS89S0200000_5.l1;
                b8y3.LJLJJI = b8y3.LJLJI;
                C80797VnN c80797VnN5 = (C80797VnN) iDTListenerS89S0200000_5.l0;
                if (c80797VnN5 != null) {
                    c80797VnN5.LIZJ();
                }
            }
            return true;
        }
        ((B8Y) iDTListenerS89S0200000_5.l1).LJJLJLI();
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS89S0200000_5 iDTListenerS89S0200000_5, View view, MotionEvent motionEvent) {
        ((View) iDTListenerS89S0200000_5.l0).requestFocus();
        DataChannel dataChannel = ((LiveBroadcastPreviewFragment) iDTListenerS89S0200000_5.l1).LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.pv0(PreviewHideKeyboardEvent.class);
            return false;
        }
        o.LJIJI("dataChannel");
        throw null;
    }
}
