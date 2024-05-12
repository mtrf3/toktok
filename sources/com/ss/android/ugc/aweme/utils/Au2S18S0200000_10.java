package com.ss.android.ugc.aweme.utils;

import X.ActivityC45651qj;
import X.C188727au;
import X.C27498Aqk;
import X.C45804HyK;
import X.FMX;
import X.OH6;
import X.OH8;
import X.TAT;
import X.WM7;
import X.X1D;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.SparkNavigationFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightTag;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicResourceBitStruct;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class Au2S18S0200000_10 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S18S0200000_10 au2S18S0200000_10, View view) {
        FragmentManager supportFragmentManager;
        if (view != null) {
            Context context = ((CommerceProductInfoView) au2S18S0200000_10.l0).getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                SparkNavigationFragment sparkNavigationFragment = new SparkNavigationFragment();
                String str = ((UserRightTag) au2S18S0200000_10.l1).schema;
                o.LJIIIZ(str, "<set-?>");
                sparkNavigationFragment.LJLILLLLZI = str;
                String string = ((CommerceProductInfoView) au2S18S0200000_10.l0).getContext().getString(R.string.f5e);
                o.LJIIIIZZ(string, "this@CommerceProductInfo…_rights_freereturn_title)");
                sparkNavigationFragment.LJLJI = string;
                sparkNavigationFragment.LJLJJL = false;
                sparkNavigationFragment.LJLJJI = true;
                C27498Aqk.LIZ(supportFragmentManager, sparkNavigationFragment, null);
            }
            OH6 oh6 = ((CommerceProductInfoView) au2S18S0200000_10.l0).freeReturnListener;
            if (oh6 != null) {
                oh6.LIZ();
            }
        }
    }

    public static final void LIZ$1(Au2S18S0200000_10 au2S18S0200000_10, View view) {
        String schema;
        String str;
        String mid;
        MusicResourceBitStruct musicResourceBitStruct = ((OH8) au2S18S0200000_10.l0).LIZ.musicResourceBitStruct;
        if (musicResourceBitStruct == null || (schema = musicResourceBitStruct.getSchema()) == null) {
            return;
        }
        MusicResourceBitStruct musicResourceBitStruct2 = ((OH8) au2S18S0200000_10.l0).LIZ.musicResourceBitStruct;
        String str2 = "";
        if (musicResourceBitStruct2 == null || (str = musicResourceBitStruct2.getScene()) == null) {
            str = "";
        }
        Music music = ((OH8) au2S18S0200000_10.l0).LIZ.music;
        if (music != null && (mid = music.getMid()) != null) {
            str2 = mid;
        }
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(schema);
        LIZ.append("&open_timestamp=");
        LIZ.append(currentTimeMillis);
        SmartRouter.buildRoute(((MusicDetailNavBarAssem) au2S18S0200000_10.l1).getContext(), X1D.LIZIZ(LIZ)).open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "tt_mdp_page");
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, str);
        c188727au.LJIIIZ("clip_id", str2);
        FMX.LJIIL("enter_work_with_artist", c188727au.LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S18S0200000_10(OH8 oh8, MusicDetailNavBarAssem musicDetailNavBarAssem, int i) {
        super(500L);
        this.$t = i;
        this.l0 = oh8;
        this.l1 = musicDetailNavBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S18S0200000_10(CommerceProductInfoView commerceProductInfoView, UserRightTag userRightTag, int i) {
        super(700L);
        this.$t = i;
        this.l0 = commerceProductInfoView;
        this.l1 = userRightTag;
    }
}
