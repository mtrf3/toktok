package com.ss.android.ugc.aweme.tag.assem;

import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C186997Vn;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C246669mA;
import X.C2U8;
import X.C32I;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C65777Prh;
import X.C78926UyI;
import X.C7FK;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.ORZ;
import X.SY4;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInterestLevel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SelectedWidgetAssem extends UIContentAssem {
    public final C214298b3 LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public View LJLJJI;
    public SY4 LJLJJL;
    public String LJLJJLL;

    public SelectedWidgetAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoTagFriendsListViewModel.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1037), C246669mA.INSTANCE, null);
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C7FK.class, null), checkSupervisorPrepared());
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1036));
        this.LJLJJLL = "click_close";
    }

    public final VideoTagFriendsListViewModel A3() {
        return (VideoTagFriendsListViewModel) this.LJLIL.getValue();
    }

    public final void x3() {
        boolean z;
        this.LJLJJLL = "click_done";
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        VideoTagFriendsListViewModel A3 = A3();
        A3.getClass();
        Intent intent = new Intent();
        if (A3.iv0().size() != A3.gv0().getTagged().size()) {
            z = true;
        } else {
            z = false;
        }
        List<IMUser> LLJI = ORZ.LLJI(A3.iv0());
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLJI, 10));
        for (IMUser iMUser : LLJI) {
            if (!z && !A3.gv0().getTagged().contains(iMUser)) {
                z = true;
            }
            arrayList.add(IMUser.toInteractionTagUserInfo(iMUser));
        }
        List<InteractionTagUserInfo> LIZIZ = C65777Prh.LIZIZ(arrayList);
        if (z) {
            Aweme aweme = A3.gv0().getAweme();
            if (aweme != null) {
                InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
                if (interactionTagInfo != null) {
                    interactionTagInfo.setTaggedUsers(LIZIZ);
                } else {
                    aweme.setInteractionTagInfo(new InteractionTagInfo(InteractionTagInterestLevel.UNDEFINED.getLevel(), "", LIZIZ));
                }
                C2U8.LIZ(new InteractionTagInfoEvent(aweme));
            }
            intent.putExtra("tagged_user_list", new ArrayList(LIZIZ));
            intent.putExtra("need_update", z);
        }
        LIZ.setResult(-1, intent);
        LIZ.finish();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r2, "click_close") != false) goto L9;
     */
    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel r5 = r6.A3()
            java.lang.String r4 = r6.LJLJJLL
            r5.getClass()
            java.lang.String r0 = "closeType"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "click_done"
            boolean r0 = kotlin.jvm.internal.o.LJ(r4, r0)
            if (r0 == 0) goto L18
            r5.LJLLLL = r4
        L18:
            boolean r0 = X.C186997Vn.LIZJ()
            java.lang.String r3 = "close_tag_mention_page"
            if (r0 == 0) goto L42
            java.lang.String r2 = r5.LJLLLL
            java.lang.String r1 = "other"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 == 0) goto L39
        L2a:
            r4 = r1
        L2b:
            kotlin.jvm.internal.AqS58S1100000_4 r1 = new kotlin.jvm.internal.AqS58S1100000_4
            r0 = 33
            r1.<init>(r5, r4, r0)
            X.C7DS.LIZIZ(r3, r1)
        L35:
            super.onDestroy()
            return
        L39:
            java.lang.String r1 = "click_close"
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r0 == 0) goto L2b
            goto L2a
        L42:
            kotlin.jvm.internal.AqS58S1100000_4 r1 = new kotlin.jvm.internal.AqS58S1100000_4
            r0 = 34
            r1.<init>(r5, r4, r0)
            X.C7DS.LIZIZ(r3, r1)
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tag.assem.SelectedWidgetAssem.onDestroy():void");
    }

    public final void C3(boolean z) {
        SY4 sy4 = this.LJLJJL;
        if (sy4 != null) {
            sy4.setLoading(z);
            A3().LJLLI = z;
        } else {
            o.LJIJI("button");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        if (!C186997Vn.LIZJ()) {
            C8VV.LIZJ(this, new AqS170S0100000_4(this, 791));
        }
        View findViewById = getContainerView().findViewById(R.id.ar5);
        o.LJIIIIZZ(findViewById, "containerView.bottom_selected_widget");
        this.LJLJJI = findViewById;
        SY4 sy4 = (SY4) getContainerView().findViewById(R.id.cez);
        C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 186));
        this.LJLJJL = sy4;
        if (((Boolean) this.LJLJI.getValue()).booleanValue()) {
            View view2 = this.LJLJJI;
            if (view2 != null) {
                view2.setVisibility(0);
            } else {
                o.LJIJI("widget");
                throw null;
            }
        }
        C8YN.LJIILLIIL(this, A3(), null, new AqS186S0100000_4(this, 196), 3);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.94c
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLJJI;
            }
        }, null, new AqS167S0200000_4(this, LIZ, 21), 6);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9f7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C242289f6) obj).LJLJJL;
            }
        }, null, new AqS167S0200000_4(this, LIZ, 22), 6);
    }

    public final void v3(boolean z) {
        if (z) {
            this.LJLJJLL = "click_done";
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            ASQ.LJ(LIZLLL, ASX.LIZ);
        }
        A3().mv0(z);
    }
}
