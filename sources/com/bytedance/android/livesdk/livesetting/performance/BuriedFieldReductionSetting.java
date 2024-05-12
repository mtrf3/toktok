package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30993CEj;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.model.BuriedFieldData;
import java.util.List;
import kotlin.jvm.internal.o;

@SettingsKey("ttlive_buried_field_reduction_opt")
/* loaded from: classes6.dex */
public final class BuriedFieldReductionSetting {
    public static Boolean listIsEmpty;
    public static final BuriedFieldReductionSetting INSTANCE = new BuriedFieldReductionSetting();

    @Group(isDefault = true, value = "default group")
    public static final BuriedFieldData DEFAULT = new BuriedFieldData();
    public static final C5H3 getValue$delegate = C221108m2.LIZIZ(C30993CEj.LJLIL);

    public final BuriedFieldData getGetValue() {
        return (BuriedFieldData) getValue$delegate.getValue();
    }

    private final boolean isHasKey(String str) {
        BuriedFieldData getValue;
        List<String> list;
        List<String> list2;
        if (listIsEmpty == null) {
            listIsEmpty = Boolean.TRUE;
            BuriedFieldData getValue2 = getGetValue();
            if (getValue2 != null && (list2 = getValue2.unBuriedFieldList) != null && (!list2.isEmpty())) {
                listIsEmpty = Boolean.FALSE;
            }
        }
        if (!o.LJ(Boolean.FALSE, listIsEmpty) || (getValue = getGetValue()) == null || (list = getValue.unBuriedFieldList) == null) {
            return false;
        }
        return list.contains(str);
    }

    public final boolean isBuriedField(String key) {
        o.LJIIIZ(key, "key");
        BuriedFieldData getValue = getGetValue();
        if (getValue == null || !getValue.isBuriedField || isHasKey(key)) {
            return false;
        }
        return true;
    }
}
