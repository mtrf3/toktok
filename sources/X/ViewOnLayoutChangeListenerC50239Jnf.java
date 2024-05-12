package X;

import Y.AObserverS76S0100000_8;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.SearchActivityCardBgData;
import com.ss.android.ugc.aweme.search.pages.common.theme.ThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.SearchActivityCardBgController;
import kotlin.jvm.internal.o;

/* renamed from: X.Jnf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC50239Jnf implements View.OnLayoutChangeListener {
    public final /* synthetic */ GlobalDoodleConfig LJLIL;
    public final /* synthetic */ SearchActivityCardBgController LJLILLLLZI;
    public final /* synthetic */ RecyclerView LJLJI;
    public final /* synthetic */ C50240Jng LJLJJI;

    public ViewOnLayoutChangeListenerC50239Jnf(GlobalDoodleConfig globalDoodleConfig, SearchActivityCardBgController searchActivityCardBgController, C49710Jf8 c49710Jf8, C50240Jng c50240Jng) {
        this.LJLIL = globalDoodleConfig;
        this.LJLILLLLZI = searchActivityCardBgController;
        this.LJLJI = c49710Jf8;
        this.LJLJJI = c50240Jng;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        Integer num;
        boolean z;
        int i10;
        boolean z2;
        SearchActivityCardBgData activityCardBg;
        SearchActivityCardBgData activityCardBg2;
        Integer activityBgRange;
        GlobalDoodleConfig globalDoodleConfig = this.LJLIL;
        if (globalDoodleConfig != null && (activityCardBg2 = globalDoodleConfig.getActivityCardBg()) != null && (activityBgRange = activityCardBg2.getActivityBgRange()) != null) {
            i9 = activityBgRange.intValue();
        } else {
            i9 = 0;
        }
        GlobalDoodleConfig globalDoodleConfig2 = this.LJLIL;
        if (globalDoodleConfig2 != null && (activityCardBg = globalDoodleConfig2.getActivityCardBg()) != null) {
            num = activityCardBg.getBgColorMode();
        } else {
            num = null;
        }
        this.LJLILLLLZI.LJFF().LJLJI = 0;
        ThemeViewModel LJFF = this.LJLILLLLZI.LJFF();
        int mode = EnumC123934th.GRADIENT_COLOR.getMode();
        if (num == null || num.intValue() != mode) {
            z = false;
        } else {
            z = true;
        }
        LJFF.LJLJJI = z;
        boolean z3 = true;
        for (int i11 = 0; i11 < i9; i11++) {
            SearchActivityCardBgController searchActivityCardBgController = this.LJLILLLLZI;
            RecyclerView recyclerView = this.LJLJI;
            searchActivityCardBgController.getClass();
            RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(recyclerView.getChildAt(i11));
            View childAt = recyclerView.getChildAt(i11);
            if (childAt != null) {
                i10 = childAt.getHeight();
            } else {
                i10 = 0;
            }
            if (!(LJJJJJL instanceof JSH) || i10 > searchActivityCardBgController.LJLJJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            OSZ osz = new OSZ(Integer.valueOf(i10), Boolean.valueOf(z2));
            int intValue = ((Number) osz.getFirst()).intValue();
            if (((Boolean) osz.getSecond()).booleanValue()) {
                this.LJLILLLLZI.LJFF().LJLJI += intValue;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            SearchActivityCardBgController searchActivityCardBgController2 = this.LJLILLLLZI;
            C50240Jng info = this.LJLJJI;
            searchActivityCardBgController2.getClass();
            o.LJIIIZ(info, "info");
            searchActivityCardBgController2.LJLLILLLL = info;
            if (searchActivityCardBgController2.LJLLI) {
                ThemeViewModel LJFF2 = searchActivityCardBgController2.LJFF();
                LJFF2.getClass();
                LJFF2.hv0().postValue(info);
            } else {
                searchActivityCardBgController2.LJLL = true;
            }
            ((LiveData) searchActivityCardBgController2.LJFF().LJLJJLL.getValue()).observe(searchActivityCardBgController2.LJLIL, new AObserverS76S0100000_8(searchActivityCardBgController2, 151));
            this.LJLJI.removeOnLayoutChangeListener(this.LJLILLLLZI.LJLLJ);
        }
    }
}
