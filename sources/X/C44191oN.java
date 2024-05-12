package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44191oN extends C1KD<C37311dH, LiveEffect> {
    public int LJLILLLLZI;
    public InterfaceC261310v LJLJI;
    public final C37321dI LJLJJI = new C0WN() { // from class: X.1dI
        @Override // X.C0WN
        public final void LJFF(int i, Effect effect) {
        }

        @Override // X.C0WN
        public final void LJI(Effect effect) {
        }

        @Override // X.C0WN
        public final void onStart(Effect effect) {
        }

        @Override // X.C0WN
        public final void onSuccess(Effect effect) {
            C44191oN.this.notifyDataSetChanged();
        }
    };
    public int LJLJJL = R.layout.d2n;

    public static void LLIL(C37311dH holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        holder.itemView.findViewById(R.id.anr).setBackgroundResource(R.drawable.cb2);
        ((TextView) holder.itemView.findViewById(R.id.mby)).setTextColor(C15380j0.LIZIZ(R.color.zk));
        ((TextView) holder.itemView.findViewById(R.id.mby)).setEllipsize(TextUtils.TruncateAt.MARQUEE);
        ((TextView) holder.itemView.findViewById(R.id.mby)).setSelected(true);
    }

    public static void LLILII(C37311dH holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        holder.itemView.findViewById(R.id.anr).setBackgroundResource(R.drawable.cb3);
        ((TextView) holder.itemView.findViewById(R.id.mby)).setTextColor(C15380j0.LIZIZ(R.color.a48));
        ((TextView) holder.itemView.findViewById(R.id.mby)).setEllipsize(null);
        ((TextView) holder.itemView.findViewById(R.id.mby)).setSelected(false);
    }

    public final void LLILIL(int i, List list) {
        C03200Aq.LIZ(new C36991cl(this.LJLIL, list), true).LIZJ(this);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(list);
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup view, int i) {
        o.LJIIIZ(view, "view");
        final View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(view.getContext()), this.LJLJJL, view, false);
        o.LJIIIIZZ(LLLLIILL, "from(view.context)\n     …te(layoutId, view, false)");
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(LLLLIILL) { // from class: X.1dH
        };
        C0AX.LIZ(view, viewHolder.itemView, R.id.lj7);
        View view2 = viewHolder.itemView;
        if (view2 != null) {
            view2.setTag(R.id.bq7, C79234V7u.LJIIIZ(view));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C37311dH.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(view.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(viewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C37311dH.class.getName();
        return viewHolder;
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C37311dH) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C37311dH) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final void LLIIZ(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        final C37311dH holder = (C37311dH) viewHolder;
        final LiveEffect liveEffect = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(liveEffect, "liveEffect");
        UrlModel urlModel = liveEffect.icon;
        if (urlModel != null) {
            C15640jQ.LJIIIIZZ((ImageView) holder.itemView.findViewById(R.id.ezb), new ImageModel(urlModel.uri, urlModel.urlList));
        }
        ((TextView) holder.itemView.findViewById(R.id.mby)).setText(liveEffect.getName());
        C1KJ c1kj = C1KJ.LIZ;
        if (c1kj.LIZ(liveEffect)) {
            ((ImageView) holder.itemView.findViewById(R.id.f6h)).setVisibility(8);
        } else {
            ((ImageView) holder.itemView.findViewById(R.id.f6h)).setVisibility(0);
            c1kj.LIZLLL(liveEffect.getEffect(), this.LJLJJI);
        }
        if (C78880UxY.LJJJJZ(liveEffect, C12890ez.LIZ())) {
            holder.itemView.setAlpha(0.4f);
        } else {
            holder.itemView.setAlpha(1.0f);
        }
        if (this.LJLILLLLZI == i) {
            LLIL(holder, liveEffect);
        } else {
            LLILII(holder, liveEffect);
        }
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.10w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int adapterPosition = getAdapterPosition();
                if (adapterPosition < 0 || adapterPosition >= ((ArrayList) this.LJLIL).size() || !C1KJ.LIZ.LIZ(liveEffect)) {
                    return;
                }
                LiveEffect liveEffect2 = liveEffect;
                o.LJIIIZ(liveEffect2, "<this>");
                if (C78880UxY.LJJJJZ(liveEffect2, C12890ez.LIZ())) {
                    C30868C9o.LIZJ(R.string.kdw);
                    return;
                }
                C44191oN c44191oN = this;
                c44191oN.LLFII(c44191oN.LJLILLLLZI);
                this.LLFFF(adapterPosition);
                C44191oN c44191oN2 = this;
                c44191oN2.LJLILLLLZI = adapterPosition;
                InterfaceC261310v interfaceC261310v = c44191oN2.LJLJI;
                if (interfaceC261310v == null) {
                    return;
                }
                interfaceC261310v.LIZ(liveEffect);
            }
        }, holder.itemView);
    }
}
