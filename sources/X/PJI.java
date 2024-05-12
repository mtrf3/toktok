package X;

import com.bytedance.crash.entity.Header;

/* loaded from: classes12.dex */
public class PJI extends PJH {
    public Header LIZJ;

    @Override // X.PJH
    public final Object LIZ(String str) {
        if (this.LIZJ == null) {
            this.LIZJ = Header.LIZLLL();
        }
        return this.LIZJ.LIZ.opt(str);
    }
}
