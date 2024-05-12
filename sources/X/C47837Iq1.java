package X;

import android.content.SharedPreferences;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Iq1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47837Iq1 {
    public static final C47837Iq1 LJIIIIZZ = new C47837Iq1();
    public final long LIZIZ;
    public C47902Ir4 LJI;
    public final C47841Iq5 LJII = new C47841Iq5();
    public final ArrayList<C47836Iq0> LIZJ = new ArrayList<>();
    public final ArrayList<Long> LJFF = new ArrayList<>();
    public final ArrayList<C47836Iq0> LIZLLL = new ArrayList<>();
    public final ArrayList<C47836Iq0> LJ = new ArrayList<>();
    public final long LIZ = 1;

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0040, code lost:
    
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47837Iq1.LIZ():void");
    }

    public C47837Iq1() {
        this.LIZIZ = 1073741824L;
        this.LIZIZ = 1073741824L;
    }

    public static ArrayList LJ(String str) {
        ArrayList arrayList = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split == null || split.length <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (String str2 : split) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList2.add(str2);
                    }
                }
                return arrayList2;
            } catch (Throwable th) {
                th = th;
                arrayList = arrayList2;
                TTVideoEngineLog.d(th);
                return arrayList;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void LIZJ(C47836Iq0 c47836Iq0) {
        if (!this.LJ.contains(c47836Iq0)) {
            this.LJ.add(c47836Iq0);
        }
        if (this.LIZLLL.contains(c47836Iq0)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[downloader] resume task. is waiting,  task = ");
            LIZ.append(c47836Iq0.toString());
            C78253UnR.LJI("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ));
            this.LIZLLL.remove(c47836Iq0);
        }
    }

    public final boolean LIZLLL(C47836Iq0 c47836Iq0) {
        int i;
        if (this.LJ.size() < this.LIZ || (this.LJ.contains(c47836Iq0) && ((i = c47836Iq0.LJFF) == 3 || i == 5))) {
            StringBuilder LIZJ = V10.LIZJ("[downloader] get free size, size = ", -1L, ", limite = ");
            LIZJ.append(this.LIZIZ);
            C78253UnR.LJI("TTVideoEngine.Downloader", X1D.LIZIZ(LIZJ));
            if (-1 > this.LIZIZ) {
                return true;
            }
            c47836Iq0.LJI(new C47789IpF("kTTVideoErrorDomainDownload", -9947, 0, "available size is less than 1073741824 M"));
            return false;
        }
        c47836Iq0.LJIIIIZZ(1);
        if (!this.LIZLLL.contains(c47836Iq0)) {
            this.LIZLLL.add(c47836Iq0);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[downloader] task is waiting, task info ");
        LIZ.append(c47836Iq0.toString());
        TTVideoEngineLog.d("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ));
        return false;
    }

    public final void LIZIZ(C47836Iq0 c47836Iq0, C47789IpF c47789IpF) {
        if (c47836Iq0.LJIIJ && !c47836Iq0.LJIIJJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[downloader] task did finished, info = ");
            LIZ.append(c47836Iq0.toString());
            TTVideoEngineLog.d("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ));
            return;
        }
        if (c47789IpF != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[downloader] error info ");
            LIZ2.append(c47789IpF.toString());
            TTVideoEngineLog.d("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ2));
        }
        c47836Iq0.LJIIJ = true;
        C47843Iq7 c47843Iq7 = new C47843Iq7();
        c47843Iq7.LIZ = c47836Iq0;
        c47843Iq7.LIZIZ = new ArrayList<>(this.LIZJ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        arrayList.add(c47843Iq7);
        C47841Iq5 c47841Iq5 = this.LJII;
        if (c47841Iq5.LIZIZ != null && c47841Iq5.LIZ != null) {
            Message obtain = Message.obtain();
            obtain.what = 11;
            obtain.obj = arrayList;
            c47841Iq5.LIZIZ.sendMessage(obtain);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[downloader] task complete, task info = ");
        LIZ3.append(c47836Iq0.toString());
        TTVideoEngineLog.d("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ3));
        if (this.LJ.contains(c47836Iq0)) {
            this.LJ.remove(c47836Iq0);
        }
        if (this.LJ.size() >= this.LIZ) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("[downloader] running task count is ");
            LIZ4.append(this.LJ.size());
            LIZ4.append(" max count is ");
            LIZ4.append(this.LIZ);
            TTVideoEngineLog.d("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ4));
            return;
        }
        if (this.LIZLLL.size() < 1) {
            TTVideoEngineLog.d("TTVideoEngine.Downloader", "[downloader] waiting task is empty");
            return;
        }
        C47836Iq0 c47836Iq02 = (C47836Iq0) ListProtector.get(this.LIZLLL, 0);
        this.LIZLLL.remove(c47836Iq02);
        c47836Iq02.LJII();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("[downloader] auto resume waiting task: ");
        LIZ5.append(c47836Iq02.toString());
        TTVideoEngineLog.d("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ5));
    }

    public final void LJFF(C47836Iq0 c47836Iq0, ArrayList<C47836Iq0> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator<C47836Iq0> it = arrayList.iterator();
        while (it.hasNext()) {
            C47836Iq0 next = it.next();
            if (!arrayList2.contains(Long.valueOf(next.LIZIZ))) {
                arrayList2.add(Long.valueOf(next.LIZIZ));
            }
        }
        Collections.sort(arrayList2);
        StringBuilder sb = new StringBuilder(arrayList2.size());
        for (int i = 0; i < arrayList2.size(); i++) {
            sb.append(ListProtector.get(arrayList2, i));
            if (i < arrayList2.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        this.LJI.LIZLLL("index", sb2);
        SharedPreferences.Editor edit = F9J.LIZIZ(null, 0, "TTVideoEngine_download_index_v01").edit();
        edit.putString("index", sb2);
        edit.commit();
        String jSONObject = c47836Iq0.LIZJ().toString();
        String valueOf = String.valueOf(c47836Iq0.LIZIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[downloader] write task. key ");
        LIZ.append(valueOf);
        LIZ.append(" value: ");
        LIZ.append(jSONObject);
        C78253UnR.LJI("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ));
        if (arrayList.contains(c47836Iq0)) {
            if (!this.LJI.LIZLLL(valueOf, jSONObject)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[downloader] save task fail, videoid = ");
                LIZ2.append(c47836Iq0.LJIIL);
                LIZ2.append(" taskIdentifier = ");
                LIZ2.append(c47836Iq0.LIZIZ);
                C78253UnR.LIZLLL("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ2));
                c47836Iq0.LJI(new C47789IpF("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
                return;
            }
            return;
        }
        if (this.LJI.LIZJ(valueOf)) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[downloader] remove task fail, videoid = ");
        LIZ3.append(c47836Iq0.LJIIL);
        LIZ3.append(" taskIdentifier = ");
        LIZ3.append(c47836Iq0.LIZIZ);
        C78253UnR.LIZLLL("TTVideoEngine.Downloader", X1D.LIZIZ(LIZ3));
        c47836Iq0.LJI(new C47789IpF("kTTVideoErrorDomainDownload", -9949, -1, jSONObject));
    }
}
