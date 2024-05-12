package Y;

import X.C158706Ks;
import X.C5TK;
import X.C6KU;
import X.C6KY;
import X.C6LO;
import X.C78857UxB;
import X.C83728WtY;
import X.EnumC83729WtZ;
import X.HX4;
import android.view.View;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDCListenerS295S0100000_2 implements View.OnLongClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.$t) {
            case 0:
                return onLongClick$0(this, view);
            case 1:
                return onLongClick$1(this, view);
            case 2:
                return onLongClick$2(this, view);
            case 3:
                return onLongClick$3(this, view);
            default:
                return false;
        }
    }

    public IDCListenerS295S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onLongClick$0(IDCListenerS295S0100000_2 iDCListenerS295S0100000_2, View view) {
        FTCEditAudioRecordScene fTCEditAudioRecordScene = (FTCEditAudioRecordScene) iDCListenerS295S0100000_2.l0;
        fTCEditAudioRecordScene.audioRecordStartButtonLongClicking = true;
        C6KY c6ky = fTCEditAudioRecordScene.audioRecordStartButton;
        if (c6ky != null) {
            c6ky.LJLJJI.end();
            c6ky.LJLJI.start();
            ((FTCEditAudioRecordScene) iDCListenerS295S0100000_2.l0).start(true, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_AUDIO_START_RECORD_START_LONG_CLICK, HX4.EDIT));
            ((FTCEditAudioRecordScene) iDCListenerS295S0100000_2.l0).recordDubStart("long_press");
            return true;
        }
        o.LJIJI("audioRecordStartButton");
        throw null;
    }

    public static final boolean onLongClick$1(IDCListenerS295S0100000_2 iDCListenerS295S0100000_2, View view) {
        if (((C158706Ks) iDCListenerS295S0100000_2.l0).LJLILLLLZI.FS()) {
            return true;
        }
        ((C158706Ks) iDCListenerS295S0100000_2.l0).getUiActions().LJIIIIZZ.invoke(Boolean.TRUE);
        C6LO c6lo = ((C158706Ks) iDCListenerS295S0100000_2.l0).LJLZ;
        if (c6lo != null) {
            c6lo.LJLJJI.end();
            c6lo.LJLJI.start();
            ((C158706Ks) iDCListenerS295S0100000_2.l0).getUiActions().LIZ.invoke(C78857UxB.LJJIIJ(1476788239, "bpea-start_when_long_click"));
            ((C158706Ks) iDCListenerS295S0100000_2.l0).LJLILLLLZI.hu("long_press");
            return true;
        }
        o.LJIJI("audioRecordStartButton");
        throw null;
    }

    public static final boolean onLongClick$2(IDCListenerS295S0100000_2 iDCListenerS295S0100000_2, View view) {
        C5TK c5tk = (C5TK) iDCListenerS295S0100000_2.l0;
        if (c5tk.LJLLJ) {
            return true;
        }
        c5tk.LJLL = true;
        c5tk.LLJJIII("long_press");
        return true;
    }

    public static final boolean onLongClick$3(IDCListenerS295S0100000_2 iDCListenerS295S0100000_2, View view) {
        EditAudioRecordScene editAudioRecordScene = (EditAudioRecordScene) iDCListenerS295S0100000_2.l0;
        if (editAudioRecordScene.isPaused) {
            return true;
        }
        editAudioRecordScene.setAudioRecordStartButtonLongClicking(true);
        C6KU c6ku = ((EditAudioRecordScene) iDCListenerS295S0100000_2.l0).audioRecordStartButton;
        if (c6ku != null) {
            c6ku.LJLJJI.end();
            c6ku.LJLJI.start();
            ((EditAudioRecordScene) iDCListenerS295S0100000_2.l0).start(true, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_START_RECORD_START_EDIT, HX4.EDIT));
            ((EditAudioRecordScene) iDCListenerS295S0100000_2.l0).recordDubStart("long_press");
            return true;
        }
        o.LJIJI("audioRecordStartButton");
        throw null;
    }
}
