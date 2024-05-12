package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.lang.ref.WeakReference;

/* renamed from: X.BEv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28457BEv<T> implements InterfaceC64592gB {
    public final /* synthetic */ WeakReference<InterfaceC28456BEu> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ BFC LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public C28457BEv(WeakReference<InterfaceC28456BEu> weakReference, boolean z, BFC bfc, long j, long j2, String str) {
        this.LJLIL = weakReference;
        this.LJLILLLLZI = z;
        this.LJLJI = bfc;
        this.LJLJJI = j;
        this.LJLJJL = j2;
        this.LJLJJLL = str;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        C29702BlC LIZLLL;
        InterfaceC28456BEu interfaceC28456BEu = this.LJLIL.get();
        if (interfaceC28456BEu != null) {
            interfaceC28456BEu.Ti(this.LJLJI.LIZ, this.LJLILLLLZI);
        }
        boolean z = this.LJLILLLLZI;
        long j = this.LJLJI.LIZ;
        long j2 = this.LJLJJI;
        long j3 = this.LJLJJL;
        String str4 = this.LJLJJLL;
        BZI LIZ = C28787BRn.LIZ("livesdk_admin_click");
        LIZ.LJIJJ(Long.valueOf(j2), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(j3), "room_id");
        LIZ.LJIJJ(Long.valueOf(j), "user_id");
        if (z) {
            str = "set";
        } else {
            str = "cancel";
        }
        LIZ.LJIJJ(str, "action_type");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str2 = "anchor";
        } else {
            str2 = "admin";
        }
        LIZ.LJIJJ(str2, "admin_type");
        LIZ.LJIJJ("moderator_panel", "action_page");
        LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        LIZ.LJIJJ(str4, "action_page");
        if (C29306Beo.LJJI()) {
            str3 = "live_take_page";
        } else {
            str3 = "live_take_detail";
        }
        LIZ.LJIIJJI(str3);
        LIZ.LJJIIJZLJL();
        if (z) {
            LIZLLL = C18230nb.LIZLLL("ttlive_add_admin");
        } else {
            LIZLLL = C18230nb.LIZLLL("ttlive_delete_admin");
        }
        LIZLLL.LIZIZ(Long.valueOf(j), "user_id");
        LIZLLL.LIZIZ(Long.valueOf(j2), "anchor_id");
        LIZLLL.LJIIIZ();
    }
}
