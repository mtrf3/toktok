package com.ss.android.ugc.feed.platform.container.info;

import X.C210618Oj;
import X.C214348b8;
import X.C241249dQ;
import X.C65352Pkq;
import X.C65776Prg;
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

/* loaded from: classes4.dex */
public final class FeedInfoBelowMusicTitleAreaContainer extends BaseContainer<VContainerProtocol, FeedInfoBelowMusicTitleAreaContainer> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final InterfaceC115514g7 LLFFF;
    public final EnumC210578Of LLFII;

    static {
        TBT tbt = new TBT(FeedInfoBelowMusicTitleAreaContainer.class, "constraintSizeVM", "getConstraintSizeVM()Lcom/ss/android/ugc/feed/platform/container/info/ConstraintSizeVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt};
    }

    public FeedInfoBelowMusicTitleAreaContainer() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ConstraintSizeVM.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 1316), null, C210618Oj.INSTANCE, null, null);
        this.LLFII = EnumC210578Of.FEED_INFO_BELOW_MUSIC_TITLE_CONTAINER;
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final void e4() {
        super.e4();
        if (this.LL != null) {
            Object LIZ = this.LLFFF.LIZ(this, LLFZ[0]);
            View containerView = getContainerView();
            LIZ.getClass();
            ConstraintSizeVM.nv0(R.id.gw_, C8ON.LIZIZ(), containerView);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.core.BaseContainer
    public final EnumC210578Of c4() {
        return this.LLFII;
    }
}
