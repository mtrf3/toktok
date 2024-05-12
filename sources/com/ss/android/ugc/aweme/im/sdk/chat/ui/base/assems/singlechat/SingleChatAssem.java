package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.AbstractC89473fD;
import X.AnonymousClass325;
import X.AnonymousClass439;
import X.AnonymousClass444;
import X.AnonymousClass446;
import X.C100383wo;
import X.C101543yg;
import X.C1042547h;
import X.C214298b3;
import X.C221108m2;
import X.C42O;
import X.C43A;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73318Sq2;
import X.C73542Ste;
import X.C73893SzJ;
import X.C73969T1h;
import X.C78926UyI;
import X.C78999UzT;
import X.C80533Eb;
import X.C89333ez;
import X.C8VV;
import X.C98523to;
import X.C99033ud;
import X.C9BE;
import X.InterfaceC65350Pko;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SingleChatAssem extends UIContentAssem {
    public final C62822Ol8 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C214298b3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C73318Sq2 LJLJL;

    public SingleChatAssem() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 435));
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LIZJ(this, C89333ez.class, null), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 437));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 434));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ChatBusinessAccountViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 438), AnonymousClass439.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ClickToMsgViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ2, 439), C43A.INSTANCE, null);
        this.LJLJL = new C73318Sq2();
    }

    @Override // X.C8W0
    public final void onAssemPostCreate() {
        int i;
        super.onAssemPostCreate();
        IMUser LJIIJ = C80533Eb.LJIIJ(((C99033ud) this.LJLJI.getValue()).getSingleChatFromUserId(), null);
        if (C100383wo.LIZ() && !((C89333ez) this.LJLILLLLZI.getValue()).LJLILLLLZI && LJIIJ != null && LJIIJ.getUid() != null) {
            C1042547h.LJIIJ(((C99033ud) this.LJLJI.getValue()).getEnterFromForMob(), String.valueOf(LJIIJ.getFriendRecType()), String.valueOf(LJIIJ.getFollowStatus()));
        }
        C101543yg c101543yg = C101543yg.LIZ;
        if (LJIIJ != null) {
            i = LJIIJ.getFollowStatus();
        } else {
            i = -1;
        }
        c101543yg.getClass();
        C101543yg.LIZIZ = i;
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LJLJJI.getValue();
        if (chatRoomViewModel != null) {
            chatRoomViewModel.LJZI = new AqS151S0100000_1(this, 436);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        C98523to c98523to;
        ChatRoomViewModel chatRoomViewModel;
        C73893SzJ<AbstractC89473fD> c73893SzJ;
        AnonymousClass446 imAdLog;
        super.onCreate();
        ClickToMsgViewModel clickToMsgViewModel = (ClickToMsgViewModel) this.LJLJJLL.getValue();
        C99033ud c99033ud = ((C89333ez) clickToMsgViewModel.LJLIL.getValue()).LJLIL;
        if (c99033ud instanceof C98523to) {
            c98523to = (C98523to) c99033ud;
        } else {
            c98523to = null;
        }
        if (c98523to != null && c98523to.getEnterFrom() == 8001 && (imAdLog = c98523to.getImAdLog()) != null) {
            String adId = imAdLog.getAdId();
            o.LJIIIIZZ(adId, "it.adId");
            if (adId.length() > 0) {
                AnonymousClass444 anonymousClass444 = new AnonymousClass444(c98523to, imAdLog);
                anonymousClass444.LIZ();
                clickToMsgViewModel.LJLILLLLZI = anonymousClass444;
            }
        }
        if (((ClickToMsgViewModel) this.LJLJJLL.getValue()).LJLILLLLZI != null && (chatRoomViewModel = (ChatRoomViewModel) this.LJLJJI.getValue()) != null && (c73893SzJ = chatRoomViewModel.LJLLLL) != null) {
            C78999UzT.LJFF(C73542Ste.LJIIIIZZ(c73893SzJ.LJJJ(C73969T1h.LIZIZ()), null, null, new C42O((ClickToMsgViewModel) this.LJLJJLL.getValue()), 3), this.LJLJL);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJL.LIZLLL();
        AnonymousClass444 anonymousClass444 = ((ClickToMsgViewModel) this.LJLJJLL.getValue()).LJLILLLLZI;
        if (anonymousClass444 != null) {
            anonymousClass444.LIZJ();
        }
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
        String conversationId = ((C99033ud) this.LJLJI.getValue()).getConversationId();
        anonymousClass325.getClass();
        AnonymousClass325.LJII(conversationId);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VV.LIZJ(this, new AqS132S0200000_1(this, view, 23));
    }
}
