package com.bytedance.android.live.base.model.roomcomponents;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class OnlineRankConfig extends F9E {

    @InterfaceC65349Pkn("avatar_count")
    public int avatarNumber;

    @InterfaceC65349Pkn("show_avatar_list")
    public boolean avatarShow;

    @InterfaceC65349Pkn("can_panel_click")
    public boolean onlinePanelClick;

    @InterfaceC65349Pkn("show_online_panel")
    public boolean onlinePanelShow;

    @InterfaceC65349Pkn("show_score")
    public boolean scoreShow;

    /* JADX WARN: Multi-variable type inference failed */
    public OnlineRankConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    public static /* synthetic */ OnlineRankConfig copy$default(OnlineRankConfig onlineRankConfig, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = onlineRankConfig.onlinePanelShow;
        }
        if ((i2 & 2) != 0) {
            z2 = onlineRankConfig.onlinePanelClick;
        }
        if ((i2 & 4) != 0) {
            z3 = onlineRankConfig.avatarShow;
        }
        if ((i2 & 8) != 0) {
            i = onlineRankConfig.avatarNumber;
        }
        if ((i2 & 16) != 0) {
            z4 = onlineRankConfig.scoreShow;
        }
        return onlineRankConfig.copy(z, z2, z3, i, z4);
    }

    public final boolean component1() {
        return this.onlinePanelShow;
    }

    public final boolean component2() {
        return this.onlinePanelClick;
    }

    public final boolean component3() {
        return this.avatarShow;
    }

    public final int component4() {
        return this.avatarNumber;
    }

    public final boolean component5() {
        return this.scoreShow;
    }

    public final OnlineRankConfig copy(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        return new OnlineRankConfig(z, z2, z3, i, z4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.onlinePanelShow), Boolean.valueOf(this.onlinePanelClick), Boolean.valueOf(this.avatarShow), Integer.valueOf(this.avatarNumber), Boolean.valueOf(this.scoreShow)};
    }

    public OnlineRankConfig(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.onlinePanelShow = z;
        this.onlinePanelClick = z2;
        this.avatarShow = z3;
        this.avatarNumber = i;
        this.scoreShow = z4;
    }

    public /* synthetic */ OnlineRankConfig(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? true : z4);
    }
}
