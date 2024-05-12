package com.bytedance.scene.navigation;

import X.AbstractC81439Vxj;
import X.C0M6;
import X.C16300kU;
import X.C16880lQ;
import X.C1JI;
import X.C42654Goc;
import X.C42663Gol;
import X.C42664Gom;
import X.C65531Pnj;
import X.C78932UyO;
import X.C81012Vqq;
import X.C82152WMa;
import X.C82156WMe;
import X.C82157WMf;
import X.C82164WMm;
import X.EnumC146655pF;
import X.GHB;
import X.HJO;
import X.InterfaceC45856HzA;
import X.InterfaceC78933UyP;
import X.InterfaceC80245VeT;
import X.InterfaceC82169WMr;
import X.InterfaceC82170WMs;
import X.PIA;
import X.ViewOnApplyWindowInsetsListenerC80727VmF;
import X.WM7;
import X.WM8;
import X.WME;
import X.WMI;
import X.WML;
import X.WMM;
import X.WMO;
import X.WMP;
import X.WMQ;
import X.WMS;
import X.WMW;
import X.X1D;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class NavigationScene extends WM7 implements InterfaceC45856HzA, InterfaceC78933UyP, InterfaceC82170WMs {
    public InterfaceC80245VeT LJLILLLLZI;
    public HJO LJLJI;
    public WMI LJLJJI;
    public FrameLayout LJLJJL;
    public C82164WMm LJLJJLL;
    public final C0M6<Class, AbstractC81439Vxj> LJLJLJ;
    public final List<InterfaceC45856HzA> LJLJLLL;
    public final List<PIA<WMQ, Boolean>> LJLL;
    public boolean LJLIL = true;
    public C81012Vqq LJLJL = new C81012Vqq();

    @Override // X.InterfaceC78933UyP
    public final void disableSupportRestore() {
        this.LJLIL = false;
    }

    public final WM7 LLJJIII() {
        WMI wmi = this.LJLJJI;
        if (wmi == null) {
            return null;
        }
        return wmi.LJFF();
    }

    public final void LLJJIJI() {
        View view;
        WM7 LJFF = this.LJLJJI.LJFF();
        if (LJFF != null && (view = LJFF.mView) != null) {
            ((InputMethodManager) C16880lQ.LLILL(view.getContext(), "input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // X.WM7
    public final void dispatchPause() {
        LLJJI(WME.STARTED);
        super.dispatchPause();
    }

    @Override // X.WM7
    public final void dispatchStop() {
        LLJJI(WME.ACTIVITY_CREATED);
        super.dispatchStop();
    }

    @Override // X.InterfaceC78933UyP
    public final List<WM7> getSceneList() {
        List<Record> LIZIZ = this.LJLJJI.LIZIZ.LIZIZ();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZIZ).iterator();
        while (it.hasNext()) {
            arrayList.add(((Record) it.next()).LJLIL);
        }
        return arrayList;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        WME wme = WME.NONE;
        WMI wmi = this.LJLJJI;
        String LIZ = wmi.LIZ("NavigationManager dispatchChildrenState");
        wmi.LJ(new WMP(wmi, wme));
        wmi.LIZLLL(LIZ);
        super.onDestroyView();
    }

    public NavigationScene() {
        new ArrayList();
        this.LJLJLJ = new C0M6<>(3);
        this.LJLJLLL = new ArrayList();
        this.LJLL = new ArrayList();
    }

    public final void LLJJIJIL() {
        C1JI.LJII();
        if (!C78932UyO.LJ(this.mActivity)) {
            return;
        }
        LLJJIJI();
        WMI wmi = this.LJLJJI;
        wmi.getClass();
        wmi.LJIIIIZZ(new C82156WMe(wmi, null));
    }

    @Override // X.WM7
    public final void dispatchResume() {
        super.dispatchResume();
        LLJJI(WME.RESUMED);
    }

    @Override // X.WM7
    public final void dispatchStart() {
        super.dispatchStart();
        LLJJI(WME.STARTED);
    }

    public final boolean onBackPressed() {
        C1JI.LJII();
        if (!C78932UyO.LJ(this.mActivity)) {
            return false;
        }
        WMI wmi = this.LJLJJI;
        wmi.getClass();
        ArrayList arrayList = new ArrayList(wmi.LJII);
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            PIA pia = (PIA) ListProtector.get(arrayList, size);
            if (((LifecycleOwner) pia.LIZ).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED) && ((GHB) pia.LIZIZ).onBackPressed()) {
                return true;
            }
        }
        if (this.LJLJJI.LIZIZ.LIZ.size() <= 1) {
            return false;
        }
        LLJJIJIL();
        return true;
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        this.LJLJJI.LIZJ();
    }

    @Override // X.InterfaceC78933UyP
    public final boolean isSupportRestore() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onAttach() {
        super.onAttach();
    }

    @Override // X.InterfaceC82170WMs
    public final String LJLI(String str) {
        return this.LJLJJI.LIZ(str);
    }

    @Override // X.InterfaceC82170WMs
    public final void LJLJI(String str) {
        this.LJLJJI.LIZLLL(str);
    }

    public final void LLJJI(WME wme) {
        if (this.mState.value >= WME.VIEW_CREATED.value) {
            WMI wmi = this.LJLJJI;
            String LIZ = wmi.LIZ("NavigationManager dispatchCurrentChildState");
            wmi.LJ(new WMO(wmi, wme));
            wmi.LIZLLL(LIZ);
            return;
        }
        throw new IllegalArgumentException("dispatchCurrentChildState can only call when state is VIEW_CREATED, ACTIVITY_CREATED, STARTED, RESUMED");
    }

    public final boolean LLJJIJIIJIL(WM7 wm7) {
        Iterator it = ((ArrayList) this.LJLJJI.LIZIZ.LIZ).iterator();
        while (it.hasNext()) {
            Record record = (Record) it.next();
            if (record.LJLIL == wm7) {
                return record.LJLILLLLZI;
            }
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public final void LLJJJ(C42654Goc c42654Goc) {
        C1JI.LJII();
        if (!C78932UyO.LJ(this.mActivity)) {
            return;
        }
        LLJJIJI();
        WMI wmi = this.LJLJJI;
        wmi.getClass();
        wmi.LJIIIIZZ(new C82152WMa(wmi, c42654Goc));
    }

    public final void LLJJL(GHB ghb) {
        C1JI.LJII();
        this.LJLJJI.LJII(ghb);
    }

    @Override // X.WM7
    public final void dispatchActivityCreated(Bundle bundle) {
        boolean z;
        boolean z2;
        super.dispatchActivityCreated(bundle);
        WMI wmi = this.LJLJJI;
        if (wmi.LJ.size() == 0 || !wmi.LIZIZ()) {
            return;
        }
        if (System.currentTimeMillis() - wmi.LJFF > 800) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList(wmi.LJ);
        for (int i = 0; i < arrayList.size(); i++) {
            InterfaceC82169WMr interfaceC82169WMr = (InterfaceC82169WMr) ListProtector.get(arrayList, i);
            if (i < arrayList.size() - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            wmi.LJIIJJI = z2 | z;
            String LIZ = wmi.LIZ("NavigationManager executePendingOperation");
            wmi.LJ(interfaceC82169WMr);
            wmi.LIZLLL(LIZ);
            wmi.LJIIJJI = false;
        }
        wmi.LJ.removeAll(arrayList);
        if (wmi.LJ.size() <= 0) {
            wmi.LJFF = -1L;
            return;
        }
        throw new IllegalStateException("why mPendingActionList still have item?");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchAttachScene(WM7 wm7) {
        super.dispatchAttachScene(wm7);
        if (wm7 == 0) {
            return;
        }
        if (wm7 instanceof InterfaceC78933UyP) {
            if (((InterfaceC78933UyP) wm7).isSupportRestore()) {
                return;
            }
            this.LJLIL = false;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unknown parent Scene type ");
            LIZ.append(wm7.getClass());
            throw new WM8(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC78933UyP
    public final String getSceneDebugInfo(WM7 wm7) {
        WM7 wm72 = wm7.mParentScene;
        String str = null;
        if (wm72 == null) {
            return null;
        }
        if (wm72 == this) {
            Lifecycle.State currentState = wm7.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.RESUMED) {
                str = "resumed";
            } else if (currentState == Lifecycle.State.STARTED) {
                str = "paused";
            } else if (currentState == Lifecycle.State.CREATED) {
                str = "stopped";
            }
            return a1.LJ("status: ", str, " ");
        }
        throw new IllegalArgumentException("Scene parent is incorrect");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    @Override // X.WM7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onActivityCreated(r12)
            java.lang.String r5 = "SceneComponentFactory instantiateScene return Scene already has a parent"
            r10 = 0
            if (r12 == 0) goto L91
            boolean r0 = r11.LJLIL
            if (r0 == 0) goto L91
            X.WMI r3 = r11.LJLJJI
            android.app.Activity r9 = r11.requireActivity()
            X.VeT r8 = r11.LJLILLLLZI
            X.WMW r7 = r3.LIZIZ
            r7.getClass()
            java.lang.String r0 = "bd-scene-nav:record_stack"
            java.util.ArrayList r1 = r12.getParcelableArrayList(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r7.LIZ = r0
            r2 = 0
            r6 = 0
        L28:
            java.util.List<com.bytedance.scene.navigation.Record> r0 = r7.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r6 >= r0) goto L60
            java.util.List<com.bytedance.scene.navigation.Record> r0 = r7.LIZ
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            com.bytedance.scene.navigation.Record r4 = (com.bytedance.scene.navigation.Record) r4
            if (r6 != 0) goto L53
            if (r8 == 0) goto L53
            java.lang.ClassLoader r1 = r9.getClassLoader()
            java.lang.String r0 = r4.LJLJLJ
            X.WM7 r1 = r8.LIZ(r1, r0)
            if (r1 == 0) goto L53
            X.WM7 r0 = r1.mParentScene
            if (r0 != 0) goto L5a
        L4e:
            r4.LJLIL = r1
            int r6 = r6 + 1
            goto L28
        L53:
            java.lang.String r0 = r4.LJLJLJ
            X.WM7 r1 = X.C65531Pnj.LIZIZ(r9, r0, r10)
            goto L4e
        L5a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        L60:
            java.lang.String r0 = "bd-scene-nav:navigation_scene_manager"
            java.util.ArrayList r4 = r12.getParcelableArrayList(r0)
            X.WMW r0 = r3.LIZIZ
            java.util.List r1 = r0.LIZIZ()
        L6c:
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r2 > r0) goto Lc7
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            com.bytedance.scene.navigation.Record r0 = (com.bytedance.scene.navigation.Record) r0
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            android.os.Bundle r8 = (android.os.Bundle) r8
            com.bytedance.scene.navigation.NavigationScene r5 = r3.LIZ
            X.WM7 r6 = r0.LJLIL
            X.WME r7 = X.WME.ACTIVITY_CREATED
            r9 = 0
            r10 = 0
            X.WMI.LJI(r5, r6, r7, r8, r9, r10)
            int r2 = r2 + 1
            goto L6c
        L91:
            X.HJO r0 = r11.LJLJI
            java.lang.String r4 = r0.LIZ
            android.os.Bundle r2 = r0.LIZIZ
            X.VeT r0 = r11.LJLILLLLZI
            if (r0 == 0) goto Ld6
            android.app.Activity r0 = r11.requireActivity()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            X.VeT r0 = r11.LJLILLLLZI
            X.WM7 r3 = r0.LIZ(r1, r4)
            if (r3 == 0) goto Ld6
            X.WM7 r0 = r3.mParentScene
            if (r0 != 0) goto Le7
        Laf:
            X.WMI r2 = r11.LJLJJI
            X.Gol r0 = new X.Gol
            r0.<init>()
            X.Gom r1 = r0.LIZ()
            r2.getClass()
            if (r3 == 0) goto Ldf
            X.WMS r0 = new X.WMS
            r0.<init>(r2, r3, r1)
            r2.LJIIIIZZ(r0)
        Lc7:
            com.bytedance.scene.navigation.NavigationScene r1 = X.C78923UyF.LJIIJJI(r11)
            if (r1 == 0) goto Ld5
            X.WMl r0 = new X.WMl
            r0.<init>(r11)
            r1.LLJILJILJ(r11, r0)
        Ld5:
            return
        Ld6:
            android.app.Activity r0 = r11.requireActivity()
            X.WM7 r3 = X.C65531Pnj.LIZIZ(r0, r4, r2)
            goto Laf
        Ldf:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "scene can't be null"
            r1.<init>(r0)
            throw r1
        Le7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.navigation.NavigationScene.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJJI = new WMI(this);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            String string = bundle2.getString("extra_rootScene");
            if (string != null) {
                HJO hjo = new HJO(string, bundle2.getBundle("extra_rootScene_arguments"));
                hjo.LIZJ = bundle2.getBoolean("extra_drawWindowBackground");
                hjo.LIZLLL = bundle2.getBoolean("extra_fixSceneBackground_enabled");
                hjo.LJ = bundle2.getInt("extra_sceneBackground");
                this.LJLJI = hjo;
                if (bundle != null && !bundle.getBoolean("bd-scene-navigation:support_restore", this.LJLIL)) {
                    this.LJLIL = false;
                    return;
                }
                return;
            }
            throw new IllegalStateException("root scene class name cant be null");
        }
        throw new IllegalArgumentException("NavigationScene need NavigationSceneOptions bundle");
    }

    @Override // X.WM7
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!bundle.containsKey("bd-scene-navigation:support_restore")) {
            bundle.putBoolean("bd-scene-navigation:support_restore", this.LJLIL);
            if (this.LJLIL) {
                WMI wmi = this.LJLJJI;
                WMW wmw = wmi.LIZIZ;
                wmw.getClass();
                ArrayList arrayList = new ArrayList(wmw.LIZ);
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
                for (int i = 0; i <= arrayList.size() - 1; i++) {
                    Record record = (Record) ListProtector.get(arrayList, i);
                    if (record.LJLIL.mSceneRestoreEnabled) {
                        arrayList2.add(record);
                    }
                }
                bundle.putParcelableArrayList("bd-scene-nav:record_stack", arrayList2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                Iterator it = ((ArrayList) wmi.LIZIZ.LIZIZ()).iterator();
                while (it.hasNext()) {
                    WM7 wm7 = ((Record) it.next()).LJLIL;
                    if (wm7.mSceneRestoreEnabled) {
                        Bundle bundle2 = new Bundle();
                        wm7.dispatchSaveInstanceState(bundle2);
                        arrayList3.add(bundle2);
                    }
                }
                bundle.putParcelableArrayList("bd-scene-nav:navigation_scene_manager", arrayList3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-navigation:support_restore");
    }

    public final void remove(WM7 wm7) {
        C1JI.LJII();
        if (!C78932UyO.LJ(this.mActivity)) {
            return;
        }
        if (this.LJLJJI.LJFF() == wm7) {
            LLJJIJI();
        }
        WMI wmi = this.LJLJJI;
        wmi.getClass();
        wmi.LJIIIIZZ(new WMM(wmi, wm7));
    }

    public final void unregisterChildSceneLifecycleCallbacks(WMQ wmq) {
        C1JI.LJII();
        int size = ((ArrayList) this.LJLL).size();
        for (int i = 0; i < size; i++) {
            if (((PIA) ListProtector.get(this.LJLL, i)).LIZ == wmq) {
                Object obj = ListProtector.get(this.LJLL, i);
                if (obj != null) {
                    ((ArrayList) this.LJLL).remove(obj);
                    return;
                }
                return;
            }
        }
    }

    public final void LLJILJIL(final LifecycleOwner lifecycleOwner, final InterfaceC45856HzA interfaceC45856HzA) {
        C1JI.LJII();
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((ArrayList) this.LJLJLLL).add(interfaceC45856HzA);
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.navigation.NavigationScene.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                ((ArrayList) NavigationScene.this.LJLJLLL).remove(interfaceC45856HzA);
            }
        });
    }

    public final void LLJILJILJ(final LifecycleOwner lifecycleOwner, final GHB ghb) {
        C1JI.LJII();
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((ArrayList) this.LJLJJI.LJII).add(new PIA(lifecycleOwner, ghb));
        lifecycleOwner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.scene.navigation.NavigationScene.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                lifecycleOwner.getLifecycle().removeObserver(this);
                NavigationScene.this.LJLJJI.LJII(ghb);
            }
        });
    }

    public final void LLJJ(WM7 wm7, EnumC146655pF enumC146655pF) {
        boolean z;
        Iterator it = ((ArrayList) this.LJLJJI.LIZIZ.LIZ).iterator();
        while (it.hasNext()) {
            if (((Record) it.next()).LJLIL == wm7) {
                WMI wmi = this.LJLJJI;
                if (enumC146655pF == EnumC146655pF.TO_TRANSLUCENT) {
                    z = true;
                } else {
                    z = false;
                }
                wmi.getClass();
                if (wm7 != null) {
                    wmi.LJIIIIZZ(new WML(wmi, wm7, z));
                    return;
                }
                throw new NullPointerException("scene can't be null");
            }
        }
        throw new IllegalArgumentException("Scene not found");
    }

    public final void LLJJJJ(WM7 wm7, C42664Gom c42664Gom) {
        C1JI.LJII();
        if (!C78932UyO.LJ(this.mActivity)) {
            return;
        }
        WM7 wm72 = wm7.mParentScene;
        if (wm72 != null) {
            if (wm72 == this) {
                throw new IllegalArgumentException("Scene is already pushed");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Scene already has a parent, parent ");
            LIZ.append(wm7.mParentScene);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        if (!this.LJLIL || !wm7.mSceneRestoreEnabled || C65531Pnj.LIZJ(wm7)) {
            if (c42664Gom == null) {
                c42664Gom = new C42663Gol().LIZ();
            }
            LLJJIJI();
            WMI wmi = this.LJLJJI;
            wmi.getClass();
            wmi.LJIIIIZZ(new WMS(wmi, wm7, c42664Gom));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Scene ");
        LIZ2.append(wm7.getClass().getName());
        LIZ2.append(" must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public final void LLJJLIIIJLLLLLLLZ(WM7 wm7, Object obj) {
        Iterator it = ((ArrayList) this.LJLJJI.LIZIZ.LIZ).iterator();
        while (it.hasNext()) {
            Record record = (Record) it.next();
            if (record.LJLIL == wm7) {
                record.LJLJJL = obj;
                return;
            }
        }
        throw new IllegalArgumentException("Scene is not found in stack");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneDestroyed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIIL(wm7);
                }
            }
        }
        super.dispatchOnPreSceneDestroyed(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreScenePaused(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIIIZ(wm7);
                }
            }
        }
        super.dispatchOnPreScenePaused(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneResumed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIILJJIL(wm7);
                }
            }
        }
        super.dispatchOnPreSceneResumed(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneStarted(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIILL(wm7);
                }
            }
        }
        super.dispatchOnPreSceneStarted(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneStopped(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIILIIL(wm7);
                }
            }
        }
        super.dispatchOnPreSceneStopped(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneViewDestroyed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJI(wm7);
                }
            }
        }
        super.dispatchOnPreSceneViewDestroyed(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneDestroyed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIIIIZZ(wm7);
                }
            }
        }
        super.dispatchOnSceneDestroyed(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnScenePaused(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIIZILJ(wm7);
                }
            }
        }
        super.dispatchOnScenePaused(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneResumed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LIZ(wm7);
                }
            }
        }
        super.dispatchOnSceneResumed(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneStarted(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LIZIZ(wm7);
                }
            }
        }
        super.dispatchOnSceneStarted(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneStopped(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJFF(wm7);
                }
            }
        }
        super.dispatchOnSceneStopped(wm7, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneViewDestroyed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIJ(wm7);
                }
            }
        }
        super.dispatchOnSceneViewDestroyed(wm7, z);
    }

    public final void registerChildSceneLifecycleCallbacks(WMQ wmq, boolean z) {
        C1JI.LJII();
        ((ArrayList) this.LJLL).add(new PIA(wmq, Boolean.valueOf(z)));
    }

    @Override // X.InterfaceC45856HzA
    public final void LLILLJJLI(WM7 wm7, WM7 wm72, boolean z) {
        Iterator it = new ArrayList(this.LJLJLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC45856HzA) it.next()).LLILLJJLI(wm7, wm72, z);
        }
    }

    public final void LLJJJIL(Class<? extends WM7> cls, Bundle bundle, C42664Gom c42664Gom) {
        AbstractC81439Vxj LIZ;
        if (!AbstractC81439Vxj.class.isAssignableFrom(cls) || (LIZ = this.LJLJLJ.LIZIZ(cls)) == null) {
            LIZ = C65531Pnj.LIZ(bundle, cls);
        } else if (bundle != null) {
            LIZ.mArguments = bundle;
        }
        LLJJJJ(LIZ, c42664Gom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneActivityCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LIZLLL(wm7);
                }
            }
        }
        super.dispatchOnPreSceneActivityCreated(wm7, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJII(wm7);
                }
            }
        }
        super.dispatchOnPreSceneCreated(wm7, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnPreSceneViewCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIIJ(wm7);
                }
            }
        }
        super.dispatchOnPreSceneViewCreated(wm7, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneActivityCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LIZJ(wm7);
                }
            }
        }
        super.dispatchOnSceneActivityCreated(wm7, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIIJJI(wm7);
                }
            }
        }
        super.dispatchOnSceneCreated(wm7, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneSaveInstanceState(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJ();
                }
            }
        }
        super.dispatchOnSceneSaveInstanceState(wm7, bundle, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public final void dispatchOnSceneViewCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.LJLL).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIILLIIL(wm7, bundle);
                }
            }
        }
        super.dispatchOnSceneViewCreated(wm7, bundle, z);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C82157WMf c82157WMf = new C82157WMf(requireSceneContext());
        c82157WMf.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC80727VmF());
        c82157WMf.setId(R.id.gyc);
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        this.LJLJJL = frameLayout;
        frameLayout.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC80727VmF());
        c82157WMf.addView(this.LJLJJL, new FrameLayout.LayoutParams(-1, -1));
        C82164WMm c82164WMm = new C82164WMm(requireSceneContext());
        c82164WMm.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC80727VmF());
        this.LJLJJLL = c82164WMm;
        c82157WMf.addView(c82164WMm, new FrameLayout.LayoutParams(-1, -1));
        if (this.LJLJI.LIZJ) {
            C16300kU.LJIILLIIL(c82157WMf, C78932UyO.LIZLLL(requireSceneContext()));
        }
        return c82157WMf;
    }
}
