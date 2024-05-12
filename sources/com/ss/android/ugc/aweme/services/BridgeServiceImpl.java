package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C27740Aue;
import X.C2U8;
import X.C40406FtS;
import X.C61182ag;
import X.C78472Uqy;
import X.InterfaceC59605NaL;
import X.LRU;
import X.OP0;
import X.X1D;
import X.YFI;
import X.YFN;
import X.Z8A;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.bullet.ab.BulletFragmentABHelper;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BridgeServiceImpl implements YFN {
    public static final int $stable = 0;

    @Override // X.YFN
    public void checkToTransformMusDraft() {
    }

    public Fragment createUserProfileEditFragment() {
        return null;
    }

    @Override // X.YFN
    public AmeBaseFragment createMyProfileFragment() {
        return Z8A.LIZIZ.getI18nMyProfileFragmentV2();
    }

    public AmeBaseFragment createUserProfileFragment() {
        return Z8A.LIZIZ.getI18nUserProfileFragmentV2();
    }

    @Override // X.YFN
    public InterfaceC59605NaL getBulletABHelper() {
        return (BulletFragmentABHelper) BulletFragmentABHelper.LIZIZ.getValue();
    }

    @Override // X.YFN
    public void onFeedStop() {
        C40406FtS.LIZ.LIZIZ = false;
    }

    @Override // X.YFN
    public boolean needShowSafeInfoNotice() {
        return LRU.LIZIZ();
    }

    public void openWallet(Activity activity) {
        o.LJIIIZ(activity, "activity");
        C78472Uqy.LIZIZ(activity);
    }

    @Override // X.YFN
    public void postSafeInfoNoticeEvent(boolean z) {
        C2U8.LIZ(new C61182ag(z));
    }

    public void setCustomStatusBarInLayout(Activity activity) {
        C27740Aue.LJIIIIZZ(activity);
        C27740Aue.LJII(activity);
    }

    public void switchToSignature(Activity activity) {
        Z8A.LIZIZ.startProfileEditActivity(activity, null);
    }

    public void enterMyFavorites(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(bundle, "bundle");
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//favorite");
        buildRoute.withParam(bundle);
        buildRoute.open();
    }

    @Override // X.YFN
    public void switchToBioUrl(Activity activity, String str) {
        Z8A.LIZIZ.startProfileEditBioUrlActivity(activity, str);
    }

    @Override // X.YFN
    public void startThirdSocialActivity(Context context, OP0 idProvider, int i) {
        String LIZIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(idProvider, "idProvider");
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || (LIZIZ = idProvider.LIZIZ()) == null || LIZIZ.isEmpty()) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("twitter://user?id=");
                LIZ.append(LIZIZ);
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ)));
                intent.setPackage("com.twitter.android");
                Intent intent2 = new Intent(context, (Class<?>) CrossPlatformActivity.class);
                intent2.putExtra("title", context.getString(R.string.t6u));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("https://twitter.com/intent/user?user_id=");
                LIZ2.append(LIZIZ);
                intent2.setData(UriProtector.parse(X1D.LIZIZ(LIZ2)));
                if (intent.resolveActivity(context.getPackageManager()) == null) {
                    intent.putExtra("pns.sandbox.dataflow_id", 1207960066);
                    C16880lQ.LIZJ(context, intent2);
                    return;
                } else {
                    try {
                        C16880lQ.LIZJ(context, intent);
                        return;
                    } catch (ActivityNotFoundException unused) {
                        C16880lQ.LIZJ(context, intent2);
                        return;
                    }
                }
            }
            String LIZ3 = idProvider.LIZ();
            if (LIZ3 == null || LIZ3.isEmpty()) {
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("https://www.youtube.com/channel/");
            LIZ4.append(LIZ3);
            Uri parse = UriProtector.parse(X1D.LIZIZ(LIZ4));
            Intent intent3 = new Intent("android.intent.action.VIEW", parse);
            intent3.setPackage("com.google.android.youtube");
            Intent intent4 = new Intent(context, (Class<?>) CrossPlatformActivity.class);
            intent4.putExtra("title", context.getString(R.string.tyd));
            intent4.setData(parse);
            if (intent3.resolveActivity(context.getPackageManager()) == null) {
                intent3.putExtra("pns.sandbox.dataflow_id", 1207964673);
                C16880lQ.LIZJ(context, intent4);
                return;
            } else {
                try {
                    C16880lQ.LIZJ(context, intent3);
                    return;
                } catch (ActivityNotFoundException unused2) {
                    C16880lQ.LIZJ(context, intent4);
                    return;
                }
            }
        }
        String LIZJ = idProvider.LIZJ();
        if (LIZJ == null || LIZJ.isEmpty()) {
            return;
        }
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("instagram://user?username=");
        LIZ5.append(LIZJ);
        Intent intent5 = new Intent("android.intent.action.VIEW", UriProtector.parse(X1D.LIZIZ(LIZ5)));
        intent5.setPackage("com.instagram.android");
        Intent intent6 = new Intent(context, (Class<?>) CrossPlatformActivity.class);
        intent6.putExtra("title", context.getString(R.string.hhy));
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("https://instagram.com/_u/");
        LIZ6.append(LIZJ);
        intent6.setData(UriProtector.parse(X1D.LIZIZ(LIZ6)));
        if (intent5.resolveActivity(context.getPackageManager()) == null) {
            intent5.putExtra("pns.sandbox.dataflow_id", 1207959812);
            C16880lQ.LIZJ(context, intent6);
        } else {
            try {
                C16880lQ.LIZJ(context, intent5);
            } catch (ActivityNotFoundException unused3) {
                C16880lQ.LIZJ(context, intent6);
            }
        }
    }

    @Override // X.YFN
    public YFI createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return Z8A.LIZIZ.getMTAwemeListFragment(i, i2, str, str2, z, z2, z4, new Bundle());
    }
}
