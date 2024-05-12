package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

/* renamed from: X.26y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C532026y extends AbstractC65781Prl implements InterfaceC65784Pro<C29321Dc> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ AbstractC24810yD LJLILLLLZI;
    public final /* synthetic */ C25730zh LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Context, T> LJLJJI;
    public final /* synthetic */ C0MG LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ C03770Cv<C55572Gb<T>> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C532026y(Context context, AbstractC24810yD abstractC24810yD, C25730zh c25730zh, InterfaceC88472Yns<? super Context, ? extends T> interfaceC88472Yns, C0MG c0mg, String str, C03770Cv<C55572Gb<T>> c03770Cv) {
        super(0);
        this.LJLIL = context;
        this.LJLILLLLZI = abstractC24810yD;
        this.LJLJI = c25730zh;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = c0mg;
        this.LJLJJLL = str;
        this.LJLJL = c03770Cv;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.26x, T, X.2Gb] */
    @Override // X.InterfaceC65784Pro
    public final C29321Dc invoke() {
        SparseArray<Parcelable> sparseArray;
        View typedView$ui_release;
        ?? c55572Gb = new C55572Gb(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
        c55572Gb.setFactory(this.LJLJJI);
        C0MG c0mg = this.LJLJJL;
        Object obj = null;
        if (c0mg != null) {
            obj = c0mg.LJFF(this.LJLJJLL);
        }
        if ((obj instanceof SparseArray) && (sparseArray = (SparseArray) obj) != null && (typedView$ui_release = c55572Gb.getTypedView$ui_release()) != null) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.LJLJL.LIZ = c55572Gb;
        return c55572Gb.getLayoutNode();
    }
}
