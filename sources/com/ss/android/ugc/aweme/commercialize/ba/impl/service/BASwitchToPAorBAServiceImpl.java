package com.ss.android.ugc.aweme.commercialize.ba.impl.service;

import X.ASL;
import X.AV1;
import X.AXR;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C237559Tz;
import X.C26045AKb;
import X.C45804HyK;
import X.C58096Mr6;
import X.C73969T1h;
import X.C77800Ug8;
import X.C86V;
import X.EFJ;
import X.HG3;
import X.InterfaceC64592gB;
import X.RBX;
import X.SY4;
import X.T16;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS7S0500000_4;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.commercialize.ba.impl.api.UserGetApi;
import com.ss.android.ugc.aweme.commercialize.ba.impl.api.UserGetResponse;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class BASwitchToPAorBAServiceImpl implements IBASwitchToPAorBAService {
    public final Keva LIZ = KevaImpl.getRepo("ba_to_pa_feelgood_keva_name", 1);
    public Activity LIZIZ;

    public static IBASwitchToPAorBAService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IBASwitchToPAorBAService.class, false);
        if (LIZ != null) {
            return (IBASwitchToPAorBAService) LIZ;
        }
        if (C58096Mr6.LLLJIL == null) {
            synchronized (IBASwitchToPAorBAService.class) {
                if (C58096Mr6.LLLJIL == null) {
                    C58096Mr6.LLLJIL = new BASwitchToPAorBAServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLJIL;
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService
    public final void LIZ(final ActivityC45651qj activityC45651qj) {
        UserGetApi.LIZ.getClass();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        ((UserGetApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, UserGetApi.class)).getSelf().LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new InterfaceC64592gB(activityC45651qj) { // from class: X.4gM
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                boolean z;
                UserGetResponse userGetResponse = (UserGetResponse) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                User user = userGetResponse.getUser();
                if (user != null && user.getAccountType() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    User user2 = userGetResponse.getUser();
                    if (user2 != null) {
                        AccountService.LJIJ().LJFF().updateCurUser(user2);
                        SettingManagerServiceImpl.LIZJ().LIZ(1);
                        linkedHashMap.put("success", Integer.valueOf(CastIntegerProtector.parseInt("1")));
                        long currentTimeMillis = System.currentTimeMillis();
                        new F15();
                        C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(linkedHashMap), "sync_BA_user_finished"));
                        return;
                    }
                    return;
                }
                linkedHashMap.put("success", Integer.valueOf(CastIntegerProtector.parseInt(CardStruct.IStatusCode.DEFAULT)));
                long currentTimeMillis2 = System.currentTimeMillis();
                new F15();
                C72818Shy.LIZ(new C76052yf(currentTimeMillis2, F15.LIZLLL(linkedHashMap), "sync_BA_user_finished"));
            }
        }, new InterfaceC64592gB() { // from class: X.4cM
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("success", Integer.valueOf(CastIntegerProtector.parseInt(CardStruct.IStatusCode.DEFAULT)));
                linkedHashMap.put("error_message", String.valueOf(th.getMessage()));
                long currentTimeMillis = System.currentTimeMillis();
                new F15();
                C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(linkedHashMap), "sync_BA_user_finished"));
                C78983UzD.LJIIZILJ(th);
            }
        });
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService
    public final void LIZJ(JSONObject jSONObject) {
        if (jSONObject.optInt("status") == 1) {
            new C237559Tz().LJII("ttelite_switch_survey_success", new String[0]);
        }
        Activity activity = this.LIZIZ;
        if (activity != null) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ(C86V.LJFF(R.string.rzc));
            c26045AKb.LJIIJ();
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBASwitchToPAorBAService
    public final void LIZIZ(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, AXR axr) {
        FragmentManager supportFragmentManager;
        this.LIZIZ = i18nSettingManageMyAccountActivity;
        View content = View.inflate(i18nSettingManageMyAccountActivity, R.layout.cpq, null);
        ASL asl = new ASL();
        o.LJIIIIZZ(content, "content");
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLI = content;
        tuxSheet.LJZI = false;
        tuxSheet.LJLIL = new DialogInterface.OnCancelListener() { // from class: X.9Uy
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                new C237559Tz().LJIIJ(3);
            }
        };
        asl.LJI(0);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LL = false;
        TextView textView = (TextView) content.findViewById(R.id.jvx);
        SY4 sy4 = (SY4) content.findViewById(R.id.kx9);
        SY4 sy42 = (SY4) content.findViewById(R.id.b3n);
        if (AV1.LIZIZ() != null && AV1.LIZIZ().getCommerceUserLevel() == 2) {
            textView.setText(C86V.LJFF(R.string.sl7));
        } else {
            textView.setText(C86V.LJFF(R.string.snn));
        }
        C16880lQ.LJJIZ(sy4, new ACListenerS7S0500000_4(sy4, axr, this, tuxSheet2, i18nSettingManageMyAccountActivity, 3));
        C16880lQ.LJJIZ(sy42, new ACListenerS24S0100000_4(tuxSheet2, 315));
        if (System.currentTimeMillis() - this.LIZ.getLong(((RBX) HG3.LJIILL()).getCurUser().getUid(), System.currentTimeMillis()) > 86400000) {
            this.LIZ.clear();
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(i18nSettingManageMyAccountActivity);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            tuxSheet2.show(supportFragmentManager, "");
        }
    }
}
