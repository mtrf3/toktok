package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.Yop, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88531Yop<T> implements Observer {
    public final /* synthetic */ InterfaceC223218pR<Aweme> LJLIL;

    public C88531Yop(MGU mgu) {
        this.LJLIL = mgu;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        AbstractC88533Yor abstractC88533Yor = (AbstractC88533Yor) obj;
        if (abstractC88533Yor instanceof C88540Yoy) {
            this.LJLIL.LJII();
            return;
        }
        if (abstractC88533Yor instanceof C88534Yos) {
            this.LJLIL.cb0(((C88534Yos) abstractC88533Yor).LIZ);
            return;
        }
        if (abstractC88533Yor instanceof C88537Yov) {
            this.LJLIL.Ne();
            return;
        }
        if (abstractC88533Yor instanceof C88530Yoo) {
            C88530Yoo c88530Yoo = (C88530Yoo) abstractC88533Yor;
            this.LJLIL.J5(c88530Yoo.LIZ, c88530Yoo.LIZIZ);
            return;
        }
        if (abstractC88533Yor instanceof C88539Yox) {
            this.LJLIL.showLoadMoreLoading();
            return;
        }
        if (abstractC88533Yor instanceof C88536You) {
            this.LJLIL.nc(((C88536You) abstractC88533Yor).LIZ);
            return;
        }
        if (abstractC88533Yor instanceof C88529Yon) {
            C88529Yon c88529Yon = (C88529Yon) abstractC88533Yor;
            this.LJLIL.j0(c88529Yon.LIZ, c88529Yon.LIZIZ);
        } else {
            if (abstractC88533Yor instanceof C88538Yow) {
                this.LJLIL.Iw();
                return;
            }
            if (abstractC88533Yor instanceof C88535Yot) {
                this.LJLIL.Qw(((C88535Yot) abstractC88533Yor).LIZ);
            } else {
                if (!(abstractC88533Yor instanceof C88528Yom)) {
                    return;
                }
                C88528Yom c88528Yom = (C88528Yom) abstractC88533Yor;
                this.LJLIL.jh(c88528Yom.LIZ, c88528Yom.LIZIZ);
            }
        }
    }
}
