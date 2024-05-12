package com.ss.android.ugc.aweme.services.sparrow;

import X.C41759GaB;
import X.C41767GaJ;
import X.C42354Gjm;
import X.C42990Gu2;
import X.C43466H4c;
import X.H7B;
import X.InterfaceC41766GaI;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishXServiceImpl implements InterfaceC41766GaI {
    public final void printPublishModelInOfflineStorage(PublishModel publishModel) {
    }

    private final String eventConclusion(Throwable th) {
        if (!(th instanceof C41759GaB)) {
            return "no conclusion available";
        }
        if (isQuietlySyntheticCancel((C41759GaB) th)) {
            return "User cancelled publish, no need to handle";
        }
        if (!(th.getCause() instanceof C43466H4c)) {
            return "no conclusion available";
        }
        return "Debug mock publish failure enabled";
    }

    private final int eventExplanation(Throwable th) {
        if (!(th instanceof C41759GaB) || !(th.getCause() instanceof C43466H4c)) {
            return -1;
        }
        return 1;
    }

    private final String eventMessage(Throwable th) {
        if (!(th instanceof C41759GaB) || !isQuietlySyntheticCancel((C41759GaB) th)) {
            return "no message available";
        }
        return "User cancelled publish";
    }

    private final boolean isQuietlySyntheticCancel(C41759GaB c41759GaB) {
        Throwable cause = c41759GaB.getCause();
        if ((cause instanceof C42990Gu2) && ((C42990Gu2) cause).getCode() == -66666) {
            return true;
        }
        if ((cause instanceof C41767GaJ) && ((C41767GaJ) cause).getErrorCode() == -39993) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC41766GaI
    public void reportPublishFailure(PublishModel publishModel, C41759GaB error, boolean z) {
        o.LJIIIZ(error, "error");
        C42354Gjm.LIZ();
        H7B.LIZ("jinx publish failure report disabled.");
    }
}
