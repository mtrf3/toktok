package com.ss.android.ugc.aweme.services.publish;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class EditPostMobParam {
    public final String awemeId;
    public final Integer awemeType;

    public static /* synthetic */ EditPostMobParam copy$default(EditPostMobParam editPostMobParam, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = editPostMobParam.awemeType;
        }
        if ((i & 2) != 0) {
            str = editPostMobParam.awemeId;
        }
        return editPostMobParam.copy(num, str);
    }

    public final EditPostMobParam copy(Integer num, String str) {
        return new EditPostMobParam(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditPostMobParam)) {
            return false;
        }
        EditPostMobParam editPostMobParam = (EditPostMobParam) obj;
        return o.LJ(this.awemeType, editPostMobParam.awemeType) && o.LJ(this.awemeId, editPostMobParam.awemeId);
    }

    public int hashCode() {
        Integer num = this.awemeType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.awemeId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPostMobParam(awemeType=");
        LIZ.append(this.awemeType);
        LIZ.append(", awemeId=");
        return q.LIZIZ(LIZ, this.awemeId, ')', LIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Integer getAwemeType() {
        return this.awemeType;
    }

    public EditPostMobParam(Integer num, String str) {
        this.awemeType = num;
        this.awemeId = str;
    }
}
