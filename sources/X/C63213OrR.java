package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import java.util.HashMap;

/* renamed from: X.OrR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63213OrR implements InterfaceC63352Otg<Void> {
    public final /* synthetic */ NewMessageNotify LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // X.InterfaceC63352Otg
    public final Void LIZIZ() {
        long j;
        Long l = this.LJLIL.next_cursor;
        long j2 = -1;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        MessageBody messageBody = this.LJLIL.message;
        if (messageBody != null) {
            j2 = messageBody.server_message_id.longValue();
        }
        HashMap hashMap = new HashMap();
        C63308Osy.LJI().getClass();
        hashMap.put("timestamp", String.valueOf(C63308Osy.LJ()));
        hashMap.put("next_cursor", String.valueOf(j));
        hashMap.put("msg_id", String.valueOf(j2));
        hashMap.put("log_id", this.LJLILLLLZI);
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LJLJI;
        String abstractMap = hashMap.toString();
        LIZ.getClass();
        C63291Osh.LIZLLL.putString(C63291Osh.LJIIIIZZ(i, "key_new_msg_notify_snapshot"), abstractMap);
        return null;
    }

    public C63213OrR(NewMessageNotify newMessageNotify, String str, int i) {
        this.LJLIL = newMessageNotify;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }
}
