package Y;

import X.C26338AVi;
import X.C39774FjG;
import X.C48018Isw;
import X.C49133JQb;
import X.C49189JSf;
import X.C49956Jj6;
import X.C50222JnO;
import X.C78847Ux1;
import X.EnumC47567Ilf;
import X.InterfaceC47046IdG;
import X.InterfaceC47825Ipp;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.middle.BaseDiscoverAndSearchFragmentNew;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import com.ss.android.ugc.aweme.search.performance.core.model.PreloadImg;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS14S0110000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        List<SearchMixFeed> list;
        List<String> list2;
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) this.l0;
        if (searchMixFeedList != null && (list = searchMixFeedList.mItems) != null && (!list.isEmpty())) {
            ArrayList arrayList = new ArrayList(((SearchMixFeedList) this.l0).mItems);
            List<String> list3 = null;
            if (this.z1) {
                PreloadImg preloadImg = ((SearchMixFeedList) this.l0).preloadImg;
                if (preloadImg != null) {
                    list3 = preloadImg.urlList;
                }
                C49956Jj6.LJFF(list3);
                return;
            }
            if (((SearchMixFeedList) this.l0).mItems == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                PreloadImg preloadImg2 = ((SearchMixFeed) it.next()).preloadImg;
                if (preloadImg2 != null) {
                    list2 = preloadImg2.urlList;
                } else {
                    list2 = null;
                }
                C49956Jj6.LJFF(list2);
            }
        }
    }

    public final void LIZ$1() {
        ((C49189JSf) this.l0).LIZ = true;
        C49133JQb.LIZ("GHGCA", Boolean.valueOf(this.z1), Boolean.valueOf(((C49189JSf) this.l0).LJI));
        if (this.z1 || ((C49189JSf) this.l0).LJI) {
            ((C49189JSf) this.l0).LJIIIIZZ();
            ((C49189JSf) this.l0).LJI = false;
        }
    }

    public final void LIZ$2() {
        int LJJIFFI;
        int i;
        int i2;
        if (((C50222JnO) this.l0).LJLIL.getParent() != null) {
            int i3 = 0;
            ViewGroup.LayoutParams layoutParams = null;
            if (((C50222JnO) this.l0).getBanAdjustBottomMargin()) {
                C26338AVi.LJI(((C50222JnO) this.l0).LJLIL, 0, Integer.valueOf((int) C78847Ux1.LJJIFFI(8)), 0, Integer.valueOf((int) C78847Ux1.LJJIFFI(8)), false, 16);
                C50222JnO c50222JnO = (C50222JnO) this.l0;
                SearchContainerHeaderVM searchContainerHeaderVM = c50222JnO.LJLJI;
                if (searchContainerHeaderVM != null) {
                    int height = c50222JnO.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = ((C50222JnO) this.l0).getLayoutParams();
                    if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams2 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    if (marginLayoutParams != null) {
                        i2 = marginLayoutParams.topMargin;
                    } else {
                        i2 = 0;
                    }
                    int i4 = height + i2;
                    ViewGroup.LayoutParams layoutParams3 = ((C50222JnO) this.l0).getLayoutParams();
                    if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                        layoutParams = layoutParams3;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams2 != null) {
                        i3 = marginLayoutParams2.bottomMargin;
                    }
                    searchContainerHeaderVM.LLF = ((i4 + i3) + ((int) C78847Ux1.LJJIFFI(8))) - ((C50222JnO) this.l0).getLastBottomMargin();
                }
                ((C50222JnO) this.l0).LJLJJL = (int) C78847Ux1.LJJIFFI(8);
                return;
            }
            if (this.z1) {
                LJJIFFI = 0;
            } else {
                LJJIFFI = (int) C78847Ux1.LJJIFFI(8);
            }
            if (((C50222JnO) this.l0).getLastBottomMargin() != LJJIFFI) {
                C26338AVi.LJI(((C50222JnO) this.l0).LJLIL, 0, Integer.valueOf((int) C78847Ux1.LJJIFFI(8)), 0, Integer.valueOf(LJJIFFI), false, 16);
                C50222JnO c50222JnO2 = (C50222JnO) this.l0;
                SearchContainerHeaderVM searchContainerHeaderVM2 = c50222JnO2.LJLJI;
                if (searchContainerHeaderVM2 != null) {
                    int height2 = c50222JnO2.getHeight();
                    ViewGroup.LayoutParams layoutParams4 = ((C50222JnO) this.l0).getLayoutParams();
                    if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                        layoutParams4 = null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    if (marginLayoutParams3 != null) {
                        i = marginLayoutParams3.topMargin;
                    } else {
                        i = 0;
                    }
                    int i5 = height2 + i;
                    ViewGroup.LayoutParams layoutParams5 = ((C50222JnO) this.l0).getLayoutParams();
                    if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                        layoutParams = layoutParams5;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams4 != null) {
                        i3 = marginLayoutParams4.bottomMargin;
                    }
                    searchContainerHeaderVM2.LLF = ((i5 + i3) + LJJIFFI) - ((C50222JnO) this.l0).getLastBottomMargin();
                }
                ((C50222JnO) this.l0).LJLJJL = LJJIFFI;
            }
        }
    }

    public static final void run$0(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            ((SearchGlobalViewModel) aRunnableS14S0110000_8.l0).LJZ.setValue(Boolean.valueOf(aRunnableS14S0110000_8.z1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        TTVideoEngineImpl tTVideoEngineImpl = (TTVideoEngineImpl) aRunnableS14S0110000_8.l0;
        boolean z = aRunnableS14S0110000_8.z1;
        InterfaceC47825Ipp interfaceC47825Ipp = (InterfaceC47825Ipp) ((HashMap) tTVideoEngineImpl.V0.LIZ).get(1);
        if (interfaceC47825Ipp != null) {
            interfaceC47825Ipp.LJII(z);
        }
        VideoSurface LLJJLIIIJLLLLLLLZ = tTVideoEngineImpl.LLJJLIIIJLLLLLLLZ(true);
        if (LLJJLIIIJLLLLLLLZ != null) {
            LLJJLIIIJLLLLLLLZ.release();
        }
        tTVideoEngineImpl.n1 = false;
        tTVideoEngineImpl.o1 = false;
    }

    public static final void run$10(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        ((InterfaceC47046IdG) aRunnableS14S0110000_8.l0).onResult(Boolean.valueOf(aRunnableS14S0110000_8.z1));
    }

    public static final void run$11(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            C48018Isw c48018Isw = (C48018Isw) aRunnableS14S0110000_8.l0;
            boolean z = aRunnableS14S0110000_8.z1;
            c48018Isw.getClass();
            try {
                c48018Isw.LJLJI.LLFII(z);
                c48018Isw.LJLJI.LJJLI();
            } catch (Exception unused) {
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            ((View) aRunnableS14S0110000_8.l0).setTag(-1282133481, null);
            if (((View) aRunnableS14S0110000_8.l0).isAttachedToWindow() && !aRunnableS14S0110000_8.z1) {
                ((View) aRunnableS14S0110000_8.l0).setVisibility(8);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            aRunnableS14S0110000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            aRunnableS14S0110000_8.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        BaseDiscoverAndSearchFragmentNew baseDiscoverAndSearchFragmentNew = (BaseDiscoverAndSearchFragmentNew) aRunnableS14S0110000_8.l0;
        boolean z = aRunnableS14S0110000_8.z1;
        if (baseDiscoverAndSearchFragmentNew.mStatusDestroyed) {
            return;
        }
        if (z && C39774FjG.LIZ() && !TextUtils.isEmpty(baseDiscoverAndSearchFragmentNew.LJLJJL.getText())) {
            return;
        }
        baseDiscoverAndSearchFragmentNew.zm(false);
    }

    public static final void run$3(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            aRunnableS14S0110000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            EnumC47567Ilf.instance.addEventV2(aRunnableS14S0110000_8.z1, (JSONObject) aRunnableS14S0110000_8.l0, "videoplayer_abrswitch");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean z = aRunnableS14S0110000_8.z1;
        EnumC47567Ilf.instance.LIZJ((JSONObject) aRunnableS14S0110000_8.l0, z);
    }

    public static final void run$6(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            EnumC47567Ilf.instance.addEventV2(aRunnableS14S0110000_8.z1, (JSONObject) aRunnableS14S0110000_8.l0, "videoplayer_oneevent");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        EnumC47567Ilf.instance.addEventV2(aRunnableS14S0110000_8.z1, (JSONObject) aRunnableS14S0110000_8.l0, "videoplayer_oneevent");
    }

    public static final void run$8(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            EnumC47567Ilf.instance.addEventV2(aRunnableS14S0110000_8.z1, (JSONObject) aRunnableS14S0110000_8.l0, "videoplayer_oneopera");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS14S0110000_8 aRunnableS14S0110000_8) {
        boolean LIZ;
        try {
            EnumC47567Ilf.instance.addEventV2(aRunnableS14S0110000_8.z1, (JSONObject) aRunnableS14S0110000_8.l0, "videoplayer_oneevent");
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS14S0110000_8(boolean z, JSONObject jSONObject, int i) {
        this.$t = i;
        switch (i) {
            case 4:
            case 6:
            case 8:
            case 9:
                this.z1 = z;
                this.l0 = jSONObject;
                return;
            case 5:
            case 7:
            default:
                this.z1 = z;
                this.l0 = jSONObject;
                return;
        }
    }

    public ARunnableS14S0110000_8(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
