package com.ss.android.ugc.aweme.vision.background;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C37250Eje;
import X.C3C5;
import X.C51446KHa;
import X.C51448KHc;
import X.C76800UCe;
import X.C78857UxB;
import X.C90903hW;
import X.KHC;
import X.KHH;
import X.KHL;
import X.KHS;
import X.KHT;
import X.KHV;
import X.KHZ;
import X.KLC;
import X.KLL;
import X.KLS;
import X.KLU;
import X.KS4;
import X.ORZ;
import X.ViewOnLongClickListenerC51458KHm;
import X.W5I;
import Y.AObserverS76S0100000_8;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.vision.PhotoSearchViewModel;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchImageResponse;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.aweme.vision.result.CropImageViewModel;
import com.ss.android.ugc.aweme.vision.result.PhotoSearchBottomPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import o53.IDdS475S0100000_8;

/* loaded from: classes9.dex */
public final class PhotoSearchBackgroundFragment extends AmeBaseFragment {
    public ViewGroup LJLIL;
    public KLS LJLILLLLZI;
    public KHZ LJLJI;
    public PhotoSearchViewModel LJLJJI;
    public PhotoSearchBottomPanelViewModel LJLJJL;
    public CropImageWindowViewModel LJLJJLL;
    public CropImageViewModel LJLJL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final AObserverS76S0100000_8 LJLJLJ = new AObserverS76S0100000_8(this, 75);
    public final IDdS475S0100000_8 LJLJLLL = new IDdS475S0100000_8(this, 2);

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLL).clear();
    }

    public final void vl(List<KLC> list) {
        RectF rectF;
        KHZ khz = this.LJLJI;
        if (khz != null) {
            khz.setPointList(list);
        }
        KHZ khz2 = this.LJLJI;
        if (khz2 != null) {
            khz2.LJZI = true;
            khz2.LJIIIIZZ();
            KLC klc = khz2.LLFFF;
            if (klc != null && (rectF = klc.LJLILLLLZI) != null) {
                KLL.LEFT.setCoordinate(rectF.left);
                KLL.TOP.setCoordinate(rectF.top);
                KLL.RIGHT.setCoordinate(rectF.right);
                KLL.BOTTOM.setCoordinate(rectF.bottom);
            }
            khz2.invalidate();
        }
        KHZ khz3 = this.LJLJI;
        if (khz3 != null) {
            khz3.LJZ = true;
            khz3.invalidate();
        }
        KHZ khz4 = this.LJLJI;
        if (khz4 == null) {
            return;
        }
        khz4.setOnRectMoveListener(new KHL(this));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        PhotoSearchEnterParams photoSearchEnterParams;
        PhotoSearchToolsEnterParams toolsParams;
        String localFilePath;
        List<String> urlList;
        long j;
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime;
        Long enterResult;
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime2;
        List<String> urlList2;
        MutableLiveData<KHV<PhotoSearchResponse>> mutableLiveData;
        MutableLiveData<KHV<PhotoSearchResponse>> mutableLiveData2;
        KHC khc;
        KHH khh;
        String str;
        PhotoSearchImageResponse photoSearchImageResponse;
        List<String> boxDetection;
        KLU klu;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLIL = (ViewGroup) view.findViewById(R.id.aev);
        this.LJLILLLLZI = (KLS) view.findViewById(R.id.hoo);
        KHZ khz = (KHZ) view.findViewById(R.id.bzz);
        this.LJLJI = khz;
        if (khz != null) {
            KLS kls = this.LJLILLLLZI;
            if (kls != null) {
                klu = kls.getAttacher();
            } else {
                klu = null;
            }
            khz.setAttacher(klu);
        }
        KLS kls2 = this.LJLILLLLZI;
        if (kls2 != null) {
            kls2.setOnViewDragListener(new C51448KHc(this));
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            this.LJLJJI = KHS.LIZ(mo49getActivity);
            this.LJLJJL = KHT.LIZ(mo49getActivity);
            this.LJLJJLL = (CropImageWindowViewModel) ViewModelProviders.of(mo49getActivity).get(CropImageWindowViewModel.class);
            this.LJLJL = (CropImageViewModel) ViewModelProviders.of(mo49getActivity).get(CropImageViewModel.class);
        }
        KHZ khz2 = this.LJLJI;
        if (khz2 != null) {
            khz2.setBottomPanelViewModel(this.LJLJJL);
        }
        KLS kls3 = this.LJLILLLLZI;
        if (kls3 != null) {
            kls3.setBottomPanelViewModel(this.LJLJJL);
        }
        CropImageWindowViewModel cropImageWindowViewModel = this.LJLJJLL;
        if (cropImageWindowViewModel != null) {
            cropImageWindowViewModel.LJLIL = this.LJLJI;
        }
        PhotoSearchViewModel photoSearchViewModel = this.LJLJJI;
        if (photoSearchViewModel != null && (khc = photoSearchViewModel.LJLJJL) != null && (khh = khc.LJIILL) != null) {
            khh.LIZLLL = CardStruct.IStatusCode.DEFAULT;
            PhotoSearchResponse photoSearchResponse = photoSearchViewModel.LJLJJI;
            if (photoSearchResponse != null && (photoSearchImageResponse = photoSearchResponse.LIZ) != null && (boxDetection = photoSearchImageResponse.getBoxDetection()) != null) {
                str = (String) ORZ.LJLLLLLL(0, boxDetection);
            } else {
                str = null;
            }
            khh.LIZJ = str;
        }
        PhotoSearchViewModel photoSearchViewModel2 = this.LJLJJI;
        if (photoSearchViewModel2 != null && (mutableLiveData2 = photoSearchViewModel2.LJLIL) != null) {
            mutableLiveData2.removeObserver(this.LJLJLJ);
        }
        PhotoSearchViewModel photoSearchViewModel3 = this.LJLJJI;
        if (photoSearchViewModel3 != null && (mutableLiveData = photoSearchViewModel3.LJLIL) != null) {
            mutableLiveData.observeForever(this.LJLJLJ);
        }
        PhotoSearchViewModel photoSearchViewModel4 = this.LJLJJI;
        if (photoSearchViewModel4 != null && (photoSearchEnterParams = photoSearchViewModel4.LJLILLLLZI) != null && (toolsParams = photoSearchEnterParams.getToolsParams()) != null && (localFilePath = toolsParams.getLocalFilePath()) != null) {
            KLS kls4 = this.LJLILLLLZI;
            if (kls4 != null) {
                kls4.setOnLongClickListener(ViewOnLongClickListenerC51458KHm.LJLIL);
            }
            UrlModel urlModel = new UrlModel();
            if (urlModel.getUrlList() == null) {
                urlModel.setUrlList(new ArrayList(1));
            }
            if (ujb.o.LJJJLIIL(localFilePath, "http", false)) {
                List<String> urlList3 = urlModel.getUrlList();
                if (urlList3 != null) {
                    ListProtector.add(urlList3, 0, localFilePath);
                }
            } else if (C37250Eje.LIZIZ(localFilePath) && (urlList = urlModel.getUrlList()) != null) {
                ListProtector.add(urlList, 0, localFilePath);
            }
            List<String> urlList4 = urlModel.getUrlList();
            if (urlList4 != null && urlList4.isEmpty() && (urlList2 = urlModel.getUrlList()) != null) {
                urlList2.add("error_picture_path");
            }
            Uri parse = UriProtector.parse(localFilePath);
            o.LJIIIIZZ(parse, "parse(localFilePath)");
            W5I.LIZ().LIZIZ(parse);
            long currentTimeMillis = System.currentTimeMillis();
            PhotoSearchViewModel photoSearchViewModel5 = this.LJLJJI;
            if (photoSearchViewModel5 != null && (rDPhotoSearchTraceTime2 = photoSearchViewModel5.LJLL) != null) {
                rDPhotoSearchTraceTime2.setBgStartLoad(Long.valueOf(currentTimeMillis));
            }
            PhotoSearchViewModel photoSearchViewModel6 = this.LJLJJI;
            if (photoSearchViewModel6 != null && (rDPhotoSearchTraceTime = photoSearchViewModel6.LJLL) != null && (enterResult = rDPhotoSearchTraceTime.getEnterResult()) != null) {
                j = enterResult.longValue();
            } else {
                j = 0;
            }
            C78857UxB.LJJJJIZL("image_load_start", "search_result", Long.valueOf(currentTimeMillis - j), null, 248);
            C51446KHa c51446KHa = new C51446KHa(this.LJLILLLLZI);
            c51446KHa.LIZIZ = urlModel;
            c51446KHa.LJFF = null;
            c51446KHa.LJ = this.LJLJLLL;
            c51446KHa.LJI = true;
            c51446KHa.LJII = true;
            c51446KHa.LIZJ = 720;
            c51446KHa.LIZLLL = 720;
            KS4.LIZJ(c51446KHa);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.cfx, viewGroup, false);
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
