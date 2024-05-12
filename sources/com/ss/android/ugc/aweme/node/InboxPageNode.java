package com.ss.android.ugc.aweme.node;

import X.ActivityC45651qj;
import X.C221018lt;
import X.C53765L8f;
import X.C55888Lwa;
import X.LCZ;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.TabFragmentNode;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxPageNode extends TabFragmentNode {
    @Override // X.InterfaceC54080LKi
    public final String LIZ() {
        return "NOTIFICATION";
    }

    @Override // X.InterfaceC54080LKi
    public final View LJFF(LCZ lcz) {
        return null;
    }

    @Override // X.AbstractC53895LDf
    public final Bundle LJIIIZ() {
        return null;
    }

    @Override // X.AbstractC53895LDf
    public final String tag() {
        return "NOTIFICATION";
    }

    @Override // X.AbstractC53895LDf
    public final Class<? extends Fragment> LJIIJ() {
        boolean LJIILJJIL = C53765L8f.LJIILJJIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isLeft = ");
        LIZ.append(LJIILJJIL);
        C221018lt.LJFF("InboxPageNode", X1D.LIZIZ(LIZ));
        if (LJIILJJIL) {
            return C55888Lwa.LIZIZ.LIZJ();
        }
        return HomePageUIFrameServiceImpl.LIZ().getFragmentClass("NOTIFICATION");
    }

    public InboxPageNode(ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
    }
}
