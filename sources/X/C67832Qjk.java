package X;

import com.google.android.gms.common.Feature;
import java.util.HashMap;

/* renamed from: X.Qjk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67832Qjk extends AbstractC67838Qjq<Boolean> {
    public final C67891Qkh<?> LIZJ;

    @Override // X.AbstractC67837Qjp
    public final /* bridge */ /* synthetic */ void LIZLLL(C67834Qjm c67834Qjm, boolean z) {
    }

    @Override // X.AbstractC67893Qkj
    public final boolean LJFF(C67825Qjd<?> c67825Qjd) {
        C67902Qks c67902Qks = (C67902Qks) ((HashMap) c67825Qjd.LJLJJLL).get(this.LIZJ);
        if (c67902Qks != null && c67902Qks.LIZ.LIZJ) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC67893Qkj
    public final Feature[] LJI(C67825Qjd<?> c67825Qjd) {
        C67902Qks c67902Qks = (C67902Qks) ((HashMap) c67825Qjd.LJLJJLL).get(this.LIZJ);
        if (c67902Qks == null) {
            return null;
        }
        return c67902Qks.LIZ.LIZIZ;
    }

    @Override // X.AbstractC67838Qjq
    public final void LJII(C67825Qjd<?> c67825Qjd) {
        C67902Qks c67902Qks = (C67902Qks) ((HashMap) c67825Qjd.LJLJJLL).remove(this.LIZJ);
        if (c67902Qks != null) {
            AbstractC67912Ql2<Object, ?> abstractC67912Ql2 = c67902Qks.LIZIZ;
            ((C67928QlI) abstractC67912Ql2).LIZ.LIZIZ.LIZ(c67825Qjd.LJLILLLLZI, this.LIZIZ);
            c67902Qks.LIZ.LIZ.LIZIZ = null;
            return;
        }
        this.LIZIZ.LIZLLL(Boolean.FALSE);
    }

    public C67832Qjk(C67891Qkh<?> c67891Qkh, C67649Qgn<Boolean> c67649Qgn) {
        super(4, c67649Qgn);
        this.LIZJ = c67891Qkh;
    }
}
