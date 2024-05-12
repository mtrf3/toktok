package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.effectcreatormobile.assetEditor.base.AssetNameViewModel;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.ies.effectcreator.swig.Feature;
import kotlin.jvm.internal.o;

/* renamed from: X.alf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94727alf extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ LiquefyFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94727alf(LiquefyFragment liquefyFragment) {
        super(1);
        this.LJLIL = liquefyFragment;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        String str;
        Feature feature;
        Feature feature2;
        o.LJIIIZ(it, "it");
        IMain LIZ = C93723aVT.LIZ();
        if (LIZ == null || !LIZ.isLoading()) {
            Bundle arguments = this.LJLIL.getArguments();
            if (arguments != null && arguments.getBoolean("cke_liquefy_new_feature")) {
                AssetNameViewModel assetNameViewModel = (AssetNameViewModel) this.LJLIL.LJLJJI.getValue();
                C94518aiI c94518aiI = this.LJLIL.Gl().LJLIL;
                if (c94518aiI == null || (feature2 = c94518aiI.LIZJ) == null || (str = feature2.getDisplayName()) == null) {
                    str = "";
                }
                assetNameViewModel.getClass();
                Integer num = assetNameViewModel.LJLIL.get(str);
                if (num == null) {
                    num = 0;
                }
                int intValue = num.intValue() + 1;
                assetNameViewModel.LJLIL.put(str, Integer.valueOf(intValue));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(intValue);
                String name = X1D.LIZIZ(LIZ2);
                LiquefyViewModel Gl = this.LJLIL.Gl();
                Gl.getClass();
                o.LJIIIZ(name, "name");
                C94518aiI c94518aiI2 = Gl.LJLIL;
                if (c94518aiI2 != null && (feature = c94518aiI2.LIZJ) != null) {
                    feature.setDisplayName(name);
                }
            } else {
                Bundle arguments2 = this.LJLIL.getArguments();
                if (arguments2 != null) {
                    C93977aZZ.LIZIZ().restoreMainPageState(arguments2);
                }
            }
            C94518aiI c94518aiI3 = this.LJLIL.Gl().LJLIL;
            if (c94518aiI3 != null) {
                c94518aiI3.LIZLLL = false;
            }
            if (this.LJLIL.Gl().LJLIL != null) {
                C94518aiI.LJIILIIL("save");
            }
            this.LJLIL.Dl(true);
        }
        return C76800UCe.LIZ;
    }
}
