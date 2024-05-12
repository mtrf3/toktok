package com.ss.android.ugc.aweme.effectcreator.services;

import X.C76800UCe;
import X.C93812aWu;
import X.InterfaceC88472Yns;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.effectcreatormobile.ckeapi.api.hint.IEffectHintSelect;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.prop.impl.EffectHintSelectDialogServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class TikTokEffectHintSelectImpl implements IEffectHintSelect {
    @Override // com.bytedance.effectcreatormobile.ckeapi.api.hint.IEffectHintSelect
    public void onShowEffectHintSelectDialog(List<EffectHint> hints, EffectHint effectHint, FragmentManager fragmentManager, InterfaceC88472Yns<? super EffectHint, C76800UCe> onSelect) {
        o.LJIIIZ(hints, "hints");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        o.LJIIIZ(onSelect, "onSelect");
        ArrayList arrayList = new ArrayList();
        Iterator<EffectHint> it = hints.iterator();
        while (it.hasNext()) {
            EffectHintWrapper LIZIZ = C93812aWu.LIZIZ(it.next());
            if (LIZIZ != null) {
                arrayList.add(LIZIZ);
            }
        }
        EffectHintSelectDialogServiceImpl.LIZIZ().LIZ(arrayList, C93812aWu.LIZIZ(effectHint), fragmentManager, new IDqS419S0100000_42(onSelect, 17));
    }
}
