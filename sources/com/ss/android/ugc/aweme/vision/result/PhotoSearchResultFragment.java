package com.ss.android.ugc.aweme.vision.result;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1B8;
import X.C29S;
import X.C3C5;
import X.C47261Igj;
import X.C48658J7u;
import X.C50321Joz;
import X.C50324Jp2;
import X.C50438Jqs;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50863Jxj;
import X.C76800UCe;
import X.C78857UxB;
import X.C80217Ve1;
import X.C80218Ve2;
import X.C90903hW;
import X.KHK;
import X.KHM;
import X.KHS;
import X.KHT;
import X.KHV;
import X.O6R;
import X.VWV;
import X.VWZ;
import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS9S1100000_8;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECommerceService;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchImageResponse;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchResponse;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.IDqS433S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PhotoSearchResultFragment extends AmeBaseFragment {
    public C80217Ve1 LJLIL;
    public LinearLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public VWZ LJLJJI;
    public KHK LJLJJL;
    public PhotoSearchViewModel LJLJJLL;
    public PhotoSearchBottomPanelViewModel LJLJL;
    public boolean LJLJLJ;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final AObserverS76S0100000_8 LJLJLLL = new AObserverS76S0100000_8(this, 76);

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    public final void vl(KHV<PhotoSearchResponse> khv) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        PhotoSearchImageResponse photoSearchImageResponse;
        List<String> boxDetection;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchPdpEnterParams pdpParams;
        PhotoSearchEnterParams photoSearchEnterParams2;
        PhotoSearchPdpEnterParams pdpParams2;
        PhotoSearchEnterParams photoSearchEnterParams3;
        PhotoSearchLogEnterParams logParams;
        PhotoSearchEnterParams photoSearchEnterParams4;
        PhotoSearchLogEnterParams logParams2;
        PhotoSearchEnterParams photoSearchEnterParams5;
        PhotoSearchLogEnterParams logParams3;
        PhotoSearchEnterParams photoSearchEnterParams6;
        PhotoSearchPdpEnterParams pdpParams3;
        PhotoSearchEnterParams photoSearchEnterParams7;
        PhotoSearchPdpEnterParams pdpParams4;
        PhotoSearchEnterParams photoSearchEnterParams8;
        PhotoSearchLogEnterParams logParams4;
        PhotoSearchEnterParams photoSearchEnterParams9;
        PhotoSearchLogEnterParams logParams5;
        PhotoSearchEnterParams photoSearchEnterParams10;
        PhotoSearchLogEnterParams logParams6;
        PhotoSearchImageResponse photoSearchImageResponse2;
        List<String> boxDetection2;
        if (!this.LJLJLJ) {
            this.LJLJLJ = true;
            JSONObject jSONObject = new JSONObject();
            PhotoSearchResponse photoSearchResponse = khv.LIZ;
            if (photoSearchResponse != null && (photoSearchImageResponse2 = photoSearchResponse.LIZ) != null && (boxDetection2 = photoSearchImageResponse2.getBoxDetection()) != null) {
                i = boxDetection2.size();
            } else {
                i = 0;
            }
            jSONObject.put("words_num", i);
            jSONObject.put("words_source", "photo_search");
            PhotoSearchViewModel photoSearchViewModel = this.LJLJJLL;
            if (photoSearchViewModel != null) {
                str = photoSearchViewModel.LJLLILLLL;
            } else {
                str = null;
            }
            jSONObject.put("raw_pic", str);
            PhotoSearchViewModel photoSearchViewModel2 = this.LJLJJLL;
            if (photoSearchViewModel2 != null) {
                str2 = photoSearchViewModel2.LJLJLJ;
            } else {
                str2 = null;
            }
            jSONObject.put("raw_photo_source", str2);
            PhotoSearchViewModel photoSearchViewModel3 = this.LJLJJLL;
            if (photoSearchViewModel3 != null && (photoSearchEnterParams10 = photoSearchViewModel3.LJLILLLLZI) != null && (logParams6 = photoSearchEnterParams10.getLogParams()) != null) {
                str3 = logParams6.getSearchEntrance();
            } else {
                str3 = null;
            }
            jSONObject.put("search_entrance", str3);
            PhotoSearchViewModel photoSearchViewModel4 = this.LJLJJLL;
            if (photoSearchViewModel4 != null && (photoSearchEnterParams9 = photoSearchViewModel4.LJLILLLLZI) != null && (logParams5 = photoSearchEnterParams9.getLogParams()) != null) {
                str4 = logParams5.getCurrentPage();
            } else {
                str4 = null;
            }
            jSONObject.put("source_page_name", str4);
            PhotoSearchViewModel photoSearchViewModel5 = this.LJLJJLL;
            if (photoSearchViewModel5 != null && (photoSearchEnterParams8 = photoSearchViewModel5.LJLILLLLZI) != null && (logParams4 = photoSearchEnterParams8.getLogParams()) != null) {
                str5 = logParams4.getSearchType();
            } else {
                str5 = null;
            }
            jSONObject.put("search_type", str5);
            PhotoSearchViewModel photoSearchViewModel6 = this.LJLJJLL;
            if (photoSearchViewModel6 != null) {
                str6 = photoSearchViewModel6.LJLLLLLL;
            } else {
                str6 = null;
            }
            jSONObject.put("search_id", str6);
            PhotoSearchViewModel photoSearchViewModel7 = this.LJLJJLL;
            if (photoSearchViewModel7 != null && (photoSearchEnterParams7 = photoSearchViewModel7.LJLILLLLZI) != null && (pdpParams4 = photoSearchEnterParams7.getPdpParams()) != null) {
                str7 = pdpParams4.getEnterProductId();
            } else {
                str7 = null;
            }
            jSONObject.put("enter_product_id", str7);
            PhotoSearchViewModel photoSearchViewModel8 = this.LJLJJLL;
            if (photoSearchViewModel8 != null && (photoSearchEnterParams6 = photoSearchViewModel8.LJLILLLLZI) != null && (pdpParams3 = photoSearchEnterParams6.getPdpParams()) != null) {
                str8 = pdpParams3.getTrackId();
            } else {
                str8 = null;
            }
            jSONObject.put("track_id", str8);
            C48658J7u.LIZIZ("pic_search_module_show", jSONObject);
            PhotoSearchResponse photoSearchResponse2 = khv.LIZ;
            if (photoSearchResponse2 != null && (photoSearchImageResponse = photoSearchResponse2.LIZ) != null && (boxDetection = photoSearchImageResponse.getBoxDetection()) != null) {
                int i2 = 0;
                for (String str18 : boxDetection) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        JSONObject LIZIZ = C1B8.LIZIZ("words_source", "photo_search", "words_position", i2);
                        LIZIZ.put("entity_coord", str18);
                        LIZIZ.put("is_user_add", 0);
                        PhotoSearchViewModel photoSearchViewModel9 = this.LJLJJLL;
                        if (photoSearchViewModel9 != null) {
                            str9 = photoSearchViewModel9.LJLLILLLL;
                        } else {
                            str9 = null;
                        }
                        LIZIZ.put("raw_pic", str9);
                        PhotoSearchViewModel photoSearchViewModel10 = this.LJLJJLL;
                        if (photoSearchViewModel10 != null) {
                            str10 = photoSearchViewModel10.LJLJLJ;
                        } else {
                            str10 = null;
                        }
                        LIZIZ.put("photo_source", str10);
                        PhotoSearchViewModel photoSearchViewModel11 = this.LJLJJLL;
                        if (photoSearchViewModel11 != null && (photoSearchEnterParams5 = photoSearchViewModel11.LJLILLLLZI) != null && (logParams3 = photoSearchEnterParams5.getLogParams()) != null) {
                            str11 = logParams3.getSearchEntrance();
                        } else {
                            str11 = null;
                        }
                        LIZIZ.put("search_entrance", str11);
                        PhotoSearchViewModel photoSearchViewModel12 = this.LJLJJLL;
                        if (photoSearchViewModel12 != null && (photoSearchEnterParams4 = photoSearchViewModel12.LJLILLLLZI) != null && (logParams2 = photoSearchEnterParams4.getLogParams()) != null) {
                            str12 = logParams2.getCurrentPage();
                        } else {
                            str12 = null;
                        }
                        LIZIZ.put("source_page_name", str12);
                        PhotoSearchViewModel photoSearchViewModel13 = this.LJLJJLL;
                        if (photoSearchViewModel13 != null && (photoSearchEnterParams3 = photoSearchViewModel13.LJLILLLLZI) != null && (logParams = photoSearchEnterParams3.getLogParams()) != null) {
                            str13 = logParams.getSearchType();
                        } else {
                            str13 = null;
                        }
                        LIZIZ.put("search_type", str13);
                        PhotoSearchViewModel photoSearchViewModel14 = this.LJLJJLL;
                        if (photoSearchViewModel14 != null) {
                            str14 = photoSearchViewModel14.LJLJLJ;
                        } else {
                            str14 = null;
                        }
                        LIZIZ.put("raw_photo_source", str14);
                        PhotoSearchViewModel photoSearchViewModel15 = this.LJLJJLL;
                        if (photoSearchViewModel15 != null) {
                            str15 = photoSearchViewModel15.LJLZ;
                        } else {
                            str15 = null;
                        }
                        LIZIZ.put("first_photo_search_id", str15);
                        PhotoSearchViewModel photoSearchViewModel16 = this.LJLJJLL;
                        if (photoSearchViewModel16 != null && (photoSearchEnterParams2 = photoSearchViewModel16.LJLILLLLZI) != null && (pdpParams2 = photoSearchEnterParams2.getPdpParams()) != null) {
                            str16 = pdpParams2.getEnterProductId();
                        } else {
                            str16 = null;
                        }
                        LIZIZ.put("enter_product_id", str16);
                        PhotoSearchViewModel photoSearchViewModel17 = this.LJLJJLL;
                        if (photoSearchViewModel17 != null && (photoSearchEnterParams = photoSearchViewModel17.LJLILLLLZI) != null && (pdpParams = photoSearchEnterParams.getPdpParams()) != null) {
                            str17 = pdpParams.getTrackId();
                        } else {
                            str17 = null;
                        }
                        LIZIZ.put("track_id", str17);
                        C48658J7u.LIZIZ("pic_search_entity_show", LIZIZ);
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
    }

    public final void wl(String str) {
        long j;
        C50863Jxj c50863Jxj;
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime;
        Long netReceive;
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime2;
        long currentTimeMillis = System.currentTimeMillis();
        PhotoSearchViewModel photoSearchViewModel = this.LJLJJLL;
        if (photoSearchViewModel != null && (rDPhotoSearchTraceTime2 = photoSearchViewModel.LJLL) != null) {
            rDPhotoSearchTraceTime2.setNetDataProcess(Long.valueOf(currentTimeMillis));
        }
        PhotoSearchViewModel photoSearchViewModel2 = this.LJLJJLL;
        if (photoSearchViewModel2 != null && (rDPhotoSearchTraceTime = photoSearchViewModel2.LJLL) != null && (netReceive = rDPhotoSearchTraceTime.getNetReceive()) != null) {
            j = netReceive.longValue();
        } else {
            j = 0;
        }
        C78857UxB.LJJJJIZL("api_result_data_process", "search_result", Long.valueOf(currentTimeMillis - j), null, 248);
        if (ECommerceService.createIECommerceServicebyMonsterPlugin(false).isLowLevelDevice() || ECommerceService.createIECommerceServicebyMonsterPlugin(false).isMiddleLevelDevice()) {
            LinearLayout linearLayout = this.LJLILLLLZI;
            if (linearLayout != null) {
                linearLayout.postDelayed(new ARunnableS9S1100000_8(this, str, 2), 500L);
                return;
            }
            return;
        }
        PhotoSearchViewModel photoSearchViewModel3 = this.LJLJJLL;
        if (photoSearchViewModel3 == null || (c50863Jxj = photoSearchViewModel3.LJLJJLL) == null) {
            return;
        }
        c50863Jxj.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        FrameLayout frameLayout;
        PhotoSearchViewModel photoSearchViewModel;
        C50863Jxj c50863Jxj;
        VWV vwv;
        Context context;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C50321Joz c50321Joz;
        MutableLiveData<KHV<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<KHV<PhotoSearchResponse>> mutableLiveData2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJL = KHT.LIZ(mo49getActivity);
            this.LJLJJLL = KHS.LIZ(mo49getActivity);
        }
        PhotoSearchViewModel photoSearchViewModel2 = this.LJLJJLL;
        if (photoSearchViewModel2 != null && (mutableLiveData2 = photoSearchViewModel2.LJLIL) != null) {
            mutableLiveData2.removeObserver(this.LJLJLLL);
        }
        PhotoSearchViewModel photoSearchViewModel3 = this.LJLJJLL;
        if (photoSearchViewModel3 != null && (mutableLiveData = photoSearchViewModel3.LJLIL) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), this.LJLJLLL);
        }
        PhotoSearchViewModel photoSearchViewModel4 = this.LJLJJLL;
        C80218Ve2 c80218Ve2 = null;
        if (photoSearchViewModel4 != null && (c50321Joz = photoSearchViewModel4.LJLLI) != null) {
            C50651JuJ c50651JuJ = C50652JuK.Companion;
            C50652JuK c50652JuK = new C50652JuK(null, new C50438Jqs(c50321Joz, null, 2, null), 1, null);
            c50651JuJ.getClass();
            C50651JuJ.LIZ(this, c50652JuK);
            C17N.LJJJJJL(this).j4(new C50324Jp2(c50321Joz.getFeedbackSurvey(), 2));
        }
        this.LJLIL = (C80217Ve1) view.findViewById(R.id.hof);
        this.LJLILLLLZI = (LinearLayout) view.findViewById(R.id.hog);
        this.LJLJI = (FrameLayout) view.findViewById(R.id.d7p);
        this.LJLJJI = (VWZ) view.findViewById(R.id.gyk);
        if (this.LJLJJL == null && (context = getContext()) != null) {
            KHK khk = new KHK(context);
            this.LJLJJL = khk;
            PhotoSearchBottomPanelViewModel photoSearchBottomPanelViewModel = this.LJLJL;
            if (photoSearchBottomPanelViewModel != null) {
                photoSearchBottomPanelViewModel.LJLJL = khk;
            }
            if (khk != null) {
                FrameLayout frameLayout2 = new FrameLayout(requireContext());
                try {
                    i = O6R.LJJIIZ(TypedValue.applyDimension(1, 72, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused) {
                    i = 0;
                }
                frameLayout2.setMinimumHeight(i);
                LinearLayout linearLayout = this.LJLILLLLZI;
                if (linearLayout != null) {
                    linearLayout.addView(frameLayout2, new ViewGroup.LayoutParams(-1, -2));
                }
                KHK khk2 = this.LJLJJL;
                try {
                    i2 = O6R.LJJIIZ(TypedValue.applyDimension(1, 192, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused2) {
                    i2 = 0;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, -2);
                layoutParams.gravity = 1;
                float f = 12;
                try {
                    i3 = O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused3) {
                    i3 = 0;
                }
                layoutParams.topMargin = i3;
                frameLayout2.addView(khk2, layoutParams);
                Context requireContext = requireContext();
                o.LJIIIIZZ(requireContext, "requireContext()");
                TuxIconView tuxIconView = new TuxIconView(requireContext, null, 0, 6, null);
                float f2 = 2;
                try {
                    i4 = O6R.LJJIIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused4) {
                    i4 = 0;
                }
                try {
                    i5 = O6R.LJJIIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused5) {
                    i5 = 0;
                }
                try {
                    i6 = O6R.LJJIIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused6) {
                    i6 = 0;
                }
                try {
                    i7 = O6R.LJJIIZ(TypedValue.applyDimension(1, f2, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused7) {
                    i7 = 0;
                }
                tuxIconView.setPadding(i4, i5, i6, i7);
                tuxIconView.setIconRes(R.raw.icon_x_mark);
                tuxIconView.setTintColorRes(R.attr.dj);
                C16880lQ.LJJJ(tuxIconView, new ACListenerS28S0100000_8(this, 115));
                float f3 = 28;
                try {
                    i8 = O6R.LJJIIZ(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused8) {
                    i8 = 0;
                }
                try {
                    i9 = O6R.LJJIIZ(TypedValue.applyDimension(1, f3, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused9) {
                    i9 = 0;
                }
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i8, i9);
                layoutParams2.gravity = 16;
                try {
                    i10 = O6R.LJJIIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
                } catch (Exception unused10) {
                    i10 = 0;
                }
                layoutParams2.setMarginStart(i10);
                frameLayout2.addView(tuxIconView, layoutParams2);
                khk.setCropImageCountChange(new AqS184S0100000_2(khk, 96));
                KHM selectedEntityModel = khk.getSelectedEntityModel();
                if (selectedEntityModel != null) {
                    selectedEntityModel.LIZLLL = false;
                    khk.LIZJ(Integer.valueOf(selectedEntityModel.LJ), selectedEntityModel.LJI, "switch_entity", "cursor");
                }
            }
        }
        C80217Ve1 c80217Ve1 = this.LJLIL;
        if ((c80217Ve1 instanceof VWV) && (vwv = (VWV) c80217Ve1) != null) {
            vwv.setNeedInterceptScroll(new AqS158S0100000_8(this, 708));
        }
        VWZ vwz = this.LJLJJI;
        if (vwz != null) {
            vwz.setIsIntercept(true);
        }
        VWZ vwz2 = this.LJLJJI;
        if (vwz2 != null) {
            vwz2.setNeedInterceptScroll(new IDqS433S0100000_8(this, 12));
        }
        LinearLayout linearLayout2 = this.LJLILLLLZI;
        if (linearLayout2 != null) {
            obj = linearLayout2.getLayoutParams();
        } else {
            obj = null;
        }
        if ((obj instanceof C80218Ve2) && (c80218Ve2 = (C80218Ve2) obj) != null) {
            if (21 != c80218Ve2.LIZ) {
                c80218Ve2.LIZ = 21;
            }
            frameLayout = this.LJLJI;
            if (frameLayout == null && (photoSearchViewModel = this.LJLJJLL) != null && (c50863Jxj = photoSearchViewModel.LJLJJLL) != null) {
                c50863Jxj.LIZLLL(0, new ViewGroup.LayoutParams(-1, -1), frameLayout);
                return;
            }
            return;
        }
        LinearLayout linearLayout3 = this.LJLILLLLZI;
        if (linearLayout3 != null) {
            linearLayout3.setLayoutParams(c80218Ve2);
        }
        frameLayout = this.LJLJI;
        if (frameLayout == null) {
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cfy, viewGroup, false);
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
