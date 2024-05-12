package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessageKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.41U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41U extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends C109544Rq>, List<? extends IMMessage>> {
    public static final C41U LJLIL = new C41U();

    public C41U() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends IMMessage> invoke(List<? extends C109544Rq> list) {
        boolean z;
        boolean z2;
        List<? extends C109544Rq> messageList = list;
        o.LJIIIZ(messageList, "messageList");
        AnonymousClass325.LIZ.getClass();
        String LIZJ = AnonymousClass325.LIZJ(messageList);
        ArrayList arrayList = new ArrayList(C32I.LJJL(messageList, 10));
        int i = 0;
        for (C109544Rq c109544Rq : messageList) {
            int i2 = i + 1;
            if (i >= 0) {
                C109544Rq c109544Rq2 = c109544Rq;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                C109544Rq c109544Rq3 = (C109544Rq) ORZ.LJLLLLLL(i2, messageList);
                C109544Rq c109544Rq4 = (C109544Rq) ORZ.LJLLLLLL(i - 1, messageList);
                if (LIZJ != null && o.LJ(c109544Rq2.getUuid(), LIZJ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new IMMessage(c109544Rq2, IMMessageKt.toMessageState(c109544Rq2, z, c109544Rq3, c109544Rq4, false, z2)));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }
}
