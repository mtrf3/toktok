package com.bytedance.android.live.effect.model;

import X.C0L1;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FilterModel extends LiveEffect {
    public Effect effect;
    public C0L1 filterConfig;
    public int filterType;
    public LocalFilterModel localFilter;
    public List<String> tags;

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public String getFilterId() {
        Effect effect;
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2 || (effect = this.effect) == null) {
                return null;
            }
            return effect.getEffectId();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return null;
        }
        return localFilterModel.getId();
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public String getFilterPath() {
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2 || this.effect == null) {
                return "";
            }
            return new File(this.effect.getUnzipPath()).getAbsolutePath();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return "";
        }
        return localFilterModel.getFilterFilePath();
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public String getName() {
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            return this.effect.getName();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return null;
        }
        return localFilterModel.getName();
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public String getResourceId() {
        Effect effect;
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2 || (effect = this.effect) == null) {
                return null;
            }
            return effect.getResourceId();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return null;
        }
        return localFilterModel.getId();
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public boolean isNone() {
        if (this.filterType == 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public int hashCode() {
        return getFilterId().hashCode();
    }

    public FilterModel() {
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public Effect getEffect() {
        return this.effect;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public LocalFilterModel getLocalFilter() {
        return this.localFilter;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public List<String> getTags() {
        return this.tags;
    }

    public FilterModel(Effect effect) {
        this.filterType = 2;
        this.effect = effect;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FilterModel) {
            return TextUtils.equals(getFilterId(), ((LiveEffect) obj).getFilterId());
        }
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setFilterType(int i) {
        this.filterType = i;
    }

    public void setLocalFilter(LocalFilterModel localFilterModel) {
        this.localFilter = localFilterModel;
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public void setTags(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.tags = arrayList;
        arrayList.addAll(list);
    }
}
