package X;

import X.C35908E7k;
import X.C56179M3b;
import X.C85258Xd8;
import X.C85299Xdn;
import X.InterfaceC54674Ld0;
import Y.IDCListenerS166S0100000_15;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location.permission.LocationPermissionFetcher$showGotoSettingDialog$5$1;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Xdm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85298Xdm implements InterfaceC61107NyZ {
    public final /* synthetic */ C68322mC<C73912vD> LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C72242sW LIZLLL;
    public final /* synthetic */ InterfaceC54674Ld0 LJ;
    public final /* synthetic */ C85258Xd8 LJFF;
    public final /* synthetic */ InterfaceC85311Xdz LJI;
    public final /* synthetic */ J13 LJII;
    public final /* synthetic */ String LJIIIIZZ;
    public final /* synthetic */ String LJIIIZ;
    public final /* synthetic */ long LJIIJ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.ss.android.ugc.tiktok.location.permission.LocationPermissionFetcher$showGotoSettingDialog$5$1] */
    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... results) {
        Boolean bool;
        boolean z;
        List<PopupSceneV2> list;
        PopupSceneV2 LJJIJIIJIL;
        C85258Xd8 c85258Xd8;
        String str;
        String str2;
        String str3;
        String str4;
        List<PopupSceneV2> list2;
        PopupSceneV2 LJJIJIIJIL2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        o.LJIIIZ(results, "results");
        C73912vD c73912vD = this.LIZ.element;
        if (c73912vD != null) {
            Animation animation = c73912vD.LJLJI.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            Animation animation2 = c73912vD.LJLILLLLZI.getAnimation();
            if (animation2 != null) {
                animation2.cancel();
            }
            Animation animation3 = c73912vD.LJLIL.getAnimation();
            if (animation3 != null) {
                animation3.cancel();
            }
            if (c73912vD.getParent() != null) {
                ViewParent parent = c73912vD.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(c73912vD, (ViewGroup) parent);
            }
        }
        int length = results.length;
        int i = 0;
        while (true) {
            bool = null;
            if (i < length) {
                C164906da c164906da = results[i];
                if (o.LJ(c164906da.LIZ, "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = c164906da.LIZ();
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        C85300Xdo c85300Xdo = new C85300Xdo(this.LJFF, z, this.LJIIJ, this.LIZIZ);
        boolean shouldShowRequestPermissionRationale = this.LIZIZ.shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION");
        if (!this.LIZJ && !shouldShowRequestPermissionRationale) {
            long currentTimeMillis = System.currentTimeMillis() - this.LIZLLL.element;
            C53088KsW.LIZ.getClass();
            SettingsManager.LIZLLL().getClass();
            if (currentTimeMillis > SettingsManager.LJ("location_permission_click_outside_to_cancel", LiveMaxRetainAlogMessageSizeSetting.DEFAULT) && !z) {
                InterfaceC54674Ld0 interfaceC54674Ld0 = this.LJ;
                if (interfaceC54674Ld0 != null) {
                    interfaceC54674Ld0.LIZIZ(2, "click outside to dismiss system popup");
                }
                C85258Xd8 c85258Xd82 = this.LJFF;
                if (c85258Xd82 != null) {
                    str11 = c85258Xd82.LIZ;
                    str12 = c85258Xd82.LIZIZ;
                    str13 = c85258Xd82.LIZJ;
                    bool = Boolean.valueOf(c85258Xd82.LJ);
                } else {
                    str11 = null;
                    str12 = null;
                    str13 = null;
                }
                C85299Xdn.LJ(bool, str11, str12, str13);
                c85300Xdo.invoke();
                InterfaceC85311Xdz interfaceC85311Xdz = this.LJI;
                if (interfaceC85311Xdz != null) {
                    interfaceC85311Xdz.LIZJ();
                }
                this.LJII.getClass();
                J13.LIZ(1);
                return;
            }
        }
        ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).doAfterRequestPermissions(ORY.LJJZZIII(results));
        if (this.LIZJ) {
            if (z) {
                C35908E7k.LIZIZ().storeBoolean("location_permission_is_allow", true);
                InterfaceC54674Ld0 interfaceC54674Ld02 = this.LJ;
                if (interfaceC54674Ld02 != null) {
                    interfaceC54674Ld02.LIZ();
                }
                this.LJII.getClass();
                J13.LIZ(2);
            } else {
                InterfaceC54674Ld0 interfaceC54674Ld03 = this.LJ;
                if (interfaceC54674Ld03 != null) {
                    interfaceC54674Ld03.LIZJ(1);
                }
                this.LJII.getClass();
                J13.LIZ(3);
            }
            c85300Xdo.invoke();
            InterfaceC85311Xdz interfaceC85311Xdz2 = this.LJI;
            if (interfaceC85311Xdz2 != null) {
                interfaceC85311Xdz2.LIZJ();
                return;
            }
            return;
        }
        if (z) {
            C85258Xd8 c85258Xd83 = this.LJFF;
            if (c85258Xd83 != null) {
                str8 = c85258Xd83.LIZ;
                str9 = c85258Xd83.LIZIZ;
                str10 = c85258Xd83.LIZJ;
                bool = Boolean.valueOf(c85258Xd83.LJ);
            } else {
                str8 = null;
                str9 = null;
                str10 = null;
            }
            C85299Xdn.LJ(bool, str8, str9, str10);
            C35908E7k.LIZIZ().storeBoolean("location_permission_is_allow", true);
            InterfaceC54674Ld0 interfaceC54674Ld04 = this.LJ;
            if (interfaceC54674Ld04 != null) {
                interfaceC54674Ld04.LIZ();
            }
            c85300Xdo.invoke();
            InterfaceC85311Xdz interfaceC85311Xdz3 = this.LJI;
            if (interfaceC85311Xdz3 != null) {
                interfaceC85311Xdz3.LIZJ();
            }
            this.LJII.getClass();
            J13.LIZ(4);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        if (shouldShowRequestPermissionRationale) {
            C85258Xd8 c85258Xd84 = this.LJFF;
            if (c85258Xd84 != null) {
                str5 = c85258Xd84.LIZ;
                str6 = c85258Xd84.LIZIZ;
                str7 = c85258Xd84.LIZJ;
                bool = Boolean.valueOf(c85258Xd84.LJ);
            } else {
                str5 = null;
                str6 = null;
                str7 = null;
            }
            C85299Xdn.LJ(bool, str5, str6, str7);
            InterfaceC54674Ld0 interfaceC54674Ld05 = this.LJ;
            if (interfaceC54674Ld05 != null) {
                interfaceC54674Ld05.LIZJ(1);
            }
            c85300Xdo.invoke();
            InterfaceC85311Xdz interfaceC85311Xdz4 = this.LJI;
            if (interfaceC85311Xdz4 != null) {
                interfaceC85311Xdz4.LIZJ();
            }
            this.LJII.getClass();
            J13.LIZ(5);
            return;
        }
        C85296Xdk c85296Xdk = C85296Xdk.LIZ;
        String business = this.LJIIIIZZ;
        String scene = this.LJIIIZ;
        c85296Xdk.getClass();
        o.LJIIIZ(business, "business");
        o.LJIIIZ(scene, "scene");
        Config LIZ = C85296Xdk.LIZ(business);
        if (LIZ == null || (list = LIZ.popupSceneV2) == null || (LJJIJIIJIL = C78866UxK.LJJIJIIJIL(scene, list)) == null || LJJIJIIJIL.showOpenSetting != 1 || C85296Xdk.LJI(LIZ) || ((c85258Xd8 = this.LJFF) != null && c85258Xd8.LIZLLL)) {
            InterfaceC54674Ld0 interfaceC54674Ld06 = this.LJ;
            if (interfaceC54674Ld06 != null) {
                interfaceC54674Ld06.LIZJ(3);
            }
            this.LJII.getClass();
            J13.LIZ(6);
        } else {
            final J13 j13 = this.LJII;
            String business2 = this.LJIIIIZZ;
            String scene2 = this.LJIIIZ;
            o.LJIIIZ(business2, "business");
            o.LJIIIZ(scene2, "scene");
            Config LIZ2 = C85296Xdk.LIZ(business2);
            if (LIZ2 != null && (list2 = LIZ2.popupSceneV2) != null && (LJJIJIIJIL2 = C78866UxK.LJJIJIIJIL(scene2, list2)) != null) {
                str = LJJIJIIJIL2.openSettingsText;
            } else {
                str = null;
            }
            final C85258Xd8 c85258Xd85 = this.LJFF;
            final ActivityC45651qj ctx = this.LIZIZ;
            final InterfaceC54674Ld0 interfaceC54674Ld07 = this.LJ;
            j13.getClass();
            o.LJIIIZ(ctx, "ctx");
            LocationPermissionFetcher$showGotoSettingDialog$5$1 locationPermissionFetcher$showGotoSettingDialog$5$1 = j13.LIZ;
            if (locationPermissionFetcher$showGotoSettingDialog$5$1 != null) {
                ProcessLifecycleOwner.get().getLifecycle().removeObserver(locationPermissionFetcher$showGotoSettingDialog$5$1);
                j13.LIZ = null;
            }
            final long currentTimeMillis2 = System.currentTimeMillis();
            final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(ctx, R.style.ul);
            C62905OmT c62905OmT = new C62905OmT(contextThemeWrapper);
            c62905OmT.LIZIZ = contextThemeWrapper.getResources().getString(R.string.bkx);
            if (str == null || str.length() == 0) {
                str = contextThemeWrapper.getResources().getString(R.string.ilj);
            }
            c62905OmT.LIZJ = str;
            c62905OmT.LJIIL(new IDCListenerS166S0100000_15(contextThemeWrapper, 9), contextThemeWrapper.getResources().getString(R.string.bkt), true);
            c62905OmT.LJIIJ = new C62907OmV(new DialogInterfaceOnClickListenerC85303Xdr(c85258Xd85, currentTimeMillis2, interfaceC54674Ld07, ctx), contextThemeWrapper.getResources().getString(R.string.bku), false);
            c62905OmT.LJII = false;
            c62905OmT.LIZJ(new AqS174S0100000_8(j13, 182));
            final C62906OmU c62906OmU = new C62906OmU(c62905OmT);
            j13.LIZ = new LifecycleEventObserver() { // from class: com.ss.android.ugc.tiktok.location.permission.LocationPermissionFetcher$showGotoSettingDialog$5$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    String str14;
                    String str15;
                    String str16;
                    o.LJIIIZ(source, "source");
                    o.LJIIIZ(event, "event");
                    if (event == Lifecycle.Event.ON_RESUME && C56179M3b.LIZ.LJIILLIIL(0, contextThemeWrapper)) {
                        C85258Xd8 c85258Xd86 = c85258Xd85;
                        if (c85258Xd86 != null) {
                            str14 = c85258Xd86.LIZ;
                            str15 = c85258Xd86.LIZIZ;
                            str16 = c85258Xd86.LIZJ;
                        } else {
                            str14 = null;
                            str15 = null;
                            str16 = null;
                        }
                        C85299Xdn.LJI(1, System.currentTimeMillis() - currentTimeMillis2, str14, str15, str16, new AqS176S0100000_10(ctx, 78));
                        c62906OmU.LIZIZ(null);
                        C35908E7k.LIZIZ().storeBoolean("location_permission_is_allow", true);
                        InterfaceC54674Ld0 interfaceC54674Ld08 = interfaceC54674Ld07;
                        if (interfaceC54674Ld08 != null) {
                            interfaceC54674Ld08.LIZ();
                        }
                        ProcessLifecycleOwner.get().getLifecycle().removeObserver(this);
                        j13.LIZ = null;
                    }
                }
            };
            Lifecycle lifecycle = ProcessLifecycleOwner.get().getLifecycle();
            LocationPermissionFetcher$showGotoSettingDialog$5$1 locationPermissionFetcher$showGotoSettingDialog$5$12 = j13.LIZ;
            o.LJII(locationPermissionFetcher$showGotoSettingDialog$5$12, "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver");
            lifecycle.addObserver(locationPermissionFetcher$showGotoSettingDialog$5$12);
            if (c85258Xd85 != null) {
                str2 = c85258Xd85.LIZ;
                str3 = c85258Xd85.LIZIZ;
                str4 = c85258Xd85.LIZJ;
            } else {
                str2 = null;
                str3 = null;
                str4 = null;
            }
            long j = C35908E7k.LIZIZ().getLong("system_location_setting_show_ts", 0L);
            long currentTimeMillis3 = System.currentTimeMillis();
            C35908E7k.LIZIZ().storeInt("system_location_setting_show_count", C35908E7k.LIZIZ().getInt("system_location_setting_show_count", 0) + 1);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str2 != null) {
                linkedHashMap.put("enter_from", str2);
            }
            if (str3 != null) {
                linkedHashMap.put("enter_method", str3);
            }
            if (str4 != null) {
                linkedHashMap.put("previous_page", str4);
            }
            linkedHashMap.put("show_index", String.valueOf(C35908E7k.LIZIZ().getInt("system_location_setting_show_count", 0) - 1));
            if (j > 0) {
                linkedHashMap.put("time_int", String.valueOf((currentTimeMillis3 - j) / 86400000));
            } else {
                linkedHashMap.put("time_int", "-1");
            }
            FMX.LJIIL("system_location_setting_show", linkedHashMap);
            C85299Xdn.LIZJ();
            C35908E7k.LIZIZ().storeLong("system_location_setting_show_ts", System.currentTimeMillis());
            c62906OmU.LIZLLL();
            this.LJII.getClass();
            J13.LIZ(7);
        }
        InterfaceC85311Xdz interfaceC85311Xdz5 = this.LJI;
        if (interfaceC85311Xdz5 == null) {
            return;
        }
        interfaceC85311Xdz5.LIZJ();
    }

    public C85298Xdm(C68322mC<C73912vD> c68322mC, ActivityC45651qj activityC45651qj, boolean z, C72242sW c72242sW, InterfaceC54674Ld0 interfaceC54674Ld0, C85258Xd8 c85258Xd8, InterfaceC85311Xdz interfaceC85311Xdz, J13 j13, String str, String str2, long j) {
        this.LIZ = c68322mC;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = z;
        this.LIZLLL = c72242sW;
        this.LJ = interfaceC54674Ld0;
        this.LJFF = c85258Xd8;
        this.LJI = interfaceC85311Xdz;
        this.LJII = j13;
        this.LJIIIIZZ = str;
        this.LJIIIZ = str2;
        this.LJIIJ = j;
    }
}
