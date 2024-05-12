package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MYh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56991MYh extends AbstractC116364hU<C48710J9u> {
    public final List<OnThisDayResponse> LIZJ;

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        return this;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        C48710J9u convertDayResponseToItem = C55723Ltv.LIZIZ.LIZ().convertDayResponseToItem((OnThisDayResponse) ORZ.LJLLLL(this.LIZJ));
        if (convertDayResponseToItem != null) {
            List<T> list = this.LIZIZ;
            int LJI = this.LIZ.LJI(4);
            Aweme aweme = convertDayResponseToItem.LJLIL;
            int i = convertDayResponseToItem.LJLILLLLZI;
            int i2 = convertDayResponseToItem.LJLJI;
            String pastMemoryKey = convertDayResponseToItem.LJLJJI;
            o.LJIIIZ(aweme, "aweme");
            o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
            list.add(new C48710J9u(aweme, i, i2, pastMemoryKey, LJI));
        }
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56991MYh(InterfaceC116134h7 ft) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        this.LIZJ = new ArrayList();
    }

    @Override // X.AbstractC116364hU
    public final Object LIZIZ(InterfaceC67352kd<? super AbstractC116364hU<C48710J9u>> interfaceC67352kd) {
        this.LIZIZ.clear();
        ((ArrayList) this.LIZJ).clear();
        OnThisDayResponse onThisDayData = this.LIZ.LJII().getOnThisDayData();
        if (onThisDayData != null) {
            ((ArrayList) this.LIZJ).add(onThisDayData);
        }
        return this;
    }
}
