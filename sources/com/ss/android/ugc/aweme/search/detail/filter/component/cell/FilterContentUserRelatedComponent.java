package com.ss.android.ugc.aweme.search.detail.filter.component.cell;

import X.C51655KPb;
import X.InterfaceC242099en;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FilterContentUserRelatedComponent extends BaseCellSlotComponent<FilterContentUserRelatedComponent> implements InterfaceC242099en {
    public final /* synthetic */ C51655KPb LLFII;

    @Override // X.InterfaceC242099en
    public final void LLLZL(float f) {
        this.LLFII.LLLZL(f);
    }

    @Override // X.InterfaceC242099en
    public final void M0(Aweme aweme) {
        this.LLFII.M0(aweme);
    }

    public FilterContentUserRelatedComponent() {
        new LinkedHashMap();
        InterfaceC242099en.LJII.getClass();
        this.LLFII = new C51655KPb();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        this.LLFII.getClass();
        return R.layout.cfl;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        M0(aweme);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFII.LIZ(view, new AqS170S0100000_4(this, 777));
    }
}
