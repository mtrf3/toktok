package X;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4OO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OO extends C108634Od {
    public final ViewGroup LIZJ;
    public final ViewGroup LIZLLL;
    public final FrameLayout LJ;
    public final boolean LJFF;
    public final PNP LJI;
    public final boolean LJII;
    public final List<InterfaceC62225ObV> LJIIIIZZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4OO(Activity context, SharePackage sharePackage, ViewGroup viewGroup, ViewGroup viewGroup2, FrameLayout frameLayout, PNP pnp, TextView textView, boolean z, List list) {
        super(context, sharePackage);
        o.LJIIIZ(context, "context");
        this.LIZJ = viewGroup;
        this.LIZLLL = viewGroup2;
        this.LJ = frameLayout;
        this.LJFF = false;
        this.LJI = pnp;
        this.LJII = z;
        this.LJIIIIZZ = list;
    }
}
