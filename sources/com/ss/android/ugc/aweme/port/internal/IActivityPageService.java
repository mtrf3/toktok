package com.ss.android.ugc.aweme.port.internal;

import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.Q3S;

/* loaded from: classes12.dex */
public interface IActivityPageService {
    public static final Q3S Companion = Q3S.LIZ;

    void listenToCurrentPage(InterfaceC88471Ynr<? super Boolean, ? super String, C76800UCe> interfaceC88471Ynr);

    void updateCurrentScene(String str, boolean z);
}
