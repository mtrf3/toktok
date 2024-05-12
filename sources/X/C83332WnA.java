package X;

import Y.ACListenerS48S0200000_14;
import Y.ARunnableS1S0101001_14;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WnA, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83332WnA extends AbstractC83335WnD {
    public final VideoPublishEditModel LJLILLLLZI;
    public final ImageView LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final TuxIconView LJLJLJ;
    public final TuxIconView LJLJLLL;
    public final ViewGroup LJLL;
    public final View LJLLI;
    public boolean LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public C83351WnT LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final HashSet<String> LJLZ;

    public final RecyclerView N() {
        return (RecyclerView) this.LJLJJI.getValue();
    }

    @Override // X.AbstractC83335WnD
    public final void L(AbstractC83369Wnl message) {
        int i;
        boolean z;
        int i2;
        int i3;
        List<? extends AbstractC83320Wmy> list;
        Object obj;
        String str;
        C83326Wn4 c83326Wn4;
        o.LJIIIZ(message, "message");
        if (!(message instanceof C83351WnT)) {
            return;
        }
        if (!o.LJ(this.LJLLLL, message)) {
            this.LJLZ.clear();
        }
        C83351WnT c83351WnT = (C83351WnT) message;
        this.LJLLLL = c83351WnT;
        M().setText(c83351WnT.LIZJ);
        boolean z2 = false;
        M().setVisibility(0);
        this.LJLJI.setVisibility(8);
        if (c83351WnT.LJI != null) {
            int i4 = -1;
            if (!this.LJLLL) {
                N().setAdapter((AbstractC029409q) this.LJLJL.getValue());
                N().setLayoutManager((C0A2) this.LJLJJL.getValue());
                N().LJII(new C72762Sh4(Integer.valueOf(C173216qz.LIZJ(48.0d, this.itemView.getContext())), C173216qz.LIZJ(8.0d, this.itemView.getContext()), EnumC72764Sh6.DIRECTION_LEFT), -1);
                N().LJIIIZ(new C83347WnP(this));
                this.LJLLL = true;
            }
            List<? extends AbstractC83320Wmy> list2 = c83351WnT.LJI;
            if (list2 != null) {
                obj = ORZ.LJLLLL(list2);
            } else {
                obj = null;
            }
            if (obj instanceof C83326Wn4) {
                C83324Wn2 c83324Wn2 = (C83324Wn2) this.LJLJL.getValue();
                List<? extends AbstractC83320Wmy> list3 = c83351WnT.LJI;
                if (list3 != null) {
                    c83324Wn2.getClass();
                    if (ORZ.LJLLJ(list3) instanceof C83326Wn4) {
                        TextView textView = (TextView) C16880lQ.LLLZIIL(R.layout.cbd, C16880lQ.LLZIL(c83324Wn2.LJLIL), null).findViewById(R.id.mbf);
                        ArrayList arrayList = new ArrayList(C32I.LJJL(list3, 10));
                        for (AbstractC83320Wmy abstractC83320Wmy : list3) {
                            if ((abstractC83320Wmy instanceof C83326Wn4) && (c83326Wn4 = (C83326Wn4) abstractC83320Wmy) != null) {
                                str = c83326Wn4.LIZ;
                            } else {
                                str = null;
                            }
                            textView.setText(str);
                            textView.measure(0, 0);
                            arrayList.add(Integer.valueOf(textView.getMeasuredHeight()));
                        }
                        i4 = ((Number) ORZ.LLIFFJFJJ(arrayList)).intValue();
                    }
                    c83351WnT.LJIIIZ = i4;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C83324Wn2 c83324Wn22 = (C83324Wn2) this.LJLJL.getValue();
            int i5 = c83351WnT.LJII;
            boolean z3 = this.LJLLILLLL;
            int i6 = this.LJLLJ;
            c83324Wn22.getClass();
            ((ArrayList) c83324Wn22.LJLJI).clear();
            c83324Wn22.LJLJJI = i5;
            c83324Wn22.LJLJJLL = z3;
            c83324Wn22.LJLJJL = i6;
            c83324Wn22.LJLJL = c83351WnT;
            List<? extends AbstractC83320Wmy> list4 = c83351WnT.LJI;
            if (list4 != null) {
                ((ArrayList) c83324Wn22.LJLJI).addAll(list4);
                c83324Wn22.notifyDataSetChanged();
            }
            N().setVisibility(0);
        } else {
            N().setVisibility(8);
        }
        View view = (View) this.LJLJJLL.getValue();
        if (c83351WnT.LJIIJ) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (c83351WnT.LJIIL && ((list = c83351WnT.LJI) == null || list.isEmpty())) {
            this.LJLL.setVisibility(0);
            this.LJLLI.setVisibility(0);
        } else {
            this.LJLL.setVisibility(8);
            this.LJLLI.setVisibility(8);
        }
        this.LJLJL.getValue().getClass();
        TuxIconView tuxIconView = this.LJLJLJ;
        if (!c83351WnT.LJIILIIL && !c83351WnT.LJIILJJIL) {
            z = true;
        } else {
            z = false;
        }
        tuxIconView.setClickable(z);
        TuxIconView tuxIconView2 = this.LJLJLLL;
        if (!c83351WnT.LJIILIIL && !c83351WnT.LJIILJJIL) {
            z2 = true;
        }
        tuxIconView2.setClickable(z2);
        TuxIconView tuxIconView3 = this.LJLJLJ;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = C7MY.LIZIZ(20);
        c2068389v.LIZJ = C7MY.LIZIZ(20);
        if (c83351WnT.LJIILIIL) {
            i2 = R.raw.icon_thumbs_up_fill;
        } else {
            i2 = R.raw.icon_thumbs_up;
        }
        c2068389v.LIZ = i2;
        c2068389v.LJ = Integer.valueOf(R.attr.dm);
        tuxIconView3.setTuxIcon(c2068389v);
        TuxIconView tuxIconView4 = this.LJLJLLL;
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZIZ = C7MY.LIZIZ(20);
        c2068389v2.LIZJ = C7MY.LIZIZ(20);
        if (c83351WnT.LJIILJJIL) {
            i3 = R.raw.icon_thumbs_down_fill;
        } else {
            i3 = R.raw.icon_thumbs_down;
        }
        c2068389v2.LIZ = i3;
        c2068389v2.LJ = Integer.valueOf(R.attr.dm);
        tuxIconView4.setTuxIcon(c2068389v2);
    }

    public final void P(int i) {
        N().post(new ARunnableS1S0101001_14(this, i, ((Resources.getSystem().getDisplayMetrics().widthPixels - C74275TDb.LIZ(200.0f)) / 2) - C74275TDb.LIZ(48.0f), 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83332WnA(VideoPublishEditModel publishEditModel, View view, C83346WnO itemClickListener) {
        super(view);
        o.LJIIIZ(publishEditModel, "publishEditModel");
        o.LJIIIZ(itemClickListener, "itemClickListener");
        this.LJLILLLLZI = publishEditModel;
        this.LJLJI = (ImageView) view.findViewById(R.id.ngo);
        this.LJLJJI = C221108m2.LIZIZ(new AqS164S0100000_14(view, 428));
        this.LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(view, 943));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(view, 427));
        this.LJLJL = C221108m2.LIZIZ(new AqS161S0200000_14(view, this, 61));
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.gnn);
        C16880lQ.LJJJ(tuxIconView, new ACListenerS48S0200000_14(itemClickListener, this, 14));
        this.LJLJLJ = tuxIconView;
        TuxIconView tuxIconView2 = (TuxIconView) view.findViewById(R.id.gnl);
        C16880lQ.LJJJ(tuxIconView2, new ACListenerS48S0200000_14(itemClickListener, this, 13));
        this.LJLJLLL = tuxIconView2;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gnw);
        C16880lQ.LJIIL(viewGroup, new ACListenerS48S0200000_14(itemClickListener, this, 15));
        this.LJLL = viewGroup;
        this.LJLLI = view.findViewById(R.id.gnx);
        this.LJLLJ = -1;
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS161S0200000_14(itemClickListener, this, 62));
        this.LJLZ = new HashSet<>();
    }
}
