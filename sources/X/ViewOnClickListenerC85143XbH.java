package X;

import android.view.View;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationMethodItemCell;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XbH, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC85143XbH implements View.OnClickListener {
    public final /* synthetic */ TwoStepVerificationMethodItemCell LJLIL;
    public final /* synthetic */ C85165Xbd LJLILLLLZI;

    public ViewOnClickListenerC85143XbH(TwoStepVerificationMethodItemCell twoStepVerificationMethodItemCell, C85165Xbd c85165Xbd) {
        this.LJLIL = twoStepVerificationMethodItemCell;
        this.LJLILLLLZI = c85165Xbd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) this.LJLIL.LJLILLLLZI.getValue();
        EnumC85151XbP methodType = this.LJLILLLLZI.LJLIL.LIZJ;
        o.LJIIIZ(methodType, "methodType");
        C85136XbA c85136XbA = (C85136XbA) ((LinkedHashMap) twoStepVerificationActivityViewModel.LJLJJL).get(methodType);
        if (c85136XbA != null && c85136XbA.LJFF) {
            if (c85136XbA.LIZIZ) {
                java.util.Map<EnumC85151XbP, C85136XbA> map = twoStepVerificationActivityViewModel.LJLJJL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (((C85136XbA) entry.getValue()).LIZIZ) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap.size() > 2) {
                    twoStepVerificationActivityViewModel.setStateImmediate(new AqS181S0100000_15(c85136XbA, 286));
                    return;
                } else {
                    twoStepVerificationActivityViewModel.setStateImmediate(new AqS181S0100000_15(c85136XbA, 287));
                    return;
                }
            }
            C85144XbI.LJJI("add_back_up_method", twoStepVerificationActivityViewModel.getEnterFrom());
            twoStepVerificationActivityViewModel.Ev0(methodType, true);
        }
    }
}
