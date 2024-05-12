package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C16880lQ;
import X.C2055284u;
import X.C78866UxK;
import Y.ACListenerS39S0200000_4;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EditCaptionBottomBarAssem extends BaseCellSlotComponent<EditCaptionBottomBarAssem> {
    public ViewGroup LLFII;
    public TuxTextView LLFZ;
    public TuxTextView LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aas;
    }

    public EditCaptionBottomBarAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C16880lQ.LJIIJ(new ACListenerS39S0200000_4(this, item, 112), Y3().findViewById(R.id.co8));
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        Aweme aweme2 = item.getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        q4(aweme, C78866UxK.LJJLIIIJL(aweme2));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = (ViewGroup) view.findViewById(R.id.co7);
        this.LLFZ = (TuxTextView) view.findViewById(R.id.co_);
        this.LLI = (TuxTextView) view.findViewById(R.id.co8);
        C2055284u.LIZJ(this.LLFZ, null);
        C2055284u.LIZJ(this.LLI, null);
    }

    public final void q4(Aweme aweme, boolean z) {
        ViewGroup viewGroup = this.LLFII;
        if (viewGroup != null) {
            if (z) {
                viewGroup.setVisibility(0);
                ICaptionKevaService LJJJJI = CaptionKevaServiceImpl.LJJJJI();
                String aid = aweme.getAid();
                o.LJIIIIZZ(aid, "aweme.aid");
                LJJJJI.LJJIJIL(aid);
                return;
            }
            viewGroup.setVisibility(8);
        }
    }
}
