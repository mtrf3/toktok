package X;

import android.widget.CompoundButton;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationMethodItemCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.XbF, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85141XbF implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ TwoStepVerificationMethodItemCell LJLIL;
    public final /* synthetic */ C85165Xbd LJLILLLLZI;

    public C85141XbF(TwoStepVerificationMethodItemCell twoStepVerificationMethodItemCell, C85165Xbd c85165Xbd) {
        this.LJLIL = twoStepVerificationMethodItemCell;
        this.LJLILLLLZI = c85165Xbd;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C85136XbA c85136XbA;
        TwoStepVerificationMethodItemCell twoStepVerificationMethodItemCell = this.LJLIL;
        EnumC85151XbP methodType = this.LJLILLLLZI.LJLIL.LIZJ;
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) twoStepVerificationMethodItemCell.LJLILLLLZI.getValue();
        o.LJIIIZ(methodType, "methodType");
        LinkedHashMap linkedHashMap = (LinkedHashMap) twoStepVerificationActivityViewModel.LJLJJL;
        C85136XbA c85136XbA2 = (C85136XbA) linkedHashMap.get(methodType);
        if (c85136XbA2 != null) {
            c85136XbA = C85136XbA.LIZ(c85136XbA2, false, false, null, z, false, 47);
        } else {
            c85136XbA = new C85136XbA(false, false, methodType, null, z, false, 43);
        }
        linkedHashMap.put(methodType, c85136XbA);
        twoStepVerificationActivityViewModel.setState(new C85142XbG(twoStepVerificationActivityViewModel));
    }
}
