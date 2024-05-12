package com.ss.android.ugc.aweme.services.external.ability;

import X.ActivityC45651qj;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.os.Bundle;
import com.ss.android.ugc.aweme.services.external.IRecordEnv;

/* loaded from: classes8.dex */
public interface IOpenTextNextService {
    void loadTextModeRes();

    void openTextModeCanvas(IRecordEnv iRecordEnv, int i, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void textCanvasGoNext(ActivityC45651qj activityC45651qj, Bundle bundle);

    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void openTextModeCanvas$default(IOpenTextNextService iOpenTextNextService, IRecordEnv iRecordEnv, int i, InterfaceC88472Yns interfaceC88472Yns, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 4) != 0) {
                    interfaceC88472Yns = null;
                }
                iOpenTextNextService.openTextModeCanvas(iRecordEnv, i, interfaceC88472Yns);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openTextModeCanvas");
        }
    }
}
