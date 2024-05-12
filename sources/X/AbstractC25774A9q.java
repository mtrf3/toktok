package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.A9q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25774A9q extends FrameLayout implements InterfaceC25772A9o {
    public void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
    }

    public abstract /* synthetic */ C57778Mly getCurrentState();

    public abstract /* synthetic */ AbstractC030109x getItemAnimator();

    public abstract /* synthetic */ AbstractC25774A9q getLayout();

    public abstract /* synthetic */ SYL getPowerList();

    public abstract /* synthetic */ C73305Spp getStatusView();

    public abstract /* synthetic */ void setConfigInner(C57859MnH c57859MnH);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC25774A9q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC25774A9q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
    }
}
