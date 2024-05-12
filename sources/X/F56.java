package X;

import com.lynx.react.bridge.Callback;

/* loaded from: classes7.dex */
public final class F56 implements Callback {
    public final /* synthetic */ F57 LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        if (objArr.length > 0) {
            C40053Fnl c40053Fnl = C40053Fnl.LIZ;
            Object obj = objArr[0];
            c40053Fnl.getClass();
            this.LIZ.LIZ(this.LIZIZ, this.LIZJ, C40053Fnl.LIZIZ(obj));
        }
    }

    public F56(F57 f57, int i, String str) {
        this.LIZ = f57;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
