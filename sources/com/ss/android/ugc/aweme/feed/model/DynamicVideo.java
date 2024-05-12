package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DynamicVideo implements Serializable {

    @InterfaceC65349Pkn("gecko_channel")
    public final List<String> geckoChannel;

    @InterfaceC65349Pkn("lynx_scheme")
    public final String lynxScheme;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicVideo copy$default(DynamicVideo dynamicVideo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dynamicVideo.lynxScheme;
        }
        if ((i & 2) != 0) {
            list = dynamicVideo.geckoChannel;
        }
        return dynamicVideo.copy(str, list);
    }

    public final DynamicVideo copy(String str, List<String> list) {
        return new DynamicVideo(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicVideo)) {
            return false;
        }
        DynamicVideo dynamicVideo = (DynamicVideo) obj;
        return o.LJ(this.lynxScheme, dynamicVideo.lynxScheme) && o.LJ(this.geckoChannel, dynamicVideo.geckoChannel);
    }

    public int hashCode() {
        String str = this.lynxScheme;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.geckoChannel;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicVideo(lynxScheme=");
        LIZ.append(this.lynxScheme);
        LIZ.append(", geckoChannel=");
        return C1NE.LIZIZ(LIZ, this.geckoChannel, ')', LIZ);
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final String getLynxScheme() {
        return this.lynxScheme;
    }

    public DynamicVideo(String str, List<String> list) {
        this.lynxScheme = str;
        this.geckoChannel = list;
    }
}
