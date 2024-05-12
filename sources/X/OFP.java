package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public enum OFP {
    UnresponsiveDetection("unresponsive_detection", new JSONObject(), false),
    LynxOptimize("lynx_optimize", new JSONObject(), false),
    WebBlank("web_blank", new JSONObject(), true),
    ContainerTrace("container_trace", new JSONObject(), false),
    SdkAudit("sdk_audit", new JSONObject(), false);

    public final String LJLIL;
    public boolean LJLILLLLZI;
    public JSONObject LJLJI;

    public boolean not() {
        return !isEnabled();
    }

    public boolean isEnabled() {
        return this.LJLILLLLZI;
    }

    public static void parseAndSetSetting(String str) {
        boolean z;
        try {
            JSONObject jSONObject = new JSONObject(str);
            for (OFP ofp : values()) {
                if (jSONObject.has(ofp.LJLIL)) {
                    Object opt = jSONObject.opt(ofp.LJLIL);
                    if (opt instanceof JSONObject) {
                        ofp.LJLILLLLZI = true;
                        ofp.LJLJI = (JSONObject) opt;
                    } else {
                        if (opt instanceof String) {
                            z = "true".equalsIgnoreCase((String) opt);
                        } else if (opt instanceof Boolean) {
                            z = ((Boolean) opt).booleanValue();
                        } else {
                            z = false;
                        }
                        ofp.LJLILLLLZI = z;
                    }
                }
            }
        } catch (Throwable th) {
            C77117UOj.LJIIZILJ(th);
        }
    }

    public static OFP valueOf(String str) {
        return (OFP) V0N.LJJJ(OFP.class, str);
    }

    public boolean getBoolOption(String str, boolean z) {
        JSONObject jSONObject = this.LJLJI;
        if (jSONObject == null) {
            return z;
        }
        Object opt = jSONObject.opt(str);
        if (opt instanceof String) {
            return "true".equalsIgnoreCase((String) opt);
        }
        if (!(opt instanceof Boolean)) {
            return z;
        }
        return ((Boolean) opt).booleanValue();
    }

    public int getIntOption(String str, int i) {
        JSONObject jSONObject = this.LJLJI;
        if (jSONObject == null) {
            return i;
        }
        Object opt = jSONObject.opt(str);
        try {
            if (opt instanceof Integer) {
                i = ((Integer) opt).intValue();
            } else if (opt instanceof Long) {
                i = ((Long) opt).intValue();
            } else if (opt instanceof String) {
                i = CastIntegerProtector.parseInt((String) opt);
            }
        } catch (Throwable unused) {
        }
        return i;
    }

    public long getLongOption(String str, long j) {
        JSONObject jSONObject = this.LJLJI;
        if (jSONObject == null) {
            return j;
        }
        Object opt = jSONObject.opt(str);
        try {
            if (opt instanceof Long) {
                j = ((Long) opt).longValue();
            } else if (opt instanceof Integer) {
                j = ((Integer) opt).longValue();
            } else if (opt instanceof String) {
                j = CastLongProtector.parseLong((String) opt);
            }
        } catch (Throwable unused) {
        }
        return j;
    }

    public List<String> getStrListOptions(String str, List<String> list) {
        if (this.LJLJI == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = this.LJLJI.optJSONArray(str);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    Object obj = optJSONArray.get(i);
                    if (obj instanceof String) {
                        arrayList.add((String) obj);
                    }
                } catch (Throwable th) {
                    C77117UOj.LJIIZILJ(th);
                }
            }
        }
        return arrayList;
    }

    OFP(String str, JSONObject jSONObject, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = jSONObject;
    }
}
