package androidx.core.content;

import X.AnonymousClass079;
import X.C04260Es;
import X.C07A;
import X.C0F0;
import X.C16880lQ;
import X.C28531Ab;
import X.C46320IFw;
import X.C66059PwF;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    public static final String[] COLUMNS = {"_display_name", "_size"};
    public static final File DEVICE_ROOT = new File("/");
    public static final HashMap<String, C07A> sCache = new HashMap<>();
    public Object mLazyProviderInfo;
    public int mResourceId;
    public C07A mStrategy;

    public static Uri getUriForFile(Context context, String str, File file) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, str, file);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo(this, context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete(this, uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType(this, uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile(this, uri, str);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query(this, uri, strArr, str, strArr2, str2);
    }

    public FileProvider() {
    }

    public FileProvider(int i) {
        this.mResourceId = i;
    }

    public static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(i0.LJFF("Invalid mode: ", str));
    }

    public String androidx_core_content_FileProvider__getType$___twin___(Uri uri) {
        File LIZIZ = this.mStrategy.LIZIZ(uri);
        int lastIndexOf = LIZIZ.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(LIZIZ.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public static String androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType(FileProvider fileProvider, Uri uri) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__getType$___twin___(uri);
    }

    public static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public void androidx_core_content_FileProvider__attachInfo$___twin___(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                HashMap<String, C07A> hashMap = sCache;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.mStrategy = getPathStrategy(context, str, this.mResourceId);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public ParcelFileDescriptor androidx_core_content_FileProvider__openFile$___twin___(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.mStrategy.LIZIZ(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static Uri androidx_core_content_FileProvider__getUriForFile$___twin___(Context context, String str, File file) {
        return getPathStrategy(context, str, 0).LIZ(file);
    }

    public static Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(Context context, String str, File file) {
        if (C46320IFw.LIZ) {
            String absolutePath = file.getAbsolutePath();
            ApmEvent apmEvent = new ApmEvent("helios_file_provider_monitor");
            int lastIndexOf = absolutePath.lastIndexOf(47);
            if (lastIndexOf > 0) {
                absolutePath = absolutePath.substring(0, lastIndexOf);
            }
            apmEvent.LIZ(absolutePath, str);
            apmEvent.LIZ(str, "authority");
            apmEvent.LIZ(absolutePath, "path");
            C66059PwF.LIZIZ(apmEvent);
        }
        return androidx_core_content_FileProvider__getUriForFile$___twin___(context, str, file);
    }

    public static void androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo(FileProvider fileProvider, Context context, ProviderInfo providerInfo) {
        if (fileProvider != null) {
            if (fileProvider.getContext() == null) {
                if (!providerInfo.exported) {
                    if (providerInfo.grantUriPermissions) {
                        fileProvider.mLazyProviderInfo = providerInfo;
                        providerInfo.grantUriPermissions = false;
                        try {
                            fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
                        } catch (SecurityException unused) {
                        }
                        providerInfo.grantUriPermissions = true;
                        return;
                    }
                    throw new SecurityException("Provider must grant uri permissions");
                }
                throw new SecurityException("Provider must not be exported");
            }
            fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
            return;
        }
        throw new NullPointerException("androidx_core_content_FileProvider__attachInfo$___twin___");
    }

    public static ParcelFileDescriptor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile(FileProvider fileProvider, Uri uri, String str) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__openFile$___twin___(uri, str);
    }

    public static C07A getPathStrategy(Context context, String str, int i) {
        C07A c07a;
        HashMap<String, C07A> hashMap = sCache;
        synchronized (hashMap) {
            c07a = hashMap.get(str);
            if (c07a == null) {
                try {
                    c07a = parsePathStrategy(context, str, i);
                    hashMap.put(str, c07a);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return c07a;
    }

    public static C07A parsePathStrategy(Context context, String str, int i) {
        File file;
        C28531Ab c28531Ab = new C28531Ab(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next != 1) {
                if (next == 2) {
                    String name = fileProviderPathsMetaData.getName();
                    String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                    String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                    if ("root-path".equals(name)) {
                        file = DEVICE_ROOT;
                    } else if ("files-path".equals(name)) {
                        file = C16880lQ.LLIIJLIL(context);
                    } else if ("cache-path".equals(name)) {
                        file = C16880lQ.LLIIIL(context);
                    } else if ("external-path".equals(name)) {
                        file = C16880lQ.LLLLLLLLLL();
                    } else if ("external-files-path".equals(name)) {
                        File[] LIZIZ = C04260Es.LIZIZ(context, null);
                        if (LIZIZ.length > 0) {
                            file = LIZIZ[0];
                        } else {
                            continue;
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] LIZ = C04260Es.LIZ(context);
                        if (LIZ.length > 0) {
                            file = LIZ[0];
                        } else {
                            continue;
                        }
                    } else if ("external-media-path".equals(name)) {
                        File[] LIZ2 = AnonymousClass079.LIZ(context);
                        if (LIZ2.length > 0) {
                            file = LIZ2[0];
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    if (file != null) {
                        File buildPath = buildPath(file, attributeValue2);
                        if (!TextUtils.isEmpty(attributeValue)) {
                            try {
                                c28531Ab.LIZIZ.put(attributeValue, buildPath.getCanonicalFile());
                            } catch (IOException e) {
                                throw new IllegalArgumentException(C0F0.LIZJ("Failed to resolve canonical path for ", buildPath), e);
                            }
                        } else {
                            throw new IllegalArgumentException("Name must not be empty");
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return c28531Ab;
            }
        }
    }

    public int androidx_core_content_FileProvider__delete$___twin___(Uri uri, String str, String[] strArr) {
        return C16880lQ.LLLZZIL(this.mStrategy.LIZIZ(uri)) ? 1 : 0;
    }

    public static int androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__delete$___twin___(uri, str, strArr);
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException(i0.LJFF("Couldn't find meta-data for provider with authority ", str));
    }

    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public Cursor androidx_core_content_FileProvider__query$___twin___(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File LIZIZ = this.mStrategy.LIZIZ(uri);
        String queryParameter = UriProtector.getQueryParameter(uri, "displayName");
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = LIZIZ.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(LIZIZ.length());
            }
            i2 = i;
        }
        String[] copyOf = copyOf(strArr3, i2);
        Object[] copyOf2 = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    public static Cursor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                Object obj = fileProvider.mLazyProviderInfo;
                if (obj != null && (obj instanceof ProviderInfo)) {
                    try {
                        fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__query$___twin___(uri, strArr, str, strArr2, str2);
    }
}
