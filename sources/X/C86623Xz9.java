package X;

import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.Xz9, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86623Xz9 extends QXX {
    public final /* synthetic */ LinkedHashMap LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;
    public final /* synthetic */ C68322mC LJLJJI;
    public final /* synthetic */ C68322mC LJLJJL;
    public final /* synthetic */ C68322mC LJLJJLL;
    public final /* synthetic */ C68322mC LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.QXX
    public final void LJLJI() {
        InterfaceC37276Ek4 interfaceC37276Ek4;
        try {
            InputStream inputStream = (InputStream) this.LJLJJI.element;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable unused) {
        }
        try {
            WeakReference weakReference = (WeakReference) this.LJLJL.element;
            if (weakReference != null && (interfaceC37276Ek4 = (InterfaceC37276Ek4) weakReference.get()) != null && !interfaceC37276Ek4.isCanceled()) {
                interfaceC37276Ek4.cancel();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LLLLZ() {
        return (String) this.LJLJJL.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Throwable LLLLZIL() {
        return (Throwable) this.LJLJJLL.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InputStream LLLLZLLIL() {
        return (InputStream) this.LJLJJI.element;
    }

    public C86623Xz9(LinkedHashMap linkedHashMap, C76732zl c76732zl, C76732zl c76732zl2, C68322mC c68322mC, C68322mC c68322mC2, C68322mC c68322mC3, C68322mC c68322mC4) {
        this.LJLIL = linkedHashMap;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = c76732zl2;
        this.LJLJJI = c68322mC;
        this.LJLJJL = c68322mC2;
        this.LJLJJLL = c68322mC3;
        this.LJLJL = c68322mC4;
    }
}
