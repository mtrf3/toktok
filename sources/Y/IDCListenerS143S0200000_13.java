package Y;

import X.C29306Beo;
import X.C41071jL;
import X.C48459J0d;
import X.C76548U2m;
import X.TQA;
import X.U35;
import X.U3D;
import X.UF7;
import X.UF8;
import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDCListenerS143S0200000_13 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                return;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                return;
            default:
                return;
        }
    }

    public IDCListenerS143S0200000_13(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onCheckedChanged$0(IDCListenerS143S0200000_13 iDCListenerS143S0200000_13, CompoundButton compoundButton, boolean z) {
        UF8 uf8 = (UF8) iDCListenerS143S0200000_13.l0;
        new C48459J0d(uf8.LIZ, uf8.LIZJ).LIZ(Boolean.valueOf(z));
        UF8 uf82 = (UF8) iDCListenerS143S0200000_13.l0;
        Boolean valueOf = Boolean.valueOf(z);
        uf82.getClass();
        o.LJIIIZ(valueOf, "<set-?>");
        uf82.LIZIZ = valueOf;
        UF7 uf7 = (UF7) iDCListenerS143S0200000_13.l1;
        uf7.L(uf7.LJLJI, uf7.LJLILLLLZI, (UF8) iDCListenerS143S0200000_13.l0);
    }

    public static final void onCheckedChanged$1(IDCListenerS143S0200000_13 iDCListenerS143S0200000_13, CompoundButton compoundButton, boolean z) {
        Boolean bool;
        String str;
        ((C41071jL) iDCListenerS143S0200000_13.l0).setChecked(!((U3D) iDCListenerS143S0200000_13.l1).LLF);
        ((U3D) iDCListenerS143S0200000_13.l1).LLF = ((C41071jL) iDCListenerS143S0200000_13.l0).isChecked();
        U35 LIZ = TQA.LIZ();
        if (LIZ != null) {
            bool = Boolean.valueOf(LIZ.LJIIJJI());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            U3D u3d = (U3D) iDCListenerS143S0200000_13.l1;
            u3d.LJLJJL.LIZJ(u3d.LLF);
        } else {
            ((U3D) iDCListenerS143S0200000_13.l1).LJJIJ();
        }
        boolean isChecked = ((C41071jL) iDCListenerS143S0200000_13.l0).isChecked();
        Map LIZ2 = C76548U2m.LIZ();
        LIZ2.put("is_liveshow_ongoing", C76548U2m.LJFF());
        if (isChecked) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ2.put("is_guest_mic_open", str);
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_setting_mic_click", LIZ2);
    }
}
