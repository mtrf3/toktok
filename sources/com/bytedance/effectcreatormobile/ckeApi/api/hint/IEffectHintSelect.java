package com.bytedance.effectcreatormobile.ckeapi.api.hint;

import X.C76800UCe;
import X.InterfaceC88472Yns;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

/* loaded from: classes34.dex */
public interface IEffectHintSelect extends IService {
    void onShowEffectHintSelectDialog(List<EffectHint> list, EffectHint effectHint, FragmentManager fragmentManager, InterfaceC88472Yns<? super EffectHint, C76800UCe> interfaceC88472Yns);
}
