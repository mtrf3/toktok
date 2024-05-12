package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PaW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64712PaW extends RunnableC39007FSp {
    public final /* synthetic */ ArrayList LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public final void LIZJ() {
        Context context;
        String str;
        String str2;
        String str3;
        String str4;
        if (C64716Paa.LIZ == null) {
            synchronized (C64716Paa.class) {
                if (C64716Paa.LIZ == null) {
                    C64716Paa.LIZ = new C64716Paa();
                }
            }
        }
        C64716Paa c64716Paa = C64716Paa.LIZ;
        ArrayList arrayList = this.LJLJJL;
        String str5 = this.LJLJJLL;
        c64716Paa.getClass();
        if (arrayList == null || arrayList.isEmpty() || (context = TTNetInit.getTTNetDepend().getContext()) == null) {
            return;
        }
        Logger.debug();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str6 = (String) it.next();
            try {
                C64714PaY c64714PaY = new C64714PaY();
                c64714PaY.LIZIZ = true;
                c64714PaY.LIZJ = false;
                EZQ ezq = new EZQ(str6);
                ezq.LIZJ("tnc_src", "7");
                String LIZLLL = ezq.LIZLLL();
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                if (!TextUtils.isEmpty(str5)) {
                    hashMap2.put("x-tt-tnc-summary", str5);
                }
                String LIZJ = C64711PaV.LIZJ(LIZLLL, hashMap2, hashMap, c64714PaY);
                Logger.debug();
                if (!C38354F3m.LJ(LIZJ) && "success".equals(JSONObjectProtectorUtils.getString(new JSONObject(LIZJ), "message"))) {
                    try {
                        String str7 = "";
                        if (hashMap.get("x-ss-etag") == null || TextUtils.isEmpty((CharSequence) ListProtector.get((List) hashMap.get("x-ss-etag"), 0))) {
                            str = "";
                        } else {
                            str = (String) ListProtector.get((List) hashMap.get("x-ss-etag"), 0);
                        }
                        if (hashMap.get("x-ss-canary") == null || TextUtils.isEmpty((CharSequence) ListProtector.get((List) hashMap.get("x-ss-canary"), 0))) {
                            str2 = "";
                        } else {
                            str2 = (String) ListProtector.get((List) hashMap.get("x-ss-canary"), 0);
                        }
                        if (hashMap.get("x-tt-tnc-config") == null || TextUtils.isEmpty((CharSequence) ListProtector.get((List) hashMap.get("x-tt-tnc-config"), 0))) {
                            str3 = "";
                        } else {
                            str3 = (String) ListProtector.get((List) hashMap.get("x-tt-tnc-config"), 0);
                        }
                        if (hashMap.get("x-tt-tnc-abtest") == null || TextUtils.isEmpty((CharSequence) ListProtector.get((List) hashMap.get("x-tt-tnc-abtest"), 0))) {
                            str4 = "";
                        } else {
                            str4 = (String) ListProtector.get((List) hashMap.get("x-tt-tnc-abtest"), 0);
                        }
                        if (hashMap.get("x-tt-tnc-control") != null && !TextUtils.isEmpty((CharSequence) ListProtector.get((List) hashMap.get("x-tt-tnc-control"), 0))) {
                            str7 = (String) ListProtector.get((List) hashMap.get("x-tt-tnc-control"), 0);
                        }
                        Logger.debug();
                        C64693PaD.LJIILIIL(context).getClass();
                        C64693PaD.LJIIZILJ(str, str2, str3, str4, str7, LIZJ);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64712PaW(ArrayList arrayList, String str) {
        super((Object) null);
        this.LJLJJL = arrayList;
        this.LJLJJLL = str;
    }
}
