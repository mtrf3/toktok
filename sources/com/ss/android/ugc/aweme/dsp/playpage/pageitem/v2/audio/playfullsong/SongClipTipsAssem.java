package com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.playfullsong;

import X.C16880lQ;
import X.C17N;
import X.C212428Vi;
import X.C214348b8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C91200Zqm;
import X.C91218Zr4;
import X.C91249ZrZ;
import X.C91264Zro;
import X.C91395Ztv;
import X.C91562Zwc;
import X.C9BD;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.IDCListenerS84S0200000_29;
import Y.IDObserverS226S0100000_29;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.BaseDspItemReusedAssem;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpirePlayableVM;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.IXTabPanelAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class SongClipTipsAssem extends BaseDspItemReusedAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final InterfaceC115514g7 LLFII;
    public C91395Ztv LLFZ;
    public View LLI;
    public TuxTextView LLIFFJFJJ;
    public View LLII;

    static {
        TBT tbt = new TBT(SongClipTipsAssem.class, "expireVM", "getExpireVM()Lcom/ss/android/ugc/aweme/dsp/playerservice/plugin/expired/ExpirePlayableVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    public SongClipTipsAssem() {
        new LinkedHashMap();
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ExpirePlayableVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c9bd, new IDqS421S0100000_29(LIZ, 41), null, C91562Zwc.INSTANCE, null, null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C91395Ztv c91395Ztv) {
        View view;
        Context context;
        String str;
        View view2;
        C91395Ztv item = c91395Ztv;
        o.LJIIIZ(item, "item");
        this.LLFZ = item;
        if (item.LJLJJLL) {
            Object LIZ = this.LLFII.LIZ(this, LLIIII[0]);
            String str2 = item.LJLJJL;
            boolean z = item.LJLJJLL;
            LIZ.getClass();
            if (ExpirePlayableVM.gv0(str2, z)) {
                View view3 = this.LLI;
                if ((view3 != null && view3.getVisibility() == 4) || (view2 = this.LLI) == null) {
                    return;
                }
                view2.setVisibility(4);
                return;
            }
            View view4 = this.LLI;
            if (view4 != null) {
                C17N.LJJLIIIJJI(view4);
            }
            if (!b4() || (context = getContext()) == null) {
                return;
            }
            String str3 = item.LJLLI;
            String str4 = item.LJLJJI.LJI;
            if (C91218Zr4.LIZLLL(context)) {
                str = "other_app";
            } else {
                str = "app_store";
            }
            C91249ZrZ.LJIIL("preview_mode_tips", null, str4, "resso", str3, str, 34);
            return;
        }
        View view5 = this.LLI;
        if ((view5 != null && view5.getVisibility() == 4) || (view = this.LLI) == null) {
            return;
        }
        view.setVisibility(4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        MutableLiveData OO;
        MutableLiveData<C76800UCe> ej;
        o.LJIIIZ(view, "view");
        this.LLI = view;
        this.LLIFFJFJJ = (TuxTextView) view.findViewById(R.id.il);
        this.LLII = view.findViewById(R.id.ik);
        IAudioCardUIStateAbility LIZ = C91264Zro.LIZ(this);
        if (LIZ != null && (ej = LIZ.ej()) != null) {
            ej.observe(this, new IDObserverS226S0100000_29(this, 20));
        }
        C16880lQ.LJIIJ(new IDCListenerS84S0200000_29(view, this, 2), view);
        if (b4()) {
            IXTabPanelAbility LJFF = C91264Zro.LJFF(this);
            View view2 = this.LLI;
            if (view2 != null) {
                C91200Zqm.LIZIZ(view2, C212428Vi.LIZLLL(this), LJFF);
            }
        }
        IAudioCardUIStateAbility LIZ2 = C91264Zro.LIZ(this);
        if (LIZ2 != null && (OO = LIZ2.OO()) != null) {
            OO.observe(this, new IDObserverS226S0100000_29(this, 21));
        }
    }
}
