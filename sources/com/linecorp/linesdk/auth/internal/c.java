package com.linecorp.linesdk.auth.internal;

import X.C03880Dg;
import X.C38891fp;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C66526Q9a;
import X.C66530Q9e;
import X.PPB;
import X.Q9V;
import X.Q9X;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public final class c {
    public final LineAuthenticationActivity LIZ;
    public final LineAuthenticationConfig LIZIZ;
    public final Q9V LIZJ;
    public final C66526Q9a LIZLLL;
    public final com.linecorp.linesdk.auth.internal.a LJ;
    public final Q9X LJFF;
    public final String[] LJI;
    public final d LJII;

    /* loaded from: classes12.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                c cVar = c.this;
                if (cVar.LJII.LJLJJI != 3 && !cVar.LIZ.isFinishing()) {
                    c.this.LIZ.LIZ(LineLoginResult.CANCEL);
                }
            } finally {
                if (LIZ) {
                }
            }
        }

        public b() {
        }
    }

    /* loaded from: classes12.dex */
    public class a extends PthreadAsyncTask<String, Void, LineLoginResult> {
        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x013e, code lost:
        
            if (r9 == null) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object doInBackground(java.lang.Object[] r15) {
            /*
                Method dump skipped, instructions count: 491
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.auth.internal.c.a.doInBackground(java.lang.Object[]):java.lang.Object");
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Object obj) {
            c cVar = c.this;
            cVar.LJII.LJLJJI = 4;
            cVar.LIZ.LIZ((LineLoginResult) obj);
        }
    }

    /* renamed from: com.linecorp.linesdk.auth.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public class AsyncTaskC0025c extends PthreadAsyncTask<Void, Void, PPB<C66530Q9e>> {
        public static List LIZ(PackageManager packageManager, Intent intent) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "3758015566542106988"));
            return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 0);
        }

        public AsyncTaskC0025c() {
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            c cVar = c.this;
            Q9V q9v = cVar.LIZJ;
            String str = cVar.LIZIZ.channelId;
            Uri build = q9v.LIZ.buildUpon().appendPath("oauth").appendPath("otp").build();
            HashMap hashMap = new HashMap(1);
            hashMap.put("client_id", str);
            return q9v.LIZIZ.LIZIZ(build, Collections.emptyMap(), hashMap, Q9V.LIZJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0121, code lost:
        
            if (r1 >= 6) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0128 A[Catch: ActivityNotFoundException -> 0x01a5, TRY_ENTER, TryCatch #0 {ActivityNotFoundException -> 0x01a5, blocks: (B:13:0x0034, B:14:0x004a, B:18:0x0054, B:20:0x00a1, B:22:0x00a4, B:23:0x00af, B:25:0x00de, B:26:0x00e3, B:28:0x00eb, B:29:0x00f5, B:31:0x00fd, B:33:0x010b, B:40:0x0128, B:41:0x013b, B:44:0x0161, B:45:0x016e, B:46:0x0191, B:47:0x01a4, B:48:0x0111, B:52:0x011a), top: B:12:0x0034 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x013b A[Catch: ActivityNotFoundException -> 0x01a5, TryCatch #0 {ActivityNotFoundException -> 0x01a5, blocks: (B:13:0x0034, B:14:0x004a, B:18:0x0054, B:20:0x00a1, B:22:0x00a4, B:23:0x00af, B:25:0x00de, B:26:0x00e3, B:28:0x00eb, B:29:0x00f5, B:31:0x00fd, B:33:0x010b, B:40:0x0128, B:41:0x013b, B:44:0x0161, B:45:0x016e, B:46:0x0191, B:47:0x01a4, B:48:0x0111, B:52:0x011a), top: B:12:0x0034 }] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onPostExecute(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.auth.internal.c.AsyncTaskC0025c.onPostExecute(java.lang.Object):void");
        }
    }

    public c(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, d dVar, String[] strArr) {
        Context applicationContext = lineAuthenticationActivity.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        Q9V q9v = new Q9V(applicationContext, lineAuthenticationConfig.endPointBaseUrl);
        Context applicationContext2 = lineAuthenticationActivity.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext2 == null) {
            applicationContext2 = C38891fp.LJLILLLLZI;
        }
        C66526Q9a c66526Q9a = new C66526Q9a(applicationContext2, lineAuthenticationConfig.endPointBaseUrl);
        com.linecorp.linesdk.auth.internal.a aVar = new com.linecorp.linesdk.auth.internal.a(dVar);
        Context applicationContext3 = lineAuthenticationActivity.getApplicationContext();
        if (C38891fp.LJLJI && applicationContext3 == null) {
            applicationContext3 = C38891fp.LJLILLLLZI;
        }
        Q9X q9x = new Q9X(applicationContext3, lineAuthenticationConfig.channelId);
        this.LIZ = lineAuthenticationActivity;
        this.LIZIZ = lineAuthenticationConfig;
        this.LIZJ = q9v;
        this.LIZLLL = c66526Q9a;
        this.LJ = aVar;
        this.LJFF = q9x;
        this.LJII = dVar;
        this.LJI = strArr;
    }
}
