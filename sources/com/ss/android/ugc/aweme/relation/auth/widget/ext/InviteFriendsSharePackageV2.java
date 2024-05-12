package com.ss.android.ugc.aweme.relation.auth.widget.ext;

import X.C16880lQ;
import X.C1EU;
import X.C4LD;
import X.C62358Ode;
import X.C62374Odu;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78999UzT;
import X.C86V;
import X.HG3;
import X.InterfaceC62225ObV;
import X.InterfaceC64592gB;
import X.InterfaceC88472Yns;
import X.OYK;
import X.OYL;
import X.RBX;
import X.T16;
import Y.AfS17S1100000_1;
import Y.AfS62S0100000_10;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.IInviteFriendsApi;
import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;
import com.ss.android.ugc.aweme.share.improve.pkg.LinkDefaultSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS32S1300000_10;
import ujb.o;

/* loaded from: classes11.dex */
public final class InviteFriendsSharePackageV2 extends LinkDefaultSharePackage {
    public static final OYL Companion = new OYL();
    public final C73318Sq2 compositeDisposable;
    public final boolean enableInviteSystem;
    public final String enterFrom;
    public final IInviteFriendsApi inviteFriendsApi;
    public final String inviteMode;
    public SmgSettingsModel smgSettingsModel;

    public final void LJIILLIIL() {
        this.compositeDisposable.LIZLLL();
    }

    public final void LJIJI() {
        C78999UzT.LJFF(this.inviteFriendsApi.getInviteFriendsSettings().LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS62S0100000_10(this, 20), OYK.LJLIL), this.compositeDisposable);
    }

    public final String LJIIZILJ() {
        String str;
        String text;
        User curUser = HG3.LJIILL().getCurUser();
        String str2 = null;
        if (curUser != null) {
            str = curUser.getNickname();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        SmgSettingsModel smgSettingsModel = this.smgSettingsModel;
        if (smgSettingsModel != null && (text = smgSettingsModel.getText()) != null) {
            str2 = o.LJJJJZI(text, "%@", str, false);
        }
        if (str2 == null) {
            try {
                String LJFF = C86V.LJFF(R.string.dv9);
                kotlin.jvm.internal.o.LJIIIIZZ(LJFF, "getString(R.string.contacts_invite_friends_text)");
                str2 = C16880lQ.LLLZ(LJFF, Arrays.copyOf(new Object[]{str}, 1));
                kotlin.jvm.internal.o.LJIIIIZZ(str2, "format(format, *args)");
            } catch (Throwable unused) {
                str2 = C86V.LJFF(R.string.dv9);
            }
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LIZIZ(Context context, InterfaceC62225ObV channel) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(channel, "channel");
        kotlin.jvm.internal.o.LJIIIZ(context, "context");
        SmgSettingsModel smgSettingsModel = this.smgSettingsModel;
        if (smgSettingsModel == null || (str = smgSettingsModel.getUrl()) == null || str.length() == 0) {
            str = "https://m.tiktok.com/invitef/download";
        }
        String LJIILL = LJIILL(str, channel.key());
        C4LD.LIZIZ.LJJIL(2, channel.key());
        LJIJ(LJIILL, new AqS32S1300000_10(channel, this, C62358Ode.LIZ(channel, this.itemType, LJIIZILJ()), context, 4));
        return true;
    }

    public final String LJIILL(String str, String str2) {
        String str3;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (this.enableInviteSystem) {
            str3 = "manual";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        String uri = C1EU.LIZIZ(str, "user_id", curUserId).appendQueryParameter("enter_from", this.enterFrom).appendQueryParameter("invitemode", this.inviteMode).appendQueryParameter("invitesystem", str3).appendQueryParameter("platform", str2).appendQueryParameter("copytype", CardStruct.IStatusCode.DEFAULT).build().toString();
        kotlin.jvm.internal.o.LJIIIIZZ(uri, "parse(this)\n            …)\n            .toString()");
        return uri;
    }

    public final void LJIJ(String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns) {
        C78999UzT.LJFF(this.inviteFriendsApi.shortenUrl(str).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS17S1100000_1(interfaceC88472Yns, str, 0), new InterfaceC64592gB() { // from class: X.3IX
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }), this.compositeDisposable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsSharePackageV2(String str, String enterFrom, boolean z, C62374Odu c62374Odu, int i) {
        super(c62374Odu);
        InviteFriendsApiService inviteFriendsApi;
        z = (i & 4) != 0 ? false : z;
        if ((i & 8) != 0) {
            inviteFriendsApi = InviteFriendsApiService.LIZIZ;
        } else {
            inviteFriendsApi = null;
        }
        kotlin.jvm.internal.o.LJIIIZ(enterFrom, "enterFrom");
        kotlin.jvm.internal.o.LJIIIZ(inviteFriendsApi, "inviteFriendsApi");
        this.inviteMode = str;
        this.enterFrom = enterFrom;
        this.enableInviteSystem = z;
        this.inviteFriendsApi = inviteFriendsApi;
        this.compositeDisposable = new C73318Sq2();
    }
}
