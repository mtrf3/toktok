package X;

import com.google.android.gms.common.Feature;
import java.util.HashMap;

/* renamed from: X.Qjl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67833Qjl extends AbstractC67838Qjq<Void> {
    public final C67902Qks LIZJ;

    @Override // X.AbstractC67837Qjp
    public final /* bridge */ /* synthetic */ void LIZLLL(C67834Qjm c67834Qjm, boolean z) {
    }

    @Override // X.AbstractC67893Qkj
    public final boolean LJFF(C67825Qjd<?> c67825Qjd) {
        return this.LIZJ.LIZ.LIZJ;
    }

    @Override // X.AbstractC67893Qkj
    public final Feature[] LJI(C67825Qjd<?> c67825Qjd) {
        return this.LIZJ.LIZ.LIZIZ;
    }

    @Override // X.AbstractC67838Qjq
    public final void LJII(C67825Qjd<?> c67825Qjd) {
        AbstractC67889Qkf<Object, ?> abstractC67889Qkf = this.LIZJ.LIZ;
        ((C67922QlC) abstractC67889Qkf).LIZLLL.LIZ.LIZ(c67825Qjd.LJLILLLLZI, this.LIZIZ);
        C67891Qkh<?> c67891Qkh = this.LIZJ.LIZ.LIZ.LIZIZ;
        if (c67891Qkh != null) {
            ((HashMap) c67825Qjd.LJLJJLL).put(c67891Qkh, this.LIZJ);
        }
    }

    public C67833Qjl(C67902Qks c67902Qks, C67649Qgn<Void> c67649Qgn) {
        super(3, c67649Qgn);
        this.LIZJ = c67902Qks;
    }
}
