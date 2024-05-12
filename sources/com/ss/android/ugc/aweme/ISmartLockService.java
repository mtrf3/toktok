package com.ss.android.ugc.aweme;

import X.MLL;
import X.R5V;
import X.R5X;
import X.R5Y;
import android.app.Activity;
import android.content.Context;

/* loaded from: classes7.dex */
public interface ISmartLockService {
    void checkCredential(R5V r5v);

    void deleteCredential(String str, R5X r5x);

    boolean isLoginSuccessBySmartLock();

    void loadCredentials(Activity activity, boolean z, R5X r5x);

    boolean shouldShowOnFyp();

    boolean shouldShowOnInbox();

    boolean shouldShowOnProfile();

    void smartLockAccountLogin(Activity activity, MLL mll, long j, String str, boolean z, R5Y r5y);

    void smartLockTipMaskDismiss();

    void smartLockTipMaskShow(Context context, String str);

    void tryShowAuthorityDialog(Activity activity, MLL mll, int i, R5X r5x);
}
