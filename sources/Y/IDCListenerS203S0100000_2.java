package Y;

import X.C139205dE;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;

/* loaded from: classes3.dex */
public class IDCListenerS203S0100000_2 implements CompoundButton.OnCheckedChangeListener {
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
            default:
                return;
        }
    }

    public IDCListenerS203S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(IDCListenerS203S0100000_2 iDCListenerS203S0100000_2, CompoundButton compoundButton, boolean z) {
        ((FTCEditAudioRecordScene) iDCListenerS203S0100000_2.l0).getNeedOriginalSoundLiveData().setValue(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$1(IDCListenerS203S0100000_2 iDCListenerS203S0100000_2, CompoundButton compoundButton, boolean z) {
        ((EditAudioRecordScene) iDCListenerS203S0100000_2.l0).getNeedOriginalSoundLiveData().setValue(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$2(IDCListenerS203S0100000_2 iDCListenerS203S0100000_2, CompoundButton compoundButton, boolean z) {
        ((C139205dE) iDCListenerS203S0100000_2.l0).getUiActions().LJLJI.invoke(Boolean.valueOf(z));
    }
}
