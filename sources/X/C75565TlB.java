package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.MultiCoHostViolationException;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.TlB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75565TlB implements InterfaceC75706TnS<OLV> {
    public final /* synthetic */ Room LJLIL;
    public final /* synthetic */ C75525TkX LJLILLLLZI;

    @Override // X.InterfaceC75706TnS
    public final void LJFF(OFV ofv) {
        C75642TmQ.LIZ.LJJJJZ(this.LJLIL, "apply", null);
    }

    public C75565TlB(C75525TkX c75525TkX, Room room) {
        this.LJLIL = room;
        this.LJLILLLLZI = c75525TkX;
    }

    @Override // X.InterfaceC75706TnS
    public final void LIZLLL(C76003TsF c76003TsF, Throwable th) {
        if (!(th instanceof MultiCoHostViolationException)) {
            BPP.LIZJ(C15380j0.LIZLLL(), th);
        }
        if (th != null) {
            this.LJLILLLLZI.LIZ(this.LJLIL.getId(), th);
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(201, "apply multi_cohost link mic failed", th, null);
        }
    }
}
