package com.ss.android.ugc.aweme.account.main;

import X.AV1;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C188707as;
import X.C212428Vi;
import X.C26045AKb;
import X.C2U8;
import X.C38700FGu;
import X.C38995FSd;
import X.C40534FvW;
import X.C55096Ljo;
import X.C56277M6v;
import X.C56642Ke;
import X.C56662Kg;
import X.C8HX;
import X.HG3;
import X.QD3;
import X.RBX;
import X.RunnableC56276M6u;
import Y.ARunnableS10S1100000_9;
import Y.ARunnableS45S0100000_9;
import Y.ARunnableS4S1100000_3;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BASwitchToPAorBAServiceImpl;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;
import com.ss.android.ugc.aweme.services.MainActivityLifecycle;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.setting.ISettingManagerService;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import yq4.a;

/* loaded from: classes10.dex */
public final class AccountMainActivityAssem extends BaseMainContainerAssem {
    public final AtomicBoolean LJLIL = new AtomicBoolean(false);
    public boolean LJLILLLLZI = true;
    public final C188707as LJLJI = C188707as.LJLIL;

    @Override // X.C8W0
    public final void onCreate() {
        Bundle bundle;
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(AccountMainActivityAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
        AccountService.LJIJ().LJIILJJIL(this.LJLJI);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        String str = null;
        if (LIZ != null && (intent = LIZ.getIntent()) != null) {
            bundle = C16880lQ.LLJJIJI(intent);
        } else {
            bundle = null;
        }
        v3(bundle);
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null) {
            Intent intent2 = LIZ2.getIntent();
            if (intent2 != null) {
                str = C16880lQ.LLJJIJIIJIL(intent2, "launch_webview_after_restart_url");
            }
            Intent intent3 = LIZ2.getIntent();
            if (intent3 != null) {
                intent3.removeExtra("launch_webview_after_restart_url");
            }
            if (str != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), "//webview");
                buildRoute.withParam("url", str);
                buildRoute.open();
            }
        }
        C38995FSd.LIZIZ().execute(new ARunnableS45S0100000_9(this, 19));
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onResume() {
        MainActivityLifecycle hpasDialog;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(AccountMainActivityAssem.class), "onResume"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onResume();
        IAccountHelperService createIAccountHelperServicebyMonsterPlugin = AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false);
        if (createIAccountHelperServicebyMonsterPlugin != null && (hpasDialog = createIAccountHelperServicebyMonsterPlugin.getHpasDialog()) != null) {
            hpasDialog.onResume();
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
        AccountService.LJIJ().LJIILJJIL(this.LJLJI);
        if (ServiceManager.get() != null && AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false) != null) {
            AccountHelperService.createIAccountHelperServicebyMonsterPlugin(false).getHpasDialog().onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        o.LJIIIZ(intent, "intent");
        v3(C16880lQ.LLJJIJI(intent));
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSwitchAccountSuccess(C56642Ke broadCastEvent) {
        ActivityC45651qj LIZ;
        String str;
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        JSONObject jSONObject = broadCastEvent.LJLIL;
        if (jSONObject == null) {
            return;
        }
        Integer num = null;
        if (!TextUtils.equals(jSONObject.optString("eventName"), "account_switch_success")) {
            JSONObject optJSONObject = broadCastEvent.LJLIL.optJSONObject("data");
            if (optJSONObject != null) {
                str = optJSONObject.optString("eventName");
            } else {
                str = null;
            }
            if (!TextUtils.equals(str, "account_switch_success")) {
                return;
            }
        }
        JSONObject optJSONObject2 = broadCastEvent.LJLIL.optJSONObject("data");
        if (optJSONObject2 == null) {
            return;
        }
        if (TextUtils.equals(optJSONObject2.optString("enter_from"), "business_suite_setting")) {
            BASwitchToPAorBAServiceImpl.LIZLLL().LIZ(C212428Vi.LIZ(this));
        } else {
            ((RBX) HG3.LJIILL()).queryUser();
            ISettingManagerService LIZJ = SettingManagerServiceImpl.LIZJ();
            C212428Vi.LIZ(this);
            LIZJ.LIZ(1);
            int optInt = optJSONObject2.optInt("account_type");
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("data");
            if (optJSONObject3 != null) {
                num = Integer.valueOf(optJSONObject3.optInt("account_type"));
            }
            if (optInt == 2) {
                SmartRoute buildRoute = SmartRouter.buildRoute(C212428Vi.LIZ(this), "//setting");
                buildRoute.addFlags(67108864);
                buildRoute.addFlags(536870912);
                buildRoute.withParam("from_switch_creator_success", true);
                buildRoute.open();
                a.LJIILIIL().LIZ();
                C2U8.LIZ(new IEvent() { // from class: X.9NB
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }
                });
            } else if ((optInt == 3 || (num != null && num.intValue() == 3)) && (LIZ = C212428Vi.LIZ(this)) != null) {
                C2U8.LIZ(new IEvent() { // from class: X.9NE
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C2U8.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C2U8.LIZIZ(this);
                        return this;
                    }
                });
                ((MainBusinessAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), MainBusinessAbility.class)).VU(LIZ, "performClickTab", "USER");
                a.LJIILIIL().LIZ();
            }
        }
        a.LJIILIIL().LJ();
        HybridKitTaskImpl.LJIIJJI().LJII();
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserLogicDeleteEvent(C56277M6v event) {
        o.LJIIIZ(event, "event");
        if (this.LJLIL.compareAndSet(false, true)) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                C26045AKb c26045AKb = new C26045AKb(LIZ);
                c26045AKb.LJIIIZ(event.LJLIL);
                c26045AKb.LJIIJ();
            }
            HG3.LJIIIIZZ().logout("user_logic_delete", "cancel_account_logout");
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void showEditProfileGuide(C56642Ke broadCastEvent) {
        o.LJIIIZ(broadCastEvent, "broadCastEvent");
        if (TextUtils.equals(JSONObjectProtectorUtils.getString(broadCastEvent.LJLIL, "eventName"), "ttba_show_edit_profile_guide")) {
            ((MainDialogAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), MainDialogAbility.class)).Cb0();
        }
    }

    public final void v3(Bundle bundle) {
        Class<? extends Activity> LJIIZILJ;
        long j;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (bundle == null || LIZ == null) {
            return;
        }
        Uri uri = null;
        if (AV1.LJIIJJI() && ((RBX) HG3.LJIILL()).allUidList().size() > 1) {
            C8HX.LIZIZ("child_mode_multi_account", "", null);
        }
        boolean z = false;
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).setSwitchAccountRestartPending(false);
        if (C40534FvW.LIZ()) {
            a.LIZIZ().LIZLLL();
        }
        if (bundle.getBoolean("is_start_by_switch_account", false)) {
            if (C38700FGu.LIZ()) {
                a.LJIIL().LIZLLL(true);
            }
            new Handler().postDelayed(RunnableC56276M6u.LJLIL, 500L);
        }
        if (!TextUtils.isEmpty(bundle.getString("switch_account_success_toast_text", null))) {
            new Handler().post(new ARunnableS10S1100000_9(LIZ, bundle.getString("switch_account_success_toast_text", null), 0));
            z = true;
        }
        if (!TextUtils.isEmpty(bundle.getString("bind_pii_success_toast_text", null))) {
            String string = bundle.getString("bind_pii_success_toast_text", null);
            Handler handler = new Handler();
            ARunnableS4S1100000_3 aRunnableS4S1100000_3 = new ARunnableS4S1100000_3(LIZ, string, 0);
            if (z) {
                j = 3000;
            } else {
                j = 0;
            }
            handler.postDelayed(aRunnableS4S1100000_3, j);
        }
        boolean z2 = bundle.getBoolean("login_jump");
        boolean z3 = bundle.getBoolean("switch_jump");
        boolean z4 = bundle.getBoolean("cancelRestoreOnMain");
        Intent intent = (Intent) bundle.getParcelable("push_intent");
        if (intent != null) {
            uri = intent.getData();
        }
        if (z4) {
            AVExternalServiceImpl.LIZ().publishService().cancelRestoreOnMain();
        }
        if (intent == null) {
            return;
        }
        if (!z2 && !z3) {
            return;
        }
        intent.putExtra("second_jump", true);
        IDeepLinkService LIZ2 = DeepLinkServiceImpl.LIZ();
        if (LIZ2 == null || (LJIIZILJ = LIZ2.LJIIZILJ()) == null) {
            return;
        }
        intent.setClass(LIZ, LJIIZILJ);
        intent.putExtra("inner_from", "switch_account");
        if (uri != null) {
            intent.setData(uri.buildUpon().appendQueryParameter("_t", String.valueOf(System.currentTimeMillis())).build());
        }
        C16880lQ.LIZLLL(LIZ, intent);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        if (z && this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            if (C40534FvW.LIZ()) {
                HG3.LJIIIIZZ().toRecoverDeletedAccount(null);
            }
        }
    }
}
