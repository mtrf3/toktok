package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SecLinkLocalConfig extends F9E {

    @InterfaceC65349Pkn("seclink_white_list")
    public final List<String> whiteList;

    /* JADX WARN: Multi-variable type inference failed */
    public SecLinkLocalConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.whiteList};
    }

    public SecLinkLocalConfig(List<String> whiteList) {
        o.LJIIIZ(whiteList, "whiteList");
        this.whiteList = whiteList;
    }

    public /* synthetic */ SecLinkLocalConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C47261Igj.LJJIJIL("tiktok.com", "whatsapp.com", "twitter.com", "twitch.com", "youtube.com", "amazon.com", "google.com", "snapchat.com", "sgsnssdk.com") : list);
    }
}
