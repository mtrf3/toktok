package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.model.Region;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS58S0400000_13;
import org.json.JSONObject;

/* renamed from: X.Tp5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC75807Tp5 {
    Client.RTCWaterMarkRegion.TranscoderImageRenderMode LIZ();

    int Z4(String str);

    boolean a5(String str);

    void b5(int i, String str, AqS58S0400000_13 aqS58S0400000_13);

    JSONObject c5(InteractConfig interactConfig, List list, int i, int i2, java.util.Map map, Layout layout, String str, java.util.Map map2, String str2, InterfaceC75807Tp5 interfaceC75807Tp5, java.util.Map map3, List list2, float f, long j, int i3, HashMap hashMap);

    double d5(Layout layout, String str);

    boolean e5(int i, String str);

    int f5(String str);

    RectF g5(Region region);

    OSZ<Integer, Integer> h5(Resolution resolution);

    C73579SuF i5(int i, String str);

    ImageModel j5(String str);

    int k5();

    int l5(String str);

    Drawable m5();

    RectF n5(RectF rectF);

    boolean o5(String str);

    boolean p5(String str);
}
