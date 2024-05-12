package com.ss.android.ugc.aweme.relation.muflist;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MufPageTrackInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("enter_from")
    public final String enterFrom;

    @InterfaceC65349Pkn("previous_page")
    public final String previousPage;

    /* JADX WARN: Multi-variable type inference failed */
    public MufPageTrackInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MufPageTrackInfo copy$default(MufPageTrackInfo mufPageTrackInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mufPageTrackInfo.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = mufPageTrackInfo.previousPage;
        }
        return mufPageTrackInfo.copy(str, str2);
    }

    public final MufPageTrackInfo copy(String enterFrom, String previousPage) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        return new MufPageTrackInfo(enterFrom, previousPage);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.enterFrom, this.previousPage};
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public MufPageTrackInfo(String enterFrom, String previousPage) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        this.enterFrom = enterFrom;
        this.previousPage = previousPage;
    }

    public /* synthetic */ MufPageTrackInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
