package com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui;

import X.C17N;
import X.C19N;
import X.C1DI;
import X.C2068389v;
import X.C32151Nz;
import X.C51495KIx;
import X.C52197Ke9;
import X.C78841Uwv;
import X.C78897Uxp;
import X.FMX;
import X.KI1;
import X.KI4;
import X.KI9;
import X.KIO;
import X.ViewOnClickListenerC13880ga;
import X.XVF;
import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicSugCell extends PowerCell<KI9> {
    public SearchSugEntity LJLIL;
    public final int LJLILLLLZI = 17;
    public final int LJLJI = C17N.LJIILL(48.0d);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.fat);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        appCompatImageView.setImageDrawable(c2068389v.LIZ(context));
        ((AppCompatTextView) this.itemView.findViewById(R.id.mlv)).setTextSize(1, this.LJLILLLLZI);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (C32151Nz.LJJIL(itemView)) {
            View addPressState$lambda$0 = this.itemView;
            o.LJIIIIZZ(addPressState$lambda$0, "addPressState$lambda$0");
            C78897Uxp.LJJJJJL(addPressState$lambda$0, 0.0f);
            View iv_sug_completion_new = addPressState$lambda$0.findViewById(R.id.fat);
            o.LJIIIIZZ(iv_sug_completion_new, "iv_sug_completion_new");
            C78897Uxp.LJJJJLI(iv_sug_completion_new, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(KI9 ki9) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String recallReason;
        Integer LIZIZ;
        KI9 t = ki9;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJLIL = t.LJLIL;
        int layoutPosition = getLayoutPosition();
        SearchSugEntity searchSugEntity = this.LJLIL;
        if (searchSugEntity != null && !searchSugEntity.LIZJ) {
            searchSugEntity.LIZJ = true;
            KI4 ki4 = new KI4();
            ki4.LIZJ("words_source", "sug");
            ki4.LIZJ("search_position", "video_music");
            ki4.LIZ(layoutPosition, "words_position");
            ki4.LIZJ("words_content", searchSugEntity.content);
            Word word = searchSugEntity.mWord;
            String str6 = "";
            if (word == null || (str = word.getId()) == null) {
                str = "";
            }
            ki4.LIZJ("group_id", str);
            ki4.LIZJ("creation_id", XVF.LJ);
            ki4.LIZIZ(searchSugEntity.LIZLLL);
            ki4.LIZJ("new_sug_session_id", KIO.LIZ);
            if (C78841Uwv.LJIL(searchSugEntity)) {
                str2 = "enrich_sug";
            } else {
                str2 = "normal_sug";
            }
            ki4.LIZJ("sug_type", str2);
            SugExtraInfo sugExtraInfo = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo == null || (str3 = sugExtraInfo.isHistorySug()) == null) {
                str3 = "";
            }
            ki4.LIZJ("is_history_sug", str3);
            SugExtraInfo sugExtraInfo2 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo2 == null || (str4 = sugExtraInfo2.isPersonalized()) == null) {
                str4 = "";
            }
            ki4.LIZJ("is_personalized", str4);
            SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo3 == null || (str5 = sugExtraInfo3.getQueryLang()) == null) {
                str5 = "";
            }
            ki4.LIZJ("query_lang", str5);
            SugExtraInfo sugExtraInfo4 = searchSugEntity.sugExtraInfo;
            if (sugExtraInfo4 != null && (recallReason = sugExtraInfo4.getRecallReason()) != null) {
                str6 = recallReason;
            }
            ki4.LIZJ("recall_reason", str6);
            FMX.LJIIL("trending_words_show", ki4.LIZ);
        }
        View view = this.itemView;
        view.findViewById(R.id.fat).setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 100)));
        KI1 ki1 = new KI1(this, t);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ki1.LJLIL = true ^ C32151Nz.LJJIL(itemView);
        view.setOnTouchListener(ki1);
        SearchSugEntity searchSugEntity2 = t.LJLIL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.mlv);
        o.LJIIIIZZ(textView, "itemView.tv_sug");
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C51495KIx.LIZIZ(searchSugEntity2, textView, itemView2, this.LJLJI);
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.f_o).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(C17N.LJIILL(12.0d));
        this.itemView.findViewById(R.id.f_o).setLayoutParams(marginLayoutParams);
        if (C52197Ke9.LIZ() && (LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu)) != null) {
            ((TextView) this.itemView.findViewById(R.id.mlv)).setTextColor(LIZIZ.intValue());
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        if (LIZIZ2 != null) {
            ((TuxIconView) this.itemView.findViewById(R.id.f_o)).setTintColor(LIZIZ2.intValue());
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.itemView.findViewById(R.id.fat);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_up_left_ltr;
        c2068389v.LIZLLL = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        appCompatImageView.setImageDrawable(c2068389v.LIZ(context));
        this.itemView.findViewById(R.id.nbs).setBackground(this.itemView.getContext().getDrawable(R.drawable.c1y));
        this.itemView.findViewById(R.id.nbs).setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.f_o).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(C17N.LJIILL(24.0d));
        marginLayoutParams2.setMarginEnd(C17N.LJIILL(20.0d));
        this.itemView.findViewById(R.id.f_o).setLayoutParams(marginLayoutParams2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgu, viewGroup, false, "from(parent.context).inf…earch_sug, parent, false)");
    }
}
