package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A9m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25770A9m extends AbstractC25774A9q {
    public final InterfaceC25772A9o LJLIL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25770A9m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, null, 12);
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC25773A9p
    public final void K8(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.K8(listener);
    }

    @Override // X.InterfaceC25772A9o
    public final void LJIIL() {
        this.LJLIL.LJIIL();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25772A9o, X.InterfaceC25773A9p
    public final void LJIILL(AbstractC57774Mlu<RecUser> abstractC57774Mlu) {
        this.LJLIL.LJIILL(abstractC57774Mlu);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJIJ(String str, String str2, List list) {
        this.LJLIL.LJJIJ(str, str2, list);
    }

    @Override // X.InterfaceC25772A9o
    public final void LJJJ(ActivityC45651qj activityC45651qj, Fragment fragment, InterfaceC88472Yns<? super C57858MnG, C76800UCe> config) {
        o.LJIIIZ(config, "config");
        this.LJLIL.LJJJ(activityC45651qj, fragment, config);
    }

    @Override // X.InterfaceC25772A9o
    public final void LJJJJLL(boolean z) {
        this.LJLIL.LJJJJLL(z);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIIIJJIZ(InterfaceC88472Yns<? super C57819Mmd, C57819Mmd> interfaceC88472Yns) {
        this.LJLIL.LJJLIIIJJIZ(interfaceC88472Yns);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJJLIL(InterfaceC57917MoD interfaceC57917MoD) {
        this.LJLIL.LJJLIL(interfaceC57917MoD);
    }

    @Override // X.InterfaceC25773A9p
    public final void LJLJLJ(boolean z) {
        this.LJLIL.LJLJLJ(z);
    }

    @Override // X.InterfaceC25773A9p
    public final void W7(InterfaceC57910Mo6 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL.W7(listener);
    }

    @Override // X.InterfaceC25773A9p
    public final void destroy() {
        this.LJLIL.destroy();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25773A9p
    public C57778Mly getCurrentState() {
        return this.LJLIL.getCurrentState();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25773A9p
    public AbstractC030109x getItemAnimator() {
        return this.LJLIL.getItemAnimator();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25772A9o
    public AbstractC25774A9q getLayout() {
        return this.LJLIL.getLayout();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25772A9o
    public SYL getPowerList() {
        return this.LJLIL.getPowerList();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25772A9o
    public C73305Spp getStatusView() {
        return this.LJLIL.getStatusView();
    }

    @Override // X.InterfaceC25773A9p
    public final void reset() {
        this.LJLIL.reset();
    }

    @Override // X.AbstractC25774A9q, X.InterfaceC25772A9o
    public void setConfigInner(C57859MnH config) {
        o.LJIIIZ(config, "config");
        this.LJLIL.setConfigInner(config);
    }

    @Override // X.InterfaceC25772A9o
    public final void LJIIZILJ(AbstractC25774A9q layout) {
        o.LJIIIZ(layout, "layout");
        this.LJLIL.LJIIZILJ(layout);
    }

    public final void setSeeAllStyle(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        C16880lQ.LJIIJ(listener, findViewById(R.id.myl));
    }

    public final void LIZ(int i, View.OnClickListener onClickListener) {
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.jk2);
        tuxTextView.setText(getContext().getString(i));
        C16880lQ.LJJJJI(tuxTextView, onClickListener);
        C9AE.LIZ(tuxTextView, C9AC.ALPHA, 0.0f);
        View findViewById = findViewById(R.id.jk1);
        findViewById.setVisibility(8);
        C16880lQ.LJIIJ(onClickListener, findViewById);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C25770A9m(android.content.Context r4, android.util.AttributeSet r5, X.InterfaceC25772A9o r6, int r7) {
        /*
            r3 = this;
            r0 = r7 & 2
            r2 = 0
            if (r0 == 0) goto L6
            r5 = r2
        L6:
            r0 = r7 & 8
            if (r0 == 0) goto L18
            X.MoQ r0 = com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService r1 = X.C57930MoQ.LIZ()
            r0 = 1
            X.A9o r6 = X.C94293mz.LIZ(r1, r2, r0)
        L18:
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r4, r2)
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0 = 0
            r3.<init>(r4, r5, r0)
            r3.LJLIL = r6
            android.content.Context r1 = r3.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            r0 = 2131562476(0x7f0d0fec, float:1.8750382E38)
            X.C7W6.LIZ(r1, r0, r3)
            r3.LJIIZILJ(r3)
            r0 = 2131380167(0x7f0a47c7, float:1.8380615E38)
            android.view.View r2 = r3.findViewById(r0)
            X.9AC r1 = X.C9AC.ALPHA
            r0 = 0
            X.C9AE.LIZ(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25770A9m.<init>(android.content.Context, android.util.AttributeSet, X.A9o, int):void");
    }
}
