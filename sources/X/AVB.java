package X;

import Y.ARunnableS8S0101000_4;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class AVB implements View.OnClickListener {
    public final WeakReference<AVA> LJLIL;
    public final SignificantUserInfo LJLILLLLZI;
    public final Context LJLJI;
    public final ActivityC45651qj LJLJJI;
    public final AV9 LJLJJL;
    public final Bundle LJLJJLL;
    public boolean LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:7:0x0012, B:9:0x001b, B:13:0x002f, B:15:0x0038, B:17:0x0041, B:19:0x004a, B:26:0x0058, B:28:0x005c, B:29:0x0063), top: B:6:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0012, B:9:0x001b, B:13:0x002f, B:15:0x0038, B:17:0x0041, B:19:0x004a, B:26:0x0058, B:28:0x005c, B:29:0x0063), top: B:6:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r4 = this;
            r3 = 0
            r4.LJLJL = r3
            java.lang.ref.WeakReference<X.AVA> r0 = r4.LJLIL
            java.lang.Object r2 = r0.get()
            X.AVA r2 = (X.AVA) r2
            if (r2 == 0) goto L7e
            boolean r0 = r2 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L6a
            monitor-enter(r2)
            r0 = r2
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L67
            X.1qj r0 = r0.mo49getActivity()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L2e
            r0 = r2
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L67
            X.1qj r0 = r0.mo49getActivity()     // Catch: java.lang.Throwable -> L67
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L2c
            goto L2e
        L2c:
            r1 = 0
            goto L2f
        L2e:
            r1 = 1
        L2f:
            r0 = r2
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isRemoving()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L53
            r0 = r2
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L67
            boolean r0 = r0.isDetached()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L53
            r0 = r2
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L67
            android.view.View r0 = r0.getView()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L53
            r0 = r2
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L67
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()     // Catch: java.lang.Throwable -> L67
            if (r0 != 0) goto L54
        L53:
            r3 = 1
        L54:
            if (r1 == 0) goto L58
            if (r3 != 0) goto L7d
        L58:
            boolean r0 = r2 instanceof com.google.android.material.bottomsheet.BottomSheetDialogFragment     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L63
            r0 = r2
            com.google.android.material.bottomsheet.BottomSheetDialogFragment r0 = (com.google.android.material.bottomsheet.BottomSheetDialogFragment) r0     // Catch: java.lang.Throwable -> L67
            r0.dismissAllowingStateLoss()     // Catch: java.lang.Throwable -> L67
            goto L7d
        L63:
            r2.dismiss()     // Catch: java.lang.Throwable -> L67
            goto L7d
        L67:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L6a:
            X.1qj r1 = r4.LJLJJI
            monitor-enter(r1)
            X.1qj r0 = r4.LJLJJI     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L78
            r2.dismiss()     // Catch: java.lang.Throwable -> L7a
        L78:
            monitor-exit(r1)
            goto L7e
        L7a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L7d:
            monitor-exit(r2)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVB.LIZ():void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LJLJL) {
            return;
        }
        this.LJLJL = true;
        if (AV1.LJIIJJI()) {
            C8HX.LIZIZ("child_mode_click_switch_account", "", null);
        }
        MultiAccountService.LJ().LIZ();
        String str = this.LJLILLLLZI.uid;
        String uid = AccountService.LJIJ().LJFF().getCurUser().getUid();
        if (TextUtils.equals(uid, str)) {
            return;
        }
        if (o.LJ(this.LJLILLLLZI.uid, "-1")) {
            if (AVExternalServiceImpl.LIZ().publishService().isMainCameraPublishingOrStoryCameraPublishing()) {
                LIZ();
                C5S1 c5s1 = new C5S1(this.LJLJI);
                c5s1.LIZJ(R.string.piy);
                c5s1.LJ();
                return;
            }
            LIZ();
            if (((RBX) HG3.LJIILL()).allUidList().size() == 8) {
                String string = this.LJLJI.getString(R.string.bf2, 8);
                o.LJIIIIZZ(string, "context.getString(R.stri…count_toast, maxAccounts)");
                C5S1 c5s12 = new C5S1(this.LJLJI);
                c5s12.LIZLLL(string);
                c5s12.LJ();
                return;
            }
            a.LJIILL().LJFF(this.LJLJI, new ARunnableS8S0101000_4(8, this, 8), "add_account");
            return;
        }
        if (!AVExternalServiceImpl.LIZ().publishService().isMainCameraPublishingOrStoryCameraPublishing()) {
            a.LJIILL().LJFF(this.LJLJI, new AV8(this, uid, str), "switch_account");
            return;
        }
        LIZ();
        C5S1 c5s13 = new C5S1(this.LJLJI);
        c5s13.LIZJ(R.string.piy);
        c5s13.LJ();
    }

    public AVB(WeakReference<AVA> parentDialogRef, SignificantUserInfo significantUserInfo, Context context, ActivityC45651qj fragmentActivity, AV9 metadata, Bundle bundle) {
        o.LJIIIZ(parentDialogRef, "parentDialogRef");
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(metadata, "metadata");
        this.LJLIL = parentDialogRef;
        this.LJLILLLLZI = significantUserInfo;
        this.LJLJI = context;
        this.LJLJJI = fragmentActivity;
        this.LJLJJL = metadata;
        this.LJLJJLL = bundle;
    }
}
