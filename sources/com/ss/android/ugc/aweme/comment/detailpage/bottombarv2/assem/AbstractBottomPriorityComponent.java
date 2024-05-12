package com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C71Y;
import X.C8T7;
import X.M89;
import X.X1D;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarProtocol;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.DetailBottomBarAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AbstractBottomPriorityComponent extends UIContentAssem implements BottomBarProtocol {
    public final C62822Ol8 LJLIL;

    public abstract void E3();

    public void F3() {
    }

    public void H3() {
    }

    public void I3(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C8T7 LJLILLLLZI() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final void LLZLI(boolean z) {
    }

    public void X5() {
    }

    public abstract boolean v3(M89 m89);

    public AbstractBottomPriorityComponent() {
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 89));
    }

    public final DetailBottomBarAbility A3() {
        return (DetailBottomBarAbility) this.LJLIL.getValue();
    }

    public final Aweme getAweme() {
        DetailBottomBarAbility A3 = A3();
        if (A3 != null) {
            return A3.getCommentInputAweme();
        }
        return null;
    }

    public final String getEnterFrom() {
        String enterFrom;
        DetailBottomBarAbility A3 = A3();
        if (A3 == null || (enterFrom = A3.getEnterFrom()) == null) {
            return "";
        }
        return enterFrom;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View m8() {
        return getContainerView();
    }

    public final M89 qT() {
        DetailBottomBarAbility A3 = A3();
        if (A3 != null) {
            return A3.qT();
        }
        return null;
    }

    public final String x3() {
        Aweme commentInputAweme;
        String aid;
        DetailBottomBarAbility A3 = A3();
        if (A3 == null || (commentInputAweme = A3.getCommentInputAweme()) == null || (aid = commentInputAweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    public void C3(String currentTag) {
        o.LJIIIZ(currentTag, "currentTag");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAttach: ");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        C71Y.LIZ("AbstractBottomPriorityComponent", X1D.LIZIZ(LIZ));
        getContainerView().setVisibility(0);
        E3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        DetailBottomBarAbility A3 = A3();
        if (A3 != null) {
            A3.as0(this);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewCreated: ");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        C71Y.LIZ("AbstractBottomPriorityComponent", X1D.LIZIZ(LIZ));
    }
}
