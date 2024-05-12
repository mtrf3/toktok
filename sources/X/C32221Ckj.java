package X;

import android.content.Context;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.DowngradeSettings;
import com.bytedance.android.livesdk.livesetting.gift.GiftPlayerAutoReleaseSwitchSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftRenderSparkOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDegradation264ResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftDisableStopWhenLynxTerminate;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPlayerUserTypeNewSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSurfaceViewSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTTplayerUseHardcoreSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoSetDataTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoSupportSRSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoTimeoutScaleSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftVideoTimeoutSetting;
import com.bytedance.android.livesdk.livesetting.gift.LynxDowngradeSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftPlayerAutoReleaseSwitch;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Ckj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32221Ckj {
    public static final C62822Ol8 LIZ;

    static {
        C32260ClM.LIZIZ(InterfaceC32241Cl3.class, new C32237Ckz());
        Context context = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context();
        o.LJIIIIZZ(context, "getService(IHostAppContext::class.java).context()");
        if (!C32231Ckt.LIZIZ) {
            C32223Ckl c32223Ckl = new C32223Ckl(new C32239Cl1(context));
            c32223Ckl.LJ = new C32215Ckd();
            c32223Ckl.LJII = new T2R();
            c32223Ckl.LIZJ = C32238Cl0.LIZ;
            c32223Ckl.LJI = new C28587BJv();
            C32222Ckk c32222Ckk = new C32222Ckk();
            DowngradeSettings value = LynxDowngradeSettings.INSTANCE.getValue();
            o.LJIIIZ(value, "<this>");
            c32222Ckk.LIZJ = new com.bytedance.gift.render.model.LynxDowngradeSettings(value.minMemory);
            C32253ClF keyToUri = C32253ClF.LJLIL;
            o.LJIIIZ(keyToUri, "keyToUri");
            c32222Ckk.LJ = keyToUri;
            GiftPlayerAutoReleaseSwitch value2 = GiftPlayerAutoReleaseSwitchSetting.INSTANCE.getValue();
            o.LJIIIZ(value2, "<this>");
            com.bytedance.gift.render.model.GiftPlayerAutoReleaseSwitch giftPlayerAutoReleaseSwitch = new com.bytedance.gift.render.model.GiftPlayerAutoReleaseSwitch();
            giftPlayerAutoReleaseSwitch.enable = value2.enable;
            giftPlayerAutoReleaseSwitch.aliveDuration = value2.aliveDuration;
            c32222Ckk.LIZLLL = giftPlayerAutoReleaseSwitch;
            c32222Ckk.LIZIZ = LiveGiftTTplayerUseHardcoreSetting.INSTANCE.getValue();
            c32222Ckk.LIZ = LiveGiftPlayerUserTypeNewSetting.INSTANCE.getValue();
            c32222Ckk.LJFF = true;
            c32222Ckk.LJI = LiveGiftVideoSupportSRSetting.getValue();
            c32222Ckk.LJII = TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
            c32222Ckk.LJIIIIZZ = LiveGiftVideoTimeoutSetting.getValue();
            c32222Ckk.LJIIIZ = LiveGiftVideoTimeoutScaleSetting.getValue();
            c32222Ckk.LJIIJJI = LiveGiftDisableStopWhenLynxTerminate.INSTANCE.getValue();
            c32222Ckk.LJIIJ = LiveGiftVideoSetDataTimeoutSetting.getValue();
            c32222Ckk.LJIIL = LiveGiftDegradation264ResourceSetting.enableOsPlayerForAudience();
            c32222Ckk.LJIILIIL = LiveGiftSurfaceViewSetting.INSTANCE.getValue();
            c32223Ckl.LIZLLL = new C32225Ckn(c32222Ckk);
            c32223Ckl.LJIIIIZZ = new C32226Cko();
            C32227Ckp resource = C32227Ckp.LJLIL;
            o.LJIIIZ(resource, "resource");
            c32223Ckl.LJIIIZ = resource;
            c32223Ckl.LJFF = new CGU();
            c32223Ckl.LIZIZ = new CMI();
            C32224Ckm c32224Ckm = new C32224Ckm(c32223Ckl);
            if (!C32231Ckt.LIZIZ) {
                synchronized (C32231Ckt.class) {
                    if (!C32231Ckt.LIZIZ) {
                        C32243Cl5.LIZ(c32224Ckm);
                        C32231Ckt.LIZIZ = true;
                    }
                }
            }
        }
        LIZ = C221108m2.LIZIZ(C32236Cky.LJLIL);
    }

    public static C32405Cnh LIZIZ() {
        return (C32405Cnh) LIZ.getValue();
    }

    public static InterfaceC32440CoG LIZ(C32449CoP c32449CoP) {
        InterfaceC78190UmQ interfaceC78190UmQ = (InterfaceC78190UmQ) C32260ClM.LIZ(InterfaceC78190UmQ.class);
        if (c32449CoP != null && interfaceC78190UmQ != null) {
            return interfaceC78190UmQ.create(c32449CoP);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GiftRender#create failed, request = ");
        LIZ2.append(c32449CoP);
        LIZ2.append(", service=");
        LIZ2.append(interfaceC78190UmQ);
        C32444CoK.LIZIZ(null, X1D.LIZIZ(LIZ2));
        return null;
    }

    public static void LIZJ(Gift gift, long j) {
        AssetsModel LIZJ;
        InterfaceC32109Civ interfaceC32109Civ;
        if (gift == null || gift.type != 2 || !GiftRenderSparkOptimizeSetting.INSTANCE.isPreCreateStrategyEnable() || (LIZJ = C32366Cn4.LIZJ(C32394CnW.LIZ(gift, Long.valueOf(j)))) == null || LIZJ.resourceType != AssetsModel.RESOURCE_TYPE_LYNX || (interfaceC32109Civ = (InterfaceC32109Civ) C32260ClM.LIZ(InterfaceC32109Civ.class)) == null) {
            return;
        }
        C32108Ciu.LIZ(interfaceC32109Civ, null, 3);
    }
}
