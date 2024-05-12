package com.ss.android.ugc.aweme.storage;

import X.C10K;
import X.C16880lQ;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class StorageIntercepterManager {
    public static final String LIZ = File.separator;

    /* loaded from: classes7.dex */
    public static class StorageIntercepterConfig {

        @InterfaceC65349Pkn("downgrade")
        public List<StorageIntercepterItem> downgradeList;

        @InterfaceC65349Pkn("enable_exception_path")
        public boolean enableExceptionPath;

        @InterfaceC65349Pkn("enabled")
        public boolean enabled;

        @InterfaceC65349Pkn("watch")
        public List<StorageIntercepterItem> watchList;

        public final String toString() {
            StringBuilder sb = new StringBuilder("enabled=");
            sb.append(this.enabled);
            List<StorageIntercepterItem> list = this.watchList;
            if (list != null && list.size() > 0) {
                Iterator<StorageIntercepterItem> it = this.watchList.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().toString());
                }
            }
            List<StorageIntercepterItem> list2 = this.downgradeList;
            if (list2 != null && list2.size() > 0) {
                Iterator<StorageIntercepterItem> it2 = this.downgradeList.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().toString());
                }
            }
            return sb.toString();
        }

        public StorageIntercepterConfig() {
            this.enabled = false;
            this.enableExceptionPath = false;
            this.watchList = new ArrayList();
            this.downgradeList = null;
        }

        public StorageIntercepterConfig(int i) {
            this.enabled = false;
            this.enableExceptionPath = false;
            ArrayList arrayList = new ArrayList();
            this.watchList = arrayList;
            this.downgradeList = null;
            arrayList.add(new StorageIntercepterItem());
        }
    }

    /* loaded from: classes7.dex */
    public static class StorageIntercepterItem {

        @InterfaceC65349Pkn("path")
        public String path = "/(sdcard|storage)/.+.(jpg|jpeg|png|webp|gif|bmp|mp4|flv|mpg|mpeg|mov|webm|avi|wmv)";

        @InterfaceC65349Pkn("mounted")
        public int mounted = 2;

        @InterfaceC65349Pkn("operate")
        public int operate = 4;

        @InterfaceC65349Pkn("rule")
        public int rule = 2;

        @InterfaceC65349Pkn("pass_reg_exp")
        public String passRegExp = "/.*(/aweme|/tt_video|com.ss.android.ugc.aweme|com.bytedance.realx).*";

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[path=");
            LIZ.append(this.path);
            LIZ.append(" mounted=");
            LIZ.append(this.mounted);
            LIZ.append(" operate=");
            LIZ.append(this.operate);
            LIZ.append(" rule=");
            LIZ.append(this.rule);
            LIZ.append(" passRegExp=");
            return JBR.LJFF(LIZ, this.passRegExp, "]", LIZ);
        }
    }

    public static boolean LJ(StorageIntercepterConfig storageIntercepterConfig) {
        if (storageIntercepterConfig == null) {
            return false;
        }
        return storageIntercepterConfig.enableExceptionPath;
    }

    public static boolean LIZ(String str, List list) {
        Context LIZIZ = EF7.LIZIZ();
        if (str != null && C16880lQ.LLIIIL(LIZIZ) != null && C16880lQ.LLIIIL(LIZIZ).getParentFile() != null && list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                StorageIntercepterItem storageIntercepterItem = (StorageIntercepterItem) it.next();
                if (storageIntercepterItem != null && (storageIntercepterItem.operate & 4) != 0 && storageIntercepterItem.path != null) {
                    if (storageIntercepterItem.rule != 2) {
                        int i = storageIntercepterItem.mounted;
                        if (i == 0) {
                            if (C16880lQ.LLIIIL(LIZIZ) == null || C16880lQ.LLIIIL(LIZIZ).getParent() == null) {
                                return false;
                            }
                            if (!storageIntercepterItem.path.startsWith(C16880lQ.LLIIIL(LIZIZ).getParent())) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append(C16880lQ.LLIIIL(LIZIZ).getParent());
                                LIZ2.append(storageIntercepterItem.path);
                                storageIntercepterItem.path = X1D.LIZIZ(LIZ2);
                            }
                        } else if (i == 1) {
                            if (C16880lQ.LLIIIZ(LIZIZ) == null || C16880lQ.LLIIIZ(LIZIZ).getParent() == null) {
                                return false;
                            }
                            if (!storageIntercepterItem.path.startsWith(C16880lQ.LLIIIZ(LIZIZ).getParent())) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(C16880lQ.LLIIIZ(LIZIZ).getParent());
                                LIZ3.append(storageIntercepterItem.path);
                                storageIntercepterItem.path = X1D.LIZIZ(LIZ3);
                            }
                        }
                    }
                    if (storageIntercepterItem.rule == 0) {
                        if (LIZ.equals(storageIntercepterItem.path)) {
                            if (!str.startsWith("/system/") && !str.startsWith("/sys/") && !str.startsWith("/data/") && !str.startsWith("/vendor/") && !str.startsWith("/product/")) {
                                if (LIZIZ.getPackageName() != null) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    String str2 = File.separator;
                                    LIZ4.append(str2);
                                    LIZ4.append(LIZIZ.getPackageName());
                                    LIZ4.append(str2);
                                    if (str.contains(X1D.LIZIZ(LIZ4))) {
                                    }
                                }
                            }
                            return false;
                        }
                        File file = new File(str);
                        File file2 = new File(storageIntercepterItem.path);
                        try {
                            String canonicalPath = file.getCanonicalPath();
                            if (canonicalPath != null && canonicalPath.contains(file2.getCanonicalPath())) {
                                return LIZIZ(storageIntercepterItem, str);
                            }
                        } catch (Exception e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    if (storageIntercepterItem.rule == 1 && str.equals(storageIntercepterItem.path)) {
                        return LIZIZ(storageIntercepterItem, str);
                    }
                    if (storageIntercepterItem.rule == 2 && PatternProtector.compile(storageIntercepterItem.path).matcher(str).matches()) {
                        return LIZIZ(storageIntercepterItem, str);
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZIZ(StorageIntercepterItem storageIntercepterItem, String str) {
        if (str != null) {
            if (storageIntercepterItem.passRegExp == null) {
                return true;
            }
            return !PatternProtector.compile(r1).matcher(str).matches();
        }
        return false;
    }

    public static boolean LIZJ(String str, StorageIntercepterConfig storageIntercepterConfig) {
        if (storageIntercepterConfig == null || !storageIntercepterConfig.enabled) {
            return false;
        }
        return LIZ(str, storageIntercepterConfig.downgradeList);
    }

    public static boolean LIZLLL(String str, StorageIntercepterConfig storageIntercepterConfig) {
        if (storageIntercepterConfig == null || !storageIntercepterConfig.enabled) {
            return false;
        }
        return LIZ(str, storageIntercepterConfig.watchList);
    }

    public static void LJFF(final File file, final Throwable th, final String str, final boolean z) {
        if (file == null || file.getAbsolutePath() == null) {
            return;
        }
        C10K.LIZJ(new Callable() { // from class: X.EaV
            public final /* synthetic */ String LJLILLLLZI = null;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String sb;
                String absolutePath;
                int lastIndexOf;
                String substring;
                String str2;
                String str3;
                Throwable th2 = th;
                String str4 = this.LJLILLLLZI;
                File file2 = file;
                String str5 = str;
                boolean z2 = z;
                if (th2 != null) {
                    StringBuilder sb2 = new StringBuilder();
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    if (stackTrace != null && stackTrace.length > 0) {
                        for (StackTraceElement stackTraceElement : stackTrace) {
                            if (stackTraceElement != null && stackTraceElement.getClassName() != null && stackTraceElement.getMethodName() != null) {
                                sb2.append(stackTraceElement.getClassName());
                                sb2.append('.');
                                sb2.append(stackTraceElement.getMethodName());
                                sb2.append(':');
                                sb2.append(stackTraceElement.getLineNumber());
                                sb2.append('#');
                            }
                        }
                    }
                    if (sb2.length() > 0 && (sb = sb2.toString()) != null) {
                        if (str4 != null) {
                            int lastIndexOf2 = str4.lastIndexOf(File.separator);
                            if (lastIndexOf2 > 0 && lastIndexOf2 < str4.length()) {
                                str3 = str4.substring(lastIndexOf2 + 1);
                            } else {
                                str3 = str4;
                            }
                            sb = C00F.LIZIZ(str3, '#', sb);
                        }
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("delete: ");
                        if (file2 == null) {
                            absolutePath = "null";
                        } else {
                            absolutePath = file2.getAbsolutePath();
                        }
                        YE1.LIZLLL(LIZ2, absolutePath, " ", str5, "\n");
                        LIZ2.append(sb);
                        X1D.LIZIZ(LIZ2);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("stack", sb);
                        String name = file2.getName();
                        if (name == null || (lastIndexOf = name.lastIndexOf(46)) <= 0) {
                            substring = null;
                        } else {
                            substring = name.substring(lastIndexOf);
                        }
                        if (!TextUtils.isEmpty(substring)) {
                            jSONObject.put("name", substring);
                        }
                        if (z2) {
                            jSONObject.put("data_uri", file2.getAbsolutePath());
                        }
                        if (str4 == null) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("call_type", str2);
                        C09900aA.LJ(str5, jSONObject);
                    }
                }
                return null;
            }
        });
    }
}
