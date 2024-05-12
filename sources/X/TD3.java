package X;

import Y.AfS53S0200000_4;
import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TD3 extends C74266TCs {
    public final InterfaceC88473Ynt<Effect, Integer, Integer, C76800UCe> LJLLLLLL;
    public final C73849Syb<C76800UCe> LJLZ;
    public final ShortVideoContext LJZ;
    public final InterfaceC88473Ynt<Effect, Integer, Integer, C76800UCe> LJZI;
    public final C73318Sq2 LJZL;
    public final Keva LL;

    public static void LLFZ(TDE tde) {
        int i;
        TextView textView = tde.getTextView();
        if (textView == null) {
            return;
        }
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        Context context = textView.getContext();
        o.LJIIIIZZ(context, "textView.context");
        Integer LJI = C79045V0n.LJI(R.attr.dj, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        textView.setTextColor(i);
        textView.setGravity(1);
    }

    @Override // X.C74266TCs
    /* renamed from: LLFFF */
    public final void onViewAttachedToWindow(C73365Sqn<Effect> holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (!this.LL.getBoolean("ame_tooltip_seen", false) && (holder instanceof C9US)) {
            C78999UzT.LJFF(this.LJLZ.LJJJJZI(new AfS53S0200000_4(this, holder, 25)), this.LJZL);
        }
    }

    @Override // X.C74266TCs
    public final void LLFII(C73275SpL c73275SpL) {
        c73275SpL.LIZ(new AqS178S0100000_12(this, 554), new AqS170S0100000_4(this, 1145));
        c73275SpL.LIZ(new AqS178S0100000_12(this, 555), new AqS178S0100000_12(this, 556));
        c73275SpL.LIZ(new AqS178S0100000_12(this, 557), new AqS178S0100000_12(this, 558));
        c73275SpL.LIZ(new AqS178S0100000_12(this, 559), new AqS178S0100000_12(this, 560));
        c73275SpL.LIZ(new AqS178S0100000_12(this, 561), new AqS178S0100000_12(this, 552));
    }

    @Override // X.C74266TCs, X.AbstractC029409q
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        onViewAttachedToWindow((C73365Sqn) viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof C9US) {
            this.LJZL.LIZLLL();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TD3(TEZ tez, TEF tagHandler, FixedStickerListViewModel listViewModel, TE0 te0, T44 t44, InterfaceC74265TCr interfaceC74265TCr, TEJ tej, EffectCategoryModel effectCategoryModel, int i, IDqS436S0100000_12 iDqS436S0100000_12, C73849Syb createEffectTabClickSubject, ShortVideoContext shortVideoContext, IDqS436S0100000_12 iDqS436S0100000_122) {
        super(tez, tagHandler, listViewModel, te0, t44, interfaceC74265TCr, tej, effectCategoryModel, i);
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(listViewModel, "listViewModel");
        o.LJIIIZ(createEffectTabClickSubject, "createEffectTabClickSubject");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LJLLLLLL = iDqS436S0100000_12;
        this.LJLZ = createEffectTabClickSubject;
        this.LJZ = shortVideoContext;
        this.LJZI = iDqS436S0100000_122;
        this.LJZL = new C73318Sq2();
        this.LL = Keva.getRepo("ame_add_button_tooltip");
    }
}
