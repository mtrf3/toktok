package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.morequeue;

import X.C16880lQ;
import X.C212428Vi;
import X.C26338AVi;
import X.C32151Nz;
import X.C91200Zqm;
import X.C91264Zro;
import X.C91355ZtH;
import X.C91395Ztv;
import X.O6R;
import Y.IDObserverS226S0100000_29;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class MoreQueueAssem extends BaseDspItemReusedAssem {
    public TuxIconView LLFII;
    public C91395Ztv LLFZ;
    public TuxActionSheet LLI;

    public MoreQueueAssem() {
        new LinkedHashMap();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        String str;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        C91395Ztv c91395Ztv2 = this.LLFZ;
        if (c91395Ztv2 != null) {
            str = c91395Ztv2.LJLJJL;
        } else {
            str = null;
        }
        if (!o.LJ(str, item.LJLJJL)) {
            TuxActionSheet tuxActionSheet = this.LLI;
            if (tuxActionSheet != null) {
                tuxActionSheet.dismiss();
            }
            this.LLI = null;
        }
        this.LLFZ = item;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxIconView tuxIconView;
        int i;
        MutableLiveData OO;
        o.LJIIIZ(view, "view");
        if (!(view instanceof TuxIconView) || (tuxIconView = (TuxIconView) view) == null) {
            return;
        }
        this.LLFII = tuxIconView;
        IContainerUtilityAbility a4 = a4();
        boolean z = false;
        if (a4 != null && a4.jG()) {
            i = O6R.LJJIIZ(C32151Nz.LJIIZILJ(20));
        } else {
            i = 0;
        }
        C26338AVi.LJI(tuxIconView, null, null, null, Integer.valueOf(i), false, 23);
        IContainerUtilityAbility a42 = a4();
        if (a42 != null) {
            z = a42.w7();
        }
        if (z) {
            TuxIconView tuxIconView2 = this.LLFII;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(R.raw.icon_list_music_note);
            } else {
                o.LJIJI("moreRootView");
                throw null;
            }
        } else {
            TuxIconView tuxIconView3 = this.LLFII;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_ellipsis_horizontal);
            } else {
                o.LJIJI("moreRootView");
                throw null;
            }
        }
        IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
        if (LIZ != null && (OO = LIZ.OO()) != null) {
            OO.observe(this, new IDObserverS226S0100000_29(this, 16));
        }
        TuxIconView tuxIconView4 = this.LLFII;
        if (tuxIconView4 != null) {
            C16880lQ.LJJJ(tuxIconView4, new C91355ZtH(this));
            if (b4()) {
                IXTabPanelAbility LJFF = C91264Zro.LJFF(this);
                TuxIconView tuxIconView5 = this.LLFII;
                if (tuxIconView5 != null) {
                    C91200Zqm.LIZIZ(tuxIconView5, C212428Vi.LIZLLL(this), LJFF);
                    return;
                } else {
                    o.LJIJI("moreRootView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("moreRootView");
        throw null;
    }
}
