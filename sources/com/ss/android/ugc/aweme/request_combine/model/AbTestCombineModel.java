package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.google.gson.j;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AbTestCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public j abTestResponse;

    public static /* synthetic */ AbTestCombineModel copy$default(AbTestCombineModel abTestCombineModel, j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = abTestCombineModel.abTestResponse;
        }
        return abTestCombineModel.copy(jVar);
    }

    private Object[] getObjects() {
        return new Object[]{this.abTestResponse};
    }

    public final AbTestCombineModel copy(j abTestResponse) {
        o.LJIIIZ(abTestResponse, "abTestResponse");
        return new AbTestCombineModel(abTestResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbTestCombineModel) {
            return C78966Uyw.LJIIIZ(((AbTestCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("AbTestCombineModel:%s", getObjects());
    }

    public final j getAbTestResponse() {
        return this.abTestResponse;
    }

    public AbTestCombineModel(j abTestResponse) {
        o.LJIIIZ(abTestResponse, "abTestResponse");
        this.abTestResponse = abTestResponse;
    }

    public final void setAbTestResponse(j jVar) {
        o.LJIIIZ(jVar, "<set-?>");
        this.abTestResponse = jVar;
    }
}
