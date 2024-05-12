package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group.GroupChatNoticeAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.409, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class AnonymousClass409 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public AnonymousClass409(Object obj) {
        super(0, obj, GroupChatNoticeAssem.class, "hidePermanentBanUi", "hidePermanentBanUi()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Object value = ((GroupChatNoticeAssem) this.receiver).LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-messageListView>(...)");
        View view = (View) value;
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        return C76800UCe.LIZ;
    }
}
