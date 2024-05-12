package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;
import com.bytedance.common.utility.Logger;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.FfM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39532FfM {
    public static C39532FfM LIZJ;
    public final Object LIZ;
    public final Object LIZIZ;

    public final void LJ() {
        View view;
        if (!BadPhonesWatchLiveCommonUIOptSetting.INSTANCE.getRemoveTopShadow() && (view = (View) this.LIZ) != null) {
            view.setVisibility(0);
        }
        View view2 = (View) this.LIZIZ;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0021 A[Catch: all -> 0x0036, TryCatch #2 {all -> 0x0036, blocks: (B:8:0x0016, B:24:0x0021), top: B:7:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39532FfM(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r4.LIZ = r0
            r3 = 0
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L12
            goto L15
        L12:
            java.lang.String r0 = r0.sourceDir     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r0 = r3
        L16:
            java.lang.String r2 = X.C64065PCj.LIZIZ(r0)     // Catch: java.lang.Throwable -> L36
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L21
            goto L36
        L21:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = "meta_channel"
            java.lang.String r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(r1, r0)     // Catch: java.lang.Throwable -> L36
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L36
            r0 = r0 ^ 1
            if (r0 != 0) goto L35
            goto L36
        L35:
            r3 = r1
        L36:
            r4.LIZIZ = r3     // Catch: java.lang.Exception -> L39
            goto L3d
        L39:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L3d:
            java.lang.Object r2 = r4.LIZ     // Catch: java.lang.Exception -> L4f
            java.util.Properties r2 = (java.util.Properties) r2     // Catch: java.lang.Exception -> L4f
            android.content.res.AssetManager r1 = r5.getAssets()     // Catch: java.lang.Exception -> L4f
            java.lang.String r0 = "ss.properties"
            java.io.InputStream r0 = r1.open(r0)     // Catch: java.lang.Exception -> L4f
            r2.load(r0)     // Catch: java.lang.Exception -> L4f
            goto L53
        L4f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39532FfM.<init>(android.content.Context):void");
    }

    public static C39532FfM LIZJ(Context context) {
        if (LIZJ == null) {
            synchronized (C39532FfM.class) {
                if (LIZJ == null) {
                    LIZJ = new C39532FfM(context);
                }
            }
        }
        return LIZJ;
    }

    public final void LIZ(InterfaceC39534FfO interfaceC39534FfO) {
        if (!((List) this.LIZIZ).contains(interfaceC39534FfO)) {
            ((List) this.LIZIZ).add(interfaceC39534FfO);
        }
    }

    public final void LIZLLL(File file) {
        File[] listFiles;
        if (((AtomicBoolean) this.LIZ).get() || file == null || !file.exists()) {
            return;
        }
        ((AtomicBoolean) this.LIZ).set(true);
        Iterator it = ((List) this.LIZIZ).iterator();
        while (it.hasNext()) {
            ((InterfaceC39534FfO) it.next()).LIZ(file, true);
        }
        if (!file.isDirectory()) {
            ((AtomicBoolean) this.LIZ).set(false);
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty() && ((AtomicBoolean) this.LIZ).get()) {
            File file2 = (File) linkedList.remove();
            if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                for (File file3 : listFiles) {
                    if (file3 != null && file3.exists()) {
                        Iterator it2 = ((List) this.LIZIZ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC39534FfO) it2.next()).LIZ(file3, false);
                        }
                        if (file3.isDirectory()) {
                            linkedList.add(file3);
                        }
                    }
                }
            }
        }
        ((AtomicBoolean) this.LIZ).set(false);
    }

    public C39532FfM(int i) {
        if (i != 3) {
            this.LIZ = new ConcurrentHashMap(16, 0.75f, 10);
            this.LIZIZ = new ReferenceQueue();
        } else {
            this.LIZ = new AtomicBoolean(false);
            this.LIZIZ = new ArrayList();
        }
    }

    public /* synthetic */ C39532FfM(View view) {
        this.LIZ = view.findViewById(R.id.eq5);
        this.LIZIZ = view.findViewById(R.id.if2);
    }

    public final String LIZIZ(String str, String str2) {
        Object obj;
        Object obj2 = null;
        try {
            Object obj3 = this.LIZIZ;
            if (((JSONObject) obj3) != null) {
                obj = ((JSONObject) obj3).get(str);
            } else {
                Object obj4 = this.LIZ;
                if (((Properties) obj4) != null && ((Properties) obj4).containsKey(str)) {
                    obj = ((Properties) this.LIZ).get(str);
                } else {
                    obj = null;
                }
            }
            Logger.debug();
            obj2 = obj;
        } catch (Exception unused) {
        }
        if (!(obj2 instanceof String)) {
            return str2;
        }
        return (String) obj2;
    }
}
