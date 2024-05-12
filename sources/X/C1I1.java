package X;

import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.HashMap;

/* renamed from: X.1I1, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1I1 implements InterfaceC48038ItG {
    public static float LIZ(float f, float f2, float f3, float f4) {
        return ((f * f2) + f3) * f4;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        HashMap hashMap = new HashMap();
        C43881HKb.LIZJ(((RoomLinkInfo) obj).channelId, hashMap, "channel_id", "connection_type", "anchor");
        return hashMap;
    }

    public static float LIZIZ(MotionEvent motionEvent, float f) {
        return Math.abs(f - motionEvent.getY());
    }

    public static MobClick LIZLLL(String str, String str2) {
        MobClick obtain = MobClick.obtain();
        obtain.setEventName(str);
        obtain.setLabelName(str2);
        return obtain;
    }

    public static int LIZJ(LinearLayout linearLayout, int i, int i2, int i3) {
        linearLayout.setPadding(i, i2, i3, linearLayout.getPaddingBottom());
        return linearLayout.getPaddingLeft();
    }
}
