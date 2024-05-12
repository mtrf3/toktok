package X;

import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JIr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48941JIr implements WeakHandler.IHandler, InterfaceC48908JHk {
    public final InterfaceC48907JHj LJLIL;
    public final InterfaceC48940JIq LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 533));

    @Override // X.InterfaceC48908JHk
    public final void LJIILL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    public final WeakHandler LIZ() {
        return (WeakHandler) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            return interfaceC48907JHj.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLLJLJLL() {
        int i;
        LIZ().removeMessages(16);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            i = interfaceC48907JHj.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append("} pauseMedia");
        X1D.LIZIZ(LIZ);
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLIL;
        if (interfaceC48907JHj2 != null) {
            interfaceC48907JHj2.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void contextPause() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            i = interfaceC48907JHj.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append("} contextPause");
        X1D.LIZIZ(LIZ);
        LIZ().removeMessages(16);
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLIL;
        if (interfaceC48907JHj2 != null) {
            interfaceC48907JHj2.contextPause();
        }
    }

    @Override // X.InterfaceC48908JHk
    public final void onDestroy() {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            i = interfaceC48907JHj.hashCode();
        } else {
            i = 0;
        }
        LIZ.append(i);
        LIZ.append("} onDestroy");
        X1D.LIZIZ(LIZ);
        LIZ().removeCallbacksAndMessages(null);
        LIZ().removeMessages(16);
        InterfaceC48907JHj interfaceC48907JHj2 = this.LJLIL;
        if (interfaceC48907JHj2 != null) {
            interfaceC48907JHj2.g9();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLII(long j) {
        Aweme aweme;
        int i;
        LIZ().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        InterfaceC48940JIq interfaceC48940JIq = this.LJLILLLLZI;
        if (interfaceC48940JIq != null) {
            aweme = interfaceC48940JIq.getAweme();
        } else {
            aweme = null;
        }
        message.obj = aweme;
        LIZ().sendMessageDelayed(message, j);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('{');
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            i = interfaceC48907JHj.hashCode();
        } else {
            i = 0;
        }
        V10.LJFF(LIZ, i, "} playMedia delayed ", j);
        X1D.LIZIZ(LIZ);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        String str;
        o.LJIIIZ(msg, "msg");
        if (this.LJLILLLLZI != null) {
            if (msg.what == 16) {
                Object obj = msg.obj;
                if (obj instanceof Aweme) {
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                    String aid = ((Aweme) obj).getAid();
                    Aweme aweme = this.LJLILLLLZI.getAweme();
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    if (!o.LJ(aid, str)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            JLU.LIZJ(interfaceC48907JHj);
            interfaceC48907JHj.LLLJIL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd listener) {
        o.LJIIIZ(listener, "listener");
    }

    public C48941JIr(JUK juk, InterfaceC48940JIq interfaceC48940JIq) {
        this.LJLIL = juk;
        this.LJLILLLLZI = interfaceC48940JIq;
    }
}
