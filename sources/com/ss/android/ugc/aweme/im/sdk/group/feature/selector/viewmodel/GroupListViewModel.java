package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel;

import X.AbstractC75682y4;
import X.C221108m2;
import X.C4VT;
import X.C62822Ol8;
import X.C62902dS;
import X.C63120Opw;
import X.C63623Oy3;
import X.C75672y3;
import X.XKQ;
import X.XKX;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.GroupListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;

/* loaded from: classes2.dex */
public final class GroupListViewModel extends ViewModel implements GenericLifecycleObserver {
    public final MutableLiveData<List<IMConversation>> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<IMConversation> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<C63623Oy3> LJLJI;
    public final MutableLiveData LJLJJI;
    public XKQ LJLJJL;
    public final C75672y3 LJLJJLL;
    public final C62822Ol8 LJLJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2y3] */
    public GroupListViewModel() {
        C75672y3 c75672y3;
        MutableLiveData<C63623Oy3> mutableLiveData = new MutableLiveData<>();
        this.LJLJI = mutableLiveData;
        this.LJLJJI = mutableLiveData;
        if (C4VT.LIZIZ()) {
            c75672y3 = new AbstractC75682y4<List<? extends C63120Opw>>() { // from class: X.2y3
                @Override // X.InterfaceC86963bA
                public final void LIZIZ(C63623Oy3 c63623Oy3) {
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(GroupListViewModel.this), null, null, new C75662y2(GroupListViewModel.this, c63623Oy3, null), 3);
                }

                @Override // X.AbstractC75682y4
                public final void LIZJ(long j, Object obj, boolean z) {
                    XKQ xkq = GroupListViewModel.this.LJLJJL;
                    if (xkq != null) {
                        xkq.LIZIZ(null);
                    }
                }
            };
        } else {
            c75672y3 = null;
        }
        this.LJLJJLL = c75672y3;
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 655));
        if (C4VT.LIZIZ()) {
            this.LJLJJL = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C62902dS(null), 3);
        }
    }
}
