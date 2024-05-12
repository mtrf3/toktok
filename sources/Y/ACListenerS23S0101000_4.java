package Y;

import X.ABQ;
import X.ABS;
import X.ABU;
import X.ABV;
import X.AS4;
import X.ASC;
import X.ActivityC45651qj;
import X.ActivityC86117Xqz;
import X.C0H1;
import X.C255199zv;
import X.C255209zw;
import X.C25575A1z;
import X.C25848ACm;
import X.C26695Adn;
import X.C26696Ado;
import X.C26699Adr;
import X.C2U8;
import X.C38337F2v;
import X.C6ZT;
import X.C73969T1h;
import X.C76800UCe;
import X.C78248UnM;
import X.C86184Xs4;
import X.C9MU;
import X.C9UJ;
import X.C9VG;
import X.C9YC;
import X.C9YE;
import X.C9YH;
import X.DialogC254019y1;
import X.EnumC78973Uz3;
import X.HG3;
import X.InterfaceC236469Pu;
import X.InterfaceC26318AUo;
import X.InterfaceC26321AUr;
import X.InterfaceC88471Ynr;
import X.R47;
import X.RBX;
import X.T16;
import X.XXG;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditBioFragment;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditNicknameFragment;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.services.DoBStatusApi;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACListenerS23S0101000_4 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        switch (aCListenerS23S0101000_4.i1) {
            case 0:
                ((XXG) aCListenerS23S0101000_4.l0).onClick(view);
                return;
            default:
                InterfaceC26321AUr interfaceC26321AUr = ((C86184Xs4) aCListenerS23S0101000_4.l0).LJIIIIZZ;
                if (interfaceC26321AUr != null) {
                    ((InterfaceC26318AUo) interfaceC26321AUr).onRemoveAvatarVideo();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> listener = ((C26699Adr) aCListenerS23S0101000_4.l0).getListener();
        if (listener != 0) {
            Integer valueOf = Integer.valueOf(aCListenerS23S0101000_4.i1);
            Object tag = view.getTag();
            o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct");
            listener.invoke(valueOf, tag);
        }
    }

    public static final void onClick$10(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        String str;
        C255209zw.LIZLLL("name", ((C9YH) ListProtector.get(((C9YE) aCListenerS23S0101000_4.l0).LJLIL, aCListenerS23S0101000_4.i1)).LJLJJL);
        C9YE c9ye = (C9YE) aCListenerS23S0101000_4.l0;
        c9ye.getClass();
        IAccountUserService LJIILL = HG3.LJIILL();
        User user = null;
        if (LJIILL != null) {
            user = ((RBX) LJIILL).getCurUser();
        }
        if (user == null || (str = user.getNickname()) == null) {
            str = "";
        }
        ProfileEditNicknameFragment LIZ = C9VG.LIZ(C255199zv.LJI(user, "click_card", "nickname"), str);
        LIZ.setUserVisibleHint(true);
        FragmentManager supportFragmentManager = c9ye.LJLILLLLZI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "mActivity.supportFragmentManager");
        LIZ.show(supportFragmentManager, "EditNicknameDialog");
    }

    public static final void onClick$11(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        C255209zw.LIZLLL("phone_num", ((C9YH) ListProtector.get(((C9YE) aCListenerS23S0101000_4.l0).LJLIL, aCListenerS23S0101000_4.i1)).LJLJJL);
        final C9YE c9ye = (C9YE) aCListenerS23S0101000_4.l0;
        c9ye.getClass();
        IBindService LJFF = HG3.LJFF();
        ActivityC45651qj activityC45651qj = c9ye.LJLILLLLZI;
        Bundle LIZ = C0H1.LIZ("profile_bind_from", "click_mission_card");
        LIZ.putInt("phone_number_source", EnumC78973Uz3.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_PROFILE_MISSION_CARD.getValue());
        LJFF.bindMobile(activityC45651qj, "personal_homepage", LIZ, new R47() { // from class: X.2px
            @Override // X.R47
            public final void onResult(int i, int i2, Object obj) {
                if (i == 7 && i2 == 1) {
                    C26045AKb c26045AKb = new C26045AKb(C9YE.this.LJLILLLLZI);
                    c26045AKb.LJIIIIZZ(R.string.c9u);
                    c26045AKb.LJIIJ();
                    if (C59522Vg.LIZ()) {
                        ActivityC45651qj activityC45651qj2 = C9YE.this.LJLILLLLZI;
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(activityC45651qj2), C78613UtF.LIZJ, null, new C70572pp(activityC45651qj2, null), 2);
                    } else {
                        C77266UUc.LIZIZ.LJIJJLI(C9YE.this.LJLILLLLZI, 0);
                    }
                }
            }
        });
    }

    public static final void onClick$12(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View v) {
        String str;
        C255209zw.LIZLLL("bio", ((C9YH) ListProtector.get(((C9YE) aCListenerS23S0101000_4.l0).LJLIL, aCListenerS23S0101000_4.i1)).LJLJJL);
        C9YE c9ye = (C9YE) aCListenerS23S0101000_4.l0;
        o.LJIIIIZZ(v, "v");
        c9ye.getClass();
        IAccountUserService LJIILL = HG3.LJIILL();
        User user = null;
        if (LJIILL != null) {
            user = ((RBX) LJIILL).getCurUser();
        }
        if (user == null || (str = user.getSignature()) == null) {
            str = "";
        }
        ProfileEditBioFragment LIZ = C9UJ.LIZ("bio", str, C255199zv.LJI(user, "click_card", "bio"));
        LIZ.setUserVisibleHint(true);
        LIZ.LJLZ = new C78248UnM();
        FragmentManager supportFragmentManager = c9ye.LJLILLLLZI.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "mActivity.supportFragmentManager");
        LIZ.show(supportFragmentManager, "EditNicknameDialog");
    }

    public static final void onClick$13(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS23S0101000_4.l0;
        int i = aCListenerS23S0101000_4.i1;
        if (c86184Xs4.LIZJ()) {
            return;
        }
        c86184Xs4.LJIIL(i);
    }

    public static final void onClick$14(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        C86184Xs4 c86184Xs4 = (C86184Xs4) aCListenerS23S0101000_4.l0;
        int i = aCListenerS23S0101000_4.i1;
        if (c86184Xs4.LIZJ()) {
            return;
        }
        c86184Xs4.LJIILJJIL(i);
    }

    public static final void onClick$2(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        ASC asc = (ASC) aCListenerS23S0101000_4.l0;
        asc.LJLIL.LIZ((AS4) ListProtector.get(asc.LJLILLLLZI, aCListenerS23S0101000_4.i1));
    }

    public static final void onClick$3(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        ABS abs = ((ABQ) aCListenerS23S0101000_4.l0).LJLILLLLZI;
        if (abs != null) {
            abs.LJJIFFI(aCListenerS23S0101000_4.i1);
        }
    }

    public static final void onClick$4(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        ABV abv = ((ABU) aCListenerS23S0101000_4.l0).LJLJI;
        if (abv != null) {
            abv.LJJIFFI(aCListenerS23S0101000_4.i1);
        }
    }

    public static final void onClick$5(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        switch (aCListenerS23S0101000_4.i1) {
            case 0:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) ((ActivityC86117Xqz) aCListenerS23S0101000_4.l0);
                i18nSettingManageMyAccountActivity.getClass();
                DialogC254019y1 dialogC254019y1 = new DialogC254019y1(i18nSettingManageMyAccountActivity);
                I18nSettingManageMyAccountActivity.LLII(dialogC254019y1);
                long currentTimeMillis = System.currentTimeMillis();
                DoBStatusApi.LIZ.getClass();
                C25575A1z.LIZIZ.getDoBStatus().LJJL(T16.LIZ()).LJIJJLI(new AfS0S0000100_4(currentTimeMillis, 3)).LJIJJ(new AfS0S0000100_4(currentTimeMillis, 4)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0200000_4(i18nSettingManageMyAccountActivity, dialogC254019y1, 31), new AfS53S0200000_4(i18nSettingManageMyAccountActivity, dialogC254019y1, 32));
                return;
            default:
                PushSettingActivity pushSettingActivity = (PushSettingActivity) ((ActivityC86117Xqz) aCListenerS23S0101000_4.l0);
                ((C38337F2v) pushSettingActivity.LJLIL.LIZ()).LIZ(1, ((C25848ACm) pushSettingActivity.LJLJJI.LJLIL).LJZI);
                return;
        }
    }

    public static final void onClick$6(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.view.ReviewFilterItemView");
        InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> interfaceC88471Ynr = ((C26696Ado) aCListenerS23S0101000_4.l0).LJLILLLLZI;
        if (interfaceC88471Ynr != null) {
            Integer valueOf = Integer.valueOf(aCListenerS23S0101000_4.i1);
            Object tag = view.getTag();
            o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct");
            interfaceC88471Ynr.invoke(valueOf, tag);
        }
    }

    public static final void onClick$7(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        C26695Adn c26695Adn;
        C26695Adn c26695Adn2;
        o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.view.ReviewFilterItemView");
        C26695Adn c26695Adn3 = (C26695Adn) view;
        if (!o.LJ(((C26696Ado) aCListenerS23S0101000_4.l0).LJLJI, view) && (c26695Adn2 = ((C26696Ado) aCListenerS23S0101000_4.l0).LJLJI) != null) {
            c26695Adn2.LIZIZ(false);
        }
        C26696Ado c26696Ado = (C26696Ado) aCListenerS23S0101000_4.l0;
        c26696Ado.LJLJI = c26695Adn3;
        if (!o.LJ(c26696Ado.LJLJJI, view) && (c26695Adn = ((C26696Ado) aCListenerS23S0101000_4.l0).LJLJJI) != null) {
            c26695Adn.LIZIZ(false);
        }
        if (c26695Adn3.LJLJJI) {
            c26695Adn3.LIZIZ(false);
        } else {
            c26695Adn3.LIZ(false);
        }
        if (c26695Adn3.LJLJJI) {
            InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> interfaceC88471Ynr = ((C26696Ado) aCListenerS23S0101000_4.l0).LJLILLLLZI;
            if (interfaceC88471Ynr != null) {
                Integer valueOf = Integer.valueOf(aCListenerS23S0101000_4.i1);
                Object tag = c26695Adn3.getTag();
                o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct");
                interfaceC88471Ynr.invoke(valueOf, tag);
                return;
            }
            return;
        }
        InterfaceC88471Ynr<? super Integer, ? super ReviewFilterStruct, C76800UCe> interfaceC88471Ynr2 = ((C26696Ado) aCListenerS23S0101000_4.l0).LJLILLLLZI;
        if (interfaceC88471Ynr2 == null) {
            return;
        }
        interfaceC88471Ynr2.invoke(-1, null);
    }

    public static final void onClick$8(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        C9YC c9yc;
        InterfaceC236469Pu interfaceC236469Pu;
        if (!C6ZT.LIZ(view) && (interfaceC236469Pu = (c9yc = (C9YC) aCListenerS23S0101000_4.l0).LJLILLLLZI) != null) {
            interfaceC236469Pu.LIZ((LiveEventStruct) ListProtector.get(c9yc.LJLIL, aCListenerS23S0101000_4.i1));
        }
    }

    public static final void onClick$9(ACListenerS23S0101000_4 aCListenerS23S0101000_4, View view) {
        C255209zw.LIZLLL("photo", ((C9YH) ListProtector.get(((C9YE) aCListenerS23S0101000_4.l0).LJLIL, aCListenerS23S0101000_4.i1)).LJLJJL);
        ((C9YE) aCListenerS23S0101000_4.l0).getClass();
        C2U8.LIZ(new C9MU(1, ""));
    }

    public ACListenerS23S0101000_4(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
