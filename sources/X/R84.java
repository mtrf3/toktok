package X;

import android.os.Bundle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R84 extends AbstractC68940R3w {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ C45R<C69027R7f> LIZIZ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        C68545QvF.LIZ(true);
        InterfaceC69056R8i viewCallback = this.LIZ;
        o.LJIIIZ(viewCallback, "viewCallback");
        C5S1 c5s1 = new C5S1(C58725N2z.LIZ);
        c5s1.LIZLLL(C58725N2z.LIZ.getString(R.string.idj));
        c5s1.LJ();
        Bundle extras = viewCallback.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.putInt("next_page", EnumC69113RAn.FINISH.getValue());
        viewCallback.rh(extras);
    }

    public R84(InterfaceC69056R8i interfaceC69056R8i, C73516StE c73516StE) {
        this.LIZ = interfaceC69056R8i;
        this.LIZIZ = c73516StE;
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        if (qqi == null) {
            C45R<C69027R7f> c45r = this.LIZIZ;
            C69049R8b c69049R8b = C69084R9k.Companion;
            EnumC69116RAq scene = this.LIZ.scene();
            EnumC69113RAn LJLLLL = this.LIZ.LJLLLL();
            c69049R8b.getClass();
            ((C73516StE) c45r).onError(C69049R8b.LIZ(scene, LJLLLL));
            return;
        }
        ((C73516StE) this.LIZIZ).onError(new C69084R9k(i, qqi.LJFF, this.LIZ.scene(), this.LIZ.LJLLLL(), qqi.LJII, null, 32, null));
    }
}
