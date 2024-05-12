package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C7GH;
import X.M89;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class BottomViewerListAssem extends AbstractBottomPriorityComponent {
    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final boolean v3(M89 m89) {
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String y2() {
        return "viewer_entry";
    }

    public BottomViewerListAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent
    public final void E3() {
        View containerView = getContainerView();
        if (containerView instanceof ViewGroup) {
            CommentServiceImpl.LJJL().LJJJJ((ViewGroup) containerView, getAweme(), qT());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol
    public final boolean LJJLIIJ() {
        return C7GH.LJIIIIZZ(getAweme());
    }
}
