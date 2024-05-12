package com.ss.android.ugc.aweme.casting.ui.casting;

import X.C221108m2;
import X.C34L;
import X.C34M;
import X.C56509MFt;
import X.C62822Ol8;
import X.C71042qa;
import X.C71082qe;
import X.C78688UuS;
import X.F6I;
import X.KRA;
import Y.AObserverS69S0100000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CastingCellComponent extends BaseCellContentComponent<CastingCellComponent> implements C34M {
    public final C62822Ol8 LL;

    @Override // X.C34M
    public final void LJIL(String aid) {
        o.LJIIIZ(aid, "aid");
    }

    @Override // X.C34M
    public final void o5() {
    }

    @Override // X.C34M
    public final void q5(boolean z) {
    }

    @Override // X.C34M
    public final void s5() {
    }

    @Override // X.C34M
    public final void v5(Aweme aweme) {
    }

    public CastingCellComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 43));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        String str2;
        C34L c34l;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null) {
            return;
        }
        KRA LIZIZ = a1().LIZIZ();
        View view = null;
        if (LIZIZ != null) {
            str = C56509MFt.LIZLLL(LIZIZ);
        } else {
            str = null;
        }
        C71082qe c71082qe2 = C71042qa.LIZIZ;
        if (c71082qe2 != null && (c34l = c71082qe2.LIZJ) != null) {
            str2 = c34l.LIZJ;
        } else {
            str2 = null;
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) this.LL.getValue();
        if (iVideoCellAbility != null) {
            view = iVideoCellAbility.Lt();
        }
        if (c71082qe.LIZJ.LJFF() && C78688UuS.LJJJJJ(item.getAweme())) {
            getContainerView().setVisibility(0);
            if (view == null) {
                return;
            }
            view.setVisibility(0);
            return;
        }
        getContainerView().setVisibility(8);
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        Drawable drawable;
        o.LJIIIZ(view, "view");
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe == null || !F6I.LIZ()) {
            return;
        }
        View containerView = getContainerView();
        Context context = getContext();
        if (context != null) {
            drawable = context.getDrawable(R.drawable.a_1);
        } else {
            drawable = null;
        }
        containerView.setBackground(drawable);
        c71082qe.LIZJ.LIZ(this);
        MutableLiveData<ServiceInfo> mutableLiveData = c71082qe.LIZIZ.LJIIIIZZ;
        if (mutableLiveData != null) {
            mutableLiveData.observe(getHostLifecycleOwner(), new AObserverS69S0100000_1(this, 14));
        }
    }
}
