package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.google.gson.j;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AwemeSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public j awemeSetting;

    public static /* synthetic */ AwemeSettingCombineModel copy$default(AwemeSettingCombineModel awemeSettingCombineModel, j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = awemeSettingCombineModel.awemeSetting;
        }
        return awemeSettingCombineModel.copy(jVar);
    }

    private Object[] getObjects() {
        return new Object[]{this.awemeSetting};
    }

    public final AwemeSettingCombineModel copy(j awemeSetting) {
        o.LJIIIZ(awemeSetting, "awemeSetting");
        return new AwemeSettingCombineModel(awemeSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AwemeSettingCombineModel) {
            return C78966Uyw.LJIIIZ(((AwemeSettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("AwemeSettingCombineModel:%s", getObjects());
    }

    public final j getAwemeSetting() {
        return this.awemeSetting;
    }

    public AwemeSettingCombineModel(j awemeSetting) {
        o.LJIIIZ(awemeSetting, "awemeSetting");
        this.awemeSetting = awemeSetting;
    }

    public final void setAwemeSetting(j jVar) {
        o.LJIIIZ(jVar, "<set-?>");
        this.awemeSetting = jVar;
    }
}
