package com.ss.android.ugc.aweme.notification.creator.assem;

import X.AbstractC029409q;
import X.C213688a4;
import X.C214298b3;
import X.C221018lt;
import X.C221108m2;
import X.C28871Bj;
import X.C55096Ljo;
import X.C56851MSx;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8YN;
import X.C9BE;
import X.EnumC94693nd;
import X.TBT;
import X.X1D;
import Y.AObserverS77S0100000_9;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.notification.creator.vscope.ICreatorFindBaseAdapterAbility;
import com.ss.android.ugc.aweme.relation.recuser.inbox.AbsUserCardInboxWidget;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorRecommendUserAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public EnumC94693nd LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public CreatorRecommendUserAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(CreatorNoticeResultVM.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 383), C56851MSx.INSTANCE, null);
        this.LJLILLLLZI = EnumC94693nd.LOADING;
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 382));
    }

    public final AbsUserCardInboxWidget A3() {
        return (AbsUserCardInboxWidget) this.LJLJI.getValue();
    }

    public final CreatorNoticeResultVM x3() {
        return (CreatorNoticeResultVM) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        AbsUserCardInboxWidget A3 = A3();
        if (A3 != null) {
            getLifecycle().addObserver(A3);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MutableLiveData<Boolean> mutableLiveData;
        AbstractC029409q<?> LJIIJ;
        LiveData<EnumC94693nd> LJIILIIL;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8YN.LJII(this, x3(), new TBT() { // from class: X.MSy
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MT0) obj).LJLLI;
            }
        }, C213688a4.LJ(), new AqS191S0100000_9(this, 34), 4);
        ((LiveData) x3().LJLLI.getValue()).observe(this, new AObserverS77S0100000_9(this, 55));
        AbsUserCardInboxWidget A3 = A3();
        if (A3 != null && (LJIILIIL = A3.LJIILIIL()) != null) {
            LJIILIIL.observe(this, new AObserverS77S0100000_9(this, 56));
        }
        AbsUserCardInboxWidget A32 = A3();
        if (A32 != null && (LJIIJ = A32.LJIIJ()) != null) {
            LJIIJ.setHasStableIds(false);
        }
        AbsUserCardInboxWidget A33 = A3();
        if (A33 != null && (mutableLiveData = A33.LJLILLLLZI) != null) {
            mutableLiveData.postValue(Boolean.TRUE);
        }
    }

    public final void v3(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(x3().nv0());
        LIZ.append(": connectRecommendWidget: ");
        LIZ.append(z);
        C221018lt.LJFF("Creators_Inbox", X1D.LIZIZ(LIZ));
        C28871Bj c28871Bj = null;
        ICreatorFindBaseAdapterAbility iCreatorFindBaseAdapterAbility = (ICreatorFindBaseAdapterAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICreatorFindBaseAdapterAbility.class, null);
        if (iCreatorFindBaseAdapterAbility != null) {
            c28871Bj = iCreatorFindBaseAdapterAbility.sd0();
        }
        if (z) {
            new AqS156S0200000_9(this, c28871Bj, 22).invoke();
            return;
        }
        AbsUserCardInboxWidget A3 = A3();
        if (A3 == null || c28871Bj == null) {
            return;
        }
        c28871Bj.LJZI(A3.LJIIJ());
    }
}
