package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlayingAdNotRefreshLayoutSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiRegion;
import java.util.List;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.U8c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76694U8c implements UC6 {
    public final /* synthetic */ U8H LIZ;
    public final /* synthetic */ SeiAppData LIZIZ;

    @Override // X.UC6
    public final void LIZ(Layout layout) {
        Integer num;
        Integer num2;
        List<SeiRegion> list;
        if (layout != null) {
            this.LIZ.LJIJJ().LJIILIIL(layout);
            this.LIZ.LJJJI(layout);
        }
        SeiAppData seiAppData = this.LIZ.LJJIJLIJ;
        if (LinkMicPlayingAdNotRefreshLayoutSetting.getValue() && this.LIZ.LJJJJ) {
            return;
        }
        U8H u8h = this.LIZ;
        u8h.LJJJIL(new AqS117S0300000_13(u8h, seiAppData, this.LIZIZ, 18));
        if (this.LIZ.LIZ.LIZIZ == 2) {
            List<SeiRegion> list2 = this.LIZIZ.grids;
            if (list2 != null) {
                num = Integer.valueOf(list2.size());
            } else {
                num = null;
            }
            SeiAppData seiAppData2 = this.LIZ.LJJIJLIJ;
            if (seiAppData2 != null && (list = seiAppData2.grids) != null) {
                num2 = Integer.valueOf(list.size());
            } else {
                num2 = null;
            }
            if (o.LJ(num, num2)) {
                this.LIZ.LJJJIL(null);
            }
        }
        U8H u8h2 = this.LIZ;
        u8h2.LJJJJJ.LJJLIIIJJIZ(u8h2.LJJIII(), 1);
    }

    public C76694U8c(U8H u8h, SeiAppData seiAppData) {
        this.LIZ = u8h;
        this.LIZIZ = seiAppData;
    }
}
