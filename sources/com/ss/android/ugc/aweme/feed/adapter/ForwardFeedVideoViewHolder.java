package com.ss.android.ugc.aweme.feed.adapter;

import X.C222588oQ;
import X.C50419JqZ;
import X.C78996UzQ;
import X.C79004UzY;
import X.C92K;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RelationLabelHelper;

/* loaded from: classes5.dex */
public class ForwardFeedVideoViewHolder extends VideoViewCell {
    public final C92K LLZZ;
    public Aweme LLZZJLIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final Aweme O1() {
        Aweme aweme = this.LLZZJLIL;
        if (aweme == null) {
            return getAweme();
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJZ() {
        super.LJZ();
        C92K c92k = this.LLZZ;
        Aweme aweme = c92k.LIZ;
        if (aweme == null) {
            return;
        }
        if (((aweme.getRelationLabel() == null || c92k.LIZ.getRelationLabel().getType() != 1 || TextUtils.isEmpty(c92k.LIZ.getRelationLabel().getLabelInfo())) && (c92k.LIZ.getFeedRelationLabel() == null || c92k.LIZ.getFeedRelationLabel().getType().intValue() != 3 || C79004UzY.LJJIFFI(c92k.LIZ.getFeedRelationLabel().getUserList()))) || RelationLabelHelper.hasDuoShanLabel(c92k.LIZ.getForwardItem()) || RelationLabelHelper.hasNewRelationLabel(c92k.LIZ.getForwardItem()) || !RelationLabelHelper.hasNewRelationLabel(c92k.LIZ)) {
            return;
        }
        c92k.LIZ.getForwardItem().setNewRelationLabel(c92k.LIZ.getNewRelationLabel());
    }

    public ForwardFeedVideoViewHolder(C222588oQ c222588oQ) {
        super(c222588oQ);
        this.LLZZ = new C92K();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell, X.C2MA
    public final void LIZLLL(Aweme aweme) {
        this.LLZZJLIL = aweme;
        this.LLZZ.LIZ = aweme;
        super.LIZLLL(C78996UzQ.LJIILJJIL(aweme));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void LJLLLL(Aweme aweme) {
        super.LJLLLL(aweme);
        if (C50419JqZ.LIZIZ(aweme)) {
            b2(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final Aweme LLIIIILZ(int i) {
        if (i == 7) {
            return O1();
        }
        return super.LLIIIILZ(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, X.InterfaceC222708oc
    public final void Y2(Aweme aweme) {
        super.Y2(C78996UzQ.LJIILJJIL(aweme));
    }
}
