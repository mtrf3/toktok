package com.ss.android.ugc.aweme.feed.model;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PromoteEntrySchemaModel extends F9E {

    @InterfaceC65349Pkn("live")
    public final String live;

    @InterfaceC65349Pkn("settings")
    public final String settings;

    @InterfaceC65349Pkn("video")
    public final String video;

    public static /* synthetic */ PromoteEntrySchemaModel copy$default(PromoteEntrySchemaModel promoteEntrySchemaModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promoteEntrySchemaModel.live;
        }
        if ((i & 2) != 0) {
            str2 = promoteEntrySchemaModel.video;
        }
        if ((i & 4) != 0) {
            str3 = promoteEntrySchemaModel.settings;
        }
        return promoteEntrySchemaModel.copy(str, str2, str3);
    }

    public final PromoteEntrySchemaModel copy(String live, String video, String settings) {
        o.LJIIIZ(live, "live");
        o.LJIIIZ(video, "video");
        o.LJIIIZ(settings, "settings");
        return new PromoteEntrySchemaModel(live, video, settings);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.live, this.video, this.settings};
    }

    public PromoteEntrySchemaModel(String str, String str2, String str3) {
        HH1.LIZ(str, "live", str2, "video", str3, "settings");
        this.live = str;
        this.video = str2;
        this.settings = str3;
    }
}
