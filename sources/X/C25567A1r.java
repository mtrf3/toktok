package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenItem;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenUser;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HideAccountViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A1r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25567A1r extends C8HS<HiddenItem> {
    public final HideAccountViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25567A1r(HideAccountViewModel viewModel) {
        super(false, 1, null);
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8HS
    public final void setData(List<HiddenItem> list) {
        C61878OQg c61878OQg;
        List list2 = this.mmItems;
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        if (list == 0) {
            c61878OQg = C61878OQg.INSTANCE;
        } else {
            c61878OQg = list;
        }
        C03150Al LIZ = C03200Aq.LIZ(new C25556A1g(list2, c61878OQg), true);
        this.mmItems = list;
        LIZ.LIZJ(this);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        boolean z2;
        int i2;
        ViewOnClickListenerC25566A1q viewOnClickListenerC25566A1q;
        String string;
        int i3;
        List<HiddenItem> data = getData();
        if (data != null && (viewHolder instanceof ViewOnClickListenerC25566A1q) && (viewOnClickListenerC25566A1q = (ViewOnClickListenerC25566A1q) viewHolder) != null) {
            HiddenItem item = (HiddenItem) ListProtector.get(data, i);
            o.LJIIIZ(item, "item");
            viewOnClickListenerC25566A1q.LJLIL = item;
            HiddenUser user = item.getUser();
            if (user == null) {
                user = new HiddenUser(null, null, null, 0, 0, null, 63, null);
            }
            C71799SFv.LJIIJ(viewOnClickListenerC25566A1q.LJLJI, user.getAvatar(), null, false, null, 126);
            viewOnClickListenerC25566A1q.LJLJJI.setText(user.getNickname());
            viewOnClickListenerC25566A1q.LJLJJL.setText(viewOnClickListenerC25566A1q.itemView.getContext().getResources().getQuantityString(R.plurals.gc, user.getVideoCount(), C77123UOp.LJJIIJ(user.getVideoCount())));
            viewOnClickListenerC25566A1q.LJLJJLL.setText(viewOnClickListenerC25566A1q.itemView.getContext().getResources().getQuantityString(R.plurals.gb, user.getFollowerCount(), C77123UOp.LJJIIJ(user.getFollowerCount())));
            TuxTextView tuxTextView = viewOnClickListenerC25566A1q.LJLJL;
            String bioContent = user.getBioContent();
            if (bioContent.length() == 0) {
                bioContent = C88913eJ.LIZ(viewOnClickListenerC25566A1q.itemView, R.string.h10, "itemView.context.getStri…ttings_pref_subtitle_bio)");
            }
            tuxTextView.setText(bioContent);
            SY4 sy4 = viewOnClickListenerC25566A1q.LJLJLJ;
            if (item.isHidden()) {
                string = viewOnClickListenerC25566A1q.itemView.getContext().getString(R.string.h0z);
            } else {
                string = viewOnClickListenerC25566A1q.itemView.getContext().getString(R.string.h0y);
            }
            sy4.setText(string);
            SY4 sy42 = viewOnClickListenerC25566A1q.LJLJLJ;
            if (item.isHidden()) {
                i3 = 5;
            } else {
                i3 = 0;
            }
            sy42.setButtonVariant(i3);
            viewOnClickListenerC25566A1q.LJLJLJ.getClass();
        }
        int basicItemCount = getBasicItemCount();
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            o.LJIIIIZZ(view, "it.itemView");
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i == basicItemCount - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            int LIZIZ = C7MY.LIZIZ(8);
            int LIZIZ2 = C7MY.LIZIZ(6);
            Integer LIZIZ3 = C19N.LIZIZ(view, "view.context", R.attr.cl);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = LIZIZ3;
            if (z) {
                float f = LIZIZ;
                c110614Vt.LJIIIIZZ = Float.valueOf(f);
                c110614Vt.LJIIIZ = Float.valueOf(f);
            }
            if (z2) {
                float f2 = LIZIZ;
                c110614Vt.LJIIJ = Float.valueOf(f2);
                c110614Vt.LJIIJJI = Float.valueOf(f2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{C06460Ne.LIZ(view, "view.context", c110614Vt)});
            int i4 = 0;
            layerDrawable.setLayerInset(0, 0, 0, 0, 0);
            view.setBackground(layerDrawable);
            if (z) {
                i2 = LIZIZ2;
            } else {
                i2 = 0;
            }
            if (z2) {
                i4 = LIZIZ2;
            }
            C26338AVi.LJIIIZ(view, 0, Integer.valueOf(i2), 0, Integer.valueOf(i4), 16);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.agn, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new ViewOnClickListenerC25566A1q(view);
    }
}
