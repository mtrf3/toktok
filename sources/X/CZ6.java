package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CZ6 extends RecyclerView.ViewHolder {
    public final C47121t6 LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final ImageView LJLJJI;
    public final C47061t0 LJLJJL;
    public final C47061t0 LJLJJLL;
    public final FrameLayout LJLJL;
    public final C47131t7 LJLJLJ;

    public CZ6(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.user_name)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.imu);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.rank_num)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.l7a);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.ticket_count)");
        this.LJLJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.my0);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.user_avatar)");
        this.LJLJJI = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f82);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.iv_on_going)");
        this.LJLJJL = (C47061t0) findViewById5;
        View findViewById6 = view.findViewById(R.id.eyl);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.iv_avatar_border)");
        this.LJLJJLL = (C47061t0) findViewById6;
        View findViewById7 = view.findViewById(R.id.eym);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.…_avatar_border_container)");
        this.LJLJL = (FrameLayout) findViewById7;
        this.LJLJLJ = (C47131t7) view;
    }

    public final void L(C78006UjS data, boolean z, DataChannel dataChannel, CZ9 itemEventListener) {
        List<String> list;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(itemEventListener, "itemEventListener");
        itemEventListener.LIZ(data.LIZ);
        RankListV2Response.RankInfo rankInfo = data.LIZ;
        C16880lQ.LJIIJ(new CZ7(itemEventListener, data), this.itemView);
        C47121t6 c47121t6 = this.LJLILLLLZI;
        c47121t6.setTextColor(C78934UyQ.LJIILL(rankInfo.rank, data.LIZIZ.LIZIZ));
        String str = rankInfo.rankStr;
        boolean z2 = C31512CYi.LIZIZ;
        C78934UyQ.LJJIIJZLJL(c47121t6, str, z2);
        long j = rankInfo.rank;
        RankTypeV2 rankTypeV2 = data.LIZIZ.LIZIZ;
        C47131t7 c47131t7 = this.LJLJLJ;
        if (rankTypeV2.style == 1) {
            if (j == 1) {
                Resources resources = c47131t7.getResources();
                C55632Gh<C47131t7> c55632Gh = c47131t7.LJLJJI;
                if (c55632Gh != null) {
                    c55632Gh.LLLZZ(resources, R.array.bp, R.array.bn);
                }
            } else if (j == 2) {
                Resources resources2 = c47131t7.getResources();
                C55632Gh<C47131t7> c55632Gh2 = c47131t7.LJLJJI;
                if (c55632Gh2 != null) {
                    c55632Gh2.LLLZZ(resources2, R.array.bq, R.array.bn);
                }
            } else if (j == 3) {
                Resources resources3 = c47131t7.getResources();
                C55632Gh<C47131t7> c55632Gh3 = c47131t7.LJLJJI;
                if (c55632Gh3 != null) {
                    c55632Gh3.LLLZZ(resources3, R.array.br, R.array.bn);
                }
            } else {
                Resources resources4 = c47131t7.getResources();
                C55632Gh<C47131t7> c55632Gh4 = c47131t7.LJLJJI;
                if (c55632Gh4 != null) {
                    c55632Gh4.LLLZZ(resources4, R.array.bo, R.array.bn);
                }
            }
        } else {
            Resources resources5 = c47131t7.getResources();
            C55632Gh<C47131t7> c55632Gh5 = c47131t7.LJLJJI;
            if (c55632Gh5 != null) {
                c55632Gh5.LLLZZ(resources5, R.array.bo, R.array.bn);
            }
        }
        C78934UyQ.LJJIIJZLJL(this.LJLIL, C05170If.LIZ(rankInfo.user), z2);
        C78934UyQ.LJJIIJZLJL(this.LJLJI, rankInfo.scoreDescription, z2);
        User user = rankInfo.user;
        o.LJIIIIZZ(user, "user");
        if (C30922CBq.LIZIZ) {
            this.LJLJI.setTag(C05170If.LIZ(user));
        }
        if (z) {
            BQO LIZ = C15650jR.LIZ();
            ImageModel avatarThumb = rankInfo.user.getAvatarThumb();
            if (avatarThumb != null) {
                list = avatarThumb.getUrls();
            } else {
                list = null;
            }
            C78720Uuy LIZ2 = LIZ.LIZ(list);
            LIZ2.LJIIL = Boolean.TRUE;
            LIZ2.LIZLLL(ImageView.ScaleType.CENTER_CROP);
            int width = this.LJLJJI.getWidth();
            int height = this.LJLJJI.getHeight();
            LIZ2.LJ = width;
            LIZ2.LJFF = height;
            LIZ2.LJIIIIZZ = R.drawable.d65;
            LIZ2.LJIIJJI(this.LJLJJI);
            BorderInfo LIZ3 = C29504Bi0.LIZ(rankInfo.user);
            if (LIZ3 != null) {
                int LJFF = C15380j0.LJFF(R.dimen.ag3);
                int LIZ4 = C15380j0.LIZ(2.5f);
                FrameLayout frameLayout = this.LJLJL;
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.width = LJFF;
                layoutParams.height = LJFF;
                frameLayout.setLayoutParams(layoutParams);
                C29306Beo.LJJLI(LIZ4, this.LJLJJL);
                C29306Beo.LJJJJJL(LIZ4, this.LJLJJL);
                C15620jO.LIZIZ(LIZ3.icon, this.LJLJJLL);
                this.LJLJJLL.setVisibility(0);
                String str2 = data.LIZIZ.LIZIZ.rankName;
                User user2 = rankInfo.user;
                o.LJIIIIZZ(user2, "user");
                C31522CYs.LJIIJJI(str2, user2, LIZ3, dataChannel, data.LIZIZ.LJ);
            } else if (rankInfo.roomId > 0) {
                int LJFF2 = C15380j0.LJFF(R.dimen.ag4);
                FrameLayout frameLayout2 = this.LJLJL;
                ViewGroup.LayoutParams layoutParams2 = frameLayout2.getLayoutParams();
                layoutParams2.width = LJFF2;
                layoutParams2.height = LJFF2;
                frameLayout2.setLayoutParams(layoutParams2);
                C29306Beo.LJJLI(0, this.LJLJJL);
                C29306Beo.LJJJJJL(0, this.LJLJJL);
                C15620jO.LIZ(this.LJLJJLL, R.drawable.d_t);
                this.LJLJJLL.setVisibility(0);
            } else {
                this.LJLJJLL.setVisibility(8);
            }
            if (rankInfo.roomId > 0) {
                C47061t0 c47061t0 = this.LJLJJL;
                if (C78688UuS.LJLILLLLZI == null) {
                    C78688UuS.LJLILLLLZI = C15510jD.LJIIIZ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_item_rank_top_on_going_hd.webp");
                }
                C15490jB.LIZJ(c47061t0, C78688UuS.LJLILLLLZI);
                KL2.LJIILLIIL(0, this.LJLJJL);
                return;
            }
            KL2.LJIILLIIL(8, this.LJLJJL);
        }
    }
}
