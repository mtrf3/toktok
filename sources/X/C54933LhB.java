package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS31S1300000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("fyp_location_permission")
/* renamed from: X.LhB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54933LhB extends M71 {
    public static String LJLJI = "";
    public final InterfaceC88472Yns<M78, C76800UCe> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54933LhB(InterfaceC56322M8o scene, AqS31S1300000_9 aqS31S1300000_9) {
        super(scene);
        o.LJIIIZ(scene, "scene");
        this.LJLIL = aqS31S1300000_9;
        this.LJLILLLLZI = 210;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        Aweme i6 = AwemeService.LIZ().i6(LJLJI);
        if (i6 != null && !i6.isAd()) {
            if (i6.isRecBigCardFakeAweme()) {
                wrapper.LIZ();
                return;
            } else {
                this.LJLIL.invoke(wrapper);
                return;
            }
        }
        wrapper.LIZ();
    }
}
