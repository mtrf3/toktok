package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.AbstractC234519Ih;
import X.C16880lQ;
import X.C188727au;
import X.C223338pd;
import X.C234529Ii;
import X.C235119Kp;
import X.C252709vu;
import X.C26045AKb;
import X.C33381Ss;
import X.C45814HyU;
import X.C63081OpJ;
import X.C73306Spq;
import X.C78963Uyt;
import X.C7MY;
import X.C84934XVa;
import X.C84973XWn;
import X.C88913eJ;
import X.C9KF;
import X.EnumC84975XWp;
import X.FMX;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.OGG;
import X.SY4;
import X.V8E;
import X.XRT;
import X.XVF;
import X.XVG;
import X.XWQ;
import X.XWR;
import X.XYH;
import X.XYM;
import X.XYV;
import Y.ACListenerS46S0200000_12;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ImportDeviceSoundsFragment extends BaseMusicListFragment<C84934XVa> implements XYV<C84934XVa>, InterfaceC191547fS, OGG {
    public int LJLZ;
    public final Map<Integer, View> LJZ = new LinkedHashMap();
    public final ArrayList<MusicModel> LJLLL = new ArrayList<>();
    public final ArrayList<MusicModel> LJLLLL = new ArrayList<>();
    public final Keva LJLLLLLL = Keva.getRepo("device_sounds_repo");

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 16;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean Gl() {
        return false;
    }

    @Override // X.XYV
    public final void LJI() {
    }

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "device_sounds_list_data";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "device_sounds_list_status";
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZ;
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

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "device_sounds_list_load_more_status";
    }

    @Override // X.XYV
    public final void pk() {
    }

    @Override // X.XYV
    public final void refreshData() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.am0;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
        if (interfaceC84984XWy != 0) {
            interfaceC84984XWy.showLoadMoreLoading();
        }
        Ll();
    }

    @Override // X.OGG
    public final View LJIJJ() {
        Object obj = this.LJLJLJ;
        if (obj == null) {
            return null;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView<*>");
        return ((XWR) obj).LIZIZ;
    }

    public final void Ll() {
        if (this.LJLZ == 0) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.g7i);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            C223338pd c223338pd = (C223338pd) _$_findCachedViewById(R.id.g7h);
            if (c223338pd != null) {
                c223338pd.LIZIZ();
            }
        } else {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.g7i);
            if (_$_findCachedViewById2 != null) {
                _$_findCachedViewById2.setVisibility(8);
            }
        }
        Context context = getContext();
        if (context != null) {
            C45814HyU.LJ(context, new C84973XWn(this), false, this.LJLZ, 50);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* renamed from: Il */
    public final void onInternalEvent(XYM xym) {
        boolean z;
        Resources resources;
        String quantityString;
        String str = xym.LIZIZ;
        if (o.LJ(str, "local_music_import_select")) {
            this.LJLLLL.add(xym.LIZ);
            if (this.LJLLLL.size() == 100) {
                C26045AKb c26045AKb = new C26045AKb(this);
                c26045AKb.LJIIIIZZ(R.string.bbq);
                c26045AKb.LJIIJ();
                C188727au c188727au = new C188727au();
                C78963Uyt.LIZJ(c188727au);
                c188727au.LJI("fail_type", "select_up_to_100_sounds");
                FMX.LJIIL("upload_sound_from_device_popup_show", c188727au.LIZ);
                xl().notifyDataSetChanged();
            }
            String musicId = xym.LIZ.getMusicId();
            o.LJIIIIZZ(musicId, "event.musicModel.musicId");
            C188727au c188727au2 = new C188727au();
            C78963Uyt.LIZJ(c188727au2);
            c188727au2.LJI("fake_music_id", musicId);
            FMX.LJIIL("choose_upload_sound_from_device", c188727au2.LIZ);
        } else if (o.LJ(str, "local_music_import_unselect")) {
            this.LJLLLL.remove(xym.LIZ);
            if (this.LJLLLL.size() == 99) {
                xl().notifyDataSetChanged();
            }
            String musicId2 = xym.LIZ.getMusicId();
            o.LJIIIIZZ(musicId2, "event.musicModel.musicId");
            C188727au c188727au3 = new C188727au();
            C78963Uyt.LIZJ(c188727au3);
            c188727au3.LJI("fake_music_id", musicId2);
            FMX.LJIIL("choose_upload_sound_from_device", c188727au3.LIZ);
        }
        int size = this.LJLLLL.size();
        SY4 sy4 = (SY4) _$_findCachedViewById(R.id.ekc);
        if (size > 0) {
            z = true;
        } else {
            z = false;
        }
        sy4.setEnabled(z);
        TextView textView = (TextView) _$_findCachedViewById(R.id.ekc);
        if (size == 0) {
            Context context = getContext();
            if (context != null) {
                quantityString = context.getString(R.string.bnj);
            }
            quantityString = null;
        } else {
            Context context2 = getContext();
            if (context2 != null && (resources = context2.getResources()) != null) {
                quantityString = resources.getQuantityString(R.plurals.au, size, Integer.valueOf(size));
            }
            quantityString = null;
        }
        textView.setText(quantityString);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.C72H
    public final /* bridge */ /* synthetic */ void onInternalEvent(XYM xym) {
        onInternalEvent(xym);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy<C84934XVa> vl(View view) {
        String str;
        String str2;
        String str3;
        XWQ xwq = new XWQ(getContext(), view, this, R.string.iqx, this, this, this.LJLLJ, EnumC84975XWp.DEVICE_SOUNDS, this.LJLLILLLL);
        C73306Spq c73306Spq = new C73306Spq();
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.b_x;
        Context requireContext = requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        V8E LIZ = c33381Ss.LIZ(requireContext);
        c73306Spq.LIZJ = 0;
        c73306Spq.LIZ = LIZ;
        Context context = getContext();
        if (context == null || (str = context.getString(R.string.bc5)) == null) {
            str = "";
        }
        c73306Spq.LJFF = str;
        int LIZIZ = C7MY.LIZIZ(318);
        int LIZIZ2 = C7MY.LIZIZ(147);
        c73306Spq.LIZLLL = LIZIZ;
        c73306Spq.LJ = LIZIZ2;
        C73306Spq c73306Spq2 = new C73306Spq();
        C33381Ss c33381Ss2 = new C33381Ss();
        c33381Ss2.LJLIL = R.drawable.ba5;
        Context requireContext2 = requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        V8E LIZ2 = c33381Ss2.LIZ(requireContext2);
        c73306Spq2.LIZJ = 0;
        c73306Spq2.LIZ = LIZ2;
        Context context2 = getContext();
        if (context2 == null || (str2 = context2.getString(R.string.bce)) == null) {
            str2 = "";
        }
        c73306Spq2.LJFF = str2;
        int LIZIZ3 = C7MY.LIZIZ(318);
        int LIZIZ4 = C7MY.LIZIZ(147);
        c73306Spq2.LIZLLL = LIZIZ3;
        c73306Spq2.LJ = LIZIZ4;
        Context context3 = getContext();
        if (context3 == null || (str3 = context3.getString(R.string.bcc)) == null) {
            str3 = "";
        }
        c73306Spq2.LJI = str3;
        c73306Spq2.LJII = new AqS146S0200000_15(this, xwq, 19);
        xwq.LJIIIIZZ(this);
        xwq.LJII(this);
        xwq.LJIIL = c73306Spq;
        xwq.LJIIJ(new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI)));
        XVG xvg = new XVG("change_music_page", "device_upload", "", XVF.LIZ);
        xvg.LJIILIIL = "your_sounds";
        xwq.LJIIIZ(xvg);
        xwq.LJ(new XYH(this), 5);
        if (!this.LJLLLLLL.getBoolean("user_allowed_scan_device_sounds", false)) {
            xwq.LIZJ.setStatus(c73306Spq2);
            xwq.LIZJ.setVisibility(0);
        } else {
            xwq.LIZJ.setVisibility(8);
        }
        return xwq;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }

    public final void Ml(Collection musicList, boolean z) {
        boolean z2;
        o.LJIIIZ(musicList, "musicList");
        XRT xrt = new XRT();
        if (z) {
            this.LJLJJLL.jv0(0, "device_sounds_list_status");
            this.LJLLL.addAll(musicList);
            xrt.LIZIZ("list_data", C45814HyU.LIZJ(this.LJLLL));
            if (musicList.size() >= 50) {
                z2 = true;
            } else {
                z2 = false;
            }
            xrt.LIZ.put("list_hasmore", Boolean.valueOf(z2));
            xrt.LIZIZ("action_type", 1);
            this.LJLJJLL.jv0(xrt, "device_sounds_list_data");
        } else {
            this.LJLJJLL.jv0(1, "device_sounds_list_status");
        }
        if (this.LJLLL.isEmpty()) {
            _$_findCachedViewById(R.id.ekc).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.ekc).setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.getRootView().findViewById(R.id.bv5);
        ViewGroup.LayoutParams layoutParams = null;
        if (findViewById != null) {
            layoutParams = findViewById.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            marginLayoutParams.topMargin = C63081OpJ.LJJJJLI(context);
        }
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS162S0100000_12(this, 153));
        C9KF LIZLLL = t1.LIZLLL(c235119Kp, new AbstractC234519Ih[]{LIZJ});
        LIZLLL.LIZJ = C88913eJ.LIZ(view, R.string.bnj, "view.context.getString(R.string.allowsounds_title)");
        c235119Kp.LIZJ = LIZLLL;
        c252709vu.setNavActions(c235119Kp);
        ((SY4) _$_findCachedViewById(R.id.ekc)).setSupportClickWhenDisable(true);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.ekc), new ACListenerS46S0200000_12(this, view, 10));
        if (this.LJLLLLLL.getBoolean("user_allowed_scan_device_sounds", false)) {
            Ll();
            _$_findCachedViewById(R.id.ekc).setVisibility(0);
        } else {
            _$_findCachedViewById(R.id.ekc).setVisibility(8);
        }
    }
}
