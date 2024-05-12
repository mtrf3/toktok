package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C2055284u;
import X.C221108m2;
import X.C62822Ol8;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ScheduleBottomBarAssem extends BaseCellSlotComponent<ScheduleBottomBarAssem> {
    public final C62822Ol8 LLFII;
    public ViewGroup LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aef;
    }

    public ScheduleBottomBarAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1282));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) this.LLFII.getValue();
        if (rootCellCommonAbility != null) {
            rootCellCommonAbility.Cf0(this.LLFZ);
        }
        o.LJIIIIZZ(item.getAweme(), "item.aweme");
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        String str = item.mEventType;
        o.LJIIIIZZ(str, "item.eventType");
        if (!aweme.isAd() && aweme.isScheduleVideo() && !TextUtils.equals(str, "homepage_follow")) {
            RootCellCommonAbility rootCellCommonAbility2 = (RootCellCommonAbility) this.LLFII.getValue();
            if (rootCellCommonAbility2 != null) {
                rootCellCommonAbility2.Eb0(this.LLFZ);
                return;
            }
            return;
        }
        RootCellCommonAbility rootCellCommonAbility3 = (RootCellCommonAbility) this.LLFII.getValue();
        if (rootCellCommonAbility3 == null) {
            return;
        }
        rootCellCommonAbility3.Cf0(this.LLFZ);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        this.LLFZ = viewGroup;
        if (viewGroup != null) {
            tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.min);
        } else {
            tuxTextView = null;
        }
        C2055284u.LIZJ(tuxTextView, null);
    }
}
