package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public class LikePraiseDialogInfo {

    @InterfaceC65349Pkn("new_like_num")
    public Integer newLikeNum;

    @InterfaceC65349Pkn("two_dialog_interval")
    public Integer twoDialogInterval;

    public Integer getNewLikeNum() {
        Integer num = this.newLikeNum;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getTwoDialogInterval() {
        Integer num = this.twoDialogInterval;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
