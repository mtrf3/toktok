package com.ss.android.ugc.aweme.ug.appstart;

import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.AnonymousClass636;
import X.C16880lQ;
import X.C188727au;
import X.C198517qh;
import X.C212428Vi;
import X.C221108m2;
import X.C26045AKb;
import X.C33814DOw;
import X.C38816FLg;
import X.C38850FMo;
import X.C38984FRs;
import X.C40359Fsh;
import X.C40365Fsn;
import X.C40371Fst;
import X.C40599FwZ;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62610Ohi;
import X.C62822Ol8;
import X.C78596Usy;
import X.C88099Yhr;
import X.DM6;
import X.E3F;
import X.EF7;
import X.EnumC40361Fsj;
import X.FLJ;
import X.FLM;
import X.FMX;
import X.HG3;
import X.QD3;
import X.X1D;
import Y.ARunnableS42S0100000_6;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class MainActivityHelperAssem extends BaseMainContainerAssem {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 73));

    @Override // X.C8W0
    public final void onResume() {
        ActivityC86117Xqz activityC86117Xqz;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityHelperAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        Activity v3 = v3();
        if ((v3 instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) v3) != null && activityC86117Xqz.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            C38984FRs.LIZLLL.LJ(activityC86117Xqz);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    public final Activity v3() {
        return (Activity) this.LJLIL.getValue();
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onConfigurationChanged(Configuration newConfig) {
        ActivityC86117Xqz activityC86117Xqz;
        o.LJIIIZ(newConfig, "newConfig");
        Activity v3 = v3();
        if (!(v3 instanceof ActivityC86117Xqz) || (activityC86117Xqz = (ActivityC86117Xqz) v3) == null) {
            return;
        }
        if (C38984FRs.LJ) {
            long currentTimeMillis = (System.currentTimeMillis() - C38984FRs.LIZJ) / 1000;
            if (currentTimeMillis < 10 && newConfig.orientation == 2) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("duration", Long.valueOf(currentTimeMillis));
                FMX.LJIILJJIL("main_launch_from_landscape", c198517qh.LJ());
            }
            C38984FRs.LJ = false;
        }
        C38984FRs.LIZLLL.LJFF(activityC86117Xqz);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        ActivityC86117Xqz activityC86117Xqz;
        boolean z = true;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(MainActivityHelperAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        Activity v3 = v3();
        if ((v3 instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) v3) != null) {
            C38984FRs.LIZJ = System.currentTimeMillis();
            C40365Fsn.LIZ.getClass();
            if (((Boolean) C40365Fsn.LIZIZ.getValue()).booleanValue()) {
                C40371Fst c40371Fst = C40371Fst.LJI;
                if (o.LJ(C16880lQ.LJLLILLLL(activityC86117Xqz.getClass()), "com.ss.android.ugc.aweme.main.MainActivity")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - c40371Fst.LJFF;
                    if (bundle == null || j <= 0 || j >= TimeUnit.SECONDS.toMillis(2L)) {
                        c40371Fst.LJFF = currentTimeMillis;
                        if (c40371Fst.LIZLLL) {
                            c40371Fst.LJII(EnumC40361Fsj.MAIN.getValue(), new C188727au(), null);
                        } else {
                            String value = EnumC40361Fsj.MAIN.getValue();
                            C188727au c188727au = new C188727au();
                            c188727au.LJFF(Boolean.TRUE, "is_invalid_report");
                            c40371Fst.LJII(value, c188727au, Boolean.valueOf(c40371Fst.LIZ));
                        }
                        c40371Fst.LIZLLL = false;
                        c40371Fst.LJ = null;
                    }
                }
            }
            Intent intent = activityC86117Xqz.getIntent();
            if (intent != null && C16880lQ.LLJJIJI(intent) != null) {
                AnonymousClass636.LIZLLL(intent);
                Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
                o.LJI(LLJJIJI);
                String string = LLJJIJI.getString("payload");
                Bundle LLJJIJI2 = C16880lQ.LLJJIJI(intent);
                o.LJI(LLJJIJI2);
                String string2 = LLJJIJI2.getString("from");
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    PushService.createIPushApibyMonsterPlugin(false).onGcmNotificationClick(jSONObject, activityC86117Xqz, jSONObject.optInt("id", 0), string2, jSONObject.optInt("pass_through", 1), null);
                } catch (Exception unused) {
                }
            }
            if (((Boolean) C88099Yhr.LIZJ.getValue()).booleanValue()) {
                ((ArrayList) C38850FMo.LIZ).add(new ARunnableS42S0100000_6(activityC86117Xqz, 163));
            } else {
                C40599FwZ.LIZLLL(activityC86117Xqz);
                ShareServiceImpl.LJJJLZIJ().LJJIFFI();
                C62610Ohi.LIZ();
                C38984FRs.LIZLLL.LJIIJJI(activityC86117Xqz);
            }
            EventBus.LIZJ().LJIILJJIL(this);
            ((IPerformanceAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), IPerformanceAbility.class)).uf(new AqS156S0100000_6(this, 74));
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                AqS156S0100000_6 aqS156S0100000_6 = new AqS156S0100000_6(LIZ, 160);
                AqS156S0100000_6 aqS156S0100000_62 = new AqS156S0100000_6(LIZ, 159);
                if (!((Boolean) C33814DOw.LIZ.getValue()).booleanValue() || C78596Usy.LJJIL(DM6.LJLIL) || !((Boolean) C33814DOw.LIZIZ.getValue()).booleanValue()) {
                    z = false;
                }
                E3F.LIZJ("AppWidgetOpt_onCreate", aqS156S0100000_6, aqS156S0100000_62, z);
            }
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
        Uri data = intent.getData();
        if (data != null) {
            String host = data.getHost();
            String path = data.getPath();
            if (!o.LJ("mine", host)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(host);
                LIZ.append(path);
                if (!o.LJ("user/homepage", X1D.LIZIZ(LIZ))) {
                    return;
                }
            }
            if (HG3.LJIILL().isLogin()) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
            }
        }
    }

    @QD3(priority = -1, sticky = true, threadMode = ThreadMode.MAIN)
    public final void onPublishMessage(C40359Fsh publishMessage) {
        o.LJIIIZ(publishMessage, "publishMessage");
        int i = publishMessage.LJLIL;
        if (i != -1) {
            if (i != 1 && i == 2) {
                String aid = publishMessage.LJLILLLLZI.getAid();
                FLM.LIZ(EF7.LIZIZ(), "mus_af_post_video", null, TokenCert.Companion.with("bpea-appsflyer_androidsdk_1969"));
                FLJ.LIZ("fb_mobile_purchase", "product", aid);
            }
        } else {
            ((MainBusinessAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), MainBusinessAbility.class)).E50("page_feed", false);
            FLJ.LIZJ("start_upload", null);
        }
        EventBus.LIZJ().LJIILLIIL(publishMessage);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        ActivityC86117Xqz activityC86117Xqz;
        Activity v3 = v3();
        if ((v3 instanceof ActivityC86117Xqz) && (activityC86117Xqz = (ActivityC86117Xqz) v3) != null && z) {
            if (!C38984FRs.LIZIZ) {
                C38816FLg.LIZLLL(new ARunnableS42S0100000_6(164), 200);
            }
            if (activityC86117Xqz.getIntent().getBooleanExtra("unlogin_deeplink_third_part", false)) {
                C26045AKb c26045AKb = new C26045AKb(activityC86117Xqz);
                c26045AKb.LJIIIIZZ(R.string.ef7);
                c26045AKb.LJIIJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Activity v3 = v3();
        if (!(v3 instanceof ActivityC86117Xqz)) {
            v3 = null;
        }
        if (v3 == null) {
            return false;
        }
        if (i == 18 && i2 == -1 && intent != null) {
            C16880lQ.LIZJ(v3, intent);
        }
        if (i == 19 && i2 == -1) {
            C40599FwZ.LIZJ("app_update_click");
        }
        return false;
    }
}
