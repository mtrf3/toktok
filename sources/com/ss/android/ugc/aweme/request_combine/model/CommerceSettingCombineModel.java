package com.ss.android.ugc.aweme.request_combine.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.commercialize.model.CommerceSettings;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CommerceSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public CommerceSettings combineModel;

    public static /* synthetic */ CommerceSettingCombineModel copy$default(CommerceSettingCombineModel commerceSettingCombineModel, CommerceSettings commerceSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            commerceSettings = commerceSettingCombineModel.combineModel;
        }
        return commerceSettingCombineModel.copy(commerceSettings);
    }

    private Object[] getObjects() {
        return new Object[]{this.combineModel};
    }

    public final CommerceSettingCombineModel copy(CommerceSettings combineModel) {
        o.LJIIIZ(combineModel, "combineModel");
        return new CommerceSettingCombineModel(combineModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommerceSettingCombineModel) {
            return C78966Uyw.LJIIIZ(((CommerceSettingCombineModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    public String toString() {
        return C78966Uyw.LJJJLL("CommerceSettingCombineModel:%s", getObjects());
    }

    public final CommerceSettings getCombineModel() {
        return this.combineModel;
    }

    public CommerceSettingCombineModel(CommerceSettings combineModel) {
        o.LJIIIZ(combineModel, "combineModel");
        this.combineModel = combineModel;
    }

    public final void setCombineModel(CommerceSettings commerceSettings) {
        o.LJIIIZ(commerceSettings, "<set-?>");
        this.combineModel = commerceSettings;
    }
}
