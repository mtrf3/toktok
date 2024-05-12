package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CWR {
    public final CharSequence LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final PunishEventInfo LIZLLL;
    public final Object LJ;

    public CWR(CharSequence content, boolean z, int i, PunishEventInfo punishEventInfo, C31977Cgn c31977Cgn, int i2) {
        punishEventInfo = (i2 & 8) != 0 ? null : punishEventInfo;
        c31977Cgn = (i2 & 16) != 0 ? null : c31977Cgn;
        o.LJIIIZ(content, "content");
        this.LIZ = content;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = punishEventInfo;
        this.LJ = c31977Cgn;
    }
}
