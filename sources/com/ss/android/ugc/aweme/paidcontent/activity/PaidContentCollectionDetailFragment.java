package com.ss.android.ugc.aweme.paidcontent.activity;

import X.A3N;
import X.A3P;
import X.A3V;
import X.A3Z;
import X.A4S;
import X.ActivityC45651qj;
import X.C10A;
import X.C12460eI;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C223338pd;
import X.C25589A2n;
import X.C25590A2o;
import X.C25594A2s;
import X.C25605A3d;
import X.C25606A3e;
import X.C29S;
import X.C3C5;
import X.C55230Lly;
import X.C55247LmF;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.EnumC254469yk;
import X.EnumC25627A3z;
import X.FMX;
import X.InterfaceC18010nF;
import X.InterfaceC61213O0r;
import X.TBT;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.ss.android.ugc.aweme.paidseries.consumer.fragment.PaidSeriesShopPanelFragment;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class PaidContentCollectionDetailFragment extends BaseFragment implements InterfaceC18010nF {
    public static final /* synthetic */ int LJLLJ = 0;
    public long LJLILLLLZI;
    public long LJLJI;
    public boolean LJLJJL;
    public long LJLL;
    public final C214378bB LJLLI;
    public final Map<Integer, View> LJLLILLLL = new LinkedHashMap();
    public String LJLIL = "";
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 526));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 527));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C25606A3e.LJLIL);
    public final MutableLiveData<A3N> LJLJLJ = new MutableLiveData<>();
    public final MutableLiveData<A3P> LJLJLLL = new MutableLiveData<>();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLILLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLILLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC18010nF
    public final Map<String, String> x3() {
        return null;
    }

    public PaidContentCollectionDetailFragment() {
        AqS60S0110000_3 LJJ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 528);
        C65776Prg LIZ = C65352Pkq.LIZ(PaidContentDetailVideoListViewModel.class);
        C25605A3d c25605A3d = C25605A3d.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLLI = new C214378bB(LIZ, aqS154S0100000_4, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c25605A3d, LJJ, C78926UyI.LJIILLIIL(this, true));
    }

    @Override // X.InterfaceC18010nF
    public String getBtmPageCode() {
        return EnumC254469yk.SERIES_DETAIL.getPageCode();
    }

    @Override // X.InterfaceC18010nF
    public final String LLZIL() {
        return String.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Intent intent;
        super.onDestroy();
        long currentTimeMillis = System.currentTimeMillis() - this.LJLL;
        CollectionDetailModel LIZ = ((A3V) ((AssemViewModel) this.LJLLI.getValue()).getState()).LJLILLLLZI.LIZ();
        if (LIZ != null) {
            String str = this.LJLIL;
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                intent = mo49getActivity.getIntent();
            } else {
                intent = null;
            }
            String sessionId = (String) this.LJLJL.getValue();
            o.LJIIIZ(sessionId, "sessionId");
            boolean LIZ2 = C25590A2o.LIZ(intent);
            C188727au c188727au = new C188727au();
            c188727au.LJI("enter_from", str);
            C25589A2n.LJ(c188727au, LIZ);
            C25589A2n.LIZ(c188727au, LIZ);
            C25589A2n.LJI(c188727au, LIZ);
            c188727au.LJ(LIZ.getCollectionSalesNum(), "collection_sold_cnt");
            C25589A2n.LJII(c188727au, LIZ2);
            C25589A2n.LJIIIZ(c188727au, LIZ.getHasPurchasedCollection());
            c188727au.LJ(currentTimeMillis, "staytime_duration");
            c188727au.LJI("session_id", sessionId);
            FMX.LJIIL("collection_detail_page_staytime", c188727au.LIZ);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        if (!this.LJLJJL && ((Boolean) this.LJLJJLL.getValue()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((C223338pd) _$_findCachedViewById(R.id.lud)).setVisibility(0);
            ((C223338pd) _$_findCachedViewById(R.id.lud)).LIZIZ();
            _$_findCachedViewById(R.id.bs8).setVisibility(8);
        } else {
            ((C223338pd) _$_findCachedViewById(R.id.lud)).setVisibility(8);
            ((C223338pd) _$_findCachedViewById(R.id.lud)).LIZJ();
            _$_findCachedViewById(R.id.bs8).setVisibility(0);
        }
        C12460eI.LJIIIIZZ(this, null);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        long j;
        long j2;
        Bundle arguments;
        Serializable serializable;
        boolean z;
        int i;
        String str2;
        Intent intent;
        String str3;
        String str4;
        String str5;
        Intent intent2;
        Intent intent3;
        Intent intent4;
        Intent intent5;
        Intent intent6;
        Intent intent7;
        Intent intent8;
        fragmentConfiguration(A3Z.LJLIL);
        super.onCreate(bundle);
        this.LJLL = System.currentTimeMillis();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null || (intent8 = mo49getActivity.getIntent()) == null || (str = C16880lQ.LLJJIJIIJIL(intent8, "enter_from")) == null) {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                str = arguments2.getString("enter_from");
            } else {
                str = null;
            }
        }
        this.LJLIL = str;
        Bundle arguments3 = getArguments();
        long j3 = 0;
        if (arguments3 != null) {
            j = arguments3.getLong("collection_id");
        } else {
            j = 0;
        }
        ActivityC45651qj mo49getActivity2 = mo49getActivity();
        if (mo49getActivity2 != null && (intent7 = mo49getActivity2.getIntent()) != null) {
            j2 = intent7.getLongExtra("collection_id", j);
        } else {
            j2 = 0;
        }
        this.LJLILLLLZI = j2;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            j3 = arguments4.getLong("room_id", 0L);
        }
        this.LJLJI = j3;
        ActivityC45651qj mo49getActivity3 = mo49getActivity();
        if ((mo49getActivity3 == null || (intent6 = mo49getActivity3.getIntent()) == null || (serializable = intent6.getSerializableExtra("entry_source")) == null) && ((arguments = getArguments()) == null || (serializable = arguments.getSerializable("entry_source")) == null)) {
            serializable = EnumC25627A3z.UNKNOWN;
        }
        o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.model.OrderEntrySource");
        EnumC25627A3z enumC25627A3z = (EnumC25627A3z) serializable;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            z = arguments5.getBoolean("hide_back_button", false);
        } else {
            z = false;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            i = arguments6.getInt("purchase_button_text", R.string.qmy);
        } else {
            i = R.string.qmy;
        }
        long j4 = this.LJLILLLLZI;
        ActivityC45651qj mo49getActivity4 = mo49getActivity();
        if (mo49getActivity4 == null || (intent5 = mo49getActivity4.getIntent()) == null || (str2 = C16880lQ.LLJJIJIIJIL(intent5, "enter_from")) == null) {
            str2 = "";
        }
        ActivityC45651qj mo49getActivity5 = mo49getActivity();
        if (mo49getActivity5 != null) {
            intent = mo49getActivity5.getIntent();
        } else {
            intent = null;
        }
        String str6 = (String) this.LJLJJI.getValue();
        String str7 = (String) this.LJLJL.getValue();
        long j5 = this.LJLJI;
        MutableLiveData<A3N> mutableLiveData = this.LJLJLJ;
        MutableLiveData<A3P> mutableLiveData2 = this.LJLJLLL;
        ActivityC45651qj mo49getActivity6 = mo49getActivity();
        if (mo49getActivity6 != null && (intent4 = mo49getActivity6.getIntent()) != null) {
            str3 = C16880lQ.LLJJIJIIJIL(intent4, "anchor_id");
        } else {
            str3 = null;
        }
        ActivityC45651qj mo49getActivity7 = mo49getActivity();
        if (mo49getActivity7 != null && (intent3 = mo49getActivity7.getIntent()) != null) {
            str4 = C16880lQ.LLJJIJIIJIL(intent3, "anchor_video_id");
        } else {
            str4 = null;
        }
        ActivityC45651qj mo49getActivity8 = mo49getActivity();
        if (mo49getActivity8 != null && (intent2 = mo49getActivity8.getIntent()) != null) {
            str5 = C16880lQ.LLJJIJIIJIL(intent2, "anchor_group_id");
        } else {
            str5 = null;
        }
        C25594A2s c25594A2s = new C25594A2s(j4, str2, enumC25627A3z, intent, str6, str7, j5, z, i, mutableLiveData, mutableLiveData2, str3, str4, str5);
        C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), c25594A2s, C25594A2s.class, "source_default_key");
        C8VV.LIZ(this, false, new AqS135S0200000_4(this, c25594A2s, 72));
        A4S.LJIIIIZZ(this.LJLILLLLZI);
    }

    public final void vl(PaidSeriesShopPanelFragment paidSeriesShopPanelFragment) {
        this.LJLJLJ.postValue(paidSeriesShopPanelFragment);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLI.getValue(), new TBT() { // from class: X.A3Y
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((A3V) obj).LJLILLLLZI;
            }
        }, null, null, null, new AqS170S0100000_4(this, 470), 14, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aip, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
