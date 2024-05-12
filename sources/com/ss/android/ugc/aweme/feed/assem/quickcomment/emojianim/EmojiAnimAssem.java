package com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim;

import X.C178726zs;
import X.C182187Da;
import X.C182197Db;
import X.C182207Dc;
import X.C1DH;
import X.C213688a4;
import X.C214348b8;
import X.C5H3;
import X.C65352Pkq;
import X.C7DY;
import X.C7DZ;
import X.C80985VqP;
import X.C8YN;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class EmojiAnimAssem extends FeedBaseAssem<EmojiAnimAssem> {
    public C80985VqP LLFFF;
    public final C5H3 LLFII;
    public final C5H3 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aau;
    }

    public EmojiAnimAssem() {
        new LinkedHashMap();
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoEventDispatchViewModel.class), C182197Db.INSTANCE);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C182207Dc.INSTANCE);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(this, 67));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem, X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(VideoItemParams videoItemParams) {
        return c2(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem
    /* renamed from: m4 */
    public final boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return C178726zs.LIZLLL(item.getAweme());
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFFF = new C80985VqP((EmojiAnimPlayground) view);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.7DX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C8UB) obj).LJLZ;
            }
        }, null, C7DZ.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7Dd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C182187Da.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7De
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJZI;
            }
        }, C213688a4.LIZLLL(), C7DY.LJLIL, 4);
    }
}
