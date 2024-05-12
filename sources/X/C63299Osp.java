package X;

import android.util.Pair;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;

/* renamed from: X.Osp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63299Osp implements InterfaceC63352Otg<Pair<Long, Long>> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C63622Oy2 LJLILLLLZI;
    public final /* synthetic */ MessagesPerUserInitV2ResponseBody LJLJI;
    public final /* synthetic */ C63294Osk LJLJJI;

    @Override // X.InterfaceC63352Otg
    public final Pair<Long, Long> LIZIZ() {
        if (!this.LJLIL) {
            return null;
        }
        C63294Osk c63294Osk = this.LJLJJI;
        C63622Oy2 c63622Oy2 = this.LJLILLLLZI;
        return c63294Osk.LJIILL(c63622Oy2, c63622Oy2.LJLJL.inbox_type.intValue(), this.LJLJI, this.LJLILLLLZI.LJLIL);
    }

    public C63299Osp(C63294Osk c63294Osk, boolean z, C63622Oy2 c63622Oy2, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
        this.LJLJJI = c63294Osk;
        this.LJLIL = z;
        this.LJLILLLLZI = c63622Oy2;
        this.LJLJI = messagesPerUserInitV2ResponseBody;
    }
}
