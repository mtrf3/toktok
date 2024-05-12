package com.bytedance.bdinstall;

import X.C16880lQ;
import X.C36860EdM;
import X.C66795QJj;
import X.JBR;
import X.X1D;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes12.dex */
public class BDInstallProvider extends ContentProvider {
    public static String LJLIL;
    public static UriMatcher LJLILLLLZI;
    public static Uri LJLJI;
    public static Context LJLJJI;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (LJLILLLLZI == null) {
            try {
                LIZIZ(getContext());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        try {
            Context context = getContext();
            if (!(context instanceof Application) && context != null) {
                context = C16880lQ.LLLLL(context);
            }
            ((Application) context).registerActivityLifecycleCallbacks(C66795QJj.LIZ);
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public BDInstallProvider() {
        try {
            C36860EdM.LIZIZ = Boolean.TRUE;
        } catch (Throwable unused) {
        }
    }

    public static synchronized Uri LIZ(Context context) {
        Uri build;
        synchronized (BDInstallProvider.class) {
            if (LJLJI == null) {
                try {
                    LIZIZ(context);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
            build = LJLJI.buildUpon().appendPath("install_info_change").build();
        }
        return build;
    }

    public static void LIZIZ(Context context) {
        String str;
        if (TextUtils.isEmpty(LJLIL)) {
            String name = BDInstallProvider.class.getName();
            if (context == null) {
                str = null;
            } else {
                try {
                    if (!TextUtils.isEmpty(name)) {
                        for (ProviderInfo providerInfo : C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 8).providers) {
                            if (name.equals(providerInfo.name)) {
                                str = providerInfo.authority;
                                break;
                            }
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                str = context.getPackageName() + ".bdinstall.provider";
            }
            LJLIL = str;
        }
        if (!TextUtils.isEmpty(LJLIL)) {
            UriMatcher uriMatcher = new UriMatcher(-1);
            LJLILLLLZI = uriMatcher;
            uriMatcher.addURI(LJLIL, "*/*", 65536);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("content://");
            LIZ.append(LJLIL);
            LJLJI = UriProtector.parse(X1D.LIZIZ(LIZ));
            return;
        }
        throw new IllegalStateException("Must Set MultiProcessSharedProvider Authority");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("vnd.android.cursor.item/vnd.");
        return JBR.LJFF(LIZ, LJLIL, ".item", LIZ);
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        LJLJJI = context;
        if (providerInfo != null) {
            LJLIL = providerInfo.authority;
        }
        C36860EdM.LIZIZ = Boolean.TRUE;
        super.attachInfo(context, providerInfo);
    }
}
