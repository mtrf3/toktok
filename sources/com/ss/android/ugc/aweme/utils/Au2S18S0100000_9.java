package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.C0JU;
import X.C188727au;
import X.C213228Yk;
import X.C245319jz;
import X.C252659vp;
import X.C47261Igj;
import X.C49606JdS;
import X.C53212KuW;
import X.C56042Lz4;
import X.C56045Lz7;
import X.C76800UCe;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LBV;
import X.MKM;
import X.TAT;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS28S0201000_12;
import Y.ACListenerS46S0200000_12;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class Au2S18S0100000_9 extends TAT {
    public final int $t;
    public Object l0;

    @Override // X.TAT
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
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S18S0100000_9(com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 800(0x320, double:3.953E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 500(0x1f4, double:2.47E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S18S0100000_9.<init>(com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment, int):void");
    }

    public static final void LIZ$0(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        if (view != null) {
            ((MKM) ((FashionMallFragment) au2S18S0100000_9.l0)._$_findCachedViewById(R.id.isn)).LJLJJL(C56042Lz4.LJLIL);
            ((FashionMallFragment) au2S18S0100000_9.l0).Gl();
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            LinkedHashMap LIZ = C0JU.LIZ("button_name", "back_to_top");
            LIZ.putAll(((FashionMallFragment) au2S18S0100000_9.l0).LJLLL);
            c56045Lz7.getClass();
            C56045Lz7.LIZLLL(LIZ);
        }
    }

    public static final void LIZ$1(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) au2S18S0100000_9.l0;
        NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment.LLJLIL;
        FragmentManager fragmentManager = stickerPropDetailFragment.getFragmentManager();
        if (fragmentManager == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (newFaceStickerBean.isEditable) {
            C252659vp LIZIZ = C49606JdS.LIZIZ(R.raw.icon_pen, R.string.fzj);
            LIZIZ.LJ = new ACListenerS46S0200000_12(stickerPropDetailFragment, newFaceStickerBean, 63);
            arrayList.add(LIZIZ);
        }
        C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.raw.icon_trash_bin, R.string.fyw);
        LIZIZ2.LIZJ = 1;
        LIZIZ2.LJ = new ACListenerS28S0201000_12(1, stickerPropDetailFragment, newFaceStickerBean, 0);
        arrayList.add(LIZIZ2);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJ(arrayList);
        c245319jz.LIZJ().show(fragmentManager, "mobileEffectActionList");
    }

    public static final void LIZ$2(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) au2S18S0100000_9.l0;
        NewFaceStickerBean newFaceStickerBean = stickerPropDetailFragment.LLJLIL;
        if (newFaceStickerBean == null) {
            stickerPropDetailFragment.Ql(view, false, false, false);
        } else {
            stickerPropDetailFragment.Ql(view, false, newFaceStickerBean.isFriendVideoPresent, newFaceStickerBean.isFollowerVideoPresent);
        }
    }

    public static final void LIZ$3(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        FragmentManager fragmentManager;
        MixVideosDialog mixVideosDialog = (MixVideosDialog) au2S18S0100000_9.l0;
        mixVideosDialog.getClass();
        String str = mixVideosDialog.LJLJJI;
        String str2 = mixVideosDialog.LJLJJLL;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str2);
        c188727au.LJIIIZ("playlist_id", str);
        FMX.LJIIL("manage_playlist", c188727au.LIZ);
        C252659vp LIZIZ = C49606JdS.LIZIZ(R.drawable.brq, R.string.fk2);
        LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS173S0100000_7(mixVideosDialog, 386), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        C252659vp LIZIZ2 = C49606JdS.LIZIZ(R.drawable.bro, R.string.clt);
        LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS173S0100000_7(mixVideosDialog, 387), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
        List LJJIJIL = C47261Igj.LJJIJIL(LIZIZ, LIZIZ2);
        if (!C213228Yk.LIZ || !C53212KuW.LIZ) {
            C252659vp LIZIZ3 = C49606JdS.LIZIZ(R.raw.icon_arrow_turn_up_right, R.string.r5_);
            LIZIZ3.LJ = new ACListenerS21S0100000_1(new AqS175S0100000_9(mixVideosDialog, 607), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            LJJIJIL.add(LIZIZ3);
        }
        C252659vp LIZIZ4 = C49606JdS.LIZIZ(R.drawable.brp, R.string.eg8);
        LIZIZ4.LIZJ = 1;
        LIZIZ4.LJ = new ACListenerS27S0100000_7(mixVideosDialog, 178);
        LJJIJIL.add(LIZIZ4);
        C245319jz c245319jz = new C245319jz();
        c245319jz.LJ(LJJIJIL);
        TuxActionSheet LIZJ = c245319jz.LIZJ();
        ActivityC45651qj mo49getActivity = mixVideosDialog.mo49getActivity();
        if (mo49getActivity != null) {
            fragmentManager = mo49getActivity.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        o.LJI(fragmentManager);
        LIZJ.show(fragmentManager, "MixVideosDialog");
    }

    public static final void LIZ$4(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        ((MixVideosDialog) au2S18S0100000_9.l0).wl();
    }

    public static final void LIZ$5(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        if (view != null) {
            ((LBV) au2S18S0100000_9.l0).LIZJ(1);
        }
    }

    public static final void LIZ$6(Au2S18S0100000_9 au2S18S0100000_9, View view) {
        if (view != null) {
            ((LBV) au2S18S0100000_9.l0).LIZJ(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S18S0100000_9(MixVideosDialog mixVideosDialog, int i) {
        super(500L);
        this.$t = i;
        this.l0 = mixVideosDialog;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S18S0100000_9(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }
}
