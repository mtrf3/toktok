package X;

import com.byted.cast.common.bean.SinkDeviceInfo;
import com.byted.cast.common.utils.GsonUtils;
import java.util.HashMap;

/* renamed from: X.ZeP, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90433ZeP extends HashMap<String, String> {
    public C90433ZeP(SinkDeviceInfo sinkDeviceInfo) {
        put("device_info", GsonUtils.toJsonIgnoreException(sinkDeviceInfo));
        put("protocol", "ChromeCast");
    }
}
