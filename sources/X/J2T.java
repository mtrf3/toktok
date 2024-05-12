package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class J2T extends PthreadThread implements Handler.Callback {
    public static final J2X LJLJJI = new J2X();
    public final java.util.Map<String, List<J2W>> LJLIL;
    public final LinkedList<J2U> LJLILLLLZI;
    public Handler LJLJI;

    public J2T() {
        super("/log/EventBus");
        this.LJLIL = new ConcurrentHashMap();
        this.LJLILLLLZI = new LinkedList<>();
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            super.run();
            Looper.prepare();
            this.LJLJI = new Handler(this);
            Looper.loop();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:7:0x0014, B:10:0x0022, B:12:0x0028, B:14:0x0030, B:16:0x003c, B:18:0x006e, B:19:0x0072, B:21:0x0078, B:24:0x0084, B:28:0x0095, B:30:0x009a, B:31:0x009d, B:37:0x00a5, B:34:0x00a1, B:42:0x0042, B:44:0x004c, B:46:0x0052, B:48:0x005a, B:50:0x0066), top: B:6:0x0014, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.J2U r9) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, java.util.List<X.J2W>> r1 = r8.LJLIL
            java.lang.String r0 = r9.LIZ
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto Lf
            return
        Lf:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.String r1 = "applog_event_upload_eid"
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r6 = "responseByte"
            java.lang.String r5 = "$$EVENT_LOCAL_IDS"
            if (r0 == 0) goto L42
            java.lang.Object r1 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L42
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1.has(r5)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L42
            java.lang.Object r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lab
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r0.opt(r5)     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> Lab
            r7.addAll(r1)     // Catch: java.lang.Throwable -> Lab
            goto La9
        L42:
            java.lang.String r1 = "applog_do_request_end"
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            java.lang.Object r1 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1.has(r6)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            java.lang.Object r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lab
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r0.opt(r6)     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r1 instanceof byte[]     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La9
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r4 = r1.clone()     // Catch: java.lang.Throwable -> Lab
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> Lab
        L6e:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Lab
        L72:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto Lab
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Lab
            X.J2W r2 = (X.J2W) r2     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Lab
            boolean r0 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
            java.lang.Object r0 = r9.LIZIZ     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
            r1.<init>(r0)     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
            boolean r0 = r7.isEmpty()     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
            if (r0 != 0) goto L98
            r1.put(r5, r7)     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
        L98:
            if (r4 == 0) goto L9d
            r1.put(r6, r4)     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
        L9d:
            r2.LIZ()     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Lab
            goto L72
        La1:
            r2.LIZ()     // Catch: java.lang.Throwable -> Lab
            goto L72
        La5:
            r2.LIZ()     // Catch: java.lang.Throwable -> Lab
            goto L72
        La9:
            r4 = 0
            goto L6e
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J2T.LJFF(X.J2U):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            LJFF((J2U) message.obj);
        }
        return true;
    }

    public final void LIZLLL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        J2U j2u = new J2U(str, obj);
        if (!((ConcurrentHashMap) this.LJLIL).containsKey(str)) {
            synchronized (this.LJLILLLLZI) {
                if (this.LJLILLLLZI.size() >= 100) {
                    this.LJLILLLLZI.poll();
                }
                this.LJLILLLLZI.add(j2u);
            }
            return;
        }
        Handler handler = this.LJLJI;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(1, j2u));
        } else {
            LJFF(j2u);
        }
    }

    public final void LJ(String str, J2V j2v) {
        if (!TextUtils.isEmpty(str)) {
            J2U j2u = new J2U(str, j2v.LIZ());
            if (!((ConcurrentHashMap) this.LJLIL).containsKey(str)) {
                synchronized (this.LJLILLLLZI) {
                    if (this.LJLILLLLZI.size() >= 100) {
                        this.LJLILLLLZI.poll();
                    }
                    this.LJLILLLLZI.add(j2u);
                }
                return;
            }
            Handler handler = this.LJLJI;
            if (handler != null) {
                handler.sendMessage(handler.obtainMessage(1, j2u));
            } else {
                LJFF(j2u);
            }
        }
    }
}
