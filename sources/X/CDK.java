package X;

import Y.ACListenerS25S0100000_5;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class CDK extends CDI {
    public final C47061t0 LJLIL;
    public final C47061t0 LJLILLLLZI;
    public final C47061t0 LJLJI;
    public final C47121t6 LJLJJI;
    public final C47061t0 LJLJJL;
    public final C47061t0 LJLJJLL;
    public final C47121t6 LJLJL;
    public final C47121t6 LJLJLJ;
    public final C47121t6 LJLJLLL;
    public final C47121t6 LJLL;
    public final C47121t6 LJLLI;
    public final C47121t6 LJLLILLLL;
    public final LiveIconView LJLLJ;
    public final /* synthetic */ CDG LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDK(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dgy, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLLL = cdg;
        this.LJLIL = (C47061t0) this.itemView.findViewById(R.id.da8);
        this.LJLILLLLZI = (C47061t0) this.itemView.findViewById(R.id.jit);
        this.LJLJI = (C47061t0) this.itemView.findViewById(R.id.l6f);
        this.LJLJJI = (C47121t6) this.itemView.findViewById(R.id.l6i);
        this.LJLJJL = (C47061t0) this.itemView.findViewById(R.id.l6b);
        this.LJLJJLL = (C47061t0) this.itemView.findViewById(R.id.l6c);
        this.LJLJL = (C47121t6) this.itemView.findViewById(R.id.l6g);
        this.LJLJLJ = (C47121t6) this.itemView.findViewById(R.id.l6j);
        this.LJLJLLL = (C47121t6) this.itemView.findViewById(R.id.l6d);
        this.LJLL = (C47121t6) this.itemView.findViewById(R.id.l6h);
        this.LJLLI = (C47121t6) this.itemView.findViewById(R.id.l6k);
        this.LJLLILLLL = (C47121t6) this.itemView.findViewById(R.id.l6e);
        this.LJLLJ = (LiveIconView) this.itemView.findViewById(R.id.ay8);
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        User user;
        User user2;
        User user3;
        o.LJIIIZ(holder, "holder");
        C23010vJ.LJ(600, this.LJLJJI);
        C23010vJ.LJ(700, this.LJLJL);
        C23010vJ.LJ(600, this.LJLJLJ);
        C23010vJ.LJ(600, this.LJLJLLL);
        C23010vJ.LJ(700, this.LJLL);
        C23010vJ.LJ(600, this.LJLLI);
        C23010vJ.LJ(600, this.LJLLILLLL);
        C47121t6 c47121t6 = this.LJLJJI;
        ImageModel imageModel = null;
        if (c47121t6 != null) {
            Object[] objArr = new Object[1];
            GetSubPrivilegeDetailResponse.Data data = this.LJLLL.LJLJI;
            if (data != null) {
                user = data.anchorDetail;
            } else {
                user = null;
            }
            objArr[0] = C05170If.LIZ(user);
            c47121t6.setText(C15380j0.LJIILL(R.string.ogv, objArr));
        }
        C47121t6 c47121t62 = this.LJLJL;
        if (c47121t62 != null) {
            GetSubPrivilegeDetailResponse.Data data2 = this.LJLLL.LJLJI;
            if (data2 != null) {
                user2 = data2.anchorDetail;
            } else {
                user2 = null;
            }
            c47121t62.setText(C05170If.LIZ(user2));
        }
        C47121t6 c47121t63 = this.LJLL;
        if (c47121t63 != null) {
            c47121t63.setText(C05170If.LIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LJ()));
        }
        LiveIconView liveIconView = this.LJLLJ;
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS25S0100000_5(this.LJLLL, 350));
        }
        C15490jB.LJ(this.LJLIL, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_discord_first_icon.png");
        C15490jB.LJ(this.LJLILLLLZI, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_discord_second_icon.png");
        C15490jB.LJ(this.LJLJI, "tiktok_live_watch_resource_demand_1", "ttlive_sub_privilege_detail_discord_second_icon.png");
        BQO LIZ = C15650jR.LIZ();
        GetSubPrivilegeDetailResponse.Data data3 = this.LJLLL.LJLJI;
        if (data3 != null && (user3 = data3.anchorDetail) != null) {
            imageModel = user3.getAvatarMedium();
        }
        LIZ.LJIIIZ(imageModel).LJIIJJI(this.LJLJJL);
        C15650jR.LIZ().LJIIIZ(((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ.getAvatarThumb()).LJIIJJI(this.LJLJJLL);
    }
}
