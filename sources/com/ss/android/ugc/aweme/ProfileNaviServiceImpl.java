package com.ss.android.ugc.aweme;

import X.ActivityC45651qj;
import X.C1AT;
import X.C26045AKb;
import X.C32335CmZ;
import X.C36468ESy;
import X.C47261Igj;
import X.C53202KuM;
import X.C58096Mr6;
import X.C61658OHu;
import X.C72664SfU;
import X.C72666SfW;
import X.C72667SfX;
import X.C72712SgG;
import X.C73969T1h;
import X.C76800UCe;
import X.C78598Ut0;
import X.C78764Uvg;
import X.H78;
import X.InterfaceC64592gB;
import X.InterfaceC72668SfY;
import X.L7I;
import X.OOL;
import X.OOP;
import X.T16;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.presenter.UserPresenter;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviServiceImpl implements IProfileNaviService {
    public final UserPresenter LIZ = new UserPresenter();

    public static IProfileNaviService LJIIL() {
        Object LIZ = C58096Mr6.LIZ(IProfileNaviService.class, false);
        if (LIZ != null) {
            return (IProfileNaviService) LIZ;
        }
        if (C58096Mr6.LJJLIIJ == null) {
            synchronized (IProfileNaviService.class) {
                if (C58096Mr6.LJJLIIJ == null) {
                    C58096Mr6.LJJLIIJ = new ProfileNaviServiceImpl();
                }
            }
        }
        return C58096Mr6.LJJLIIJ;
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final OOL LIZ(Activity activity, C61658OHu c61658OHu) {
        return new OOL(activity, c61658OHu);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LIZLLL(int i, AqS191S0100000_9 aqS191S0100000_9) {
        C72667SfX c72667SfX = new C72667SfX();
        c72667SfX.LIZIZ = i;
        C72666SfW c72666SfW = new C72666SfW();
        c72666SfW.LIZ = c72667SfX.LIZIZ;
        c72666SfW.LIZIZ = c72667SfX.LIZ;
        C36468ESy.LIZ(c72666SfW).LJJIIJ(T16.LIZ).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS64S0100000_12(aqS191S0100000_9, 108), new InterfaceC64592gB() { // from class: X.9Dt
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final boolean LJFF(Dialog dialog, int i) {
        o.LJIIIZ(dialog, "dialog");
        C26045AKb c26045AKb = new C26045AKb(dialog);
        Resources resources = dialog.getContext().getResources();
        o.LJIIIIZZ(resources, "dialog.context.resources");
        return LJIIJJI(c26045AKb, resources, i);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final boolean LJI(ActivityC45651qj activity, int i) {
        o.LJIIIZ(activity, "activity");
        C26045AKb c26045AKb = new C26045AKb(activity);
        Resources resources = activity.getResources();
        o.LJIIIIZZ(resources, "activity.resources");
        return LJIIJJI(c26045AKb, resources, i);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final boolean LJIIIIZZ(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        C26045AKb c26045AKb = new C26045AKb(fragment);
        Resources resources = fragment.getResources();
        o.LJIIIIZZ(resources, "fragment.resources");
        return LJIIJJI(c26045AKb, resources, i);
    }

    public static boolean LJIIJJI(C26045AKb c26045AKb, Resources resources, int i) {
        int LIZ = OOP.LIZ();
        if (i < LIZ) {
            return true;
        }
        c26045AKb.LJIIIZ(resources.getString(R.string.c0g, Integer.valueOf(LIZ)));
        c26045AKb.LIZLLL(3000L);
        c26045AKb.LJIIJ();
        return false;
    }

    public static Intent LJIILIIL(Activity activity, String str, C61658OHu c61658OHu) {
        Intent intent = new Intent(activity, (Class<?>) ProfileNaviActivity.class);
        intent.putExtra("enter_from", str);
        intent.putExtra("continue_to_profile", c61658OHu.LIZ);
        intent.putExtra("enable_tracking", c61658OHu.LIZIZ);
        return intent;
    }

    public static void LJIILJJIL(Activity activity, View view, Intent intent) {
        Bundle LIZLLL = new C1AT(ActivityOptions.makeSceneTransitionAnimation(activity, view, "transition")).LIZLLL();
        C78598Ut0.LJIJJ(intent, activity);
        activity.startActivity(intent, LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LIZIZ(Activity activity, InterfaceC72668SfY naviImage, AqS162S0100000_12 aqS162S0100000_12) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(naviImage, "naviImage");
        String LIZLLL = naviImage.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        String LIZ = naviImage.LIZ();
        if (LIZ == null) {
            C72712SgG.LIZIZ(this.LIZ, LIZLLL, naviImage.LIZJ(), naviImage.LJ(), aqS162S0100000_12);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        H78.LIZIZ("JEFF", "set navi as profile");
        String LIZIZ = naviImage.LIZIZ();
        C72664SfU c72664SfU = new C72664SfU(currentTimeMillis, LIZ, activity, this, LIZLLL, naviImage, aqS162S0100000_12);
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C47261Igj.LJJIJ(LIZIZ));
        C78764Uvg.LJIILJJIL(urlModel, new C32335CmZ(c72664SfU));
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LJ(Activity activity, View sharedElement, String str) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sharedElement, "sharedElement");
        Intent LJIILIIL = LJIILIIL(activity, "profile_photo_page", new C61658OHu(null, 7));
        LJIILIIL.putExtra("entry_point", 2);
        LJIILIIL.putExtra("edit_navi_id_key", str);
        LJIILJJIL(activity, sharedElement, LJIILIIL);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LIZJ(ActivityC45651qj activity, View view, String str, C61658OHu c61658OHu) {
        o.LJIIIZ(activity, "activity");
        Intent LJIILIIL = LJIILIIL(activity, "video_shoot_page", c61658OHu);
        LJIILIIL.putExtra("entry_point", 1);
        LJIILIIL.putExtra("edit_navi_starter_id_key", str);
        LJIILJJIL(activity, view, LJIILIIL);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LJII(ActivityC45651qj activity, View view, String str, C61658OHu c61658OHu) {
        o.LJIIIZ(activity, "activity");
        MutableLiveData<C76800UCe> mutableLiveData = c61658OHu.LIZJ;
        if (mutableLiveData != null) {
            L7I.LIZ.add(mutableLiveData);
        }
        Intent LJIILIIL = LJIILIIL(activity, "video_shoot_page", c61658OHu);
        LJIILIIL.putExtra("entry_point", 1);
        LJIILIIL.putExtra("edit_navi_id_key", str);
        LJIILJJIL(activity, view, LJIILIIL);
    }

    @Override // com.ss.android.ugc.aweme.IProfileNaviService
    public final void LJIIJ(Activity activity, View sharedElement, String enterFrom, C61658OHu config) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sharedElement, "sharedElement");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(config, "config");
        MutableLiveData<C76800UCe> mutableLiveData = config.LIZJ;
        if (mutableLiveData != null) {
            L7I.LIZ.add(mutableLiveData);
        }
        Intent LJIILIIL = LJIILIIL(activity, enterFrom, config);
        if (C53202KuM.LIZ()) {
            LJIILIIL.putExtra("entry_point", 1);
        } else {
            LJIILIIL.putExtra("entry_point", 0);
        }
        LJIILJJIL(activity, sharedElement, LJIILIIL);
    }
}
