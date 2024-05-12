package Y;

import X.C113624d4;
import X.C93425aQf;
import X.C94510aiA;
import X.C94969apZ;
import X.C94970apa;
import X.X1D;
import X.XKX;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.ui.VoiceSearchLanguageCell;
import com.ss.android.ugc.aweme.search.pages.voice.voicesearch.settings.viewmodel.VoiceSearchLanguageSettingViewModel;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.ugc.effectcreator.layer.LayerImpl;
import kotlin.jvm.internal.IDqS17S1100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDCListenerS210S0100000_42 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                return;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS210S0100000_42(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS210S0100000_42 iDCListenerS210S0100000_42, CompoundButton compoundButton, boolean z) {
        String str;
        C113624d4 c113624d4;
        C113624d4 c113624d42;
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select ");
            C94510aiA item = ((VoiceSearchLanguageCell) iDCListenerS210S0100000_42.l0).getItem();
            if (item != null && (c113624d42 = item.LJLIL) != null) {
                str = c113624d42.LIZIZ;
            } else {
                str = null;
            }
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            C94510aiA item2 = ((VoiceSearchLanguageCell) iDCListenerS210S0100000_42.l0).getItem();
            if (item2 != null && (c113624d4 = item2.LJLIL) != null) {
                VoiceSearchLanguageSettingViewModel voiceSearchLanguageSettingViewModel = (VoiceSearchLanguageSettingViewModel) ((VoiceSearchLanguageCell) iDCListenerS210S0100000_42.l0).LJLIL.getValue();
                String selectedClusterKey = c113624d4.LIZLLL;
                o.LJIIIZ(selectedClusterKey, "selectedClusterKey");
                voiceSearchLanguageSettingViewModel.withState(new IDqS17S1100000_42(voiceSearchLanguageSettingViewModel, selectedClusterKey, 3));
            }
        }
    }

    public static final void onCheckedChanged$1(IDCListenerS210S0100000_42 iDCListenerS210S0100000_42, CompoundButton compoundButton, boolean z) {
        LayerImpl LIZ = C93425aQf.LIZ();
        if (LIZ != null) {
            LIZ.setLayerDetailStatus(z);
        }
        EffectLayerEditorFragment effectLayerEditorFragment = (EffectLayerEditorFragment) iDCListenerS210S0100000_42.l0;
        if (z) {
            effectLayerEditorFragment.Al().LLIIIJ(true);
            effectLayerEditorFragment.Al().LLFZ(true, null);
        } else {
            effectLayerEditorFragment.Al().LLIIIJ(false);
            effectLayerEditorFragment.Al().LLFZ(false, null);
        }
    }

    public static final void onCheckedChanged$2(IDCListenerS210S0100000_42 iDCListenerS210S0100000_42, CompoundButton compoundButton, boolean z) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LiquefyFragment) iDCListenerS210S0100000_42.l0), null, null, new C94969apZ(iDCListenerS210S0100000_42, z, null), 3);
    }

    public static final void onCheckedChanged$3(IDCListenerS210S0100000_42 iDCListenerS210S0100000_42, CompoundButton compoundButton, boolean z) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope((LiquefyFragment) iDCListenerS210S0100000_42.l0), null, null, new C94970apa(iDCListenerS210S0100000_42, z, null), 3);
    }
}
