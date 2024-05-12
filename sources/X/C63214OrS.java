package X;

import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import java.util.HashMap;

/* renamed from: X.OrS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63214OrS implements InterfaceC63352Otg<Object> {
    public final /* synthetic */ MessagesPerUserResponseBody LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C63281OsX LJLJJL;

    @Override // X.InterfaceC63352Otg
    public final Object LIZIZ() {
        long j;
        Long l = this.LJLIL.next_cursor;
        if (l != null) {
            j = l.longValue();
        } else {
            j = -1;
        }
        HashMap hashMap = new HashMap();
        C63308Osy.LJI().getClass();
        hashMap.put("timestamp", String.valueOf(C63308Osy.LJ()));
        hashMap.put("next_cursor", String.valueOf(j));
        hashMap.put("conv_count", String.valueOf(this.LJLJJL.LJIIIZ));
        C63281OsX c63281OsX = this.LJLJJL;
        hashMap.put("msg_count", String.valueOf(c63281OsX.LJIIIIZZ + c63281OsX.LJII));
        hashMap.put("is_success", String.valueOf(this.LJLILLLLZI));
        hashMap.put("error_msg", this.LJLJI);
        hashMap.put("log_id", this.LJLJJI);
        C63291Osh LIZ = C63291Osh.LIZ();
        int i = this.LJLJJL.LIZJ;
        String abstractMap = hashMap.toString();
        LIZ.getClass();
        C63291Osh.LIZLLL.putString(C63291Osh.LJIIIIZZ(i, "key_pull_msg_by_user_snapshot"), abstractMap);
        return null;
    }

    public C63214OrS(C63281OsX c63281OsX, MessagesPerUserResponseBody messagesPerUserResponseBody, boolean z, String str, String str2) {
        this.LJLJJL = c63281OsX;
        this.LJLIL = messagesPerUserResponseBody;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }
}
