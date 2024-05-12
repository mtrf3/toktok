package com.ss.android.ugc.aweme.casting.ui.casting;

import X.AbstractC55082Lja;
import X.C71042qa;
import X.C71082qe;
import X.C779434c;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CastingPanelComponent$isReadyToCast$1 extends MutableLiveData<Boolean> {
    public final /* synthetic */ CastingPanelComponent this$0;

    public final void refresh() {
        C779434c c779434c;
        IFeedPanelPlatformAbility v3;
        AbstractC55082Lja abstractFeedAdapter;
        List<Aweme> LJJIL;
        C71082qe c71082qe = C71042qa.LIZIZ;
        boolean z = true;
        if (c71082qe == null || (c779434c = c71082qe.LIZIZ) == null || !c779434c.LJIIIZ() || (v3 = this.this$0.v3()) == null || (abstractFeedAdapter = v3.getAbstractFeedAdapter()) == null || (LJJIL = abstractFeedAdapter.LJJIL()) == null || !(!LJJIL.isEmpty())) {
            z = false;
        }
        if (!o.LJ(Boolean.valueOf(z), getValue())) {
            postValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CastingPanelComponent$isReadyToCast$1(CastingPanelComponent castingPanelComponent) {
        super(Boolean.FALSE);
        this.this$0 = castingPanelComponent;
    }
}
