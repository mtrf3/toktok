package X;

import Y.ACListenerS24S0101000_5;
import Y.ACListenerS47S0200000_13;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.MultiLiveCancelFromConfirmInviteDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tda, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75094Tda extends AbstractC76218Tvi<LinkPlayerInfo> {
    public final DataChannel LJLIL;
    public InterfaceC75125Te5 LJLILLLLZI;
    public MultiGuestDataHolder LJLJI;
    public final C31597Caf LJLJJI;
    public final View LJLJJL;
    public final View LJLJJLL;
    public final C47121t6 LJLJL;
    public final C47121t6 LJLJLJ;
    public final C2A7 LJLJLLL;
    public final LiveIconView LJLL;
    public final ImageView LJLLI;
    public final C2A7 LJLLILLLL;

    @Override // X.AbstractC76218Tvi
    public final void LJJJJIZL() {
        this.LJLILLLLZI = null;
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    public static final boolean N(User user) {
        long j;
        long id = user.getId();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (id == j) {
            return true;
        }
        return false;
    }

    public final void M(LinkPlayerInfo data) {
        int i;
        o.LJIIIZ(data, "data");
        this.itemView.setTag(R.id.ln3, data.mUser.getIdStr());
        User user = data.mUser;
        C31597Caf c31597Caf = this.LJLJJI;
        C31665Cbl.LJIIJ(c31597Caf, user.getAvatarThumb(), c31597Caf.getWidth(), c31597Caf.getHeight(), R.drawable.cuk);
        this.LJLJL.setText(C05170If.LIZ(user));
        if (N(user)) {
            this.LJLJLJ.setText(C15380j0.LJIILJJIL(R.string.n41));
            this.LJLJLJ.setVisibility(0);
            this.LJLJJL.setVisibility(0);
            this.LJLJJLL.setVisibility(0);
        } else {
            this.LJLJLJ.setVisibility(8);
            this.LJLJJL.setVisibility(8);
            this.LJLJJLL.setVisibility(8);
            String LJFF = C74896TaO.LJFF(0, data);
            if ((!TextUtils.isEmpty(LJFF)) && LJFF != null) {
                this.LJLJLJ.setVisibility(0);
                this.LJLJLJ.setText(LJFF);
            }
        }
        C75116Tdw c75116Tdw = new C75116Tdw(data.LIZ, data.mRoleType);
        this.LJLLILLLL.setVisibility(8);
        this.LJLLILLLL.setEnabled(true);
        this.LJLJLLL.setVisibility(8);
        this.LJLJLLL.setEnabled(true);
        this.LJLLI.setVisibility(8);
        this.LJLL.setVisibility(8);
        User user2 = data.mUser;
        o.LJIIIIZZ(user2, "item.user");
        if (N(user2)) {
            i = 0;
        } else {
            i = data.LIZIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type = ");
        LIZ.append(i);
        C0NB.LJ("MultiLiveLinkPanelUserInfo", X1D.LIZIZ(LIZ));
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.LJLLILLLL.setVisibility(0);
                    C16880lQ.LJJIII(this.LJLLILLLL, new ACListenerS47S0200000_13(this, data, 37));
                    if (data.mRoleType != 3) {
                        this.LJLLILLLL.setText(C15380j0.LJIILJJIL(R.string.lzb));
                        this.LJLLILLLL.setEnabled(true);
                    } else {
                        this.LJLLILLLL.setText(C15380j0.LJIILJJIL(R.string.jvd));
                        this.LJLLILLLL.setEnabled(false);
                    }
                    if (data.permissionAsViewer == 2) {
                        this.LJLLILLLL.setEnabled(false);
                    }
                    DataChannel dataChannel = this.LJLIL;
                    if (dataChannel != null) {
                        dataChannel.mv0(MultiLiveCancelFromConfirmInviteDialogEvent.class, this, new AqS179S0100000_13(this, 495));
                    }
                }
            } else if (data.LIZ == 4) {
                this.LJLJLLL.setVisibility(0);
                this.LJLJLLL.setText(C15380j0.LJIILJJIL(R.string.n8i));
                C16880lQ.LJJIII(this.LJLJLLL, ViewOnClickListenerC75132TeC.LJLIL);
                this.LJLJLLL.setEnabled(false);
                this.LJLLI.setVisibility(0);
                C16880lQ.LJIILLIIL(this.LJLLI, new ACListenerS47S0200000_13(this, data, 34));
            } else {
                this.LJLJLLL.setEnabled(true);
                this.LJLJLLL.setVisibility(0);
                this.LJLJLLL.setText(C15380j0.LJIILJJIL(R.string.k1p));
                C16880lQ.LJJIII(this.LJLJLLL, new ACListenerS47S0200000_13(this, data, 35));
                this.LJLLI.setVisibility(0);
                C16880lQ.LJIILLIIL(this.LJLLI, new ACListenerS47S0200000_13(this, data, 36));
            }
        } else if (data.mUser != null) {
            this.LJLL.setVisibility(0);
            if (C74945TbB.LIZIZ(Boolean.valueOf(TV3.LIZJ()))) {
                this.LJLL.setIconAttr(R.attr.auc);
            }
            C16880lQ.LJJII(this.LJLL, new ACListenerS47S0200000_13(this, data, 33));
        }
        C16880lQ.LJJIJIIJI(this.LJLJJI, new ACListenerS24S0101000_5(i, data, 13));
        this.itemView.setTag(R.id.ln4, c75116Tdw);
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        LinkPlayerInfo data = (LinkPlayerInfo) obj;
        o.LJIIIZ(data, "data");
        M(data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75094Tda(View view, DataChannel dataChannel, InterfaceC75125Te5 interfaceC75125Te5, MultiGuestDataHolder dataHolder) {
        super(view);
        o.LJIIIZ(dataHolder, "dataHolder");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = interfaceC75125Te5;
        this.LJLJI = dataHolder;
        View findViewById = view.findViewById(R.id.f67);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.iv_list_user_avatar)");
        this.LJLJJI = (C31597Caf) findViewById;
        View findViewById2 = view.findViewById(R.id.a1u);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.anchor_block_up)");
        this.LJLJJL = findViewById2;
        View findViewById3 = view.findViewById(R.id.a1t);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.anchor_block_down)");
        this.LJLJJLL = findViewById3;
        View findViewById4 = view.findViewById(R.id.mpz);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.tv_user_name)");
        this.LJLJL = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.mgz);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.tv_relationship)");
        this.LJLJLJ = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.aui);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.btn_accept)");
        this.LJLJLLL = (C2A7) findViewById6;
        View findViewById7 = view.findViewById(R.id.f4x);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…c_kick_off_or_disconnect)");
        this.LJLL = (LiveIconView) findViewById7;
        View findViewById8 = view.findViewById(R.id.e_5);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.ic_reject_apply)");
        this.LJLLI = (ImageView) findViewById8;
        View findViewById9 = view.findViewById(R.id.awu);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.btn_invite)");
        this.LJLLILLLL = (C2A7) findViewById9;
    }
}
