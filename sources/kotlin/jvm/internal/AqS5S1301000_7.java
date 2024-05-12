package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AlertDialogC45239HpD;
import X.C44716Hgm;
import X.C45059HmJ;
import X.C45087Hml;
import X.C45199HoZ;
import X.C45254HpS;
import X.C76800UCe;
import X.EnumC45211Hol;
import X.InterfaceC45213Hon;
import X.InterfaceC65784Pro;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes8.dex */
public class AqS5S1301000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
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

    public static final Object invoke$0(AqS5S1301000_7 aqS5S1301000_7) {
        EnumC45211Hol enumC45211Hol = (EnumC45211Hol) aqS5S1301000_7.l1;
        if (enumC45211Hol == EnumC45211Hol.ERROR_PROCESS_INTERNET) {
            AlertDialogC45239HpD LJLLILLLL = ((C45199HoZ) aqS5S1301000_7.l2).LJLLILLLL();
            if (LJLLILLLL != null) {
                LJLLILLLL.LIZJ();
            }
        } else if (enumC45211Hol == EnumC45211Hol.ERROR_PROCESS_INTERNET_WEAK) {
            AlertDialogC45239HpD LJLLILLLL2 = ((C45199HoZ) aqS5S1301000_7.l2).LJLLILLLL();
            if (LJLLILLLL2 != null) {
                LJLLILLLL2.LIZJ();
                TuxTextView tuxTextView = LJLLILLLL2.LJLJJI;
                if (tuxTextView != null) {
                    tuxTextView.setText(LJLLILLLL2.getContext().getString(R.string.bwq));
                }
            }
        } else {
            AlertDialogC45239HpD LJLLILLLL3 = ((C45199HoZ) aqS5S1301000_7.l2).LJLLILLLL();
            if (LJLLILLLL3 != null) {
                LJLLILLLL3.LIZ();
            }
        }
        InterfaceC45213Hon LJLJLJ = ((C45199HoZ) aqS5S1301000_7.l2).LJLJLJ();
        if (LJLJLJ != null) {
            LJLJLJ.fU(true, 0);
        }
        InterfaceC45213Hon LJLJLJ2 = ((C45199HoZ) aqS5S1301000_7.l2).LJLJLJ();
        if (LJLJLJ2 != null) {
            LJLJLJ2.gS((EnumC45211Hol) aqS5S1301000_7.l1);
        }
        InterfaceC45213Hon LJLJLJ3 = ((C45199HoZ) aqS5S1301000_7.l2).LJLJLJ();
        if (LJLJLJ3 != null) {
            LJLJLJ3.zI(false);
        }
        InterfaceC45213Hon LJLJLJ4 = ((C45199HoZ) aqS5S1301000_7.l2).LJLJLJ();
        if (LJLJLJ4 != null) {
            LJLJLJ4.xJ(true);
        }
        InterfaceC45213Hon LJLJLJ5 = ((C45199HoZ) aqS5S1301000_7.l2).LJLJLJ();
        if (LJLJLJ5 != null) {
            LJLJLJ5.lm(false);
        }
        C45254HpS c45254HpS = ((C45199HoZ) aqS5S1301000_7.l2).LJLJI;
        if (c45254HpS != null) {
            c45254HpS.LJIILL(aqS5S1301000_7.i4, (Integer) aqS5S1301000_7.l3, aqS5S1301000_7.s0, (EnumC45211Hol) aqS5S1301000_7.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S1301000_7 aqS5S1301000_7) {
        InterfaceC45213Hon LJLJLJ;
        MusicRequestCallbackInfoType musicRequestCallbackInfoType = (MusicRequestCallbackInfoType) aqS5S1301000_7.l1;
        if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.REQUEST_ERROR) {
            C45199HoZ.LJLZ((C45199HoZ) aqS5S1301000_7.l2, aqS5S1301000_7.i4, null, aqS5S1301000_7.s0, (UnorderedMapStrStr) aqS5S1301000_7.l3, 2, null);
        } else if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS && (LJLJLJ = ((C45199HoZ) aqS5S1301000_7.l2).LJLJLJ()) != null) {
            LJLJLJ.gS(EnumC45211Hol.PROCESS_APPLY_EFFECTS);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS5S1301000_7 aqS5S1301000_7) {
        int i;
        C44716Hgm c44716Hgm = ((C45059HmJ) aqS5S1301000_7.l1).LJ;
        c44716Hgm.LJII = (NLEModel) aqS5S1301000_7.l2;
        Integer LJJIFFI = C45087Hml.LJJIFFI((Map) aqS5S1301000_7.l3);
        if (LJJIFFI != null) {
            i = LJJIFFI.intValue();
        } else {
            i = aqS5S1301000_7.i4;
        }
        c44716Hgm.LIZJ = i;
        ((C45059HmJ) aqS5S1301000_7.l1).LJ.LJI = C45087Hml.LJIILLIIL((NLEModel) aqS5S1301000_7.l2);
        C44716Hgm c44716Hgm2 = ((C45059HmJ) aqS5S1301000_7.l1).LJ;
        String LJJI = C45087Hml.LJJI((Map) aqS5S1301000_7.l3);
        if (LJJI == null) {
            LJJI = aqS5S1301000_7.s0;
        }
        c44716Hgm2.LJIIJJI = LJJI;
        ((C45059HmJ) aqS5S1301000_7.l1).LIZJ();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS5S1301000_7(C45059HmJ c45059HmJ, C45059HmJ c45059HmJ2, NLEModel nLEModel, Map<String, String> map, int i, String str) {
        super(0);
        this.$t = str;
        this.l1 = c45059HmJ;
        this.l2 = c45059HmJ2;
        this.l3 = nLEModel;
        this.i4 = map;
        this.s0 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S1301000_7(EnumC45211Hol enumC45211Hol, C45199HoZ c45199HoZ, int i, Integer num, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = enumC45211Hol;
        this.l2 = c45199HoZ;
        this.i4 = i;
        this.l3 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S1301000_7(MusicRequestCallbackInfoType musicRequestCallbackInfoType, C45199HoZ c45199HoZ, int i, String str, UnorderedMapStrStr unorderedMapStrStr, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = musicRequestCallbackInfoType;
        this.l2 = c45199HoZ;
        this.i4 = i;
        this.s0 = str;
        this.l3 = unorderedMapStrStr;
    }
}
