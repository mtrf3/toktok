package androidx.viewpager2.adapter;

import X.AbstractC029409q;
import X.AbstractC29041Ca;
import X.C08Z;
import X.C0AX;
import X.C0C9;
import X.C0CA;
import X.C0CC;
import X.C0CG;
import X.C0CJ;
import X.C0CM;
import X.C0M4;
import X.C0M5;
import X.C0M7;
import X.C16330kX;
import X.C16880lQ;
import X.C1B3;
import X.C29091Cf;
import X.C29127Bbv;
import X.C36922EeM;
import X.C50368Jpk;
import X.C51219K8h;
import X.C60903NvH;
import X.C61845OOz;
import X.C72272SYa;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79234V7u;
import X.K39;
import X.KOR;
import X.KOT;
import X.X1D;
import X.YR9;
import X.YRA;
import X.YRB;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends AbstractC029409q<C29091Cf> implements C0CG {
    public final Lifecycle LJLIL;
    public final FragmentManager LJLILLLLZI;
    public final C0M5<Fragment> LJLJI;
    public final C0M5<Fragment.SavedState> LJLJJI;
    public final C0M5<Integer> LJLJJL;
    public C0CA LJLJJLL;
    public final C0C9 LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    public abstract Fragment LJZ(int i);

    @Override // X.AbstractC029409q
    public long getItemId(int i) {
        return i;
    }

    public final void LJZI() {
        Fragment LJ;
        View view;
        if (!this.LJLJLLL || this.LJLILLLLZI.LJJJLZIJ()) {
            return;
        }
        C0M4 c0m4 = new C0M4();
        for (int i = 0; i < this.LJLJI.LJIIIIZZ(); i++) {
            long LJFF = this.LJLJI.LJFF(i);
            if (!LJLZ(LJFF)) {
                c0m4.add(Long.valueOf(LJFF));
                this.LJLJJL.LJII(LJFF);
            }
        }
        if (!this.LJLJLJ) {
            this.LJLJLLL = false;
            for (int i2 = 0; i2 < this.LJLJI.LJIIIIZZ(); i2++) {
                long LJFF2 = this.LJLJI.LJFF(i2);
                C0M5<Integer> c0m5 = this.LJLJJL;
                if (c0m5.LJLIL) {
                    c0m5.LIZLLL();
                }
                if (C60903NvH.LJ(LJFF2, c0m5.LJLJJI, c0m5.LJLILLLLZI) < 0 && ((LJ = this.LJLJI.LJ(LJFF2, null)) == null || (view = LJ.getView()) == null || view.getParent() == null)) {
                    c0m4.add(Long.valueOf(LJFF2));
                }
            }
        }
        Iterator it = c0m4.iterator();
        while (true) {
            C0M7 c0m7 = (C0M7) it;
            if (!c0m7.hasNext()) {
                return;
            } else {
                LLD(((Long) c0m7.next()).longValue());
            }
        }
    }

    @Override // X.C0CG
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.LJLJJI.LJIIIIZZ() + this.LJLJI.LJIIIIZZ());
        for (int i = 0; i < this.LJLJI.LJIIIIZZ(); i++) {
            long LJFF = this.LJLJI.LJFF(i);
            Fragment LJ = this.LJLJI.LJ(LJFF, null);
            if (LJ != null && LJ.isAdded()) {
                this.LJLILLLLZI.LJJLIIJ(bundle, C61845OOz.LIZ("f#", LJFF), LJ);
            }
        }
        for (int i2 = 0; i2 < this.LJLJJI.LJIIIIZZ(); i2++) {
            long LJFF2 = this.LJLJJI.LJFF(i2);
            if (LJLZ(LJFF2)) {
                bundle.putParcelable(C61845OOz.LIZ("s#", LJFF2), this.LJLJJI.LJ(LJFF2, null));
            }
        }
        return bundle;
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0CG
    public final void LJJJJI(Parcelable parcelable) {
        if (this.LJLJJI.LJIIIIZZ() == 0 && this.LJLJI.LJIIIIZZ() == 0) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.getClassLoader() == null) {
                bundle.setClassLoader(getClass().getClassLoader());
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f#") && str.length() > 2) {
                    this.LJLJI.LJI(CastLongProtector.parseLong(str.substring(2)), this.LJLILLLLZI.LJJJJJ(bundle, str));
                } else if (str.startsWith("s#") && str.length() > 2) {
                    long parseLong = CastLongProtector.parseLong(str.substring(2));
                    Parcelable parcelable2 = bundle.getParcelable(str);
                    if (LJLZ(parseLong)) {
                        this.LJLJJI.LJI(parseLong, parcelable2);
                    }
                } else {
                    throw new IllegalArgumentException(i0.LJFF("Unexpected key in savedState: ", str));
                }
            }
            if (this.LJLJI.LJIIIIZZ() == 0) {
                return;
            }
            this.LJLJLLL = true;
            this.LJLJLJ = true;
            LJZI();
            final Handler handler = new Handler(C16880lQ.LLJJJJ());
            final IDRunnableS85S0100000 iDRunnableS85S0100000 = new IDRunnableS85S0100000(this, 33);
            this.LJLIL.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        handler.removeCallbacks(iDRunnableS85S0100000);
                        lifecycleOwner.getLifecycle().removeObserver(this);
                    }
                }
            });
            handler.postDelayed(iDRunnableS85S0100000, 10000L);
            return;
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public boolean LJLZ(long j) {
        if (j >= 0 && j < getItemCount()) {
            return true;
        }
        return false;
    }

    public final Long LJZL(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.LJLJJL.LJIIIIZZ(); i2++) {
            if (this.LJLJJL.LJIIIZ(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.LJLJJL.LJFF(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    public final void LL(final C29091Cf c29091Cf) {
        final Fragment LJ = this.LJLJI.LJ(c29091Cf.getItemId(), null);
        if (LJ != null) {
            final FrameLayout frameLayout = (FrameLayout) c29091Cf.itemView;
            View view = LJ.getView();
            if (LJ.isAdded() || view == null) {
                if (LJ.isAdded() && view == null) {
                    this.LJLILLLLZI.LJJLIL(new C08Z() { // from class: X.1Cd
                        @Override // X.C08Z
                        public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view2, Bundle bundle) {
                            if (fragment == LJ) {
                                fragmentManager.LJLJJLL(this);
                                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                                FrameLayout frameLayout2 = frameLayout;
                                fragmentStateAdapter.getClass();
                                FragmentStateAdapter.LJLLLLLL(view2, frameLayout2);
                            }
                        }
                    }, false);
                    return;
                }
                if (LJ.isAdded() && view.getParent() != null) {
                    if (view.getParent() != frameLayout) {
                        LJLLLLLL(view, frameLayout);
                        return;
                    }
                    return;
                }
                if (LJ.isAdded()) {
                    LJLLLLLL(view, frameLayout);
                    return;
                }
                if (!this.LJLILLLLZI.LJJJLZIJ()) {
                    this.LJLILLLLZI.LJJLIL(new C08Z() { // from class: X.1Cd
                        @Override // X.C08Z
                        public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view2, Bundle bundle) {
                            if (fragment == LJ) {
                                fragmentManager.LJLJJLL(this);
                                FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                                FrameLayout frameLayout2 = frameLayout;
                                fragmentStateAdapter.getClass();
                                FragmentStateAdapter.LJLLLLLL(view2, frameLayout2);
                            }
                        }
                    }, false);
                    C0C9 c0c9 = this.LJLJL;
                    c0c9.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((CopyOnWriteArrayList) c0c9.LIZ).iterator();
                    while (it.hasNext()) {
                        it.next().getClass();
                        arrayList.add(C0CC.LIZ);
                    }
                    try {
                        LJ.setMenuVisibility(false);
                        FragmentManager fragmentManager = this.LJLILLLLZI;
                        fragmentManager.getClass();
                        C1B3 c1b3 = new C1B3(fragmentManager);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("f");
                        LIZ.append(c29091Cf.getItemId());
                        c1b3.LJIIIIZZ(0, 1, LJ, X1D.LIZIZ(LIZ));
                        c1b3.LJJIFFI(LJ, Lifecycle.State.STARTED);
                        c1b3.LJIILLIIL();
                        this.LJLJJLL.LIZIZ(false);
                        return;
                    } finally {
                        this.LJLJL.getClass();
                        C0C9.LIZIZ(arrayList);
                    }
                }
                if (this.LJLILLLLZI.mDestroyed) {
                    return;
                }
                this.LJLIL.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (FragmentStateAdapter.this.LJLILLLLZI.LJJJLZIJ()) {
                            return;
                        }
                        lifecycleOwner.getLifecycle().removeObserver(this);
                        if (C16330kX.LIZIZ(c29091Cf.itemView)) {
                            FragmentStateAdapter.this.LL(c29091Cf);
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("Design assumption violated.");
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void LLD(long j) {
        ViewParent parent;
        Fragment LJ = this.LJLJI.LJ(j, null);
        if (LJ == null) {
            return;
        }
        if (LJ.getView() != null && (parent = LJ.getView().getParent()) != null) {
            ((ViewGroup) parent).removeAllViews();
        }
        if (!LJLZ(j)) {
            this.LJLJJI.LJII(j);
        }
        if (!LJ.isAdded()) {
            this.LJLJI.LJII(j);
            return;
        }
        if (this.LJLILLLLZI.LJJJLZIJ()) {
            this.LJLJLLL = true;
            return;
        }
        if (LJ.isAdded() && LJLZ(j)) {
            this.LJLJJI.LJI(j, this.LJLILLLLZI.LJLI(LJ));
        }
        C0C9 c0c9 = this.LJLJL;
        c0c9.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) c0c9.LIZ).iterator();
        while (it.hasNext()) {
            it.next().getClass();
            arrayList.add(C0CC.LIZ);
        }
        try {
            FragmentManager fragmentManager = this.LJLILLLLZI;
            fragmentManager.getClass();
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(LJ);
            c1b3.LJIILLIIL();
            this.LJLJI.LJII(j);
        } finally {
            this.LJLJL.getClass();
            C0C9.LIZIZ(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1i6, X.09s] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1Ce, X.0CJ] */
    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.LJLJJLL == null) {
            final C0CA c0ca = new C0CA(this);
            this.LJLJJLL = c0ca;
            c0ca.LIZLLL = C0CA.LIZ(recyclerView);
            ?? r1 = new C0CJ() { // from class: X.1Ce
                @Override // X.C0CJ
                public final void LIZ(int i) {
                    C0CA.this.LIZIZ(false);
                }

                @Override // X.C0CJ
                public final void LIZJ(int i) {
                    C0CA.this.LIZIZ(false);
                }
            };
            c0ca.LIZ = r1;
            c0ca.LIZLLL.LIZIZ(r1);
            ?? r0 = new AbstractC29041Ca() { // from class: X.1i6
                @Override // X.AbstractC29041Ca, X.AbstractC029609s
                public final void LIZJ() {
                    C0CA.this.LIZIZ(true);
                }

                {
                    new AbstractC029609s(0) { // from class: X.1Ca
                        @Override // X.AbstractC029609s
                        public abstract void LIZJ();

                        @Override // X.AbstractC029609s
                        public final void LIZLLL(int i, int i2) {
                            LIZJ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJFF(int i, int i2) {
                            LIZJ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJI(int i, int i2) {
                            LIZJ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJII(int i, int i2) {
                            LIZJ();
                        }

                        @Override // X.AbstractC029609s
                        public final void LJ(int i, int i2, Object obj) {
                            LIZJ();
                        }
                    };
                }
            };
            c0ca.LIZIZ = r0;
            registerAdapterDataObserver(r0);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C0CA.this.LIZIZ(false);
                }
            };
            c0ca.LIZJ = lifecycleEventObserver;
            this.LJLIL.addObserver(lifecycleEventObserver);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // X.AbstractC029409q
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C0CA c0ca = this.LJLJJLL;
        c0ca.getClass();
        C0CM LIZ = C0CA.LIZ(recyclerView);
        ((ArrayList) LIZ.LJLJI.LJLIL).remove(c0ca.LIZ);
        c0ca.LJFF.unregisterAdapterDataObserver(c0ca.LIZIZ);
        c0ca.LJFF.LJLIL.removeObserver(c0ca.LIZJ);
        c0ca.LIZLLL = null;
        this.LJLJJLL = null;
    }

    @Override // X.AbstractC029409q
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(C29091Cf c29091Cf) {
        return true;
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(C29091Cf c29091Cf) {
        LL(c29091Cf);
        LJZI();
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(C29091Cf c29091Cf) {
        Long LJZL = LJZL(c29091Cf.itemView.getId());
        if (LJZL != null) {
            LLD(LJZL.longValue());
            this.LJLJJL.LJII(LJZL.longValue());
        }
    }

    @Override // X.AbstractC029409q
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.LJLJI = new C0M5<>();
        this.LJLJJI = new C0M5<>();
        this.LJLJJL = new C0M5<>();
        this.LJLJL = new C0C9();
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLILLLLZI = fragmentManager;
        this.LJLIL = lifecycle;
        super.setHasStableIds(true);
    }

    public static void LJLLLLLL(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                C16880lQ.LJLLL(view, (ViewGroup) view.getParent());
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C29091Cf c29091Cf, int i) {
        final C29091Cf c29091Cf2 = c29091Cf;
        long itemId = c29091Cf2.getItemId();
        int id = c29091Cf2.itemView.getId();
        Long LJZL = LJZL(id);
        if (LJZL != null && LJZL.longValue() != itemId) {
            LLD(LJZL.longValue());
            this.LJLJJL.LJII(LJZL.longValue());
        }
        this.LJLJJL.LJI(itemId, Integer.valueOf(id));
        long itemId2 = getItemId(i);
        C0M5<Fragment> c0m5 = this.LJLJI;
        if (c0m5.LJLIL) {
            c0m5.LIZLLL();
        }
        if (C60903NvH.LJ(itemId2, c0m5.LJLJJI, c0m5.LJLILLLLZI) < 0) {
            Fragment LJZ = LJZ(i);
            LJZ.setInitialSavedState(this.LJLJJI.LJ(itemId2, null));
            this.LJLJI.LJI(itemId2, LJZ);
        }
        final FrameLayout frameLayout = (FrameLayout) c29091Cf2.itemView;
        if (C16330kX.LIZIZ(frameLayout)) {
            if (frameLayout.getParent() == null) {
                frameLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0CE
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        if (frameLayout.getParent() != null) {
                            frameLayout.removeOnLayoutChangeListener(this);
                            FragmentStateAdapter.this.LL(c29091Cf2);
                        }
                    }
                });
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        LJZI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final C29091Cf onCreateViewHolder(ViewGroup parent, int i) {
        C29091Cf c29091Cf;
        o.LJIIIZ(parent, "parent");
        boolean z = true;
        if (this instanceof C50368Jpk) {
            Context context = parent.getContext();
            o.LJIIIIZZ(context, "parent.context");
            KOR kor = new KOR(context);
            kor.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            kor.setId(View.generateViewId());
            kor.setSaveEnabled(false);
            Object value = YRA.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-constructor>(...)");
            Object newInstance = ((Constructor) value).newInstance(kor);
            o.LJIIIIZZ(newInstance, "constructor.newInstance(container)");
            c29091Cf = (RecyclerView.ViewHolder) newInstance;
        } else if (this instanceof C51219K8h) {
            Context context2 = parent.getContext();
            o.LJIIIIZZ(context2, "parent.context");
            KOT kot = new KOT(context2);
            kot.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            kot.setId(View.generateViewId());
            kot.setSaveEnabled(false);
            Object value2 = YRB.LIZ.getValue();
            o.LJIIIIZZ(value2, "<get-constructor>(...)");
            Object newInstance2 = ((Constructor) value2).newInstance(kot);
            o.LJIIIIZZ(newInstance2, "constructor.newInstance(container)");
            c29091Cf = (RecyclerView.ViewHolder) newInstance2;
        } else if (this instanceof C72272SYa) {
            Context context3 = parent.getContext();
            o.LJIIIIZZ(context3, "parent.context");
            K39 k39 = new K39(context3);
            k39.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            k39.setId(View.generateViewId());
            k39.setSaveEnabled(false);
            Object value3 = YR9.LIZ.getValue();
            o.LJIIIIZZ(value3, "<get-constructor>(...)");
            Object newInstance3 = ((Constructor) value3).newInstance(k39);
            o.LJIIIIZZ(newInstance3, "constructor.newInstance(container)");
            c29091Cf = (RecyclerView.ViewHolder) newInstance3;
        } else {
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setId(View.generateViewId());
            frameLayout.setSaveEnabled(false);
            c29091Cf = new RecyclerView.ViewHolder(frameLayout) { // from class: X.1Cf
                public static final /* synthetic */ int LJLIL = 0;
            };
        }
        C0AX.LIZ(parent, c29091Cf.itemView, R.id.lj7);
        View view = c29091Cf.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c29091Cf.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C29091Cf.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c29091Cf.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c29091Cf.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C29091Cf.class.getName();
        return c29091Cf;
    }
}
