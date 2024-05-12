package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;

/* renamed from: X.Orm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC63234Orm extends AbstractC63515OwJ {
    public C63622Oy2 LIZJ;

    public abstract void LJIILIIL(int i, ResponseBody responseBody, EP1 ep1);

    public AbstractC63234Orm(int i) {
        super(i);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        if (c63622Oy2.LJIIJ() && c63622Oy2.LJLJL != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (LJIIIZ(c63622Oy2)) {
            Response response = c63622Oy2.LJLJL;
            if (response.body != null) {
                this.LIZJ = c63622Oy2;
                LJIILIIL(response.inbox_type.intValue(), response.body, c63622Oy2.LJLJLJ);
            }
        }
    }
}
