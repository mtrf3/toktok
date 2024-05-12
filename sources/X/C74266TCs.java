package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.TCs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C74266TCs extends AbstractC73295Spf<Effect> {
    public C71857SIb LJLJL;
    public final TEZ LJLJLJ;
    public final TEF LJLJLLL;
    public final TE0 LJLL;
    public final T44 LJLLI;
    public final InterfaceC74265TCr LJLLILLLL;
    public final TEJ LJLLJ;
    public final EffectCategoryModel LJLLL;
    public final int LJLLLL;

    @Override // X.AbstractC73295Spf
    public final void LJLLLLLL(C73365Sqn<Effect> holder) {
        o.LJIIIZ(holder, "holder");
        TKR tkr = this.LJLL.LJLJLJ;
        holder.N(tkr.LJLLLL, tkr.LJLLLLLL);
    }

    @Override // X.AbstractC73295Spf
    public void LL(C73275SpL c73275SpL) {
        super.LL(c73275SpL);
        c73275SpL.LIZ(new AqS178S0100000_12(this, 635), new AqS178S0100000_12(this, 636));
        c73275SpL.LIZ(new AqS178S0100000_12(this, 637), new AqS178S0100000_12(this, 638));
        c73275SpL.LIZ(new AqS178S0100000_12(this, 639), new AqS178S0100000_12(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
        LLFII(c73275SpL);
    }

    public final void LLF(C73365Sqn<Effect> c73365Sqn) {
        if (c73365Sqn instanceof ViewOnClickListenerC74264TCq) {
            ViewOnClickListenerC74264TCq viewOnClickListenerC74264TCq = (ViewOnClickListenerC74264TCq) c73365Sqn;
            T4I t4i = viewOnClickListenerC74264TCq.LJLLJ;
            T4I t4i2 = this.LJLJJL;
            if (t4i != t4i2) {
                viewOnClickListenerC74264TCq.getClass();
                o.LJIIIZ(t4i2, "<set-?>");
                viewOnClickListenerC74264TCq.LJLLJ = t4i2;
            }
        }
        if (c73365Sqn instanceof AbstractViewOnClickListenerC74256TCi) {
            AbstractViewOnClickListenerC74256TCi abstractViewOnClickListenerC74256TCi = (AbstractViewOnClickListenerC74256TCi) c73365Sqn;
            T4I t4i3 = abstractViewOnClickListenerC74256TCi.LJLJLLL;
            T4I t4i4 = this.LJLJJL;
            if (t4i3 != t4i4) {
                abstractViewOnClickListenerC74256TCi.getClass();
                o.LJIIIZ(t4i4, "<set-?>");
                abstractViewOnClickListenerC74256TCi.LJLJLLL = t4i4;
            }
        }
    }

    public final OSZ<FrameLayout, TDE> LLFF(Context context) {
        TKR tkr = this.LJLL.LJLJLJ;
        if (tkr.LLIIIL) {
            float f = -2;
            return TKL.LIZ(tkr, context, tkr.LLIIIILZ, tkr.LJLJJLL, tkr.LJLJL, f, f, TDH.LJLIL, 960);
        }
        if (tkr.LLIIIJ) {
            return TKQ.LIZ(tkr, context, 0.0f, 0.0f, false, 62);
        }
        return TKO.LIZJ(tkr, context, tkr.LLIIIILZ);
    }

    @Override // X.AbstractC029409q
    /* renamed from: LLFFF, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(C73365Sqn<Effect> holder) {
        String str;
        TE1 te1;
        String str2;
        String id;
        String str3;
        String str4;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition == 0) {
            return;
        }
        Effect item = getItem(adapterPosition);
        String str5 = null;
        if (item != null && (id = item.getId()) != null && s.LJJJLZIJ(id, "title", false)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CategoryStickerAdapter onViewAttachedToWindow ");
            EffectCategoryModel effectCategoryModel = this.LJLLL;
            if (effectCategoryModel != null) {
                str3 = effectCategoryModel.getName();
            } else {
                str3 = null;
            }
            LIZ.append(str3);
            LIZ.append(" contains title, pos = ");
            LIZ.append(adapterPosition);
            X1D.LIZIZ(LIZ);
            java.util.Map<String, List<Integer>> LJJIIJZLJL = this.LJLJLJ.LJJIIJZLJL();
            EffectCategoryModel effectCategoryModel2 = this.LJLLL;
            if (effectCategoryModel2 != null) {
                str4 = effectCategoryModel2.getName();
            } else {
                str4 = null;
            }
            List<Integer> list = LJJIIJZLJL.get(str4);
            if (list == null) {
                list = new ArrayList<>();
            }
            if (list.isEmpty()) {
                list.add(Integer.valueOf(adapterPosition));
            } else if (adapterPosition > ((Number) ORZ.LLFF(list)).intValue()) {
                list.add(Integer.valueOf(adapterPosition));
            }
            java.util.Map<String, List<Integer>> LJJIIJZLJL2 = this.LJLJLJ.LJJIIJZLJL();
            EffectCategoryModel effectCategoryModel3 = this.LJLLL;
            if (effectCategoryModel3 != null) {
                str5 = effectCategoryModel3.getName();
            }
            LJJIIJZLJL2.put(str5, list);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("CategoryStickerAdapter onViewAttachedToWindow curSelectTab = ");
        LIZ2.append(this.LJLLJ.LJFF);
        LIZ2.append(' ');
        EffectCategoryModel effectCategoryModel4 = this.LJLLL;
        if (effectCategoryModel4 != null) {
            str = effectCategoryModel4.getName();
        } else {
            str = null;
        }
        LIZ2.append(str);
        LIZ2.append(", curTab = ");
        LIZ2.append(this.LJLLLL);
        X1D.LIZIZ(LIZ2);
        Integer num = this.LJLLJ.LJFF;
        int i = this.LJLLLL;
        if (num == null || num.intValue() != i || (te1 = this.LJLLJ.LIZ) == null) {
            return;
        }
        int adapterPosition2 = holder.getAdapterPosition();
        EffectCategoryModel effectCategoryModel5 = this.LJLLL;
        if (effectCategoryModel5 != null) {
            str2 = effectCategoryModel5.getName();
        } else {
            str2 = null;
        }
        te1.LIZJ(adapterPosition2, str2, null, new AqS178S0100000_12(this, 633));
    }

    public void LLFII(C73275SpL c73275SpL) {
        c73275SpL.LIZ(C2N4.LJLIL, new AqS178S0100000_12(this, 634));
    }

    public final void setData(List<? extends Effect> data) {
        o.LJIIIZ(data, "data");
        if (((ArrayList) this.LJLILLLLZI).isEmpty()) {
            C43045Guv.LIZLLL(new AqS159S0200000_12(this, data, 89), 0L);
        } else {
            C43045Guv.LIZLLL(new AqS159S0200000_12(this, data, 90), 0L);
        }
    }

    public static final void LLD(C74266TCs c74266TCs, List data) {
        c74266TCs.getClass();
        o.LJIIIZ(data, "data");
        c74266TCs.LJLILLLLZI = ORZ.LLJILJILJ(data);
        c74266TCs.notifyDataSetChanged();
    }

    @Override // X.AbstractC73295Spf
    /* renamed from: LJZ */
    public final void onBindViewHolder(C73365Sqn<Effect> holder, int i) {
        o.LJIIIZ(holder, "holder");
        LLF(holder);
        super.onBindViewHolder(holder, i);
    }

    @Override // X.AbstractC73295Spf
    /* renamed from: LJZI */
    public final void onBindViewHolder(C73365Sqn<Effect> holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        LLF(holder);
        super.onBindViewHolder(holder, i, payloads);
    }

    @Override // X.AbstractC73295Spf, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        onBindViewHolder((C73365Sqn) viewHolder, i, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74266TCs(TEZ tez, TEF tagHandler, T4I<Effect> listViewModel, TE0 listViewConfigure, T44 t44, InterfaceC74265TCr interfaceC74265TCr, TEJ optionalDependency, EffectCategoryModel effectCategoryModel, int i) {
        super(listViewModel, listViewConfigure);
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(listViewConfigure, "listViewConfigure");
        o.LJIIIZ(optionalDependency, "optionalDependency");
        this.LJLJLJ = tez;
        this.LJLJLLL = tagHandler;
        this.LJLL = listViewConfigure;
        this.LJLLI = t44;
        this.LJLLILLLL = interfaceC74265TCr;
        this.LJLLJ = optionalDependency;
        this.LJLLL = effectCategoryModel;
        this.LJLLLL = i;
    }
}
