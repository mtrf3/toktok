package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.google.gson.j;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UnifiedSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public j setting;

    public static /* synthetic */ UnifiedSettingCombineModel copy$default(UnifiedSettingCombineModel unifiedSettingCombineModel, j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = unifiedSettingCombineModel.setting;
        }
        return unifiedSettingCombineModel.copy(jVar);
    }

    private Object[] getObjects() {
        return new Object[]{this.setting};
    }

    public final UnifiedSettingCombineModel copy(j setting) {
        o.LJIIIZ(setting, "setting");
        return new UnifiedSettingCombineModel(setting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnifiedSettingCombineModel) {
            return C78966Uyw.LJIIIZ(((UnifiedSettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("UnifiedSettingCombineModel:%s", getObjects());
    }

    public final j getSetting() {
        return this.setting;
    }

    public UnifiedSettingCombineModel(j setting) {
        o.LJIIIZ(setting, "setting");
        this.setting = setting;
    }

    public final void setSetting(j jVar) {
        o.LJIIIZ(jVar, "<set-?>");
        this.setting = jVar;
    }
}
