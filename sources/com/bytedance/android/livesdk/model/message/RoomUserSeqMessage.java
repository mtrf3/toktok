package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public class RoomUserSeqMessage extends CR6 {

    @InterfaceC65349Pkn("anonymous")
    public Long anonymous;

    @InterfaceC65349Pkn("ranks")
    public List<Contributor> mContributors;

    @InterfaceC65349Pkn("popularity")
    public long mPopularity;

    @InterfaceC65349Pkn("total")
    public long mTotal;

    @InterfaceC65349Pkn("pop_str")
    public String popStr;

    @InterfaceC65349Pkn("seats")
    public List<Contributor> seats;

    @InterfaceC65349Pkn("total_user")
    public Long totalUser;

    public RoomUserSeqMessage() {
        this.type = EnumC31509CYf.USER_SEQ;
    }
}
