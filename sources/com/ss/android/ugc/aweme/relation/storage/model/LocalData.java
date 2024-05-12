package com.ss.android.ugc.aweme.relation.storage.model;

import X.C38T;
import X.C61878OQg;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocalData {

    @InterfaceC65349Pkn("has_more")
    public final Boolean _hasMore;

    @InterfaceC65349Pkn("local_type")
    public final Integer _localType;

    @InterfaceC65349Pkn("user_ids")
    public final List<String> _userIds;

    @InterfaceC65349Pkn("users")
    public final List<UserData> _userList;

    public final C38T LIZ() {
        Integer num = this._localType;
        for (C38T c38t : C38T.values()) {
            int value = c38t.getValue();
            if (num != null && value == num.intValue()) {
                return c38t;
            }
        }
        return null;
    }

    public final List<String> LIZIZ() {
        List<String> list = this._userIds;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public final List<UserData> LIZJ() {
        List<UserData> list = this._userList;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    public final String toString() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocalData(_localType=");
        LIZ.append(LIZ());
        LIZ.append(", _userList=");
        List<UserData> list = this._userList;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", _userIds=");
        LIZ.append(this._userIds);
        LIZ.append(", _hasMore=");
        return C78920UyC.LIZIZ(LIZ, this._hasMore, ')', LIZ);
    }

    public LocalData(Integer num, List<UserData> list, List<String> list2, Boolean bool) {
        this._localType = num;
        this._userList = list;
        this._userIds = list2;
        this._hasMore = bool;
    }
}
