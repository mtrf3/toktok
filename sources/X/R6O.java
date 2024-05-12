package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.privateaccount.QuitBaAccountProcessor;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.zhiliaoapp.musically.R;

/* loaded from: classes12.dex */
public final class R6O implements R47 {
    public final /* synthetic */ QuitBaAccountProcessor LIZ;
    public final /* synthetic */ DialogInterface LIZIZ;

    public R6O(QuitBaAccountProcessor quitBaAccountProcessor, C26231ARf c26231ARf) {
        this.LIZ = quitBaAccountProcessor;
        this.LIZIZ = c26231ARf;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i == 14 && i2 == 1) {
            C71945SLl.LJ().LJFF().queryUser();
            this.LIZ.LIZIZ.LIZ(R.string.pbk);
            C2U8.LIZ(new IEvent() { // from class: X.9NC
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
        } else {
            this.LIZ.LIZIZ.LIZ(R.string.imh);
        }
        DialogInterface dialogInterface = this.LIZIZ;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }
}
