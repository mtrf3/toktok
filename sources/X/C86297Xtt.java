package X;

import android.app.Activity;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend;
import com.bytedance.sdk.xbridge.runtime.depend.OnPermissionGrantCallback;
import com.ss.android.ugc.aweme.utils.permission.PermissionViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xtt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86297Xtt implements IHostPermissionDepend {
    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend
    public final boolean hasPermission(Activity activity, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(str, OHQ.LIZ);
        if (C04330Ez.LIZ(activity, str) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend
    public final void requestPermission(Activity activity, OnPermissionGrantCallback callback, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(str, OHQ.LIZ);
        C86299Xtv c86299Xtv = new C86299Xtv(callback);
        String[] strArr = {str};
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activity);
        if (LJJIFFI == null) {
            return;
        }
        PermissionViewModel permissionViewModel = (PermissionViewModel) ViewModelProviders.of(LJJIFFI).get(PermissionViewModel.class);
        C86300Xtw c86300Xtw = new C86300Xtw();
        c86300Xtw.LIZ = c86299Xtv;
        c86300Xtw.LIZIZ = 1001;
        permissionViewModel.LJLIL = c86300Xtw;
        List<String> LIZ = C86298Xtu.LIZ(activity, strArr);
        if (LIZ != null) {
            ArrayList arrayList = (ArrayList) LIZ;
            if (!arrayList.isEmpty()) {
                C1AR.LJFF(activity, (String[]) arrayList.toArray(new String[arrayList.size()]), 1001);
                return;
            }
        }
        c86299Xtv.LIZIZ();
    }
}
