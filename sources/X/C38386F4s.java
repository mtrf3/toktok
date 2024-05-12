package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.ReadableMap;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.F4s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38386F4s {
    public static final List<String> LIZ = C47261Igj.LJJIJIL("java.", "androidx.", "android.", "com.android.", "dalvik.", "io.reactivex.", "com.google.gson.", "kotlin.", "kotlinx.", "com.bytedance.helios.binder", "com.bytedance.pumbaa");

    public static final String LIZ(View view) {
        o.LJIIIZ(view, "view");
        Context context = view.getContext();
        if (context instanceof Activity) {
            return C16880lQ.LJLLILLLL(context.getClass());
        }
        String LIZJ = C64403PPj.LIZJ();
        if (LIZJ != null) {
            return LIZJ;
        }
        return C16880lQ.LJLLILLLL(context.getClass());
    }

    public static OSJ LIZIZ(View view) {
        Object parent;
        Object tag;
        String obj;
        if (view == null || (parent = view.getParent()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2 != null && (tag = view2.getTag(R.id.ni3)) != null && (obj = tag.toString()) != null && (ujb.o.LJJJLIIL(obj, "Fragment#", false) || ujb.o.LJJJLIIL(obj, "Dialog#", false))) {
                List LJLJJL = s.LJLJJL(obj, new String[]{"#"}, 0, 6);
                if (LJLJJL.size() > 1) {
                    return new OSJ(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1), arrayList);
                }
            }
            String LJLLILLLL = C16880lQ.LJLLILLLL(parent.getClass());
            o.LJIIIIZZ(LJLLILLLL, "nextView.javaClass.canonicalName");
            arrayList.add(LJLLILLLL);
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view3 = (View) parent;
            if (view3 != null) {
                parent = view3.getParent();
            } else {
                parent = null;
            }
            i++;
            if (i >= 10) {
                break;
            }
        }
        return new OSJ(null, null, arrayList);
    }

    public static final List<Object> LIZLLL(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object opt = jSONArray.opt(i);
            if (opt instanceof Long) {
                arrayList.add(Long.valueOf(jSONArray.optLong(i)));
            } else if (opt instanceof Double) {
                arrayList.add(Double.valueOf(jSONArray.optDouble(i)));
            } else if (opt instanceof Integer) {
                arrayList.add(Integer.valueOf(JSONArrayProtectorUtils.getInt(jSONArray, i)));
            } else if (opt instanceof String) {
                arrayList.add(jSONArray.optString(i));
            } else if (opt instanceof JSONObject) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                o.LJIIIIZZ(optJSONObject, "json.optJSONObject(index)");
                arrayList.add(LJ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                JSONArray optJSONArray = jSONArray.optJSONArray(i);
                o.LJIIIIZZ(optJSONArray, "json.optJSONArray(index)");
                arrayList.add(LIZLLL(optJSONArray));
            } else if (opt instanceof Boolean) {
                arrayList.add(Boolean.valueOf(jSONArray.optBoolean(i)));
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public static final java.util.Map<String, Object> LJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jSONObject.opt(key);
            if (opt instanceof Long) {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, Long.valueOf(jSONObject.optLong(key)));
            } else if (opt instanceof Double) {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, Double.valueOf(jSONObject.optDouble(key)));
            } else if (opt instanceof Integer) {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, Integer.valueOf(jSONObject.optInt(key)));
            } else if (opt instanceof String) {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, jSONObject.optString(key));
            } else if (opt instanceof JSONObject) {
                o.LJIIIIZZ(key, "key");
                JSONObject optJSONObject = jSONObject.optJSONObject(key);
                o.LJIIIIZZ(optJSONObject, "json.optJSONObject(key)");
                linkedHashMap.put(key, LJ(optJSONObject));
            } else if (opt instanceof JSONArray) {
                o.LJIIIIZZ(key, "key");
                JSONArray optJSONArray = jSONObject.optJSONArray(key);
                o.LJIIIIZZ(optJSONArray, "json.optJSONArray(key)");
                linkedHashMap.put(key, LIZLLL(optJSONArray));
            } else if (opt instanceof Boolean) {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, Boolean.valueOf(jSONObject.optBoolean(key)));
            } else {
                o.LJIIIIZZ(key, "key");
                linkedHashMap.put(key, null);
            }
        }
        return linkedHashMap;
    }

    public static final JSONObject LJFF(List<? extends Object> list) {
        Object LIZ2;
        o.LJIIIZ(list, "list");
        if (list.size() == 1 && (ORZ.LJLLJ(list) instanceof ReadableMap)) {
            Object LJLLJ = ORZ.LJLLJ(list);
            if (LJLLJ != null) {
                return new JSONObject(((ReadableMap) LJLLJ).toHashMap());
            }
            throw new NullPointerException("null cannot be cast to non-null type com.lynx.react.bridge.ReadableMap");
        }
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            Object obj2 = null;
            if (i >= 0) {
                if (obj instanceof String) {
                    try {
                        if (ujb.o.LJJJLIIL((String) obj, "{", false) && ujb.o.LJJJJ((String) obj, "}", false)) {
                            LIZ2 = new JSONObject((String) obj);
                        } else if (ujb.o.LJJJLIIL((String) obj, "[", false) && ujb.o.LJJJJ((String) obj, "]", false)) {
                            LIZ2 = new JSONArray((String) obj);
                        } else {
                            LIZ2 = obj;
                        }
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    if (!C3C5.m12isFailureimpl(LIZ2)) {
                        obj2 = LIZ2;
                    }
                    String valueOf = String.valueOf(i);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    jSONObject.put(valueOf, obj);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return jSONObject;
    }

    public static final String LIZJ(Throwable th, boolean z) {
        String className;
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (z) {
                    Iterator<String> it = LIZ.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String next = it.next();
                        String str = next;
                        if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null && ujb.o.LJJJLIIL(className, str, false)) {
                            if (next != null) {
                            }
                        }
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("at ");
                    LIZ2.append(stackTraceElement);
                    LIZ2.append('\n');
                    sb.append(X1D.LIZIZ(LIZ2));
                }
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stackTraceBuffer.toString()");
        return sb2;
    }
}
