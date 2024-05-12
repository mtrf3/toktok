package com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request;

import X.AnonymousClass325;
import X.C115794gZ;
import X.C214298b3;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72380Sau;
import X.C72381Sav;
import X.C72382Saw;
import X.C72383Sax;
import X.C72384Say;
import X.C77339UWx;
import X.C84643Tw;
import X.C95743pK;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GroupDetailRequestCell extends PowerCell<C95743pK> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.b37;
    }

    public final TextView L() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-tvInviter>(...)");
        return (TextView) value;
    }

    public final TextView M() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-tvName>(...)");
        return (TextView) value;
    }

    public GroupDetailRequestCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GroupDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 518);
        C115794gZ c115794gZ = C115794gZ.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72381Sav.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 519), new AqS162S0100000_12(this, 619), C72384Say.INSTANCE, c115794gZ, new AqS162S0100000_12(this, 620), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72382Saw.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 520), new AqS151S0100000_1((InterfaceC93923mO) this, 514), C72383Sax.INSTANCE, c115794gZ, new AqS162S0100000_12(this, 618), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72380Sau.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 515), new AqS151S0100000_1((InterfaceC93923mO) this, 516), new AqS151S0100000_1((InterfaceC93923mO) this, 517), c115794gZ, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 511));
        this.LJLJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 522));
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 521));
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 512));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 513));
    }

    public static void N(IMUser iMUser) {
        if (iMUser == null) {
            return;
        }
        IUserProfilePreload LJIIIIZZ = UserProfilePreloadHelper.LJIIIIZZ();
        User user = IMUser.toUser(iMUser);
        o.LJIIIIZZ(user, "toUser(user)");
        LJIIIIZZ.LIZJ(user);
        AnonymousClass325 anonymousClass325 = AnonymousClass325.LIZ;
        String uid = iMUser.getUid();
        anonymousClass325.getClass();
        AnonymousClass325.LIZIZ(uid, "chat_request", null, null);
        C84643Tw.LIZLLL(iMUser.getUid(), "chat_request", null, null, 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0120, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L32;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C95743pK r21) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request.GroupDetailRequestCell.onBindItemView(X.Mm4):void");
    }
}
