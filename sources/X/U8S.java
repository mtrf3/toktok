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
public final class U8S<T> implements InterfaceC64592gB {
    public final /* synthetic */ Layout LJLIL;
    public final /* synthetic */ List<Region> LJLILLLLZI;
    public final /* synthetic */ U8Q LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76710U8s> LJLJJI;
    public final /* synthetic */ InterfaceC75807Tp5 LJLJJL;

    public U8S(Layout layout, List list, U8Q u8q, U8V u8v, InterfaceC75807Tp5 interfaceC75807Tp5) {
        this.LJLIL = layout;
        this.LJLILLLLZI = list;
        this.LJLJI = u8q;
        this.LJLJJI = u8v;
        this.LJLJJL = interfaceC75807Tp5;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Region region;
        MicPositionInfo micPositionData;
        int micCount = this.LJLIL.getMicCount();
        if (micCount >= 0) {
            int i = 0;
            while (true) {
                List<Region> list = this.LJLILLLLZI;
                U8Q u8q = this.LJLJI;
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
                java.util.Map<String, Resolution> resolutionMap = this.LJLIL.getResolutionMap();
                LayoutArray layoutByPosAndSize = this.LJLIL.getLayoutByPosAndSize(i, this.LJLJI.LIZ.LJFF.LJIIIIZZ());
                if (layoutByPosAndSize != null) {
                    str = layoutByPosAndSize.getReso_id();
                }
                Resolution resolution = resolutionMap.get(str);
                C76710U8s invoke = this.LJLJJI.invoke(Integer.valueOf(i));
                if (region == null && resolution != null && invoke != null) {
                    RectF n5 = this.LJLJJL.n5(invoke.LIZ());
                    if (n5 == null) {
                        n5 = invoke.LIZ();
                    }
                    OSZ<Integer, Integer> h5 = this.LJLJJL.h5(resolution);
                    Bitmap LIZJ = this.LJLJI.LIZJ(h5.getFirst().intValue(), h5.getSecond().intValue());
                    if (LIZJ != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Gecko_Resource_Loader_addWaterMarkWithId pos = ");
                        LIZ.append(i);
                        LIZ.append(" info = ");
                        LIZ.append(invoke);
                        C0NB.LIZIZ("def_mask", X1D.LIZIZ(LIZ));
                        U8M u8m2 = this.LJLJI.LIZ.LJFF;
                        String LJ = KMP.LJ("mask_", i);
                        Client.RTCWaterMarkRegion rTCWaterMarkRegion = new Client.RTCWaterMarkRegion();
                        InterfaceC75807Tp5 interfaceC75807Tp5 = this.LJLJJL;
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
