package com.ss.android.ugc.aweme.relation.label;

import X.C57749MlV;
import X.C58053MqP;
import X.C58055MqR;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RelationLabelTextViewServiceImpl implements IRelationLabelTextViewService {
    @Override // com.ss.android.ugc.aweme.relation.label.IRelationLabelTextViewService
    public final C58053MqP LIZ(C57749MlV meta, C58055MqR config, TuxTextView tv, float f) {
        o.LJIIIZ(meta, "meta");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(tv, "tv");
        return new C58053MqP(meta, config, tv, f);
    }
}
