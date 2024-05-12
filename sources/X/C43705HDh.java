package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.PublishSettings;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.settings.GreenScreenKitEffectsSettings;
import com.ss.android.vesdk.VEUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.HDh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43705HDh implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ C43722HDy LIZ;
    public final /* synthetic */ C45838Hys LIZIZ;
    public final /* synthetic */ C43703HDf LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJFF;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        try {
            if (!this.LIZLLL.isFinishing()) {
                this.LIZLLL.finish();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        try {
            if (!this.LIZLLL.isFinishing()) {
                this.LIZLLL.finish();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        int i;
        int i2;
        char c;
        List<GreenScreenKitEffectsSettings.GreenScreenEffect> list;
        String str;
        GreenScreenKitEffectsSettings.GreenScreenEffect greenScreenEffect;
        String str2;
        o.LJIIIZ(service, "service");
        C43722HDy c43722HDy = this.LIZ;
        if (c43722HDy.mShareFormat == EnumC43698HDa.GREEN_SCREEN && ((i2 = this.LIZIZ.LIZ) == 1 || i2 == 2)) {
            C43703HDf c43703HDf = this.LIZJ;
            Activity activity = this.LIZLLL;
            c43703HDf.getClass();
            XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C72612t7(c43703HDf, activity, null), 3);
            if (this.LIZIZ.LIZ == 1) {
                c = 1;
            } else {
                c = 2;
            }
            GreenScreenKitEffectsSettings.LIZ.getClass();
            try {
                GreenScreenKitEffectsSettings.GreenScreenKitEffectsModel greenScreenKitEffectsModel = (GreenScreenKitEffectsSettings.GreenScreenKitEffectsModel) SettingsManager.LIZLLL().LJIIIIZZ("green_screen_kit_effects", GreenScreenKitEffectsSettings.GreenScreenKitEffectsModel.class, null);
                if (greenScreenKitEffectsModel != null) {
                    if (c != 1) {
                        list = greenScreenKitEffectsModel.greenScreenVideoEffects;
                        str = "green_screen_video";
                    } else {
                        list = greenScreenKitEffectsModel.greenScreenImageEffects;
                        str = "green_screen_image";
                    }
                    if (list != null) {
                        Iterator<GreenScreenKitEffectsSettings.GreenScreenEffect> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                greenScreenEffect = it.next();
                                String str3 = greenScreenEffect.effectName;
                                Locale locale = Locale.ROOT;
                                String lowerCase = str3.toLowerCase(locale);
                                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                String lowerCase2 = str.toLowerCase(locale);
                                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (o.LJ(lowerCase, lowerCase2)) {
                                    break;
                                }
                            } else {
                                greenScreenEffect = null;
                                break;
                            }
                        }
                        GreenScreenKitEffectsSettings.GreenScreenEffect greenScreenEffect2 = greenScreenEffect;
                        if (greenScreenEffect2 != null && (str2 = greenScreenEffect2.resourceID) != null) {
                            C43703HDf c43703HDf2 = this.LIZJ;
                            Activity activity2 = this.LIZLLL;
                            C43704HDg c43704HDg = new C43704HDg(c43703HDf2, this.LIZIZ, str2, this.LIZ, this.LJ, service, activity2, this.LJFF);
                            c43703HDf2.getClass();
                            IAVEffectService effectService = AVExternalServiceImpl.LIZ().abilityService().effectService();
                            o.LJII(activity2, "null cannot be cast to non-null type android.content.Context");
                            effectService.buildEffectPlatform(activity2, new HUW(str2, c43704HDg), null);
                            return;
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.LIZJ.LIZIZ();
            this.LIZJ.LIZ(this.LIZLLL, service, this.LIZ, this.LIZIZ, "", this.LJ, this.LJFF);
            return;
        }
        C45838Hys c45838Hys = this.LIZIZ;
        int i3 = c45838Hys.LIZ;
        if (i3 == 2 || i3 == 4) {
            PublishSettings publishSettings = c43722HDy.mPublishSettings;
            int i4 = 0;
            if (publishSettings != null && publishSettings.isDirectPost() && this.LIZIZ.LIZ == 2) {
                InterfaceC163006aW publishService = C60903NvH.LJIIJJI().getPublishService();
                Activity activity3 = this.LIZLLL;
                o.LJII(activity3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                String str4 = (String) ORZ.LJLLJ(this.LIZIZ.LIZIZ);
                C43722HDy c43722HDy2 = this.LIZ;
                publishService.LJ((ActivityC45651qj) activity3, str4, c43722HDy2, C43706HDi.LIZJ(c43722HDy2), C43706HDi.LIZIZ(this.LIZ.mClientKey));
                return;
            }
            List<String> list2 = this.LIZIZ.LIZIZ;
            if (list2 != null && !list2.isEmpty()) {
                List<String> list3 = this.LIZIZ.LIZIZ;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<String> it2 = list3.iterator();
                    i4 = 0;
                    while (it2.hasNext()) {
                        VEUtils.VEVideoFileInfo videoFileInfo = VEUtils.getVideoFileInfo(it2.next());
                        if (videoFileInfo != null && 1 <= (i = videoFileInfo.duration) && i < 1000 && (i4 = i4 + 1) < 0) {
                            C47261Igj.LJJJJIZL();
                            throw null;
                        }
                    }
                }
                if (i4 == this.LIZIZ.LIZIZ.size()) {
                    C43703HDf c43703HDf3 = this.LIZJ;
                    Activity activity4 = this.LIZLLL;
                    C43722HDy c43722HDy3 = this.LIZ;
                    C45838Hys c45838Hys2 = this.LIZIZ;
                    String str5 = this.LJ;
                    InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJFF;
                    c43703HDf3.getClass();
                    C43703HDf.LIZLLL(activity4, c43722HDy3, c45838Hys2, str5, interfaceC67352kd);
                    return;
                }
            }
            C43703HDf c43703HDf4 = this.LIZJ;
            Activity activity5 = this.LIZLLL;
            C43722HDy c43722HDy4 = this.LIZ;
            C45838Hys c45838Hys3 = this.LIZIZ;
            String str6 = this.LJ;
            InterfaceC67352kd<Boolean> interfaceC67352kd2 = this.LJFF;
            c43703HDf4.getClass();
            C43703HDf.LJ(activity5, service, c43722HDy4, c45838Hys3, str6, interfaceC67352kd2);
            return;
        }
        if (i3 != 1 && i3 != 3) {
            return;
        }
        C43703HDf c43703HDf5 = this.LIZJ;
        Activity activity6 = this.LIZLLL;
        String str7 = this.LJ;
        InterfaceC67352kd<Boolean> interfaceC67352kd3 = this.LJFF;
        c43703HDf5.getClass();
        C43703HDf.LIZLLL(activity6, c43722HDy, c45838Hys, str7, interfaceC67352kd3);
    }

    public C43705HDh(C43722HDy c43722HDy, C45838Hys c45838Hys, C43703HDf c43703HDf, Activity activity, String str, C84654XKg c84654XKg) {
        this.LIZ = c43722HDy;
        this.LIZIZ = c45838Hys;
        this.LIZJ = c43703HDf;
        this.LIZLLL = activity;
        this.LJ = str;
        this.LJFF = c84654XKg;
    }
}
