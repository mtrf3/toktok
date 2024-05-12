package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;

/* renamed from: X.OsE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63262OsE implements InterfaceC63353Oth<Long> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ C63120Opw LJLILLLLZI;
    public final /* synthetic */ C63225Ord LJLJI;

    @Override // X.InterfaceC63353Oth
    public final void LIZLLL(Long l) {
        Long l2 = l;
        if (l2.longValue() == -1) {
            C63309Osz LIZLLL = C63309Osz.LIZLLL();
            String str = this.LJLIL;
            LIZLLL.getClass();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LIZLLL.LIZJ(str, new C63253Os5(null));
            return;
        }
        C63225Ord c63225Ord = this.LJLJI;
        C63120Opw c63120Opw = this.LJLILLLLZI;
        long longValue = l2.longValue();
        c63225Ord.getClass();
        C63469OvZ c63469OvZ = new C63469OvZ();
        c63469OvZ.LIZLLL = c63120Opw.getConversationId();
        c63469OvZ.LJFF = Long.valueOf(c63120Opw.getConversationShortId());
        c63469OvZ.LJ = Integer.valueOf(c63120Opw.getConversationType());
        c63469OvZ.LJI = EnumC63513OwH.NEWER;
        c63469OvZ.LJII = Long.valueOf(longValue);
        MessagesInConversationRequestBody build = c63469OvZ.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIIJ = build;
        c63225Ord.LJIIJJI(c63120Opw.getInboxType(), c89453Z8v.build(), null, c63120Opw.getConversationId());
    }

    public C63262OsE(C63225Ord c63225Ord, String str, C63120Opw c63120Opw) {
        this.LJLJI = c63225Ord;
        this.LJLIL = str;
        this.LJLILLLLZI = c63120Opw;
    }
}
