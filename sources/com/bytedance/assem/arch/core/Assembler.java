package com.bytedance.assem.arch.core;

import X.ActivityC86117Xqz;
import X.C16880lQ;
import X.C214368bA;
import X.C3C8;
import X.C4LX;
import X.C62582cw;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C68322mC;
import X.C76800UCe;
import X.C770830u;
import X.C7C3;
import X.C88495YoF;
import X.C88501YoL;
import X.C8K7;
import X.C8NH;
import X.C8NK;
import X.C8NL;
import X.C8V1;
import X.C8V4;
import X.C8V5;
import X.C8V6;
import X.C8V7;
import X.C8V8;
import X.C8V9;
import X.C8VA;
import X.C8VB;
import X.C8VG;
import X.C8VI;
import X.C8VJ;
import X.C8VK;
import X.C8VV;
import X.C8W0;
import X.C8XE;
import X.InterfaceC198557ql;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC87283bg;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.SZE;
import X.X1D;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.view.UISlotAssem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS37S1300000_3;
import kotlin.jvm.internal.AqS63S0400000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class Assembler extends ViewModel {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Map<LifecycleOwner, AssemSupervisor> LJLIL = new ConcurrentHashMap();
    public final Map<LifecycleOwner, C7C3> LJLILLLLZI = new ConcurrentHashMap();
    public final Map<LifecycleOwner, C8VA> LJLJI = new ConcurrentHashMap();

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C8V7 c8v7 = C214368bA.LIZIZ;
        if (c8v7 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Assembler onCleared: ");
            LIZ.append(this);
            c8v7.log("AssemList", X1D.LIZIZ(LIZ));
        }
        ((ConcurrentHashMap) this.LJLILLLLZI).clear();
        ((ConcurrentHashMap) this.LJLIL).clear();
        ((ConcurrentHashMap) this.LJLJI).clear();
    }

    public final void iv0(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            C8V7 c8v7 = C214368bA.LIZIZ;
            if (c8v7 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Assembler clearAsLifecycleOwner: ");
                LIZ.append(lifecycleOwner);
                LIZ.append(", ");
                LIZ.append(this);
                c8v7.log("AssemList", X1D.LIZIZ(LIZ));
            }
            ((ConcurrentHashMap) this.LJLILLLLZI).remove(lifecycleOwner);
            ((ConcurrentHashMap) this.LJLJI).remove(lifecycleOwner);
            ((ConcurrentHashMap) this.LJLIL).remove(lifecycleOwner);
        }
    }

    public final C7C3 jv0(LifecycleOwner lifecycleOwner) {
        return (C7C3) ((ConcurrentHashMap) this.LJLILLLLZI).get(lifecycleOwner);
    }

    public final C8VA kv0(LifecycleOwner lifecycleOwner) {
        return (C8VA) ((ConcurrentHashMap) this.LJLJI).get(lifecycleOwner);
    }

    public final AssemSupervisor lv0(LifecycleOwner lifecycleOwner) {
        return (AssemSupervisor) ((ConcurrentHashMap) this.LJLIL).get(lifecycleOwner);
    }

    public final void gv0(LifecycleOwner lifecycleOwner, InterfaceC88472Yns assemBuilder) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        if ((lifecycleOwner instanceof Activity) || (lifecycleOwner instanceof Fragment) || (lifecycleOwner instanceof UIAssem) || (lifecycleOwner instanceof C8W0)) {
            AssemSupervisor lv0 = lv0(lifecycleOwner);
            if (lv0 == null) {
                return;
            }
            SZE.LIZ(String.valueOf(hashCode()), C65352Pkq.LIZ(C88501YoL.class));
            C8V6 c8v6 = new C8V6();
            assemBuilder.invoke(c8v6);
            C8W0 c8w0 = c8v6.LJFF;
            C8W0 c8w02 = null;
            if (c8w0 != null) {
                Iterator<C8W0> it = lv0.LJLLI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8W0 next = it.next();
                    if (o.LJ(next, c8w0)) {
                        c8w02 = next;
                        break;
                    }
                }
            } else {
                Iterator<C8W0> it2 = lv0.LJLLI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C8W0 next2 = it2.next();
                    C8W0 c8w03 = next2;
                    if (o.LJ(C65352Pkq.LIZ(c8w03.getClass()), c8v6.LIZJ()) && o.LJ(c8w03.assemTagInternal, c8v6.LIZIZ)) {
                        c8w02 = next2;
                        break;
                    }
                }
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88501YoL.class), String.valueOf(hashCode()), new AqS153S0100000_3(c8v6, 27));
            OSZ osz = new OSZ(c8w02, c8v6);
            C8W0 c8w04 = (C8W0) osz.getFirst();
            C8V1 c8v1 = (C8V1) osz.getSecond();
            c8v1.getClass();
            yv0(lv0, c8w04, c8v1);
            return;
        }
        "You can only assemble logic assems in Activity/Fragment/UIAssem/Assem".toString();
        throw new IllegalStateException("You can only assemble logic assems in Activity/Fragment/UIAssem/Assem");
    }

    public final AssemSupervisor hv0(LifecycleOwner lifecycleOwner, List children) {
        C8W0 c8w0;
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(children, "children");
        AssemSupervisor lv0 = lv0(lifecycleOwner);
        if (lv0 == null) {
            return null;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            C8V1 c8v1 = (C8V1) it.next();
            Iterator<C8W0> it2 = lv0.LJLLI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    c8w0 = it2.next();
                    C8W0 c8w02 = c8w0;
                    if (!o.LJ(C65352Pkq.LIZ(c8w02.getClass()), c8v1.LIZJ()) || !o.LJ(c8w02.assemTagInternal, c8v1.LIZIZ)) {
                    }
                } else {
                    c8w0 = null;
                    break;
                }
            }
            c8v1.getClass();
            yv0(lv0, c8w0, c8v1);
        }
        return lv0;
    }

    public final void mv0(Fragment fragment, InterfaceC88472Yns<? super C4LX<InterfaceC87283bg>, C76800UCe> builder) {
        o.LJIIIZ(fragment, "<this>");
        o.LJIIIZ(builder, "builder");
        C4LX c4lx = new C4LX();
        builder.invoke(c4lx);
        OSZ LIZ = c4lx.LIZ();
        String str = (String) LIZ.getFirst();
        InterfaceC87283bg interfaceC87283bg = (InterfaceC87283bg) LIZ.getSecond();
        C8K7.LIZ("assem_hierarchy_data", new AqS37S1300000_3(fragment, str, interfaceC87283bg, this, 1), false);
        C7C3 c7c3 = (C7C3) ((ConcurrentHashMap) this.LJLILLLLZI).get(fragment);
        if (c7c3 != null) {
            c7c3.LIZJ(interfaceC87283bg, str);
        }
    }

    public final void nv0(C8W0 c8w0, InterfaceC88472Yns<? super C4LX<InterfaceC87283bg>, C76800UCe> builder) {
        o.LJIIIZ(c8w0, "<this>");
        o.LJIIIZ(builder, "builder");
        C4LX c4lx = new C4LX();
        builder.invoke(c4lx);
        OSZ LIZ = c4lx.LIZ();
        String str = (String) LIZ.getFirst();
        InterfaceC87283bg interfaceC87283bg = (InterfaceC87283bg) LIZ.getSecond();
        C8K7.LIZ("assem_hierarchy_data", new AqS37S1300000_3(c8w0, str, interfaceC87283bg, this, 2), false);
        C7C3 c7c3 = (C7C3) ((ConcurrentHashMap) this.LJLILLLLZI).get(c8w0);
        if (c7c3 != null) {
            c7c3.LIZJ(interfaceC87283bg, str);
        }
    }

    public final void ov0(ActivityC86117Xqz activityC86117Xqz, InterfaceC88472Yns builder) {
        o.LJIIIZ(activityC86117Xqz, "<this>");
        o.LJIIIZ(builder, "builder");
        C4LX c4lx = new C4LX();
        builder.invoke(c4lx);
        OSZ LIZ = c4lx.LIZ();
        String str = (String) LIZ.getFirst();
        InterfaceC87283bg interfaceC87283bg = (InterfaceC87283bg) LIZ.getSecond();
        C8K7.LIZ("assem_hierarchy_data", new AqS37S1300000_3(activityC86117Xqz, str, interfaceC87283bg, this, 3), false);
        C7C3 c7c3 = (C7C3) ((ConcurrentHashMap) this.LJLILLLLZI).get(activityC86117Xqz);
        if (c7c3 != null) {
            c7c3.LIZJ(interfaceC87283bg, str);
        }
    }

    public final void pv0(ReusedAssem reusedAssem, InterfaceC65784Pro interfaceC65784Pro) {
        boolean z;
        InterfaceC65350Pko<? extends C8W0> interfaceC65350Pko;
        AssemSupervisor lv0 = lv0(reusedAssem);
        if (lv0 == null) {
            return;
        }
        String valueOf = String.valueOf(interfaceC65784Pro.hashCode());
        SZE.LIZ(valueOf, C65352Pkq.LIZ(C88501YoL.class));
        C8NL c8nl = (C8NL) interfaceC65784Pro.invoke();
        SZE.LIZIZ(C65352Pkq.LIZ(C88501YoL.class), valueOf, C8VG.LJLIL);
        if (c8nl.LIZIZ == C8VK.LAZY) {
            z = true;
        } else {
            z = false;
        }
        ReusedAssem LIZJ = c8nl.LIZJ();
        if (LIZJ != null) {
            interfaceC65350Pko = C65352Pkq.LIZ(LIZJ.getClass());
        } else {
            interfaceC65350Pko = c8nl.LIZ;
            if (interfaceC65350Pko == null) {
                o.LJIJI("type");
                throw null;
            }
        }
        if (z) {
            lv0.LJLLILLLL.put(interfaceC65350Pko, c8nl);
            reusedAssem.getSupervisor();
            return;
        }
        if (!C63081OpJ.LJLIIL(reusedAssem.getLifecycle())) {
            SZE.LIZ(String.valueOf(hashCode()), C65352Pkq.LIZ(C88495YoF.class));
            ReusedAssem<?> build = c8nl.build();
            SZE.LIZIZ(C65352Pkq.LIZ(C88495YoF.class), String.valueOf(hashCode()), C8VJ.LJLIL);
            if (C214368bA.LJIJJ) {
                C8VV.LJI(new AqS63S0400000_3(reusedAssem, (Object) lv0, (AssemSupervisor) build, (ReusedAssem<?>) c8nl, (C8NL<?>) 2));
            } else {
                lv0.LJI(build, null);
                C8XE c8xe = reusedAssem.LJLJLJ;
                if (c8xe != null) {
                    c8xe.LJIIJ(build, c8xe.LJLJLJ);
                }
            }
        }
        reusedAssem.getSupervisor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void qv0(ReusedUIAssem reusedUIAssem, InterfaceC88472Yns assemBuilder) {
        String str;
        o.LJIIIZ(reusedUIAssem, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            c8v8.LIZIZ("assem_mount5_");
        }
        C68322mC c68322mC = new C68322mC();
        pv0(reusedUIAssem, new AqS150S0200000_3(assemBuilder, (InterfaceC88472Yns<? super C8NK, C76800UCe>) c68322mC, (C68322mC<Class<?>>) 12));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            Class cls = (Class) c68322mC.element;
            if (cls != null) {
                str = C16880lQ.LJLLJ(cls);
            } else {
                str = null;
            }
            c8v82.end(str, "assem_mount5_");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <REUSED extends ReusedUIAssem<? extends C3C8>> void rv0(REUSED reused, InterfaceC88472Yns<? super C8NK, C76800UCe> assemBuilder) {
        String str;
        o.LJIIIZ(reused, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            c8v8.LIZIZ("assem_mount4_");
        }
        C68322mC c68322mC = new C68322mC();
        pv0(reused, new AqS150S0200000_3((InterfaceC88472Yns) assemBuilder, (InterfaceC88472Yns<? super C8NK, C76800UCe>) c68322mC, (C68322mC<Class<?>>) 8));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            Class cls = (Class) c68322mC.element;
            if (cls != null) {
                str = C16880lQ.LJLLJ(cls);
            } else {
                str = null;
            }
            c8v82.end(str, "assem_mount4_");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <REUSED extends ReusedUIAssem<? extends C3C8>> void sv0(REUSED reused, InterfaceC88472Yns<? super C8NH, C76800UCe> assemBuilder) {
        String str;
        o.LJIIIZ(reused, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            c8v8.LIZIZ("assem_mount3_");
        }
        C68322mC c68322mC = new C68322mC();
        pv0(reused, new AqS63S0400000_3((InterfaceC88472Yns) assemBuilder, (InterfaceC88472Yns<? super C8NH, C76800UCe>) this, (Assembler) reused, c68322mC, (C68322mC<Class<?>>) 1));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            Class cls = (Class) c68322mC.element;
            if (cls != null) {
                str = C16880lQ.LJLLJ(cls);
            } else {
                str = null;
            }
            c8v82.end(str, "assem_mount3_");
        }
    }

    public final void tv0(LifecycleOwner lifecycleOwner, C7C3 c7c3) {
        if (lifecycleOwner == null || c7c3 == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJLILLLLZI).put(lifecycleOwner, c7c3);
    }

    public final void uv0(LifecycleOwner lifecycleOwner, C8VA c8va) {
        if (lifecycleOwner == null || c8va == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJLJI).put(lifecycleOwner, c8va);
    }

    public final void vv0(LifecycleOwner lifecycleOwner, AssemSupervisor assemSupervisor) {
        C8K7.LIZ("AssemList", new AqS150S0200000_3(lifecycleOwner, assemSupervisor, 9), false);
        if (lifecycleOwner == null || assemSupervisor == null) {
            return;
        }
        ((ConcurrentHashMap) this.LJLIL).put(lifecycleOwner, assemSupervisor);
        C8K7.LIZ("AssemList", new AqS150S0200000_3(this, lifecycleOwner, 10), false);
    }

    public final AssemSupervisor wv0(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C8V4, C76800UCe> assemBuilder) {
        int i;
        int i2;
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        if ((lifecycleOwner instanceof Activity) || (lifecycleOwner instanceof Fragment) || (lifecycleOwner instanceof UIAssem)) {
            AssemSupervisor lv0 = lv0(lifecycleOwner);
            C8W0 c8w0 = null;
            if (lv0 == null) {
                return null;
            }
            SZE.LIZ(String.valueOf(hashCode()), C65352Pkq.LIZ(C88501YoL.class));
            C8V4 c8v4 = new C8V4();
            assemBuilder.invoke(c8v4);
            UIContentAssem uIContentAssem = c8v4.LJIIIIZZ;
            if (uIContentAssem != null) {
                Iterator<C8W0> it = lv0.LJLLI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8W0 next = it.next();
                    C8W0 c8w02 = next;
                    if ((c8w02 instanceof UIContentAssem) && o.LJ(C65352Pkq.LIZ(c8w02.getClass()), C65352Pkq.LIZ(uIContentAssem.getClass()))) {
                        int id = ((UIAssem) c8w02).getContainerView().getId();
                        View view = c8v4.LJII;
                        if (view != null) {
                            i2 = view.getId();
                        } else {
                            i2 = c8v4.LJI;
                        }
                        if (id == i2 && o.LJ(c8w02.assemTagInternal, c8v4.LIZIZ)) {
                            c8w0 = next;
                            break;
                        }
                    }
                }
            } else {
                Iterator<C8W0> it2 = lv0.LJLLI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C8W0 next2 = it2.next();
                    C8W0 c8w03 = next2;
                    if ((c8w03 instanceof UIContentAssem) && o.LJ(C65352Pkq.LIZ(c8w03.getClass()), c8v4.LIZJ())) {
                        int id2 = ((UIAssem) c8w03).getContainerView().getId();
                        View view2 = c8v4.LJII;
                        if (view2 != null) {
                            i = view2.getId();
                        } else {
                            i = c8v4.LJI;
                        }
                        if (id2 == i && o.LJ(c8w03.assemTagInternal, c8v4.LIZIZ)) {
                            c8w0 = next2;
                            break;
                        }
                    }
                }
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88501YoL.class), String.valueOf(hashCode()), new AqS153S0100000_3(c8v4, 28));
            OSZ osz = new OSZ(c8w0, c8v4);
            C8W0 c8w04 = (C8W0) osz.getFirst();
            C8V1 c8v1 = (C8V1) osz.getSecond();
            c8v1.getClass();
            yv0(lv0, c8w04, c8v1);
            return lv0;
        }
        "You can only assemble UIContentAssem in Activity/Fragment/UIAssem".toString();
        throw new IllegalStateException("You can only assemble UIContentAssem in Activity/Fragment/UIAssem");
    }

    public final AssemSupervisor xv0(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C8V5, C76800UCe> assemBuilder) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(assemBuilder, "assemBuilder");
        if ((lifecycleOwner instanceof Activity) || (lifecycleOwner instanceof Fragment) || (lifecycleOwner instanceof UIAssem)) {
            AssemSupervisor lv0 = lv0(lifecycleOwner);
            C8W0 c8w0 = null;
            if (lv0 == null) {
                return null;
            }
            SZE.LIZ(String.valueOf(hashCode()), C65352Pkq.LIZ(C88501YoL.class));
            C8V5 c8v5 = new C8V5();
            assemBuilder.invoke(c8v5);
            UISlotAssem uISlotAssem = c8v5.LJIIIZ;
            if (uISlotAssem != null) {
                Iterator<C8W0> it = lv0.LJLLI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8W0 next = it.next();
                    C8W0 c8w02 = next;
                    if ((c8w02 instanceof UISlotAssem) && o.LJ(C65352Pkq.LIZ(c8w02.getClass()), C65352Pkq.LIZ(uISlotAssem.getClass())) && ((UISlotAssem) c8w02).LJLIL == c8v5.LJI && o.LJ(c8w02.assemTagInternal, c8v5.LIZIZ)) {
                        c8w0 = next;
                        break;
                    }
                }
            } else {
                Iterator<C8W0> it2 = lv0.LJLLI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C8W0 next2 = it2.next();
                    C8W0 c8w03 = next2;
                    if ((c8w03 instanceof UISlotAssem) && o.LJ(C65352Pkq.LIZ(c8w03.getClass()), c8v5.LIZJ()) && ((UISlotAssem) c8w03).LJLIL == c8v5.LJI && o.LJ(c8w03.assemTagInternal, c8v5.LIZIZ)) {
                        c8w0 = next2;
                        break;
                    }
                }
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88501YoL.class), String.valueOf(hashCode()), new AqS153S0100000_3(c8v5, 29));
            OSZ osz = new OSZ(c8w0, c8v5);
            C8W0 c8w04 = (C8W0) osz.getFirst();
            C8V1 c8v1 = (C8V1) osz.getSecond();
            c8v1.getClass();
            yv0(lv0, c8w04, c8v1);
            return lv0;
        }
        "You can only assemble UISlotAssems in Activity/Fragment/UIAssem".toString();
        throw new IllegalStateException("You can only assemble UISlotAssems in Activity/Fragment/UIAssem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void yv0(AssemSupervisor assemSupervisor, C8W0 c8w0, C8V1 c8v1) {
        if (c8w0 == null) {
            String valueOf = String.valueOf(assemSupervisor.hashCode());
            SZE.LIZ(valueOf, C65352Pkq.LIZ(C88495YoF.class));
            C8W0 build = c8v1.build();
            List<C62582cw> list = c8v1.LIZLLL;
            C8VA LIZLLL = assemSupervisor.LIZLLL();
            if (list == null || list.isEmpty()) {
                if (build instanceof C8V9) {
                    C8V9 c8v9 = (C8V9) build;
                    Class<?> cls = c8v9.getClass();
                    while (cls != Object.class) {
                        Class<?>[] interfaces = cls.getInterfaces();
                        o.LJIIIIZZ(interfaces, "currentClazz.interfaces");
                        ArrayList arrayList = new ArrayList();
                        for (Class<?> cls2 : interfaces) {
                            if (C8V9.class.isAssignableFrom(cls2)) {
                                arrayList.add(cls2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Class<?> it2 = (Class) it.next();
                            o.LJIIIIZZ(it2, "it");
                            LIZLLL.LIZLLL(it2, c8v9);
                        }
                        cls = cls.getSuperclass();
                        if (cls == null) {
                            break;
                        }
                    }
                }
            } else {
                for (C62582cw c62582cw : list) {
                    if (c62582cw.LIZ.isAssignableFrom(build.getClass())) {
                        C8V9 c8v92 = (C8V9) build;
                        LIZLLL.getClass();
                        Class<?> cls3 = c62582cw.LIZ;
                        if ((!o.LJ(cls3, C8V9.class) && !o.LJ(cls3, C8VB.class)) || !C214368bA.LIZ) {
                            if (LIZLLL.LIZIZ.containsKey(c62582cw) && c8v92 != ((LinkedHashMap) LIZLLL.LIZIZ).get(c62582cw)) {
                                if (!C214368bA.LIZ) {
                                    LIZLLL.LIZIZ.remove(c62582cw);
                                    LIZLLL.LIZJ.remove(c62582cw);
                                    C8V7 c8v7 = C214368bA.LIZIZ;
                                    if (c8v7 != null) {
                                        StringBuilder LIZIZ = C770830u.LIZIZ("(service=", cls3, ", serviceKey =");
                                        LIZIZ.append(c8v92.serviceKey());
                                        LIZIZ.append(") has been already registered on service store. the service real instance is ");
                                        LIZIZ.append(c8v92);
                                        LIZIZ.append(", the registered service real instance is ");
                                        LIZIZ.append(((LinkedHashMap) LIZLLL.LIZIZ).get(c62582cw));
                                        LIZIZ.append(", currentMap info is ");
                                        LIZIZ.append(LIZLLL.LIZIZ);
                                        LIZIZ.append("\",");
                                        c8v7.LIZ(new IllegalStateException(), X1D.LIZIZ(LIZIZ));
                                    }
                                } else {
                                    StringBuilder LIZIZ2 = C770830u.LIZIZ("(service=", cls3, ", serviceKey =");
                                    LIZIZ2.append(c8v92.serviceKey());
                                    LIZIZ2.append(") has been already registered on service store. the service real instance is ");
                                    LIZIZ2.append(c8v92);
                                    LIZIZ2.append(", the registered service real instance is ");
                                    LIZIZ2.append(((LinkedHashMap) LIZLLL.LIZIZ).get(c62582cw));
                                    throw new IllegalStateException(X1D.LIZIZ(LIZIZ2));
                                }
                            }
                            LIZLLL.LIZIZ.put(c62582cw, c8v92);
                            if (c8v92 instanceof C8VB) {
                                InterfaceC198557ql defaultObservableData = ((C8VB) c8v92).defaultObservableData();
                                LiveData liveData = (LiveData) ((LinkedHashMap) LIZLLL.LIZJ).get(c62582cw);
                                if (liveData == null) {
                                    liveData = new MutableLiveData();
                                    LIZLLL.LIZJ.put(c62582cw, liveData);
                                }
                                if (liveData.getValue() == null) {
                                    if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                                        liveData.setValue(defaultObservableData);
                                    } else {
                                        liveData.postValue(defaultObservableData);
                                    }
                                }
                            }
                        } else {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append('{');
                            LIZ.append(cls3);
                            LIZ.append(" - ");
                            LIZ.append(c8v92);
                            LIZ.append("}: AssemService or AssemObservableService can't be registered directly, use subclass instead");
                            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                        }
                    } else {
                        "The serviceClazz must be super interface of this Assem".toString();
                        throw new IllegalStateException("The serviceClazz must be super interface of this Assem");
                    }
                }
            }
            SZE.LIZIZ(C65352Pkq.LIZ(C88495YoF.class), valueOf, C8VI.LJLIL);
            assemSupervisor.LJI(build, null);
            assemSupervisor.LIZ(null);
            return;
        }
        C8V1<? extends C8W0> config = c8w0.getConfig();
        c8w0.setConfig(c8v1);
        c8w0.didUpdateConfig(config);
    }
}
