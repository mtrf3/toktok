package kotlin.jvm.internal;

import X.AbstractC45196HoW;
import X.AbstractC65781Prl;
import X.C44716Hgm;
import X.C45087Hml;
import X.C45199HoZ;
import X.C45201Hob;
import X.C45203Hod;
import X.C45205Hof;
import X.C63081OpJ;
import X.C76800UCe;
import X.C78685UuP;
import X.EnumC43998HOo;
import X.EnumC45070HmU;
import X.H78;
import X.InterfaceC45209Hoj;
import X.InterfaceC45222How;
import X.InterfaceC88471Ynr;
import X.ORZ;
import X.OSZ;
import X.X1D;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS2S2400000_7 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S2400000_7 aqS2S2400000_7, Object obj, Object obj2) {
        EnumC43998HOo LLJZIJLIL;
        int value;
        EnumC45070HmU enumC45070HmU;
        String str;
        List templateList = (List) obj;
        String taskId = (String) obj2;
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        List LJI = C45087Hml.LJI(templateList, (AutoCutThemeData) aqS2S2400000_7.l2);
        InterfaceC45222How interfaceC45222How = ((C45205Hof) aqS2S2400000_7.l3).LJI;
        if (interfaceC45222How != null) {
            interfaceC45222How.LJIILJJIL(taskId, LJI);
        }
        ((C45199HoZ) aqS2S2400000_7.l4).LJLLLL = true;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLJ(LJI);
        if (((C45205Hof) aqS2S2400000_7.l3).LIZ.LJIIJJI) {
            LLJZIJLIL = EnumC43998HOo.SOUND_SYNC_TEMPLATE;
        } else {
            LLJZIJLIL = C63081OpJ.LLJZIJLIL(autoCutThemeData.templateType);
        }
        C44716Hgm c44716Hgm = ((C45199HoZ) aqS2S2400000_7.l4).LJLLL;
        if (c44716Hgm != null) {
            if (LLJZIJLIL != null) {
                value = LLJZIJLIL.getValue();
            } else {
                value = EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue();
            }
            c44716Hgm.LIZJ = value;
        }
        C45199HoZ c45199HoZ = (C45199HoZ) aqS2S2400000_7.l4;
        C44716Hgm c44716Hgm2 = c45199HoZ.LJLLL;
        if (c44716Hgm2 != null) {
            c44716Hgm2.LJIIIZ = autoCutThemeData.templateId;
            c44716Hgm2.LJIIJJI = autoCutThemeData.templateGroupId;
        }
        C45205Hof c45205Hof = (C45205Hof) aqS2S2400000_7.l3;
        C45203Hod c45203Hod = c45205Hof.LIZ;
        if (!c45203Hod.LIZIZ && !c45203Hod.LIZJ) {
            c45199HoZ.LLF(c45205Hof.LJI);
        } else {
            if (C78685UuP.LJJJZ(aqS2S2400000_7.s0) || LLJZIJLIL == EnumC43998HOo.DESIGNER_FIXED_TEMPLATE || LLJZIJLIL == EnumC43998HOo.ALGORITHM_TEMPLATE || LLJZIJLIL == EnumC43998HOo.SOUND_SYNC_TEMPLATE || LLJZIJLIL == EnumC43998HOo.AUTOCUT_TEMPLATE) {
                enumC45070HmU = EnumC45070HmU.TEMPLATE_MUSIC;
            } else {
                enumC45070HmU = EnumC45070HmU.TEMPLATE_CC;
            }
            EnumC45070HmU enumC45070HmU2 = EnumC45070HmU.TEMPLATE_MUSIC;
            if (enumC45070HmU != enumC45070HmU2) {
                ((C45205Hof) aqS2S2400000_7.l3).LIZ.LIZJ = false;
            }
            OSZ LJJIJIIJIL = C45087Hml.LJJIJIIJIL(autoCutThemeData);
            AVMusic aVMusic = (AVMusic) LJJIJIIJIL.getFirst();
            String str2 = (String) LJJIJIIJIL.getSecond();
            if (((C45205Hof) aqS2S2400000_7.l3).LIZ.LIZIZ) {
                C45199HoZ c45199HoZ2 = (C45199HoZ) aqS2S2400000_7.l4;
                String str3 = "";
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                String str4 = autoCutThemeData.templateId;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = autoCutThemeData.templateGroupId;
                if (str5 == null) {
                    str5 = "";
                }
                if (LLJZIJLIL == null) {
                    LLJZIJLIL = EnumC43998HOo.DESIGNER_FIXED_TEMPLATE;
                }
                int value2 = LLJZIJLIL.getValue();
                String str6 = autoCutThemeData.templateUrl;
                if (str6 != null) {
                    str3 = str6;
                }
                String str7 = autoCutThemeData.templateData;
                C45205Hof c45205Hof2 = (C45205Hof) aqS2S2400000_7.l3;
                C45203Hod c45203Hod2 = c45205Hof2.LIZ;
                c45199HoZ2.LLIIIL(taskId, str, str4, str5, value2, str3, str7, enumC45070HmU, c45203Hod2.LJII, autoCutThemeData.preloadUrsSet, c45203Hod2.LJIIL, c45205Hof2.LJI);
            }
            C45205Hof c45205Hof3 = (C45205Hof) aqS2S2400000_7.l3;
            C45203Hod c45203Hod3 = c45205Hof3.LIZ;
            if (c45203Hod3.LIZJ) {
                if (c45203Hod3.LJIIJJI) {
                    AVMusic aVMusic2 = (AVMusic) aqS2S2400000_7.l5;
                    if (aVMusic2 != null) {
                        ((C45199HoZ) aqS2S2400000_7.l4).LJJZZI(aVMusic2, c45205Hof3.LJI);
                    } else if (C78685UuP.LJJJZ(aqS2S2400000_7.s1)) {
                        ((C45199HoZ) aqS2S2400000_7.l4).LJLIIL(aqS2S2400000_7.s1, ((C45205Hof) aqS2S2400000_7.l3).LJI);
                    }
                } else if (enumC45070HmU == enumC45070HmU2) {
                    if (aVMusic != null) {
                        ((C45199HoZ) aqS2S2400000_7.l4).LJJZZI(aVMusic, c45205Hof3.LJI);
                    } else if (str2 != null) {
                        ((C45199HoZ) aqS2S2400000_7.l4).LJLIIL(str2, c45205Hof3.LJI);
                    } else {
                        C45199HoZ.LJLZ((C45199HoZ) aqS2S2400000_7.l4, 1009, null, null, null, 14, null);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S2400000_7 aqS2S2400000_7, Object obj, Object obj2) {
        EnumC43998HOo LLJZIJLIL;
        int value;
        EnumC45070HmU enumC45070HmU;
        EnumC45070HmU enumC45070HmU2;
        String str;
        List templateList = (List) obj;
        String taskId = (String) obj2;
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        List LJI = C45087Hml.LJI(templateList, (AutoCutThemeData) aqS2S2400000_7.l2);
        Iterator<InterfaceC45209Hoj> it = ((C45203Hod) aqS2S2400000_7.l3).LJIILJJIL.iterator();
        while (it.hasNext()) {
            it.next().LJIILJJIL(taskId, LJI);
        }
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLJ(LJI);
        if (((C45203Hod) aqS2S2400000_7.l3).LJIIJJI) {
            LLJZIJLIL = EnumC43998HOo.SOUND_SYNC_TEMPLATE;
        } else {
            LLJZIJLIL = C63081OpJ.LLJZIJLIL(autoCutThemeData.templateType);
        }
        C44716Hgm c44716Hgm = ((C45201Hob) aqS2S2400000_7.l4).LJI;
        if (c44716Hgm != null) {
            if (LLJZIJLIL != null) {
                value = LLJZIJLIL.getValue();
            } else {
                value = EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue();
            }
            c44716Hgm.LIZJ = value;
        }
        C45201Hob c45201Hob = (C45201Hob) aqS2S2400000_7.l4;
        C44716Hgm c44716Hgm2 = c45201Hob.LJI;
        if (c44716Hgm2 != null) {
            c44716Hgm2.LJIIIZ = autoCutThemeData.templateId;
            c44716Hgm2.LJIIJJI = autoCutThemeData.templateGroupId;
        }
        C45203Hod c45203Hod = (C45203Hod) aqS2S2400000_7.l3;
        if (!c45203Hod.LIZIZ && !c45203Hod.LIZJ) {
            c45201Hob.LJIIL(c45203Hod.LJIILJJIL);
        } else {
            if (C78685UuP.LJJJZ(aqS2S2400000_7.s0) || LLJZIJLIL == EnumC43998HOo.DESIGNER_FIXED_TEMPLATE || LLJZIJLIL == EnumC43998HOo.ALGORITHM_TEMPLATE || LLJZIJLIL == EnumC43998HOo.SOUND_SYNC_TEMPLATE || LLJZIJLIL == EnumC43998HOo.AUTOCUT_TEMPLATE) {
                enumC45070HmU = EnumC45070HmU.TEMPLATE_MUSIC;
            } else {
                enumC45070HmU = EnumC45070HmU.TEMPLATE_CC;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("templateType = ");
            LIZ.append(LLJZIJLIL);
            LIZ.append(", requestType = ");
            LIZ.append(enumC45070HmU);
            H78.LIZIZ("dxy", X1D.LIZIZ(LIZ));
            EnumC45070HmU enumC45070HmU3 = EnumC45070HmU.TEMPLATE_MUSIC;
            if (enumC45070HmU != enumC45070HmU3) {
                ((C45203Hod) aqS2S2400000_7.l3).LIZJ = false;
            }
            OSZ LJJIJIIJIL = C45087Hml.LJJIJIIJIL(autoCutThemeData);
            AVMusic aVMusic = (AVMusic) LJJIJIIJIL.getFirst();
            String str2 = (String) LJJIJIIJIL.getSecond();
            if (((C45203Hod) aqS2S2400000_7.l3).LIZIZ) {
                C45201Hob c45201Hob2 = (C45201Hob) aqS2S2400000_7.l4;
                String str3 = "";
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
                String str4 = autoCutThemeData.templateId;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = autoCutThemeData.templateGroupId;
                if (str5 == null) {
                    str5 = "";
                }
                if (LLJZIJLIL == null) {
                    LLJZIJLIL = EnumC43998HOo.DESIGNER_FIXED_TEMPLATE;
                }
                int value2 = LLJZIJLIL.getValue();
                String str6 = autoCutThemeData.templateUrl;
                if (str6 != null) {
                    str3 = str6;
                }
                String str7 = autoCutThemeData.templateData;
                C45203Hod c45203Hod2 = (C45203Hod) aqS2S2400000_7.l3;
                enumC45070HmU2 = enumC45070HmU;
                c45201Hob2.LJIILIIL(taskId, str, str4, str5, value2, str3, str7, enumC45070HmU2, c45203Hod2.LJII, autoCutThemeData.preloadUrsSet, c45203Hod2.LJIIL, c45203Hod2.LJIILIIL, c45203Hod2.LJIILJJIL);
            } else {
                enumC45070HmU2 = enumC45070HmU;
            }
            C45203Hod c45203Hod3 = (C45203Hod) aqS2S2400000_7.l3;
            if (c45203Hod3.LIZJ) {
                if (c45203Hod3.LJIIJJI) {
                    AVMusic aVMusic2 = (AVMusic) aqS2S2400000_7.l5;
                    if (aVMusic2 != null) {
                        ((C45201Hob) aqS2S2400000_7.l4).LJII(aVMusic2, c45203Hod3.LJIILJJIL);
                    } else if (C78685UuP.LJJJZ(aqS2S2400000_7.s1)) {
                        ((C45201Hob) aqS2S2400000_7.l4).LJIILLIIL(aqS2S2400000_7.s1, ((C45203Hod) aqS2S2400000_7.l3).LJIILJJIL);
                    }
                } else if (enumC45070HmU2 == enumC45070HmU3) {
                    if (aVMusic != null) {
                        ((C45201Hob) aqS2S2400000_7.l4).LJII(aVMusic, c45203Hod3.LJIILJJIL);
                    } else if (str2 != null) {
                        ((C45201Hob) aqS2S2400000_7.l4).LJIILLIIL(str2, c45203Hod3.LJIILJJIL);
                    } else {
                        AbstractC45196HoW.LJIIJ((C45201Hob) aqS2S2400000_7.l4, 1009, null, null, null, 14);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S2400000_7(AutoCutThemeData autoCutThemeData, C45203Hod c45203Hod, C45201Hob c45201Hob, String str, AVMusic aVMusic, String str2, int i) {
        super(2);
        this.$t = i;
        this.l2 = autoCutThemeData;
        this.l3 = c45203Hod;
        this.l4 = c45201Hob;
        this.s0 = str;
        this.l5 = aVMusic;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S2400000_7(AutoCutThemeData autoCutThemeData, C45205Hof c45205Hof, C45199HoZ c45199HoZ, String str, AVMusic aVMusic, String str2, int i) {
        super(2);
        this.$t = i;
        this.l2 = autoCutThemeData;
        this.l3 = c45205Hof;
        this.l4 = c45199HoZ;
        this.s0 = str;
        this.l5 = aVMusic;
        this.s1 = str2;
    }
}
