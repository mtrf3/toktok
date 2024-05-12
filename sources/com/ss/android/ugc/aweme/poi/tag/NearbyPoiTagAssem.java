package com.ss.android.ugc.aweme.poi.tag;

import X.C199837sp;
import X.C214348b8;
import X.C5H3;
import X.C65352Pkq;
import X.C86577XyP;
import X.C86578XyQ;
import X.C8YN;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class NearbyPoiTagAssem extends BaseCellSlotComponent<NearbyPoiTagAssem> {
    public final C5H3 LLFII;
    public C199837sp LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final AqS165S0100000_15 LLII;

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c01;
    }

    public NearbyPoiTagAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C86578XyQ.INSTANCE);
        this.LLII = new AqS165S0100000_15(this, 557);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C199837sp c199837sp = this.LLFZ;
        if (c199837sp != null) {
            Aweme aweme = item.getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            c199837sp.setData(aweme);
        }
        this.LLIFFJFJJ = true;
        this.LLII.invoke();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLI = false;
        this.LLIFFJFJJ = false;
        this.LLFZ = (C199837sp) view.findViewById(R.id.hv5);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.XyK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C86577XyP.LJLIL, 6);
    }
}
