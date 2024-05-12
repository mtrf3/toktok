package com.ss.android.ugc.aweme.commercialize.tcm.view;

import X.C2055284u;
import X.C221108m2;
import X.C42952GtQ;
import X.C45336Hqm;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C73969T1h;
import X.C8T7;
import X.NH9;
import X.NHB;
import X.T16;
import Y.AfS53S0100000_1;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatusApi;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TcmOrderStatusBottomBarAssem extends BaseCellSlotComponent<TcmOrderStatusBottomBarAssem> implements BottomBarPriorityProtocol {
    public final C62822Ol8 LLFII;
    public ViewGroup LLFZ;
    public TuxTextView LLI;
    public int LLIFFJFJJ;
    public final TcmOrderStatusBottomBarAssem$descExpandModeProtocol$1 LLII;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cpw;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol
    public final void d1() {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "bottom_banner_tcm";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem$descExpandModeProtocol$1] */
    public TcmOrderStatusBottomBarAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 127));
        this.LLII = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarAssem$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                TcmOrderStatusBottomBarAssem.this.Y3().setVisibility(0);
            }
        };
    }

    public final BottomBarPriorityAbility q4() {
        return (BottomBarPriorityAbility) this.LLFII.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        ViewGroup viewGroup = this.LLFZ;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        BottomBarPriorityAbility q4 = q4();
        if (q4 != null) {
            q4.en(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLII));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        User user;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        ViewGroup viewGroup = this.LLFZ;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        if (aweme.getStarAtlasOrderId() != 0 && !TextUtils.equals(aweme.getAid(), String.valueOf(aweme.getStarAtlasOrderId()))) {
            NH9 nh9 = (NH9) NHB.LIZ.LIZ();
            String str = null;
            if (nh9 != null) {
                user = nh9.getCurrentUser();
            } else {
                user = null;
            }
            String authorUid = aweme.getAuthorUid();
            if (user != null) {
                str = user.getUid();
            }
            if (TextUtils.equals(authorUid, str)) {
                BottomBarPriorityAbility q4 = q4();
                if (q4 != null) {
                    q4.Es(this, Boolean.TRUE, new AqS132S0200000_1(this, item, 86));
                }
                Aweme aweme2 = item.getAweme();
                if (aweme2 == null) {
                    return;
                }
                TcmBarStatusApi tcmBarStatusApi = (TcmBarStatusApi) C45336Hqm.LIZIZ(TcmBarStatusApi.class, C42952GtQ.LIZ);
                String aid = aweme2.getAid();
                o.LJIIIIZZ(aid, "curAweme.aid");
                tcmBarStatusApi.getBarStatus("orders.AdTcmOrdersService", "TcmItemInfo", CastLongProtector.parseLong(aid), aweme2.getStarAtlasOrderId()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(this, 77), new AfS53S0100000_1(this, 78));
                return;
            }
        }
        ViewGroup viewGroup2 = this.LLFZ;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
        BottomBarPriorityAbility q42 = q4();
        if (q42 != null) {
            q42.en(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFZ = (ViewGroup) view.findViewById(R.id.d6i);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ago);
        this.LLI = tuxTextView;
        C2055284u.LIZJ(tuxTextView, null);
    }
}
