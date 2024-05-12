package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.C26227ARb;
import X.C45087Hml;
import X.C45199HoZ;
import X.C45202Hoc;
import X.C45203Hod;
import X.C45205Hof;
import X.C45804HyK;
import X.C76800UCe;
import X.C78605Ut7;
import X.HVO;
import X.HVR;
import X.I9U;
import X.InterfaceC45209Hoj;
import X.InterfaceC45222How;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.UC0;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.ss.android.ugc.aweme.tools.music.MusicServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class AqS124S0300000_7 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS124S0300000_7 aqS124S0300000_7, Object obj, Object obj2) {
        MusicServiceImpl musicServiceImpl = (MusicServiceImpl) aqS124S0300000_7.l0;
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS124S0300000_7.l1;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS124S0300000_7.l2;
        musicServiceImpl.getClass();
        new I9U(musicServiceImpl, interfaceC88472Yns, interfaceC65784Pro).LIZ(((Number) obj).intValue(), (Intent) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS124S0300000_7 aqS124S0300000_7, Object obj, Object obj2) {
        List templateList = (List) obj;
        String taskId = (String) obj2;
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        List LJI = C45087Hml.LJI(templateList, (AutoCutThemeData) aqS124S0300000_7.l0);
        InterfaceC45222How interfaceC45222How = ((C45205Hof) aqS124S0300000_7.l1).LJI;
        if (interfaceC45222How != null) {
            interfaceC45222How.LJIILJJIL(taskId, LJI);
        }
        C45199HoZ c45199HoZ = (C45199HoZ) aqS124S0300000_7.l2;
        c45199HoZ.LJLLLL = true;
        c45199HoZ.LLF(((C45205Hof) aqS124S0300000_7.l1).LJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS124S0300000_7 aqS124S0300000_7, Object obj, Object obj2) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS124S0300000_7.l0;
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS124S0300000_7.l1;
        InterfaceC65784Pro interfaceC65784Pro2 = (InterfaceC65784Pro) aqS124S0300000_7.l2;
        String[] LJIL = C45804HyK.LJIL();
        String[] LJIILL = C78605Ut7.LJIILL(LJIL);
        Map LIZIZ = HVR.LIZIZ(activityC45651qj);
        HVO.LIZLLL(LJIL, activityC45651qj, "");
        C26227ARb c26227ARb = new C26227ARb(activityC45651qj);
        c26227ARb.LJFF(activityC45651qj.getString(R.string.rtq));
        c26227ARb.LIZIZ(HVR.LIZ(activityC45651qj, LIZIZ, LJIILL));
        UC0.LIZJ(c26227ARb, new AqS111S0300000_7(activityC45651qj, interfaceC65784Pro, LJIL, 7));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(activityC45651qj, c26227ARb);
        autoDismissPermissionDialog.LJLJJI = new AqS173S0100000_7(interfaceC65784Pro2, (InterfaceC65784Pro<C76800UCe>) 153);
        if (autoDismissPermissionDialog.LIZ()) {
            HVR.LIZIZ = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS124S0300000_7 aqS124S0300000_7, Object obj, Object obj2) {
        List templateList = (List) obj;
        String taskId = (String) obj2;
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        List LJI = C45087Hml.LJI(templateList, (AutoCutThemeData) aqS124S0300000_7.l0);
        Iterator<InterfaceC45209Hoj> it = ((C45203Hod) aqS124S0300000_7.l1).LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJIILJJIL(taskId, LJI);
        }
        C45202Hoc c45202Hoc = (C45202Hoc) aqS124S0300000_7.l2;
        c45202Hoc.LJIILL = true;
        c45202Hoc.LJIIL(((C45203Hod) aqS124S0300000_7.l1).LJIILJJIL);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS124S0300000_7(ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        super(2);
        this.$t = interfaceC65784Pro2;
        this.l0 = activityC45651qj;
        this.l1 = activityC45651qj2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS124S0300000_7(AutoCutThemeData autoCutThemeData, C45203Hod c45203Hod, C45202Hoc c45202Hoc, int i) {
        super(2);
        this.$t = i;
        this.l0 = autoCutThemeData;
        this.l1 = c45203Hod;
        this.l2 = c45202Hoc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS124S0300000_7(AutoCutThemeData autoCutThemeData, C45205Hof c45205Hof, C45199HoZ c45199HoZ, int i) {
        super(2);
        this.$t = i;
        this.l0 = autoCutThemeData;
        this.l1 = c45205Hof;
        this.l2 = c45199HoZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS124S0300000_7(MusicServiceImpl musicServiceImpl, AqS138S0200000_7 aqS138S0200000_7, AqS157S0100000_7 aqS157S0100000_7, int i) {
        super(2);
        this.$t = i;
        this.l0 = musicServiceImpl;
        this.l1 = aqS138S0200000_7;
        this.l2 = aqS157S0100000_7;
    }
}
