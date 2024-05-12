package com.ss.android.ugc.aweme.prop.impl;

import X.C152605yq;
import X.C234529Ii;
import X.C235119Kp;
import X.C253179wf;
import X.C32I;
import X.C44384HbQ;
import X.C47261Igj;
import X.C58096Mr6;
import X.C76800UCe;
import X.C9KF;
import X.InterfaceC88472Yns;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.tools.detail.IEffectHintSelectDialog;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class EffectHintSelectDialogServiceImpl implements IEffectHintSelectDialog {
    public static IEffectHintSelectDialog LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IEffectHintSelectDialog.class, false);
        if (LIZ != null) {
            return (IEffectHintSelectDialog) LIZ;
        }
        if (C58096Mr6.g4 == null) {
            synchronized (IEffectHintSelectDialog.class) {
                if (C58096Mr6.g4 == null) {
                    C58096Mr6.g4 = new EffectHintSelectDialogServiceImpl();
                }
            }
        }
        return C58096Mr6.g4;
    }

    @Override // com.ss.android.ugc.aweme.tools.detail.IEffectHintSelectDialog
    public final void LIZ(List<EffectHintWrapper> hintList, EffectHintWrapper effectHintWrapper, FragmentManager fragmentManager, InterfaceC88472Yns<? super EffectHintWrapper, C76800UCe> interfaceC88472Yns) {
        boolean z;
        boolean z2;
        String str;
        o.LJIIIZ(hintList, "hintList");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        Iterator<EffectHintWrapper> it = hintList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                EffectHintWrapper next = it.next();
                if (effectHintWrapper != null) {
                    str = effectHintWrapper.hint;
                } else {
                    str = null;
                }
                if (o.LJ(str, next.hint)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        C253179wf[] c253179wfArr = new C253179wf[1];
        String LJJZ = C44384HbQ.LJJZ(R.string.itj);
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        c253179wfArr[0] = new C253179wf(LJJZ, z, (Object) null, 10);
        List<C253179wf> LJJIJIL = C47261Igj.LJJIJIL(c253179wfArr);
        ArrayList arrayList = new ArrayList(C32I.LJJL(hintList, 10));
        int i2 = 0;
        for (EffectHintWrapper effectHintWrapper2 : hintList) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str2 = effectHintWrapper2.hint;
                if (i2 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(new C253179wf(str2, z2, (Object) null, 10));
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        LJJIJIL.addAll(arrayList);
        C152605yq c152605yq = new C152605yq();
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        c9kf.LIZJ = C44384HbQ.LJJZ(R.string.hz);
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZIZ(new AqS154S0100000_4(c152605yq, 761));
        c235119Kp.LIZIZ(LIZJ);
        c235119Kp.LIZLLL = true;
        TuxSingleSelectionSheet tuxSingleSelectionSheet = c152605yq.LIZ;
        tuxSingleSelectionSheet.LJLLI = c235119Kp;
        tuxSingleSelectionSheet.LJLLILLLL = 0;
        tuxSingleSelectionSheet.LJLLL = LJJIJIL;
        AqS108S0300000_4 aqS108S0300000_4 = new AqS108S0300000_4(LJJIJIL, hintList, interfaceC88472Yns, 20);
        TuxSingleSelectionSheet tuxSingleSelectionSheet2 = c152605yq.LIZ;
        tuxSingleSelectionSheet2.LJLLLL = aqS108S0300000_4;
        tuxSingleSelectionSheet2.show(fragmentManager, "tag");
    }
}
