package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.4Bq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC105384Bq extends ViewOnTouchListenerC105424Bu {
    public final View LJLIL;
    public int LJLILLLLZI;

    public AbstractC105384Bq(View panelLayout, ViewGroup parentContainer) {
        o.LJIIIZ(parentContainer, "parentContainer");
        o.LJIIIZ(panelLayout, "panelLayout");
        this.LJLIL = panelLayout;
        this.LJLILLLLZI = -1;
    }

    public /* synthetic */ AbstractC105384Bq(ViewGroup viewGroup, int i) {
        this(C1FL.LIZIZ(viewGroup, i, viewGroup, false, "from(parentContainer.con…, parentContainer, false)"), viewGroup);
    }
}
