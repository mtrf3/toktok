package X;

import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.model.message.tracking.ReasonMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.B4a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28176B4a {
    public static final void LIZ(String reason) {
        o.LJIIIZ(reason, "reason");
        C28733BPl.LJIILIIL().getClass();
        C0NE.LIZ("ttlive_fetch_message_polling_failed", reason);
    }

    public static final void LIZIZ(List<? extends IdMessage> successfulList, List<? extends ReasonMessage> failedList) {
        o.LJIIIZ(successfulList, "successfulList");
        o.LJIIIZ(failedList, "failedList");
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            HashMap hashMap = new HashMap();
            if (!successfulList.isEmpty()) {
                hashMap.put("successfulMessages", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, successfulList));
            }
            if (!failedList.isEmpty()) {
                hashMap.put("failedMessages", GsonProtectorUtils.toJson(C09650Zl.LIZIZ, failedList));
            }
            C28733BPl.LJIILIIL().LIZIZ("ttlive_fetch_message_polling_succeeded", hashMap);
        }
    }
}
