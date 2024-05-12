package com.ss.android.ugc.aweme.search.arch.v2.services.autoplay;

import X.C2L4;
import X.C76965UIn;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class SearchCardAutoplayableViewHolder extends RecyclerView.ViewHolder implements C2L4 {
    public List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(SearchPlayerScope.class);
    }

    public SearchCardAutoplayableViewHolder(View view) {
        super(view);
    }
}
