package com.ss.android.ugc.aweme.main.assems;

import X.ARI;
import X.ActivityC45651qj;
import X.C03660Ck;
import X.C03880Dg;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C244299iL;
import X.C26227ARb;
import X.C2K0;
import X.C43722HDy;
import X.C43723HDz;
import X.C43868HJo;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C84193Sd;
import X.HE1;
import X.HG3;
import X.HJQ;
import X.InterfaceC55102Lju;
import X.RBX;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS170S0100000_4;
import ujb.o;

/* loaded from: classes8.dex */
public final class DialogAssem extends BaseMainContainerAssem implements MainDialogAbility, InterfaceC55102Lju {
    public final Handler LJLIL = new Handler();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 138));

    @Override // X.C8W0
    public final void onCreate() {
        Intent intent;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(DialogAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            intent = LIZ.getIntent();
        } else {
            intent = null;
        }
        v3(intent);
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 480406480) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.base.MainDialogAbility
    public final void Cb0() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        C26227ARb c26227ARb = new C26227ARb(LIZ);
        String LIZ2 = C03660Ck.LIZ(LIZ, R.string.xe, "activity.resources.getSt…onboarding_welcome_title)");
        Object[] objArr = new Object[1];
        String nickname = curUser.getNickname();
        if (o.LJJJJJL(nickname)) {
            nickname = "";
        }
        objArr[0] = nickname;
        String LLLZ = C16880lQ.LLLZ(LIZ2, Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c26227ARb.LJFF(LLLZ);
        c26227ARb.LIZIZ(LIZ.getResources().getString(R.string.sla));
        ARI ari = new ARI(LIZ);
        ari.LJII(C03660Ck.LIZ(LIZ, R.string.c2q, "activity.resources.getSt…ng(R.string.ba_landing_3)"), new AqS170S0100000_4(LIZ, 404));
        String string = LIZ.getResources().getString(R.string.c2r);
        kotlin.jvm.internal.o.LJIIIIZZ(string, "activity.resources.getSt…ng(R.string.ba_landing_4)");
        ari.LJIIIZ(string, C244299iL.LJLIL);
        ari.LJI = true;
        c26227ARb.LJIIL = ari;
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.base.MainDialogAbility
    public final void Qg() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        PopupManager.LJIIL(new C43868HJo(LIZ, ((MainBusinessAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), MainBusinessAbility.class)).getEnterFrom()));
    }

    @Override // X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLIL.removeCallbacksAndMessages(null);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onNewIntent(Intent intent) {
        DataCenter dataCenter;
        kotlin.jvm.internal.o.LJIIIZ(intent, "intent");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            ScrollSwitchStateManager LIZ2 = C84193Sd.LIZ(LIZ);
            if ((LIZ2.jv0(LIZ2.nv0("page_feed")) instanceof MainPageFragment) && (dataCenter = (DataCenter) this.LJLILLLLZI.getValue()) != null) {
                dataCenter.jv0(Boolean.FALSE, "lastTryShowGuideViewResult");
            }
        }
        v3(intent);
    }

    public final void v3(Intent intent) {
        ActivityC45651qj LIZ;
        String str;
        if (intent == null) {
            return;
        }
        try {
            C43722HDy c43722HDy = (C43722HDy) intent.getSerializableExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG");
            if (c43722HDy == null) {
                return;
            }
            c43722HDy.mNeedShowDialog = true;
            if (!C43723HDz.LJ(c43722HDy) || (LIZ = C212428Vi.LIZ(this)) == null) {
                return;
            }
            if (TextUtils.isEmpty(c43722HDy.mAppName)) {
                str = LIZ.getString(R.string.s7b);
            } else {
                str = c43722HDy.mAppName;
            }
            HJQ hjq = new HJQ(LIZ, str, "share saved", c43722HDy.mClientKey, new HE1(LIZ, c43722HDy));
            if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/opensdk/share/ui/DYShareResultPopDialog", "show", hjq, new Object[0], "void", new C65300Pk0(false, "()V", "-5923113538977029877")).LIZ) {
                hjq.show();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
    }
}
