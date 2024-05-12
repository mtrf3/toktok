package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C141335gf;
import X.C221018lt;
import X.C3C5;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class AqS0S2013000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public int i4;
    public int i5;
    public String s0;
    public String s1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S2013000_9 aqS0S2013000_9, Object obj) {
        Object LIZ;
        int i;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        String str = aqS0S2013000_9.s0;
        String str2 = aqS0S2013000_9.s1;
        int i2 = aqS0S2013000_9.i3;
        int i3 = aqS0S2013000_9.i4;
        int i4 = aqS0S2013000_9.i5;
        boolean z = aqS0S2013000_9.z2;
        try {
            sendEventTrackingAsync.put("enter_from", str);
            sendEventTrackingAsync.put("enter_method", str2);
            sendEventTrackingAsync.put("live_cnt", i2);
            sendEventTrackingAsync.put("story_cnt", i3);
            sendEventTrackingAsync.put("total_story_cnt", i4);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ = sendEventTrackingAsync.put("has_self_story_pub", i);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZLLL("FeedSkylightEventTracker", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2013000_9 aqS0S2013000_9, Object obj) {
        Object LIZ;
        int i;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        String str = aqS0S2013000_9.s0;
        String str2 = aqS0S2013000_9.s1;
        int i2 = aqS0S2013000_9.i3;
        int i3 = aqS0S2013000_9.i4;
        int i4 = aqS0S2013000_9.i5;
        boolean z = aqS0S2013000_9.z2;
        try {
            sendEventTrackingAsync.put("type", str);
            sendEventTrackingAsync.put("enter_from", str2);
            sendEventTrackingAsync.put("live_cnt", i2);
            sendEventTrackingAsync.put("story_cnt", i3);
            sendEventTrackingAsync.put("total_story_cnt", i4);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            LIZ = sendEventTrackingAsync.put("has_self_story_pub", i);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZLLL("FeedSkylightEventTracker", m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2013000_9(String str, int i, boolean z, int i2, int i3, String str2, int i4) {
        super(1);
        this.$t = i4;
        this.s0 = str;
        this.s1 = str2;
        this.i3 = i;
        this.i4 = i2;
        this.i5 = i3;
        this.z2 = z;
    }
}
