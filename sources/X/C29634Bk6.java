package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Bk6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C29634Bk6 extends TBS implements InterfaceC88472Yns<C29652BkO, C76800UCe> {
    public C29634Bk6(Object obj) {
        super(1, obj, DecorationWrapperWidget.class, "updateValidArea", "updateValidArea(Lcom/bytedance/android/livesdk/chatroom/event/StickerValidAreaEvent;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C29652BkO c29652BkO) {
        C29652BkO p0 = c29652BkO;
        o.LJIIIZ(p0, "p0");
        DecorationWrapperWidget decorationWrapperWidget = (DecorationWrapperWidget) this.receiver;
        if (decorationWrapperWidget.isViewValid() && decorationWrapperWidget.context != null && C29306Beo.LJIJI()) {
            int max = Math.max((KL2.LJIIIZ(decorationWrapperWidget.context) - p0.LIZ) - decorationWrapperWidget.context.getResources().getDimensionPixelSize(R.dimen.a9g), ((int) KL2.LIZJ(decorationWrapperWidget.context, 130.0f)) + ((int) KL2.LIZJ(decorationWrapperWidget.context, 148.0f)));
            int[] iArr = decorationWrapperWidget.LJLJJL;
            if (max != iArr[1]) {
                iArr[1] = max;
                Iterator it = ((ArrayList) decorationWrapperWidget.LJLJL).iterator();
                while (it.hasNext()) {
                    AbstractC29665Bkb abstractC29665Bkb = (AbstractC29665Bkb) it.next();
                    int[] screenValidArea = decorationWrapperWidget.LJLJJL;
                    abstractC29665Bkb.getClass();
                    o.LJIIIZ(screenValidArea, "screenValidArea");
                    abstractC29665Bkb.LJLJI = screenValidArea;
                    abstractC29665Bkb.LJLIIIL(false);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
