package X;

import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.retrofit2.RequestBuilder;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.mime.TypedInput;

/* renamed from: X.EpF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37597EpF implements InterfaceC37346ElC<TypedInput> {
    public final /* synthetic */ DefaultResourceLoader LJLIL;
    public final /* synthetic */ BQ6 LJLILLLLZI;
    public final /* synthetic */ BQ6 LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, C64797Pbt<TypedInput> c64797Pbt) {
    }

    @Override // X.InterfaceC37346ElC
    public final void LJIIIIZZ(RequestBuilder requestBuilder) {
    }

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<TypedInput> interfaceC37276Ek4, Throwable th) {
        BQ6 bq6 = this.LJLILLLLZI;
        if (bq6 != null) {
            bq6.accept(th);
        }
    }

    @Override // X.InterfaceC37346ElC
    public final void LJ(SsHttpCall ssHttpCall, C64797Pbt c64797Pbt) {
        Object LIZ;
        BQ6 bq6;
        BQ6 bq62;
        C37238EjS.LJI(6, "[Resource] response start.", null);
        if (c64797Pbt == null) {
            BQ6 bq63 = this.LJLILLLLZI;
            if (bq63 != null) {
                bq63.accept(new NullPointerException("Response is null!"));
                return;
            }
            return;
        }
        try {
            this.LJLIL.getClass();
            LIZ = DefaultResourceLoader.LJ(c64797Pbt);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null && (bq62 = this.LJLILLLLZI) != null) {
            bq62.accept(m10exceptionOrNullimpl);
        }
        if (C3C5.m12isFailureimpl(LIZ) || LIZ == null || (bq6 = this.LJLJI) == null) {
            return;
        }
        bq6.accept(LIZ);
    }

    public C37597EpF(DefaultResourceLoader defaultResourceLoader, InterfaceC37454Emw interfaceC37454Emw, BQ6 bq6, BQ6 bq62) {
        this.LJLIL = defaultResourceLoader;
        this.LJLILLLLZI = bq6;
        this.LJLJI = bq62;
    }
}
