package com.ss.android.ugc.aweme.feed.assem.music.artistprofile;

import X.AJ9;
import X.AV1;
import X.C116724i4;
import X.C16880lQ;
import X.C188727au;
import X.C226668v0;
import X.C40084FoG;
import X.C7YO;
import X.C7YP;
import X.EnumC112694bZ;
import X.FMX;
import X.HG3;
import X.RBX;
import X.S3I;
import X.S3L;
import X.W5F;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ArtistProfileTuxSheetCell extends PowerCell<C7YP> {
    public SmartAvatarImageView LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxIconView LJLJJI;
    public RelationButton LJLJJL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.acc;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LJLIL = (SmartAvatarImageView) this.itemView.findViewById(R.id.a8e);
        this.LJLILLLLZI = (TuxTextView) this.itemView.findViewById(R.id.a8g);
        this.LJLJI = (TuxTextView) this.itemView.findViewById(R.id.a8f);
        this.LJLJJI = (TuxIconView) this.itemView.findViewById(R.id.a8d);
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.a8h);
        this.LJLJJL = relationButton;
        if (relationButton != null) {
            relationButton.setDataChangeListener(new AqS169S0100000_3(this, 207));
        }
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 70), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7YP c7yp, List payloads) {
        String str;
        String str2;
        C7YO c7yo;
        int i;
        int i2;
        C7YO c7yo2;
        RelationButton relationButton;
        Integer num;
        C7YP t = c7yp;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        UrlModel urlModel = t.LJLJJI;
        boolean z = true;
        if (urlModel != null) {
            W5F LIZLLL = C40084FoG.LIZLLL(urlModel, "artist_profile_artist_avatar");
            LIZLLL.LJJIIJ = this.LJLIL;
            S3I s3i = new S3I();
            s3i.LIZ = true;
            LIZLLL.LJIJJLI = new S3L(s3i);
            LIZLLL.LIZLLL = true;
            C16880lQ.LLJJJ(LIZLLL);
        }
        TuxTextView tuxTextView = this.LJLILLLLZI;
        String str3 = "";
        if (tuxTextView != null) {
            C116724i4 c116724i4 = new C116724i4();
            String str4 = t.LJLJJL;
            if (str4 == null) {
                str4 = "";
            }
            c116724i4.LIZIZ(str4);
            tuxTextView.setText(c116724i4.LIZ);
        }
        TuxTextView tuxTextView2 = this.LJLJI;
        if (tuxTextView2 != null) {
            C116724i4 c116724i42 = new C116724i4();
            String str5 = t.LJLJL;
            if (str5 != null) {
                str3 = str5;
            }
            c116724i42.LIZIZ(str3);
            tuxTextView2.setText(c116724i42.LIZ);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            AJ9.LIZLLL(context, tuxTextView2, t.LJLJJLL);
        }
        if (AV1.LJIJI(t.LJLILLLLZI) || t.LJLLI || t.LJLLILLLL || (num = t.LJLLJ) == null || num.intValue() != 1 || !((RBX) HG3.LJIILL()).isLogin()) {
            z = false;
        }
        Boolean bool = t.LJLLL;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2) && z) {
            RelationButton relationButton2 = this.LJLJJL;
            if (relationButton2 != null) {
                relationButton2.setVisibility(0);
            }
            TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(8);
            }
            User user = new User();
            user.setUid(t.LJLILLLLZI);
            user.setSecUid(t.LJLJI);
            user.setNickname(t.LJLJJL);
            Integer num2 = t.LJLJLJ;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            user.setFollowStatus(i);
            Integer num3 = t.LJLJLLL;
            if (num3 != null) {
                i2 = num3.intValue();
            } else {
                i2 = 0;
            }
            user.setFollowerStatus(i2);
            user.setPrivateAccount(t.LJLL);
            RelationButton relationButton3 = this.LJLJJL;
            if (relationButton3 != null) {
                C226668v0 c226668v0 = new C226668v0();
                c226668v0.LIZ = user;
                c226668v0.LIZIZ = false;
                c226668v0.LIZIZ(EnumC112694bZ.FRIENDS);
                relationButton3.LLIIIJ.LJJJJJL(c226668v0.LIZ());
            }
            C7YP item = getItem();
            if (item != null && (c7yo2 = item.LJLLLLLL) != null && (relationButton = this.LJLJJL) != null) {
                relationButton.setTracker(new AqS153S0100000_3(c7yo2, 1606));
            }
        } else {
            RelationButton relationButton4 = this.LJLJJL;
            if (relationButton4 != null) {
                relationButton4.setVisibility(8);
            }
            TuxIconView tuxIconView2 = this.LJLJJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(0);
            }
        }
        C7YP item2 = getItem();
        if (item2 != null && (c7yo = item2.LJLLLLLL) != null) {
            str = c7yo.LJLJJI;
        } else {
            str = null;
        }
        if (o.LJ(str, "single_song")) {
            if (o.LJ(t.LJLLL, bool2) && z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "single_song");
            c188727au.LJIIIZ("enter_method", "pop_up_sheet");
            c188727au.LIZLLL(getLayoutPosition(), "order");
            c188727au.LJIIIZ("to_user_id", t.LJLILLLLZI);
            c188727au.LJIIIZ("follow_button", str2);
            FMX.LJIIL("musician_profile_show", c188727au.LIZ);
        }
    }
}
