package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiments.UnLoginDiggExperiment2022;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class E44 extends AbstractC65781Prl implements InterfaceC65784Pro<UnLoginDiggExperiment2022.UnLoginDiggExperimentModel> {
    public static final E44 LJLIL = new E44();

    public E44() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final UnLoginDiggExperiment2022.UnLoginDiggExperimentModel invoke() {
        if (UnLoginDiggExperiment2022.LIZJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_expVal flow1: ");
            UnLoginDiggExperiment2022.UnLoginDiggExperimentModel unLoginDiggExperimentModel = UnLoginDiggExperiment2022.LIZJ;
            if (unLoginDiggExperimentModel != null) {
                LIZ.append(unLoginDiggExperimentModel);
                X1D.LIZIZ(LIZ);
                UnLoginDiggExperiment2022.LJ = true;
                UnLoginDiggExperiment2022.UnLoginDiggExperimentModel unLoginDiggExperimentModel2 = UnLoginDiggExperiment2022.LIZJ;
                if (unLoginDiggExperimentModel2 != null) {
                    return unLoginDiggExperimentModel2;
                }
                o.LJIJI("_expVal");
                throw null;
            }
            o.LJIJI("_expVal");
            throw null;
        }
        String string = ((Keva) UnLoginDiggExperiment2022.LIZ.getValue()).getString("unlogin_digg_model_key_v2", "");
        UnLoginDiggExperiment2022.LIZLLL = true;
        UnLoginDiggExperiment2022.LJ = true;
        if (!TextUtils.isEmpty(string)) {
            try {
                Object LJI = GsonHolder.LIZLLL().LIZ().LJI(string, UnLoginDiggExperiment2022.UnLoginDiggExperimentModel.class);
                o.LJIIIIZZ(LJI, "get().getService(GsonPro…erimentModel::class.java)");
                return (UnLoginDiggExperiment2022.UnLoginDiggExperimentModel) LJI;
            } catch (Exception unused) {
                UnLoginDiggExperiment2022.LJ = false;
                return UnLoginDiggExperiment2022.LIZIZ;
            }
        }
        UnLoginDiggExperiment2022.LJ = false;
        return UnLoginDiggExperiment2022.LIZIZ;
    }
}
