package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes11.dex */
public final class MusicResourceBitStruct implements Serializable {

    @InterfaceC65349Pkn("channels")
    public final List<String> channels;

    @InterfaceC65349Pkn("colors")
    public final List<String> colors;

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("icon")
    public final String icon;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    public final List<String> getChannels() {
        return this.channels;
    }

    public final List<String> getColors() {
        return this.colors;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSchema() {
        return this.schema;
    }
}
