package X;

import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.IDTListenerS117S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOA {
    public final ClickSearchViewModel LIZ;
    public final JP7 LIZIZ;
    public final ViewStub LIZJ;
    public final InterfaceC88471Ynr<JP9, Integer, C76800UCe> LIZLLL;
    public JQA LJ;
    public JQO LJFF;
    public JQO LJI;
    public List<? extends View> LJII;

    public final JQO LIZ() {
        View inflate;
        JQO jqo;
        JQO jqo2;
        ViewGroup viewGroup;
        if (this.LJI == null && this.LIZJ.getParent() != null) {
            this.LIZJ.setLayoutResource(R.layout.cfb);
            ViewStub viewStub = this.LIZJ;
            if (C49500Jbk.LIZIZ()) {
                ViewParent parent = viewStub.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    int indexOfChild = viewGroup.indexOfChild(viewStub);
                    Context context = viewGroup.getContext();
                    o.LJIIIIZZ(context, "it.context");
                    inflate = C38619FDr.LIZIZ(R.layout.cfb, context, viewGroup, false);
                    C16880lQ.LLIIII(viewStub, viewGroup);
                    ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(inflate, indexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(inflate, indexOfChild);
                    }
                } else {
                    inflate = null;
                }
            } else {
                inflate = viewStub.inflate();
            }
            if (!(inflate instanceof JQO) || (jqo = (JQO) inflate) == null) {
                return null;
            }
            this.LJI = jqo;
            this.LJFF = jqo;
            jqo.setVisibility(4);
            jqo.setAlwaysShowingViews(this.LJII);
            jqo.setOnCloseClickListener(new AqS174S0100000_8(this, 264));
            jqo.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 103)));
            if (JQ0.LIZ() && (jqo2 = this.LJI) != null) {
                jqo2.setOnTouchListener(new IDTListenerS117S0100000_8(this, 17));
            }
        }
        return this.LJI;
    }

    public final void LIZIZ() {
        C49068JNo.LJLJLJ.getClass();
        if (C49068JNo.LJJIZ() == 0) {
            new AqS174S0100000_8(this, 263).invoke(this.LIZ.iv0().getValue());
        } else {
            JQO LIZ = LIZ();
            if (LIZ != null) {
                LIZ.LIZ();
            }
            this.LIZ.lv0(null);
        }
    }

    public final void LIZJ() {
        Aweme currentAweme = this.LIZIZ.getCurrentAweme();
        if (currentAweme == null || currentAweme.isAd()) {
            return;
        }
        SearchResultParam LJLJLLL = this.LIZIZ.LJLJLLL();
        C49068JNo.LJLJLJ.getClass();
        int LJJIZ = C49068JNo.LJJIZ();
        if (LJLJLLL != null) {
            this.LIZ.getClass();
            if (C34478Dg2.LIZ()) {
                if (LJJIZ == 0) {
                    JQO LIZ = LIZ();
                    if (LIZ != null && LIZ.getVisibility() == 0) {
                        JQO LIZ2 = LIZ();
                        if (LIZ2 != null) {
                            LIZ2.LIZIZ();
                        }
                        this.LIZ.lv0(null);
                        return;
                    }
                    this.LIZ.kv0(this.LIZIZ.LJLL());
                    ClickSearchViewModel clickSearchViewModel = this.LIZ;
                    String keyword = LJLJLLL.getKeyword();
                    o.LJIIIIZZ(keyword, "searchParam.keyword");
                    clickSearchViewModel.gv0(this.LIZIZ.LJLL(), 0, currentAweme, keyword);
                    return;
                }
                JQO LIZ3 = LIZ();
                if (LIZ3 != null) {
                    LIZ3.LIZ();
                }
                this.LIZ.kv0(this.LIZIZ.LJLL());
                ClickSearchViewModel clickSearchViewModel2 = this.LIZ;
                String keyword2 = LJLJLLL.getKeyword();
                o.LJIIIIZZ(keyword2, "searchParam.keyword");
                clickSearchViewModel2.gv0(this.LIZIZ.LJLL(), LJJIZ, currentAweme, keyword2);
            }
        }
    }

    public JOA(ClickSearchViewModel viewModel, JP7 viewHolder, ViewStub viewStub, AqS190S0100000_8 aqS190S0100000_8) {
        Fragment fragment;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(viewHolder, "viewHolder");
        this.LIZ = viewModel;
        this.LIZIZ = viewHolder;
        this.LIZJ = viewStub;
        this.LIZLLL = aqS190S0100000_8;
        viewModel.jv0(new AObserverS76S0100000_8(this, 139));
        AObserverS76S0100000_8 aObserverS76S0100000_8 = new AObserverS76S0100000_8(this, UserLevelGeckoUpdateSetting.DEFAULT);
        WeakReference<Fragment> weakReference = viewModel.LJLIL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            C68182ly.LIZIZ(viewModel.hv0(), fragment, aObserverS76S0100000_8);
        }
    }
}
