package com.ss.android.ugc.aweme.choosemusic.fragment;

import X.ActivityC45651qj;
import X.C207668Da;
import X.C221108m2;
import X.C4II;
import X.C59859NeR;
import X.C62822Ol8;
import X.C72834SiE;
import X.C84887XTf;
import X.C84892XTk;
import X.C84934XVa;
import X.C84964XWe;
import X.C84970XWk;
import X.EnumC84975XWp;
import X.InterfaceC191547fS;
import X.InterfaceC84984XWy;
import X.OGG;
import X.XRT;
import X.XVF;
import X.XVG;
import X.XVW;
import X.XWQ;
import X.XWR;
import X.XX7;
import X.XY4;
import X.XYG;
import X.XYV;
import android.util.Pair;
import android.view.View;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ForYouMusicFragment extends BaseMusicListFragment<C84934XVa> implements XYV<C84934XVa>, InterfaceC191547fS, OGG {
    public static final /* synthetic */ int LJLZ = 0;
    public XY4 LJLLL;
    public final Map<Integer, View> LJLLLLLL = new LinkedHashMap();
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 227));

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int Al() {
        return 14;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final String Dl() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final boolean Gl() {
        return false;
    }

    @Override // X.InterfaceC84974XWo
    public final String LLJJJ() {
        return "for_you_tab_list_data";
    }

    @Override // X.InterfaceC84974XWo
    public final String V() {
        return "for_you_tab_list_refresh_status";
    }

    @Override // X.InterfaceC84974XWo
    public final String b() {
        return "for_you_tab_list_load_more_status";
    }

    @Override // X.XYV
    public final void pk() {
    }

    @Override // X.XYV
    public final void refreshData() {
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final int wl() {
        return R.layout.aww;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        DataCenter dataCenter;
        Integer num;
        String value;
        if (this.LJLJJL != null && (dataCenter = this.LJLJJLL) != null) {
            XRT xrt = (XRT) dataCenter.get("for_you_tab_list_data");
            Object obj = this.LJLJLJ;
            if (obj instanceof XWR) {
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.view.BaseMusicListView<*>");
                if (((XWR) obj).LJIIJJI) {
                    InterfaceC84984XWy<T> interfaceC84984XWy = this.LJLJLJ;
                    if (interfaceC84984XWy != 0) {
                        interfaceC84984XWy.showLoadMoreLoading();
                    }
                    if (xrt != null) {
                        XVW xvw = this.LJLJJL;
                        Object LIZ = xrt.LIZ("list_cursor");
                        o.LJIIIIZZ(LIZ, "bundleData.get(WidgetConstants.LIST_CURSOR)");
                        int intValue = ((Number) LIZ).intValue();
                        int i = this.LJLJLLL;
                        xvw.getClass();
                        String LIZ2 = C84892XTk.LIZ();
                        if (C59859NeR.LIZ()) {
                            num = 24;
                        } else {
                            num = null;
                        }
                        if (C84887XTf.LIZ()) {
                            try {
                                value = GsonHolder.LIZLLL().LIZ().LJIILL(C72834SiE.LIZ);
                            } catch (Throwable unused) {
                                value = "";
                            }
                            o.LJIIIIZZ(value, "value");
                            xvw.LIZIZ(ChooseMusicApi.LJFF(Integer.valueOf(intValue), num, null, false, i, LIZ2, value), null, null, true, true);
                            return;
                        }
                        xvw.LIZIZ(ChooseMusicApi.LJFF(Integer.valueOf(intValue), num, null, false, i, LIZ2, null), null, null, true, false);
                    }
                }
            }
        }
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

    @Override // X.XYV
    public final void LJI() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.onBackPressed();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, X.InterfaceC84974XWo
    public final DataCenter cg() {
        DataCenter cg = super.cg();
        this.LJLJJLL = cg;
        cg.iv0("data_challenge", this, false);
        cg.iv0("data_sticker", this, false);
        DataCenter mDataCenter = this.LJLJJLL;
        o.LJIIIIZZ(mDataCenter, "mDataCenter");
        return mDataCenter;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLLLLLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    /* renamed from: Hl */
    public final void onChanged(C207668Da c207668Da) {
        String str;
        String str2;
        super.onChanged(c207668Da);
        if (isViewValid() && c207668Da != null && (str = c207668Da.LIZ) != null) {
            int hashCode = str.hashCode();
            if (hashCode != 1730565544) {
                if (hashCode != 2085247502) {
                    return;
                } else {
                    str2 = "data_challenge";
                }
            } else {
                str2 = "data_sticker";
            }
            str.equals(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment, androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C207668Da c207668Da) {
        onChanged(c207668Da);
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.fragment.BaseMusicListFragment
    public final InterfaceC84984XWy<C84934XVa> vl(View view) {
        XWQ xwq = new XWQ(getContext(), view, this, R.string.iqy, this, this, this.LJLLJ, EnumC84975XWp.FOR_YOU_PAGE, this.LJLLILLLL);
        xwq.LIZ.setVisibility(8);
        xwq.LJII(this);
        xwq.LJIIL = C84964XWe.LIZ(this);
        xwq.LJIIJ(new Pair<>(Long.valueOf(this.LJLL), Long.valueOf(this.LJLLI)));
        int i = this.LJLJLLL;
        C4II c4ii = xwq.LJFF;
        if (c4ii instanceof XX7) {
            ((XX7) c4ii).LJLLL = i;
        }
        String str = (String) this.LJLJJLL.get("sticker_id", null);
        C4II c4ii2 = xwq.LJFF;
        if (c4ii2 instanceof XX7) {
            ((XX7) c4ii2).LJLLLL = str;
        }
        String str2 = (String) this.LJLJJLL.get("challenge_id", null);
        C4II c4ii3 = xwq.LJFF;
        if (c4ii3 instanceof XX7) {
            ((XX7) c4ii3).LJLLLLLL = str2;
        }
        XVG xvg = new XVG("change_music_page", "recommend", "", XVF.LIZ);
        xvg.LJIILIIL = "popular_song";
        xvg.LIZIZ("recommend_mc_id");
        xwq.LJIIIZ(xvg);
        xwq.LJIIIIZZ((C84970XWk) this.LJLLLL.getValue());
        xwq.LJ(new XYG(this), 5);
        C4II c4ii4 = xwq.LJFF;
        if (c4ii4 instanceof XX7) {
            ((XX7) c4ii4).LJLL = true;
        }
        return xwq;
    }

    @Override // X.XYV
    public final /* bridge */ /* synthetic */ void LLLF(Object obj) {
    }
}
