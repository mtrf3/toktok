package Y;

import X.C62610Ohi;
import X.LQ2;
import X.LQM;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingResponse;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.GetLiveBubbleResponse;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDHandlerS9S0000000_9 extends Handler {
    public final int $t;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS9S0000000_9(Looper looper, int i) {
        super(looper);
        this.$t = i;
    }

    public static final void handleMessage$0(IDHandlerS9S0000000_9 iDHandlerS9S0000000_9, Message msg) {
        String str;
        Object obj;
        GetLiveBubbleResponse getLiveBubbleResponse;
        LiveBubbleData data;
        String str2;
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i != 42) {
            if (i == 43 && (obj = msg.obj) != null && (obj instanceof GetLiveBubbleResponse) && (data = (getLiveBubbleResponse = (GetLiveBubbleResponse) obj).getData()) != null && data.getRoomData() != null) {
                LiveBubbleData data2 = getLiveBubbleResponse.getData();
                if (data2 == null || (str2 = data2.getBubbleTitle()) == null) {
                    str2 = "";
                }
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                LQM.LJFF = getLiveBubbleResponse.getData();
                LQM.LJI = getLiveBubbleResponse.getData();
                LQM.LJII = getLiveBubbleResponse.getExtra();
                LiveBubbleData liveBubbleData = LQM.LJFF;
                if (liveBubbleData == null) {
                    return;
                }
                LQM.LIZ(liveBubbleData);
                return;
            }
            return;
        }
        Object obj2 = msg.obj;
        if (obj2 == null || !(obj2 instanceof BubbleSettingResponse)) {
            return;
        }
        BubbleSettingData data3 = ((BubbleSettingResponse) obj2).getData();
        LQM.LJIILL = data3;
        if (data3 == null) {
            return;
        }
        if (data3.getStayInterval() <= 0 || data3.getShowInterval() <= 0) {
            if (data3.getStayInterval() <= 0) {
                str = "not_stay";
            } else {
                str = "not_show";
            }
            LQ2.LIZLLL(str);
            return;
        }
        iDHandlerS9S0000000_9.postDelayed(new ARunnableS45S0100000_9(data3, 192), data3.getShowInterval() * 1000);
    }

    public static final void handleMessage$1(IDHandlerS9S0000000_9 iDHandlerS9S0000000_9, Message msg) {
        o.LJIIIZ(msg, "msg");
        C62610Ohi.LIZIZ();
    }
}
