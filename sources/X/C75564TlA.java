package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import defpackage.g0;

/* renamed from: X.TlA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75564TlA implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ C75525TkX LJLIL;
    public final /* synthetic */ Room LJLILLLLZI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        C30868C9o.LJIIIZ(R.drawable.cxq, g0.LJIILJJIL(this.LJLIL.LJLJJLL), C15380j0.LJIILL(R.string.nbt, C05170If.LIZ(this.LJLILLLLZI.getOwner())));
        C75642TmQ.LIZ.LJJJJZ(this.LJLILLLLZI, "invite", null);
    }

    public C75564TlA(C75525TkX c75525TkX, Room room) {
        this.LJLIL = c75525TkX;
        this.LJLILLLLZI = room;
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        if (!(th instanceof MultiCoHostViolationException)) {
            BPP.LIZJ(C15380j0.LIZLLL(), th);
        }
        if (th != null) {
            this.LJLIL.LIZ(this.LJLILLLLZI.getId(), th);
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(113, "multi_cohost invite failed", th, null);
        }
    }
}
