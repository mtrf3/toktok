package X;

import com.bytedance.android.livesdkapi.depend.model.live.CommercialContentToggle;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import kotlin.jvm.internal.o;

/* renamed from: X.Bdu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29250Bdu extends AbstractC65781Prl implements InterfaceC88472Yns<LiveMode, C76800UCe> {
    public static final C29250Bdu LJLIL = new C29250Bdu();

    public C29250Bdu() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LiveMode liveMode) {
        LiveMode it = liveMode;
        o.LJIIIZ(it, "it");
        C30446BxC c30446BxC = C30446BxC.LIZ;
        String str = it.logStreamingType;
        o.LJIIIIZZ(str, "it.logStreamingType");
        c30446BxC.getClass();
        if (C30446BxC.LJFF == EnumC30414Bwg.EVENT_PAGE_BROADCAST_PREVIEW) {
            C30446BxC.LIZLLL = str;
        }
        BHT.LIZ().DL(new CommercialContentToggle());
        return C76800UCe.LIZ;
    }
}
