package X;

import android.app.Activity;
import com.google.android.play.core.appupdate.a;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.appupdate.d;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Fwa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40600Fwa<ResultT> implements InterfaceC40563Fvz {
    public final /* synthetic */ Activity LJLIL;

    public C40600Fwa(Activity activity) {
        this.LJLIL = activity;
    }

    @Override // X.InterfaceC40563Fvz
    public final void onSuccess(Object obj) {
        b bVar;
        a aVar = (a) obj;
        try {
            if (aVar.LJIILIIL() == 2) {
                if (aVar.LJIIIZ(d.LIZJ()) != null) {
                    C40599FwZ.LIZJ("app_update_toast_show");
                    C38776FJs.LJIIL().LJI(EF7.LIZIZ(), "KEY_UPDATE_IN_PROGRESS", true);
                    b bVar2 = C40599FwZ.LIZIZ;
                    if (bVar2 != null) {
                        bVar2.LIZLLL(aVar, this.LJLIL);
                    }
                }
            } else if (aVar.LJIILIIL() == 3) {
                if (C38776FJs.LJIIL().LIZ(EF7.LIZIZ(), "KEY_DOWNLOADED_FOR_UPDATE", false)) {
                    if (this.LJLIL.isFinishing()) {
                        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ != null) {
                            C26231ARf LIZIZ = C40599FwZ.LIZIZ(LJIIIIZZ);
                            if (!LIZIZ.LJII()) {
                                LIZIZ.LIZLLL();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    C26231ARf LIZIZ2 = C40599FwZ.LIZIZ(this.LJLIL);
                    if (LIZIZ2.LJII()) {
                        return;
                    }
                    LIZIZ2.LIZLLL();
                    return;
                }
                C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
                c26045AKb.LJIIIIZZ(R.string.bnq);
                c26045AKb.LJIIJ();
                b bVar3 = C40599FwZ.LIZIZ;
                if (bVar3 != null) {
                    bVar3.LIZLLL(aVar, this.LJLIL);
                }
            } else {
                C26045AKb c26045AKb2 = new C26045AKb(this.LJLIL);
                c26045AKb2.LJIIIIZZ(R.string.hqa);
                c26045AKb2.LJIIJ();
                C40598FwY c40598FwY = C40599FwZ.LIZJ;
                if (c40598FwY == null || (bVar = C40599FwZ.LIZIZ) == null) {
                    return;
                }
                bVar.LIZJ(c40598FwY);
            }
        } catch (Exception unused) {
        }
    }
}
