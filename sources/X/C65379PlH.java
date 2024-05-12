package X;

import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.kakao.sdk.network.KakaoRetrofitConverterFactory;
import defpackage.e1;
import java.util.Date;

/* renamed from: X.PlH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C65379PlH implements InterfaceC65017PfR, ReceiverRegisterCrashOptimizer.DoRegisterHandlerCallback, InterfaceC47125IeX, InterfaceC43240Gy4 {
    @Override // X.InterfaceC43240Gy4
    public void LIZIZ() {
    }

    @Override // X.InterfaceC47125IeX
    public Object apply(Object obj) {
        return obj;
    }

    @Override // com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer.DoRegisterHandlerCallback
    public boolean shouldDoRegisterHandler() {
        if (!EEZ.LIZIZ() || !e1.LIZ(31744, "receiver_use_handler_settings", true, false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC65017PfR
    public Object LIZ(Object obj) {
        return KakaoRetrofitConverterFactory.m99stringConverter$lambda2$lambda1((Date) obj);
    }
}
