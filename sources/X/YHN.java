package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes16.dex */
public final class YHN implements InterfaceC87130YHm {
    public final YHH LIZ;
    public final String LIZIZ;
    public List<? extends YHP> LIZJ = C61878OQg.INSTANCE;
    public int LIZLLL;

    @Override // X.InterfaceC87130YHm
    public final YHH LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC87130YHm
    public final String getToken() {
        return this.LIZIZ;
    }

    public final void LIZIZ(YHM yhm) {
        this.LIZLLL++;
        int size = this.LIZJ.size();
        int i = this.LIZLLL;
        if (size > i) {
            YHP yhp = (YHP) ListProtector.get(this.LIZJ, i);
            yhp.getClass();
            if (this.LIZ.LJII) {
                if (yhm != null) {
                    yhm.LIZ(-1, "This task was canceled.", this);
                    return;
                }
                return;
            }
            yhp.LIZ(this, yhm);
        }
    }

    public YHN(YHH yhh, String str) {
        this.LIZ = yhh;
        this.LIZIZ = str;
    }
}
