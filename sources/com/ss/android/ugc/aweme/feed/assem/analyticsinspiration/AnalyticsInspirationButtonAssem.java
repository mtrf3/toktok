package com.ss.android.ugc.aweme.feed.assem.analyticsinspiration;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C212428Vi;
import X.C221108m2;
import X.C26045AKb;
import X.C51029K0z;
import X.C62822Ol8;
import X.C81493Ht;
import X.FMX;
import X.QD3;
import X.SY4;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AnalyticsInspirationButtonAssem extends BaseCellSlotComponent<AnalyticsInspirationButtonAssem> {
    public SY4 LLFII;
    public VideoItemParams LLFZ;
    public final C62822Ol8 LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.add;
    }

    public AnalyticsInspirationButtonAssem() {
        new LinkedHashMap();
        this.LLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 59));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void c4() {
        if (!EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIILJJIL(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void e4() {
        if (EventBus.LIZJ().LJI(this)) {
            EventBus.LIZJ().LJIJ(this);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        this.LLFZ = item;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onLoadMoreEmptyEvent(C81493Ht event) {
        VideoItemParams videoItemParams;
        ActivityC45651qj LIZ;
        o.LJIIIZ(event, "event");
        if (C19N.LJ("creator_m10n_analytics_last_video_toast_is_enabled", false) && o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "creation_inspiration") && (videoItemParams = this.LLFZ) != null && videoItemParams.currentPosition == ((Number) this.LLI.getValue()).intValue() - 1 && (LIZ = C212428Vi.LIZ(this)) != null) {
            String str = null;
            try {
                String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).trackerData;
                if (str2 != null) {
                    str = JSONObjectProtectorUtils.getString(new JSONObject(str2), "inspiration_tab");
                }
            } catch (Exception unused) {
            }
            C26045AKb c26045AKb = new C26045AKb(LIZ);
            c26045AKb.LJIIIIZZ(R.string.boc);
            c26045AKb.LJIIJ();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("category_name", str);
            c188727au.LJIIIZ("group_id", ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().getGroupId());
            FMX.LJIIL("creation_inspiration_feed_scroll_end_show", c188727au.LIZ);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String str;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.kda);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.start_new_button)");
        this.LLFII = (SY4) findViewById;
        if (C19N.LJ("creator_m10n_paid_content_promotion_education_enabled", false) && o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "creator_series_outreach")) {
            SY4 sy4 = this.LLFII;
            if (sy4 != null) {
                Context context = getContext();
                if (context != null) {
                    str = context.getString(R.string.qj_);
                } else {
                    str = null;
                }
                sy4.setText(str);
            } else {
                o.LJIJI("startNewVideoButton");
                throw null;
            }
        }
        if (C19N.LJ("creator_m10n_android_inspiration_feed_button_is_enabled", true) && o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "creation_inspiration")) {
            SY4 sy42 = this.LLFII;
            if (sy42 != null) {
                sy42.setButtonStartIcon(Integer.valueOf(R.raw.icon_video_fill));
            } else {
                o.LJIJI("startNewVideoButton");
                throw null;
            }
        }
        SY4 sy43 = this.LLFII;
        if (sy43 != null) {
            C16880lQ.LJJIZ(sy43, new ACListenerS38S0200000_3(this, view, 30));
        } else {
            o.LJIJI("startNewVideoButton");
            throw null;
        }
    }
}
