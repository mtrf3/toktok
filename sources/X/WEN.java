package X;

import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* loaded from: classes15.dex */
public final class WEN extends WEU {
    public WEN(C81947WEd c81947WEd) {
        super(c81947WEd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.W5O, REQUEST] */
    public final void LIZJ(Drawable drawable, int i, WET wet) {
        C81949WEf transConfig = this.LIZ.getTransConfig();
        wet.LJZ = false;
        C81947WEd c81947WEd = this.LIZ;
        c81947WEd.getClass();
        wet.setOnClickListener(new ViewOnClickListenerC13880ga(new ViewOnClickListenerC81956WEm(c81947WEd, wet, i)));
        if (transConfig == null) {
            return;
        }
        WER LIZ = transConfig.LIZ();
        String str = (String) ListProtector.get(transConfig.LJIIIZ, i);
        WEP wep = new WEP(this, transConfig, i, wet);
        C62875Olz c62875Olz = (C62875Olz) LIZ;
        c62875Olz.getClass();
        W6J LIZ2 = W5I.LIZ();
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
        LIZLLL.LJIIIZ = W92.HIGH;
        ?? LIZ3 = LIZLLL.LIZ();
        W4W<C81392Vwy<W5A>> LJ = LIZ2.LJ(LIZ3, null);
        C81705W4v LIZJ = W5I.LIZJ();
        LIZJ.LIZLLL = LIZ3;
        LIZJ.LJIIL = wet.getController();
        LIZJ.LJII = new WEO(c62875Olz, wep, LJ, wet, drawable);
        wet.setController(LIZJ.LIZ());
    }
}
