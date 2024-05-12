package com.ss.android.ugc.aweme.friends.service;

import X.A7U;
import X.A7V;
import X.ActivityC45651qj;
import X.C246509lu;
import X.C2U8;
import X.C53813LAb;
import X.C53814LAc;
import X.C58041MqD;
import X.C58096Mr6;
import X.C77266UUc;
import X.FKM;
import X.HG3;
import X.InterfaceC58710N2k;
import X.KNV;
import X.LK8;
import X.OSZ;
import X.OUK;
import X.UPT;
import X.UQ2;
import X.UQ7;
import X.UQ8;
import X.UQ9;
import X.UQB;
import X.UQI;
import X.URL;
import X.X1D;
import Y.AObserverS63S0101000_13;
import Y.AObserverS81S0100000_13;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.relation.consent.SocialConsentFragment;
import com.ss.android.ugc.aweme.relation.recommend.NewVersionRecFriendsFragment;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SocialFriendsService implements GenericLifecycleObserver, ISocialFriendsService {
    public ActivityC45651qj LJLIL;
    public UQ9 LJLILLLLZI;
    public boolean LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public static ISocialFriendsService LJII() {
        Object LIZ = C58096Mr6.LIZ(ISocialFriendsService.class, false);
        if (LIZ != null) {
            return (ISocialFriendsService) LIZ;
        }
        if (C58096Mr6.X0 == null) {
            synchronized (ISocialFriendsService.class) {
                if (C58096Mr6.X0 == null) {
                    C58096Mr6.X0 = new SocialFriendsService();
                }
            }
        }
        return C58096Mr6.X0;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final String LIZIZ() {
        return C246509lu.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final String LIZJ() {
        return A7V.class.getName();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final String LJFF() {
        return A7U.class.getName();
    }

    public final void LJIIIIZZ() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            activityC45651qj.getLifecycle().removeObserver(this);
            this.LJLIL = null;
        }
        UQ9 uq9 = this.LJLILLLLZI;
        if (uq9 != null) {
            uq9.LIZ();
            this.LJLILLLLZI = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            activityC45651qj.getLifecycle().removeObserver(this);
            this.LJLIL = null;
        }
        if (this.LJLILLLLZI != null) {
            this.LJLILLLLZI = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final OSZ<Boolean, Long> LIZ(int i) {
        C53813LAb LIZ = C53814LAc.LIZ();
        UQ7 uq7 = UQ7.RECOMMEND;
        int value = uq7.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("go_through_social_recommend_flow");
        LIZ2.append(i);
        LIZ2.append(value);
        boolean z = LIZ.LIZ.getBoolean(X1D.LIZIZ(LIZ2), false);
        C53813LAb LIZ3 = C53814LAc.LIZ();
        int value2 = uq7.getValue();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("go_through_time_ms");
        LIZ4.append(i);
        LIZ4.append(value2);
        return new OSZ<>(Boolean.valueOf(z), Long.valueOf(LIZ3.LIZ.getLong(X1D.LIZIZ(LIZ4), -1L)));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final OSZ<Boolean, Long> LJ(int i) {
        C53813LAb LIZ = C53814LAc.LIZ();
        UQ7 uq7 = UQ7.CONSENT;
        int value = uq7.getValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("go_through_social_recommend_flow");
        LIZ2.append(i);
        LIZ2.append(value);
        boolean z = LIZ.LIZ.getBoolean(X1D.LIZIZ(LIZ2), false);
        C53813LAb LIZ3 = C53814LAc.LIZ();
        int value2 = uq7.getValue();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("go_through_time_ms");
        LIZ4.append(i);
        LIZ4.append(value2);
        return new OSZ<>(Boolean.valueOf(z), Long.valueOf(LIZ3.LIZ.getLong(X1D.LIZIZ(LIZ4), -1L)));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final void LIZLLL(ActivityC45651qj activity, UQ9 uq9) {
        boolean z;
        int value;
        o.LJIIIZ(activity, "activity");
        if (activity.isFinishing()) {
            uq9.LIZ();
            return;
        }
        this.LJLILLLLZI = uq9;
        this.LJLIL = activity;
        activity.getLifecycle().addObserver(this);
        InterfaceC58710N2k LIZ = UPT.LIZ(3);
        int LIZ2 = LIZ.LIZ();
        SocialRecFlowModel socialRecFlowModel = (SocialRecFlowModel) ViewModelProviders.of(activity).get(SocialRecFlowModel.class);
        socialRecFlowModel.LJLIL.observe(activity, new AObserverS63S0101000_13(this, LIZ2, 0));
        socialRecFlowModel.LJLILLLLZI.observe(activity, new AObserverS81S0100000_13(this, 48));
        boolean booleanValue = LIZ.LIZJ().getFirst().booleanValue();
        if (URL.LIZ() && UPT.LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        int i = 14;
        FriendList friendList = null;
        if (booleanValue && z) {
            if (UQB.LJFF()) {
                value = UQ7.NEW_VERSION_FACEBOOK.getValue();
            } else {
                value = UQ7.NEW_VERSION_CONTACT.getValue();
            }
            LJIIIZ(new UQ8(value, friendList, i), LIZ2);
            return;
        }
        LJIIIZ(new UQ8(UQ7.NEW_VERSION_RECOMMEND.getValue(), friendList, i), LIZ2);
    }

    public final void LJIIIZ(UQ8 uq8, int i) {
        boolean z;
        C58041MqD c58041MqD;
        String string;
        UQI uqi;
        if (uq8 == null) {
            LJIIIIZZ();
            return;
        }
        int i2 = uq8.LIZ;
        UQ7 uq7 = UQ7.NEW_VERSION_CONTACT;
        if (i2 == uq7.getValue() || i2 == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.LJLJI = true;
            int i3 = uq8.LIZ;
            if (i3 == UQ7.NEW_VERSION_FACEBOOK.getValue()) {
                uqi = new UQI(i, KNV.LIZJ(R.string.ipe, "ApplicationHolder.resour…rsion_find_friends_title)"), R.drawable.aus, KNV.LIZJ(R.string.ipd, "ApplicationHolder.resour…ing.new_version_fb_title)"), KNV.LIZJ(R.string.ipc, "ApplicationHolder.resour…tring.new_version_fb_des)"), KNV.LIZJ(R.string.a9i, "ApplicationHolder.resour…g.access_request_FB_btn1)"), KNV.LIZJ(R.string.a9j, "ApplicationHolder.resour…g.access_request_FB_btn2)"), KNV.LIZJ(R.string.sec, "ApplicationHolder.resour….toast_fb_friends_synced)"), i3);
            } else if (i3 == uq7.getValue()) {
                if (C77266UUc.LIZIZ.LJI()) {
                    Resources LIZJ = FKM.LIZJ();
                    o.LJI(LIZJ);
                    string = LIZJ.getString(R.string.rzy);
                } else {
                    Resources LIZJ2 = FKM.LIZJ();
                    o.LJI(LIZJ2);
                    string = LIZJ2.getString(R.string.duy);
                }
                o.LJIIIIZZ(string, "if (FriendsService.isSup…losure)\n                }");
                uqi = new UQI(i, KNV.LIZJ(R.string.ipe, "ApplicationHolder.resour…rsion_find_friends_title)"), R.drawable.aur, KNV.LIZJ(R.string.ipb, "ApplicationHolder.resour…ew_version_contact_title)"), string, KNV.LIZJ(R.string.a9i, "ApplicationHolder.resour…g.access_request_FB_btn1)"), KNV.LIZJ(R.string.a9j, "ApplicationHolder.resour…g.access_request_FB_btn2)"), KNV.LIZJ(R.string.dvb, "ApplicationHolder.resour…R.string.contacts_synced)"), i3);
            } else {
                LJIIIIZZ();
                return;
            }
            SocialConsentFragment socialConsentFragment = new SocialConsentFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("consentConfig", uqi);
            bundle.putBoolean("isAfterAuth", true);
            socialConsentFragment.setArguments(bundle);
            UQ9 uq9 = this.LJLILLLLZI;
            if (uq9 != null) {
                uq9.LIZIZ(socialConsentFragment);
                return;
            }
            return;
        }
        if (i2 == UQ7.NEW_VERSION_RECOMMEND.getValue()) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        LJIIIIZZ();
                        return;
                    }
                    c58041MqD = new C58041MqD(i, KNV.LIZJ(R.string.n0, "ApplicationHolder.resour…end_recommendation_title)"), KNV.LIZJ(R.string.my, "ApplicationHolder.resour…commendation_description)"), KNV.LIZJ(R.string.exd, "ApplicationHolder.resour….getString(R.string.done)"), KNV.LIZJ(R.string.h7o, "ApplicationHolder.resour…ing.im_notice_no_follows)"));
                } else {
                    c58041MqD = new C58041MqD(i, KNV.LIZJ(R.string.n0, "ApplicationHolder.resour…end_recommendation_title)"), KNV.LIZJ(R.string.my, "ApplicationHolder.resour…commendation_description)"), KNV.LIZJ(R.string.mx, "ApplicationHolder.resour…iend_recommendation_btn2)"), KNV.LIZJ(R.string.h7o, "ApplicationHolder.resour…ing.im_notice_no_follows)"));
                }
            } else {
                c58041MqD = new C58041MqD(i, KNV.LIZJ(R.string.n0, "ApplicationHolder.resour…end_recommendation_title)"), KNV.LIZJ(R.string.my, "ApplicationHolder.resour…commendation_description)"), KNV.LIZJ(R.string.mx, "ApplicationHolder.resour…iend_recommendation_btn2)"), KNV.LIZJ(R.string.r4s, "ApplicationHolder.resour…vite_section_no_contacts)"));
            }
            String str = uq8.LIZJ;
            String str2 = uq8.LIZLLL;
            boolean z2 = this.LJLJI;
            NewVersionRecFriendsFragment newVersionRecFriendsFragment = new NewVersionRecFriendsFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("recommendFriendsConfig", c58041MqD);
            bundle2.putString("platforms", str);
            bundle2.putString("skip_platforms", str2);
            bundle2.putBoolean("isAfterAuth", z2);
            newVersionRecFriendsFragment.setArguments(bundle2);
            UQ9 uq92 = this.LJLILLLLZI;
            if (uq92 == null) {
                return;
            }
            uq92.LIZIZ(newVersionRecFriendsFragment);
            return;
        }
        LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.ISocialFriendsService
    public final void LJI(Activity activity, boolean z, OUK ouk) {
        int i;
        HG3.LJIIL();
        int i2 = 2;
        if (!o.LJ(HG3.LJLJL.LJIIIZ().getLatestLoginMethodName(), "facebook")) {
            i = 1;
        } else {
            i = 2;
        }
        InterfaceC58710N2k LIZ = UPT.LIZ(i);
        if (!LIZ.LIZIZ((ActivityC45651qj) activity)) {
            ouk.LIZ();
            return;
        }
        if (!z) {
            if (LIZ.LIZ() != 2) {
                i2 = 1;
            }
            C2U8.LIZ(new LK8(i2, LIZ.LIZJ()));
            UQ2.LIZ().LIZ.storeBoolean("after_login_permission_pop_up", true);
        }
        ouk.LIZ();
    }
}
