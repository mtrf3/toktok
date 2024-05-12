package X;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class QTN extends QTP<QTS> {
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ Context LJ;

    @Override // X.QTP
    public final QTS LIZ() {
        QTO qto = QTR.LIZ;
        String str = this.LIZJ;
        String str2 = this.LIZLLL;
        qto.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && qto.LIZ()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("sec_uid", str2);
            if (qto.LIZIZ.update("login_info", contentValues, "uid = ?", new String[]{str}) != 0) {
                InterfaceC66963QPv LIZIZ = QTW.LIZIZ(this.LJ);
                String str3 = this.LIZJ;
                QTW qtw = (QTW) LIZIZ;
                if (qtw.LLILIL == null) {
                    qtw.LLILIL = new HashSet();
                }
                qtw.LLILIL.add(str3);
                F9J.LIZIZ(qtw.LLILLL, 0, "com.bytedance.sdk.account_setting").edit().putStringSet("has_update_sec_uids", qtw.LLILIL).apply();
                return new QTS(0, null);
            }
        }
        return new QTS(-1, "fail to update data");
    }

    @Override // X.QTP
    public final /* bridge */ /* synthetic */ void LIZIZ(QTS qts) {
    }

    public QTN(Context context, String str, String str2) {
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = context;
    }
}
