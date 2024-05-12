package X;

import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import java.util.List;

/* renamed from: X.TTy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74714TTy extends TU4<LinkListUser, LinkMessage> {
    @Override // X.TU4
    public final void LJFF(LinkMessage linkMessage) {
        LinkMessage linkMessage2 = linkMessage;
        for (LinkListUser linkListUser : linkMessage2.mListChangeContent.onLineUsers) {
            linkListUser.LIZ = 2;
            LJ().add(linkListUser);
        }
        for (LinkListUser linkListUser2 : linkMessage2.mListChangeContent.waitingUsers) {
            linkListUser2.LIZ = 1;
            ((List) this.LIZLLL.getValue()).add(linkListUser2);
        }
    }
}
