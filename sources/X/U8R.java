package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U8R implements InterfaceC29937Boz {
    public final /* synthetic */ Layout LIZ;
    public final /* synthetic */ List<Region> LIZIZ;
    public final /* synthetic */ U8Q LIZJ;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76710U8s> LIZLLL;
    public final /* synthetic */ InterfaceC75807Tp5 LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public U8R(Layout layout, List<? extends Region> list, U8Q u8q, InterfaceC88472Yns<? super Integer, C76710U8s> interfaceC88472Yns, InterfaceC75807Tp5 interfaceC75807Tp5) {
        this.LIZ = layout;
        this.LIZIZ = list;
        this.LIZJ = u8q;
        this.LIZLLL = interfaceC88472Yns;
        this.LJ = interfaceC75807Tp5;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        String str;
        Region region;
        MicPositionInfo micPositionData;
        int micCount = this.LIZ.getMicCount();
        if (micCount >= 0) {
            int i = 0;
            while (true) {
                List<Region> list = this.LIZIZ;
                U8Q u8q = this.LIZJ;
                Iterator<Region> it = list.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        region = it.next();
                        U8M u8m = u8q.LIZ.LJFF;
                        String interactId = region.getInteractId();
                        o.LJIIIIZZ(interactId, "region.interactId");
                        OnLineMicInfo LJII = u8m.LJII(interactId);
                        if (LJII != null && (micPositionData = LJII.getMicPositionData()) != null && micPositionData.getPosition() == i) {
                            break;
                        }
                    } else {
                        region = null;
                        break;
                    }
                }
                java.util.Map<String, Resolution> resolutionMap = this.LIZ.getResolutionMap();
                LayoutArray layoutByPosAndSize = this.LIZ.getLayoutByPosAndSize(i, this.LIZJ.LIZ.LJFF.LJIIIIZZ());
                if (layoutByPosAndSize != null) {
                    str = layoutByPosAndSize.getReso_id();
                }
                Resolution resolution = resolutionMap.get(str);
                C76710U8s invoke = this.LIZLLL.invoke(Integer.valueOf(i));
                if (region == null && resolution != null && invoke != null) {
                    RectF n5 = this.LJ.n5(invoke.LIZ());
                    if (n5 == null) {
                        n5 = invoke.LIZ();
                    }
                    OSZ<Integer, Integer> h5 = this.LJ.h5(resolution);
                    Bitmap LIZJ = this.LIZJ.LIZJ(h5.getFirst().intValue(), h5.getSecond().intValue());
                    if (LIZJ != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("WaterMarkController_addWaterMarkWithId pos = ");
                        LIZ.append(i);
                        LIZ.append(" info = ");
                        LIZ.append(invoke);
                        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZ));
                        U8M u8m2 = this.LIZJ.LIZ.LJFF;
                        String LJ = KMP.LJ("mask_", i);
                        Client.RTCWaterMarkRegion rTCWaterMarkRegion = new Client.RTCWaterMarkRegion();
                        InterfaceC75807Tp5 interfaceC75807Tp5 = this.LJ;
                        rTCWaterMarkRegion.setX(n5.left);
                        rTCWaterMarkRegion.setY(n5.top);
                        rTCWaterMarkRegion.setW(n5.width());
                        rTCWaterMarkRegion.setH(n5.height());
                        rTCWaterMarkRegion.setImage(LIZJ);
                        rTCWaterMarkRegion.setRenderMode(interfaceC75807Tp5.LIZ());
                        rTCWaterMarkRegion.setZorder(1);
                        u8m2.LJJIZ(LJ, rTCWaterMarkRegion);
                    }
                }
                if (i != micCount) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
