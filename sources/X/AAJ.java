package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes5.dex */
public final class AAJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Rect LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJI;
    public final /* synthetic */ String LJLJJI;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LJLIL.getGlobalVisibleRect(this.LJLILLLLZI)) {
            this.LJLJI.invoke(this.LJLJJI);
            this.LJLIL.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AAJ(View view, Rect rect, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, String str) {
        this.LJLIL = view;
        this.LJLILLLLZI = rect;
        this.LJLJI = interfaceC88472Yns;
        this.LJLJJI = str;
    }
}
