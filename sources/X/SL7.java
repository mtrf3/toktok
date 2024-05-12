package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.addyours.AddYoursProfileEntryViewModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final class SL7 extends SLJ {
    public final AddYoursProfileEntryViewModel LJLL;

    public SL7(AddYoursProfileEntryViewModel addYoursProfileEntryViewModel, Context context) {
        super(context);
        this.LJLL = addYoursProfileEntryViewModel;
        LJLLLLLL(new SKP(C226388uY.LIZJ(R.string.beu, R.string.bev)));
        SL3 sl3 = new SL3();
        sl3.LJIILLIIL = 1;
        sl3.LJIIZILJ = 0;
        sl3.LJ(addYoursProfileEntryViewModel);
        sl3.LJIIIIZZ = new SL8(this);
        AbstractC71913SKf.LIZJ(sl3, R.string.bcv);
        sl3.LJ = Integer.valueOf(R.string.bcu);
        LJLLLLLL(sl3.LIZ());
        LJLLLLLL(new SKT(addYoursProfileEntryViewModel.LJLJI));
    }
}
