package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class RankToastMessage extends CR6 {

    @InterfaceC65349Pkn("toast")
    public RankToast toast;

    /* loaded from: classes6.dex */
    public static class RankToast {

        @InterfaceC65349Pkn("should_toast")
        public boolean shouldToast;

        @InterfaceC65349Pkn("user_id")
        public long userId;
    }

    public RankToastMessage() {
        this.type = EnumC31509CYf.RANK_TOAST_MESSAGE;
    }
}
