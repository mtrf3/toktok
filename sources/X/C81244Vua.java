package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* renamed from: X.Vua, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81244Vua extends ContextWrapper {
    public LayoutInflater LIZ;
    public LayoutInflater LIZIZ;
    public final Fragment LIZJ;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return C16880lQ.LLILL(getBaseContext(), str);
        }
        if (this.LIZIZ == null) {
            if (this.LIZ == null) {
                this.LIZ = (LayoutInflater) C16880lQ.LLILL(getBaseContext(), "layout_inflater");
            }
            this.LIZIZ = this.LIZ.cloneInContext(this);
        }
        return this.LIZIZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C81244Vua(android.view.LayoutInflater r2, androidx.fragment.app.Fragment r3) {
        /*
            r1 = this;
            r2.getClass()
            android.content.Context r0 = r2.getContext()
            r0.getClass()
            r1.<init>(r0)
            r1.LIZ = r2
            r3.getClass()
            r1.LIZJ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81244Vua.<init>(android.view.LayoutInflater, androidx.fragment.app.Fragment):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81244Vua(Context context, Fragment fragment) {
        super(context);
        context.getClass();
        this.LIZ = null;
        fragment.getClass();
        this.LIZJ = fragment;
    }
}
