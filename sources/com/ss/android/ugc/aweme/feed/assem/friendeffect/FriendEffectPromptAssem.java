package com.ss.android.ugc.aweme.feed.assem.friendeffect;

import X.C110614Vt;
import X.C16880lQ;
import X.C212688Wi;
import X.C212698Wj;
import X.C47261Igj;
import X.C61328O5c;
import X.C71313Ryn;
import X.W5F;
import X.W5U;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FriendEffectPromptAssem extends BaseCellSlotComponent<FriendEffectPromptAssem> {
    public View LLFII;
    public View LLFZ;
    public SmartImageView LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.af3;
    }

    public FriendEffectPromptAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (C47261Igj.LJJIJIIJI(3, 4).contains(Integer.valueOf(C212698Wj.LIZ().group))) {
            View view = this.LLFII;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.LLFZ;
            if (view2 == null) {
                return;
            }
            view2.setVisibility(8);
            return;
        }
        View view3 = this.LLFII;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.LLFZ;
        if (view4 != null) {
            view4.setVisibility(0);
        }
        String LIZIZ = C212688Wi.LIZIZ(item.getAweme());
        if (LIZIZ != null) {
            SmartImageView smartImageView = this.LLI;
            if (smartImageView != null) {
                smartImageView.setVisibility(0);
            }
            W5F LJIIIIZZ = W5U.LJIIIIZZ(LIZIZ);
            LJIIIIZZ.LJJIIJ = this.LLI;
            C16880lQ.LLJJJ(LJIIIIZZ);
            return;
        }
        SmartImageView smartImageView2 = this.LLI;
        if (smartImageView2 == null) {
            return;
        }
        smartImageView2.setVisibility(8);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = view.findViewById(R.id.azh);
        this.LLFZ = view.findViewById(R.id.azg);
        this.LLI = (SmartImageView) view.findViewById(R.id.f2g);
        View view2 = this.LLFZ;
        if (view2 == null) {
            return;
        }
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        C71313Ryn.LIZIZ(view, "view.context", c110614Vt, view2);
    }
}
