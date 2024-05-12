package X;

import com.tencent.wcdb.database.SQLiteConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/* renamed from: X.X7s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84328X7s {
    public long LIZ;
    public long LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public ArrayList<Object> LJ;
    public boolean LJFF;
    public Exception LJI;
    public int LJII;
    public int LJIIIIZZ;

    static {
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    }

    public final void LIZ(StringBuilder sb) {
        String str;
        sb.append(this.LIZJ);
        if (this.LJFF) {
            sb.append(" took ");
            C48339Iy7.LIZLLL(this.LIZIZ, this.LIZ, sb, "ms");
        } else {
            sb.append(" started ");
            C48339Iy7.LIZLLL(System.currentTimeMillis(), this.LIZ, sb, "ms ago");
        }
        sb.append(" - ");
        if (!this.LJFF) {
            str = "running";
        } else if (this.LJI != null) {
            str = "failed";
        } else {
            str = "succeeded";
        }
        sb.append(str);
        if (this.LIZLLL != null) {
            sb.append(", sql=\"");
            sb.append(SQLiteConnection.LJIIZILJ.matcher(this.LIZLLL).replaceAll(" "));
            sb.append("\"");
        }
        if (this.LJIIIIZZ > 0) {
            sb.append(", tid=");
            sb.append(this.LJIIIIZZ);
        }
        Exception exc = this.LJI;
        if (exc != null && exc.getMessage() != null) {
            sb.append(", exception=\"");
            sb.append(this.LJI.getMessage());
            sb.append("\"");
        }
    }
}
