package X;

import android.util.Pair;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;

/* renamed from: X.Oso, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63298Oso implements InterfaceC63352Otg<Pair<Long, Long>> {
    public final /* synthetic */ C63622Oy2 LJLIL;
    public final /* synthetic */ MessagesPerUserInitV2ResponseBody LJLILLLLZI;
    public final /* synthetic */ C63294Osk LJLJI;

    @Override // X.InterfaceC63352Otg
    public final Pair<Long, Long> LIZIZ() {
        C63294Osk c63294Osk = this.LJLJI;
        C63622Oy2 c63622Oy2 = this.LJLIL;
        return c63294Osk.LJIILL(c63622Oy2, c63622Oy2.LJLJL.inbox_type.intValue(), this.LJLILLLLZI, this.LJLIL.LJLIL);
    }

    public C63298Oso(C63294Osk c63294Osk, C63622Oy2 c63622Oy2, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
        this.LJLJI = c63294Osk;
        this.LJLIL = c63622Oy2;
        this.LJLILLLLZI = messagesPerUserInitV2ResponseBody;
    }
}
