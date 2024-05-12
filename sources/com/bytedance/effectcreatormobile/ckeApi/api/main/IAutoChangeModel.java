package com.bytedance.effectcreatormobile.ckeapi.api.main;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.news.common.service.manager.IService;

/* loaded from: classes34.dex */
public interface IAutoChangeModel extends IService {
    void autoChangeModelWhenAddNew(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void autoChangeModelWhenCopy(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void autoChangeModelWhenLayerSelect(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void autoChangeModelWhenObjectEdit(long j, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    void autoChangeModelWithReason(long j, String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);
}
