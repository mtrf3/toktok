package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.discovery.model.Category;
import com.ss.android.ugc.aweme.kids.discovery.model.Challenge;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MJy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56618MJy extends JZQ implements C8GY {
    public final Context LJLJI;
    public Category LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;

    @Override // X.AbstractC51777KTt, X.C8HS, X.C4II
    public final int getBasicItemCount() {
        if (super.getBasicItemCount() > 8 && this.LJLJLJ == 1) {
            return 9;
        }
        return super.getBasicItemCount();
    }

    public C56618MJy(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = context;
        this.LJLJJL = true;
        this.LJLJLJ = -1;
        this.LJLJLLL = context.getResources().getDimensionPixelSize(R.dimen.vz);
        this.LJLL = context.getResources().getDimensionPixelSize(R.dimen.vy);
    }

    @Override // X.AbstractC51777KTt
    public final RecyclerView.ViewHolder LJLZ(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return C8GX.LIZ(parent, "category", this, false);
    }

    @Override // X.MK7, X.C4II
    public final void onBindFooterViewHolder(RecyclerView.ViewHolder holder) {
        float f;
        List<T> list;
        o.LJIIIZ(holder, "holder");
        TextView textView = (TextView) holder.itemView.findViewById(R.id.nay);
        if (this.LJLJLJ == 1 && (list = this.mmItems) != 0 && list.size() > 8) {
            o.LJII(textView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            textView.setText(this.LJLJI.getString(R.string.hnl));
            f = 104.0f;
        } else {
            f = 14.0f;
        }
        holder.itemView.setLayoutParams(new ViewGroup.LayoutParams((int) KL2.LIZJ(EF7.LIZIZ(), f), (int) KL2.LIZJ(EF7.LIZIZ(), 133.0f)));
    }

    @Override // X.MK7, X.C4II
    public final RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup viewGroup) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.bfc, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new MK1(view, this);
    }

    @Override // X.AbstractC51777KTt
    public final void LJLLLLLL(RecyclerView.ViewHolder holder, int i) {
        C8GW c8gw;
        List<T> list;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof C8GW) && (c8gw = (C8GW) holder) != null && (list = this.mmItems) != 0) {
            Aweme aweme = (Aweme) ListProtector.get(list, i);
            int i2 = this.LJLJLLL;
            int i3 = this.LJLL;
            if (aweme != null) {
                View rootView = c8gw.itemView.getRootView();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rootView.getLayoutParams();
                if (marginLayoutParams.width != i2 || marginLayoutParams.height != i3) {
                    marginLayoutParams.width = i2;
                    marginLayoutParams.height = i3;
                    rootView.setLayoutParams(marginLayoutParams);
                }
                c8gw.N(aweme);
            }
            c8gw.LJLJJI = this.LJLJJL;
        }
    }

    @Override // X.C8GY
    public final void LLLILZ(View view, Aweme aweme, String str) {
        Challenge challenge;
        if (view == null) {
            return;
        }
        if (TextUtils.equals("view more", str)) {
            C39398FdC c39398FdC = C39398FdC.LIZ;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("enter_from", "discovery");
            c198517qh.LIZ.put("exit_method", "swipe_for_more");
            C39398FdC.LIZIZ("click_view_more_category", q.LIZJ(c198517qh.LIZ, "category_id", this.LJLJJLL, c198517qh, c39398FdC));
            Category category = this.LJLJJI;
            if (category != null && (challenge = category.challenge) != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "view.context");
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "//kids/discovery/gallery");
                buildRoute.withParam("title", challenge.challengeName);
                buildRoute.withParam("challenge_id", challenge.cid);
                buildRoute.withParam("feed_type", challenge.feedType);
                buildRoute.withParam("mob_enter_from", "swipe_for_more");
                buildRoute.open();
                return;
            }
            return;
        }
        if (aweme == null) {
            return;
        }
        C39398FdC c39398FdC2 = C39398FdC.LIZ;
        Bundle bundle = new Bundle();
        bundle.putString("group_id", aweme.getAid());
        bundle.putString("enter_from", "discovery");
        c39398FdC2.getClass();
        try {
            AppLogNewUtils.LIZJ("discover_preview_enter", bundle);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        SmartRoute buildRoute2 = SmartRouter.buildRoute(view.getContext(), "//kids/discovery/feed");
        buildRoute2.withParam("current_id", aweme.getAid());
        buildRoute2.withParam("enter_from", "category_details_page");
        buildRoute2.withParam("title", this.LJLJL);
        buildRoute2.withParam("challenge_id", this.LJLJJLL);
        buildRoute2.withParam("feed_type", this.LJLJLJ);
        buildRoute2.open();
    }
}
