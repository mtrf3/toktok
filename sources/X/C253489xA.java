package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.BottomSheetOption;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS108S0300000_4;

/* renamed from: X.9xA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253489xA extends AbstractC253439x5 {
    @Override // X.AbstractC253439x5
    public final void LIZ(android.net.Uri uri) {
        FragmentManager supportFragmentManager;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        String queryParameter = UriProtector.getQueryParameter(uri, "title");
        if (queryParameter != null) {
            c245319jz.LJII(queryParameter);
        }
        String queryParameter2 = UriProtector.getQueryParameter(uri, "options");
        if (queryParameter2 != null) {
            try {
                BottomSheetOption[] bottomSheetOptionArr = (BottomSheetOption[]) new Gson().LJI(queryParameter2, BottomSheetOption[].class);
                if (bottomSheetOptionArr != null) {
                    ArrayList arrayList = new ArrayList();
                    for (BottomSheetOption bottomSheetOption : bottomSheetOptionArr) {
                        C252669vq c252669vq = new C252669vq();
                        c252669vq.LIZIZ(bottomSheetOption.optionContent);
                        c252669vq.LIZJ = bottomSheetOption.optionStyle.getValue();
                        c252669vq.LJ = new ACListenerS21S0100000_1(new AqS108S0300000_4(this, bottomSheetOption, LJIIIIZZ, 40), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                        arrayList.add(c252669vq);
                    }
                    c245319jz.LJFF(arrayList);
                } else {
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJIIIIZZ.getComponentName().flattenToShortString());
            LIZ.append("_hydrogen_bottom_sheet");
            LIZJ.show(supportFragmentManager, X1D.LIZIZ(LIZ));
        }
    }
}
