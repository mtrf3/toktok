package com.ss.android.ugc.effectmanager;

import X.C84418XBe;
import X.XDR;
import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class IFetchResourceListenerKt {
    public static final XDR<Long> toKNListener(final IFetchResourceListener iFetchResourceListener) {
        if (iFetchResourceListener != null) {
            return new XDR<Long>() { // from class: com.ss.android.ugc.effectmanager.IFetchResourceListenerKt$toKNListener$1
                public void preProcess(long j) {
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void onSuccess(Long l) {
                    onSuccess(l.longValue());
                }

                @Override // X.XDR
                public /* bridge */ /* synthetic */ void preProcess(Long l) {
                    preProcess(l.longValue());
                }

                public void onSuccess(long j) {
                    IFetchResourceListener.this.onSuccess(j);
                }

                @Override // X.XDR
                public void onFail(Long l, C84418XBe exception) {
                    o.LJIIJ(exception, "exception");
                    IFetchResourceListener iFetchResourceListener2 = IFetchResourceListener.this;
                    Exception exception2 = ListenerAdaptExtKt.toOldExceptionResult(exception).getException();
                    o.LJFF(exception2, "exception.toOldExceptionResult().exception");
                    iFetchResourceListener2.onFailure(exception2);
                }
            };
        }
        return null;
    }
}
