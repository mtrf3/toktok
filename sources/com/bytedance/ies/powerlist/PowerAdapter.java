package com.bytedance.ies.powerlist;

import X.AbstractC72278SYg;
import X.AbstractC72298SZa;
import X.ActivityC45651qj;
import X.C0A2;
import X.C0A6;
import X.C0AK;
import X.C0AX;
import X.C16880lQ;
import X.C221108m2;
import X.C29127Bbv;
import X.C36922EeM;
import X.C47261Igj;
import X.C48841JEv;
import X.C48967JJr;
import X.C48969JJt;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65777Prh;
import X.C71855SHz;
import X.C72302SZe;
import X.C72305SZh;
import X.C72808Sho;
import X.C73411SrX;
import X.C73849Syb;
import X.C78688UuS;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79234V7u;
import X.C79O;
import X.C88512YoW;
import X.C88513YoX;
import X.C8RL;
import X.C8YF;
import X.InterfaceC117044ia;
import X.InterfaceC57784Mm4;
import X.MZ7;
import X.ORY;
import X.ORZ;
import X.SI4;
import X.SIT;
import X.SIU;
import X.SYM;
import X.SYR;
import X.SYS;
import X.SYT;
import X.SYU;
import X.SYV;
import X.SYW;
import X.SYZ;
import X.SZ0;
import X.SZJ;
import X.SZP;
import X.SZZ;
import X.V0Q;
import X.X1D;
import Y.ARunnableS3S0102000_12;
import Y.ARunnableS43S0100000_7;
import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.ies.powerlist.page.PowerPageLoader;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.agilelogger.ALog;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS4S1000100_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class PowerAdapter extends SYM implements GenericLifecycleObserver, C0AK, LifecycleOwner {
    public static final List<Object> LLIIII = new ArrayList();
    public final RecyclerView LJLIL;
    public PowerStub LJLILLLLZI;
    public final List<PowerStub> LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, Class<? extends PowerCell<?>>> LJLJJL;
    public final Map<Type, Integer> LJLJJLL;
    public final Map<PowerStub, Integer> LJLJL;
    public PowerPageLoader<?> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final SYT LJLL;
    public final C62822Ol8 LJLLI;
    public Fragment LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C73849Syb<C57939MoZ> LJLZ;
    public final SZJ LJZ;
    public int LJZI;
    public C57939MoZ LJZL;
    public SYU LL;
    public Class<? extends PowerLoadingCell> LLD;
    public final Map<C71855SHz, PowerStub> LLF;
    public final List<InterfaceC57784Mm4> LLFF;
    public final List<Integer> LLFFF;
    public final Field LLFII;
    public LifecycleOwner LLFZ;
    public boolean LLI;
    public final LifecycleRegistry LLIFFJFJJ;
    public final C62822Ol8 LLII;

    @Override // X.SYM
    public final void LJLLLLLL() {
        this.LLI = true;
        LLIIIILZ().getLifecycle().addObserver(this);
        Iterator it = ((ArrayList) LLIIJI()).iterator();
        while (it.hasNext()) {
            PowerStub powerStub = (PowerStub) it.next();
            LifecycleOwner LLIIIILZ = LLIIIILZ();
            ((MZ7) powerStub.LJLLI.getValue()).LIZ.observe(LLIIIILZ, powerStub);
            LLIIIILZ.getLifecycle().addObserver(powerStub);
            powerStub.LJLZ = LLIIIILZ;
        }
        if (C16880lQ.LLJJIJIL(getLifecycle().getCurrentState(), Lifecycle.State.CREATED) < 0) {
            this.LLIFFJFJJ.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    @Override // X.SYM
    public final void LJLZ() {
        Lifecycle lifecycle;
        this.LLI = false;
        LLIIIILZ().getLifecycle().removeObserver(this);
        Iterator it = ((ArrayList) LLIIJI()).iterator();
        while (it.hasNext()) {
            PowerStub powerStub = (PowerStub) it.next();
            ((MZ7) powerStub.LJLLI.getValue()).LIZ.removeObserver(powerStub);
            LifecycleOwner lifecycleOwner = powerStub.LJLZ;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(powerStub);
            }
            powerStub.LJLZ = null;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onLifecycleOwnerDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onLifecycleOwnerDestroy() {
        this.LLIFFJFJJ.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.SYM
    public final C72808Sho<InterfaceC57784Mm4> LJZ() {
        if (this.LJLJJI) {
            return (C72808Sho) LLIIIJ().LJLLI.getValue();
        }
        return null;
    }

    public final int LLFII() {
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((LinearLayoutManager) layoutManager).LLILL();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).LLILL();
        }
        return -1;
    }

    public final int LLFZ() {
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((LinearLayoutManager) layoutManager).LLILLJJLI();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).LLILLJJLI();
        }
        return -1;
    }

    public final ActivityC45651qj LLIFFJFJJ() {
        return (ActivityC45651qj) this.LJLLJ.getValue();
    }

    public final List<InterfaceC57784Mm4> LLII() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<PowerStub> it = LLIIJI().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LJZ);
        }
        if (this.LLD != null) {
            AbstractC72298SZa abstractC72298SZa = this.LJLL.LJLJI.LJLILLLLZI;
            if (abstractC72298SZa.LIZIZ == SZP.Refresh) {
                z = abstractC72298SZa instanceof C72302SZe;
            } else {
                z = !(abstractC72298SZa instanceof C72305SZh);
            }
            if (z) {
                arrayList.add(this.LJLL);
            }
        }
        return arrayList;
    }

    public final Fragment LLIIII() {
        Fragment fragment = this.LJLLILLLL;
        if (fragment == null) {
            ActivityC45651qj LLIFFJFJJ = LLIFFJFJJ();
            if (LLIFFJFJJ != null) {
                fragment = C78688UuS.LJJIJ(LLIFFJFJJ, this.LJLIL);
            } else {
                fragment = null;
            }
            this.LJLLILLLL = fragment;
        }
        return fragment;
    }

    public final LifecycleOwner LLIIIILZ() {
        LifecycleOwner lifecycleOwner = this.LLFZ;
        if (lifecycleOwner == null) {
            Fragment LLIIII2 = LLIIII();
            if (LLIIII2 != null) {
                return LLIIII2;
            }
            ActivityC45651qj LLIFFJFJJ = LLIFFJFJJ();
            if (LLIFFJFJJ != null) {
                return LLIFFJFJJ;
            }
            if (this.LJLIL.isInEditMode()) {
                return SYV.LJLIL;
            }
            throw new RuntimeException("Can not find lifecycleOwner !");
        }
        return lifecycleOwner;
    }

    public final PowerStub LLIIIJ() {
        PowerStub powerStub = this.LJLILLLLZI;
        if (powerStub != null) {
            return powerStub;
        }
        o.LJIJI("mainStub");
        throw null;
    }

    public final SZ0 LLIIJLIL() {
        return (SZ0) this.LJLLLLLL.getValue();
    }

    public final List<Integer> LLIIL() {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((ArrayList) ORZ.LLIIIZ(this.LJLJI, C47261Igj.LJJIJ(LLIIIJ()))).iterator();
        while (it.hasNext()) {
            PowerStub powerStub = (PowerStub) it.next();
            Iterator it2 = ((HashMap) powerStub.LJLL).entrySet().iterator();
            while (it2.hasNext()) {
                int intValue = ((Number) ((Map.Entry) it2.next()).getValue()).intValue();
                Integer num = (Integer) ((HashMap) this.LJLJL).get(powerStub);
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                linkedHashSet.add(Integer.valueOf(intValue + i));
            }
        }
        return ORZ.LLJI(linkedHashSet);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        C57939MoZ c57939MoZ = this.LJZL;
        if (c57939MoZ != null && c57939MoZ.LIZLLL) {
            return this.LJZ.LJI.size();
        }
        return ((ArrayList) LLII()).size();
    }

    public final List<PowerStub> LLIIJI() {
        return ORZ.LLIIIZ(this.LJLJI, C47261Igj.LJJIJ(LLIIIJ()));
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIFFJFJJ;
    }

    public PowerAdapter(RecyclerView powerList) {
        o.LJIIIZ(powerList, "powerList");
        this.LJLIL = powerList;
        this.LJLJI = new ArrayList();
        this.LJLJJI = true;
        this.LJLJJL = new HashMap();
        this.LJLJJLL = new HashMap();
        this.LJLJL = new HashMap();
        this.LJLJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 24));
        this.LJLL = new SYT(null);
        this.LJLLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 25));
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 23));
        this.LJLLL = C221108m2.LIZIZ(C48967JJr.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C48969JJt.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 69));
        C73849Syb<C57939MoZ> LJJZZI = C73849Syb.LJJZZI(new C57939MoZ());
        this.LJLZ = LJJZZI;
        this.LJZ = new SZJ(powerList, this, LLIIJLIL(), LJJZZI, new AqS162S0100000_12(this, 67));
        this.LJZI = 30000;
        this.LL = SYU.Default;
        this.LLF = new LinkedHashMap();
        this.LLFF = new ArrayList();
        this.LLFFF = new ArrayList();
        this.LLIFFJFJJ = new LifecycleRegistry(this);
        this.LLII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 68));
        try {
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            if (declaredField != null) {
                this.LLFII = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException e) {
            C16880lQ.LLLLIIL(e);
        }
        ((CopyOnWriteArrayList) this.LJLLLL.getValue()).add(this.LJLL);
        LLD(new SYW());
        SYR syr = (SYR) this.LLII.getValue();
        SZ0 tracker = LLIIJLIL();
        syr.getClass();
        o.LJIIIZ(tracker, "tracker");
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(syr, 771);
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            aqS157S0100000_7.invoke();
        } else {
            ((Handler) syr.LJII.getValue()).post(new ARunnableS43S0100000_7((Object) aqS157S0100000_7, 154));
        }
        syr.LIZ.getContext();
        syr.LJI = (C73411SrX) syr.LIZIZ.LJJJJZI(new AfS61S0200000_12(syr, tracker, 20));
    }

    @Override // X.SYM
    public final void LJZL(Class<? extends PowerCell<?>>... classes) {
        o.LJIIIZ(classes, "classes");
        LLIIIJ().LJ(ORY.LJJZZIII(classes));
    }

    public final void LLD(SIT chunk) {
        o.LJIIIZ(chunk, "chunk");
        this.LJLJJI = chunk instanceof SYW;
        chunk.LJLJI = this.LJLIL.getContext();
        AqS174S0200000_12 aqS174S0200000_12 = new AqS174S0200000_12(this, chunk, 4);
        SI4 onRemoved = SI4.LJLIL;
        IDqS436S0100000_12 iDqS436S0100000_12 = new IDqS436S0100000_12(this, 2);
        o.LJIIIZ(onRemoved, "onRemoved");
        PowerStub powerStub = new PowerStub(this, chunk, aqS174S0200000_12, onRemoved, iDqS436S0100000_12);
        int i = 0;
        if (this.LJLJJI) {
            this.LJLILLLLZI = powerStub;
        } else {
            ArrayList arrayList = (ArrayList) LLIIJI();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (o.LJ(((PowerStub) it.next()).LJLILLLLZI.getClass(), chunk.getClass())) {
                        String concat = "Registered duplicate PowerChunk class : ".concat(chunk.getClass().getName());
                        concat.toString();
                        throw new IllegalStateException(concat);
                    }
                }
            }
            ((ArrayList) this.LJLJI).add(powerStub);
        }
        powerStub.LJLJJLL = LLIIIJ();
        chunk.LJLIL = powerStub;
        Integer num = (Integer) ORZ.LLFZ(((HashMap) this.LJLJL).values());
        if (num != null) {
            i = num.intValue();
        }
        ((HashMap) this.LJLJL).put(powerStub, Integer.valueOf(i + 100));
        if (this.LLI) {
            LifecycleOwner LLIIIILZ = LLIIIILZ();
            ((MZ7) powerStub.LJLLI.getValue()).LIZ.observe(LLIIIILZ, powerStub);
            LLIIIILZ.getLifecycle().addObserver(powerStub);
            powerStub.LJLZ = LLIIIILZ;
        }
        PowerPageLoader<?> powerPageLoader = this.LJLJLJ;
        if (powerPageLoader != null) {
            powerPageLoader.onDestroy();
        }
        this.LJLJLJ = null;
        AbstractC72278SYg<?> LJII = chunk.LJII();
        if (LJII != null) {
            LJZI(LJII, chunk, chunk.LJLJJL);
        }
    }

    public final void LLFFF(int i) {
        PowerStub powerStub;
        if (this.LJLJLJ != null && (powerStub = (PowerStub) ORZ.LLFII(LLIIJI())) != null) {
            int size = powerStub.LJLLL.size();
            int size2 = powerStub.LJLLLL.size();
            PowerPageLoader<?> powerPageLoader = this.LJLJLJ;
            if (powerPageLoader != null) {
                ((Handler) powerPageLoader.LJLL.getValue()).post(new ARunnableS3S0102000_12(i - size, powerPageLoader, (getItemCount() - size) - size2, 0));
            }
        }
    }

    public final PowerStub LLIIIZ(int i) {
        for (Map.Entry entry : ((LinkedHashMap) this.LLF).entrySet()) {
            if (((C71855SHz) entry.getKey()).LIZ <= i && i < ((C71855SHz) entry.getKey()).LIZIZ) {
                return (PowerStub) entry.getValue();
            }
        }
        return null;
    }

    public final synchronized void LLIILZL(C79O c79o) {
        Iterator it = ((ArrayList) LLIIJI()).iterator();
        while (it.hasNext()) {
            ((PowerStub) it.next()).LJIIIIZZ();
        }
        List<InterfaceC57784Mm4> LLII = LLII();
        c79o.LIZ(LLII);
        ((ArrayList) this.LLFF).clear();
        ((ArrayList) this.LLFF).addAll(LLII);
        ((ArrayList) this.LLFFF).clear();
        int size = ((ArrayList) this.LLFF).size();
        for (int i = 0; i < size; i++) {
            if (ListProtector.get(this.LLFF, i) != null) {
                ((ArrayList) this.LLFFF).add(Integer.valueOf(ListProtector.get(this.LLFF, i).hashCode()));
            } else {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("powerList_lastExtendItems", "add random hashcode");
                ((ArrayList) this.LLFFF).add(Integer.valueOf(V0Q.Default.nextInt(0, Integer.MAX_VALUE)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        List LLII;
        Integer LLIIIL;
        C57939MoZ c57939MoZ = this.LJZL;
        if (c57939MoZ != null && c57939MoZ.LIZLLL) {
            LLII = this.LJZ.LJI;
        } else {
            LLII = LLII();
        }
        InterfaceC57784Mm4 interfaceC57784Mm4 = (InterfaceC57784Mm4) ListProtector.get(LLII, i);
        Class<?> cls = interfaceC57784Mm4.getClass();
        PowerStub LLIIIZ = LLIIIZ(i);
        if (LLIIIZ == null || (LLIIIL = LLIIIL(LLIIIZ, cls, interfaceC57784Mm4)) == null || LLIIIL.intValue() == -1) {
            Integer LLIIIL2 = LLIIIL(LLIIIJ(), cls, interfaceC57784Mm4);
            if (LLIIIL2 == null || LLIIIL2.intValue() == -1 || LLIIIL2 == null) {
                Integer num = (Integer) ((HashMap) this.LJLJJLL).get(cls);
                if (num != null) {
                    return num.intValue();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("not registerCells for: ");
                LIZ.append(interfaceC57784Mm4.getClass());
                throw new RuntimeException(X1D.LIZIZ(LIZ));
            }
            return LLIIIL2.intValue();
        }
        return LLIIIL.intValue();
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(PowerCell<? extends InterfaceC57784Mm4> powerCell) {
        PowerCell<? extends InterfaceC57784Mm4> holder = powerCell;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedToWindow();
        this.LJLIL.LJIIJJI((C0A6) this.LJLJLLL.getValue());
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(PowerCell<? extends InterfaceC57784Mm4> powerCell) {
        PowerCell<? extends InterfaceC57784Mm4> holder = powerCell;
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
        this.LJLIL.LJJLL((C0A6) this.LJLJLLL.getValue());
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(PowerCell<? extends InterfaceC57784Mm4> powerCell) {
        PowerCell<? extends InterfaceC57784Mm4> holder = powerCell;
        o.LJIIIZ(holder, "holder");
        super.onViewRecycled(holder);
        holder.unBind();
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        try {
            notifyItemRangeRemoved(i, i2);
        } catch (Exception e) {
            Iterator it = ((ArrayList) ORZ.LLIIIZ(this.LJLJI, C47261Igj.LJJIJ(LLIIIJ()))).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((HashMap) ((PowerStub) it.next()).LJLJLLL).entrySet().iterator();
                while (it2.hasNext()) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("powerList_stub_itemCell", String.valueOf(((Map.Entry) it2.next()).getValue()));
                }
            }
            throw e;
        }
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        try {
            notifyItemRangeInserted(i, i2);
        } catch (Exception e) {
            Iterator it = ((ArrayList) ORZ.LLIIIZ(this.LJLJI, C47261Igj.LJJIJ(LLIIIJ()))).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((HashMap) ((PowerStub) it.next()).LJLJLLL).entrySet().iterator();
                while (it2.hasNext()) {
                    ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("powerList_stub_itemCell", String.valueOf(((Map.Entry) it2.next()).getValue()));
                }
            }
            throw e;
        }
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    @Override // X.SYM
    public final void LL(C57939MoZ builder, SYU configFrom) {
        o.LJIIIZ(builder, "builder");
        o.LJIIIZ(configFrom, "configFrom");
        if (configFrom.ordinal() >= this.LL.ordinal()) {
            this.LL = configFrom;
            this.LJZL = builder;
            if (builder.LIZJ != null) {
                int i = this.LJZI;
                this.LJZI = i + 1;
                this.LJLJJLL.put(SYT.class, Integer.valueOf(i));
                Map<Integer, Class<? extends PowerCell<?>>> map = this.LJLJJL;
                Integer valueOf = Integer.valueOf(i);
                Class<? extends PowerLoadingCell> cls = builder.LIZJ;
                o.LJII(cls, "null cannot be cast to non-null type java.lang.Class<com.bytedance.ies.powerlist.PowerCell<*>>");
                map.put(valueOf, cls);
            } else {
                C65777Prh.LIZJ(this.LJLJJL).remove(this.LJLJJLL.remove(SYT.class));
            }
            this.LLD = builder.LIZJ;
            this.LJLZ.onNext(builder);
        }
    }

    public final <T extends InterfaceC117044ia> void LLF(T control, Class<T> cls) {
        o.LJIIIZ(control, "control");
        LLIIIJ().LIZ(control, cls);
    }

    public View LLFF(PowerCell<? extends InterfaceC57784Mm4> powerCell, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return powerCell.onCreateItemView(parent);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(PowerCell<? extends InterfaceC57784Mm4> powerCell, int i) {
        PowerCell<? extends InterfaceC57784Mm4> holder = powerCell;
        o.LJIIIZ(holder, "holder");
        onBindViewHolder(holder, i, LLIIII);
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final PowerCell<? extends InterfaceC57784Mm4> com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        SZ0 LLIIJLIL = LLIIJLIL();
        LLIIJLIL.getClass();
        LLIIJLIL.LIZ(C65352Pkq.LIZ(C88513YoX.class));
        Object obj = ((HashMap) this.LJLJJL).get(Integer.valueOf(i));
        if (obj == null) {
            Iterator it = ((ArrayList) ORZ.LLIIIZ(this.LJLJI, C47261Igj.LJJIJ(LLIIIJ()))).iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PowerStub powerStub = (PowerStub) it.next();
                Integer num = (Integer) ((HashMap) this.LJLJL).get(powerStub);
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                for (Map.Entry entry : ((HashMap) powerStub.LJLJLLL).entrySet()) {
                    if (((Number) entry.getKey()).intValue() + i2 == i) {
                        obj = entry.getValue();
                        break loop0;
                    }
                }
            }
        }
        Class cls = (Class) obj;
        if (cls != null) {
            PowerCell<? extends InterfaceC57784Mm4> powerCell = (PowerCell) cls.newInstance();
            powerCell.setAttachView$powerlist_release(this.LJLIL);
            powerCell.setParent(LLIIIILZ());
            powerCell.setAdapter$powerlist_release(this);
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            View LLFF = LLFF(powerCell, parent);
            Field field = this.LLFII;
            if (field != null) {
                field.set(powerCell, LLFF);
            }
            powerCell.onItemViewCreated();
            Object obj2 = ((Map) this.LJLLL.getValue()).get(cls);
            if (obj2 != null) {
                powerCell.onItemViewCreated(obj2);
            }
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            SZ0 LLIIJLIL2 = LLIIJLIL();
            String LIZLLL = C65352Pkq.LIZ(powerCell.getClass()).LIZLLL();
            LLIIJLIL2.getClass();
            LLIIJLIL2.LIZIZ(C65352Pkq.LIZ(C88513YoX.class), new AqS4S1000100_12(LIZLLL, elapsedRealtimeNanos2, 1));
            C0AX.LIZ(parent, powerCell.itemView, R.id.lj7);
            View view = powerCell.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (powerCell.itemView.getParent() != null) {
                    boolean z = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                        stringBuffer.append(" holder ");
                        stringBuffer.append(powerCell.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) powerCell.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(powerCell.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = powerCell.getClass().getName();
            return powerCell;
        }
        throw new RuntimeException("onCreateViewHolder itemToType error!!");
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    @Override // X.SYM
    public final void LJZI(AbstractC72278SYg<?> config, SIT sit, C72808Sho<InterfaceC57784Mm4> state) {
        AbstractC72278SYg<?> abstractC72278SYg;
        PowerPageLoader<?> powerPageLoader;
        PowerStub powerStub;
        PowerPageLoader powerPageLoader2;
        o.LJIIIZ(config, "config");
        o.LJIIIZ(state, "state");
        if (!this.LJLJJI ? sit == null : sit != null) {
            "chunk cannot use PowerList.load!".toString();
            throw new IllegalStateException("chunk cannot use PowerList.load!");
        }
        PowerPageLoader<?> powerPageLoader3 = this.LJLJLJ;
        if (powerPageLoader3 != null) {
            powerPageLoader3.onDestroy();
        }
        if (sit == null || (abstractC72278SYg = sit.LJII()) == null) {
            abstractC72278SYg = config;
        }
        if (sit == null || (powerPageLoader2 = (PowerPageLoader) sit.LJLILLLLZI.getValue()) == null || !C48841JEv.LJIILLIIL(powerPageLoader2) || (powerPageLoader = (PowerPageLoader) sit.LJLILLLLZI.getValue()) == null) {
            powerPageLoader = new PowerPageLoader<>(abstractC72278SYg, state);
        }
        this.LJLJLJ = powerPageLoader;
        powerPageLoader.LJLJI = LLIIJLIL();
        if (this.LJLJJI) {
            powerStub = LLIIIJ();
        } else if (sit != null) {
            powerStub = sit.LJFF();
        } else {
            powerStub = null;
        }
        powerPageLoader.LJLJLJ = powerStub;
        SYS sys = new SYS(this, this.LJLZ, new AqS178S0100000_12(this, 85));
        synchronized (powerPageLoader) {
            SZZ szz = powerPageLoader.LJLLILLLL;
            if (szz != null) {
                sys.LJLJI.invoke(szz);
                powerPageLoader.LJLLILLLL = null;
            }
        }
        powerPageLoader.LJLLLL = (C73411SrX) sys.LJLILLLLZI.LJJJJZI(new AfS64S0100000_12(powerPageLoader, 8));
        powerPageLoader.LJLLL = sys;
        sys.LJLIL.getLifecycle().addObserver(powerPageLoader);
        LL(config.LIZ, SYU.PageConfig);
        this.LJLL.LJLIL = powerPageLoader;
        if (powerPageLoader.LJLJJL.LIZIZ && !powerPageLoader.LJLLI) {
            powerPageLoader.LJLLI = true;
            powerPageLoader.LJII();
        }
    }

    public final Integer LLIIIL(PowerStub powerStub, Class<? extends InterfaceC57784Mm4> cls, InterfaceC57784Mm4 interfaceC57784Mm4) {
        Integer num;
        int i;
        if (interfaceC57784Mm4 instanceof SIU) {
            num = Integer.valueOf(((SIU) interfaceC57784Mm4).LJLILLLLZI);
        } else {
            Map<Type, Integer> map = powerStub.LJLL;
            if (map != null) {
                num = (Integer) ((HashMap) map).get(cls);
            }
            return -1;
        }
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = (Integer) ((HashMap) this.LJLJL).get(powerStub);
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            return Integer.valueOf(intValue + i);
        }
        return -1;
    }

    @Override // X.AbstractC029409q
    /* renamed from: LLIILII, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(PowerCell<? extends InterfaceC57784Mm4> holder, int i, List<Object> payloads) {
        List LLII;
        C8RL c8rl;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        holder.setAttachView$powerlist_release(this.LJLIL);
        SZ0 LLIIJLIL = LLIIJLIL();
        LLIIJLIL.getClass();
        LLIIJLIL.LIZ(C65352Pkq.LIZ(C88512YoW.class));
        if (SYZ.LIZ) {
            C57939MoZ c57939MoZ = this.LJZL;
            if (c57939MoZ != null && c57939MoZ.LIZLLL) {
                c8rl = (InterfaceC57784Mm4) ListProtector.get(this.LJZ.LJI, i);
            } else if (holder instanceof PowerLoadingCell) {
                c8rl = this.LJLL;
            } else {
                c8rl = (InterfaceC57784Mm4) ListProtector.get(LLII(), i);
            }
        } else {
            C57939MoZ c57939MoZ2 = this.LJZL;
            if (c57939MoZ2 != null && c57939MoZ2.LIZLLL) {
                LLII = this.LJZ.LJI;
            } else {
                LLII = LLII();
            }
            c8rl = (InterfaceC57784Mm4) ListProtector.get(LLII, i);
        }
        holder.setStub(LLIIIZ(i));
        holder.bindItem$powerlist_release(c8rl);
        if (holder.getStub() == null && o.LJ(c8rl, this.LJLL)) {
            holder.setStub(LLIIIJ());
        }
        ((C8YF) this.LJLLI.getValue()).LIZIZ(c8rl, holder, i, payloads);
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        holder.onBindViewHolder(c8rl, payloads);
        long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
        LLFFF(i);
        SZ0 LLIIJLIL2 = LLIIJLIL();
        String LIZLLL = C65352Pkq.LIZ(holder.getClass()).LIZLLL();
        LLIIJLIL2.getClass();
        LLIIJLIL2.LIZIZ(C65352Pkq.LIZ(C88512YoW.class), new AqS4S1000100_12(LIZLLL, elapsedRealtimeNanos2, 0));
    }
}
