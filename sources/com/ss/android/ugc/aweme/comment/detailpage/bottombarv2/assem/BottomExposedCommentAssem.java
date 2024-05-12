package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.AnonymousClass766;
import X.C178676zn;
import X.M89;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class BottomExposedCommentAssem extends AbstractBottomPriorityComponent {
    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "exposed_comment";
    }

    public BottomExposedCommentAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void E3() {
        View containerView = getContainerView();
        if (containerView instanceof ViewGroup) {
            C178676zn.LIZ((ViewGroup) containerView, qT(), getAweme(), new ACListenerS23S0100000_3(this, 264));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIIJ() {
        return AnonymousClass766.LIZJ(getAweme(), qT());
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean v3(M89 m89) {
        return AnonymousClass766.LIZIZ(m89);
    }
}
