package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.XDz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84491XDz implements XDR<List<? extends Effect>> {
    public final /* synthetic */ XCP LIZ;

    public C84491XDz(XCP xcp) {
        this.LIZ = xcp;
    }

    @Override // X.XDR
    public final void onSuccess(List<? extends Effect> list) {
        List<? extends Effect> response = list;
        o.LJIIJ(response, "response");
        if (!response.isEmpty()) {
            XCP xcp = this.LIZ;
            if (xcp != null) {
                xcp.onSuccess(ListProtector.get(response, 0));
                return;
            }
            return;
        }
        XCP xcp2 = this.LIZ;
        if (xcp2 == null) {
            return;
        }
        xcp2.onFail(null, new C84418XBe(1));
    }

    @Override // X.XDR
    public final void preProcess(List<? extends Effect> list) {
    }

    @Override // X.XDR
    public final void onFail(List<? extends Effect> list, C84418XBe exception) {
        o.LJIIJ(exception, "exception");
        XCP xcp = this.LIZ;
        if (xcp != null) {
            xcp.onFail(null, exception);
        }
    }
}
