package com.ss.android.vesdk;

import X.EnumC139115d5;
import X.EnumC139125d6;
import X.X1D;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class VEUserConfig {
    public Map<EnumC139125d6, VEUserConfigItem<?>> configItems = new HashMap();

    /* loaded from: classes3.dex */
    public static class VEUserConfigItem<T> {
        public EnumC139115d5 dataType;
        public EnumC139125d6 id;
        public T value;

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VEUserConfigItem{dataType=");
            LIZ.append(this.dataType);
            LIZ.append(", value=");
            LIZ.append(this.value);
            LIZ.append(", id=");
            LIZ.append(this.id);
            LIZ.append('}');
            return X1D.LIZIZ(LIZ);
        }

        public EnumC139115d5 getDataType() {
            return this.dataType;
        }

        public T getValue() {
            return this.value;
        }

        public VEUserConfigItem(EnumC139125d6 enumC139125d6, T t) {
            if (t instanceof Boolean) {
                this.dataType = EnumC139115d5.BOOLEAN;
            } else if (t instanceof Integer) {
                this.dataType = EnumC139115d5.INTEGER;
            } else {
                throw new IllegalArgumentException("illegal value type");
            }
            this.id = enumC139125d6;
            this.value = t;
        }
    }

    public EnumC139125d6[] getConfigIDs() {
        Set<EnumC139125d6> keySet = this.configItems.keySet();
        EnumC139125d6[] enumC139125d6Arr = new EnumC139125d6[keySet.size()];
        keySet.toArray(enumC139125d6Arr);
        return enumC139125d6Arr;
    }

    public VEUserConfigItem<?>[] getConfigItems() {
        Collection<VEUserConfigItem<?>> values = this.configItems.values();
        VEUserConfigItem<?>[] vEUserConfigItemArr = new VEUserConfigItem[values.size()];
        values.toArray(vEUserConfigItemArr);
        return vEUserConfigItemArr;
    }

    public VEUserConfig addConfig(VEUserConfigItem<?> vEUserConfigItem) {
        this.configItems.put(vEUserConfigItem.id, vEUserConfigItem);
        return this;
    }

    public VEUserConfigItem<?> getConfigItem(EnumC139125d6 enumC139125d6) {
        return this.configItems.get(enumC139125d6);
    }
}
