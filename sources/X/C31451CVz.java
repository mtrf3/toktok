package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CVz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31451CVz implements InterfaceC31288CPs {
    public final /* synthetic */ C31450CVy LIZ;

    public C31451CVz(C31450CVy c31450CVy) {
        this.LIZ = c31450CVy;
    }

    @Override // X.InterfaceC31288CPs
    public final void LIZ(IMessage message) {
        o.LJIIIZ(message, "message");
        if (!(message instanceof GiftMessage) || !InterfaceC30442Bx8.LJJIJIIJIL.LIZJ().booleanValue()) {
            return;
        }
        this.LIZ.getClass();
        if (!o.LJ(InterfaceC30442Bx8.LJIIZILJ.LIZJ(), Boolean.TRUE)) {
            return;
        }
        int size = this.LIZ.LJLJL.size();
        this.LIZ.LJLJL.add(new C31291CPv((GiftMessage) message));
        C31450CVy c31450CVy = this.LIZ;
        c31450CVy.LJLJLJ = (C31291CPv) ORZ.LLFF(c31450CVy.LJLJL);
        this.LIZ.LIZJ();
        C31450CVy c31450CVy2 = this.LIZ;
        if (c31450CVy2.LJLJJLL) {
            C31435CVj c31435CVj = c31450CVy2.LJLIL;
            if (c31435CVj != null) {
                c31435CVj.notifyItemInserted(size);
            }
            C31453CWb c31453CWb = this.LIZ.LJLLI;
            if (c31453CWb != null) {
                c31453CWb.LIZ(1);
            }
        } else {
            C31435CVj c31435CVj2 = c31450CVy2.LJLIL;
            if (c31435CVj2 != null) {
                c31435CVj2.notifyDataSetChanged();
            }
        }
        int size2 = this.LIZ.LJLJL.size();
        if (size2 > 0 && !this.LIZ.LJLILLLLZI.canScrollVertically(1)) {
            this.LIZ.LJLILLLLZI.LJLI(size2 - 1);
        }
    }
}
