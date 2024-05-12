package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.1n3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43371n3 extends C1KD<C1VN, LiveEffect> {
    public final Context LJLILLLLZI;
    public final ComposerFilterViewModel LJLJI;
    public final InterfaceC17310m7 LJLJJI;
    public int LJLJJL;

    public final void LLILIL(List<? extends LiveEffect> filterModels) {
        o.LJIIIZ(filterModels, "filterModels");
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        this.LJLJJL = LIZJ.intValue();
        C03200Aq.LIZ(new C36991cl(this.LJLIL, filterModels), true).LIZJ(this);
        ((ArrayList) this.LJLIL).clear();
        ((ArrayList) this.LJLIL).addAll(filterModels);
    }

    public static void LLIL(C1VN holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJJLJLI(holder.LJLILLLLZI);
        holder.LJLJJI.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        holder.LJLJJI.setSelected(true);
        holder.LJLJJI.setTextColor(C15380j0.LIZIZ(R.color.zk));
    }

    public static void LLILII(C1VN holder, LiveEffect effect) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(effect, "effect");
        C29306Beo.LJIIIZ(holder.LJLILLLLZI);
        holder.LJLJJI.setEllipsize(null);
        holder.LJLJJI.setSelected(false);
        holder.LJLJJI.setTextColor(C15380j0.LIZIZ(R.color.a48));
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_global_osp_module_usertrust_UserTrustItemAdapter__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C1VN c1vn = new C1VN(AnonymousClass030.LIZLLL(this.LJLILLLLZI, R.layout.d2n, parent, false, "from(context).inflate(layoutId, parent, false)"));
        C0AX.LIZ(parent, c1vn.itemView, R.id.lj7);
        View view = c1vn.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (c1vn.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1VN.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) c1vn.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(c1vn.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = C1VN.class.getName();
        return c1vn;
    }

    public C43371n3(Context context, ComposerFilterViewModel viewModel, InterfaceC17310m7 interfaceC17310m7) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLILLLLZI = context;
        this.LJLJI = viewModel;
        this.LJLJJI = interfaceC17310m7;
        C221108m2.LIZIZ(C22T.INSTANCE);
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIIJLIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLIL((C1VN) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final /* bridge */ /* synthetic */ void LLIILII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLILII((C1VN) viewHolder, (LiveEffect) obj);
    }

    @Override // X.C1KD
    public final void LLIIZ(final int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        boolean z;
        List<String> list;
        UrlModel iconUrl;
        ComposerFilterViewModel composerFilterViewModel;
        final C1VN holder = (C1VN) viewHolder;
        final LiveEffect filterModel = (LiveEffect) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(filterModel, "filterModel");
        Collection collection = this.LJLIL;
        if (collection == null || ((ArrayList) collection).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z || i > ((ArrayList) this.LJLIL).size() || ListProtector.get(this.LJLIL, i) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("filterEffects[position]=");
            LIZ.append(this.LJLIL);
            LIZ.append("[position]");
            C0NB.LJ("LiveComposerFilterAdapter_onBindViewHolder", X1D.LIZIZ(LIZ));
            return;
        }
        if (filterModel.isNone()) {
            holder.LJLJI.setImageResource(R.drawable.cdm);
            holder.LJLJJI.setText(filterModel.getName());
            holder.LJLJJLL.setVisibility(0);
        } else {
            BQO LIZ2 = C15650jR.LIZ();
            Effect effect = filterModel.getEffect();
            String str = null;
            if (effect != null && (iconUrl = effect.getIconUrl()) != null) {
                list = iconUrl.getUrlList();
            } else {
                list = null;
            }
            LIZ2.LIZ(list).LJIIJJI(holder.LJLJI);
            TextView textView = holder.LJLJJI;
            Effect effect2 = filterModel.getEffect();
            if (effect2 != null) {
                str = effect2.getName();
            }
            textView.setText(str);
            holder.LJLJJLL.setVisibility(8);
        }
        if (i == this.LJLJJL) {
            LLIL(holder, filterModel);
        } else {
            LLILII(holder, filterModel);
        }
        if (this.LJLJI.iv0(filterModel) || filterModel.isNone()) {
            holder.LJLIL.setVisibility(8);
        } else {
            ImageView imageView = (ImageView) holder.itemView.findViewById(R.id.f6h);
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.LJLJI.hv0(filterModel, new IDqS172S0200000(this, filterModel, 63));
        }
        holder.LJLJJL.setVisibility(4);
        C16880lQ.LJIIJ(new View.OnClickListener() { // from class: X.0m8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                Object obj2;
                String str3;
                String str4;
                C43371n3 c43371n3 = C43371n3.this;
                if (c43371n3.LJLJJI != null) {
                    if (!c43371n3.LJLJI.iv0(filterModel) && !filterModel.isNone()) {
                        C43371n3 c43371n32 = C43371n3.this;
                        LiveEffect liveEffect = filterModel;
                        c43371n32.LJLJI.hv0(liveEffect, new IDqS172S0200000(c43371n32, liveEffect, 63));
                        return;
                    }
                    C43371n3 c43371n33 = C43371n3.this;
                    c43371n33.LLFII(c43371n33.LJLJJL);
                    C43371n3.this.LLFFF(i);
                    C43371n3 c43371n34 = C43371n3.this;
                    int i2 = i;
                    c43371n34.LJLJJL = i2;
                    C1VN c1vn = holder;
                    if (((ArrayList) c43371n34.LJLIL).size() > i2 && ((LiveEffect) ListProtector.get(c43371n34.LJLIL, i2)).getEffect() != null) {
                        if (c1vn != null) {
                            c1vn.LJLJJL.setVisibility(4);
                        }
                        ((LiveEffect) ListProtector.get(c43371n34.LJLIL, i2)).isNew = false;
                        C1VH LIZ3 = C17250m1.LIZ();
                        Effect effect3 = ((LiveEffect) ListProtector.get(c43371n34.LJLIL, i2)).getEffect();
                        if (effect3 != null) {
                            str2 = effect3.getId();
                        } else {
                            str2 = null;
                        }
                        if (!((ArrayList) LIZ3.LIZ).isEmpty() && !TextUtils.isEmpty(str2)) {
                            Iterator it = ((ArrayList) LIZ3.LIZ).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    LiveEffect liveEffect2 = (LiveEffect) obj2;
                                    if (liveEffect2.getEffect() != null) {
                                        Effect effect4 = liveEffect2.getEffect();
                                        if (effect4 != null) {
                                            str4 = effect4.getId();
                                        } else {
                                            str4 = null;
                                        }
                                        if (o.LJ(str4, str2)) {
                                            break;
                                        }
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            LiveEffect liveEffect3 = (LiveEffect) obj2;
                            if (liveEffect3 != null) {
                                liveEffect3.isNew = false;
                                Effect effect5 = liveEffect3.getEffect();
                                if (effect5 != null) {
                                    str3 = effect5.getTagsUpdatedAt();
                                } else {
                                    str3 = null;
                                }
                                EffectManager effectManager = LIZ3.LJ;
                                if (effectManager != null) {
                                    effectManager.updateTag(str2, str3, null);
                                }
                            }
                        }
                    }
                    C43371n3.this.LJLJJI.onItemClick(i);
                }
            }
        }, holder.itemView);
        if (filterModel.getEffect() != null && (composerFilterViewModel = this.LJLJI) != null && composerFilterViewModel.LJLIL.LJLIL.contains(filterModel)) {
            holder.LJLIL.setVisibility(0);
            return;
        }
        holder.LJLIL.setVisibility(8);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(filterModel.getName());
        LIZ3.append(" effect is null");
        C0NB.LJ("LiveComposerFilterAdapter_onBindViewHolder", X1D.LIZIZ(LIZ3));
    }
}
