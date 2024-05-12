package X;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Pc6, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC64810Pc6 implements Callable<Void> {
    public final String LJLIL;
    public final C64812Pc8 LJLILLLLZI;
    public final String LJLJI;
    public final EnumC64814PcA LJLJJLL;
    public final WeakHandler LJLJLJ;
    public final List<String> LJLJJI = new ArrayList();
    public final List<String> LJLJJL = new ArrayList();
    public int LJLJL = 0;

    static {
        C16880lQ.LJLLJ(CallableC64810Pc6.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1 A[LOOP:1: B:19:0x00bb->B:21:0x00c1, LOOP_END] */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void call() {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC64810Pc6.call():java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141 A[Catch: JSONException -> 0x0158, TRY_ENTER, TryCatch #8 {JSONException -> 0x0158, blocks: (B:38:0x012d, B:41:0x0141, B:42:0x014a, B:46:0x0145), top: B:37:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145 A[Catch: JSONException -> 0x0158, TryCatch #8 {JSONException -> 0x0158, blocks: (B:38:0x012d, B:41:0x0141, B:42:0x014a, B:46:0x0145), top: B:37:0x012d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119 A[Catch: IOException -> 0x011d, TRY_LEAVE, TryCatch #10 {IOException -> 0x011d, blocks: (B:66:0x0114, B:60:0x0119), top: B:65:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172 A[Catch: IOException -> 0x0176, TRY_LEAVE, TryCatch #2 {IOException -> 0x0176, blocks: (B:79:0x016d, B:73:0x0172), top: B:78:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.Pbz] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC64810Pc6.LIZ(java.lang.String):java.lang.String");
    }

    public final void LIZIZ(String str) {
        Logger.debug();
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (((ArrayList) this.LJLJJI).size() > 1) {
                JSONArray optJSONArray = jSONObject.optJSONArray("dns");
                if (optJSONArray == null) {
                    return;
                }
                for (int i = 0; i < optJSONArray.length(); i++) {
                    LIZJ(optJSONArray.optJSONObject(i));
                }
            } else {
                LIZJ(jSONObject);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("httpdns_backup_ip");
            if (optJSONArray2 != null) {
                C64811Pc7.LJ().LJII(optJSONArray2);
            }
        } catch (JSONException unused) {
            Logger.debug();
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("host");
        Logger.debug();
        int optInt = jSONObject.optInt("ttl");
        JSONArray optJSONArray = jSONObject.optJSONArray("ips");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString2 = optJSONArray.optString(i);
                if (C36981EfJ.LIZIZ(optString2)) {
                    arrayList2.add(optString2);
                } else if (C36981EfJ.LIZ(optString2)) {
                    arrayList.add(optString2);
                } else {
                    Logger.debug();
                }
            }
        }
        if (((ArrayList) this.LJLJJI).contains(optString)) {
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                C64813Pc9 c64813Pc9 = new C64813Pc9(optString, System.currentTimeMillis(), arrayList, arrayList2, optInt);
                C64812Pc8 c64812Pc8 = this.LJLILLLLZI;
                C64813Pc9 LIZJ = c64812Pc8.LIZJ(optString);
                if (LIZJ != null) {
                    if (C64811Pc7.LJ().LJLILLLLZI.get()) {
                        LIZJ.LJFF.removeMessages(10);
                        LIZJ.LJFF.removeMessages(12);
                    } else {
                        LIZJ.LJFF.removeMessages(13);
                    }
                }
                if (C64811Pc7.LJ().LJLILLLLZI.get()) {
                    Message obtain = Message.obtain();
                    obtain.obj = c64813Pc9;
                    obtain.what = 12;
                    c64813Pc9.LIZ(obtain);
                    c64813Pc9.LJFF.sendMessageDelayed(obtain, c64813Pc9.LIZLLL * 1000);
                    Message obtain2 = Message.obtain();
                    obtain2.obj = c64813Pc9;
                    obtain2.what = 10;
                    c64813Pc9.LIZ(obtain2);
                    c64813Pc9.LJFF.sendMessageDelayed(obtain2, (C64811Pc7.LJ().LJLJLLL.get() * 1000) + (c64813Pc9.LIZLLL * 1000));
                } else {
                    Message obtain3 = Message.obtain();
                    obtain3.obj = c64813Pc9;
                    obtain3.what = 13;
                    c64813Pc9.LIZ(obtain3);
                    c64813Pc9.LJFF.sendMessageDelayed(obtain3, c64813Pc9.LIZLLL * 1000);
                }
                synchronized (c64812Pc8.LIZ.LIZJ()) {
                    c64812Pc8.LIZ.LIZLLL(optString, c64813Pc9);
                }
                ((ConcurrentHashMap) this.LJLILLLLZI.LIZJ).remove(optString);
                ((ArrayList) this.LJLJJI).remove(optString);
            }
        }
    }

    public CallableC64810Pc6(String str, String str2, C64812Pc8 c64812Pc8, EnumC64814PcA enumC64814PcA, WeakHandler weakHandler) {
        this.LJLJI = str;
        this.LJLIL = str2;
        this.LJLILLLLZI = c64812Pc8;
        this.LJLJJLL = enumC64814PcA;
        this.LJLJLJ = weakHandler;
    }
}
