package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Locale;

/* renamed from: X.Uxw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class FragmentC78904Uxw extends Fragment {
    public static final /* synthetic */ int LJLJI = 0;
    public final C0MB<C78907Uxz> LJLIL = new C0MB<>();
    public final C0MB<C78907Uxz> LJLILLLLZI = new C0MB<>();

    public static Intent LIZ(Context context) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("package:");
        LIZ.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ)));
    }

    public static boolean LIZJ(Context context, Intent intent) {
        ActivityInfo activityInfo;
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null || activityInfo.name.toLowerCase(Locale.ROOT).contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (!TextUtils.isEmpty(str) && context.checkCallingOrSelfPermission(str) != 0) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(C78907Uxz c78907Uxz, int i) {
        try {
            try {
                Activity activity = c78907Uxz.LIZ;
                if (LIZJ(activity, LIZ(activity))) {
                    Intent LIZ = LIZ(c78907Uxz.LIZ);
                    C78598Ut0.LJIJJ(LIZ, this);
                    startActivityForResult(LIZ, i);
                    this.LJLILLLLZI.LJI(i, c78907Uxz);
                } else {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
                        C78598Ut0.LJIJJ(intent, this);
                        startActivityForResult(intent, i);
                        this.LJLILLLLZI.LJI(i, c78907Uxz);
                    } catch (Exception unused) {
                        C0NB.LJ("PermissionFragment", "go to origin setting error");
                    }
                }
            } catch (Exception unused2) {
                C0NB.LJ("PermissionFragment", "go to origin setting error");
                C0NB.LJ("PermissionFragment", "go to app info error");
            }
        } catch (Exception unused3) {
            Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
            C78598Ut0.LJIJJ(intent2, this);
            startActivityForResult(intent2, i);
            this.LJLILLLLZI.LJI(i, c78907Uxz);
            C0NB.LJ("PermissionFragment", "go to app info error");
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C78907Uxz LJ = this.LJLILLLLZI.LJ(i, null);
        this.LJLILLLLZI.LJII(i);
        if (LJ != null && C76944UHs.LIZIZ(getActivity(), LJ.LIZJ)) {
            LJ.LIZIZ(true);
        }
    }
}
