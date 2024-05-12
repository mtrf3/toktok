package X;

import Y.IDRunnableS0S0201000;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1a6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35341a6 extends AbstractC029409q<C35361a8> {
    public IDqS416S0100000 LJLILLLLZI;
    public int LJLJJI;
    public RecyclerView LJLJJL;
    public final List<C20000qS> LJLIL = new ArrayList();
    public int LJLJI = C18420nu.LIZJ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return ((ArrayList) this.LJLIL).size();
    }

    public final void LJLZ(int i) {
        if (i >= ((ArrayList) this.LJLIL).size()) {
            return;
        }
        LJLLLLLL(this.LJLJJI, 4);
        if (i == -1) {
            return;
        }
        this.LJLJJI = i;
        if (!C18420nu.LIZIZ.containsKey(ListProtector.get(this.LJLIL, i))) {
            LJLLLLLL(i, 3);
        }
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJJL = recyclerView;
    }

    public final void LJLLLLLL(int i, Object obj) {
        try {
            RecyclerView recyclerView = this.LJLJJL;
            if (recyclerView != null) {
                if (recyclerView.LJJJLL()) {
                    RecyclerView recyclerView2 = this.LJLJJL;
                    if (recyclerView2 != null) {
                        recyclerView2.post(new IDRunnableS0S0201000(i, this, obj, 16));
                        return;
                    } else {
                        o.LJIJI("recyclerView");
                        throw null;
                    }
                }
                notifyItemChanged(i, obj);
                return;
            }
            o.LJIJI("recyclerView");
            throw null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L13;
     */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C35361a8 r5, int r6) {
        /*
            r4 = this;
            X.1a8 r5 = (X.C35361a8) r5
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            android.view.ViewGroup r1 = r5.LJLIL
            int r0 = r4.LJLJI
            if (r0 != r6) goto L69
            boolean r0 = X.U4D.LIZ()
            if (r0 == 0) goto L65
            r0 = 2131235729(0x7f081391, float:1.808766E38)
        L16:
            android.graphics.drawable.Drawable r0 = X.C15400j2.LIZ(r0)
            r1.setBackground(r0)
            android.widget.ImageView r0 = r5.LJLJI
            X.C29306Beo.LJI(r0)
            r0.clearAnimation()
            java.util.List<X.0qS> r0 = r4.LJLIL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.0qS r0 = (X.C20000qS) r0
            com.bytedance.android.live.effect.navi.model.ProfileNaviStaticImage r0 = r0.LIZLLL
            r2 = 0
            if (r0 == 0) goto L4d
            com.bytedance.android.live.base.model.UrlModel r0 = r0.getThumbnailUrl()
            if (r0 == 0) goto L4d
            X.BQO r1 = X.C15650jR.LIZ()
            com.bytedance.android.live.base.model.ImageModel r0 = r0.L()
            X.Uuy r1 = r1.LJIIIZ(r0)
            X.W5G r0 = r5.LJLILLLLZI
            r1.LJIIJJI(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L52
        L4d:
            X.W5G r0 = r5.LJLILLLLZI
            r0.setImageDrawable(r2)
        L52:
            android.view.View r3 = r5.itemView
            java.lang.String r0 = "holder.itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            kotlin.jvm.internal.IDqS13S0101000 r2 = new kotlin.jvm.internal.IDqS13S0101000
            r0 = 7
            r2.<init>(r4, r6, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            X.C29306Beo.LJJJLL(r3, r0, r2)
            return
        L65:
            r0 = 2131235728(0x7f081390, float:1.8087658E38)
            goto L16
        L69:
            r0 = 2131235727(0x7f08138f, float:1.8087656E38)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35341a6.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC029409q
    public final C35361a8 onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C35361a8 c35361a8 = new C35361a8(C1FL.LIZIZ(parent, R.layout.dfy, parent, false, "from(parent.context).inf…item_view, parent, false)"));
        C0AX.LIZ(parent, c35361a8.itemView, R.id.lj7);
        View view = c35361a8.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c35361a8.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C35361a8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c35361a8.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c35361a8.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C35361a8.class.getName();
        return c35361a8;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C35361a8 c35361a8, int i, List payloads) {
        int i2;
        C35361a8 holder = c35361a8;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        for (Object obj : payloads) {
            if (o.LJ(obj, 1)) {
                ViewGroup viewGroup = holder.LJLIL;
                if (U4D.LIZ()) {
                    i2 = R.drawable.d9a;
                } else {
                    i2 = R.drawable.d9_;
                }
                viewGroup.setBackground(C15400j2.LIZ(i2));
            } else if (o.LJ(obj, 2)) {
                holder.LJLIL.setBackground(C15400j2.LIZ(R.drawable.d99));
            } else if (o.LJ(obj, 3)) {
                ImageView imageView = holder.LJLJI;
                C29306Beo.LJJLJLI(imageView);
                imageView.startAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), R.anim.gs));
            } else if (o.LJ(obj, 4)) {
                ImageView imageView2 = holder.LJLJI;
                C29306Beo.LJI(imageView2);
                imageView2.clearAnimation();
            } else {
                super.onBindViewHolder(holder, i, payloads);
            }
        }
    }
}
