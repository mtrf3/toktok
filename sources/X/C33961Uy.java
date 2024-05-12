package X;

import Y.IDObjectS0S0101000;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.1Uy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33961Uy implements InterfaceC1039145z<View> {
    public final /* synthetic */ ViewGroup LIZ;

    @Override // X.InterfaceC1039145z
    public final Iterator<View> iterator() {
        ViewGroup iterator = this.LIZ;
        o.LJIIIZ(iterator, "$this$iterator");
        return new IDObjectS0S0101000(iterator, 2);
    }

    public C33961Uy(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
