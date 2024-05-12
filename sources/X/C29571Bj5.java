package X;

import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Bj5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29571Bj5 implements InterfaceC30921CBp<LinkMicBattleNoticeMessage> {
    @Override // X.InterfaceC30921CBp
    public final CRD b5(LinkMicBattleNoticeMessage linkMicBattleNoticeMessage) {
        LinkMicBattleNoticeMessage message = linkMicBattleNoticeMessage;
        o.LJIIIZ(message, "message");
        int i = message.noticeType;
        if (i != 0 && i != 4 && i != 5) {
            return new C29577BjB(message);
        }
        return new C29572Bj6(message);
    }
}
