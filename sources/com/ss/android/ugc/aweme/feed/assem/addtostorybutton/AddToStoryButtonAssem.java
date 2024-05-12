package com.ss.android.ugc.aweme.feed.assem.addtostorybutton;

import X.C16880lQ;
import X.C221018lt;
import X.C54838Lfe;
import X.HG3;
import X.SY4;
import Y.ACListenerS25S1200000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddToStoryButtonAssem extends BaseCellSlotComponent<AddToStoryButtonAssem> {
    public View LLFII;
    public SY4 LLFZ;
    public String LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aca;
    }

    public AddToStoryButtonAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        C221018lt.LIZ("AddToStoryButtonAssem", "onBind");
        String str = item.mEventType;
        o.LJIIIIZZ(str, "item.eventType");
        HG3.LJIIL();
        String curUserId = HG3.LJLJL.LJFF().getCurUserId();
        this.LLI = C54838Lfe.LIZLLL(item.getAweme(), curUserId);
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        C54838Lfe.LIZ(curUserId, aweme, str);
        SY4 sy4 = this.LLFZ;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS25S1200000_3(this, item, str, 5));
        } else {
            o.LJIJI("addToStoryButton");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFII = view;
        View findViewById = view.findViewById(R.id.w9);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.add_to_story_button)");
        this.LLFZ = (SY4) findViewById;
    }
}
