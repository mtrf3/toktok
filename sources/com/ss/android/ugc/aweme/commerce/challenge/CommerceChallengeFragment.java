package com.ss.android.ugc.aweme.commerce.challenge;

import X.ActivityC45651qj;
import X.C0A2;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C29S;
import X.C3C5;
import X.C56642Ke;
import X.C59146NJe;
import X.C59232NMm;
import X.C59675NbT;
import X.C68312mB;
import X.C69372nt;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC59677NbV;
import X.QD3;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.T6F;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class CommerceChallengeFragment extends AmeBaseFragment implements T6F, InterfaceC59677NbV {
    public String LJLJI;
    public String LJLJJI;
    public C59146NJe LJLJJL;
    public String LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final Rect LJLIL = new Rect();
    public boolean LJLILLLLZI = true;

    @Override // X.T6F
    public final /* synthetic */ void J4(boolean z, boolean z2) {
    }

    @Override // X.T6F
    public final void Oi() {
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJL;
        Integer valueOf = Integer.valueOf(R.id.isn);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(R.id.isn)) == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    @Override // X.T6F
    public final /* synthetic */ void ai(boolean z) {
    }

    @Override // X.T6F
    public final void refresh() {
        this.LJLILLLLZI = false;
        String str = this.LJLJJLL;
        if (str != null) {
            C69372nt LIZ = C68312mB.LIZ(str);
            String str2 = this.LJLJI;
            if (str2 == null) {
                str2 = "";
            }
            LIZ.LIZ("challenge_id", str2);
            String uri = LIZ.LIZIZ().toString();
            o.LJIIIIZZ(uri, "parseRnSchema(it)\n      …      .build().toString()");
            C59146NJe c59146NJe = this.LJLJJL;
            if (c59146NJe != null) {
                c59146NJe.LJLILLLLZI = uri;
                c59146NJe.notifyDataSetChanged();
            }
        }
    }

    @Override // X.InterfaceC59677NbV
    public final String getTitle() {
        String str = this.LJLJJI;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final C59232NMm vl() {
        C59146NJe c59146NJe = this.LJLJJL;
        if (c59146NJe != null) {
            return c59146NJe.LJLJJL;
        }
        return null;
    }

    @Override // X.T6F, X.OGG
    public final View LJIJJ() {
        View recycler_view = _$_findCachedViewById(R.id.isn);
        o.LJIIIIZZ(recycler_view, "recycler_view");
        return recycler_view;
    }

    @Override // X.T6F
    public final void LL() {
        C0A2 layoutManager;
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.LJZL(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C0A2 layoutManager;
        C59232NMm c59232NMm;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        super.onDestroyView();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int LJJJI = layoutManager.LJJJI();
            for (int i = 0; i < LJJJI; i++) {
                View LJJIJIL = layoutManager.LJJIJIL(i);
                if ((LJJIJIL instanceof C59232NMm) && (c59232NMm = (C59232NMm) LJJIJIL) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c59232NMm.LJLIL) != null) {
                    SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS);
                }
            }
        }
        EventBus.LIZJ().LJIJ(this);
    }

    public final void wl() {
        C59232NMm vl;
        C59232NMm vl2 = vl();
        if (vl2 != null && vl2.getGlobalVisibleRect(this.LJLIL) && (vl = vl()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C17N.LJJJJI(this.LJLIL.height()));
            vl.LIZIZ("brand_room_show", jSONObject);
        }
    }

    @Override // X.T6F
    public final boolean lh() {
        return this.LJLILLLLZI;
    }

    @Override // X.T6F
    public final void N1(String str) {
        this.LJLJI = str;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onJsBroadcast(C56642Ke broadCastEvent) {
        boolean z;
        C59232NMm vl;
        C59232NMm vl2;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        C59232NMm vl3 = vl();
        String str = null;
        if (vl3 != null) {
            str = vl3.getContainerId();
        }
        if (o.LJ(str, JSONObjectProtectorUtils.getString(broadCastEvent.LJLIL, "reactId")) && (vl2 = vl()) != null && vl2.getGlobalVisibleRect(this.LJLIL)) {
            z = true;
        } else {
            z = false;
        }
        String string = JSONObjectProtectorUtils.getString(broadCastEvent.LJLIL, "eventName");
        if (string != null && o.LJ(string, "brand_room_loaded") && z && (vl = vl()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C17N.LJJJJI(this.LJLIL.height()));
            vl.LIZIZ("brand_room_show", jSONObject);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void top(C56642Ke event) {
        boolean z;
        String LJJIFFI;
        j LJJIJ;
        String str;
        o.LJIIIZ(event, "event");
        m LJIIZILJ = GsonProtectorUtils.parse(new com.google.gson.o(), event.LJLIL.toString()).LJIIZILJ();
        j LJJIJ2 = LJIIZILJ.LJJIJ("data");
        if (LJJIJ2 == null || (LJJIJ2 instanceof l) || (LJJIJ = LJJIJ2.LJIIZILJ().LJJIJ("reactId")) == null || (LJJIJ instanceof l)) {
            z = false;
        } else {
            String LJJIFFI2 = LJJIJ.LJJIFFI();
            C59232NMm vl = vl();
            if (vl == null || (str = vl.getContainerId()) == null) {
                str = "";
            }
            z = o.LJ(LJJIFFI2, str);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            j LJJIJ3 = LJIIZILJ.LJJIJ("eventName");
            if (LJJIJ3 != null && (LJJIFFI = LJJIJ3.LJJIFFI()) != null) {
                if (o.LJ(LJJIFFI, "mp_tab_top_arrived") || o.LJ(LJJIFFI, "mp_tab_top_left")) {
                    if (o.LJ(LJJIFFI, "mp_tab_top_arrived")) {
                        ((C59675NbT) _$_findCachedViewById(R.id.isn)).getEnterTabManager().LIZ = true;
                    } else {
                        if (!o.LJ(LJJIFFI, "mp_tab_top_left")) {
                            return;
                        }
                        ((C59675NbT) _$_findCachedViewById(R.id.isn)).getEnterTabManager().LIZ = false;
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
        mo49getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment$onViewCreated$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIJJLI() {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
            public final boolean LJIL() {
                return false;
            }
        });
        this.LJLJJL = new C59146NJe(this);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setAdapter(this.LJLJJL);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        EventBus.LIZJ().LJIILJJIL(this);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        o.LJI(mo49getActivity);
        C29S c29s = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.awg, C16880lQ.LLZIL(mo49getActivity), null);
        if (!(LLLZIIL instanceof View)) {
            LLLZIIL = null;
        }
        if (LLLZIIL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLZIIL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLZIIL, this);
                C10A.LIZIZ(LLLZIIL, this);
                ActivityC45651qj mo49getActivity2 = mo49getActivity();
                if (mo49getActivity2 instanceof C29S) {
                    c29s = (C29S) mo49getActivity2;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLZIIL;
    }
}
