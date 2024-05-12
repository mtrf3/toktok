package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LinkCard extends F9E {
    public final String desc;

    @InterfaceC65349Pkn("link_info")
    public final LinkInfo linkInfo;
    public final String name;

    public static /* synthetic */ LinkCard copy$default(LinkCard linkCard, String str, String str2, LinkInfo linkInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkCard.name;
        }
        if ((i & 2) != 0) {
            str2 = linkCard.desc;
        }
        if ((i & 4) != 0) {
            linkInfo = linkCard.linkInfo;
        }
        return linkCard.copy(str, str2, linkInfo);
    }

    public final LinkCard copy(String name, String desc, LinkInfo linkInfo) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(linkInfo, "linkInfo");
        return new LinkCard(name, desc, linkInfo);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.name, this.desc, this.linkInfo};
    }

    public final String getDesc() {
        return this.desc;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public final String getName() {
        return this.name;
    }

    public LinkCard(String name, String desc, LinkInfo linkInfo) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(desc, "desc");
        o.LJIIIZ(linkInfo, "linkInfo");
        this.name = name;
        this.desc = desc;
        this.linkInfo = linkInfo;
    }
}
