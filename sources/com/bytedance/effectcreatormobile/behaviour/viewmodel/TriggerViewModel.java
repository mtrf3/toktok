package com.bytedance.effectcreatormobile.behaviour.viewmodel;

import X.C93624aTs;
import X.C94384ag8;
import X.C94853anh;
import X.EnumC93623aTr;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.List;

/* loaded from: classes34.dex */
public final class TriggerViewModel extends StateViewModel {
    public final C93624aTs<List<C94384ag8>> LJLILLLLZI = new C93624aTs<>();
    public final C93624aTs<EnumC93623aTr> LJLJI = new C93624aTs<>(EnumC93623aTr.Loading);

    public TriggerViewModel() {
        iv0();
    }

    public final void iv0() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94853anh(this, null), 3);
    }
}
