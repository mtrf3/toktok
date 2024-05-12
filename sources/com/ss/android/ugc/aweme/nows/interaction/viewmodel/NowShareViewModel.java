package com.ss.android.ugc.aweme.nows.interaction.viewmodel;

import X.ActivityC45651qj;
import X.C181847Bs;
import X.C196367nE;
import X.C198337qP;
import X.C2JJ;
import X.C33Q;
import X.C4LD;
import X.C4PS;
import X.C50420Jqa;
import X.C56802Ku;
import X.C7MT;
import X.C7NR;
import X.C7XD;
import X.EnumC181857Bt;
import X.InterfaceC194547kI;
import X.InterfaceC72642tA;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareService;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowShareViewModel extends NowInteractionBaseViewModel<C7MT> {
    public static final /* synthetic */ int LJLJI = 0;
    public volatile boolean LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7MT(0);
    }

    public final void jv0(EnumC181857Bt nowShareBtnFlipState, InterfaceC194547kI interfaceC194547kI) {
        o.LJIIIZ(nowShareBtnFlipState, "nowShareBtnFlipState");
        if (interfaceC194547kI != null) {
            C196367nE c196367nE = C196367nE.LIZ;
            String authorUid = interfaceC194547kI.getAweme().getAuthorUid();
            o.LJIIIIZZ(authorUid, "item.aweme.authorUid");
            c196367nE.getClass();
            if (C196367nE.LJI(authorUid)) {
                C4PS.LIZ.getClass();
                if (!C4PS.LIZ()) {
                    return;
                }
            }
        }
        withState(new AqS107S0300000_3(nowShareBtnFlipState, this, interfaceC194547kI, 17));
    }

    public static void iv0(ActivityC45651qj activityC45651qj, Aweme aweme, String enterFrom, String str, String str2, C181847Bs nowsFeedHierarchyData) {
        String str3;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(nowsFeedHierarchyData, "nowsFeedHierarchyData");
        C56802Ku c56802Ku = new C2JJ().LIZ;
        c56802Ku.LJIIIZ = str2;
        c56802Ku.LJII = str;
        C198337qP c198337qP = C198337qP.LJLIL;
        if (activityC45651qj == null || activityC45651qj.isFinishing()) {
            C7XD.LJ("InteractionDialogManager", "activity is null or isFinishing");
            return;
        }
        Bundle bundle = new Bundle();
        c56802Ku.LIZ(bundle);
        ShareService shareService = C4LD.LIZ;
        if (TextUtils.isEmpty(c56802Ku.LJII)) {
            str3 = "share_button";
        } else {
            str3 = c56802Ku.LJII;
            if (str3 == null) {
                str3 = "";
            }
        }
        C7NR c7nr = new C7NR(enterFrom, str3, aweme, c198337qP, bundle, c56802Ku.LJIIIZ, 1952);
        int LIZIZ = nowsFeedHierarchyData.LJLIL.LIZIZ();
        String str4 = nowsFeedHierarchyData.LJLJJL;
        String str5 = nowsFeedHierarchyData.LJLJJLL;
        String enterFrom2 = c7nr.LIZ;
        String enterMethod = c7nr.LIZIZ;
        Aweme aweme2 = c7nr.LIZJ;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = c7nr.LIZLLL;
        Bundle extras = c7nr.LJ;
        boolean z = c7nr.LJFF;
        String str6 = c7nr.LJI;
        String panelSource = c7nr.LJII;
        o.LJIIIZ(enterFrom2, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(aweme2, "aweme");
        o.LJIIIZ(extras, "extras");
        o.LJIIIZ(panelSource, "panelSource");
        shareService.LIZLLL(activityC45651qj, new C7NR(enterFrom2, enterMethod, aweme2, interfaceC72642tA, extras, z, str6, panelSource, LIZIZ, str4, str5));
    }
}
