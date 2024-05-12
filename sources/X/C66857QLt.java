package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.bytedance.common.utility.Logger;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;

/* renamed from: X.QLt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C66857QLt {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final SharedPreferences LIZJ;

    public static Cursor LIZ(ContentResolver contentResolver, android.net.Uri uri) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(240004, "android/content/ContentResolver", "query", contentResolver, new Object[]{uri, null, null, null, null}, "android.database.Cursor", new C65300Pk0(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "5987805597041939750"));
        return LIZJ.LIZ ? (Cursor) LIZJ.LIZIZ : contentResolver.query(uri, null, null, null, null);
    }

    public final String LIZIZ(String str) {
        String str2;
        try {
            if (this.LIZIZ) {
                String string = this.LIZJ.getString(str, "");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mSharedPreferences main getString get key = ");
                LIZ.append(str);
                LIZ.append(" value = ");
                LIZ.append(C66953QPl.LIZIZ(string));
                LIZ.append(" ");
                LIZ.append(android.util.Log.getStackTraceString(new Exception()));
                FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ));
                return string;
            }
            Cursor LIZ2 = LIZ(this.LIZ.getContentResolver(), AuthTokenMultiProcessSharedProvider.LIZIZ(this.LIZ, str, "string"));
            if (LIZ2 != null) {
                try {
                    if (!LIZ2.moveToFirst()) {
                        str2 = "";
                    } else {
                        str2 = LIZ2.getString(0);
                    }
                } catch (Throwable th) {
                    try {
                        C38901fq.LJI(th);
                        try {
                            LIZ2.close();
                        } catch (Exception e) {
                            e = e;
                            str2 = "";
                            C38901fq.LJI(e);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(" MultiProcessShared getString get key = ");
                            LIZ3.append(str);
                            LIZ3.append(" value = ");
                            LIZ3.append(C66953QPl.LIZIZ(str2));
                            LIZ3.append(" ");
                            LIZ3.append(android.util.Log.getStackTraceString(new Exception()));
                            FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ3));
                            return str2;
                        }
                    } finally {
                    }
                }
                try {
                    LIZ2.close();
                } catch (Exception e2) {
                    e = e2;
                    C38901fq.LJI(e);
                    StringBuilder LIZ32 = X1D.LIZ();
                    LIZ32.append(" MultiProcessShared getString get key = ");
                    LIZ32.append(str);
                    LIZ32.append(" value = ");
                    LIZ32.append(C66953QPl.LIZIZ(str2));
                    LIZ32.append(" ");
                    LIZ32.append(android.util.Log.getStackTraceString(new Exception()));
                    FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ32));
                    return str2;
                }
                StringBuilder LIZ322 = X1D.LIZ();
                LIZ322.append(" MultiProcessShared getString get key = ");
                LIZ322.append(str);
                LIZ322.append(" value = ");
                LIZ322.append(C66953QPl.LIZIZ(str2));
                LIZ322.append(" ");
                LIZ322.append(android.util.Log.getStackTraceString(new Exception()));
                FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ322));
                return str2;
            }
            str2 = "";
            StringBuilder LIZ3222 = X1D.LIZ();
            LIZ3222.append(" MultiProcessShared getString get key = ");
            LIZ3222.append(str);
            LIZ3222.append(" value = ");
            LIZ3222.append(C66953QPl.LIZIZ(str2));
            LIZ3222.append(" ");
            LIZ3222.append(android.util.Log.getStackTraceString(new Exception()));
            FXA.LIZ("AuthTokenMultiProcessShared", X1D.LIZIZ(LIZ3222));
            return str2;
        } catch (Throwable th2) {
            C38901fq.LJI(th2);
            return "";
        }
    }

    public C66857QLt(Context context, String str, boolean z) {
        this.LIZIZ = z;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZ = LLLLL;
        AuthTokenMultiProcessSharedProvider.LJLJLLL = str;
        this.LIZJ = F9J.LIZIZ(C16880lQ.LLLLL(LLLLL), 4, AuthTokenMultiProcessSharedProvider.LJLJLLL);
        Logger.debug();
    }
}
