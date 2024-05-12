package com.ss.android.ugc.feed.platform.container.info;

import X.C210568Oe;
import X.C214348b8;
import X.C241249dQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8ON;
import X.EnumC210578Of;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.feed.platform.container.core.BaseContainer;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;

/* loaded from: classes4.dex */
public final class FeedInfoAboveAnchorAreaContainer extends BaseContainer<VContainerProtocol, FeedInfoAboveAnchorAreaContainer> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final InterfaceC115514g7 LLFFF;
    public final EnumC210578Of LLFII;

    static {
        TBT tbt = new TBT(FeedInfoAboveAnchorAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt};
    }

    public FeedInfoAboveAnchorAreaContainer() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1313), null, C210568Oe.INSTANCE, null, null);
        this.LLFII = EnumC210578Of.FEED_INFO_ABOVE_ANCHOR_AREA_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void e4() {
        super.e4();
        C78926UyI.LJFF(this, new AqS169S0100000_3(this, 591));
        if (this.LL != null) {
            Object LIZ = this.LLFFF.LIZ(this, LLFZ[0]);
            View containerView = getContainerView();
            LIZ.getClass();
            ConstraintSizeVM.nv0(R.id.tu, C8ON.LIZ(), containerView);
            ConstraintSizeVM.nv0(R.id.dhp, C8ON.LIZ(), containerView);
            ConstraintSizeVM.nv0(R.id.gj2, C8ON.LIZ(), containerView);
            ConstraintSizeVM.nv0(R.id.fti, C8ON.LIZ(), containerView);
            ConstraintSizeVM.nv0(R.id.cfa, C8ON.LIZ(), containerView);
            ConstraintSizeVM.nv0(R.id.gu5, C8ON.LIZ(), containerView);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLFII;
    }
}
