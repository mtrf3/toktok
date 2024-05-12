package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C16880lQ;
import X.C2055284u;
import X.C78963Uyt;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GiftBagBottomBarAssem extends BaseCellSlotComponent<GiftBagBottomBarAssem> {
    public ConstraintLayout LLFII;
    public final IVideoGiftService LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ab7;
    }

    public GiftBagBottomBarAssem() {
        new LinkedHashMap();
        IVideoGiftService LJI = VideoGiftService.LJI();
        o.LJIIIIZZ(LJI, "get().getService(IVideoGiftService::class.java)");
        this.LLFZ = LJI;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        String str;
        Resources resources;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        boolean LJJIZ = C78963Uyt.LJJIZ(aweme, this.LLFZ);
        ConstraintLayout constraintLayout = this.LLFII;
        if (constraintLayout != null) {
            if (LJJIZ) {
                constraintLayout.setVisibility(0);
                TextView textView = (TextView) constraintLayout.findViewById(R.id.dun);
                if (textView != null) {
                    Context context = constraintLayout.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        str = resources.getString(R.string.cbw);
                    } else {
                        str = null;
                    }
                    textView.setText(str);
                }
                C16880lQ.LJIL(constraintLayout, new ACListenerS23S0100000_3(item, 314));
                return;
            }
            constraintLayout.setVisibility(8);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.dum);
        this.LLFII = constraintLayout;
        if (constraintLayout != null) {
            tuxTextView = (TuxTextView) constraintLayout.findViewById(R.id.dun);
        } else {
            tuxTextView = null;
        }
        C2055284u.LIZJ(tuxTextView, null);
    }
}
