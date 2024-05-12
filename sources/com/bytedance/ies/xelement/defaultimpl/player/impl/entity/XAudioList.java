package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import X.C48654J7q;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.InterfaceC79968Va0;
import java.util.List;

/* loaded from: classes9.dex */
public final class XAudioList {

    @InterfaceC65349Pkn("list")
    public List<XAudioSrc> mDataSet;

    @InterfaceC65349Pkn("id")
    public String mId = "";

    @InterfaceC65349Pkn("position")
    public Integer mPosition = 0;

    public final InterfaceC79968Va0 toPlaylist() {
        int i;
        String str = this.mId;
        if (str == null) {
            str = "";
        }
        List list = this.mDataSet;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        Integer num = this.mPosition;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        return new C48654J7q(str, list, i);
    }
}
