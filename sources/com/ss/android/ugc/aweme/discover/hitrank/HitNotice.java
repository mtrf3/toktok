package com.ss.android.ugc.aweme.discover.hitrank;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class HitNotice extends BaseResponse {

    @InterfaceC65349Pkn("user_list")
    public ArrayList<SimpleUser> userList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HitNotice copy$default(HitNotice hitNotice, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = hitNotice.userList;
        }
        return hitNotice.copy(arrayList);
    }

    private Object[] getObjects() {
        return new Object[]{this.userList};
    }

    public final HitNotice copy(ArrayList<SimpleUser> userList) {
        o.LJIIIZ(userList, "userList");
        return new HitNotice(userList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HitNotice) {
            return C78966Uyw.LJIIIZ(((HitNotice) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("HitNotice:%s", getObjects());
    }

    public final ArrayList<SimpleUser> getUserList() {
        return this.userList;
    }

    public HitNotice(ArrayList<SimpleUser> userList) {
        o.LJIIIZ(userList, "userList");
        this.userList = userList;
    }

    public final void setUserList(ArrayList<SimpleUser> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.userList = arrayList;
    }
}
