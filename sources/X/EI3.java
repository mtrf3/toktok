package X;

import Y.ARunnableS25S0200000_6;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;

/* loaded from: classes7.dex */
public abstract class EI3 extends EI4 {
    public abstract void LJFF(SettingCombineModel settingCombineModel);

    public abstract boolean LJI(SettingCombineModel settingCombineModel);

    @Override // X.EI4
    public final boolean LJ(SettingCombineModel settingCombineModel) {
        boolean LJI = LJI(settingCombineModel);
        if (LJI) {
            if (((Boolean) DTQ.LIZJ.getValue()).booleanValue()) {
                C38995FSd.LJFF().submit(new ARunnableS25S0200000_6(settingCombineModel, this, 56));
            } else {
                LJFF(settingCombineModel);
            }
        }
        return LJI;
    }
}
