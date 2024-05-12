package X;

import Y.ACListenerS29S0100000_9;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.feed.FollowRecommendItem;

/* renamed from: X.Ldw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54732Ldw extends AbstractC31414CUo<FollowRecommendItem, C54733Ldx> {
    public final InterfaceC54736Le0 LIZIZ;

    public C54732Ldw(LYT callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LIZIZ = callBack;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZLLL(C54733Ldx c54733Ldx) {
        long j;
        long j2;
        String str;
        Room room;
        Room room2;
        User owner;
        C54733Ldx holder = c54733Ldx;
        o.LJIIIZ(holder, "holder");
        FollowRecommendItem followRecommendItem = holder.LJLZ;
        if (followRecommendItem != null && (room2 = followRecommendItem.data) != null && (owner = room2.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        FollowRecommendItem followRecommendItem2 = holder.LJLZ;
        if (followRecommendItem2 != null && (room = followRecommendItem2.data) != null) {
            j2 = room.getId();
        } else {
            j2 = 0;
        }
        FollowRecommendItem followRecommendItem3 = holder.LJLZ;
        if (followRecommendItem3 != null) {
            str = followRecommendItem3.recommendReason;
        } else {
            str = null;
        }
        C73994T2g.LJJIJIIJI(0, j, j2, "live_cover_recommend", str);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C54733Ldx c54733Ldx, FollowRecommendItem followRecommendItem) {
        User owner;
        String str;
        String str2;
        ImageModel avatarThumb;
        List<String> urls;
        C54733Ldx holder = c54733Ldx;
        FollowRecommendItem item = followRecommendItem;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        holder.LJZ.setVisibility(8);
        holder.LJLJLJ.setVisibility(8);
        holder.LJLZ = item;
        Room room = item.data;
        String str3 = null;
        if (room != null) {
            InterfaceC05190Ih author = room.author();
            if (author != null && (avatarThumb = author.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null) {
                str = (String) ListProtector.get(urls, 0);
            } else {
                str = null;
            }
            C78765Uvh.LJIIIZ(holder.LJLLLL, str, -1, -1);
            if (!TextUtils.isEmpty(item.recommendReason)) {
                String str4 = item.recommendReason;
                o.LJIIIIZZ(str4, "interestUser.recommendReason");
                int parseInt = CastIntegerProtector.parseInt(str4);
                if (parseInt != 1) {
                    if (parseInt == 2) {
                        C1DG.LJI(holder.itemView, R.string.l9w, holder.LJZ);
                    }
                } else {
                    C1DG.LJI(holder.itemView, R.string.l9x, holder.LJZ);
                }
                holder.LJZ.setVisibility(0);
            }
            TextView textView = holder.LJLILLLLZI;
            User owner2 = room.getOwner();
            if (owner2 != null) {
                str2 = owner2.getUsername();
            } else {
                str2 = null;
            }
            User owner3 = room.getOwner();
            if (owner3 != null) {
                str3 = owner3.getNickName();
            }
            textView.setText(C56331M8x.LIZJ(str2, str3, false, true));
        }
        TuxTextView tuxTextView = holder.LJLLI;
        Context context = holder.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        tuxTextView.setText(AbstractViewOnClickListenerC54731Ldv.L(context));
        Room room2 = item.data;
        if (room2 != null && (owner = room2.getOwner()) != null && owner.getAuthenticationInfo() != null) {
            holder.LJLJLJ.setVisibility(0);
        }
        holder.LJLL.getLayoutParams().width = (int) C17N.LJIJJLI(131);
        holder.LJLLLLLL.setVisibility(0);
        C16880lQ.LJJJ(holder.LJLLLLLL, new ACListenerS29S0100000_9(holder, 148));
    }

    @Override // X.AbstractC31414CUo
    public final C54733Ldx LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.dii, parent, false);
        o.LJIIIIZZ(it, "it");
        return new C54733Ldx(it, this.LIZIZ);
    }
}
