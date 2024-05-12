package X;

import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.dataChannel.BlockVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.BWd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28907BWd {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28907BWd)) {
            return false;
        }
        C28907BWd c28907BWd = (C28907BWd) obj;
        return this.LIZ == c28907BWd.LIZ && this.LIZIZ == c28907BWd.LIZIZ && this.LIZJ == c28907BWd.LIZJ && o.LJ(this.LIZLLL, c28907BWd.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZJ = (JBR.LIZJ(this.LIZIZ, C16880lQ.LLJIJIL(this.LIZ) * 31, 31) + this.LIZJ) * 31;
        String str = this.LIZLLL;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreviewBlockInfo(endTime=");
        LIZ.append(this.LIZ);
        LIZ.append(", logId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", punishSource=");
        LIZ.append(this.LIZJ);
        LIZ.append(", detailUrl=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C28907BWd(long j) {
        this(2, j, 0L, null);
    }

    public final void LIZ(DataChannel dataChannel) {
        dataChannel.rv0(PreviewBlockInfoChannel.class, this);
        C0NA.LIZIZ(C65352Pkq.LIZ(BlockVisibilityChannel.class));
    }

    public C28907BWd(int i, long j, long j2, String str) {
        String LJJJJZ;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = str;
        if (j == -1) {
            LJJJJZ = C15380j0.LJIILJJIL(R.string.moo);
        } else {
            Date date = new Date(j * 1000);
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.moq);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_li…_violation_ban_temporary)");
            Locale locale = Locale.ENGLISH;
            String format = new SimpleDateFormat("HH:mm", locale).format(date);
            o.LJIIIIZZ(format, "SimpleDateFormat(\"HH:mm\"…ale.ENGLISH).format(date)");
            String LJJJJZ2 = ujb.o.LJJJJZ(LJIILJJIL, "{0}", format, false);
            String format2 = new SimpleDateFormat("dd-MM-yyyy", locale).format(date);
            o.LJIIIIZZ(format2, "SimpleDateFormat(\"dd-MM-…ale.ENGLISH).format(date)");
            LJJJJZ = ujb.o.LJJJJZ(LJJJJZ2, "{1}", format2, false);
        }
        this.LJ = LJJJJZ == null ? "" : LJJJJZ;
    }
}
