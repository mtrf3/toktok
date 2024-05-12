package com.ss.android.ugc.aweme.sticker.types.lock;

import X.C15070iV;
import X.C29S;
import X.C30581Hy;
import X.C36825Ecn;
import X.C46238ICs;
import X.C60903NvH;
import X.C76800UCe;
import X.C77413UZt;
import X.ERN;
import X.ERS;
import X.ETV;
import X.F4V;
import X.HF7;
import X.HQ7;
import X.HXS;
import X.IDK;
import X.InterfaceC46243ICx;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.J8V;
import X.T4L;
import X.T4Q;
import X.T4S;
import X.TEZ;
import X.TGM;
import X.V3N;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LockStickerHandler implements GenericLifecycleObserver, F4V, TGM {
    public final C29S LJLIL;
    public final TEZ LJLILLLLZI;
    public final InterfaceC88472Yns<InterfaceC46243ICx<?>, C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public Effect LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final C46238ICs LJLL;

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    public final void LJ() {
        ?? arrayList;
        if (!this.LJLJLLL) {
            return;
        }
        HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
        if (!accountService.isLogin() || TextUtils.isEmpty(accountService.getCurrentUserID())) {
            return;
        }
        TEZ tez = this.LJLILLLLZI;
        List LJIILJJIL = C30581Hy.LJIILJJIL(tez.LJJJJLL().LIZ());
        C15070iV c15070iV = new C15070iV(null, -1);
        if (!LJIILJJIL.isEmpty()) {
            int size = LJIILJJIL.size();
            int i = 0;
            loop1: while (true) {
                if (i >= size) {
                    break;
                }
                CategoryEffectModel LJI = C30581Hy.LJI(tez.LJJJJLL().LIZ(), ((EffectCategoryModel) ListProtector.get(LJIILJJIL, i)).getKey());
                if (LJI != null) {
                    int size2 = LJI.getEffects().size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        Effect effect = (Effect) ListProtector.get(LJI.getEffects(), i2);
                        if (V3N.LJIJJ(effect)) {
                            c15070iV = new C15070iV(effect, Integer.valueOf(i2));
                            break loop1;
                        }
                    }
                }
                i++;
            }
        }
        Effect effect2 = (Effect) c15070iV.LIZ;
        Integer num = (Integer) c15070iV.LIZIZ;
        if (effect2 == null) {
            return;
        }
        C29S c29s = this.LJLIL;
        String userId = accountService.getCurrentUserID();
        o.LJIIIZ(userId, "userId");
        HashMap hashMap = ETV.LIZ;
        Set keySet = hashMap.keySet();
        o.LJIIIIZZ(keySet, "map.keys");
        if (keySet.contains(userId)) {
            arrayList = (List) hashMap.get(userId);
            if (arrayList == 0) {
                return;
            }
        } else {
            arrayList = new ArrayList(new C36825Ecn(c29s, userId).LIZIZ);
            hashMap.put(userId, arrayList);
            Iterator it = arrayList.iterator();
            String str = "stickers had been reminded:";
            while (it.hasNext()) {
                str = a1.LJ(str, (String) it.next(), " , ");
            }
        }
        if (arrayList.isEmpty() || arrayList.contains(effect2.getEffectId()) || !ETV.LIZIZ(effect2)) {
            return;
        }
        C29S c29s2 = this.LJLIL;
        String userId2 = accountService.getCurrentUserID();
        String stickerId = effect2.getEffectId();
        o.LJIIIZ(userId2, "userId");
        o.LJIIIZ(stickerId, "stickerId");
        HashMap<String, List<String>> hashMap2 = ETV.LIZ;
        Set<String> keySet2 = hashMap2.keySet();
        o.LJIIIIZZ(keySet2, "map.keys");
        if (keySet2.contains(userId2)) {
            List<String> list = hashMap2.get(userId2);
            o.LJI(list);
            list.add(stickerId);
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(stickerId);
            hashMap2.put(userId2, arrayList2);
        }
        C36825Ecn c36825Ecn = new C36825Ecn(c29s2, userId2);
        if (c36825Ecn.LIZIZ.add(stickerId)) {
            c36825Ecn.LIZ.putStringSet("remindedIds", c36825Ecn.LIZIZ);
            c36825Ecn.LIZ.apply();
        }
        this.LJLJJL = effect2;
        o.LJI(num);
        this.LJLJJLL = num.intValue();
        LIZIZ();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LJLJL) {
            LJFF();
        }
    }

    public final void LIZIZ() {
        HF7 unlockStickerService = C60903NvH.LJIIJJI().unlockStickerService();
        C29S context = this.LJLIL;
        C46238ICs listener = this.LJLL;
        unlockStickerService.getClass();
        o.LJIIIZ(context, "context");
        o.LJIIIZ(listener, "listener");
        new HXS(listener);
    }

    public final void LJFF() {
        String str;
        HF7 unlockStickerService = C60903NvH.LJIIJJI().unlockStickerService();
        C29S c29s = this.LJLIL;
        if (this.LJLJLJ) {
            str = "click_locked_prop";
        } else {
            str = "click_prop_entrance";
        }
        ((C77413UZt) unlockStickerService).LJJIIJZLJL(c29s, str);
        this.LJLJJI.invoke();
        Effect effect = this.LJLJJL;
        if (effect != null) {
            this.LJLJI.invoke(J8V.LJI(effect, this.LJLJJLL, null, null, null, null, null, 0, false, null, 510));
        }
        this.LJLJL = false;
        this.LJLJLJ = false;
    }

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.TGM
    public final void LJI() {
        LJ();
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLJLLL = true;
        LJ();
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        this.LJLJLLL = false;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            if (ETV.LIZIZ(t4q.LIZ)) {
                ERS LIZ = ern.LIZ(T4Q.LIZIZ(t4q));
                this.LJLJJL = t4q.LIZ;
                this.LJLJLJ = true;
                LIZIZ();
                return LIZ;
            }
        }
        return ern.LIZ(session);
    }

    public LockStickerHandler(C29S activity, Lifecycle lifecycle, TEZ stickerDataManager, AqS173S0100000_7 aqS173S0100000_7, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LJLIL = activity;
        this.LJLILLLLZI = stickerDataManager;
        this.LJLJI = aqS173S0100000_7;
        this.LJLJJI = aqS157S0100000_7;
        this.LJLJJLL = -1;
        this.LJLL = new C46238ICs(this);
        lifecycle.addObserver(this);
    }
}
