package com.ss.android.ugc.aweme.aigc;

import X.ActivityC45651qj;
import X.C72116SSa;
import X.C72151STj;
import X.C72152STk;
import X.C72153STl;
import X.EnumC244439iZ;
import X.ST8;
import X.STG;
import X.STO;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public interface IAIGCAvatarService {
    C72152STk LIZ(String str);

    int LIZIZ();

    void LIZJ(EnumC244439iZ enumC244439iZ, STO sto);

    void LIZLLL(EnumC244439iZ enumC244439iZ, STO sto);

    int LJ();

    ST8 LJFF(EnumC244439iZ enumC244439iZ);

    void LJI(EnumC244439iZ enumC244439iZ, ActivityC45651qj activityC45651qj, Integer num, Integer num2, boolean z, String str, String str2);

    List<AIGCQuota> LJII();

    void LJIIIIZZ(ActivityC45651qj activityC45651qj, AqS143S0200000_12 aqS143S0200000_12);

    C72151STj LJIIIZ(EnumC244439iZ enumC244439iZ, JSONArray jSONArray, JSONArray jSONArray2, STG stg);

    C72151STj LJIIJ(EnumC244439iZ enumC244439iZ, String str, STG stg);

    void LJIIJJI(ActivityC45651qj activityC45651qj, C72116SSa c72116SSa, List list);

    boolean LJIIL(EnumC244439iZ enumC244439iZ, String str);

    C72153STl LJIILIIL(JSONArray jSONArray);

    void LJIILJJIL(ActivityC45651qj activityC45651qj, EnumC244439iZ enumC244439iZ, String str, String str2, boolean z);

    List<AIGCStyle> getAIGCStyles();
}
