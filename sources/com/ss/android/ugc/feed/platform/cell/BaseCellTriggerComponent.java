package com.ss.android.ugc.feed.platform.cell;

import X.C3C8;
import X.C8VR;
import X.InterfaceC65350Pko;
import X.TCM;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseCellTriggerComponent<RECEIVER extends C3C8> extends BaseCellContentComponent<RECEIVER> {
    public BaseFeedPageParams LL;
    public boolean LLD;

    public boolean b4(BaseFeedPageParams baseFeedPageParams) {
        return true;
    }

    public abstract InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> e4();

    public abstract boolean k4(VideoItemParams videoItemParams);

    public BaseCellTriggerComponent() {
        new LinkedHashMap();
        this.LLD = true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent
    /* renamed from: Z3 */
    public boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (TCM.LJIILIIL(this)) {
            boolean k4 = k4(item);
            this.LLD = k4;
            return k4;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8XO
    public /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return c2((VideoItemParams) obj);
    }

    @Override // X.C8XO
    /* renamed from: g4, reason: merged with bridge method [inline-methods] */
    public void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if ((TCM.LJIILIIL(this) && this.LLD) || k4(item)) {
            C8VR.LIZJ(this, e4());
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3((BaseCellTriggerComponent) this, 542));
    }

    public boolean c4(BaseFeedPageParams baseFeedPageParams, int i) {
        return b4(baseFeedPageParams);
    }
}
