package X;

import Y.ARunnableS33S0200000_14;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.GroupRecord;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes15.dex */
public abstract class WMH extends WM7 implements InterfaceC78933UyP {
    public static final WN1 EMPTY_ANIMATION_FACTORY = new C82167WMp();
    public final List<PIA<WMQ, Boolean>> mLifecycleCallbacks = new ArrayList();
    public boolean mSupportRestore = true;
    public final WMJ mGroupSceneManager = new WMJ(this);

    @Override // X.InterfaceC78933UyP
    public final void disableSupportRestore() {
        this.mSupportRestore = false;
    }

    @Override // X.WM7
    public abstract ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onPostActivityCreated() {
    }

    public void onPostResume() {
    }

    public void onPostStart() {
    }

    private void replacePlaceHolderViewToTargetScene() {
        WM7 LIZIZ;
        ArrayList arrayList = new ArrayList();
        extractScenePlaceHolder(arrayList, (ViewGroup) requireView());
        if (arrayList.size() == 0) {
            return;
        }
        if (!isSupportRestore()) {
            SparseArray sparseArray = new SparseArray();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C80243VeR c80243VeR = (C80243VeR) ListProtector.get(arrayList, i);
                ViewGroup viewGroup = (ViewGroup) c80243VeR.getParent();
                int id = viewGroup.getId();
                if (id != -1) {
                    if (sparseArray.get(id) == null) {
                        sparseArray.put(id, viewGroup);
                    } else if (sparseArray.get(id) != viewGroup) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("ScenePlaceHolderView' parent ViewGroup should have unique id, the duplicate id is ");
                        LIZ.append(C78932UyO.LIZIZ(id, requireSceneContext()));
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                    ViewGroup.LayoutParams layoutParams = c80243VeR.getLayoutParams();
                    String sceneName = c80243VeR.getSceneName();
                    String sceneTag = c80243VeR.getSceneTag();
                    Bundle arguments = c80243VeR.getArguments();
                    InterfaceC80245VeT sceneComponentFactory = c80243VeR.getSceneComponentFactory();
                    if (sceneComponentFactory == null || (LIZIZ = sceneComponentFactory.LIZ(requireSceneContext().getClassLoader(), sceneName)) == null) {
                        LIZIZ = C65531Pnj.LIZIZ(requireSceneContext(), sceneName, arguments);
                    }
                    int indexOfChild = viewGroup.indexOfChild(c80243VeR);
                    C16880lQ.LJLLL(c80243VeR, viewGroup);
                    if (c80243VeR.getVisibility() == 0) {
                        add(id, LIZIZ, sceneTag);
                    } else if (c80243VeR.getVisibility() == 8) {
                        beginTransaction();
                        add(id, LIZIZ, sceneTag);
                        hide(LIZIZ);
                        commitTransaction();
                    } else {
                        throw new IllegalStateException("ScenePlaceHolderView's visibility can't be View.INVISIBLE, use View.VISIBLE or View.GONE instead");
                    }
                    View requireView = LIZIZ.requireView();
                    if (c80243VeR.getId() != -1) {
                        if (requireView.getId() == -1) {
                            requireView.setId(c80243VeR.getId());
                        } else if (c80243VeR.getId() != requireView.getId()) {
                            throw new IllegalStateException(C16880lQ.LLLZ("ScenePlaceHolderView's id %s is different from Scene root view's id %s", new Object[]{C78932UyO.LIZIZ(c80243VeR.getId(), requireSceneContext()), C78932UyO.LIZIZ(requireView.getId(), requireSceneContext())}));
                        }
                    }
                    C16880lQ.LJLLL(requireView, viewGroup);
                    viewGroup.addView(requireView, indexOfChild, layoutParams);
                } else {
                    throw new IllegalArgumentException("ScenePlaceHolderView parent id can't be View.NO_ID");
                }
            }
            return;
        }
        throw new IllegalStateException("ScenePlaceHolderView can only be used when support restore is disabled");
    }

    public final void beginTransaction() {
        WMJ wmj = this.mGroupSceneManager;
        if (!wmj.LJFF) {
            wmj.LJFF = true;
            return;
        }
        throw new IllegalStateException("you must call commitTransaction before another beginTransaction");
    }

    public final void commitTransaction() {
        WMJ wmj = this.mGroupSceneManager;
        if (wmj.LJFF) {
            if (((ArrayList) wmj.LJI).size() > 0) {
                Iterator it = ((ArrayList) wmj.LJI).iterator();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (it.hasNext()) {
                    AbstractC82155WMd abstractC82155WMd = (AbstractC82155WMd) it.next();
                    List list = (List) linkedHashMap.get(abstractC82155WMd.LIZ);
                    if (list == null) {
                        list = new ArrayList();
                        linkedHashMap.put(abstractC82155WMd.LIZ, list);
                    }
                    list.add(abstractC82155WMd);
                }
                loop1: for (WM7 wm7 : linkedHashMap.keySet()) {
                    List list2 = (List) linkedHashMap.get(wm7);
                    WME wme = wm7.mState;
                    WME wme2 = ((AbstractC82155WMd) C64504PTg.LIZIZ(list2, -1, list2)).LIZIZ;
                    boolean z = ((AbstractC82155WMd) C64504PTg.LIZIZ(list2, -1, list2)).LIZJ;
                    boolean z2 = ((AbstractC82155WMd) C64504PTg.LIZIZ(list2, -1, list2)).LIZLLL;
                    boolean z3 = ((AbstractC82155WMd) C64504PTg.LIZIZ(list2, -1, list2)).LJ;
                    if (wme != wme2 || z || z2 || z3) {
                        if (wme == WME.NONE) {
                            int size = list2.size();
                            while (true) {
                                size--;
                                if (size < 0) {
                                    break loop1;
                                }
                                AbstractC82155WMd abstractC82155WMd2 = (AbstractC82155WMd) ListProtector.get(list2, size);
                                if (abstractC82155WMd2 instanceof C82171WMt) {
                                    C82171WMt c82171WMt = (C82171WMt) abstractC82155WMd2;
                                    if (c82171WMt != null) {
                                        if (((HashMap) wmj.LIZJ.LIZJ).get(c82171WMt.LJIIJJI) == null) {
                                            WMJ.LJ(new C82153WMb(wmj, wm7, c82171WMt.LJIIJ, c82171WMt.LJIIJJI, wme2, z, z2, z3));
                                        } else {
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append("already have a Scene with tag ");
                                            LIZ.append(c82171WMt.LJIIJJI);
                                            throw new IllegalStateException(X1D.LIZIZ(LIZ));
                                        }
                                    }
                                }
                            }
                            throw new IllegalStateException("you must add Scene first");
                        }
                        WMJ.LJ(new C82153WMb(wmj, wm7, -1, null, wme2, z, z2, z3));
                    }
                }
                ((ArrayList) wmj.LJI).clear();
            }
            wmj.LJFF = false;
            return;
        }
        throw new IllegalStateException("you must call beginTransaction before commitTransaction");
    }

    @Override // X.WM7
    public final void dispatchDestroyView() {
        dispatchChildrenState(WME.NONE);
        super.dispatchDestroyView();
    }

    @Override // X.WM7
    public final void dispatchPause() {
        dispatchVisibleChildrenState(WME.STARTED);
        super.dispatchPause();
    }

    @Override // X.WM7
    public final void dispatchStop() {
        dispatchVisibleChildrenState(WME.ACTIVITY_CREATED);
        super.dispatchStop();
    }

    @Override // X.InterfaceC78933UyP
    public final List<WM7> getSceneList() {
        return this.mGroupSceneManager.LJI();
    }

    @Override // X.WM7
    public final void dispatchResume() {
        super.dispatchResume();
        dispatchVisibleChildrenState(WME.RESUMED);
        onPostResume();
    }

    @Override // X.WM7
    public final void dispatchStart() {
        super.dispatchStart();
        dispatchVisibleChildrenState(WME.STARTED);
        onPostStart();
    }

    @Override // X.WM7
    public final void dispatchDestroy() {
        super.dispatchDestroy();
    }

    @Override // X.WM7
    public final void dispatchDetachActivity() {
        super.dispatchDetachActivity();
    }

    @Override // X.WM7
    public final void dispatchDetachScene() {
        super.dispatchDetachScene();
    }

    @Override // X.InterfaceC78933UyP
    public final boolean isSupportRestore() {
        return this.mSupportRestore;
    }

    private void dispatchChildrenState(WME wme) {
        WMJ wmj = this.mGroupSceneManager;
        List<WM7> LJI = wmj.LJI();
        for (int i = 0; i <= LJI.size() - 1; i++) {
            WM7 wm7 = (WM7) ListProtector.get(LJI, i);
            if (wmj.LIZJ(wm7)) {
                wmj.LIZ(wm7);
                wmj.LJIIIIZZ(wmj.LIZ, wm7, wme, false, new ARunnableS33S0200000_14(wmj, wm7, 13));
            }
        }
    }

    private void dispatchVisibleChildrenState(WME wme) {
        WMJ wmj = this.mGroupSceneManager;
        List unmodifiableList = Collections.unmodifiableList(wmj.LIZJ.LIZ);
        for (int i = 0; i <= unmodifiableList.size() - 1; i++) {
            GroupRecord groupRecord = (GroupRecord) ListProtector.get(unmodifiableList, i);
            if (!groupRecord.isHidden) {
                WM7 wm7 = groupRecord.LJLILLLLZI;
                if (wmj.LIZJ(wm7)) {
                    wmj.LIZ(wm7);
                    wmj.LJIIIIZZ(wmj.LIZ, groupRecord.LJLILLLLZI, wme, false, new ARunnableS33S0200000_14(wmj, wm7, 14));
                }
            }
        }
    }

    @Override // X.WM7
    public final void dispatchActivityCreated(Bundle bundle) {
        super.dispatchActivityCreated(bundle);
        dispatchChildrenState(WME.ACTIVITY_CREATED);
        onPostActivityCreated();
    }

    @Override // X.WM7
    public final void dispatchAttachActivity(Activity activity) {
        super.dispatchAttachActivity(activity);
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
            disableSupportRestore();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("unknown parent Scene type ");
            LIZ.append(wm7.getClass());
            throw new WM8(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.WM7
    public final void dispatchCreate(Bundle bundle) {
        super.dispatchCreate(bundle);
    }

    @Override // X.WM7
    public final void dispatchSaveInstanceState(Bundle bundle) {
        super.dispatchSaveInstanceState(bundle);
    }

    public final ViewGroup findContainerById(int i) {
        ViewGroup viewGroup = (ViewGroup) this.mView.findViewById(i);
        if (viewGroup != null) {
            for (View view = viewGroup; view != null && view != this.mView; view = (View) view.getParent()) {
                WM7 wm7 = (WM7) view.getTag(R.id.b2r);
                if (wm7 != null) {
                    throw new IllegalArgumentException(C16880lQ.LLLZ("cant add Scene to child Scene %s view hierarchy ", new Object[]{wm7.toString()}));
                }
            }
            return viewGroup;
        }
        try {
            String resourceName = getResources().getResourceName(i);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ");
            LIZ.append(resourceName);
            LIZ.append(" view not found");
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        } catch (Resources.NotFoundException unused) {
            throw new IllegalArgumentException(C0NY.LIZIZ(" ", i, " view not found"));
        }
    }

    public final <T extends WM7> T findSceneByTag(String str) {
        GroupRecord groupRecord;
        C1JI.LJII();
        if (str == null || (groupRecord = (GroupRecord) ((HashMap) this.mGroupSceneManager.LIZJ.LIZJ).get(str)) == null) {
            return null;
        }
        return (T) groupRecord.LJLILLLLZI;
    }

    public final String findTagByScene(WM7 wm7) {
        GroupRecord LIZ;
        C1JI.LJII();
        if (wm7 == null || (LIZ = this.mGroupSceneManager.LIZJ.LIZ(wm7)) == null) {
            return null;
        }
        return LIZ.LJLJI;
    }

    @Override // X.InterfaceC78933UyP
    public String getSceneDebugInfo(WM7 wm7) {
        WM7 wm72 = wm7.mParentScene;
        if (wm72 == null) {
            return null;
        }
        if (wm72 == this) {
            String findTagByScene = findTagByScene(wm7);
            boolean z = !isShow(wm7);
            StringBuilder sb = new StringBuilder(a1.LJ("tag: ", findTagByScene, " "));
            if (z) {
                sb.append("hidden ");
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Scene parent is incorrect");
    }

    public final void hide(WM7 wm7) {
        hide(wm7, EMPTY_ANIMATION_FACTORY);
    }

    public final boolean isAdded(WM7 wm7) {
        if (this.mGroupSceneManager.LIZJ.LIZ(wm7) != null) {
            return true;
        }
        return false;
    }

    public final boolean isShow(WM7 wm7) {
        return isShowing(wm7);
    }

    public final boolean isShowing(WM7 wm7) {
        if (this.mGroupSceneManager.LIZJ.LIZ(wm7) == null) {
            return false;
        }
        return !r0.isHidden;
    }

    @Override // X.WM7
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            if (!bundle.getBoolean("bd-scene-group:support_restore", isSupportRestore())) {
                disableSupportRestore();
            }
            if (isSupportRestore()) {
                WMJ wmj = this.mGroupSceneManager;
                Activity requireActivity = requireActivity();
                WMT wmt = wmj.LIZJ;
                List<GroupRecord> list = wmt.LIZ;
                if (list == null || ((ArrayList) list).size() <= 0) {
                    ArrayList arrayList = new ArrayList(bundle.getParcelableArrayList("bd-scene-nav:group_stack"));
                    wmt.LIZ = arrayList;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        GroupRecord groupRecord = (GroupRecord) it.next();
                        WM7 LIZIZ = C65531Pnj.LIZIZ(requireActivity, groupRecord.LJLJJL, null);
                        groupRecord.LJLILLLLZI = LIZIZ;
                        ((HashMap) wmt.LIZIZ).put(LIZIZ, groupRecord);
                        ((HashMap) wmt.LIZJ).put(groupRecord.LJLJI, groupRecord);
                    }
                    List unmodifiableList = Collections.unmodifiableList(wmj.LIZJ.LIZ);
                    if (unmodifiableList.size() == 0) {
                        return;
                    }
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
                    for (int i = 0; i <= unmodifiableList.size() - 1; i++) {
                        GroupRecord groupRecord2 = (GroupRecord) ListProtector.get(unmodifiableList, i);
                        WM7 wm7 = groupRecord2.LJLILLLLZI;
                        groupRecord2.LJLJJLL = (Bundle) ListProtector.get(parcelableArrayList, i);
                        if (wmj.LIZJ(wm7)) {
                            wmj.LIZ(wm7);
                            WMH wmh = wmj.LIZ;
                            wmj.LJIIIIZZ(wmh, wm7, wmh.mState, false, new ARunnableS33S0200000_14(wmj, wm7, 15));
                        } else {
                            throw new WM8("Scene is not found");
                        }
                    }
                    return;
                }
                throw new IllegalStateException("mSceneList size is not zero, Scene is added before restore");
            }
        }
    }

    @Override // X.WM7
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!bundle.containsKey("bd-scene-group:support_restore")) {
            bundle.putBoolean("bd-scene-group:support_restore", isSupportRestore());
            if (isSupportRestore()) {
                WMJ wmj = this.mGroupSceneManager;
                WMT wmt = wmj.LIZJ;
                wmt.getClass();
                ArrayList arrayList = new ArrayList(wmt.LIZ);
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (int i = 0; i <= arrayList.size() - 1; i++) {
                    GroupRecord groupRecord = (GroupRecord) ListProtector.get(arrayList, i);
                    if (groupRecord.LJLILLLLZI.mSceneRestoreEnabled) {
                        arrayList2.add(groupRecord);
                    }
                }
                bundle.putParcelableArrayList("bd-scene-nav:group_stack", new ArrayList<>(arrayList2));
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                List<WM7> LJI = wmj.LJI();
                for (int i2 = 0; i2 <= LJI.size() - 1; i2++) {
                    WM7 wm7 = (WM7) ListProtector.get(LJI, i2);
                    if (wm7.mSceneRestoreEnabled) {
                        Bundle bundle2 = new Bundle();
                        wm7.dispatchSaveInstanceState(bundle2);
                        arrayList3.add(bundle2);
                    }
                }
                bundle.putParcelableArrayList("bd-scene-nav:group_scene_manager", arrayList3);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("outState already contains key bd-scene-group:support_restore");
    }

    public final void remove(WM7 wm7) {
        remove(wm7, EMPTY_ANIMATION_FACTORY);
    }

    public final void show(WM7 wm7) {
        show(wm7, EMPTY_ANIMATION_FACTORY);
    }

    public final void unregisterChildSceneLifecycleCallbacks(WMQ wmq) {
        C1JI.LJII();
        int size = this.mLifecycleCallbacks.size();
        for (int i = 0; i < size; i++) {
            if (((PIA) ListProtector.get(this.mLifecycleCallbacks, i)).LIZ == wmq) {
                Object obj = ListProtector.get(this.mLifecycleCallbacks, i);
                if (obj != null) {
                    this.mLifecycleCallbacks.remove(obj);
                    return;
                }
                return;
            }
        }
    }

    public static WN1 buildAnimatorFactory(WM7 wm7, int i) {
        return new C82159WMh(wm7, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void extractScenePlaceHolder(List<C80243VeR> list, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C80243VeR) {
                list.add(childAt);
            } else if (childAt instanceof ViewGroup) {
                extractScenePlaceHolder(list, (ViewGroup) childAt);
            }
        }
    }

    private void hide(WM7 wm7, WN1 wn1) {
        C1JI.LJII();
        WMJ wmj = this.mGroupSceneManager;
        wmj.LIZIZ(wm7);
        if (wmj.LJFF || wmj.LIZJ.LIZ(wm7) != null) {
            C82172WMu c82172WMu = new C82172WMu(wmj, wm7, wn1);
            if (wmj.LJFF) {
                ((ArrayList) wmj.LJI).add(c82172WMu);
                return;
            } else {
                WMJ.LJ(c82172WMu);
                return;
            }
        }
        throw new IllegalStateException("Target scene is not find");
    }

    private void remove(WM7 wm7, WN1 wn1) {
        C1JI.LJII();
        WMJ wmj = this.mGroupSceneManager;
        wmj.LIZIZ(wm7);
        if (wmj.LJFF || wmj.LIZJ.LIZ(wm7) != null) {
            C82173WMv c82173WMv = new C82173WMv(wmj, wm7, wn1);
            if (wmj.LJFF) {
                ((ArrayList) wmj.LJI).add(c82173WMv);
                return;
            } else {
                WMJ.LJ(c82173WMv);
                return;
            }
        }
        throw new IllegalStateException("Target scene is not find");
    }

    private void show(WM7 wm7, WN1 wn1) {
        C1JI.LJII();
        WMJ wmj = this.mGroupSceneManager;
        wmj.LIZIZ(wm7);
        if (wmj.LJFF || wmj.LIZJ.LIZ(wm7) != null) {
            C82174WMw c82174WMw = new C82174WMw(wmj, wm7, wn1);
            if (wmj.LJFF) {
                ((ArrayList) wmj.LJI).add(c82174WMw);
                return;
            } else {
                WMJ.LJ(c82174WMw);
                return;
            }
        }
        throw new IllegalStateException("Target scene is not find");
    }

    public final <T extends WM7> T createOrReuse(String str, InterfaceC82168WMq<T> interfaceC82168WMq) {
        T t = (T) findSceneByTag(str);
        if (t == null) {
            return interfaceC82168WMq.call();
        }
        return t;
    }

    @Override // X.WM7
    public final void dispatchCreateView(Bundle bundle, ViewGroup viewGroup) {
        super.dispatchCreateView(bundle, viewGroup);
        View view = this.mView;
        if (view instanceof ViewGroup) {
            this.mGroupSceneManager.LIZIZ = (ViewGroup) view;
            replacePlaceHolderViewToTargetScene();
            dispatchChildrenState(WME.VIEW_CREATED);
            return;
        }
        throw new IllegalArgumentException("GroupScene onCreateView view must be ViewGroup");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public void dispatchOnPreSceneDestroyed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreScenePaused(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreSceneResumed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreSceneStarted(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreSceneStopped(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreSceneViewDestroyed(WM7 wm7, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
        this.mLifecycleCallbacks.add(new PIA<>(wmq, Boolean.valueOf(z)));
    }

    public final void hide(WM7 wm7, int i) {
        hide(wm7, buildAnimatorFactory(wm7, i));
    }

    public final void remove(WM7 wm7, int i) {
        remove(wm7, buildAnimatorFactory(wm7, i));
    }

    public final void show(WM7 wm7, int i) {
        show(wm7, buildAnimatorFactory(wm7, i));
    }

    public final void add(int i, WM7 wm7, String str) {
        addInstance(i, wm7, str, EMPTY_ANIMATION_FACTORY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.WM7
    public void dispatchOnPreSceneActivityCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreSceneCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
    public void dispatchOnPreSceneViewCreated(WM7 wm7, Bundle bundle, boolean z) {
        if (wm7 != this) {
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
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
            Iterator it = new ArrayList(this.mLifecycleCallbacks).iterator();
            while (it.hasNext()) {
                PIA pia = (PIA) it.next();
                if (z || ((Boolean) pia.LIZIZ).booleanValue()) {
                    ((WMQ) pia.LIZ).LJIILLIIL(wm7, bundle);
                }
            }
        }
        super.dispatchOnSceneViewCreated(wm7, bundle, z);
    }

    private void addInstance(int i, WM7 wm7, String str, WN1 wn1) {
        String valueOf;
        C1JI.LJII();
        if (!TextUtils.isEmpty(str)) {
            if (wm7 != this) {
                if (isAdded(wm7)) {
                    int i2 = this.mGroupSceneManager.LIZJ.LIZ(wm7).LJLIL;
                    if (i2 == i) {
                        String str2 = this.mGroupSceneManager.LIZJ.LIZ(wm7).LJLJI;
                        if (!str2.equals(str)) {
                            throw new IllegalArgumentException(i0.LJFF("Scene is already added, tag ", str2));
                        }
                    } else {
                        try {
                            valueOf = getResources().getResourceName(i2);
                        } catch (Resources.NotFoundException unused) {
                            valueOf = String.valueOf(i2);
                        }
                        throw new IllegalArgumentException("Scene is already added to another container, viewId " + valueOf);
                    }
                } else {
                    WM7 findSceneByTag = findSceneByTag(str);
                    if (findSceneByTag != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("already have a Scene ");
                        LIZ.append(findSceneByTag.toString());
                        LIZ.append(" with tag ");
                        LIZ.append(str);
                        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
                    }
                }
                WM7 wm72 = wm7.mParentScene;
                if (wm72 == null || wm72 == this) {
                    if (!isSupportRestore() || !wm7.mSceneRestoreEnabled || C65531Pnj.LIZJ(wm7)) {
                        WMJ wmj = this.mGroupSceneManager;
                        wmj.LIZIZ(wm7);
                        C82171WMt c82171WMt = new C82171WMt(wmj, i, wm7, str, wn1);
                        if (wmj.LJFF) {
                            ((ArrayList) wmj.LJI).add(c82171WMt);
                            return;
                        } else {
                            WMJ.LJ(c82171WMt);
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Scene " + wm7.getClass().getName() + " must be a public class or public static class, and have only one parameterless constructor to be properly recreated from instance state.");
                }
                throw new IllegalArgumentException("Scene already has a parent, parent " + wm7.mParentScene);
            }
            throw new IllegalArgumentException("GroupScene can't be added to itself");
        }
        throw new IllegalArgumentException("tag can't be empty");
    }

    public final void add(int i, WM7 wm7, String str, int i2) {
        addInstance(i, wm7, str, buildAnimatorFactory(wm7, i2));
    }
}
