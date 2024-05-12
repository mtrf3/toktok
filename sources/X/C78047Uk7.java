package X;

import Y.ARunnableS49S0100000_13;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.Uk7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78047Uk7 implements InterfaceC78049Uk9 {
    public final /* synthetic */ C78046Uk6 LIZ;

    public C78047Uk7(C78046Uk6 c78046Uk6) {
        this.LIZ = c78046Uk6;
    }

    @Override // X.InterfaceC78049Uk9
    public final void LIZ(int i) {
        if (i > 0) {
            if (((ArrayList) this.LIZ.LJLLI).size() > 1) {
                C78046Uk6 c78046Uk6 = this.LIZ;
                c78046Uk6.postDelayed(new ARunnableS49S0100000_13(c78046Uk6, 60), 1000L);
                return;
            } else {
                if (!(!this.LIZ.LJLLI.isEmpty())) {
                    return;
                }
                C78046Uk6 c78046Uk62 = this.LIZ;
                c78046Uk62.LIZJ((RankListV2Response.Bulletin) ListProtector.get(c78046Uk62.LJLLI, 0));
                return;
            }
        }
        if (((ArrayList) this.LIZ.LJLLI).size() <= 1) {
            return;
        }
        C78046Uk6 c78046Uk63 = this.LIZ;
        c78046Uk63.postDelayed(new ARunnableS49S0100000_13(c78046Uk63, 62), 8000L);
    }
}
