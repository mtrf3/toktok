package com.ss.android.ugc.aweme.search.detail.filter.component.cell;

import X.C214298b3;
import X.C2316197d;
import X.C2316297e;
import X.C252449vU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78939UyV;
import X.C8YN;
import X.C92L;
import X.C9BD;
import X.EnumC210578Of;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterContentRootComponent extends BaseContainer<VContainerProtocol, FilterContentRootComponent> {
    public final EnumC210578Of LLFFF;
    public final C214298b3 LLFII;
    public ImageView LLFZ;

    public FilterContentRootComponent() {
        new LinkedHashMap();
        this.LLFFF = EnumC210578Of.SEARCH_DETAIL_FILTER_COMPONENT;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FilterVM.class);
        this.LLFII = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 776), C2316297e.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLFFF;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, X.C8XO
    public final /* bridge */ /* synthetic */ void F0(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        n4(((C252449vU) ((AssemViewModel) this.LLFII.getValue()).getState()).LJLJJL);
    }

    public final void n4(float f) {
        int i;
        View view;
        ImageView imageView;
        float LJIL = C78939UyV.LJIL(f);
        getContainerView().setAlpha(LJIL);
        View containerView = getContainerView();
        int i2 = 0;
        if (LJIL == 0.0f) {
            i = 8;
        } else {
            i = 0;
        }
        containerView.setVisibility(i);
        if (this.LLFZ == null) {
            Object parent = getContainerView().getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null && (imageView = (ImageView) view.findViewById(R.id.hrs)) != null) {
                this.LLFZ = imageView;
            }
        }
        ImageView imageView2 = this.LLFZ;
        if (imageView2 != null) {
            int i3 = 255 - ((int) (255 * LJIL));
            if (i3 > 255) {
                i2 = 255;
            } else if (i3 >= 0) {
                i2 = i3;
            }
            imageView2.setImageAlpha(i2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C78926UyI.LJFF(this, new AqS170S0100000_4(this, 776));
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.97c
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C252449vU) obj).LJLJJL);
            }
        }, null, C2316197d.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.97f
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C252449vU) obj).LJLLI;
            }
        }, null, C92L.LJLIL, 6);
    }
}
