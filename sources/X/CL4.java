package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamAudioParams;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamAudioParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamIndependentSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamVideoParams;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixStreamVideoParamsSetting;

/* loaded from: classes6.dex */
public final class CL4 {
    public static final LinkMicMixStreamVideoParams LIZ;
    public static final LinkMicMixStreamAudioParams LIZIZ;

    static {
        LinkMicMixStreamIndependentSetting.INSTANCE.getValue();
        LIZ = LinkMicMixStreamVideoParamsSetting.INSTANCE.getValue();
        LIZIZ = LinkMicMixStreamAudioParamsSetting.INSTANCE.getValue();
    }
}
