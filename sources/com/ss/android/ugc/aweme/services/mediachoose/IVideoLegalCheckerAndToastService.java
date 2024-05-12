package com.ss.android.ugc.aweme.services.mediachoose;

import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;

/* loaded from: classes8.dex */
public interface IVideoLegalCheckerAndToastService {
    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, InterfaceC88471Ynr<? super String, ? super Long, C76800UCe> interfaceC88471Ynr, InterfaceC88474Ynu<? super String, ? super Long, ? super Integer, ? super String, C76800UCe> interfaceC88474Ynu);

    void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);

    boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns);
}
