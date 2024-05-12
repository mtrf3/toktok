package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C210428Nq;
import X.C221108m2;
import X.C62822Ol8;
import X.C78880UxY;
import X.C78996UzQ;
import X.C8MZ;
import X.C8T7;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NewReportWarnBottomBarAssem extends BaseCellSlotComponent<NewReportWarnBottomBarAssem> implements ComponentPriorityProtocol {
    public final C62822Ol8 LLFII;
    public ConstraintLayout LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.aee;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        return "left_container_warning";
    }

    public NewReportWarnBottomBarAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1266));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        boolean z;
        String str;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        getContainerView().setVisibility(8);
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLFII.getValue();
        if (interactAreaCommonAbility != null && interactAreaCommonAbility.vp()) {
            z = true;
        } else {
            z = false;
        }
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (C78880UxY.LJJJLIIL(aweme)) {
            BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
            if (baseFeedPageParams != null) {
                str = baseFeedPageParams.eventType;
            } else {
                str = null;
            }
            if (!o.LJ(str, "personal_homepage") && C78996UzQ.LJJIJIL(item.getAweme()) && item.getAweme().getAwemeRiskModel().isWarn() && TextUtils.isEmpty(item.getAweme().getAwemeRiskModel().getUrl()) && !C210428Nq.LIZ()) {
                getContainerView().setVisibility(0);
                Aweme aweme2 = item.getAweme();
                o.LJIIIIZZ(aweme2, "item.aweme");
                C8MZ.LIZIZ(aweme2, this.LLFZ, item.mEventType);
                if (z) {
                    InteractAreaCommonAbility interactAreaCommonAbility2 = (InteractAreaCommonAbility) this.LLFII.getValue();
                    if (interactAreaCommonAbility2 != null) {
                        interactAreaCommonAbility2.zn("left_container_warning", this, true);
                        return;
                    }
                    return;
                }
                InteractAreaCommonAbility interactAreaCommonAbility3 = (InteractAreaCommonAbility) this.LLFII.getValue();
                if (interactAreaCommonAbility3 == null) {
                    return;
                }
                interactAreaCommonAbility3.U00(this, null, null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFZ = (ConstraintLayout) view.findViewById(R.id.d8f);
    }
}
