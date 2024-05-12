package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;

/* renamed from: X.2v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73822v4 extends C111564Zk {
    public int LJLJI;

    @Override // X.C111564Zk
    public int getMInTopModeMarginTop() {
        return this.LJLJI;
    }

    @Override // X.C111564Zk
    public void setMInTopModeMarginTop(int i) {
        this.LJLJI = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73822v4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJI = C17N.LJIILL(3.0d);
    }
}
