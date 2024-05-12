package X;

import java.util.Iterator;

/* renamed from: X.NlY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60300NlY extends AbstractC65781Prl implements InterfaceC88471Ynr<Object, Throwable, C76800UCe> {
    public final /* synthetic */ C60296NlU LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;
    public final /* synthetic */ Iterator LJLJI;
    public final /* synthetic */ C60301NlZ LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60300NlY(C60296NlU c60296NlU, InterfaceC88472Yns interfaceC88472Yns, Iterator it, C60301NlZ c60301NlZ, InterfaceC88472Yns interfaceC88472Yns2) {
        super(2);
        this.LJLIL = c60296NlU;
        this.LJLILLLLZI = interfaceC88472Yns;
        this.LJLJI = it;
        this.LJLJJI = c60301NlZ;
        this.LJLJJL = interfaceC88472Yns2;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Object obj, Throwable th) {
        Throwable th2 = th;
        if (obj != null) {
            this.LJLILLLLZI.invoke(obj);
        } else {
            C60296NlU c60296NlU = this.LJLIL;
            Iterator<? extends InterfaceC60298NlW> it = this.LJLJI;
            C60301NlZ c60301NlZ = this.LJLJJI;
            InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2 = this.LJLJJL;
            if (th2 == null) {
                th2 = new IllegalStateException("loadImage failed, Bitmap is null");
            }
            c60296NlU.LIZIZ(it, c60301NlZ, interfaceC88472Yns, interfaceC88472Yns2, th2);
        }
        return C76800UCe.LIZ;
    }
}
