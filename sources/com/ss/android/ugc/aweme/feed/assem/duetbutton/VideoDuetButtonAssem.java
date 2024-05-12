package com.ss.android.ugc.aweme.feed.assem.duetbutton;

import X.C16880lQ;
import X.C208848Ho;
import X.C214348b8;
import X.C32151Nz;
import X.C44498HdG;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.L2J;
import X.O6R;
import X.SY4;
import X.TBT;
import Y.ACListenerS38S0200000_3;
import Y.ARunnableS7S0101000_3;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoDuetButtonAssem extends BaseCellSlotComponent<VideoDuetButtonAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public SY4 LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(VideoDuetButtonAssem.class, "duetButtonVM", "getDuetButtonVM()Lcom/ss/android/ugc/aweme/feed/assem/duetbutton/VideoDuetButtonViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ad9;
    }

    public VideoDuetButtonAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(VideoDuetButtonViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 326), null, C208848Ho.INSTANCE, null, null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        Object LIZ = this.LLFZ.LIZ(this, LLI[0]);
        Aweme aweme = item.getAweme();
        LIZ.getClass();
        if (VideoDuetButtonViewModel.kv0(aweme)) {
            getContainerView().post(new ARunnableS7S0101000_3(0, this, 0));
            Y3().setVisibility(0);
            Aweme aweme2 = item.getAweme();
            o.LJIIIIZZ(aweme2, "item.aweme");
            String str = item.mEventType;
            o.LJIIIIZZ(str, "item.eventType");
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ2 = C44498HdG.LIZ();
            String authorUid = aweme2.getAuthorUid();
            o.LJIIIIZZ(authorUid, "authorUid");
            String aid = aweme2.getAid();
            o.LJIIIIZZ(aid, "aid");
            LIZ2.LJIIZILJ(str, authorUid, aid);
            return;
        }
        Y3().setVisibility(8);
        getContainerView().post(new ARunnableS7S0101000_3(8, this, 0));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        SY4 sy4 = (SY4) C7MY.LIZLLL(view, "view", R.id.cie, "view.findViewById(R.id.duet_btn)");
        this.LLFII = sy4;
        C16880lQ.LJJIZ(sy4, new ACListenerS38S0200000_3(this, view, 32));
        if (L2J.LIZ()) {
            SY4 sy42 = this.LLFII;
            if (sy42 != null) {
                ViewGroup.LayoutParams layoutParams = sy42.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C7MY.LIZIZ(32);
                    sy42.setLayoutParams(layoutParams);
                    sy42.setIconHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    sy42.setIconWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            o.LJIJI("duetButton");
            throw null;
        }
    }
}
