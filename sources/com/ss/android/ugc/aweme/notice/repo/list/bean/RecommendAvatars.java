package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class RecommendAvatars extends BaseResponse implements InterfaceC65316PkG {
    public String LJLIL;

    @InterfaceC65349Pkn("avatar_list")
    public final List<UrlModel> avatarList;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendAvatars() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.LJLIL = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendAvatars(List<? extends UrlModel> list, boolean z) {
        this.avatarList = list;
        this.enable = z;
    }

    public /* synthetic */ RecommendAvatars(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z);
    }
}
