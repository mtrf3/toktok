package X;

import Y.IDfS292S0100000;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveViolationSetting;
import kotlin.jvm.internal.IDqS0S0001000;
import kotlin.jvm.internal.IDqS0S0301000;
import kotlin.jvm.internal.o;

/* renamed from: X.0NQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Context context, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2) {
        C65814PsI.LIZ().getClass();
        Object LIZJ = C65814PsI.LIZJ(LinkReviewApi.class);
        o.LJIIIIZZ(LIZJ, "get().getService(LinkReviewApi::class.java)");
        ((InterfaceC29205BdB) ((AbstractC73638SvC) interfaceC88472Yns.invoke(LIZJ)).LIZLLL(C73933Szx.LIZ(C73931Szv.LIZIZ(lifecycleOwner, Lifecycle.Event.ON_DESTROY), new C62705OjF()))).LIZJ(new IDfS292S0100000(interfaceC88472Yns2, 10), new IDfS292S0100000(context, 11));
    }

    public static final void LIZ(Context context, LifecycleOwner lifecycleOwner, int i, InterfaceC74834TYo interfaceC74834TYo, InterfaceC88472Yns<? super LatestBanRecordInfo, C76800UCe> interfaceC88472Yns) {
        if (context == null || lifecycleOwner == null) {
            return;
        }
        if (!LiveViolationSetting.INSTANCE.getValue()) {
            LIZIZ(context, lifecycleOwner, new IDqS0S0001000(i, 1), interfaceC88472Yns);
        } else {
            LIZIZ(context, lifecycleOwner, new IDqS0S0001000(i, 2), new IDqS0S0301000(context, lifecycleOwner, interfaceC74834TYo, i, 0));
        }
    }
}
