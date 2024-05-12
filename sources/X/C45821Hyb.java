package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import java.util.ArrayList;

/* renamed from: X.Hyb, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45821Hyb implements HWI {
    public final /* synthetic */ LocalMusicTabFragment LJLIL;
    public final /* synthetic */ InterfaceC43955HMx LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    @Override // X.HWI
    public final void LIZIZ() {
        XKQ xkq = this.LJLIL.LJZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLIL.Vl(new ArrayList(), false);
        InterfaceC43955HMx interfaceC43955HMx = this.LJLILLLLZI;
        if (interfaceC43955HMx != null) {
            interfaceC43955HMx.onFailed(1);
        }
        C45820Hya.LIZJ(System.currentTimeMillis() - this.LJLJI, 0L, false, 1, 0L);
    }

    public C45821Hyb(LocalMusicTabFragment localMusicTabFragment, C84985XWz c84985XWz, long j) {
        this.LJLIL = localMusicTabFragment;
        this.LJLILLLLZI = c84985XWz;
        this.LJLJI = j;
    }
}
