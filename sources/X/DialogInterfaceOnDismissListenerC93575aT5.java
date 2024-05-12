package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aT5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class DialogInterfaceOnDismissListenerC93575aT5 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    public DialogInterfaceOnDismissListenerC93575aT5(boolean z, Fragment fragment, String str, String str2, String str3, String str4, String str5, String str6, boolean z2) {
        this.LJLIL = z;
        this.LJLILLLLZI = fragment;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = str6;
        this.LJLJLLL = z2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ActivityC45651qj activityC45651qj;
        if (!this.LJLIL) {
            C94302aeo c94302aeo = C94302aeo.LJLIL;
            DspPlatform dspPlatform = DspPlatform.UNKNOWN;
            Fragment fragment = this.LJLILLLLZI;
            String str = this.LJLJI;
            String str2 = this.LJLJJI;
            String str3 = this.LJLJJL;
            String str4 = this.LJLJJLL;
            String str5 = this.LJLJL;
            if (str5 == null) {
                str5 = "";
            }
            DspAuthParam dspAuthParam = new DspAuthParam(dspPlatform, fragment, null, str, str2, str3, str4, str5, this.LJLJLJ, this.LJLJLLL);
            Fragment fragment2 = this.LJLILLLLZI;
            if (fragment2 != null) {
                activityC45651qj = fragment2.mo49getActivity();
            } else {
                activityC45651qj = null;
            }
            C94302aeo.LIZIZ(c94302aeo, dspAuthParam, activityC45651qj, true, false, 56);
        }
    }
}
