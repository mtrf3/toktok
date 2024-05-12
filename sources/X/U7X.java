package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicSdkRtcRoomManagerFixSetting;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;
import webcast.data.cohost_biz.BizLeaveJoinGroupParams;

/* loaded from: classes14.dex */
public final class U7X extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ U7T LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ List<Long> LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ LinkCoreError LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U7X(String str, U7T u7t, boolean z, List<Long> list, String str2, LinkCoreError linkCoreError) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = u7t;
        this.LJLJI = z;
        this.LJLJJI = list;
        this.LJLJJL = str2;
        this.LJLJJLL = linkCoreError;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ILiveStream liveCore;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reset dealing source=");
        LIZ.append(this.LJLIL);
        U4R.LIZLLL("Linker", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJJLIIIJJIZ.clear();
        if (this.LJLJI) {
            CopyOnWriteArrayList<InterfaceC76622U5i> copyOnWriteArrayList = this.LJLILLLLZI.LJII;
            String str = this.LJLIL;
            Iterator<InterfaceC76622U5i> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().LJIILIIL(str);
            }
        }
        List<Long> list = this.LJLJJI;
        U7T u7t = this.LJLILLLLZI;
        String str2 = this.LJLIL;
        Iterator<Long> it2 = list.iterator();
        while (it2.hasNext()) {
            u7t.LLZZJLIL(new C76684U7s(u7t.LJIL, u7t.LJIILIIL, u7t.LJI, new BizLeaveJoinGroupParams(), str2), Long.valueOf(it2.next().longValue()), 0L, true, null);
        }
        C76662U6w LJJIZ = this.LJLILLLLZI.LJJIZ();
        LJJIZ.getClass();
        U7V.LJIILJJIL(new AqS163S0100000_13(LJJIZ, 434));
        U86 u86 = (U86) this.LJLILLLLZI.LJJLIIIIJ.getValue();
        u86.getClass();
        U7V.LJIILJJIL(new AqS163S0100000_13(u86, 436));
        C76677U7l c76677U7l = this.LJLILLLLZI.LJJLIIIJ;
        if (c76677U7l != null) {
            c76677U7l.LIZ();
        }
        this.LJLILLLLZI.LJIIL.reset();
        this.LJLILLLLZI.LJIIJJI.reset();
        this.LJLILLLLZI.LJJJJZI(this.LJLIL, this.LJLJJL, this.LJLJI, this.LJLJJLL);
        U7U u7u = this.LJLILLLLZI.LJIIIZ;
        String source = this.LJLIL;
        u7u.getClass();
        o.LJIIIZ(source, "source");
        U4R.LIZLLL("RtcManager", "reset start");
        u7u.LJIJI.LIZLLL();
        U7U.LJJJJ = false;
        u7u.LJJIIJZLJL = null;
        Client client = u7u.LJII;
        if (client != null) {
            client.stop();
        }
        u7u.LIZ = false;
        u7u.LIZJ = false;
        u7u.LIZIZ = false;
        u7u.LIZLLL = false;
        if (u7u.LJII != null) {
            u7u.LIZLLL(true);
            C76129TuH.LIZJ = 4;
            U66 u66 = u7u.LJIIIZ;
            if (u66 != null) {
                UA9.LJJIZ(u66, source);
            }
            if (LinkmicSdkRtcRoomManagerFixSetting.INSTANCE.isOpt()) {
                U84.LIZ(2);
                U84.LIZJ = null;
            }
        }
        UB9 ub9 = u7u.LJIJ;
        if (ub9 != null && (liveCore = ub9.getLiveCore()) != null) {
            C29306Beo.LJJJ(new AqS158S0200000_11(u7u, liveCore, 22));
        }
        u7u.LJIJ = null;
        u7u.LJJ.clear();
        u7u.LJIILLIIL = null;
        u7u.LJIIZILJ = null;
        u7u.LJJIJ = 0L;
        u7u.LJJIJIIJI = false;
        u7u.LJJIJIIJIL = false;
        u7u.LJJIJL = false;
        u7u.LJJIJIL = C61878OQg.INSTANCE;
        try {
            ((LinkedHashMap) u7u.LJIL).clear();
            ((LinkedHashMap) u7u.LJIJJLI).clear();
        } catch (NullPointerException unused) {
        }
        String scene = u7u.LJJIIZI;
        o.LJIIIZ(scene, "scene");
        ((UBG) UB5.LIZ.getValue()).LIZ(scene);
        this.LJLILLLLZI.LJJIII.LIZJ();
        return C76800UCe.LIZ;
    }
}
