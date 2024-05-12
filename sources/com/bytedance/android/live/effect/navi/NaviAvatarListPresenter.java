package com.bytedance.android.live.effect.navi;

import X.AbstractC73672Svk;
import X.C0NB;
import X.C113554cx;
import X.C18420nu;
import X.C18440nw;
import X.C1EW;
import X.C20000qS;
import X.C221108m2;
import X.C23120vU;
import X.C29306Beo;
import X.C30686C2o;
import X.C38991fz;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73969T1h;
import X.InterfaceC08020Te;
import X.InterfaceC30516ByK;
import X.InterfaceC64592gB;
import X.InterfaceC86003Zc;
import X.OSZ;
import X.T16;
import X.X1D;
import Y.IDObserverS225S0100000;
import Y.IDfS292S0100000;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeature;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeatureInfo;
import com.bytedance.android.live.effect.navi.ui.LiveNaviSkinToneContainerDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class NaviAvatarListPresenter implements GenericLifecycleObserver, InterfaceC30516ByK {
    public final DataChannel LJLIL;
    public final Fragment LJLILLLLZI;
    public final InterfaceC08020Te LJLJI;
    public C23120vU LJLJJI;
    public final NaviAvatarListViewModel LJLJJL;
    public C18440nw LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public String LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public C20000qS LJLLLL;
    public LiveNaviSkinToneContainerDialog LJLLLLLL;
    public boolean LJLZ;
    public final C62822Ol8 LJZ;

    public final void LIZIZ() {
        C18420nu.LJFF = true;
        C23120vU c23120vU = this.LJLJJI;
        if (c23120vU != null) {
            c23120vU.setSelectedIndex(C18420nu.LIZJ);
        }
        C23120vU c23120vU2 = this.LJLJJI;
        if (c23120vU2 != null) {
            c23120vU2.getNaviAdapter().LJLZ(C18420nu.LIZJ);
        }
        LIZ(C18420nu.LIZJ);
    }

    public final void LJ() {
        String unzipPath;
        this.LJLLL = false;
        this.LJLLLL = null;
        Effect value = this.LJLJJL.LJLJJI.getValue();
        if (value != null && (unzipPath = value.getUnzipPath()) != null) {
            this.LJLJI.LIZIZ(unzipPath);
            C0NB.LJ("auto_creation", "remove auto creation effect");
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LJLLJ = false;
        if (this.LJLJLJ) {
            this.LJLJJL.gv0();
            this.LJLJLJ = false;
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LJLLJ = true;
        this.LJLJLLL = false;
    }

    public final void LIZLLL() {
        String unzipPath;
        Effect value = this.LJLJJL.LJLJI.getValue();
        if (value != null && (unzipPath = value.getUnzipPath()) != null) {
            this.LJLLI = unzipPath;
        }
        if (this.LJLJL && C29306Beo.LJIJJLI(this.LJLLI)) {
            C0NB.LJ("LiveNaviAvatar", "send head_prefab message");
            this.LJLJI.LJJIJL(66668, 1L, 0L, this.LJLLI);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not send message, head_prefab isEntryPointMsgReceived: ");
        LIZ.append(this.LJLJL);
        LIZ.append(", headEffectUnzipPath: ");
        C1EW.LIZLLL(LIZ, this.LJLLI, LIZ, "LiveNaviAvatar");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C18440nw c18440nw = this.LJLJJLL;
        if (c18440nw != null) {
            c18440nw.LIZJ();
        }
        this.LJLJJLL = null;
        this.LJLILLLLZI.getLifecycle().removeObserver(this);
        this.LJLJI.LIZ(this);
    }

    public final void LIZ(int i) {
        List<C20000qS> value = this.LJLJJL.LJLILLLLZI.getValue();
        if (value != null && (!value.isEmpty())) {
            C20000qS c20000qS = (C20000qS) ListProtector.get(value, i);
            boolean LJ = o.LJ(c20000qS, C18420nu.LIZ);
            LIZJ(c20000qS);
            C18420nu.LIZJ = i;
            if (!LJ) {
                this.LJLJI.LJ(this.LJLIL);
            }
        }
    }

    public final void LIZJ(C20000qS navi) {
        ProfileNaviFeatureInfo profileNaviFeatureInfo;
        InterfaceC08020Te interfaceC08020Te = this.LJLJI;
        Map<String, String> value = this.LJLJJL.LJLJJL.getValue();
        if (value == null) {
            value = C113554cx.LJJJLIIL();
        }
        final C18440nw c18440nw = new C18440nw(interfaceC08020Te, value);
        final IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(this, c18440nw, 11);
        o.LJIIIZ(navi, "navi");
        if (c18440nw.LIZLLL != null) {
            C0NB.LJ("LiveNaviAvatar", "NaviEffectLoader load() method can only be called once. ");
            return;
        }
        if (c18440nw.LJ) {
            return;
        }
        C18420nu.LIZ = navi;
        c18440nw.LIZLLL = navi;
        Map<C20000qS, OSZ<List<ProfileNaviFeatureInfo>, List<Effect>>> map = C18420nu.LIZIZ;
        if (map.containsKey(navi)) {
            OSZ osz = (OSZ) ((LinkedHashMap) map).get(navi);
            if (osz == null) {
                return;
            }
            iDqS172S0200000.invoke(Boolean.TRUE);
            c18440nw.LIZ((List) osz.getFirst(), (List) osz.getSecond());
            return;
        }
        List<ProfileNaviFeature> list = navi.LIZJ;
        if (list == null || list.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Iterator<ProfileNaviFeature> it = list.iterator();
        while (it.hasNext()) {
            try {
                profileNaviFeatureInfo = (ProfileNaviFeatureInfo) c18440nw.LIZJ.LJI(it.next().getInfo(), ProfileNaviFeatureInfo.class);
                String effectId = profileNaviFeatureInfo.getEffectId();
                if (effectId == null || effectId.length() == 0) {
                    profileNaviFeatureInfo.setEffectId(c18440nw.LIZIZ.get(profileNaviFeatureInfo.getStickerId()));
                }
            } catch (Exception e) {
                C0NB.LJI("LiveNaviAvatar", e);
                profileNaviFeatureInfo = new ProfileNaviFeatureInfo(null, null, null, null, null, null, 63, null);
            }
            arrayList.add(profileNaviFeatureInfo);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String effectId2 = ((ProfileNaviFeatureInfo) it2.next()).getEffectId();
            if (effectId2 != null) {
                arrayList2.add(effectId2);
            }
        }
        final ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (((String) next).length() > 0) {
                arrayList3.add(next);
            }
        }
        if (arrayList3.isEmpty()) {
            iDqS172S0200000.invoke(Boolean.FALSE);
            C0NB.LJ("LiveNaviAvatar", "effectIds is empty, just return");
        } else {
            c18440nw.LJFF = (C73411SrX) AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1XK
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [X.1nB] */
                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9<List<Effect>> interfaceC73573Su9) {
                    final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                    C1KJ.LIZ.LJIIJJI(arrayList3, true, null, new IFetchEffectListListener() { // from class: X.1nB
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
                        public final void onFail(ExceptionResult e2) {
                            o.LJIIIZ(e2, "e");
                            if (c73433Srt.isDisposed()) {
                                return;
                            }
                            c73433Srt.onError(e2.getException());
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(List<Effect> list2) {
                            if (c73433Srt.isDisposed()) {
                                return;
                            }
                            InterfaceC73573Su9<List<Effect>> interfaceC73573Su92 = c73433Srt;
                            if (list2 == null) {
                                list2 = C61878OQg.INSTANCE;
                            }
                            interfaceC73573Su92.onNext(list2);
                        }
                    });
                }
            }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB() { // from class: X.1XJ
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    List<? extends Effect> it4 = (List) obj;
                    InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = iDqS172S0200000;
                    if (interfaceC88472Yns != null) {
                        interfaceC88472Yns.invoke(Boolean.TRUE);
                    }
                    C18440nw c18440nw2 = c18440nw;
                    List<ProfileNaviFeatureInfo> list2 = arrayList;
                    o.LJIIIIZZ(it4, "it");
                    c18440nw2.LIZ(list2, it4);
                }
            }, new IDfS292S0100000(iDqS172S0200000, 37));
        }
    }

    public NaviAvatarListPresenter(DataChannel dataChannel, Fragment fragment, InterfaceC08020Te effectWrapper) {
        o.LJIIIZ(effectWrapper, "effectWrapper");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = fragment;
        this.LJLJI = effectWrapper;
        NaviAvatarListViewModel naviAvatarListViewModel = (NaviAvatarListViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(null, null)).get(NaviAvatarListViewModel.class);
        this.LJLJJL = naviAvatarListViewModel;
        this.LJLL = -1;
        this.LJLLI = "";
        this.LJZ = C221108m2.LIZIZ(new IDqS420S0100000(this, 54));
        fragment.getLifecycle().addObserver(this);
        effectWrapper.LIZLLL(this);
        naviAvatarListViewModel.LJLILLLLZI.observe(fragment, new IDObserverS225S0100000(this, 0));
        naviAvatarListViewModel.LJLJI.observe(fragment, new IDObserverS225S0100000(this, 1));
        naviAvatarListViewModel.LJLJJI.observe(fragment, new IDObserverS225S0100000(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x018c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L41;
     */
    @Override // X.InterfaceC30516ByK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(int r22, int r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.navi.NaviAvatarListPresenter.onMessageReceived(int, int, int, java.lang.String):void");
    }
}
