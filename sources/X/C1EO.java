package X;

import Y.IDRunnableS65S0000000;
import android.content.Context;
import com.benchmark.IBTCHConfiguration;
import com.benchmark.collection_api.BXCollectionAPI;
import com.benchmark.collection_api.BXCollectionImpl;
import com.benchmark.collection_api.ByteBenchCollectionDowngrade;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1EO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EO implements BXCollectionAPI {
    public static final String LIZ;
    public static final AtomicBoolean LIZIZ;
    public static final AtomicBoolean LIZJ;
    public static volatile C275316f LIZLLL;
    public static volatile ByteBenchCollectionDowngrade LJ;
    public static volatile boolean LJFF;

    static {
        String name = C1EO.class.getName();
        LIZ = name;
        LIZIZ = new AtomicBoolean(false);
        LIZJ = new AtomicBoolean(false);
        LIZLLL = null;
        LJ = new ByteBenchCollectionDowngrade();
        LJFF = false;
        C47261Igj.LJJJJZ(name);
        if (!C06320Mq.LIZ()) {
            C47261Igj.LJIILJJIL(name);
            final IDRunnableS65S0000000 iDRunnableS65S0000000 = new IDRunnableS65S0000000(0);
            if (AabPluginServiceImpl.LIZLLL() == null) {
                C47261Igj.LJJJJZ("BXBundleTools");
                return;
            }
            ArrayList arrayList = new ArrayList();
            C47261Igj.LJIILJJIL("BXBundleTools");
            IPluginService LIZLLL2 = AabPluginServiceImpl.LIZLLL();
            if (LIZLLL2 == null) {
                C47261Igj.LJJJJZ("BXBundleTools");
                return;
            }
            LIZLLL2.enableInstall();
            C37132Ehk c37132Ehk = new C37132Ehk();
            c37132Ehk.LIZ = "com.ss.android.ugc.aweme.benchmark";
            c37132Ehk.LIZIZ = true;
            c37132Ehk.LIZLLL = new InterfaceC37126Ehe(iDRunnableS65S0000000) { // from class: X.1Hb
                public final Runnable LJLIL;

                {
                    this.LJLIL = iDRunnableS65S0000000;
                }

                /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
                
                    if (r1 != null) goto L13;
                 */
                @Override // X.InterfaceC37126Ehe
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(java.lang.String r6, boolean r7) {
                    /*
                        r5 = this;
                        java.lang.StringBuilder r2 = X.X1D.LIZ()
                        java.lang.String r0 = "df_bytebenchstart load at: "
                        r2.append(r0)
                        long r0 = java.lang.System.currentTimeMillis()
                        r2.append(r0)
                        X.X1D.LIZIZ(r2)
                        java.lang.String r4 = "BXBundleTools"
                        X.C47261Igj.LJIILJJIL(r4)
                        com.bytedance.ies.ugc.aweme.plugin.service.IPluginService r2 = com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl.LIZLLL()
                        if (r2 != 0) goto L1f
                        return
                    L1f:
                        X.Ehb r0 = r2.LIZJ()
                        r3 = 0
                        if (r0 == 0) goto L4d
                        X.0Zf r0 = X.C09590Zf.LJIILLIIL
                        android.content.Context r1 = r0.LIZ
                        if (r1 != 0) goto L3d
                        X.C47261Igj.LJJJJZ(r4)
                        com.benchmark.IBTCHConfiguration r0 = com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl.createIBTCHConfigurationbyMonsterPlugin(r3)
                        if (r0 == 0) goto L4d
                        X.11y r0 = r0.getByteBenchConfig()
                        android.content.Context r1 = r0.LIZ
                        if (r1 == 0) goto L4d
                    L3d:
                        X.C47261Igj.LJJIIJ(r4)
                        X.Ehb r0 = r2.LIZJ()
                        r0.getClass()
                        boolean r0 = X.C39647FhD.LIZLLL(r1)
                        X.C06320Mq.LIZ = r0
                    L4d:
                        java.lang.Runnable r0 = r5.LJLIL
                        if (r0 == 0) goto L54
                        r0.run()
                    L54:
                        org.json.JSONObject r2 = new org.json.JSONObject
                        r2.<init>()
                        java.lang.String r1 = "result"
                        java.lang.String r0 = "succeed"
                        r2.put(r1, r0)     // Catch: org.json.JSONException -> L6b
                        java.lang.String r0 = "ret"
                        r2.put(r0, r3)     // Catch: org.json.JSONException -> L6b
                        java.lang.String r0 = "bytebench_df_install_result"
                        X.C38891fp.LJJII(r0, r2)     // Catch: org.json.JSONException -> L6b
                        goto L6e
                    L6b:
                        X.C47261Igj.LJIILJJIL(r4)
                    L6e:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C30351Hb.onSuccess(java.lang.String, boolean):void");
                }

                @Override // X.InterfaceC37126Ehe
                public final void onFailed(String str, boolean z, int i) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("result", "failed");
                        jSONObject.put("ret", i);
                        C38891fp.LJJII("bytebench_df_install_result", jSONObject);
                    } catch (JSONException unused) {
                        C47261Igj.LJIILJJIL("BXBundleTools");
                    }
                }
            };
            F5Q f5q = new F5Q();
            f5q.LIZ = false;
            f5q.LIZIZ = true;
            f5q.LIZJ = true;
            f5q.LIZLLL = true;
            f5q.LJ = false;
            f5q.LJIIIZ = new FJX() { // from class: X.1Hc
                public long LIZ = System.currentTimeMillis();

                @Override // X.FJX
                public final void LIZ(boolean z) {
                    C47261Igj.LJIILJJIL("BXBundleTools");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("is_silent", z);
                        jSONObject.put("status", "installing");
                        C38891fp.LJJII("bytebench_df_download_information", jSONObject);
                    } catch (JSONException unused) {
                        C47261Igj.LJIILJJIL("BXBundleTools");
                    }
                }

                @Override // X.FJX
                public final void LIZJ(int i) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onPermissionDialogResult: ");
                    LIZ2.append(i);
                    X1D.LIZIZ(LIZ2);
                    C47261Igj.LJIILJJIL("BXBundleTools");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("is_silent", false);
                        jSONObject.put("status", "Permission Dialog Result");
                        if (i != -1) {
                            jSONObject.put("permission_dialog_result", "not OK");
                        } else {
                            jSONObject.put("permission_dialog_result", "OK");
                        }
                        C38891fp.LJJII("bytebench_df_download_information", jSONObject);
                    } catch (JSONException unused) {
                        C47261Igj.LJIILJJIL("BXBundleTools");
                    }
                }

                @Override // X.FJX
                public final void LIZLLL(boolean z) {
                    C47261Igj.LJIILJJIL("BXBundleTools");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("is_silent", z);
                        jSONObject.put("status", "install end");
                        jSONObject.put("cost_time", System.currentTimeMillis() - this.LIZ);
                        C38891fp.LJJII("bytebench_df_download_information", jSONObject);
                    } catch (JSONException unused) {
                        C47261Igj.LJIILJJIL("BXBundleTools");
                    }
                }

                @Override // X.FJX
                public final void LJ(boolean z) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onInstallStart");
                    LIZ2.append(z);
                    X1D.LIZIZ(LIZ2);
                    C47261Igj.LJIILJJIL("BXBundleTools");
                    JSONObject jSONObject = new JSONObject();
                    this.LIZ = System.currentTimeMillis();
                    try {
                        jSONObject.put("is_silent", z);
                        jSONObject.put("status", "install start");
                        C38891fp.LJJII("bytebench_df_download_information", jSONObject);
                    } catch (JSONException unused) {
                        C47261Igj.LJIILJJIL("BXBundleTools");
                    }
                }

                @Override // X.FJX
                public final void LIZIZ(long j, long j2, boolean z) {
                    C47261Igj.LJIILJJIL("BXBundleTools");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("is_silent", z);
                        jSONObject.put("status", "downloading");
                        jSONObject.put("bytes_downloaded", j);
                        jSONObject.put("totalBytesToDownload", j2);
                        C38891fp.LJJII("bytebench_df_download_information", jSONObject);
                    } catch (JSONException unused) {
                        C47261Igj.LJIILJJIL("BXBundleTools");
                    }
                }
            };
            f5q.LJII = arrayList;
            c37132Ehk.LJ = new F5R(f5q);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("df_bytebenchstart load at: ");
            LIZ2.append(System.currentTimeMillis());
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJIILJJIL("BXBundleTools");
            LIZLLL2.LIZ(new C37131Ehj(c37132Ehk));
        }
    }

    public static BXCollectionAPI LIZJ() {
        if (LJFF) {
            try {
                return BXCollectionImpl.LIZJ();
            } catch (Throwable unused) {
                return LJ;
            }
        }
        if (C06320Mq.LIZ()) {
            boolean z = C06320Mq.LIZ;
            String str = LIZ;
            if (!z) {
                Context context = C09590Zf.LJIILLIIL.LIZ;
                if (context == null) {
                    C47261Igj.LJJJJZ(str);
                    IBTCHConfiguration createIBTCHConfigurationbyMonsterPlugin = BTCHConfigurationImpl.createIBTCHConfigurationbyMonsterPlugin(false);
                    if (createIBTCHConfigurationbyMonsterPlugin != null) {
                        context = createIBTCHConfigurationbyMonsterPlugin.getByteBenchConfig().LIZ;
                    }
                }
                if (!C06320Mq.LIZIZ(context)) {
                    return LJ;
                }
            }
            try {
                BXCollectionAPI LIZJ2 = BXCollectionImpl.LIZJ();
                if (LIZJ2 instanceof ByteBenchCollectionDowngrade) {
                    try {
                        final Class<?> cls = Class.forName("com.benchmark.collection_api.BXCollectionImpl");
                        LJFF = true;
                        ServiceManager.get().bind(BXCollectionAPI.class, "com.benchmark.collection_api", new ServiceProvider<BXCollectionAPI>() { // from class: X.1EN
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v0 */
                            /* JADX WARN: Type inference failed for: r1v1 */
                            /* JADX WARN: Type inference failed for: r1v10 */
                            /* JADX WARN: Type inference failed for: r1v11 */
                            /* JADX WARN: Type inference failed for: r1v2 */
                            /* JADX WARN: Type inference failed for: r1v3 */
                            /* JADX WARN: Type inference failed for: r1v4, types: [com.benchmark.collection_api.BXCollectionAPI] */
                            /* JADX WARN: Type inference failed for: r1v5 */
                            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r1v7 */
                            /* JADX WARN: Type inference failed for: r1v8 */
                            /* JADX WARN: Type inference failed for: r1v9 */
                            @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
                            public final BXCollectionAPI get() {
                                ?? r1 = 0;
                                r1 = 0;
                                r1 = 0;
                                try {
                                    try {
                                        try {
                                            r1 = cls.newInstance();
                                            r1 = r1;
                                        } catch (InstantiationException e) {
                                            C16880lQ.LLLLIIL(e);
                                            r1 = r1;
                                        }
                                    } catch (IllegalAccessException e2) {
                                        C16880lQ.LLLLIIL(e2);
                                        r1 = r1;
                                    }
                                } catch (Throwable unused2) {
                                }
                                return r1;
                            }
                        });
                        try {
                            return BXCollectionImpl.LIZJ();
                        } catch (Throwable unused2) {
                            return LJ;
                        }
                    } catch (ClassNotFoundException unused3) {
                        return LJ;
                    }
                }
                LJFF = true;
                C47261Igj.LJIILJJIL(str);
                return LIZJ2;
            } catch (Throwable unused4) {
                return LJ;
            }
        }
        return LJ;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final void LIZ() {
        C47261Igj.LJIILJJIL(LIZ);
        BXCollectionAPI LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            LIZJ2.LIZ();
        }
        LIZIZ.set(true);
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int stop() {
        C47261Igj.LJIILJJIL(LIZ);
        BXCollectionAPI LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            return LIZJ2.stop();
        }
        return -200;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int LIZIZ(C275316f c275316f) {
        int i;
        C47261Igj.LJIILJJIL(LIZ);
        if (c275316f != null) {
            LIZLLL = c275316f;
        }
        BXCollectionAPI LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            i = LIZJ2.LIZIZ(c275316f);
        } else {
            i = -200;
        }
        LIZJ.set(true);
        return i;
    }

    @Override // com.benchmark.collection_api.BXCollectionAPI
    public final int start(int i) {
        C47261Igj.LJIILJJIL(LIZ);
        BXCollectionAPI LIZJ2 = LIZJ();
        if (LIZJ2 != null) {
            return LIZJ2.start(i);
        }
        return -200;
    }
}
