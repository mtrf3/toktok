package com.bytedance.ies.powerlist;

import X.C09K;
import X.C111104Xq;
import X.C16970lZ;
import X.C221108m2;
import X.C227568wS;
import X.C227618wX;
import X.C32I;
import X.C49485JbV;
import X.C62822Ol8;
import X.C76800UCe;
import X.InterfaceC117044ia;
import X.InterfaceC57784Mm4;
import X.InterfaceC88471Ynr;
import X.InterfaceC88473Ynt;
import X.MZ9;
import X.SI4;
import X.SIT;
import X.SIU;
import X.SYO;
import X.SYP;
import X.SYR;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PowerStub implements LifecycleEventObserver, Observer<MZ9> {
    public static final /* synthetic */ int LJZL = 0;
    public final PowerAdapter LJLIL;
    public final SIT LJLILLLLZI;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJLJI;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJLJJI;
    public final InterfaceC88473Ynt<Boolean, Boolean, Boolean, C76800UCe> LJLJJL;
    public PowerStub LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final Map<Integer, Class<? extends PowerCell<?>>> LJLJLLL;
    public final Map<Type, Integer> LJLL;
    public final C62822Ol8 LJLLI;
    public volatile int LJLLILLLL;
    public final List<InterfaceC57784Mm4> LJLLJ;
    public final CopyOnWriteArrayList<SIU> LJLLL;
    public final CopyOnWriteArrayList<SIU> LJLLLL;
    public boolean LJLLLLLL;
    public LifecycleOwner LJLZ;
    public final List<InterfaceC57784Mm4> LJZ;
    public final C62822Ol8 LJZI;

    public PowerStub() {
        throw null;
    }

    public final void LIZJ() {
        InterfaceC88473Ynt<Boolean, Boolean, Boolean, C76800UCe> interfaceC88473Ynt = this.LJLJJL;
        Boolean bool = Boolean.FALSE;
        interfaceC88473Ynt.invoke(bool, Boolean.TRUE, bool);
    }

    public final void LJFF() {
        CopyOnWriteArrayList<SIU> copyOnWriteArrayList = this.LJLLL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(copyOnWriteArrayList, 10));
        Iterator<SIU> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LJLIL);
        }
        LJII(copyOnWriteArrayList, arrayList);
    }

    public final void LJIIIIZZ() {
        ((ArrayList) this.LJZ).clear();
        ((ArrayList) this.LJZ).addAll(this.LJLLL);
        ((ArrayList) this.LJZ).addAll(this.LJLLJ);
        ((ArrayList) this.LJZ).addAll(this.LJLLLL);
    }

    public final <T extends InterfaceC117044ia> T LIZLLL(Class<T> cls) {
        SYP syp;
        T t = (T) ((SYP) this.LJZI.getValue()).LIZ(cls);
        if (t == null) {
            PowerStub powerStub = this.LJLJJLL;
            if (powerStub != null && (syp = (SYP) powerStub.LJZI.getValue()) != null) {
                return (T) syp.LIZ(cls);
            }
            return null;
        }
        return t;
    }

    public final void LJ(List<? extends Class<? extends PowerCell<?>>> classes) {
        o.LJIIIZ(classes, "classes");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<? extends Class<? extends PowerCell<?>>> it = classes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Class<? extends PowerCell<?>> next = it.next();
            Type genericSuperclass = next.getGenericSuperclass();
            o.LJII(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            o.LJIIIIZZ(actualTypeArguments, "parameterizedType.actualTypeArguments");
            for (Type type : actualTypeArguments) {
                if (((HashMap) this.LJLL).get(type) == null) {
                    int i = this.LJLLILLLL;
                    this.LJLLILLLL = i + 1;
                    hashMap.put(type, Integer.valueOf(i));
                    hashMap2.put(Integer.valueOf(i), next);
                }
            }
        }
        ((HashMap) this.LJLL).putAll(hashMap);
        ((HashMap) this.LJLJLLL).putAll(hashMap2);
        for (Class<? extends PowerCell<?>> cls : classes) {
            C62822Ol8 c62822Ol8 = C227568wS.LJ;
            Integer num = ((C227618wX) c62822Ol8.getValue()).LIZ.get(cls);
            if (num == null) {
                num = 0;
            }
            o.LJIIIIZZ(num, "Power.preLayouts.getCellLayoutId(it)");
            int intValue = num.intValue();
            if (intValue != 0) {
                Integer num2 = ((C227618wX) c62822Ol8.getValue()).LIZIZ.get(cls);
                if (num2 == null) {
                    num2 = 1;
                }
                o.LJIIIIZZ(num2, "Power.preLayouts.getCellCount(it)");
                int intValue2 = num2.intValue();
                for (int i2 = 0; i2 < intValue2; i2++) {
                    C16970lZ.LJ(intValue, this.LJLILLLLZI.LJLJI);
                }
            }
        }
        C49485JbV c49485JbV = ((SYR) this.LJLIL.LLII.getValue()).LJFF;
        if (c49485JbV != null) {
            c49485JbV.LJIILLIIL();
        }
    }

    public final void LJI(View view) {
        if (view == null) {
            return;
        }
        int size = this.LJLLL.size();
        for (int i = 0; i < size; i++) {
            if (this.LJLLL.get(i).LJLIL == view) {
                this.LJLLL.remove(i);
                this.LJLJJI.invoke(0, 1);
                LIZJ();
                return;
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MZ9 mz9) {
        MZ9 content = mz9;
        o.LJIIIZ(content, "content");
        ((ArrayList) this.LJLLJ).clear();
        ((ArrayList) this.LJLLJ).addAll(content.LJLIL);
        this.LJLJJL.invoke(Boolean.valueOf(content.LJLILLLLZI), Boolean.FALSE, Boolean.valueOf(content.LJLJI));
    }

    public final <T extends InterfaceC117044ia> void LIZ(T control, Class<T> cls) {
        o.LJIIIZ(control, "control");
        SYP syp = (SYP) this.LJZI.getValue();
        syp.getClass();
        if (!((Map) syp.LIZ.getValue()).containsKey(cls)) {
            ((Map) syp.LIZ.getValue()).put(cls, control);
            return;
        }
        throw new RuntimeException(C09K.LIZIZ("already contains control type :", cls));
    }

    public final void LIZIZ(int i, View view) {
        if (view == null) {
            return;
        }
        int i2 = this.LJLJL;
        this.LJLJL = i2 + 1;
        this.LJLLL.add(i, new SIU(view, i2));
        ((HashMap) this.LJLJLLL).put(Integer.valueOf(i2), FixedViewCell.class);
        this.LJLJI.invoke(0, 1);
        LIZJ();
    }

    public final void LJII(CopyOnWriteArrayList<SIU> copyOnWriteArrayList, List<? extends View> list) {
        Iterator<SIU> it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            SIU next = it.next();
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (next.LJLIL == next2) {
                    if (next2 != null) {
                        copyOnWriteArrayList.remove(next);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            LIZJ();
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        switch (C111104Xq.LIZ[event.ordinal()]) {
            case 1:
                Boolean valueOf = Boolean.valueOf(this.LJLLLLLL);
                if (!(!valueOf.booleanValue())) {
                    return;
                }
                valueOf.booleanValue();
                SIT sit = this.LJLILLLLZI;
                sit.getClass();
                sit.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                sit.onCreate();
                this.LJLLLLLL = true;
                return;
            case 2:
                SIT sit2 = this.LJLILLLLZI;
                sit2.getClass();
                sit2.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
                return;
            case 3:
                SIT sit3 = this.LJLILLLLZI;
                sit3.getClass();
                sit3.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                return;
            case 4:
                SIT sit4 = this.LJLILLLLZI;
                sit4.getClass();
                sit4.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                return;
            case 5:
                SIT sit5 = this.LJLILLLLZI;
                sit5.getClass();
                sit5.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                return;
            case 6:
                SIT sit6 = this.LJLILLLLZI;
                sit6.getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                sit6.onDestroy();
                return;
            default:
                return;
        }
    }

    public PowerStub(PowerAdapter powerAdapter, SIT sit, AqS174S0200000_12 aqS174S0200000_12, SI4 si4, IDqS436S0100000_12 iDqS436S0100000_12) {
        this.LJLIL = powerAdapter;
        this.LJLILLLLZI = sit;
        this.LJLJI = aqS174S0200000_12;
        this.LJLJJI = si4;
        this.LJLJJL = iDqS436S0100000_12;
        this.LJLJL = 10000;
        this.LJLJLJ = 20000;
        this.LJLJLLL = new HashMap();
        this.LJLL = new HashMap();
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1160));
        this.LJLLJ = new ArrayList();
        this.LJLLL = new CopyOnWriteArrayList<>();
        this.LJLLLL = new CopyOnWriteArrayList<>();
        this.LJZ = new ArrayList();
        this.LJZI = C221108m2.LIZIZ(SYO.LJLIL);
    }
}
