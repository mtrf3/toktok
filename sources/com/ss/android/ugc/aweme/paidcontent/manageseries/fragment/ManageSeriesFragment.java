package com.ss.android.ugc.aweme.paidcontent.manageseries.fragment;

import X.A0T;
import X.A0V;
import X.A15;
import X.A16;
import X.A1B;
import X.A1E;
import X.A1G;
import X.A1H;
import X.A1I;
import X.A1J;
import X.A1K;
import X.A1L;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C25524A0a;
import X.C25527A0d;
import X.C29S;
import X.C3C5;
import X.C43694HCw;
import X.C45631qh;
import X.C55230Lly;
import X.C55247LmF;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C76800UCe;
import X.C78926UyI;
import X.C8VV;
import X.C90903hW;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.ORZ;
import X.OSZ;
import X.QD3;
import X.TBT;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesNotificationViewModel;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS0S2010000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1000000_4;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

@InterfaceC61213O0r
/* loaded from: classes5.dex */
public final class ManageSeriesFragment extends BaseFragment {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C214298b3 LJLJLJ;
    public final C214298b3 LJLJLLL;
    public C73305Spp LJLL;
    public C45631qh LJLLI;
    public boolean LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public C25524A0a LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
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

    public ManageSeriesFragment() {
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLIL = routeArgExtension.optionalArg(this, A1H.LJLIL, "collection_id", String.class);
        this.LJLILLLLZI = routeArgExtension.optionalArg(this, A1I.LJLIL, "enter_from", String.class);
        this.LJLJI = routeArgExtension.optionalArg(this, A1K.LJLIL, "entry_point", String.class);
        this.LJLJJI = routeArgExtension.optionalArg(this, A1L.LJLIL, "is_new_collection", Boolean.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, A1J.LJLIL, "enter_manage_from", String.class);
        this.LJLJJLL = routeArgExtension.optionalArgNotNull(this, A1E.LJLIL, "should_show_back_button", Boolean.class);
        this.LJLJL = C221108m2.LIZIZ(A1G.LJLIL);
        C65776Prg LIZ = C65352Pkq.LIZ(ManageSeriesViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 591);
        A1B a1b = A1B.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJLJ = new C214298b3(LIZ, aqS154S0100000_4, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, a1b, (InterfaceC65784Pro) null, 384);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ManageSeriesNotificationViewModel.class);
        this.LJLJLLL = new C214298b3(LIZ2, new AqS154S0100000_4(LIZ2, 592), c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C25527A0d.INSTANCE, (InterfaceC65784Pro) null, 384);
        this.LJLLILLLL = true;
        this.LJLLJ = C221108m2.LIZIZ(A0T.LJLIL);
    }

    public final C25524A0a vl() {
        C25524A0a c25524A0a = this.LJLLL;
        if (c25524A0a != null) {
            return c25524A0a;
        }
        o.LJIJI("hierarchyData");
        throw null;
    }

    public final ManageSeriesViewModel wl() {
        return (ManageSeriesViewModel) this.LJLJLJ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        wl().gv0(this.LJLLILLLL, null);
        if (this.LJLLILLLL) {
            this.LJLLILLLL = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        ManageSeriesViewModel wl = wl();
        List<PublishModel> allPublishModel = wl.LJLILLLLZI.getAllPublishModel();
        ArrayList LIZIZ = s1.LIZIZ(allPublishModel, "publishService.allPublishModel");
        for (PublishModel publishModel : allPublishModel) {
            if (o.LJ(wl.LJLILLLLZI.getPaidContentVideoModel(publishModel).getCollectionId(), wl.getState().LJLIL)) {
                String str = publishModel.creationId;
                String videoTitle = wl.LJLILLLLZI.getVideoTitle(publishModel);
                o.LJIIIIZZ(videoTitle, "publishService.getVideoTitle(it)");
                LIZIZ.add(new OSZ(new A15(str, videoTitle, (String) ORZ.LJLLLL(publishModel.videoCoverPaths)), A16.UPLOADING));
            }
        }
        wl.setState(new AqS170S0100000_4(C113554cx.LJJLIIIJLJLI(LIZIZ), (Map<Integer, String>) 1457));
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        String str;
        boolean z2;
        super.onCreate(bundle);
        String str2 = (String) this.LJLIL.getValue();
        String str3 = (String) this.LJLILLLLZI.getValue();
        String str4 = (String) this.LJLJI.getValue();
        if (str4 == null || str4.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (!z ? (str = (String) this.LJLJI.getValue()) == null : (str = (String) this.LJLJJL.getValue()) == null) {
            str = "";
        }
        this.LJLLL = new C25524A0a((Boolean) this.LJLJJI.getValue(), str2, str3, str, ((Boolean) this.LJLJJLL.getValue()).booleanValue());
        ManageSeriesViewModel wl = wl();
        String str6 = (String) this.LJLIL.getValue();
        wl.getClass();
        wl.setState(new AqS29S1000000_4(str6, 42));
        AssemViewModel value = this.LJLJLLL.getValue();
        String str7 = (String) this.LJLILLLLZI.getValue();
        if (str7 != null) {
            str5 = str7;
        }
        String entryPoint = vl().LJLJI;
        Boolean bool = (Boolean) this.LJLJJI.getValue();
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        o.LJIIIZ(entryPoint, "entryPoint");
        value.setState(new AqS0S2010000_4(str5, entryPoint, z2, 2));
        C55247LmF.LIZIZ(C55230Lly.LIZJ(this, null), vl(), C25524A0a.class, "source_default_key");
        C8VV.LIZ(this, false, new AqS170S0100000_4(this, 498));
        wl().asyncSubscribe(new TBT() { // from class: X.A0U
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C25532A0i) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS170S0100000_4(this, 499), new AqS154S0100000_4(this, 590), new AqS170S0100000_4(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT));
    }

    @QD3(sticky = true)
    public final void onPublishStatusUpdate(C43694HCw event) {
        String str;
        o.LJIIIZ(event, "event");
        ManageSeriesViewModel wl = wl();
        wl.getClass();
        Map<A15, A16> map = wl.getState().LJLL;
        int i = event.LJLIL;
        A15 a15 = null;
        if (i != 2) {
            if (i != 12 && i != 9) {
                if (i != 10) {
                    return;
                }
                Iterator<A15> it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    A15 next = it.next();
                    String str2 = next.LIZ;
                    CreateBaseAwemeResponse createBaseAwemeResponse = event.LJLJLJ;
                    if (createBaseAwemeResponse != null) {
                        str = createBaseAwemeResponse.creationId;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str2, str)) {
                        a15 = next;
                        break;
                    }
                }
                A15 a152 = a15;
                if (a152 == null) {
                    return;
                }
                wl.gv0(false, a152);
                return;
            }
            Iterator<A15> it2 = map.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                A15 next2 = it2.next();
                if (o.LJ(next2.LIZ, event.LJLLJ)) {
                    a15 = next2;
                    break;
                }
            }
            A15 a153 = a15;
            if (a153 == null) {
                return;
            }
            wl.setState(new AqS135S0200000_4((Map) map, (Map<A15, ? extends A16>) a153, (A15) 292));
            return;
        }
        Iterator<A15> it3 = map.keySet().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            A15 next3 = it3.next();
            if (o.LJ(next3.LIZ, event.LJLLJ)) {
                a15 = next3;
                break;
            }
        }
        A15 a154 = a15;
        if (a154 == null) {
            return;
        }
        wl.setState(new AqS135S0200000_4((Map) map, (Map<A15, ? extends A16>) a154, (A15) 291));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLL = (C73305Spp) view.findViewById(R.id.gdy);
        this.LJLLI = (C45631qh) view.findViewById(R.id.gdv);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (onBackPressedDispatcher = mo49getActivity.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.LIZIZ(new A0V(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.aif, viewGroup, false);
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
