package com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui;

import X.C16880lQ;
import X.C17N;
import X.C19N;
import X.C1DI;
import X.C221108m2;
import X.C32151Nz;
import X.C51495KIx;
import X.C52197Ke9;
import X.C78897Uxp;
import X.FMX;
import X.KI4;
import X.KI7;
import X.KI8;
import X.KIO;
import X.XVF;
import Y.ACListenerS34S0300000_8;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchMusicSugHistoryCell extends PowerCell<KI8> {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public SearchMusicSugHistoryCell() {
        C221108m2.LIZIZ(KI7.LJLIL);
        this.LJLIL = 17;
        this.LJLILLLLZI = C17N.LJIILL(48.0d);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        ((TextView) this.itemView.findViewById(R.id.m2v)).setMaxLines(1);
        ((AppCompatTextView) this.itemView.findViewById(R.id.m2v)).setTextSize(1, this.LJLIL);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        if (C32151Nz.LJJIL(itemView)) {
            View addPressState$lambda$2 = this.itemView;
            o.LJIIIIZZ(addPressState$lambda$2, "addPressState$lambda$2");
            C78897Uxp.LJJJJJL(addPressState$lambda$2, 0.0f);
            View iv_delete_new = addPressState$lambda$2.findViewById(R.id.f1l);
            o.LJIIIIZZ(iv_delete_new, "iv_delete_new");
            C78897Uxp.LJJJJLI(iv_delete_new, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(KI8 ki8) {
        String str;
        String str2;
        String id;
        Integer LIZIZ;
        KI8 t = ki8;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        SearchSugEntity searchSugEntity = t.LJLIL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.m2v);
        o.LJIIIIZZ(textView, "itemView.tv_content");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C51495KIx.LIZIZ(searchSugEntity, textView, itemView, this.LJLILLLLZI);
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.f4l).getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(C17N.LJIILL(12.0d));
        this.itemView.findViewById(R.id.f4l).setLayoutParams(marginLayoutParams);
        if (C52197Ke9.LIZ() && (LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu)) != null) {
            ((TextView) this.itemView.findViewById(R.id.m2v)).setTextColor(LIZIZ.intValue());
        }
        Integer LIZIZ2 = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.gu);
        if (LIZIZ2 != null) {
            int intValue = LIZIZ2.intValue();
            ((TuxIconView) this.itemView.findViewById(R.id.f4l)).setTintColor(intValue);
            ((TuxIconView) this.itemView.findViewById(R.id.f1l)).setTintColor(intValue);
        }
        this.itemView.findViewById(R.id.nbs).setBackground(this.itemView.getContext().getDrawable(R.drawable.c1y));
        this.itemView.findViewById(R.id.nbs).setVisibility(0);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.f4l).getLayoutParams();
        o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMarginStart(C17N.LJIILL(24.0d));
        marginLayoutParams2.setMarginEnd(C17N.LJIILL(14.0d));
        this.itemView.findViewById(R.id.f4l).setLayoutParams(marginLayoutParams2);
        C16880lQ.LJIIJ(new ACListenerS34S0300000_8(searchSugEntity, this, t, 11), this.itemView);
        C16880lQ.LJJJ((TuxIconView) this.itemView.findViewById(R.id.f1l), new ACListenerS34S0300000_8(searchSugEntity, this, t, 12));
        int layoutPosition = getLayoutPosition();
        if (!searchSugEntity.LIZJ) {
            searchSugEntity.LIZJ = true;
            KI4 ki4 = new KI4();
            ki4.LIZJ("words_source", "sug");
            ki4.LIZJ("search_position", "video_music");
            ki4.LIZ(layoutPosition, "words_position");
            ki4.LIZJ("words_content", searchSugEntity.content);
            Word word = searchSugEntity.mWord;
            String str3 = "";
            if (word == null || (str = word.getId()) == null) {
                str = "";
            }
            ki4.LIZJ("group_id", str);
            ki4.LIZJ("creation_id", XVF.LJ);
            ki4.LIZIZ(searchSugEntity.LIZLLL);
            ki4.LIZJ("new_sug_session_id", KIO.LIZ);
            FMX.LJIIL("trending_words_show", ki4.LIZ);
            KI4 ki42 = new KI4();
            ki42.LIZJ("enter_method", "sug");
            Map<String, String> map = searchSugEntity.LIZLLL;
            String str4 = null;
            if (map != null) {
                str2 = map.get("impr_id");
            } else {
                str2 = null;
            }
            ki42.LIZJ("query_id", str2);
            Map<String, String> map2 = searchSugEntity.LIZLLL;
            if (map2 != null) {
                str4 = map2.get("raw_query");
            }
            ki42.LIZJ("input_keyword", str4);
            ki42.LIZJ("search_keyword", searchSugEntity.content);
            ki42.LIZ(layoutPosition, "order");
            ki42.LIZJ("search_type", "video_music");
            Word word2 = searchSugEntity.mWord;
            if (word2 != null && (id = word2.getId()) != null) {
                str3 = id;
            }
            ki42.LIZJ("group_id", str3);
            ki42.LIZJ("words_type", "history");
            ki42.LIZJ("new_sug_session_id", KIO.LIZ);
            FMX.LJIIL("search_trending_show", ki42.LIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.cgv, viewGroup, false, "from(parent.context).inf…tory_list, parent, false)");
    }
}
