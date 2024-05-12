package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS58S0400000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Tf3, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75185Tf3 implements InterfaceC75807Tp5 {
    public static final C75185Tf3 LIZ = new C75185Tf3();

    @Override // X.InterfaceC75807Tp5
    public final void b5(int i, String str, AqS58S0400000_13 aqS58S0400000_13) {
    }

    @Override // X.InterfaceC75807Tp5
    public final JSONObject c5(InteractConfig interactConfig, List list, int i, int i2, java.util.Map map, Layout layout, String str, java.util.Map map2, String str2, InterfaceC75807Tp5 interfaceC75807Tp5, java.util.Map map3, List list2, float f, long j, int i3, HashMap businessMixStreamPermanentRegionTaskQueue) {
        o.LJIIIZ(businessMixStreamPermanentRegionTaskQueue, "businessMixStreamPermanentRegionTaskQueue");
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean e5(int i, String str) {
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF g5(Region region) {
        o.LJIIIZ(region, "region");
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final ImageModel j5(String str) {
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final int k5() {
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final Drawable m5() {
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final RectF n5(RectF rectF) {
        return null;
    }

    @Override // X.InterfaceC75807Tp5
    public final Client.RTCWaterMarkRegion.TranscoderImageRenderMode LIZ() {
        return Client.RTCWaterMarkRegion.TranscoderImageRenderMode.RENDER_FIT;
    }

    @Override // X.InterfaceC75807Tp5
    public final int Z4(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean a5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final int f5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final OSZ<Integer, Integer> h5(Resolution resolution) {
        return C75418Tio.LIZ(resolution);
    }

    @Override // X.InterfaceC75807Tp5
    public final int l5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return 0;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean o5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final boolean p5(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        return false;
    }

    @Override // X.InterfaceC75807Tp5
    public final double d5(Layout layout, String str) {
        o.LJIIIZ(layout, "layout");
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    @Override // X.InterfaceC75807Tp5
    public final C73579SuF i5(int i, String str) {
        return AbstractC73638SvC.LJI(C42039Geh.LJLIL);
    }
}
