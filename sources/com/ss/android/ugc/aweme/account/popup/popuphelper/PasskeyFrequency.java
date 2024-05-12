package com.ss.android.ugc.aweme.account.popup.popuphelper;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PasskeyFrequency extends F9E {

    @InterfaceC65349Pkn("does_user_exist")
    public boolean doesUserExist;

    @InterfaceC65349Pkn("show_time")
    public List<Long> showTime;

    /* JADX WARN: Multi-variable type inference failed */
    public PasskeyFrequency() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.showTime, Boolean.valueOf(this.doesUserExist)};
    }

    public PasskeyFrequency(List<Long> showTime, boolean z) {
        o.LJIIIZ(showTime, "showTime");
        this.showTime = showTime;
        this.doesUserExist = z;
    }

    public /* synthetic */ PasskeyFrequency(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? false : z);
    }
}
