package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xdl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85297Xdl extends AbstractC61103NyV {
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ ActivityC45651qj LIZLLL;
    public final /* synthetic */ C85258Xd8 LJ;
    public final /* synthetic */ C68322mC<C73912vD> LJFF;
    public final /* synthetic */ C72242sW LJI;
    public final /* synthetic */ boolean LJII;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, X.2vD, android.view.View] */
    @Override // X.AbstractC61103NyV
    public final void LIZIZ(C61101NyT c61101NyT, C164906da... permissionsStatus) {
        List<PopupSceneV2> list;
        PopupSceneV2 LJJIJIIJIL;
        String str;
        String str2;
        o.LJIIIZ(permissionsStatus, "permissionsStatus");
        C85302Xdq c85302Xdq = new C85302Xdq(c61101NyT, this.LJI, this.LJII, this.LJ);
        C85296Xdk c85296Xdk = C85296Xdk.LIZ;
        String str3 = this.LIZIZ;
        String str4 = this.LIZJ;
        c85296Xdk.getClass();
        String str5 = null;
        if (C85296Xdk.LJ(str3, str4)) {
            long currentTimeMillis = System.currentTimeMillis();
            C26227ARb LIZ = C3AW.LIZ(this.LIZLLL);
            LIZ.LJFF(this.LIZLLL.getResources().getString(R.string.sdt));
            LIZ.LIZIZ(C85296Xdk.LIZJ(this.LIZIZ, this.LIZJ));
            LIZ.LJII = false;
            C77123UOp.LJIILL(LIZ, new C85304Xds(this.LIZLLL, currentTimeMillis, this.LJ, c85302Xdq));
            LIZ.LJI().LIZLLL();
            C85258Xd8 c85258Xd8 = this.LJ;
            if (c85258Xd8 != null) {
                str = c85258Xd8.LIZJ;
                str2 = c85258Xd8.LIZ;
                str5 = c85258Xd8.LIZIZ;
            } else {
                str = null;
                str2 = null;
            }
            long j = C35908E7k.LIZIZ().getLong("guided_location_permission_show_ts", 0L);
            long currentTimeMillis2 = System.currentTimeMillis();
            C35908E7k.LIZIZ().storeInt("guided_location_permission_show_count", C35908E7k.LIZIZ().getInt("guided_location_permission_show_count", 0) + 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("previous_page", str);
            }
            if (str2 != null) {
                linkedHashMap.put("enter_from", str2);
            }
            if (str5 != null) {
                linkedHashMap.put("enter_method", str5);
            }
            linkedHashMap.put("show_index", String.valueOf(C35908E7k.LIZIZ().getInt("guided_location_permission_show_count", 0) - 1));
            if (j > 0) {
                linkedHashMap.put("time_int", String.valueOf((currentTimeMillis2 - j) / 86400000));
            } else {
                linkedHashMap.put("time_int", "-1");
            }
            FMX.LJIIL("guided_location_permission_show", linkedHashMap);
            C85299Xdn.LIZJ();
            C35908E7k.LIZIZ().storeLong("guided_location_permission_show_ts", System.currentTimeMillis());
            return;
        }
        c85302Xdq.invoke();
        String str6 = this.LIZIZ;
        String str7 = this.LIZJ;
        Config LIZ2 = C85296Xdk.LIZ(str6);
        if (LIZ2 == null || (list = LIZ2.popupSceneV2) == null || (LJJIJIIJIL = C78866UxK.LJJIJIIJIL(str7, list)) == null || LJJIJIIJIL.popupUIType != EnumC78452Uqe.HINT.getType() || C85296Xdk.LJI(LIZ2)) {
            return;
        }
        String LIZJ = C85296Xdk.LIZJ(this.LIZIZ, this.LIZJ);
        if (TextUtils.isEmpty(LIZJ)) {
            LIZJ = this.LIZLLL.getString(R.string.p0n);
        }
        String permissionPopupHintViewTitle = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).getPermissionPopupHintViewTitle(this.LIZLLL);
        C68322mC<C73912vD> c68322mC = this.LJFF;
        ActivityC45651qj activity = this.LIZLLL;
        o.LJIIIZ(activity, "activity");
        if (permissionPopupHintViewTitle == null) {
            permissionPopupHintViewTitle = "";
        }
        if (LIZJ == null) {
            LIZJ = "";
        }
        ?? c73912vD = new C73912vD(activity);
        c73912vD.LJLILLLLZI.setText(permissionPopupHintViewTitle);
        c73912vD.LJLIL.setText(LIZJ);
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null) {
            View decorView = activity.getWindow().getDecorView();
            o.LJII(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView((View) c73912vD, new ViewGroup.LayoutParams(-1, -1));
        }
        c68322mC.element = c73912vD;
    }

    public C85297Xdl(String str, String str2, ActivityC45651qj activityC45651qj, C85258Xd8 c85258Xd8, C68322mC<C73912vD> c68322mC, C72242sW c72242sW, boolean z) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = activityC45651qj;
        this.LJ = c85258Xd8;
        this.LJFF = c68322mC;
        this.LJI = c72242sW;
        this.LJII = z;
    }
}
