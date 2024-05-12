package X;

import Y.ARunnableS33S0200000_14;
import android.os.Looper;
import kotlin.jvm.internal.o;

/* renamed from: X.Wef, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82805Wef implements InterfaceC82810Wek<Object> {
    public final /* synthetic */ InterfaceC82810Wek<Object> LIZ;

    public C82805Wef(InterfaceC82810Wek<Object> interfaceC82810Wek) {
        this.LIZ = interfaceC82810Wek;
    }

    @Override // X.InterfaceC82810Wek
    public final void LIZ(Object obj) {
        if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            this.LIZ.LIZ(obj);
        } else {
            C82802Wec.LJFF.post(new ARunnableS33S0200000_14(obj, this.LIZ, 1));
        }
    }
}
