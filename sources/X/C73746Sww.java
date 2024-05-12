package X;

import defpackage.PasskeyFrequencySettingsModel;
import java.util.concurrent.Callable;

/* renamed from: X.Sww, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73746Sww<T, U> extends AbstractC73739Swp<T, U> {
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73650SvO<? extends U>> LJLJI;
    public final boolean LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    @Override // X.AbstractC73745Swv
    public final void LJIILIIL(InterfaceC73740Swq<? super U> interfaceC73740Swq) {
        AbstractC73745Swv<T> abstractC73745Swv = this.LJLILLLLZI;
        InterfaceC48038ItG<? super T, ? extends InterfaceC73650SvO<? extends U>> interfaceC48038ItG = this.LJLJI;
        if (abstractC73745Swv instanceof Callable) {
            try {
                PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = (Object) ((Callable) abstractC73745Swv).call();
                if (passkeyFrequencySettingsModel != null) {
                    try {
                        InterfaceC73650SvO<? extends U> apply = interfaceC48038ItG.apply(passkeyFrequencySettingsModel);
                        C73320Sq4.LIZ(apply, "The mapper returned a null Publisher");
                        InterfaceC73650SvO<? extends U> interfaceC73650SvO = apply;
                        if (interfaceC73650SvO instanceof Callable) {
                            try {
                                Object call = ((Callable) interfaceC73650SvO).call();
                                if (call == null) {
                                    EnumC73747Swx.complete(interfaceC73740Swq);
                                    return;
                                } else {
                                    interfaceC73740Swq.onSubscribe(new C73741Swr(interfaceC73740Swq, call));
                                    return;
                                }
                            } catch (Throwable th) {
                                V0N.LJJIL(th);
                                EnumC73747Swx.error(th, interfaceC73740Swq);
                                return;
                            }
                        }
                        interfaceC73650SvO.subscribe(interfaceC73740Swq);
                        return;
                    } catch (Throwable th2) {
                        V0N.LJJIL(th2);
                        EnumC73747Swx.error(th2, interfaceC73740Swq);
                        return;
                    }
                }
                EnumC73747Swx.complete(interfaceC73740Swq);
                return;
            } catch (Throwable th3) {
                V0N.LJJIL(th3);
                EnumC73747Swx.error(th3, interfaceC73740Swq);
                return;
            }
        }
        this.LJLILLLLZI.LJIIL(new C73768SxI(interfaceC73740Swq, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL));
    }

    public C73746Sww(AbstractC73745Swv abstractC73745Swv, InterfaceC48038ItG interfaceC48038ItG, int i, int i2) {
        super(abstractC73745Swv);
        this.LJLJI = interfaceC48038ItG;
        this.LJLJJI = false;
        this.LJLJJL = i;
        this.LJLJJLL = i2;
    }
}
