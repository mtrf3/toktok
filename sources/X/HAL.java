package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HAL extends HA5 {
    public HAL(HAE hae) {
        super(hae);
    }

    @Override // X.InterfaceC43634HAo
    public final void LIZ(Object obj) {
        this.LIZJ.LIZIZ();
        C43619H9z c43619H9z = this.LIZ.LIZ;
        if (c43619H9z != null) {
            c43619H9z.LJIIJJI = 2;
        }
        if (obj instanceof MvThemeData) {
            MvThemeData mvThemeData = (MvThemeData) obj;
            Effect effect = mvThemeData.effect;
            o.LJIIIIZZ(effect, "mvThemeData.effect");
            if (C78540Us4.LJIJJLI(effect)) {
                long LIZ = this.LIZJ.LIZ("download mv effect", "success by cache.");
                HAE hae = this.LIZ;
                C43619H9z c43619H9z2 = hae.LIZ;
                if (c43619H9z2 != null) {
                    c43619H9z2.LIZIZ = (int) LIZ;
                }
                HAZ haz = hae.LIZJ;
                if (haz != null) {
                    haz.LIZ(mvThemeData);
                    return;
                }
                return;
            }
            InterfaceC84498XEg interfaceC84498XEg = this.LIZ.LJI;
            if (interfaceC84498XEg == null) {
                return;
            }
            interfaceC84498XEg.fetchEffect(mvThemeData.effect, new C44366Hb8("mv", new HAN(this, mvThemeData), false, null));
            return;
        }
        long LIZ2 = this.LIZJ.LIZ("download mv effect", "failed.");
        HAE hae2 = this.LIZ;
        C43619H9z c43619H9z3 = hae2.LIZ;
        if (c43619H9z3 != null) {
            c43619H9z3.LIZIZ = (int) LIZ2;
            c43619H9z3.LJIIJ = "mv list pass error";
            c43619H9z3.LJIIIZ = 3;
        }
        HAZ haz2 = hae2.LIZJ;
        if (haz2 == null) {
            return;
        }
        haz2.onFailed();
    }
}
