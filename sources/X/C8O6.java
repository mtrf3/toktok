package X;

import Y.ARunnableS39S0100000_3;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.8O6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O6 extends AbstractC65781Prl implements InterfaceC88473Ynt<VideoTagContainer, C43I<? extends Integer>, C43I<? extends C70012ov>, C76800UCe> {
    public static final C8O6 LJLIL = new C8O6();

    public C8O6() {
        super(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(VideoTagContainer videoTagContainer, C43I<? extends Integer> c43i, C43I<? extends C70012ov> c43i2) {
        boolean z;
        C70012ov c70012ov;
        VideoTagContainer selectSubscribe = videoTagContainer;
        C43I<? extends C70012ov> c43i3 = c43i2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i3 != null && (c70012ov = (C70012ov) c43i3.LIZ) != null) {
            z = c70012ov.LJLJJL;
        } else {
            z = false;
        }
        if ((c43i != null || z) && !((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getReplaceRecTagByRepost()) {
            selectSubscribe.getContainerView().setVisibility(0);
            Iterator LIZLLL = C47135Ieh.LIZLLL(selectSubscribe.C4().LIZJ, "priorityMakers.values");
            while (LIZLLL.hasNext()) {
                ((C8PV) LIZLLL.next()).LIZJ();
            }
            C37179EiV.LJFF.postAtFrontOfQueue(new ARunnableS39S0100000_3(selectSubscribe, 123));
        }
        return C76800UCe.LIZ;
    }
}
