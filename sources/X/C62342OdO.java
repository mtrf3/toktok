package X;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.improve.pkg.NowSharePackage;

/* renamed from: X.OdO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62342OdO extends AbstractC65781Prl implements InterfaceC88473Ynt<Integer, Boolean, Integer, OSZ<? extends View, ? extends FrameLayout.LayoutParams>> {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ NowSharePackage LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62342OdO(Activity activity, Aweme aweme, NowSharePackage nowSharePackage) {
        super(3);
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = nowSharePackage;
    }

    public final OSZ<View, FrameLayout.LayoutParams> invoke(int i, boolean z, int i2) {
        if (!z) {
            return null;
        }
        C62354Oda c62354Oda = new C62354Oda(this.LJLIL);
        Aweme aweme = this.LJLILLLLZI;
        C62344OdQ c62344OdQ = NowSharePackage.Companion;
        String str = this.LJLJI.itemType;
        c62344OdQ.getClass();
        W5F LJII = W5U.LJII(C78939UyV.LJ(C62233Obd.LIZIZ(aweme, C62344OdQ.LIZIZ(str))));
        LJII.LJJIIJ = c62354Oda;
        C16880lQ.LLJJJ(LJII);
        float LJIIZILJ = C32151Nz.LJIIZILJ(Float.valueOf(370.0f));
        FrameLayout.LayoutParams LIZIZ = C43302Gz4.LIZIZ(this.LJLIL, i2, LJIIZILJ);
        c62354Oda.setConfigurationChangedListener(new C62345OdR(this.LJLIL, i2, LJIIZILJ, c62354Oda));
        float LIZJ = KL2.LIZJ(this.LJLIL, (LIZIZ.height / LJIIZILJ) * 20.0f);
        C17N.LJJJJZ(c62354Oda, new float[]{LIZJ, LIZJ, LIZJ, LIZJ}, null);
        C16880lQ.LJJJJLI(c62354Oda, null);
        return new OSZ<>(c62354Oda, LIZIZ);
    }

    @Override // X.InterfaceC88473Ynt
    public /* bridge */ /* synthetic */ OSZ<? extends View, ? extends FrameLayout.LayoutParams> invoke(Integer num, Boolean bool, Integer num2) {
        return invoke(num.intValue(), bool.booleanValue(), num2.intValue());
    }
}
