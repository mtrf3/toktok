package com.vega.nletodraft.provider;

import X.C16880lQ;
import X.C38485F8n;
import X.OJT;
import X.PVC;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.Gson;
import com.vega.nletodraft.model.ZipInputExtra;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CCDraftProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        o.LJIIIZ(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        o.LJIIIZ(uri, "uri");
        throw new UnsupportedOperationException("update operation is not supported!!!");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        String LLLFFI;
        o.LJIIIZ(uri, "uri");
        Context context = getContext();
        if (context == null) {
            return 0;
        }
        OJT ojt = OJT.LIZ;
        File LIZ = ojt.LIZ(context, "cc_creative_info.json");
        if (LIZ.exists()) {
            LLLFFI = C38485F8n.LLLFFI(LIZ, PVC.LIZ);
            ZipInputExtra zipInputExtra = (ZipInputExtra) GsonProtectorUtils.fromJson(new Gson(), LLLFFI, ZipInputExtra.class);
            Uri LIZIZ = ojt.LIZIZ(getContext(), "cc_creative_info.json");
            if (LIZIZ == null) {
                return 0;
            }
            Context LLLLL = C16880lQ.LLLLL(context);
            if (LLLLL != null) {
                LLLLL.revokeUriPermission(LIZIZ, 3);
            }
            for (Map.Entry<String, String> entry : zipInputExtra.uriMap.entrySet()) {
                Context LLLLL2 = C16880lQ.LLLLL(context);
                if (LLLLL2 != null) {
                    LLLLL2.revokeUriPermission(UriProtector.parse(entry.getValue()), 3);
                }
            }
            return 0;
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        o.LJIIIZ(uri, "uri");
        throw new UnsupportedOperationException("update operation is not supported!!!");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String LLLFFI;
        Context LLLLL;
        Context LLLLL2;
        o.LJIIIZ(uri, "uri");
        Context context = getContext();
        if (context != null) {
            OJT ojt = OJT.LIZ;
            File LIZ = ojt.LIZ(context, "cc_creative_info.json");
            if (LIZ.exists()) {
                LLLFFI = C38485F8n.LLLFFI(LIZ, PVC.LIZ);
                ZipInputExtra zipInputExtra = (ZipInputExtra) GsonProtectorUtils.fromJson(new Gson(), LLLFFI, ZipInputExtra.class);
                Uri LIZIZ = ojt.LIZIZ(getContext(), "cc_creative_info.json");
                if (LIZIZ != null) {
                    Context context2 = getContext();
                    if (context2 != null && (LLLLL = C16880lQ.LLLLL(context2)) != null) {
                        LLLLL.grantUriPermission("com.lemon.lvoverseas", LIZIZ, 3);
                    }
                    Iterator<Map.Entry<String, String>> it = zipInputExtra.uriMap.entrySet().iterator();
                    while (it.hasNext()) {
                        Uri parse = UriProtector.parse(it.next().getValue());
                        o.LJIIIIZZ(parse, "parse(it.value)");
                        Context context3 = getContext();
                        if (context3 != null && (LLLLL2 = C16880lQ.LLLLL(context3)) != null) {
                            LLLLL2.grantUriPermission("com.lemon.lvoverseas", parse, 3);
                        }
                    }
                    MatrixCursor matrixCursor = new MatrixCursor(OJT.LIZIZ, 1);
                    matrixCursor.addRow(new Uri[]{LIZIZ});
                    return matrixCursor;
                }
            }
        }
        return null;
    }
}
