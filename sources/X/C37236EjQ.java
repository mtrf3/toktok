package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EjQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37236EjQ {
    public static final Keva LIZ = Keva.getRepo("pia-snapshot-index-repo");
    public static final Keva LIZIZ = Keva.getRepo("pia-snapshot-content-repo");

    public static void LIZIZ(String str) {
        Keva keva = LIZ;
        keva.erase(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append("_detail_id");
        keva.erase(X1D.LIZIZ(LIZ2));
    }

    public static Keva LIZJ(String str) {
        String LJFF = i0.LJFF(str, "_detail_id");
        Keva keva = LIZ;
        if (keva.contains(str) && keva.contains(LJFF)) {
            String uuid = keva.getString(LJFF, "");
            o.LJFF(uuid, "uuid");
            if (uuid.length() > 0) {
                return Keva.getRepo(uuid);
            }
            return null;
        }
        return null;
    }

    public static ArrayList LIZLLL(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                arrayList.add(keys.next());
            }
        }
        C40675Fxn.LJJLIIIIJ(arrayList);
        return arrayList;
    }

    public static void LJ(String str) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[SnapShot] remove all snapshots (Path = ");
        LIZ2.append(str);
        LIZ2.append(')');
        C37238EjS.LIZ(X1D.LIZIZ(LIZ2));
        Keva LIZJ = LIZJ(str);
        if (LIZJ != null) {
            java.util.Map<String, ?> all = LIZJ.getAll();
            if (all != null) {
                Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                while (it.hasNext()) {
                    LIZIZ.erase(JSONObjectProtectorUtils.getString(new JSONObject((String) it.next().getValue()), "content_UUID"));
                }
                LIZJ.clear();
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
        }
        LIZIZ(str);
    }

    public static String LIZ(String str, List list, JSONObject jSONObject) {
        if (jSONObject.length() == 0) {
            return str;
        }
        String LIZIZ2 = C42398GkU.LIZIZ(str, '?');
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ2);
            LIZ2.append((String) ListProtector.get(list, i));
            LIZ2.append('=');
            LIZ2.append(jSONObject.opt((String) ListProtector.get(list, i)));
            LIZIZ2 = X1D.LIZIZ(LIZ2);
            if (i < r4.size() - 1) {
                LIZIZ2 = C42398GkU.LIZIZ(LIZIZ2, '&');
            }
        }
        return LIZIZ2;
    }

    public static boolean LJFF(String str, JSONObject jSONObject, ArrayList arrayList) {
        Object LIZ2;
        Keva LIZJ = LIZJ(str);
        if (LIZJ != null) {
            String LIZ3 = LIZ(str, arrayList, jSONObject);
            if (LIZJ.contains(LIZ3)) {
                try {
                    LIZ2 = new JSONObject(LIZJ.getString(LIZ3, ""));
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m10exceptionOrNullimpl(LIZ2) == null) {
                    String optString = ((JSONObject) LIZ2).optString("content_UUID");
                    Keva keva = LIZIZ;
                    if (keva.contains(optString)) {
                        keva.erase(optString);
                        LIZJ.erase(LIZ3);
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean LJI(String str, JSONObject jSONObject, ArrayList arrayList, String str2, String str3, long j, String str4, int i) {
        Object LIZ2;
        try {
            Keva keva = LIZ;
            if (!keva.contains(str)) {
                String[] strArr = new String[0];
                if (!arrayList.isEmpty()) {
                    Object[] array = arrayList.toArray(strArr);
                    o.LJFF(array, "sortQueryKeys.toArray(array)");
                    strArr = (String[]) array;
                }
                keva.storeStringArray(str, strArr);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(str);
                LIZ3.append("_detail_id");
                keva.storeString(X1D.LIZIZ(LIZ3), UUID.randomUUID().toString());
            }
            Keva LIZJ = LIZJ(str);
            if (LIZJ != null) {
                String LIZ4 = LIZ(str, arrayList, jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("expire_time", j);
                jSONObject2.put("snapshot_version", str4);
                jSONObject2.put("protocol_version", i);
                jSONObject2.put("content_UUID", UUID.randomUUID().toString());
                String optString = jSONObject2.optString("content_UUID");
                o.LJFF(optString, "detailValue.optString(NAME_CONTENT_UUID)");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("content", str2);
                if (str3 != null) {
                    jSONObject3.put("head", str3);
                }
                LIZIZ.storeString(optString, jSONObject3.toString());
                LIZJ.storeString(LIZ4, jSONObject2.toString());
                LIZ2 = C76800UCe.LIZ;
            } else {
                LIZ2 = null;
            }
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl == null) {
            C37238EjS.LIZ("[SnapShot] save snapshot success");
            return true;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("[SnapShot] save snapshot failed. (Reason: ");
        LIZ5.append(m10exceptionOrNullimpl.getMessage());
        LIZ5.append(')');
        C37238EjS.LJIIIIZZ(6, X1D.LIZIZ(LIZ5), null);
        return false;
    }
}
