package com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel;

import X.C110454Vd;
import X.C221108m2;
import X.C3Q9;
import X.C48841JEv;
import X.C4VV;
import X.C4VW;
import X.C4VY;
import X.C4WC;
import X.C62387Oe7;
import X.C62822Ol8;
import X.C63120Opw;
import X.C64962gm;
import X.C75782yE;
import X.C78613UtF;
import X.T2R;
import X.XKQ;
import X.XKX;
import android.os.SystemClock;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInviteInfoModel;
import djb.IDaS20S0000000_1;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class GroupShareViewModel extends ViewModel implements GenericLifecycleObserver {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final String LJLIL;
    public final C63120Opw LJLILLLLZI;
    public final MutableLiveData<GroupInviteInfoModel> LJLJI;
    public final MutableLiveData<C62387Oe7> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final C64962gm LJLJJLL;
    public XKQ LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final C110454Vd gv0() {
        return (C110454Vd) this.LJLJLJ.getValue();
    }

    public final void hv0() {
        gv0().LIZ(C4VW.NETWORK_START, SystemClock.elapsedRealtime());
        XKX.LIZLLL(this.LJLJJLL, C78613UtF.LIZJ, null, new C4VV(this, null), 2);
    }

    public GroupShareViewModel(String conversationId) {
        o.LJIIIZ(conversationId, "conversationId");
        this.LJLIL = conversationId;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        this.LJLILLLLZI = C4WC.LIZIZ.LIZ(conversationId);
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
        this.LJLJJLL = C48841JEv.LIZ(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 7).plus(T2R.LJIIJJI()));
        this.LJLJLJ = C221108m2.LIZIZ(C4VY.LJLIL);
    }
}
