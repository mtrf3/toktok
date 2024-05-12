package X;

import android.content.Context;
import android.graphics.Rect;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tpu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75858Tpu extends T2K implements InterfaceC75787Tol {
    public Rect LJLILLLLZI;
    public Rect LJLJI;
    public Rect LJLJJI;
    public int[] LJLJJL;

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ List<InterfaceC75179Tex> getAllLayoutWindows();

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ Rect getContainerActualRange();

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ Rect getContainerAllRange();

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ String getLayoutBusinessType();

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ String getLayoutId();

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ String getLayoutName();

    public abstract /* synthetic */ Integer getLayoutScene();

    @Override // X.InterfaceC75787Tol
    public abstract /* synthetic */ Rect getPlayerRange();

    public abstract /* synthetic */ String getRealDrawLayoutId();

    public final Rect getMActualShowAreaInWindow() {
        return this.LJLILLLLZI;
    }

    public final Rect getMAllAreaInWindow() {
        return this.LJLJI;
    }

    public final int[] getMParentLeftAndTop() {
        return this.LJLJJL;
    }

    public final Rect getMPlayerAreaRect() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC75858Tpu(Context context) {
        super(context);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new Rect();
        this.LJLJJI = new Rect();
        this.LJLJJL = new int[2];
    }

    public final void setMActualShowAreaInWindow(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLILLLLZI = rect;
    }

    public final void setMAllAreaInWindow(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLJI = rect;
    }

    public final void setMParentLeftAndTop(int[] iArr) {
        o.LJIIIZ(iArr, "<set-?>");
        this.LJLJJL = iArr;
    }

    public final void setMPlayerAreaRect(Rect rect) {
        o.LJIIIZ(rect, "<set-?>");
        this.LJLJJI = rect;
    }
}
