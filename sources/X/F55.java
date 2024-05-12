package X;

import com.lynx.react.bridge.Callback;

/* loaded from: classes7.dex */
public final class F55 implements Callback {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ F57 LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ String LIZLLL;

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        if (objArr.length > 0 && !this.LIZ) {
            C40053Fnl c40053Fnl = C40053Fnl.LIZ;
            Object obj = objArr[0];
            c40053Fnl.getClass();
            this.LIZIZ.LIZ(this.LIZJ, this.LIZLLL, C40053Fnl.LIZIZ(obj));
        }
    }

    public F55(boolean z, F57 f57, int i, String str) {
        this.LIZ = z;
        this.LIZIZ = f57;
        this.LIZJ = i;
        this.LIZLLL = str;
    }
}
