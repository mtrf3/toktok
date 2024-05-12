package X;

/* renamed from: X.Qt9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68415Qt9<TResult> implements InterfaceC67677QhF {
    public final /* synthetic */ OSZ<String, Integer> LJLIL;
    public final /* synthetic */ InterfaceC68422QtG LJLILLLLZI;

    public C68415Qt9(OSZ<String, Integer> osz, InterfaceC68422QtG interfaceC68422QtG) {
        this.LJLIL = osz;
        this.LJLILLLLZI = interfaceC68422QtG;
    }

    @Override // X.InterfaceC67677QhF
    public final void onSuccess(Object obj) {
        InterfaceC68422QtG interfaceC68422QtG = this.LJLILLLLZI;
        if (interfaceC68422QtG != null) {
            interfaceC68422QtG.onSave(true, this.LJLIL.getSecond());
        }
    }
}
