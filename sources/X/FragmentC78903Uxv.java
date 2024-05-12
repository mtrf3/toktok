package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;

/* renamed from: X.Uxv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class FragmentC78903Uxv extends Fragment {
    public static final /* synthetic */ int LJLJI = 0;
    public final C0MB<C78909Uy1> LJLIL = new C0MB<>();
    public final C0MB<C78909Uy1> LJLILLLLZI = new C0MB<>();

    public static Intent LIZ(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("package:");
        LIZ.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ)));
    }

    public static boolean LIZJ(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (!TextUtils.isEmpty(str) && context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(C78909Uy1 c78909Uy1, int i) {
        try {
            if (LIZJ(getActivity(), LIZ(getActivity()))) {
                Intent LIZ = LIZ(getActivity());
                C78598Ut0.LJIJJ(LIZ, this);
                startActivityForResult(LIZ, i);
                this.LJLILLLLZI.LJI(i, c78909Uy1);
            } else {
                try {
                    try {
                        getActivity();
                        Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
                        C78598Ut0.LJIJJ(intent, this);
                        startActivityForResult(intent, i);
                        this.LJLILLLLZI.LJI(i, c78909Uy1);
                    } catch (Exception unused) {
                        C0NB.LJ("PermissionFragment", "go to origin setting error");
                    }
                } catch (Exception unused2) {
                    C0NB.LJ("PermissionFragment", "go to origin setting error");
                    C0NB.LJ("PermissionFragment", "go to app info error");
                }
            }
        } catch (Exception unused3) {
            getActivity();
            Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
            C78598Ut0.LJIJJ(intent2, this);
            startActivityForResult(intent2, i);
            this.LJLILLLLZI.LJI(i, c78909Uy1);
            C0NB.LJ("PermissionFragment", "go to app info error");
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C78909Uy1 LJ = this.LJLILLLLZI.LJ(i, null);
        this.LJLILLLLZI.LJII(i);
        if (LJ != null && C76944UHs.LIZIZ(getActivity(), LJ.LIZ)) {
            LJ.LIZIZ(true);
        }
    }

    @Override // android.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C012403c.LJ("onRequestPermissionsResult: requestCode = ", i, "PermissionFragment");
        super.onRequestPermissionsResult(i, strArr, iArr);
        C78909Uy1 LJ = this.LJLIL.LJ(i, null);
        this.LJLIL.LJII(i);
        if (LJ != null) {
            if (C76944UHs.LIZLLL(getActivity(), strArr, iArr)) {
                LJ.LIZIZ(true);
                return;
            }
            if (C76944UHs.LIZJ(getActivity(), strArr)) {
                LJ.LIZ();
                LJ.LIZJ.LJ("DENY_FROM_REQUEST_RESULT_SHOW_NEXT_TIME", LJ.LIZ);
                return;
            }
            if (!LIZJ(getActivity(), C40221FqT.LIZ.LIZIZ(getActivity())) && !LIZJ(getActivity(), LIZ(getActivity()))) {
                Activity activity = getActivity();
                getActivity();
                if (!LIZJ(activity, new Intent("android.settings.APPLICATION_SETTINGS"))) {
                    C0NB.LIZIZ("PermissionFragment", "afterPermissionRequest: AppSettingIntent is not avaliable.");
                    LJ.LIZ();
                    LJ.LIZJ.LJ("DENY_FROM_REQUEST_RESULT_ERROR", LJ.LIZ);
                    return;
                }
            }
            LJ.LIZIZ = C76944UHs.LIZ(getActivity(), LJ.LIZ);
            C78905Uxx c78905Uxx = new C78905Uxx(this, LJ);
            Activity activity2 = getActivity();
            C78900Uxs.LIZ.getClass();
            LJ.LIZLLL.LIZ(activity2, c78905Uxx, LJ.LIZ);
        }
    }
}
