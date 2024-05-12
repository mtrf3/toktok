package com.ss.android.ugc.aweme.kids.discovery.gallery;

import X.C16880lQ;
import X.C198517qh;
import X.C39398FdC;
import X.C61878OQg;
import X.EnumC72807Shn;
import X.G4Y;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment;
import com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GalleryGridFragment extends KidsAwemeGridFragment {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final Map<Integer, View> LJLJLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final boolean Il() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final String wl() {
        return "gallery";
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void Al() {
        String str;
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("challenge_id")) == null) {
            str = "";
        }
        C39398FdC.LIZIZ("end_feed_category_details_page", q.LIZJ(c198517qh.LIZ, "category_id", str, c198517qh, c39398FdC));
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("challenge_id")) == null) {
            str = "";
        }
        C39398FdC.LIZIZ("exit_category_details_page", q.LIZJ(c198517qh.LIZ, "category_id", str, c198517qh, c39398FdC));
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final View vl() {
        if (getContext() == null) {
            return null;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bfe, null, false);
        W5F LJIIIIZZ = W5U.LJIIIIZZ("https://p16-amd-va.tiktokcdn.com/obj/tiktok-obj/empty_footer.png");
        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LJIIIIZZ.LJJIIJZLJL = (ImageView) LLLLIILL.findViewById(R.id.fdf);
        C16880lQ.LLJJJ(LJIIIIZZ);
        return LLLLIILL;
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        C39398FdC c39398FdC = C39398FdC.LIZ;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", "discovery");
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments == null || (str = arguments.getString("mob_enter_from")) == null) {
            str = "";
        }
        c198517qh.LIZ.put("enter_method", str);
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("challenge_id")) != null) {
            str2 = string;
        }
        C39398FdC.LIZIZ("show_category_details_page", q.LIZJ(c198517qh.LIZ, "category_id", str2, c198517qh, c39398FdC));
    }

    @Override // com.ss.android.ugc.aweme.kids.common.ui.awemegrid.KidsAwemeGridFragment
    public final void xl(View view, Aweme aweme) {
        Context context;
        List<Aweme> awemes;
        MutableLiveData<List<Aweme>> mutableLiveData;
        if (aweme != null && (context = getContext()) != null) {
            KidsAwemeGridViewModel kidsAwemeGridViewModel = this.LJLJJI;
            if (kidsAwemeGridViewModel == null || (mutableLiveData = kidsAwemeGridViewModel.LJLILLLLZI) == null || (awemes = mutableLiveData.getValue()) == null) {
                awemes = C61878OQg.INSTANCE;
            }
            o.LJIIIZ(awemes, "awemes");
            G4Y.LIZ = new WeakReference<>(awemes);
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//kids/discovery/feed");
            buildRoute.withParam("current_id", String.valueOf(aweme.getAid()));
            buildRoute.withParam("enter_from", "category_details_page");
            buildRoute.withParam("preload_from_cache", true);
            buildRoute.withParam(getArguments());
            buildRoute.open();
        }
    }
}
