package com.bytedance.android.live.effect.navi;

import X.AbstractC73672Svk;
import X.C0LF;
import X.C0WN;
import X.C1H8;
import X.C20000qS;
import X.C21220sQ;
import X.C73969T1h;
import X.InterfaceC64592gB;
import X.InterfaceC86003Zc;
import X.RTU;
import X.T16;
import Y.IDfS292S0100000;
import Y.IDhS93S0100000;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.live.effect.navi.model.ProfileNaviCandidate;
import com.bytedance.android.live.effect.navi.model.ProfileNaviCandidatesResponse;
import com.bytedance.android.live.effect.navi.model.ProfileNaviCustom;
import com.bytedance.android.live.effect.navi.model.ProfileNaviListResponse;
import com.bytedance.android.live.effect.navi.service.NaviAvatarApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNaviPrefabEffectNameSetting;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class NaviAvatarListViewModel extends ViewModel {
    public final C21220sQ LJLIL;
    public final MutableLiveData<List<C20000qS>> LJLILLLLZI = new MutableLiveData<>();
    public final MutableLiveData<Effect> LJLJI = new MutableLiveData<>();
    public final MutableLiveData<Effect> LJLJJI = new MutableLiveData<>();
    public final MutableLiveData<Map<String, String>> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<List<Effect>> LJLJJLL = new MutableLiveData<>();
    public final C1H8 LJLJL = new C0WN() { // from class: X.1H8
        @Override // X.C0WN
        public final void LJFF(int i, Effect effect) {
        }

        @Override // X.C0WN
        public final void onStart(Effect effect) {
        }

        @Override // X.C0WN
        public final void LJI(Effect effect) {
            String str;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Cannot download navi effect, effectname: ");
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            LIZ.append(str);
            C0NB.LJFF("LiveNaviAvatar", "download navi effect error", new Exception(X1D.LIZIZ(LIZ)));
            if (effect != null) {
                NaviAvatarListViewModel.this.hv0(new C0LF(effect, effect.getName()));
            }
        }

        @Override // X.C0WN
        public final void onSuccess(Effect effect) {
            String str;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("download navi effect success, effectname: ");
            if (effect != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            JBR.LJIIJ(LIZ, str, LIZ, "LiveNaviAvatar");
            if (effect != null) {
                NaviAvatarListViewModel.this.hv0(new C0LF(effect, effect.getName()));
            }
        }
    };

    public final void gv0() {
        AbstractC73672Svk LJIIJ;
        final C21220sQ c21220sQ = this.LJLIL;
        if (((ArrayList) c21220sQ.LIZIZ).isEmpty()) {
            NaviAvatarApi naviAvatarApi = (NaviAvatarApi) c21220sQ.LIZ.getValue();
            if (naviAvatarApi == null || (LJIIJ = AbstractC73672Svk.LJJLL(naviAvatarApi.getNaviList(0, 20), naviAvatarApi.getCandidateList(true, 3), new RTU() { // from class: X.1Z2
                @Override // X.RTU
                public final Object apply(Object obj, Object obj2) {
                    ProfileNaviListResponse naviListResponse = (ProfileNaviListResponse) obj;
                    ProfileNaviCandidatesResponse candidateListResponse = (ProfileNaviCandidatesResponse) obj2;
                    o.LJIIIZ(naviListResponse, "naviListResponse");
                    o.LJIIIZ(candidateListResponse, "candidateListResponse");
                    ArrayList arrayList = new ArrayList();
                    C21220sQ c21220sQ2 = C21220sQ.this;
                    List list = naviListResponse.naviList;
                    if (list == null) {
                        list = C61878OQg.INSTANCE;
                    }
                    ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((ProfileNaviCustom) it.next()).transformToProfileNavi());
                    }
                    arrayList.addAll(arrayList2);
                    List list2 = candidateListResponse.initialNavis;
                    if (list2 == null) {
                        list2 = C61878OQg.INSTANCE;
                    }
                    ArrayList arrayList3 = new ArrayList(C32I.LJJL(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((ProfileNaviCandidate) it2.next()).transformCandidateNavi());
                    }
                    ((ArrayList) c21220sQ2.LIZIZ).clear();
                    ((ArrayList) c21220sQ2.LIZIZ).addAll(arrayList3);
                    arrayList.addAll(arrayList3);
                    return arrayList;
                }
            })) == null) {
                LJIIJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1Z3
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<List<C20000qS>> interfaceC73573Su9) {
                        new ArrayList();
                    }
                });
            }
        } else {
            NaviAvatarApi naviAvatarApi2 = (NaviAvatarApi) c21220sQ.LIZ.getValue();
            if (naviAvatarApi2 == null || (LJIIJ = naviAvatarApi2.getNaviList(0, 20).LJJIJL(new IDhS93S0100000(c21220sQ, 3))) == null) {
                LJIIJ = AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.1Z4
                    @Override // X.InterfaceC86003Zc
                    public final void subscribe(InterfaceC73573Su9<List<C20000qS>> interfaceC73573Su9) {
                        new ArrayList();
                    }
                });
            }
        }
        LJIIJ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new IDfS292S0100000(this, 36), new InterfaceC64592gB() { // from class: X.1XI
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                C0NB.LJFF("LiveNaviAvatar", "error fetching live avatars", (Throwable) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.1H8] */
    public NaviAvatarListViewModel(C21220sQ c21220sQ) {
        this.LJLIL = c21220sQ;
    }

    public final void hv0(C0LF c0lf) {
        String str = c0lf.LIZ;
        if (o.LJ(str, LiveNaviPrefabEffectNameSetting.INSTANCE.getValue())) {
            this.LJLJI.setValue(c0lf.LIZIZ);
        } else {
            if (!o.LJ(str, "creation_plugin")) {
                return;
            }
            this.LJLJJI.setValue(c0lf.LIZIZ);
        }
    }
}
