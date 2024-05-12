package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.InviteCardDetailInnerResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.model.GroupInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C255059zh extends TBS implements InterfaceC88472Yns<InviteCardDetailInnerResponse, C76800UCe> {
    public C255059zh(Object obj) {
        super(1, obj, C255099zl.class, "receiveGroupInviteDetailsOnSuccess", "receiveGroupInviteDetailsOnSuccess(Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/group/data/model/InviteCardDetailInnerResponse;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InviteCardDetailInnerResponse inviteCardDetailInnerResponse) {
        String str;
        String str2;
        int i;
        int i2;
        Integer groupSize;
        Integer groupSize2;
        InviteCardDetailInnerResponse p0 = inviteCardDetailInnerResponse;
        o.LJIIIZ(p0, "p0");
        C255099zl c255099zl = (C255099zl) this.receiver;
        c255099zl.getClass();
        c255099zl.LJLJI = p0.getGroup();
        if (p0.getInviteError() != null) {
            c255099zl.LIZLLL(p0.getGroup(), p0.getInviteError(), true);
        } else {
            Integer inviteeGroupStatus = p0.getInviteeGroupStatus();
            if (inviteeGroupStatus != null) {
                if (inviteeGroupStatus.intValue() == 3) {
                    GroupInviteViewModel groupInviteViewModel = c255099zl.LJLILLLLZI;
                    if (groupInviteViewModel != null) {
                        groupInviteViewModel.hv0(c255099zl.LJLIL);
                    } else {
                        o.LJIJI("invitationCheckViewModel");
                        throw null;
                    }
                } else if (inviteeGroupStatus != null && (inviteeGroupStatus.intValue() == 0 || inviteeGroupStatus.intValue() == 2 || inviteeGroupStatus.intValue() == 1)) {
                    LayoutInflater LLZIL = C16880lQ.LLZIL(c255099zl.LJLIL);
                    View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.b1h, null, false);
                    C62846OlW c62846OlW = (C62846OlW) LLLLIILL.findViewById(R.id.eec);
                    GroupInfo group = p0.getGroup();
                    if (group != null) {
                        str = group.getAvatarUrl();
                    } else {
                        str = null;
                    }
                    C45S.LIZJ(c62846OlW, C4AS.LJIIJ(str), "GroupInvitationProcessor");
                    View LLLLIILL2 = C16880lQ.LLLLIILL(LLZIL, R.layout.b1g, null, false);
                    TextView textView = (TextView) LLLLIILL2.findViewById(R.id.een);
                    GroupInfo group2 = p0.getGroup();
                    if (group2 != null) {
                        str2 = group2.getName();
                    } else {
                        str2 = null;
                    }
                    textView.setText(str2);
                    TextView textView2 = (TextView) LLLLIILL2.findViewById(R.id.eem);
                    Resources resources = c255099zl.LJLIL.getResources();
                    GroupInfo group3 = p0.getGroup();
                    if (group3 != null && (groupSize2 = group3.getGroupSize()) != null) {
                        i = groupSize2.intValue();
                    } else {
                        i = 0;
                    }
                    Object[] objArr = new Object[1];
                    GroupInfo group4 = p0.getGroup();
                    if (group4 != null && (groupSize = group4.getGroupSize()) != null) {
                        i2 = groupSize.intValue();
                    } else {
                        i2 = 0;
                    }
                    objArr[0] = Integer.valueOf(i2);
                    textView2.setText(resources.getQuantityString(R.plurals.g9, i, objArr));
                    TextView textView3 = (TextView) LLLLIILL2.findViewById(R.id.eel);
                    C116724i4 c116724i4 = new C116724i4();
                    Resources resources2 = c255099zl.LJLIL.getResources();
                    o.LJIIIIZZ(resources2, "activity.resources");
                    String[] strArr = new String[1];
                    String inviterName = p0.getInviterName();
                    if (inviterName == null) {
                        inviterName = "";
                    }
                    strArr[0] = inviterName;
                    c116724i4.LIZ(resources2, R.string.gw1, strArr);
                    textView3.setText(c116724i4.LIZ);
                    C26227ARb c26227ARb = new C26227ARb(c255099zl.LJLIL);
                    c26227ARb.LJII = false;
                    C78857UxB.LJJI(c26227ARb, LLLLIILL, null);
                    c26227ARb.LJIIJ = new ARU(LLLLIILL2);
                    C77123UOp.LJIILL(c26227ARb, new AqS135S0200000_4(p0, c255099zl, 145));
                    c26227ARb.LIZJ(new AqS170S0100000_4(c255099zl, 927));
                    C26231ARf LJI = c26227ARb.LJI();
                    c255099zl.LJLJJI.add(LJI);
                    LJI.LIZLLL();
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
