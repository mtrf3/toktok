package X;

import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AVG implements View.OnClickListener {
    public static final Keva LJLJJL = Keva.getRepo("check_multi_account_repo");
    public final WeakReference<AVH> LJLIL;
    public final SignificantUserInfo LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public boolean LJLJJI;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r2 != false) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[Catch: all -> 0x0098, TryCatch #1 {, blocks: (B:14:0x0036, B:16:0x003f, B:20:0x0053, B:22:0x005c, B:24:0x0065, B:26:0x006e, B:34:0x007d, B:36:0x0081, B:37:0x0088), top: B:13:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x0036, B:16:0x003f, B:20:0x0053, B:22:0x005c, B:24:0x0065, B:26:0x006e, B:34:0x007d, B:36:0x0081, B:37:0x0088), top: B:13:0x0036 }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            boolean r0 = r5.LJLJJI
            if (r0 == 0) goto L5
            return
        L5:
            r2 = 1
            r5.LJLJJI = r2
            com.ss.android.ugc.aweme.user.SignificantUserInfo r0 = r5.LJLILLLLZI
            java.lang.String r1 = r0.uid
            java.lang.String r0 = "-1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r4 = 0
            if (r0 != 0) goto L2e
            com.bytedance.keva.Keva r1 = X.AVG.LJLJJL
            java.lang.String r0 = "use_current_user_info"
            r1.storeBoolean(r0, r2)
        L1c:
            r5.LJLJJI = r4
            java.lang.ref.WeakReference<X.AVH> r0 = r5.LJLIL
            java.lang.Object r3 = r0.get()
            X.AVH r3 = (X.AVH) r3
            if (r3 == 0) goto Lbb
            boolean r0 = r3 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L9b
            monitor-enter(r3)
            goto L36
        L2e:
            com.bytedance.keva.Keva r1 = X.AVG.LJLJJL
            java.lang.String r0 = "use_current_user_info"
            r1.storeBoolean(r0, r4)
            goto L1c
        L36:
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            X.1qj r0 = r0.mo49getActivity()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L52
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            X.1qj r0 = r0.mo49getActivity()     // Catch: java.lang.Throwable -> L98
            kotlin.jvm.internal.o.LJI(r0)     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L50
            goto L52
        L50:
            r1 = 0
            goto L53
        L52:
            r1 = 1
        L53:
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.isRemoving()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L79
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            boolean r0 = r0.isDetached()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L79
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            android.view.View r0 = r0.getView()     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L79
            r0 = r3
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0     // Catch: java.lang.Throwable -> L98
            androidx.fragment.app.FragmentManager r0 = r0.getFragmentManager()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L78
            goto L79
        L78:
            r2 = 0
        L79:
            if (r1 == 0) goto L7d
            if (r2 != 0) goto Lba
        L7d:
            boolean r0 = r3 instanceof com.google.android.material.bottomsheet.BottomSheetDialogFragment     // Catch: java.lang.Throwable -> L98
            if (r0 == 0) goto L88
            r0 = r3
            com.google.android.material.bottomsheet.BottomSheetDialogFragment r0 = (com.google.android.material.bottomsheet.BottomSheetDialogFragment) r0     // Catch: java.lang.Throwable -> L98
            r0.dismissAllowingStateLoss()     // Catch: java.lang.Throwable -> L98
            goto Lba
        L88:
            com.bytedance.keva.Keva r1 = X.AVG.LJLJJL     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "use_current_user_info"
            boolean r0 = r1.getBoolean(r0, r4)     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L98
            r3.Sa(r0)     // Catch: java.lang.Throwable -> L98
            goto Lba
        L98:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L9b:
            X.1qj r2 = r5.LJLJI
            monitor-enter(r2)
            X.1qj r0 = r5.LJLJI     // Catch: java.lang.Throwable -> Lb7
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> Lb7
            if (r0 != 0) goto Lb5
            com.bytedance.keva.Keva r1 = X.AVG.LJLJJL     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "use_current_user_info"
            boolean r0 = r1.getBoolean(r0, r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lb7
            r3.Sa(r0)     // Catch: java.lang.Throwable -> Lb7
        Lb5:
            monitor-exit(r2)
            goto Lbb
        Lb7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        Lba:
            monitor-exit(r3)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AVG.onClick(android.view.View):void");
    }

    public AVG(WeakReference<AVH> parentDialogRef, SignificantUserInfo significantUserInfo, Context context, ActivityC45651qj fragmentActivity, AV9 metadata) {
        o.LJIIIZ(parentDialogRef, "parentDialogRef");
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(metadata, "metadata");
        this.LJLIL = parentDialogRef;
        this.LJLILLLLZI = significantUserInfo;
        this.LJLJI = fragmentActivity;
    }
}
