package com.ss.android.ugc.aweme.common;

import X.C43051mX;
import X.Q89;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MobClick {
    public static final C43051mX<MobClick> pool = new C43051mX<>(5);
    public String category;
    public String eventName;
    public JSONObject ext_json;
    public long ext_value_long;
    public String ext_value_str;
    public String labelName;
    public String value;

    public void clearState() {
        this.eventName = null;
        this.labelName = null;
        this.value = null;
        this.ext_value_str = null;
        this.ext_value_long = 0L;
        this.category = null;
        this.ext_json = null;
    }

    public static MobClick obtain() {
        MobClick LIZIZ = pool.LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return new MobClick();
    }

    public String getValue() {
        if (TextUtils.isEmpty(this.value)) {
            this.value = CardStruct.IStatusCode.DEFAULT;
        }
        return this.value;
    }

    public void recycle() {
        clearState();
        pool.LIZ(this);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MobClick{eventName='");
        Q89.LIZIZ(LIZ, this.eventName, '\'', ", labelName='");
        Q89.LIZIZ(LIZ, this.labelName, '\'', ", value='");
        Q89.LIZIZ(LIZ, this.value, '\'', ", ext_value_str='");
        Q89.LIZIZ(LIZ, this.ext_value_str, '\'', ", ext_value_long=");
        LIZ.append(this.ext_value_long);
        LIZ.append(", category='");
        Q89.LIZIZ(LIZ, this.category, '\'', ", ext_json=");
        LIZ.append(this.ext_json);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public String getCategory() {
        return this.category;
    }

    public String getEventName() {
        return this.eventName;
    }

    public JSONObject getExtJson() {
        return this.ext_json;
    }

    public long getExtValueLong() {
        return this.ext_value_long;
    }

    public String getExtValueStr() {
        return this.ext_value_str;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public MobClick setCategory(String str) {
        this.category = str;
        return this;
    }

    public MobClick setEventName(String str) {
        this.eventName = str;
        return this;
    }

    public MobClick setExtValueLong(long j) {
        this.ext_value_long = j;
        return this;
    }

    public MobClick setExtValueString(String str) {
        this.ext_value_str = str;
        return this;
    }

    public MobClick setJsonObject(JSONObject jSONObject) {
        this.ext_json = jSONObject;
        return this;
    }

    public MobClick setLabelName(String str) {
        this.labelName = str;
        return this;
    }

    public MobClick setValue(String str) {
        this.value = str;
        return this;
    }
}
