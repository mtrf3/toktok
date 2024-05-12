package X;

import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QPC extends RunnableC39007FSp {
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ long LJLJLLL;
    public final /* synthetic */ JSONObject LJLL;
    public final /* synthetic */ Context LJLLI;

    public final void LIZJ() {
        try {
            QPF qpf = new QPF();
            qpf.LIZ = this.LJLJJL;
            qpf.LIZIZ = this.LJLJJLL;
            qpf.LIZJ = this.LJLJL;
            qpf.LIZLLL = this.LJLJLJ;
            qpf.LJ = this.LJLJLLL;
            JSONObject jSONObject = this.LJLL;
            if (jSONObject != null) {
                qpf.LJFF = jSONObject.toString();
            }
            if (QSB.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("category = ");
                LIZ.append(qpf.LIZ);
                LIZ.append(" tag = ");
                LIZ.append(qpf.LIZIZ);
                LIZ.append(" label = ");
                LIZ.append(qpf.LIZJ);
                LIZ.append(" value = ");
                LIZ.append(qpf.LIZLLL);
                LIZ.append(" ext_value = ");
                LIZ.append(this.LJLJLLL);
                LIZ.append(" ext_json = ");
                LIZ.append(qpf.LJFF);
                X1D.LIZIZ(LIZ);
            }
            QPB LIZIZ = QPB.LIZIZ(this.LJLLI);
            if (LIZIZ != null) {
                LIZIZ.LIZJ(qpf);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QPC(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        super((Object) null);
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = j;
        this.LJLJLLL = j2;
        this.LJLL = jSONObject;
        this.LJLLI = context;
    }
}
