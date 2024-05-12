package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210878Pj implements InterfaceC210978Pt {
    public final String LIZ;
    public final java.util.Map<? extends java.util.Set<String>, C210918Pn> LIZIZ;
    public final /* synthetic */ VideoTagContainer LIZJ;

    @Override // X.InterfaceC210978Pt
    public final String LIZ() {
        return this.LIZ;
    }

    public C210878Pj(VideoTagContainer videoTagContainer) {
        String str;
        this.LIZJ = videoTagContainer;
        KRA LIZIZ = videoTagContainer.a1().LIZIZ();
        this.LIZ = (LIZIZ == null || (str = LIZIZ.LIZ) == null) ? "" : str;
        this.LIZIZ = (java.util.Map) videoTagContainer.LLIIIZ.getValue();
    }

    @Override // X.InterfaceC210978Pt
    public final void LIZIZ(List<? extends PriorityProtocol> protocol) {
        boolean z;
        String o0;
        o.LJIIIZ(protocol, "protocol");
        boolean z2 = false;
        if (this.LIZJ.E4() && (o0 = this.LIZJ.u4().o0()) != null && o0.length() != 0) {
            if (ORZ.LJLJJI(this.LIZJ.u4().o0(), C8QB.LIZIZ)) {
                VideoTagContainer videoTagContainer = this.LIZJ;
                if (!protocol.isEmpty()) {
                    Iterator<? extends PriorityProtocol> it = protocol.iterator();
                    while (it.hasNext()) {
                        if (o.LJ(it.next().y2(), videoTagContainer.u4().o0())) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        }
        z = false;
        if (C183997Jz.LIZ() && !z) {
            VideoTagContainer videoTagContainer2 = this.LIZJ;
            AssemViewModel assemViewModel = (AssemViewModel) videoTagContainer2.LLIIII.LIZ(videoTagContainer2, VideoTagContainer.LLIL[2]);
            assemViewModel.getClass();
            Iterator<? extends PriorityProtocol> it2 = protocol.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (C8QB.LIZIZ.contains(it2.next().y2())) {
                    z2 = true;
                    break;
                }
            }
            assemViewModel.setStateImmediate(new AqS8S0010000_3(z2, 50));
        }
        if (!protocol.isEmpty()) {
            String str = this.LIZJ.rp0().eventType;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this.LIZJ)).getAweme();
            ArrayList arrayList = new ArrayList(C32I.LJJL(protocol, 10));
            Iterator<? extends PriorityProtocol> it3 = protocol.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next().y2());
            }
            C188597ah.LIZIZ(str, aweme, arrayList);
        }
    }
}
