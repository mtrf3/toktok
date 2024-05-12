package com.ss.android.ugc.aweme.views;

import X.AbstractViewOnClickListenerC55470Lpq;
import X.ActivityC45651qj;
import X.C145995oB;
import X.C61658OHu;
import X.C71310Ryk;
import X.C72706SgA;
import X.C72707SgB;
import X.C74499TLr;
import X.GXR;
import X.InterfaceC65784Pro;
import X.InterfaceC74330TFe;
import X.InterfaceC88473Ynt;
import X.RTP;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IProfileNaviService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.List;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDlS19S0200000_12 extends AbstractViewOnClickListenerC55470Lpq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDlS19S0200000_12 iDlS19S0200000_12, View view) {
        InterfaceC74330TFe LJ = ((EffectInfoStickerHandler) iDlS19S0200000_12.l0).LJ();
        if (LJ != null) {
            LJ.QM((Effect) iDlS19S0200000_12.l1, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$1(IDlS19S0200000_12 iDlS19S0200000_12, View view) {
        C74499TLr c74499TLr = (C74499TLr) iDlS19S0200000_12.l0;
        ProviderEffect providerEffect = (ProviderEffect) c74499TLr.LJLIL;
        if (providerEffect != null) {
            InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDlS19S0200000_12.l1;
            if (c74499TLr.N(providerEffect)) {
                interfaceC88473Ynt.invoke(providerEffect, Integer.valueOf(c74499TLr.LJLJI), c74499TLr.LJLILLLLZI);
            }
        }
    }

    public static final void LIZ$2(IDlS19S0200000_12 iDlS19S0200000_12, View view) {
        ((InterfaceC65784Pro) iDlS19S0200000_12.l1).invoke();
    }

    public static final void LIZ$3(IDlS19S0200000_12 iDlS19S0200000_12, View view) {
        if (((C71310Ryk) iDlS19S0200000_12.l0).LJLJI) {
            ((View.OnClickListener) iDlS19S0200000_12.l1).onClick(view);
        }
    }

    public static final void LIZ$4(IDlS19S0200000_12 iDlS19S0200000_12, View view) {
        boolean z;
        String str;
        String str2;
        C72707SgB c72707SgB = ((C72706SgA) iDlS19S0200000_12.l0).LJLJLLL;
        FrameLayout view2 = (FrameLayout) iDlS19S0200000_12.l1;
        c72707SgB.getClass();
        o.LJIIIZ(view2, "view");
        Integer selectedIndex = c72707SgB.LJI.Hv0(c72707SgB.LJFF).getSelectedIndex();
        List<RTP> avatarList = c72707SgB.LJI.Hv0(c72707SgB.LJFF).getAvatarList();
        if (avatarList == null || selectedIndex == null) {
            return;
        }
        if (((RTP) ListProtector.get(avatarList, selectedIndex.intValue())).LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        IProfileNaviService LJIIL = ProfileNaviServiceImpl.LJIIL();
        if (z) {
            ActivityC45651qj activityC45651qj = c72707SgB.LIZ;
            if (!LJIIL.LJI(activityC45651qj, c72707SgB.LJI.Hv0(activityC45651qj).getAvatarCountSelf()) || (str = ((RTP) ListProtector.get(avatarList, selectedIndex.intValue())).LIZIZ) == null) {
                return;
            }
            c72707SgB.LJ.invoke();
            LJIIL.LIZJ(c72707SgB.LIZ, view2, str, new C61658OHu(null, 6));
        } else {
            c72707SgB.LJ.invoke();
            str = ((RTP) ListProtector.get(avatarList, selectedIndex.intValue())).LIZ;
            if (str == null) {
                return;
            } else {
                LJIIL.LJII(c72707SgB.LIZ, view2, str, new C61658OHu((MutableLiveData) c72707SgB.LJIILIIL.getValue(), 2));
            }
        }
        int avatarCountSelf = c72707SgB.LJI.Hv0(c72707SgB.LJFF).getAvatarCountSelf();
        int avatarCountCandidate = c72707SgB.LJI.Hv0(c72707SgB.LJFF).getAvatarCountCandidate();
        String LJI = c72707SgB.LIZLLL.LJI();
        o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZLLL("enter_from", "tiktok_avatar_effect_intro_show");
        c145995oB.LIZLLL("enter_method", "click");
        c145995oB.LIZLLL("creation_id", LJI);
        c145995oB.LIZLLL("avatar_template_id", str);
        if (avatarCountSelf != 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c145995oB.LIZLLL("tiktok_avatar_flag", str2);
        c145995oB.LIZ(avatarCountSelf, "user_avatar_count");
        c145995oB.LIZ(avatarCountCandidate, "candidate_avatar_count");
        GXR.LIZ("click_edit_avatar_template_button", c145995oB.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS19S0200000_12(C74499TLr c74499TLr, IDqS436S0100000_12 iDqS436S0100000_12, int i) {
        super(600L);
        this.$t = i;
        this.l0 = c74499TLr;
        this.l1 = iDqS436S0100000_12;
    }

    public IDlS19S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
