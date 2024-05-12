package com.ss.android.ugc.aweme.tag.assem;

import X.C10K;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C242429fK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BE;
import X.InterfaceC242259f3;
import X.InterfaceC246829mQ;
import X.InterfaceC64592gB;
import X.SYL;
import X.T16;
import X.TBT;
import Y.ACallableS107S0100000_4;
import Y.AfS56S0100000_4;
import Y.AgS122S0100000_4;
import Y.IDrS44S0100000_4;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tag.FriendsListCell;
import com.ss.android.ugc.aweme.tag.SectionCell;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class VideoTagFriendsListAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public SYL LJLILLLLZI;
    public C73305Spp LJLJI;
    public final C62822Ol8 LJLJJI;
    public Boolean LJLJJL;

    public VideoTagFriendsListAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagFriendsListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1039), C242429fK.INSTANCE, null);
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1038));
    }

    public final void v3() {
        C73306Spq c73306Spq = (C73306Spq) this.LJLJJI.getValue();
        if (c73306Spq != null) {
            C73305Spp c73305Spp = this.LJLJI;
            if (c73305Spp != null) {
                c73305Spp.setStatus(c73306Spq);
                C73305Spp c73305Spp2 = this.LJLJI;
                if (c73305Spp2 != null) {
                    c73305Spp2.setVisibility(0);
                    return;
                } else {
                    o.LJIJI("statusView");
                    throw null;
                }
            }
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C73305Spp c73305Spp = (C73305Spp) getContainerView().findViewById(R.id.kf_);
        o.LJIIIIZZ(c73305Spp, "containerView.status_view");
        this.LJLJI = c73305Spp;
        c73305Spp.LJFF();
        c73305Spp.setVisibility(0);
        SYL syl = (SYL) getContainerView().findViewById(R.id.dof);
        o.LJIIIIZZ(syl, "containerView.friends_list");
        this.LJLILLLLZI = syl;
        syl.LLLF.LJZL(FriendsListCell.class, SectionCell.class);
        syl.setItemAnimator(null);
        syl.LJIIJJI(new IDrS44S0100000_4(this, 6));
        VideoTagFriendsListViewModel videoTagFriendsListViewModel = (VideoTagFriendsListViewModel) this.LJLIL.getValue();
        ((ArrayList) videoTagFriendsListViewModel.LJLLILLLL).clear();
        Aweme aweme = videoTagFriendsListViewModel.gv0().getAweme();
        if (aweme != null && (true ^ TextUtils.isEmpty(aweme.getAid()))) {
            InterfaceC246829mQ interfaceC246829mQ = (InterfaceC246829mQ) videoTagFriendsListViewModel.LJLIL.getValue().getOperator();
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aid");
            interfaceC246829mQ.mentionAwemeCheck(CastLongProtector.parseLong(aid)).LJJL(T16.LIZ()).LJJJLIIL(new AfS56S0100000_4(videoTagFriendsListViewModel, 89), new InterfaceC64592gB() { // from class: X.9Fm
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
        }
        C10K LIZJ = C10K.LIZJ(new ACallableS107S0100000_4(videoTagFriendsListViewModel, 6));
        o.LJIIIIZZ(LIZJ, "private fun loadAllFrien…ckground allFriends\n    }");
        LIZJ.LJ(new AgS122S0100000_4(videoTagFriendsListViewModel, 3), C10K.LJIIIIZZ, null);
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9fC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 197), 4);
        C8VC.LJIIJ(this, C65352Pkq.LIZ(InterfaceC242259f3.class), new TBT() { // from class: X.9fD
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RM) obj).LIZIZ;
            }
        }, new TBT() { // from class: X.9fF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9RM) obj).LIZ;
            }
        }, new AqS186S0100000_4(this, 198));
        C8YN.LJII(this, (AssemViewModel) this.LJLIL.getValue(), new TBT() { // from class: X.9fE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 199), 4);
    }
}
