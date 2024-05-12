package com.ss.android.ugc.aweme.profile.editprofile.pronouns.api;

import X.C1NE;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProfileEditPronounsParams {

    @InterfaceC65349Pkn("max_num")
    public final Integer maxPronounsNum;

    @InterfaceC65349Pkn("pronouns_list")
    public final List<String> pronounsList;

    public ProfileEditPronounsParams() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileEditPronounsParams)) {
            return false;
        }
        ProfileEditPronounsParams profileEditPronounsParams = (ProfileEditPronounsParams) obj;
        return o.LJ(this.maxPronounsNum, profileEditPronounsParams.maxPronounsNum) && o.LJ(this.pronounsList, profileEditPronounsParams.pronounsList);
    }

    public final int hashCode() {
        Integer num = this.maxPronounsNum;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.pronounsList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileEditPronounsParams(maxPronounsNum=");
        LIZ.append(this.maxPronounsNum);
        LIZ.append(", pronounsList=");
        return C1NE.LIZIZ(LIZ, this.pronounsList, ')', LIZ);
    }

    public ProfileEditPronounsParams(Integer num, List<String> list) {
        this.maxPronounsNum = num;
        this.pronounsList = list;
    }

    public ProfileEditPronounsParams(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 4 : num, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
