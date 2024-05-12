package X;

import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JGl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48883JGl implements WeakHandler.IHandler, InterfaceC48908JHk {
    public final InterfaceC48907JHj LJLIL;
    public final C48881JGj LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 677));

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

    @Override // X.InterfaceC48908JHk
    public final void LJIILL() {
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.LJIILL();
        }
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
        LIZ().removeMessages(16);
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.LLLLLJLJLL();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void contextPause() {
        LIZ().removeMessages(16);
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.contextPause();
        }
    }

    @Override // X.InterfaceC48908JHk
    public final void onDestroy() {
        LIZ().removeCallbacksAndMessages(null);
        LIZ().removeMessages(16);
        InterfaceC48907JHj interfaceC48907JHj = this.LJLIL;
        if (interfaceC48907JHj != null) {
            interfaceC48907JHj.g9();
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC48908JHk
    public final void LLLLII(long j) {
        Aweme aweme;
        LIZ().removeMessages(16);
        Message message = new Message();
        message.what = 16;
        C48881JGj c48881JGj = this.LJLILLLLZI;
        if (c48881JGj != null) {
            aweme = c48881JGj.LIZJ;
        } else {
            aweme = null;
        }
        message.obj = aweme;
        LIZ().sendMessageDelayed(message, j);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        String str;
        InterfaceC48907JHj interfaceC48907JHj;
        Aweme aweme;
        o.LJIIIZ(msg, "msg");
        if (msg.what == 16) {
            Object obj = msg.obj;
            if (obj instanceof Aweme) {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                String aid = ((Aweme) obj).getAid();
                C48881JGj c48881JGj = this.LJLILLLLZI;
                if (c48881JGj != null && (aweme = c48881JGj.LIZJ) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(aid, str) && (interfaceC48907JHj = this.LJLIL) != null) {
                    interfaceC48907JHj.LLLJIL();
                }
            }
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

    public C48883JGl(JGI jgi, C48881JGj c48881JGj) {
        this.LJLIL = jgi;
        this.LJLILLLLZI = c48881JGj;
    }
}
