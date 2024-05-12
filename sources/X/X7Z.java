package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.tencent.wcdb.database.SQLiteDatabase;

/* loaded from: classes16.dex */
public final class X7Z implements InterfaceC78848Ux2 {
    public SQLiteDatabase LIZ = null;

    @Override // X.InterfaceC78848Ux2
    public final void LJII() {
        this.LIZ.LJI(true);
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJIL() {
        this.LIZ.LJI(false);
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJJIJL() {
        this.LIZ.LJJIJL();
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJJIJLIJ() {
        this.LIZ.LJJIJLIJ();
    }

    @Override // X.InterfaceC78848Ux2
    public final boolean LJJJ() {
        boolean z;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        sQLiteDatabase.LIZ();
        try {
            if (sQLiteDatabase.LJJ().LJ == null) {
                z = false;
            } else {
                z = true;
            }
            return z;
        } finally {
            sQLiteDatabase.LIZLLL();
        }
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJI() {
        return C84310X7a.LIZJ(this.LIZ, "conversation_list", null);
    }

    @Override // X.InterfaceC78848Ux2
    public final InterfaceC63146OqM LJIILLIIL(String str) {
        return new V8Q(this.LIZ.LJIIJ(str));
    }

    @Override // X.InterfaceC78848Ux2
    public final void LJJIJIIJI(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("imsdkdb");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        this.LIZ.LJIILL(str);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJIZL(String str) {
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        if (sQLiteDatabase == null) {
            return -1L;
        }
        return C84310X7a.LIZJ(sQLiteDatabase, "msg", str);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJJL(ContentValues contentValues) {
        return this.LIZ.LJJIIJZLJL("conversation_list", contentValues, 5);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJI(String str, ContentValues contentValues) {
        return this.LIZ.LJJIIJZLJL(str, contentValues, 0);
    }

    @Override // X.InterfaceC78848Ux2
    public final long LJJJJ(String str, ContentValues contentValues) {
        return this.LIZ.LJJIIJZLJL(str, contentValues, 5);
    }

    @Override // X.InterfaceC78848Ux2
    public final InterfaceC63132Oq8 LJJJJJ(String str, String[] strArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("imsdkdb");
        LIZ.append(str);
        C63322OtC.LIZJ(X1D.LIZIZ(LIZ));
        return new C1UE(this.LIZ.LJJJI(str, strArr));
    }

    @Override // X.InterfaceC78848Ux2
    public final int LJJJJL(String str, String str2, String[] strArr) {
        String str3;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        sQLiteDatabase.LIZ();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DELETE FROM ");
            LIZ.append(str);
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" WHERE ");
                LIZ2.append(str2);
                str3 = X1D.LIZIZ(LIZ2);
            } else {
                str3 = "";
            }
            LIZ.append(str3);
            C84313X7d c84313X7d = new C84313X7d(sQLiteDatabase, X1D.LIZIZ(LIZ), strArr);
            try {
                return c84313X7d.LJIIJ();
            } finally {
                c84313X7d.LIZLLL();
            }
        } finally {
            sQLiteDatabase.LIZLLL();
        }
    }

    @Override // X.InterfaceC78848Ux2
    public final int LJJJIL(String str, ContentValues contentValues, String str2, String[] strArr) {
        String str3;
        SQLiteDatabase sQLiteDatabase = this.LIZ;
        sQLiteDatabase.getClass();
        if (contentValues.size() != 0) {
            sQLiteDatabase.LIZ();
            try {
                StringBuilder sb = new StringBuilder(LiveTryModeCountDownThresholdSetting.DEFAULT);
                sb.append("UPDATE ");
                int i = 0;
                sb.append(SQLiteDatabase.LJLJLLL[0]);
                sb.append(str);
                sb.append(" SET ");
                int size = contentValues.size();
                int length = strArr.length + size;
                Object[] objArr = new Object[length];
                for (String str4 : contentValues.keySet()) {
                    if (i > 0) {
                        str3 = ",";
                    } else {
                        str3 = "";
                    }
                    sb.append(str3);
                    sb.append(str4);
                    objArr[i] = contentValues.get(str4);
                    sb.append("=?");
                    i++;
                }
                for (int i2 = size; i2 < length; i2++) {
                    objArr[i2] = strArr[i2 - size];
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(" WHERE ");
                    sb.append(str2);
                }
                C84313X7d c84313X7d = new C84313X7d(sQLiteDatabase, sb.toString(), objArr);
                try {
                    return c84313X7d.LJIIJ();
                } finally {
                    c84313X7d.LIZLLL();
                }
            } finally {
                sQLiteDatabase.LIZLLL();
            }
        }
        throw new IllegalArgumentException("Empty values");
    }
}
