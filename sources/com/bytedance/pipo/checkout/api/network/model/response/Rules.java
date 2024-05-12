package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Rules {

    @InterfaceC65349Pkn("action")
    public String action;

    @InterfaceC65349Pkn("error_code")
    public String errorCode;

    @InterfaceC65349Pkn("error_key")
    public String errorKey;

    @InterfaceC65349Pkn("error_key_params")
    public Map<String, String> errorKeyParams;

    @InterfaceC65349Pkn("error_msg")
    public String errorMsg;

    @InterfaceC65349Pkn("stage")
    public List<String> stage;

    @InterfaceC65349Pkn("type")
    public String type;

    @InterfaceC65349Pkn("value")
    public String value;

    /* JADX WARN: Multi-variable type inference failed */
    public Rules() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 255, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rules copy$default(Rules rules, String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rules.type;
        }
        if ((i & 2) != 0) {
            str2 = rules.value;
        }
        if ((i & 4) != 0) {
            str3 = rules.errorKey;
        }
        if ((i & 8) != 0) {
            str4 = rules.errorCode;
        }
        if ((i & 16) != 0) {
            str5 = rules.errorMsg;
        }
        if ((i & 32) != 0) {
            str6 = rules.action;
        }
        if ((i & 64) != 0) {
            list = rules.stage;
        }
        if ((i & 128) != 0) {
            map = rules.errorKeyParams;
        }
        return rules.copy(str, str2, str3, str4, str5, str6, list, map);
    }

    public final Rules copy(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Map<String, String> map) {
        return new Rules(str, str2, str3, str4, str5, str6, list, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rules)) {
            return false;
        }
        Rules rules = (Rules) obj;
        return o.LJ(this.type, rules.type) && o.LJ(this.value, rules.value) && o.LJ(this.errorKey, rules.errorKey) && o.LJ(this.errorCode, rules.errorCode) && o.LJ(this.errorMsg, rules.errorMsg) && o.LJ(this.action, rules.action) && o.LJ(this.stage, rules.stage) && o.LJ(this.errorKeyParams, rules.errorKeyParams);
    }

    public int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorCode;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.errorMsg;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<String> list = this.stage;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.errorKeyParams;
        return hashCode7 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Rules(type=");
        LIZ.append((Object) this.type);
        LIZ.append(", value=");
        LIZ.append((Object) this.value);
        LIZ.append(", errorKey=");
        LIZ.append((Object) this.errorKey);
        LIZ.append(", errorCode=");
        LIZ.append((Object) this.errorCode);
        LIZ.append(", errorMsg=");
        LIZ.append((Object) this.errorMsg);
        LIZ.append(", action=");
        LIZ.append((Object) this.action);
        LIZ.append(", stage=");
        LIZ.append(this.stage);
        LIZ.append(", errorKeyParams=");
        LIZ.append(this.errorKeyParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorKey() {
        return this.errorKey;
    }

    public final Map<String, String> getErrorKeyParams() {
        return this.errorKeyParams;
    }

    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final List<String> getStage() {
        return this.stage;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setErrorCode(String str) {
        this.errorCode = str;
    }

    public final void setErrorKey(String str) {
        this.errorKey = str;
    }

    public final void setErrorKeyParams(Map<String, String> map) {
        this.errorKeyParams = map;
    }

    public final void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public final void setStage(List<String> list) {
        this.stage = list;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public Rules(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, Map<String, String> map) {
        this.type = str;
        this.value = str2;
        this.errorKey = str3;
        this.errorCode = str4;
        this.errorMsg = str5;
        this.action = str6;
        this.stage = list;
        this.errorKeyParams = map;
    }

    public /* synthetic */ Rules(String str, String str2, String str3, String str4, String str5, String str6, List list, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : list, (i & 128) == 0 ? map : null);
    }
}
