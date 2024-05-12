package com.ss.android.ugc.aweme.view.hub;

import X.C107244Iu;
import X.C119244m8;
import X.C16880lQ;
import X.C188727au;
import X.C221108m2;
import X.C26227ARb;
import X.C53202KuM;
import X.C62822Ol8;
import X.C72581Se9;
import X.C72582SeA;
import X.C72593SeL;
import X.C72642Sf8;
import X.C72643Sf9;
import X.C73156SnQ;
import X.C73318Sq2;
import X.C78857UxB;
import X.C79902VXm;
import X.DialogC72606SeY;
import X.FMX;
import X.HG3;
import X.InterfaceC72580Se8;
import X.InterfaceC72607SeZ;
import X.Q7L;
import X.RBX;
import X.TBV;
import X.UC0;
import Y.ACListenerS26S0100000_6;
import Y.ACListenerS32S0100000_12;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS36S0001000_12;

/* loaded from: classes13.dex */
public final class ProfileNaviHubFragment extends ProfileNaviGLSurfaceFragment implements InterfaceC72607SeZ {
    public final Map<Integer, View> LJLLI = new LinkedHashMap();
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 952));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 951));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 953));
    public final Handler LJLL = new Handler(C16880lQ.LLJJJJ());

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
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

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final int getLayout() {
        return R.layout.c78;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // X.InterfaceC72607SeZ
    public final void Fd() {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "avatar_hub");
        FMX.LJIIL("delete_avatar", c188727au.LIZ);
        Context context = getContext();
        if (context != null) {
            C26227ARb LIZ = Q7L.LIZ(context, R.string.c1l);
            UC0.LIZJ(LIZ, new AqS172S0100000_6(this, 44));
            if (C78857UxB.LJJJIL(((RBX) HG3.LJIILL()).getCurUser().naviId)) {
                String str2 = ((RBX) HG3.LJIILL()).getCurUser().naviId;
                C72582SeA c72582SeA = C72593SeL.LIZIZ;
                if (c72582SeA != null) {
                    str = c72582SeA.LIZ;
                } else {
                    str = null;
                }
                if (C107244Iu.LIZ(str2, str)) {
                    LIZ.LJ(R.string.c1l);
                    LIZ.LIZ(R.string.c1k);
                }
            }
            FMX.LJIIL("show_exit_avatar_confirmation_popup", new C188727au().LIZ);
            LIZ.LJI().LIZLLL();
        }
    }

    public final DialogC72606SeY Jl() {
        return (DialogC72606SeY) this.LJLJLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void xl() {
        ProfileNaviDataModel profileNaviDataModel;
        C72582SeA c72582SeA = C72593SeL.LIZIZ;
        if ((c72582SeA == null || c72582SeA.LIZ == null) && ((profileNaviDataModel = C72593SeL.LJFF) == null || profileNaviDataModel.getNavi_id() == null)) {
            this.LJLL.postDelayed(new ARunnableS48S0100000_12(this, 57), 500L);
        }
        C16880lQ.LJJJIL((C119244m8) _$_findCachedViewById(R.id.gxf), new ACListenerS32S0100000_12(this, 91));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.i8b), new ACListenerS32S0100000_12(this, 92));
        C16880lQ.LJIIZILJ((LinearLayout) _$_findCachedViewById(R.id.i8c), new ACListenerS26S0100000_6(this, 5));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.i8_), new ACListenerS32S0100000_12(this, 93));
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.i8h), new ACListenerS32S0100000_12(this, 94));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC72607SeZ
    public final boolean Y1() {
        int i;
        IProfileNaviService LJIIL = ProfileNaviServiceImpl.LJIIL();
        DialogC72606SeY Jl = Jl();
        List<ProfileNaviDataModel> naviList = ((ProfileNaviSwitcherState) ((BaseJediViewModel) this.LJLJJL.getValue()).Hv0(this)).getNaviList();
        if (naviList != null) {
            i = naviList.size();
        } else {
            i = 0;
        }
        if (!LJIIL.LJFF(Jl, i)) {
            return false;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "avatar_hub");
        FMX.LJIIL("create_avatar_duplicate", c188727au.LIZ);
        Jl().dismiss();
        ProfileNaviEditorViewModel vl = vl();
        vl.getClass();
        boolean LIZ = C53202KuM.LIZ();
        if (((ProfileNaviEditorState) vl.lv0()).getCurrentTabIndex() != LIZ) {
            vl.setStateImmediate(new AqS36S0001000_12(LIZ ? 1 : 0, 8));
        }
        ProfileNaviEditorViewModel vl2 = vl();
        vl2.getClass();
        vl2.setState(new AqS16S0010000_12(true, 8));
        JediViewModel jediViewModel = (JediViewModel) this.LJLJL.getValue();
        jediViewModel.getClass();
        C72593SeL c72593SeL = C72593SeL.LIZ;
        C72582SeA c72582SeA = C72593SeL.LIZIZ;
        if (c72582SeA != null) {
            HashMap<String, InterfaceC72580Se8> hashMap = C72593SeL.LJ;
            if (hashMap != null) {
                C72582SeA LIZ2 = C72581Se9.LIZ(c72582SeA.LIZJ(), hashMap);
                LIZ2.LIZ = null;
                LIZ2.LJFF = null;
                LIZ2.LJ = null;
                c72593SeL.LIZJ(LIZ2);
            }
            jediViewModel.setStateImmediate(C72642Sf8.LJLIL);
            jediViewModel.setStateImmediate(C72643Sf9.LJLIL);
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLL.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final C79902VXm wl() {
        return (C79902VXm) _$_findCachedViewById(R.id.gxj);
    }

    @Override // com.ss.android.ugc.aweme.view.customview.ProfileNaviGLSurfaceFragment
    public final void Al(C73318Sq2 c73318Sq2) {
        super.Al(c73318Sq2);
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJJL.getValue(), new TBV() { // from class: X.Sdv
            @Override // X.TBV, X.AbstractC74224TBc, X.TBW
            public final Object get(Object obj) {
                return ((ProfileNaviSwitcherState) obj).getNaviList();
            }

            @Override // X.TBV, X.AbstractC74224TBc
            public final void set(Object obj, Object obj2) {
                ((ProfileNaviSwitcherState) obj).setNaviList((List) obj2);
            }
        }, new AqS194S0100000_12(this, 150));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ProfileNaviSwitcherViewModel) this.LJLJJL.getValue()).Mv0();
    }
}
