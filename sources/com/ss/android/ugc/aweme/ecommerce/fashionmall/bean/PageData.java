package com.ss.android.ugc.aweme.ecommerce.fashionmall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PageData {

    @InterfaceC65349Pkn("channel_scene_id")
    public final String channelSceneId;

    @InterfaceC65349Pkn("module")
    public final List<Module> module;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageData copy$default(PageData pageData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pageData.module;
        }
        if ((i & 2) != 0) {
            str = pageData.channelSceneId;
        }
        return pageData.copy(list, str);
    }

    public final PageData copy(List<Module> list, String str) {
        return new PageData(list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageData)) {
            return false;
        }
        PageData pageData = (PageData) obj;
        return o.LJ(this.module, pageData.module) && o.LJ(this.channelSceneId, pageData.channelSceneId);
    }

    public int hashCode() {
        List<Module> list = this.module;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.channelSceneId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PageData(module=");
        LIZ.append(this.module);
        LIZ.append(", channelSceneId=");
        return q.LIZIZ(LIZ, this.channelSceneId, ')', LIZ);
    }

    public final String getChannelSceneId() {
        return this.channelSceneId;
    }

    public final List<Module> getModule() {
        return this.module;
    }

    public PageData(List<Module> list, String str) {
        this.module = list;
        this.channelSceneId = str;
    }
}
