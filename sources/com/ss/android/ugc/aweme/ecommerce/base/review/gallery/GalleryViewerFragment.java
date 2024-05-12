package com.ss.android.ugc.aweme.ecommerce.base.review.gallery;

import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C221108m2;
import X.C29S;
import X.C38350F3i;
import X.C3C5;
import X.C5SN;
import X.C61878OQg;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C70689Roj;
import X.C70699Rot;
import X.C70714Rp8;
import X.C70717RpB;
import X.C70731RpP;
import X.C70732RpQ;
import X.C70740RpY;
import X.C70858RrS;
import X.C76800UCe;
import X.C90903hW;
import X.DialogC70776Rq8;
import X.EnumC70719RpD;
import X.InterfaceC37828Esy;
import X.InterfaceC71003Rtn;
import X.InterfaceC92693kP;
import X.ORZ;
import Y.AObserverS80S0100000_12;
import Y.AfS64S0100000_12;
import Y.IDDListenerS105S0200000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class GalleryViewerFragment extends BaseFragment implements InterfaceC37828Esy {
    public GalleryViewerViewModel LJLIL;
    public DialogC70776Rq8 LJLZ;
    public C70732RpQ LJZ;
    public volatile int LJZI;
    public volatile int LJZL;
    public boolean LL;
    public final Map<Integer, View> LLF = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 454));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 456));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 458));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 457));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 296));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 459));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS154S0100000_4(this, 297));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 295));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 452));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 455));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 460));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 453));
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 463));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 462));
    public final C62822Ol8 LJLLLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 461));
    public final C70740RpY LLD = new C70740RpY(this);

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLF).clear();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLF;
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

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "review_photo";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        CopyOnWriteArrayList<C70717RpB> copyOnWriteArrayList;
        int i;
        GalleryViewerViewModel galleryViewerViewModel;
        C70714Rp8 c70714Rp8;
        NextLiveData<CopyOnWriteArrayList<C70717RpB>> nextLiveData;
        super.onStop();
        GalleryViewerViewModel galleryViewerViewModel2 = this.LJLIL;
        if (galleryViewerViewModel2 != null && (nextLiveData = galleryViewerViewModel2.LJLLLLLL) != null) {
            copyOnWriteArrayList = nextLiveData.getValue();
        } else {
            copyOnWriteArrayList = null;
        }
        int i2 = this.LJZI;
        if (copyOnWriteArrayList != null) {
            i = copyOnWriteArrayList.size();
        } else {
            i = 0;
        }
        if (i2 < i && copyOnWriteArrayList != null && (galleryViewerViewModel = this.LJLIL) != null && (c70714Rp8 = galleryViewerViewModel.LJLJI) != null) {
            int i3 = this.LJZI + 1;
            C70717RpB c70717RpB = copyOnWriteArrayList.get(this.LJZI);
            o.LJIIIIZZ(c70717RpB, "it[curPosition]");
            C70717RpB c70717RpB2 = c70717RpB;
            int size = copyOnWriteArrayList.size();
            Integer valueOf = Integer.valueOf(wl());
            String str = (String) this.LJLILLLLZI.getValue();
            String str2 = (String) this.LJLLLLLL.getValue();
            if (ActivityStack.isAppBackGround()) {
                c70714Rp8.LIZJ = "close";
            }
            c70714Rp8.LIZJ(this, i3, c70717RpB2, size, valueOf, str, str2);
        }
    }

    public final int vl() {
        return ((Number) this.LJLLI.getValue()).intValue();
    }

    public final int wl() {
        return ((Number) this.LJLJI.getValue()).intValue();
    }

    @Override // X.InterfaceC37828Esy
    public final Map<String, String> getMapRule() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        Object context = getContext();
        if (context instanceof InterfaceC37828Esy) {
            return (InterfaceC71003Rtn) context;
        }
        return null;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        DialogC70776Rq8 dialogC70776Rq8;
        C70732RpQ c70731RpP;
        super.onCreate(bundle);
        GalleryViewerViewModel galleryViewerViewModel = (GalleryViewerViewModel) ViewModelProviders.of(this).get(GalleryViewerViewModel.class);
        this.LJLIL = galleryViewerViewModel;
        if (galleryViewerViewModel != null) {
            Context requireContext = requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            galleryViewerViewModel.LJLJI = new C70714Rp8(requireContext);
        }
        Context context = getContext();
        if (context != null) {
            dialogC70776Rq8 = new DialogC70776Rq8(context);
        } else {
            dialogC70776Rq8 = null;
        }
        this.LJLZ = dialogC70776Rq8;
        if (wl() == EnumC70719RpD.US_REVIEW_GALLERY.getType() || wl() == EnumC70719RpD.SHOP_TAB_REVIEW_GALLERY.getType()) {
            c70731RpP = new C70731RpP(this, this.LJLIL, vl());
        } else {
            c70731RpP = new C70732RpQ(this, this.LJLIL, vl());
        }
        this.LJZ = c70731RpP;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        NextLiveData<Integer> nextLiveData;
        NextLiveData<CopyOnWriteArrayList<C70717RpB>> nextLiveData2;
        String str;
        int[] iArr;
        int i;
        InterfaceC92693kP interfaceC92693kP;
        NextLiveData<Boolean> nextLiveData3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        GalleryViewerViewModel galleryViewerViewModel = this.LJLIL;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.LJLJJLL = (String) this.LJLJJL.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel2 = this.LJLIL;
        if (galleryViewerViewModel2 != null) {
            galleryViewerViewModel2.LJLJL = (String) this.LJLJJI.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel3 = this.LJLIL;
        if (galleryViewerViewModel3 != null) {
            galleryViewerViewModel3.LJLJLJ = ((Number) this.LJLJJLL.getValue()).intValue();
        }
        GalleryViewerViewModel galleryViewerViewModel4 = this.LJLIL;
        if (galleryViewerViewModel4 != null) {
            galleryViewerViewModel4.LJLJJI = (String) this.LJLJL.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel5 = this.LJLIL;
        if (galleryViewerViewModel5 != null) {
            galleryViewerViewModel5.LJLJJL = (Integer) this.LJLJLJ.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel6 = this.LJLIL;
        Integer num = null;
        if (galleryViewerViewModel6 != null && (nextLiveData3 = galleryViewerViewModel6.LJLJLLL) != null) {
            nextLiveData3.setValue(Boolean.valueOf(((Boolean) this.LJLL.getValue()).booleanValue()));
        }
        GalleryViewerViewModel galleryViewerViewModel7 = this.LJLIL;
        if (galleryViewerViewModel7 != null) {
            galleryViewerViewModel7.LJLL = Integer.valueOf(((Number) this.LJLJLLL.getValue()).intValue());
        }
        GalleryViewerViewModel galleryViewerViewModel8 = this.LJLIL;
        if (galleryViewerViewModel8 != null) {
            galleryViewerViewModel8.LJLLILLLL = (String) this.LJLLJ.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel9 = this.LJLIL;
        if (galleryViewerViewModel9 != null) {
            galleryViewerViewModel9.LJLLL = (String) this.LJLLLL.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel10 = this.LJLIL;
        if (galleryViewerViewModel10 != null) {
            galleryViewerViewModel10.LJLLJ = (ArrayList) this.LJLLL.getValue();
        }
        GalleryViewerViewModel galleryViewerViewModel11 = this.LJLIL;
        if (galleryViewerViewModel11 != null) {
            String str2 = (String) this.LJLLILLLL.getValue();
            o.LJIIIZ(str2, "<set-?>");
            galleryViewerViewModel11.LJLLI = str2;
        }
        GalleryViewerViewModel galleryViewerViewModel12 = this.LJLIL;
        if (galleryViewerViewModel12 != null) {
            galleryViewerViewModel12.LJZ = Integer.valueOf(wl());
        }
        GalleryViewerViewModel galleryViewerViewModel13 = this.LJLIL;
        if (galleryViewerViewModel13 != null) {
            galleryViewerViewModel13.LJZI = (String) this.LJLLLLLL.getValue();
        }
        DialogC70776Rq8 dialogC70776Rq8 = this.LJLZ;
        if (dialogC70776Rq8 != null) {
            C70740RpY listener = this.LLD;
            o.LJIIIZ(listener, "listener");
            ((ArrayList) dialogC70776Rq8.LJLJLJ).add(listener);
            dialogC70776Rq8.setOnDismissListener(new IDDListenerS105S0200000_12(this, dialogC70776Rq8, 1));
            C70732RpQ c70732RpQ = this.LJZ;
            o.LJII(c70732RpQ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.galleryviewer.ui.indicator.IIndicator");
            ((ArrayList) dialogC70776Rq8.LJLJJLL).add(c70732RpQ);
            C5SN c5sn = new C5SN();
            c5sn.LJLJI = Integer.valueOf(R.drawable.afo);
            ((ArrayList) dialogC70776Rq8.LJLJJLL).add(c5sn);
            dialogC70776Rq8.LJ().LJLL = false;
            Context context = dialogC70776Rq8.getContext();
            o.LJIIIIZZ(context, "context");
            dialogC70776Rq8.LJ().LJLLI = C63081OpJ.LJJJJLI(context);
        }
        GalleryViewerViewModel galleryViewerViewModel14 = this.LJLIL;
        if (galleryViewerViewModel14 != null) {
            String str3 = (String) this.LJLILLLLZI.getValue();
            int vl = vl();
            if (vl == 2 && (interfaceC92693kP = galleryViewerViewModel14.LJLIL) != null) {
                interfaceC92693kP.dispose();
            }
            String str4 = "";
            if (str3 == null) {
                str = "";
            } else {
                str = str3;
            }
            C70699Rot LIZ = C70689Roj.LIZ(str);
            LIZ.LJLJLLL = new AqS178S0100000_12(galleryViewerViewModel14, 651);
            if (galleryViewerViewModel14.LJLILLLLZI == null) {
                galleryViewerViewModel14.LJLILLLLZI = LIZ;
            }
            if (vl == 2) {
                if (str3 != null) {
                    str4 = str3;
                }
                String str5 = galleryViewerViewModel14.LJLLI;
                String str6 = galleryViewerViewModel14.LJLJJI;
                String str7 = galleryViewerViewModel14.LJLLILLLL;
                ArrayList<Integer> arrayList = galleryViewerViewModel14.LJLLJ;
                if (arrayList != null) {
                    iArr = ORZ.LLJ(arrayList);
                } else {
                    iArr = null;
                }
                Boolean bool = Boolean.TRUE;
                String str8 = galleryViewerViewModel14.LJLLL;
                if (str8 != null) {
                    num = C38350F3i.LJJIL(str8);
                }
                ReviewApi.ListShopReviewRequest listShopReviewRequest = new ReviewApi.ListShopReviewRequest(str4, str5, false, 10, 1, str6, str7, iArr, bool, num, galleryViewerViewModel14.LJLJJL, null, 2048, null);
                String str9 = galleryViewerViewModel14.LJLJJLL;
                Integer valueOf = Integer.valueOf(galleryViewerViewModel14.LJLJLJ);
                String str10 = galleryViewerViewModel14.LJLJL;
                Integer num2 = galleryViewerViewModel14.LJLL;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 1;
                }
                Boolean value = galleryViewerViewModel14.LJLJLLL.getValue();
                if (value == null) {
                    value = Boolean.FALSE;
                }
                LIZ.LLLLZLLLI(listShopReviewRequest, str9, valueOf, str10, i, value.booleanValue(), galleryViewerViewModel14.LJZ).LJIL(new AfS64S0100000_12(galleryViewerViewModel14, 123)).LJJJJZI(new AfS64S0100000_12(galleryViewerViewModel14, 124));
            } else {
                if (str3 != null) {
                    str4 = str3;
                }
                int i2 = 1;
                ReviewApi.ReviewRequest reviewRequest = new ReviewApi.ReviewRequest(str4, galleryViewerViewModel14.LJLJJI, 10, 1, false, galleryViewerViewModel14.LJLJJL, null, Boolean.TRUE, null, 256, null);
                String str11 = galleryViewerViewModel14.LJLJJLL;
                Integer valueOf2 = Integer.valueOf(galleryViewerViewModel14.LJLJLJ);
                String str12 = galleryViewerViewModel14.LJLJL;
                Integer num3 = galleryViewerViewModel14.LJLL;
                if (num3 != null) {
                    i2 = num3.intValue();
                }
                Boolean value2 = galleryViewerViewModel14.LJLJLLL.getValue();
                if (value2 == null) {
                    value2 = Boolean.FALSE;
                }
                LIZ.LLLLZIL(reviewRequest, str11, valueOf2, str12, i2, value2.booleanValue()).LJIL(new AfS64S0100000_12(galleryViewerViewModel14, 125)).LJJJJZI(new AfS64S0100000_12(galleryViewerViewModel14, 126));
            }
        }
        GalleryViewerViewModel galleryViewerViewModel15 = this.LJLIL;
        if (galleryViewerViewModel15 != null && (nextLiveData2 = galleryViewerViewModel15.LJLLLLLL) != null) {
            nextLiveData2.observe(this, new AObserverS80S0100000_12(this, 113));
        }
        GalleryViewerViewModel galleryViewerViewModel16 = this.LJLIL;
        if (galleryViewerViewModel16 != null && (nextLiveData = galleryViewerViewModel16.LJLLLL) != null) {
            nextLiveData.observe(this, new AObserverS80S0100000_12(this, 114));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a0_, viewGroup, false);
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
