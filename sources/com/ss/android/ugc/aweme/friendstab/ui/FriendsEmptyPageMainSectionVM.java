package com.ss.android.ugc.aweme.friendstab.ui;

import X.AV1;
import X.ActivityC45651qj;
import X.C162476Zf;
import X.C16880lQ;
import X.C221018lt;
import X.C45804HyK;
import X.C48841JEv;
import X.C52926Kpu;
import X.C54490La2;
import X.C55724Ltw;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C77266UUc;
import X.C78999UzT;
import X.C7MY;
import X.EXV;
import X.EnumC58928NAu;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88472Yns;
import X.JF1;
import X.L7U;
import X.L97;
import X.L98;
import X.L99;
import X.LSE;
import X.LSF;
import X.LSG;
import X.LSH;
import X.MBE;
import X.T2R;
import X.T3Q;
import X.UPC;
import X.X1D;
import X.XI8;
import X.XKX;
import android.content.Context;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class FriendsEmptyPageMainSectionVM extends ViewModel {
    public final InterfaceC70422pa LJLIL = C48841JEv.LIZ(MBE.LIZ(T2R.LJIIJJI(), new XI8(C16880lQ.LLLLZLLIL())));
    public final LSH LJLILLLLZI = new LSH();
    public final C73318Sq2 LJLJI = new C73318Sq2();
    public boolean LJLJJI;
    public final MutableLiveData<L97> LJLJJL;
    public final MutableLiveData LJLJJLL;
    public final NextLiveData<C54490La2> LJLJL;
    public final NextLiveData<C54490La2> LJLJLJ;

    public final List<L7U> gv0() {
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI.getClass();
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        if (!c77266UUc.LJIILLIIL().LIZJ()) {
            arrayList.add(new L7U(L99.CONTACT, Integer.valueOf(R.string.go2), new AqS175S0100000_9(this, 86)));
        }
        this.LJLILLLLZI.getClass();
        if (!c77266UUc.LJIIJ().LIZJ()) {
            arrayList.add(new L7U(L99.FACEBOOK, Integer.valueOf(R.string.go3), new AqS175S0100000_9(this, 87)));
        }
        if (!arrayList.isEmpty()) {
            arrayList.add(new L7U(L99.INVITE, Integer.valueOf(R.string.hit), new AqS175S0100000_9(this, 88)));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new L7U(L99.SHARE_BAR, null, null));
        }
        return arrayList;
    }

    public FriendsEmptyPageMainSectionVM() {
        MutableLiveData<L97> mutableLiveData = new MutableLiveData<>(new L97(0, 0.0f, 15));
        this.LJLJJL = mutableLiveData;
        this.LJLJJLL = mutableLiveData;
        NextLiveData<C54490La2> nextLiveData = new NextLiveData<>();
        this.LJLJL = nextLiveData;
        this.LJLJLJ = nextLiveData;
    }

    public final L97 hv0() {
        int i;
        List<L7U> gv0 = gv0();
        ArrayList arrayList = (ArrayList) gv0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((L7U) it.next()).LIZ != L99.SHARE_BAR) {
                    i = R.string.el5;
                    break;
                }
            }
        }
        i = R.string.el7;
        return new L97(44.0f, i, C7MY.LIZIZ(60), gv0);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLJI.dispose();
    }

    public static void iv0(L99 type) {
        String str;
        o.LJIIIZ(type, "type");
        int i = L98.LIZ[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                str = "facebook";
            }
        } else {
            str = "contact";
        }
        C77266UUc c77266UUc = C77266UUc.LIZIZ;
        c77266UUc.LIZ.LJJIIZ(str, JF1.LIZIZ("position", "top", "from_empty_click", "true"));
    }

    public final void jv0(L99 l99, Context context) {
        LSG ufrType;
        Class<? extends UPC> LJJIJIIJI;
        LifecycleCoroutineScope lifecycleScope;
        int i = L98.LIZ[l99.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            } else {
                ufrType = LSG.FACEBOOK;
            }
        } else {
            ufrType = LSG.CONTACT;
        }
        if (C52926Kpu.LIZ()) {
            this.LJLILLLLZI.getClass();
            o.LJIIIZ(ufrType, "ufrType");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(LJJIFFI)) != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new C55724Ltw(context, ufrType, "homepage_friends", "click", null), 3);
                return;
            }
            return;
        }
        LSH lsh = this.LJLILLLLZI;
        C73318Sq2 disposable = this.LJLJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("position", "top");
        linkedHashMap.put("from_empty_click", "true");
        lsh.getClass();
        o.LJIIIZ(ufrType, "ufrType");
        o.LJIIIZ(disposable, "disposable");
        int i2 = LSF.LIZ[ufrType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                LJJIJIIJI = C77266UUc.LIZIZ.LJIIJJI();
            } else {
                throw new C162476Zf();
            }
        } else {
            LJJIJIIJI = C77266UUc.LIZIZ.LJJIJIIJI();
        }
        C78999UzT.LJFF(T3Q.LIZIZ(context, LJJIJIIJI, AV1.LIZIZ().getUid(), "homepage_friends", "click", true, linkedHashMap).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.9En
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.2P4
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("AuthorizationFlowManager UFR error: ");
                LIZ.append(((Throwable) obj).getMessage());
                LIZ.append(' ');
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
            }
        }), disposable);
    }

    public final Object kv0(InterfaceC88472Yns<? super L97, L97> interfaceC88472Yns, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        L97 value = this.LJLJJL.getValue();
        if (value == null) {
            value = new L97(0, 0.0f, 15);
        }
        L97 invoke = interfaceC88472Yns.invoke(value);
        if (invoke != null && !o.LJ(invoke, value)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update ui state: ");
            LIZ.append(invoke);
            C221018lt.LJFF("_FriendsEmpty", X1D.LIZIZ(LIZ));
            Object LJI = XKX.LJI(EXV.LIZ, new LSE(this, invoke, null), interfaceC67352kd);
            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI;
            }
            return C76800UCe.LIZ;
        }
        return C76800UCe.LIZ;
    }
}
