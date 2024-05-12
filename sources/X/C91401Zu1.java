package X;

import com.ss.android.ugc.aweme.dsp.common.model.DspDetailListResponse;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Zu1, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91401Zu1<T, R> implements InterfaceC48038ItG {
    public static final C91401Zu1<T, R> LJLIL = new C91401Zu1<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        DspDetailListResponse it = (DspDetailListResponse) obj;
        o.LJIIIZ(it, "it");
        if (it.status_code == 0 && it.getDspList() != null && !it.getDspList().isEmpty()) {
            for (DspStruct dspStruct : it.getDspList()) {
                if (!dspStruct.getDspMusic().getChorusOnly()) {
                    YBM.LIZ.getClass();
                    if (YBM.LIZ().getDspClipShowStrategy() == 6) {
                        dspStruct.getDspMusic().setChorusOnly(true);
                    }
                }
            }
            return it;
        }
        throw new RuntimeException("getDspDetailList request error");
    }
}
