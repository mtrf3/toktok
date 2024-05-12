package com.ss.android.ugc.aweme.relation.mutual;

import X.ASL;
import X.ActivityC45651qj;
import X.C1DG;
import X.C58096Mr6;
import X.C63081OpJ;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MutualRelationServiceImpl implements IMutualRelationService {
    public static IMutualRelationService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IMutualRelationService.class, false);
        if (LIZ != null) {
            return (IMutualRelationService) LIZ;
        }
        if (C58096Mr6.v4 == null) {
            synchronized (IMutualRelationService.class) {
                if (C58096Mr6.v4 == null) {
                    C58096Mr6.v4 = new MutualRelationServiceImpl();
                }
            }
        }
        return C58096Mr6.v4;
    }

    @Override // com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService
    public final MutualRelationFragment LIZ() {
        return new MutualRelationFragment();
    }

    @Override // com.ss.android.ugc.aweme.relation.mutual.IMutualRelationService
    public final void LIZIZ(ActivityC45651qj fragmentActivity, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        MutualRelationSheetFragment mutualRelationSheetFragment = new MutualRelationSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("mutual_relation_user_list", arrayList);
        bundle.putStringArrayList("mutual_relation_sec_user_list", arrayList2);
        bundle.putInt("mutual_relation_total_user_num", i);
        mutualRelationSheetFragment.setArguments(bundle);
        ASL asl = new ASL();
        asl.LIZ.LJLLILLLL = mutualRelationSheetFragment;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(fragmentActivity) * 0.5d);
        tuxSheet.LJLLJ = true;
        tuxSheet.LJZI = true;
        tuxSheet.LJZL = true;
        tuxSheet.LLD = true;
        tuxSheet.LJLJI = true;
        tuxSheet.LL = true;
        C1DG.LJII(fragmentActivity, "fragmentActivity.supportFragmentManager", tuxSheet, "MutualRelationSheetFragment");
    }
}
