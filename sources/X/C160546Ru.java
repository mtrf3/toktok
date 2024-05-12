package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;

/* renamed from: X.6Ru, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160546Ru extends FrameLayout {
    public C08610Vl<C160496Rp> LJLIL;
    public LifecycleOwner LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    public final View getRectView() {
        return (View) this.LJLJI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C160546Ru(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 913));
    }
}
