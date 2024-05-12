package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QP6 implements WeakHandler.IHandler {
    public static QP6 LJLJJLL;
    public Messenger LJLIL;
    public final WeakReference<Context> LJLILLLLZI;
    public final Messenger LJLJI;
    public long LJLJJI;
    public final QP7 LJLJJL = new QP7(this);

    public final void LIZIZ() {
        try {
            Message obtain = Message.obtain((Handler) null, 0);
            obtain.replyTo = this.LJLJI;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.LJLJJI);
            Logger.debug();
            obtain.obj = bundle;
            this.LJLIL.send(obtain);
        } catch (Throwable unused) {
            LIZJ();
        }
    }

    public final void LIZ() {
        WeakReference<Context> weakReference = this.LJLILLLLZI;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.LJLILLLLZI.get(), "com.ss.android.message.log.LogService"));
            C16880lQ.LLLJL(this.LJLILLLLZI.get(), intent, this.LJLJJL, 1);
        } catch (Throwable unused) {
        }
    }

    public final void LIZJ() {
        Logger.debug();
        if (this.LJLIL != null) {
            try {
                if (this.LJLILLLLZI.get() != null) {
                    this.LJLILLLLZI.get().unbindService(this.LJLJJL);
                }
            } catch (Throwable unused) {
            }
            try {
                this.LJLIL = null;
            } catch (Exception unused2) {
            }
        }
    }

    public QP6(Context context) {
        this.LJLILLLLZI = new WeakReference<>(C16880lQ.LLLLL(context));
        QP5.LIZ().getClass();
        Looper looper = QP5.LJLJI.getLooper();
        this.LJLJI = new Messenger(new WeakHandler(looper == null ? C16880lQ.LLJJJJ() : looper, this));
        LIZ();
    }

    public static void LJ(Context context) {
        if (!FCD.LJI(context) || context == null) {
            return;
        }
        QP6 qp6 = LJLJJLL;
        if (qp6 == null) {
            LJLJJLL = new QP6(context);
        } else {
            if (qp6.LJLIL != null) {
                return;
            }
            qp6.LIZ();
        }
    }

    public final void LIZLLL(List<Long> list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= 0) {
            return;
        }
        try {
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.LJLJI;
            Bundle bundle = new Bundle();
            long[] jArr = new long[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                jArr[i] = ((Long) ListProtector.get(list, i)).longValue();
            }
            bundle.putLongArray("event_ids", jArr);
            Logger.debug();
            obtain.obj = bundle;
            this.LJLIL.send(obtain);
        } catch (Throwable unused) {
            LIZJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:2:0x0000, B:7:0x00ba, B:11:0x000d, B:14:0x0014, B:16:0x002d, B:18:0x003e, B:22:0x00a0, B:23:0x0045, B:32:0x0070, B:26:0x0077, B:28:0x0097, B:29:0x0099, B:36:0x00a3, B:38:0x00a9, B:40:0x00ae, B:42:0x00b2), top: B:1:0x0000 }] */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r22) {
        /*
            r21 = this;
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> Lb9
            r2 = r22
            int r1 = r2.what     // Catch: java.lang.Throwable -> Lb9
            r5 = r21
            if (r1 == 0) goto Ld
            goto Lb6
        Ld:
            X.QQS r0 = X.QP8.LIZ()     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L14
            return
        L14:
            java.lang.Object r2 = r2.obj     // Catch: java.lang.Throwable -> Lb9
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "events"
            java.lang.String r1 = r2.getString(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "has_more"
            boolean r10 = r2.getBoolean(r0)     // Catch: java.lang.Throwable -> Lb9
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = X.C38354F3m.LJ(r1)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto Lac
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9
            r4.<init>()     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lb9
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lb9
            int r8 = r3.length()     // Catch: java.lang.Throwable -> Lb9
            r2 = 0
        L3c:
            if (r2 >= r8) goto La3
            org.json.JSONObject r1 = r3.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lb9
            if (r1 != 0) goto L45
            goto La0
        L45:
            java.lang.String r0 = "category"
            java.lang.String r13 = r1.optString(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "tag"
            java.lang.String r14 = r1.optString(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "label"
            java.lang.String r15 = r1.optString(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "value"
            long r16 = r1.optLong(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "ext_value"
            long r18 = r1.optLong(r0)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "ext_json"
            java.lang.String r6 = r1.optString(r0)     // Catch: java.lang.Throwable -> Lb9
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb9
            if (r0 != 0) goto L76
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lb9
            r0.<init>(r6)     // Catch: java.lang.Exception -> L76 java.lang.Throwable -> Lb9
            goto L77
        L76:
            r0 = 0
        L77:
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> Lb9
            X.QQS r11 = X.QP8.LIZ()     // Catch: java.lang.Throwable -> Lb9
            java.lang.ref.WeakReference<android.content.Context> r6 = r5.LJLILLLLZI     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r12 = r6.get()     // Catch: java.lang.Throwable -> Lb9
            android.content.Context r12 = (android.content.Context) r12     // Catch: java.lang.Throwable -> Lb9
            r20 = r0
            r11.onEvent(r12, r13, r14, r15, r16, r18, r20)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r0 = "_id"
            long r6 = r1.optLong(r0)     // Catch: java.lang.Throwable -> Lb9
            long r0 = r5.LJLJJI     // Catch: java.lang.Throwable -> Lb9
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 <= 0) goto L99
            r5.LJLJJI = r6     // Catch: java.lang.Throwable -> Lb9
        L99:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lb9
            r4.add(r0)     // Catch: java.lang.Throwable -> Lb9
        La0:
            int r2 = r2 + 1
            goto L3c
        La3:
            int r0 = r4.size()     // Catch: java.lang.Throwable -> Lb9
            if (r0 <= 0) goto Lac
            r5.LIZLLL(r4)     // Catch: java.lang.Throwable -> Lb9
        Lac:
            if (r10 == 0) goto Lb2
            r5.LIZIZ()     // Catch: java.lang.Throwable -> Lb9
            goto Lb9
        Lb2:
            r5.LIZJ()     // Catch: java.lang.Throwable -> Lb9
            goto Lb9
        Lb6:
            r0 = 2
            if (r1 == r0) goto Lba
        Lb9:
            return
        Lba:
            com.bytedance.common.utility.Logger.debug()     // Catch: java.lang.Throwable -> Lb9
            r5.LIZJ()     // Catch: java.lang.Throwable -> Lb9
            goto Lb9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QP6.handleMsg(android.os.Message):void");
    }
}
