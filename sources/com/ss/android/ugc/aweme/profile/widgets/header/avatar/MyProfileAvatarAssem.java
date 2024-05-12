package com.ss.android.ugc.aweme.profile.widgets.header.avatar;

import X.APP;
import X.APQ;
import X.APR;
import X.APU;
import X.APV;
import X.AUA;
import X.AUD;
import X.AXO;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C245319jz;
import X.C252669vq;
import X.C255199zv;
import X.C43I;
import X.C44384HbQ;
import X.C47261Igj;
import X.C62562cu;
import X.C65352Pkq;
import X.C71799SFv;
import X.C76800UCe;
import X.C86184Xs4;
import X.C8VC;
import X.C9A9;
import X.C9KV;
import X.C9MU;
import X.C9PL;
import X.InterfaceC81252Vui;
import X.InterfaceC88472Yns;
import X.L69;
import X.ORZ;
import X.OSJ;
import X.QD3;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS297S0100000_4;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS12S1400000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS29S1300000_4;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;
import o3.IDaS467S0100000_4;
import o3.h0;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes5.dex */
public class MyProfileAvatarAssem extends ProfileAvatarAssem implements C9A9 {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public boolean LJLL;
    public final boolean LJLLI;

    public MyProfileAvatarAssem() {
        new LinkedHashMap();
        this.LJLLI = true;
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final void v3() {
        L69 l69 = this.LJLIL;
        if (l69 != null) {
            l69.LIZIZ(new ACListenerS24S0100000_4(this, 148));
        }
        L69 l692 = this.LJLIL;
        if (l692 != null) {
            l692.setOnLongClickListener(new IDCListenerS297S0100000_4(this, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final void x3() {
        C71799SFv avatar;
        InterfaceC81252Vui controller;
        Animatable LIZ;
        L69 l69 = this.LJLIL;
        if (l69 == null || (avatar = l69.getAvatar()) == null || (controller = avatar.getController()) == null || (LIZ = controller.LIZ()) == null) {
            return;
        }
        C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
        if (c9pl != null && c9pl.LJ && !LIZ.isRunning()) {
            LIZ.start();
        } else {
            if (!LIZ.isRunning()) {
                return;
            }
            LIZ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final APV C3() {
        return new APU(new AqS170S0100000_4(this, 706), new AqS61S0110000_4(C16880lQ.LLLZLL(), this, 2), APP.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final AvatarPresenter E3() {
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        AvatarPresenter avatarPresenter = this.LJLJI;
        if (avatarPresenter == null) {
            AvatarPresenter avatarPresenter2 = new AvatarPresenter();
            avatarPresenter2.initHeadUploadHelper(LIZ, LIZLLL);
            this.LJLJI = avatarPresenter2;
            return avatarPresenter2;
        }
        return avatarPresenter;
    }

    @Override // X.C9A9
    public final void LJIILLIIL() {
        O3(I3());
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final boolean isVisible() {
        if (AXO.LIZ()) {
            return H3().getState().LJLJJL;
        }
        C9PL c9pl = (C9PL) C8VC.LJIIIIZZ(this, C65352Pkq.LIZ(C9KV.class));
        if (c9pl != null && c9pl.LJ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem
    public final boolean L7() {
        return this.LJLLI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P3(C43I<? extends OSJ<Integer, Integer, ? extends Intent>> c43i) {
        OSJ osj;
        AUA aua;
        APR apr;
        UrlModel urlModel;
        List<String> LJJIJIL;
        AvatarPresenter avatarPresenter;
        C86184Xs4 headUploadHelper;
        if (c43i == null || (osj = (OSJ) c43i.LIZ) == null) {
            return;
        }
        int intValue = ((Number) osj.getFirst()).intValue();
        int intValue2 = ((Number) osj.getSecond()).intValue();
        Intent intent = (Intent) osj.getThird();
        if (intValue == 10002 && intent != null) {
            if (intValue2 == 0) {
                if (intent.getBooleanExtra("retake", false) && (avatarPresenter = this.LJLJI) != null && (headUploadHelper = avatarPresenter.getHeadUploadHelper()) != null) {
                    headUploadHelper.LJIIL(0);
                    return;
                }
                return;
            }
            Serializable serializableExtra = intent.getSerializableExtra("path");
            if ((serializableExtra instanceof UrlModel) && (urlModel = (UrlModel) serializableExtra) != null) {
                L69 l69 = this.LJLIL;
                if (l69 != null) {
                    l69.LJFF(new C62562cu(urlModel.getUrlList()));
                }
                L69 l692 = this.LJLIL;
                if (l692 != null) {
                    User I3 = I3();
                    if (I3 != null) {
                        List<String> list = I3.boldFields;
                        if (list != null) {
                            LJJIJIL = ORZ.LLIIJI("photo", list);
                        } else {
                            LJJIJIL = C47261Igj.LJJIJIL("photo");
                        }
                        I3.setBoldFields(LJJIJIL);
                    } else {
                        I3 = null;
                    }
                    l692.LJII(I3, null);
                }
            }
            if (!intent.getBooleanExtra("dismiss_dialog", false) || (aua = this.LJLJJI) == null || (apr = aua.LJFF) == null) {
                return;
            }
            apr.dismissDialog();
            return;
        }
        if (this.LJLJI == null) {
            return;
        }
        if (intent == null) {
            intent = new Intent();
        }
        intent.putExtra("extras_info", C255199zv.LJI(I3(), "click_card", "photo", "video"));
        AvatarPresenter avatarPresenter2 = this.LJLJI;
        if (avatarPresenter2 == null) {
            return;
        }
        avatarPresenter2.onActivityResult(intValue, intValue2, intent);
    }

    @QD3
    public final void onClickGuideCardEvent(C9MU c9mu) {
        File LIZLLL;
        if (c9mu != null && c9mu.LJLIL == 1) {
            AvatarPresenter E3 = E3();
            L69 l69 = this.LJLIL;
            Context context = getContext();
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            User I3 = I3();
            if (context == null) {
                return;
            }
            if (C255199zv.LJIIIZ()) {
                AUD.LIZ(l69, LIZ, I3, E3);
                return;
            }
            C86184Xs4 headUploadHelper = E3.getHeadUploadHelper();
            String str = null;
            if (headUploadHelper != null && (LIZLLL = headUploadHelper.LIZLLL()) != null) {
                str = LIZLLL.getPath();
            }
            if (LIZ == null) {
                return;
            }
            C245319jz c245319jz = new C245319jz();
            C252669vq c252669vq = new C252669vq();
            String string = LIZ.getString(R.string.clz);
            o.LJIIIIZZ(string, "activity.getString(R.str…nge_profile_cover_type_0)");
            c252669vq.LIZ = string;
            c252669vq.LJ = new ACListenerS21S0100000_1(new AqS29S1300000_4(str, LIZ, I3, E3, 4), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            C252669vq c252669vq2 = new C252669vq();
            String string2 = LIZ.getString(R.string.cm0);
            o.LJIIIIZZ(string2, "activity.getString(R.str…nge_profile_cover_type_1)");
            c252669vq2.LIZ = string2;
            c252669vq2.LJ = new ACListenerS21S0100000_1(new AqS12S1400000_4(str, LIZ, I3, l69, E3, 4), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LIZIZ(c252669vq, c252669vq2);
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            FragmentManager supportFragmentManager = LIZ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            LIZJ.show(supportFragmentManager, "aaa");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.header.avatar.ProfileAvatarAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        L69 l69 = this.LJLIL;
        APQ apq = new APQ(C44384HbQ.LJJZ(R.string.aoj), C44384HbQ.LJJZ(R.string.an5));
        if (l69 != null) {
            h0.LJIJI(l69, new IDaS467S0100000_4(apq, 0));
        }
        if (!AXO.LIZ()) {
            C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9KV.class), new TBT() { // from class: X.9Jl
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C9PL) obj).LIZLLL;
                }
            }, new AqS170S0100000_4(this, 707));
        } else {
            H3().qv0(new AqS170S0100000_4(this, 708));
        }
        AVExternalServiceImpl.LIZ().avatarService().registerDialogCallback(new AqS154S0100000_4(this, 734));
    }
}
