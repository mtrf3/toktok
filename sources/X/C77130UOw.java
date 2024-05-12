package X;

import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;

/* renamed from: X.UOw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77130UOw<T> implements InterfaceC86003Zc {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ ContactUFR LJLILLLLZI;

    public C77130UOw(ContactUFR contactUFR, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = contactUFR;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77150UPq> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(new C77150UPq(this.LJLIL, 0, 0, null, 30));
        this.LJLILLLLZI.LJIIJJI(this.LJLIL);
        interfaceC73573Su9.onComplete();
    }
}
