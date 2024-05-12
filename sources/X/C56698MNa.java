package X;

import Y.ACListenerS29S0100000_9;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityIcon;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityNoticePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MNa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56698MNa extends MMX<ActivityNoticePod> {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C56699MNb LL;
    public final Integer[] LLD;

    public final C119624mk c0() {
        return (C119624mk) this.LJLLLLLL.getValue();
    }

    public final LinearLayout f0() {
        return (LinearLayout) this.LJLLLL.getValue();
    }

    public final TuxTextView g0() {
        return (TuxTextView) this.LJLL.getValue();
    }

    @Override // X.MMX
    public final void reportShowEvent() {
        P();
        MultiViewModel.wv0("show", N(), null, null);
        Iterator it = ((ArrayList) this.LL.LJLJL).iterator();
        while (it.hasNext()) {
            ((MVV) it.next()).performShowEvent();
        }
    }

    @Override // X.MMX
    public final Integer[] Q() {
        return this.LLD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56698MNa(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 900));
        this.LJLJLLL = LIZIZ;
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 909));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 906));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 898));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 899));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 904));
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 907));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 902));
        this.LJLZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 908));
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 901));
        this.LJZI = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 910));
        this.LJZL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 903));
        this.LL = new C56699MNb((View.OnClickListener) C221108m2.LIZIZ(new AqS159S0100000_9(this, 905)).getValue(), new MNX(this));
        ACListenerS29S0100000_9 aCListenerS29S0100000_9 = new ACListenerS29S0100000_9(this, 130);
        this.LLD = new Integer[]{Integer.valueOf(R.id.h47)};
        C16880lQ.LJIL((ConstraintLayout) LIZIZ.getValue(), aCListenerS29S0100000_9);
        C16880lQ.LJIIZILJ(f0(), aCListenerS29S0100000_9);
    }

    @Override // X.MMX
    public final void V(ActivityNoticePod activityNoticePod) {
        int i;
        boolean z;
        ActivityNoticePod activityNoticePod2 = activityNoticePod;
        super.V(activityNoticePod2);
        List<MusNotice> list = activityNoticePod2.noticeList;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        Resources resources = this.itemView.getContext().getResources();
        i0(activityNoticePod2);
        h0(activityNoticePod2);
        List<MusNotice> list2 = activityNoticePod2.noticeList;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((View) this.LJLLILLLL.getValue()).setVisibility(0);
            ((View) this.LJLLJ.getValue()).setVisibility(8);
            ((View) this.LJZ.getValue()).setVisibility(8);
        } else {
            ((View) this.LJLLJ.getValue()).setVisibility(0);
            ((View) this.LJZ.getValue()).setVisibility(0);
            ((View) this.LJLLILLLL.getValue()).setVisibility(8);
        }
        ((ViewGroup) this.LJLLL.getValue()).removeAllViews();
        ((ArrayList) this.LL.LJLJL).clear();
        List<MusNotice> list3 = activityNoticePod2.noticeList;
        if (list3 != null) {
            int i2 = 0;
            for (MusNotice musNotice : list3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C56699MNb c56699MNb = this.LL;
                    ViewGroup noticeLayout = (ViewGroup) this.LJLLL.getValue();
                    o.LJIIIIZZ(noticeLayout, "noticeLayout");
                    RecyclerView.ViewHolder LJII = c56699MNb.LJII(noticeLayout, C78966Uyw.LJJIIZ(musNotice));
                    ((ViewGroup) this.LJLLL.getValue()).addView(LJII.itemView);
                    this.LL.LJI(LJII, i2);
                    ((ArrayList) this.LL.LJLJL).add(LJII);
                    C16880lQ.LLLZIIL(R.layout.s2, (LayoutInflater) this.LJZL.getValue(), (ViewGroup) this.LJLLL.getValue());
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (i == 0 || ((Boolean) DXN.LIZIZ.getValue()).booleanValue()) {
            f0().setVisibility(8);
            return;
        }
        int i4 = MN1.LIZ[activityNoticePod2.seeMoreType.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    f0().setVisibility(0);
                    c0().setVisibility(8);
                    ((ImageView) this.LJLZ.getValue()).setVisibility(0);
                    ((TextView) this.LJZI.getValue()).setText(resources.getString(R.string.he1));
                    return;
                }
                f0().setVisibility(0);
                c0().setVisibility(8);
                ((ImageView) this.LJLZ.getValue()).setVisibility(0);
                ((TextView) this.LJZI.getValue()).setText(resources.getString(R.string.hf1, Integer.valueOf(activityNoticePod2.redPoint.unreadCount)));
                return;
            }
            f0().setVisibility(0);
            c0().setVisibility(0);
            ((ImageView) this.LJLZ.getValue()).setVisibility(8);
            ((TextView) this.LJZI.getValue()).setText(resources.getString(R.string.hf1, Integer.valueOf(activityNoticePod2.redPoint.unreadCount)));
            ActivityIcon activityIcon = activityNoticePod2.icon;
            if (activityIcon == null) {
                return;
            }
            if (activityIcon.urlModel != null) {
                C78765Uvh.LJFF(c0(), activityIcon.urlModel);
                return;
            } else if (activityIcon.resId != -1) {
                c0().setImageURI(C78964Uyu.LIZJ(activityIcon.resId));
                return;
            } else {
                if (!C78685UuP.LJJJZ(activityIcon.url)) {
                    return;
                }
                C78765Uvh.LJIIIZ(c0(), activityIcon.url, -1, -1);
                return;
            }
        }
        f0().setVisibility(8);
    }

    @Override // X.MMX
    public final void X(ActivityNoticePod activityNoticePod) {
        ActivityNoticePod activityNoticePod2 = activityNoticePod;
        super.X(activityNoticePod2);
        View onBindSkeleton$lambda$1 = this.itemView.findViewById(R.id.h45);
        o.LJIIIIZZ(onBindSkeleton$lambda$1, "onBindSkeleton$lambda$1");
        C26338AVi.LJIIIZ(onBindSkeleton$lambda$1, null, C1FJ.LIZIZ(10), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 21);
        ((AbstractC72775ShH) onBindSkeleton$lambda$1.findViewById(R.id.j2i)).setLoading(true);
        View onBindSkeleton$lambda$2 = this.itemView.findViewById(R.id.h46);
        o.LJIIIIZZ(onBindSkeleton$lambda$2, "onBindSkeleton$lambda$2");
        C26338AVi.LJIIIZ(onBindSkeleton$lambda$2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 21);
        ((AbstractC72775ShH) onBindSkeleton$lambda$2.findViewById(R.id.j2i)).setLoading(true);
        TuxTextView g0 = g0();
        g0.LJJJ(16.0f);
        g0.setText(g0.getContext().getResources().getQuantityText(R.plurals.gr, 2));
        i0(activityNoticePod2);
        h0(activityNoticePod2);
        ((View) this.LJLLJ.getValue()).setVisibility(0);
        ((View) this.LJZ.getValue()).setVisibility(0);
    }

    public final void h0(ActivityNoticePod activityNoticePod) {
        int i = MN1.LIZIZ[activityNoticePod.redPoint.type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((View) this.LJLLI.getValue()).setVisibility(8);
                return;
            } else {
                AVS avs = (AVS) this.LJLLI.getValue();
                avs.setVariant(0);
                avs.setVisibility(0);
                return;
            }
        }
        AVS avs2 = (AVS) this.LJLLI.getValue();
        avs2.setVariant(1);
        avs2.setCount(activityNoticePod.redPoint.unreadCount);
        avs2.setVisibility(0);
    }

    public final void i0(ActivityNoticePod activityNoticePod) {
        int i;
        List<MusNotice> list = activityNoticePod.noticeList;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        Resources resources = this.itemView.getContext().getResources();
        g0().LJJJ(16.0f);
        if (activityNoticePod.redPoint.type == MN2.NONE) {
            if (i <= 1) {
                g0().setText(resources.getQuantityText(R.plurals.gr, 1));
                return;
            } else {
                g0().setText(resources.getQuantityText(R.plurals.gr, 2));
                return;
            }
        }
        if (i <= 1) {
            g0().setText(resources.getQuantityText(R.plurals.gw, 1));
        } else {
            g0().setText(resources.getQuantityText(R.plurals.gw, 2));
        }
    }
}
