package Y;

import X.ActivityC45651qj;
import X.C45804HyK;
import X.C50652JuK;
import X.C51323KCh;
import X.InterfaceC65784Pro;
import X.JTO;
import X.KB1;
import X.M78;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.search.common.viewmodel.KeyboardModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.ShowSearchRSReportPanelMethod;

/* loaded from: classes9.dex */
public class IDDListenerS147S0100000_8 implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                return;
            case 1:
                onDismiss$1(this, dialogInterface);
                return;
            case 2:
                onDismiss$2(this, dialogInterface);
                return;
            case 3:
                onDismiss$3(this, dialogInterface);
                return;
            case 4:
                onDismiss$4(this, dialogInterface);
                return;
            case 5:
                onDismiss$5(this, dialogInterface);
                return;
            default:
                return;
        }
    }

    public IDDListenerS147S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(IDDListenerS147S0100000_8 iDDListenerS147S0100000_8, DialogInterface dialogInterface) {
        KeyboardModel keyboardModel;
        C51323KCh c51323KCh = (C51323KCh) iDDListenerS147S0100000_8.l0;
        if ((C50652JuK.fetchOwnImmutableData(c51323KCh.LJLJLLL) == null || !KB1.LJII(KB1.LIZ(JTO.LIZ(c51323KCh.LJLJLLL).LJLIL))) && (keyboardModel = c51323KCh.LJLJJL) != null) {
            ((LiveData) keyboardModel.LJLIL.getValue()).setValue(1);
        }
    }

    public static final void onDismiss$1(IDDListenerS147S0100000_8 iDDListenerS147S0100000_8, DialogInterface dialogInterface) {
        ActivityC45651qj activityC45651qj = ((ShowSearchRSReportPanelMethod) iDDListenerS147S0100000_8.l0).LJLIL;
        if (activityC45651qj != null) {
            ((SearchStateViewModel) ViewModelProviders.of(activityC45651qj).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(false);
        }
    }

    public static final void onDismiss$2(IDDListenerS147S0100000_8 iDDListenerS147S0100000_8, DialogInterface dialogInterface) {
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Context) iDDListenerS147S0100000_8.l0);
        if (LJJIFFI != null) {
            ((SearchStateViewModel) ViewModelProviders.of(LJJIFFI).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(false);
        }
    }

    public static final void onDismiss$3(IDDListenerS147S0100000_8 iDDListenerS147S0100000_8, DialogInterface dialogInterface) {
        ((InterfaceC65784Pro) iDDListenerS147S0100000_8.l0).invoke();
    }

    public static final void onDismiss$4(IDDListenerS147S0100000_8 iDDListenerS147S0100000_8, DialogInterface dialogInterface) {
        ((M78) iDDListenerS147S0100000_8.l0).LIZ();
    }

    public static final void onDismiss$5(IDDListenerS147S0100000_8 iDDListenerS147S0100000_8, DialogInterface dialogInterface) {
        ((SearchStateViewModel) iDDListenerS147S0100000_8.l0).setShowingFilters(false);
    }
}
