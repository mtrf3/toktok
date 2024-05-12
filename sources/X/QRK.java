package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.push.PushBody;

/* loaded from: classes12.dex */
public final class QRK {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public String LJ;
    public PushBody LJFF;

    public final ContentValues LIZ() {
        PushBody pushBody;
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", Long.valueOf(this.LIZIZ));
        contentValues.put("arrive_time", Long.valueOf(this.LIZJ));
        contentValues.put("client_intelligence_expire_time", (Long) 0L);
        contentValues.put("sender", Integer.valueOf(this.LIZ));
        contentValues.put("handle_by_sdk", (Integer) 0);
        contentValues.put("has_been_shown", Integer.valueOf(this.LIZLLL ? 1 : 0));
        if (TextUtils.isEmpty(this.LJ) && (pushBody = this.LJFF) != null) {
            this.LJ = pushBody.LIZ();
        }
        contentValues.put("push_body", this.LJ);
        return contentValues;
    }

    public QRK(int i, long j, long j2, boolean z, String str) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = z;
        this.LJ = str;
    }
}
