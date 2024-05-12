package com.ss.android.ugc.aweme.service;

import X.AV1;
import X.C211258Qv;
import X.C222588oQ;
import X.C38995FSd;
import X.C3C8;
import X.C47261Igj;
import X.C53326KwM;
import X.C65352Pkq;
import X.InterfaceC65350Pko;
import Y.ARunnableS4S0201000_1;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.FeedTextViewHolder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tag.FeedTextModeVideoTagTrigger;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TextModeServiceImpl implements ITextModeService {
    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LIZ() {
        return C65352Pkq.LIZ(FeedTextModeVideoTagTrigger.class);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final View LIZIZ(View view) {
        return view.findViewById(R.id.l4t);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final boolean LIZJ(Aweme aweme) {
        User author;
        if (aweme != null && (((author = aweme.getAuthor()) == null || ((!C53326KwM.LIZ() && !C211258Qv.LIZ()) || AV1.LJIJ(author))) && C47261Igj.LJJIIZI(aweme) && !aweme.getReplaceRecTagByRepost())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final Object LIZLLL(Object params) {
        o.LJIIIZ(params, "params");
        return new FeedTextViewHolder((C222588oQ) params);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final void LJ(Aweme aweme, View view, View view2, AqS169S0100000_3 aqS169S0100000_3) {
        if (LIZJ(aweme)) {
            if (view2 == null) {
                C38995FSd.LIZJ().execute(new ARunnableS4S0201000_1(view, aqS169S0100000_3, 9));
                return;
            } else {
                view2.setVisibility(0);
                return;
            }
        }
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }
}
