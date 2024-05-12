package com.bytedance.hox;

import X.AbstractC53892LDc;
import X.AbstractC53895LDf;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188767ay;
import X.C188787b0;
import X.C37692Eqm;
import X.C53906LDq;
import X.C65777Prh;
import X.InterfaceC53894LDe;
import X.InterfaceC53896LDg;
import X.InterfaceC53905LDp;
import X.InterfaceC53907LDr;
import X.X1D;
import Y.ARunnableS22S0200000_3;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class Hox extends ViewModel {
    public static final C188787b0 LJLLI = new C188787b0();
    public ActivityC45651qj LJLIL;
    public AbstractC53892LDc LJLILLLLZI;
    public boolean LJLJJLL;
    public final Hox$activityLifeObserver$1 LJLJLLL;
    public final C53906LDq LJLL;
    public final HashMap<String, AbstractC53895LDf> LJLJI = new HashMap<>();
    public final HashMap<Class<?>, HashMap<String, AbstractC53895LDf>> LJLJJI = new HashMap<>();
    public final HashMap<String, AbstractC53895LDf> LJLJJL = new HashMap<>();
    public final CopyOnWriteArrayList<InterfaceC53894LDe> LJLJL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC53894LDe> LJLJLJ = new CopyOnWriteArrayList<>();

    public static final synchronized Hox kv0(ActivityC45651qj activityC45651qj) {
        Hox LIZ;
        synchronized (Hox.class) {
            LIZ = LJLLI.LIZ(activityC45651qj);
        }
        return LIZ;
    }

    public final AbstractC53895LDf mv0() {
        AbstractC53892LDc abstractC53892LDc = this.LJLILLLLZI;
        if (abstractC53892LDc == null) {
            return null;
        }
        return nv0(abstractC53892LDc);
    }

    public final String lv0() {
        String LJIIL;
        AbstractC53895LDf mv0 = mv0();
        if (mv0 == null || (LJIIL = mv0.LJIIL()) == null) {
            return "";
        }
        return LJIIL;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            Lifecycle lifecycle = activityC45651qj.getLifecycle();
            if (lifecycle != null) {
                lifecycle.removeObserver(this.LJLJLLL);
            }
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                supportFragmentManager.LJLJJLL(this.LJLL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.lifecycle.LifecycleObserver, com.bytedance.hox.Hox$activityLifeObserver$1] */
    public Hox(ActivityC45651qj activityC45651qj) {
        ?? r3 = new LifecycleEventObserver() { // from class: com.bytedance.hox.Hox$activityLifeObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIJ(source, "source");
                o.LJIIJ(event, "event");
                int i = C188767ay.LIZ[event.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    Hox.this.LJLJJLL = false;
                    return;
                }
                Hox.this.LJLJJLL = true;
            }
        };
        this.LJLJLLL = r3;
        C53906LDq c53906LDq = new C53906LDq(this);
        this.LJLL = c53906LDq;
        if (activityC45651qj != null) {
            this.LJLIL = activityC45651qj;
            if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                activityC45651qj.getLifecycle().addObserver(r3);
            } else {
                activityC45651qj.runOnUiThread(new ARunnableS22S0200000_3(this, activityC45651qj, 7));
            }
            ActivityC45651qj activityC45651qj2 = this.LJLIL;
            if (activityC45651qj2 != null) {
                activityC45651qj2.getSupportFragmentManager().LJJLIL(c53906LDq, true);
                return;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static AbstractC53895LDf nv0(AbstractC53892LDc abstractC53892LDc) {
        AbstractC53895LDf abstractC53895LDf = abstractC53892LDc.LJLJJLL;
        if (abstractC53895LDf instanceof AbstractC53892LDc) {
            if (abstractC53895LDf != null) {
                return nv0((AbstractC53892LDc) abstractC53895LDf);
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.hox.HoxGroup");
        }
        return abstractC53895LDf;
    }

    public static String xv0(List list) {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC53895LDf abstractC53895LDf = (AbstractC53895LDf) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(abstractC53895LDf.tag());
            LIZ.append('@');
            LIZ.append(abstractC53895LDf.toString());
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        if (!ujb.o.LJJJJJL(sb)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("]");
        String sb2 = sb.toString();
        o.LJFF(sb2, "result.toString()");
        return sb2;
    }

    public static String yv0(AbstractC53895LDf abstractC53895LDf) {
        if (abstractC53895LDf != null) {
            StringBuilder sb = new StringBuilder("[");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(abstractC53895LDf.tag());
            LIZ.append('@');
            LIZ.append(abstractC53895LDf.toString());
            sb.append(X1D.LIZIZ(LIZ));
            if (abstractC53895LDf instanceof AbstractC53892LDc) {
                Iterator it = ((ArrayList) ((AbstractC53892LDc) abstractC53895LDf).LJLJLJ).iterator();
                while (it.hasNext()) {
                    sb.append(yv0((AbstractC53895LDf) it.next()));
                    sb.append(",");
                }
                if (!ujb.o.LJJJJJL(sb)) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            o.LJFF(sb2, "message.toString()");
            return sb2;
        }
        return "";
    }

    public final void Av0(String str) {
        AbstractC53895LDf rv0 = rv0("page_profile");
        if (!(rv0 instanceof AbstractC53892LDc)) {
            rv0 = null;
        }
        AbstractC53892LDc abstractC53892LDc = (AbstractC53892LDc) rv0;
        if (abstractC53892LDc != null) {
            abstractC53892LDc.LJLJJLL = rv0(str);
        }
    }

    public final void Dv0(AbstractC53892LDc abstractC53892LDc) {
        for (AbstractC53895LDf abstractC53895LDf : abstractC53892LDc.LJLJLJ) {
            this.LJLJI.put(abstractC53895LDf.tag(), abstractC53895LDf);
            Class<? extends Fragment> LJIIJ = abstractC53895LDf.LJIIJ();
            if (LJIIJ != null) {
                if (this.LJLJJI.containsKey(LJIIJ)) {
                    HashMap<String, AbstractC53895LDf> hashMap = this.LJLJJI.get(LJIIJ);
                    if (hashMap != null) {
                        hashMap.put(abstractC53895LDf.tag(), abstractC53895LDf);
                    }
                } else {
                    HashMap<String, AbstractC53895LDf> hashMap2 = new HashMap<>();
                    hashMap2.put(abstractC53895LDf.tag(), abstractC53895LDf);
                    this.LJLJJI.put(LJIIJ, hashMap2);
                }
            }
            if (abstractC53895LDf instanceof AbstractC53892LDc) {
                Dv0((AbstractC53892LDc) abstractC53895LDf);
            }
        }
    }

    public final <T extends Fragment> T Ja(String tag) {
        o.LJIIJ(tag, "tag");
        AbstractC53895LDf rv0 = rv0(tag);
        if (rv0 instanceof HoxFragmentNode) {
            T t = (T) ((HoxFragmentNode) rv0).LJLJJL;
            if (!(t instanceof Fragment)) {
                return null;
            }
            return t;
        }
        if (!(rv0 instanceof HoxFragmentGroup)) {
            return null;
        }
        T t2 = (T) ((HoxFragmentGroup) rv0).LJLL;
        if (!(t2 instanceof Fragment)) {
            return null;
        }
        return t2;
    }

    public final void gv0(InterfaceC53894LDe observer) {
        o.LJIIJ(observer, "observer");
        this.LJLJL.addIfAbsent(observer);
    }

    public final String ov0(String str) {
        AbstractC53895LDf abstractC53895LDf;
        String tag;
        AbstractC53895LDf rv0 = rv0(str);
        if ((rv0 instanceof AbstractC53892LDc) && (abstractC53895LDf = ((AbstractC53892LDc) rv0).LJLJJLL) != null && (tag = abstractC53895LDf.tag()) != null) {
            return tag;
        }
        return "";
    }

    public final Class<?> pv0(String tag) {
        o.LJIIJ(tag, "tag");
        AbstractC53895LDf rv0 = rv0(tag);
        if (rv0 != null) {
            return rv0.LJIIJ();
        }
        return null;
    }

    public final int qv0(String tag) {
        AbstractC53892LDc abstractC53892LDc;
        o.LJIIJ(tag, "tag");
        AbstractC53895LDf rv0 = rv0(tag);
        if (rv0 == null || (abstractC53892LDc = rv0.LJLIL) == null) {
            return -1;
        }
        return ((ArrayList) abstractC53892LDc.LJLJLJ).indexOf(rv0);
    }

    public final synchronized AbstractC53895LDf rv0(String tag) {
        o.LJIIJ(tag, "tag");
        if (this.LJLJI.containsKey(tag)) {
            return this.LJLJI.get(tag);
        }
        AbstractC53892LDc abstractC53892LDc = this.LJLILLLLZI;
        if (abstractC53892LDc == null) {
            return null;
        }
        this.LJLJI.put(abstractC53892LDc.tag(), this.LJLILLLLZI);
        AbstractC53892LDc abstractC53892LDc2 = this.LJLILLLLZI;
        if (abstractC53892LDc2 != null) {
            Dv0(abstractC53892LDc2);
            return this.LJLJI.get(tag);
        }
        o.LJIIZILJ();
        throw null;
    }

    public final String sv0(String str) {
        AbstractC53895LDf rv0;
        AbstractC53892LDc abstractC53892LDc;
        String tag;
        if (str == null || (rv0 = rv0(str)) == null || (abstractC53892LDc = rv0.LJLIL) == null || (tag = abstractC53892LDc.tag()) == null) {
            return "";
        }
        return tag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String tv0(Fragment fragment) {
        o.LJIIJ(fragment, "fragment");
        AbstractC53892LDc abstractC53892LDc = this.LJLILLLLZI;
        if (abstractC53892LDc != null) {
            rv0(abstractC53892LDc.tag());
            Class<?> cls = fragment.getClass();
            Collection<AbstractC53895LDf> values = this.LJLJI.values();
            o.LJFF(values, "tagNodeMap.values");
            for (AbstractC53895LDf abstractC53895LDf : values) {
                if (abstractC53895LDf != null) {
                    if (o.LJ(abstractC53895LDf.LJIIJ(), cls) && (!(fragment instanceof InterfaceC53907LDr) || ((InterfaceC53907LDr) fragment).L6().length() == 0)) {
                        return abstractC53895LDf.tag();
                    }
                    if ((fragment instanceof InterfaceC53907LDr) && o.LJ(((InterfaceC53907LDr) fragment).L6(), abstractC53895LDf.tag())) {
                        return abstractC53895LDf.tag();
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean uv0(Fragment fragment) {
        o.LJIIJ(fragment, "fragment");
        AbstractC53895LDf mv0 = mv0();
        if (mv0 != null) {
            Iterator<AbstractC53895LDf> it = mv0.LJIIJJI().iterator();
            while (it.hasNext()) {
                AbstractC53895LDf next = it.next();
                if (fragment instanceof InterfaceC53907LDr) {
                    InterfaceC53907LDr interfaceC53907LDr = (InterfaceC53907LDr) fragment;
                    if (interfaceC53907LDr.L6().length() > 0 && o.LJ(interfaceC53907LDr.L6(), next.tag())) {
                        return true;
                    }
                    if (((InterfaceC53907LDr) fragment).L6().length() != 0) {
                        continue;
                    }
                }
                Class<? extends Fragment> LJIIJ = next.LJIIJ();
                if (LJIIJ != null && LJIIJ.isInstance(fragment)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean vv0(String tag) {
        o.LJIIJ(tag, "tag");
        AbstractC53895LDf mv0 = mv0();
        if (mv0 != null) {
            Iterator<AbstractC53895LDf> it = mv0.LJIIJJI().iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().tag(), tag)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean wv0(String tag) {
        o.LJIIJ(tag, "tag");
        if (this.LJLJJLL && vv0(tag)) {
            return true;
        }
        return false;
    }

    public final void Bv0(int i, Bundle bundle) {
        String str;
        AbstractC53895LDf rv0 = rv0("HOME");
        if ((rv0 instanceof AbstractC53892LDc) && i >= 0) {
            AbstractC53892LDc abstractC53892LDc = (AbstractC53892LDc) rv0;
            if (i < ((ArrayList) abstractC53892LDc.LJLJLJ).size()) {
                str = ((AbstractC53895LDf) ListProtector.get(abstractC53892LDc.LJLJLJ, i)).tag();
                Cv0(bundle, str);
            }
        }
        str = "";
        Cv0(bundle, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cd, code lost:
    
        if ((!kotlin.jvm.internal.o.LJ(r4.tag(), r5)) != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cv0(android.os.Bundle r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hox.Hox.Cv0(android.os.Bundle, java.lang.String):void");
    }

    public final void hv0(String tag, InterfaceC53907LDr observer) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(observer, "observer");
        AbstractC53895LDf rv0 = rv0(tag);
        if (rv0 != null) {
            rv0.LJIIIIZZ(observer);
            AbstractC53892LDc abstractC53892LDc = rv0.LJLIL;
            if (abstractC53892LDc == null || !abstractC53892LDc.LJLJL || !o.LJ(abstractC53892LDc.LJLJJLL, rv0) || !(observer instanceof InterfaceC53896LDg) || observer == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (!bundle.containsKey(abstractC53892LDc.tag())) {
                bundle.putBoolean(abstractC53892LDc.tag(), true);
            }
            ((InterfaceC53896LDg) observer).LLLLLLZ(bundle);
        }
    }

    public final void jv0(Bundle bundle, String to) {
        AbstractC53892LDc abstractC53892LDc;
        o.LJIIJ(to, "to");
        AbstractC53895LDf rv0 = rv0(to);
        if (rv0 != null && (abstractC53892LDc = rv0.LJLIL) != null) {
            if (!bundle.containsKey(abstractC53892LDc.tag())) {
                bundle.putBoolean(abstractC53892LDc.tag(), true);
            }
            abstractC53892LDc.LJIJ(to, bundle, this.LJLJL, this.LJLJLJ);
        }
    }

    public final void zv0(String tag, InterfaceC53907LDr observer) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(observer, "observer");
        AbstractC53895LDf rv0 = rv0(tag);
        if (rv0 != null) {
            CopyOnWriteArrayList<InterfaceC53896LDg> copyOnWriteArrayList = rv0.LJLILLLLZI;
            if (copyOnWriteArrayList != null) {
                C65777Prh.LIZ(copyOnWriteArrayList).remove(observer);
                CopyOnWriteArrayList<Object> copyOnWriteArrayList2 = rv0.LJLJI;
                if (copyOnWriteArrayList2 != null) {
                    C65777Prh.LIZ(copyOnWriteArrayList2).remove(observer);
                    CopyOnWriteArrayList<InterfaceC53905LDp> copyOnWriteArrayList3 = rv0.LJLJJI;
                    if (copyOnWriteArrayList3 != null) {
                        C65777Prh.LIZ(copyOnWriteArrayList3).remove(observer);
                        return;
                    }
                    throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
    }

    public final void iv0(int i, String str, Bundle bundle) {
        AbstractC53895LDf rv0 = rv0(str);
        if (rv0 != null && (rv0 instanceof AbstractC53892LDc)) {
            if (!bundle.containsKey(rv0.tag())) {
                bundle.putBoolean(rv0.tag(), true);
            }
            AbstractC53892LDc abstractC53892LDc = (AbstractC53892LDc) rv0;
            abstractC53892LDc.LJIJ(((AbstractC53895LDf) ListProtector.get(abstractC53892LDc.LJLJLJ, i)).tag(), bundle, this.LJLJL, this.LJLJLJ);
        }
    }
}
