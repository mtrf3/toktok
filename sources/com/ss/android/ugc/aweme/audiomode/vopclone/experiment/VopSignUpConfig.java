package com.ss.android.ugc.aweme.audiomode.vopclone.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VopSignUpConfig {

    @InterfaceC65349Pkn("vop_hashtag_ids")
    public final List<HashtagId> hashtagIdGroup;

    @InterfaceC65349Pkn("show_vop_entry")
    public final Integer isShowVopEntry;

    @InterfaceC65349Pkn("vop_url")
    public final String webUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public VopSignUpConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VopSignUpConfig)) {
            return false;
        }
        VopSignUpConfig vopSignUpConfig = (VopSignUpConfig) obj;
        return o.LJ(this.isShowVopEntry, vopSignUpConfig.isShowVopEntry) && o.LJ(this.hashtagIdGroup, vopSignUpConfig.hashtagIdGroup) && o.LJ(this.webUrl, vopSignUpConfig.webUrl);
    }

    public final int hashCode() {
        Integer num = this.isShowVopEntry;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<HashtagId> list = this.hashtagIdGroup;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.webUrl;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VopSignUpConfig(isShowVopEntry=");
        LIZ.append(this.isShowVopEntry);
        LIZ.append(", hashtagIdGroup=");
        LIZ.append(this.hashtagIdGroup);
        LIZ.append(", webUrl=");
        return q.LIZIZ(LIZ, this.webUrl, ')', LIZ);
    }

    public VopSignUpConfig(Integer num, List<HashtagId> list, String str) {
        this.isShowVopEntry = num;
        this.hashtagIdGroup = list;
        this.webUrl = str;
    }

    public /* synthetic */ VopSignUpConfig(Integer num, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str);
    }
}
