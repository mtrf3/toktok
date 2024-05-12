package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Bk5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29633Bk5 extends TBS implements InterfaceC88472Yns<C32208CkW, C76800UCe> {
    public C29633Bk5(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "onLinkStateChanged", "onLinkStateChanged(Lcom/bytedance/android/livesdk/chatroom/event/LinkCrossRoomEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C32208CkW c32208CkW) {
        C32208CkW p0 = c32208CkW;
        o.LJIIIZ(p0, "p0");
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        decorationWrapperWidget.getClass();
        int i = p0.LIZ;
        boolean z = false;
        if (i != 0) {
            if (i == 1) {
                decorationWrapperWidget.LJLJJL = decorationWrapperWidget.LJLJJLL;
                decorationWrapperWidget.LJZL = false;
                decorationWrapperWidget.LLFFF();
            }
            return C76800UCe.LIZ;
        }
        decorationWrapperWidget.LJLJJL[1] = B5G.LIZIZ().LJIL + B5G.LIZIZ().LJIJJLI;
        decorationWrapperWidget.LJZL = true;
        decorationWrapperWidget.LLFFF();
        Iterator it = ((ArrayList) decorationWrapperWidget.LJLJL).iterator();
        while (it.hasNext()) {
            AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) it.next();
            int[] screenValidArea = decorationWrapperWidget.LJLJJL;
            abstractC29665Bkb.getClass();
            o.LJIIIZ(screenValidArea, "screenValidArea");
            abstractC29665Bkb.LJLJI = screenValidArea;
            abstractC29665Bkb.LJLIIIL(false);
        }
        if (p0.LIZ == 0) {
            z = true;
        }
        decorationWrapperWidget.LJLZ = z;
        return C76800UCe.LIZ;
    }
}
