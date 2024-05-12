package X;

import android.content.Context;
import android.widget.ListView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.OMv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61789OMv extends ListView implements InterfaceC61792OMy {
    public ON0 LJLIL;

    public final ON0 getOptionClickListener() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61789OMv(Context context) {
        super(context);
        a1.LJFF(context, "context");
    }

    @Override // X.InterfaceC61792OMy
    public void setOptionListener(ON0 mOptionClickListener) {
        o.LJIIIZ(mOptionClickListener, "mOptionClickListener");
        this.LJLIL = mOptionClickListener;
    }
}
