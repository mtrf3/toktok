package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C122034qd;
import X.C126114xD;
import X.C126124xE;
import X.C17N;
import X.C6M6;
import X.C6MJ;
import X.C76800UCe;
import X.InterfaceC126134xF;
import X.InterfaceC133865Ne;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.vesdk.VEEditor;
import defpackage.g0;

/* loaded from: classes3.dex */
public class AqS1S1111000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S1111000_2 aqS1S1111000_2) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        ((C6M6) aqS1S1111000_2.l1).LJJZZI(C6MJ.LJLIL);
        ((C6M6) aqS1S1111000_2.l1).LLJJJIL().removeCallbacks(((C6M6) aqS1S1111000_2.l1).LLIZ());
        ((C6M6) aqS1S1111000_2.l1).LLJJJIL().postDelayed(((C6M6) aqS1S1111000_2.l1).LLIZ(), 10000L);
        ((C6M6) aqS1S1111000_2.l1).LLIIIL(aqS1S1111000_2.i3, aqS1S1111000_2.s0);
        if (aqS1S1111000_2.z2) {
            InterfaceC153045zY value = ((C6M6) aqS1S1111000_2.l1).Ll0().Kh().getValue();
            if (value != null) {
                VEEditor.SEEK_MODE seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
                final C6M6 c6m6 = (C6M6) aqS1S1111000_2.l1;
                value.LLJJJJJIL(0, seek_mode, new InterfaceC133865Ne() { // from class: X.6MH
                    @Override // X.InterfaceC133865Ne
                    public final void LIZ(int i) {
                        InterfaceC153045zY value2 = C6M6.this.Ll0().Kh().getValue();
                        if (value2 != null) {
                            value2.play();
                        }
                    }
                });
            }
        } else {
            InterfaceC153045zY value2 = ((C6M6) aqS1S1111000_2.l1).Ll0().Kh().getValue();
            if (value2 != null) {
                value2.play();
            }
        }
        InterfaceC153045zY value3 = ((C6M6) aqS1S1111000_2.l1).Ll0().Kh().getValue();
        if (value3 != null && (LJJI = C17N.LJJI(value3)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            g0.LJIIJJI(nLEEditor, true, false, 2);
        }
        ((C6M6) aqS1S1111000_2.l1).LLIILZL();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S1111000_2 aqS1S1111000_2) {
        if (aqS1S1111000_2.z2) {
            InterfaceC126134xF interfaceC126134xF = ((C126114xD) aqS1S1111000_2.l1).LIZJ;
            if (interfaceC126134xF != null) {
                interfaceC126134xF.onProgress(100);
            }
            InterfaceC126134xF interfaceC126134xF2 = ((C126114xD) aqS1S1111000_2.l1).LIZJ;
            if (interfaceC126134xF2 != null) {
                interfaceC126134xF2.onSuccess();
            }
            ((C126114xD) aqS1S1111000_2.l1).LIZJ = null;
        } else {
            InterfaceC126134xF interfaceC126134xF3 = ((C126114xD) aqS1S1111000_2.l1).LIZJ;
            if (interfaceC126134xF3 != null) {
                interfaceC126134xF3.LIZ(new C126124xE(aqS1S1111000_2.i3, aqS1S1111000_2.s0));
            }
            ((C126114xD) aqS1S1111000_2.l1).LIZJ = null;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1111000_2(C6M6 c6m6, int i, String str, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c6m6;
        this.i3 = i;
        this.s0 = str;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1111000_2(boolean z, C126114xD c126114xD, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.z2 = z;
        this.l1 = c126114xD;
        this.i3 = i;
        this.s0 = str;
    }
}
