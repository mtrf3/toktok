package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;

/* loaded from: classes14.dex */
public final class BattleLinkerInviteMessageExtra extends F9E {

    @InterfaceC65349Pkn("duration")
    public Long duration;

    @InterfaceC65349Pkn("extra")
    public InviterRivalExtra extra;

    @InterfaceC65349Pkn("invite_type")
    public Long inviteType;

    @InterfaceC65349Pkn("match_type")
    public Long matchType;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public Long scene;

    @InterfaceC65349Pkn("sub_type")
    public Long subType;

    @InterfaceC65349Pkn("tags")
    public List<BattleRivalTag> tags;

    @InterfaceC65349Pkn("theme")
    public String theme;

    @InterfaceC65349Pkn("tips")
    public String tips;

    /* loaded from: classes14.dex */
    public static final class InviterRivalExtra extends F9E {

        @InterfaceC65349Pkn("Label")
        public String label;

        @InterfaceC65349Pkn("TextType")
        public Long texttype;

        @InterfaceC65349Pkn("Text")
        public String webcastDataText;

        @Override // X.F9E
        public final Object[] getObjects() {
            Long l = this.texttype;
            String str = this.webcastDataText;
            String str2 = this.label;
            return new Object[]{l, l, str, str, str2, str2};
        }
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.matchType;
        String str = this.tips;
        Long l2 = this.inviteType;
        Long l3 = this.subType;
        Long l4 = this.scene;
        String str2 = this.theme;
        Long l5 = this.duration;
        InviterRivalExtra inviterRivalExtra = this.extra;
        List<BattleRivalTag> list = this.tags;
        return new Object[]{l, l, str, str, l2, l2, l3, l3, l4, l4, str2, str2, l5, l5, inviterRivalExtra, inviterRivalExtra, list, list, list};
    }
}
