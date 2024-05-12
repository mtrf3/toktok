package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C73305Spp;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.XIJ;
import X.XIK;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingFragmentDynamicUIVersion;

/* loaded from: classes16.dex */
public class AqS70S0110000_15 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public final void invoke$0() {
        PushSettingFragmentDynamicUIVersion pushSettingFragmentDynamicUIVersion = (PushSettingFragmentDynamicUIVersion) this.l0;
        pushSettingFragmentDynamicUIVersion.LJLLILLLL++;
        C73305Spp c73305Spp = pushSettingFragmentDynamicUIVersion.LJLLL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = pushSettingFragmentDynamicUIVersion.LJLLL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
        if (this.z1) {
            ((PushSettingFragmentDynamicUIVersion) this.l0).LJLJI.LJIILL(new Object[0]);
        } else {
            ((PushSettingFragmentDynamicUIVersion) this.l0).LJLJJLL.LJIILL(new Object[0]);
        }
        C73305Spp c73305Spp3 = ((PushSettingFragmentDynamicUIVersion) this.l0).LJLLL;
        if (c73305Spp3 != null) {
            C16880lQ.LJIIJJI(null, c73305Spp3);
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS70S0110000_15 aqS70S0110000_15) {
        aqS70S0110000_15.invoke$0();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS70S0110000_15 aqS70S0110000_15) {
        return new XIJ((UIAssem) aqS70S0110000_15.l0, aqS70S0110000_15.z1, XIK.UI_ASSEM);
    }

    public static final Object invoke$2(AqS70S0110000_15 aqS70S0110000_15) {
        return new XIJ((ReusedUIAssem) aqS70S0110000_15.l0, aqS70S0110000_15.z1, XIK.REUSED_UIASSEM);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0110000_15(UIAssem uIAssem, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = uIAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS70S0110000_15(ReusedUIAssem reusedUIAssem, Object obj, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = reusedUIAssem;
        this.z1 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS70S0110000_15(PushSettingFragmentDynamicUIVersion pushSettingFragmentDynamicUIVersion, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = pushSettingFragmentDynamicUIVersion;
        this.z1 = z;
    }
}
