package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.List;
import kotlin.jvm.internal.AqS36S1000000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U79 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ U7T LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U79(long j, U7T u7t, String str) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = u7t;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRtcUserLeft dealing linkMicId=");
        LIZ.append(this.LJLIL);
        LIZ.append(" leaveReason=");
        LIZ.append(this.LJLILLLLZI);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        U7Z u7z = this.LJLJI.LJIIJJI;
        String linkMicId = this.LJLIL;
        u7z.getClass();
        o.LJIIIZ(linkMicId, "linkMicId");
        List<LinkUser> LLJILJILJ = ORZ.LLJILJILJ(u7z.LJIIIIZZ);
        ORS.LJJLIL(new AqS36S1000000_13(linkMicId, 0), LLJILJILJ);
        u7z.LJIJJLI(LLJILJILJ);
        if (this.LJLJI.LJIIJJI.LJJIIZI().size() <= 1) {
            U7T u7t = this.LJLJI;
            u7t.LJJIIZ("leave_only_one", "leave_only_one", true, null, u7t.LJIIJJI.LJ());
        }
        return C76800UCe.LIZ;
    }
}
