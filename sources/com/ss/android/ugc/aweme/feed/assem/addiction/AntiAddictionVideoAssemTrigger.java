package com.ss.android.ugc.aweme.feed.assem.addiction;

import X.C3C8;
import X.C55096Ljo;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class AntiAddictionVideoAssemTrigger extends BaseCellTriggerComponent<AntiAddictionVideoAssemTrigger> {
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4() {
        return C65352Pkq.LIZ(AntiAddictionVideoAssem.class);
    }

    public AntiAddictionVideoAssemTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* renamed from: g4 */
    public final void F0(VideoItemParams item) {
        InteractAreaAttachAbility interactAreaAttachAbility;
        o.LJIIIZ(item, "item");
        super.F0(item);
        getContainerView().setVisibility(8);
        if (k4(item) && (interactAreaAttachAbility = (InteractAreaAttachAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractInfoAreaAttachAbility.class, null)) != null) {
            interactAreaAttachAbility.Sn(this, new AqS153S0100000_3(this, 282));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean k4(VideoItemParams item) {
        String str;
        o.LJIIIZ(item, "item");
        if (a1().LIZ != 4 && a.LIZLLL().LJIIIIZZ()) {
            String LJII = a.LIZLLL().LJII();
            Aweme aweme = item.getAweme();
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            if (LJII.length() > 0 && o.LJ(LJII, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        if (!o.LJ("homepage_hot", baseFeedPageParams.eventType) || i == 4 || i == 1) {
            return false;
        }
        return true;
    }
}
