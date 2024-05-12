package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.dmfilter.EditableTagsView$enableAddButton$1", f = "EditableTagsView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
public final class NHS extends AbstractC65782Prm implements InterfaceC88473Ynt<String, NHT, InterfaceC67352kd<? super Boolean>, Object> {
    public /* synthetic */ Object LJLIL;
    public /* synthetic */ NHT LJLILLLLZI;

    public NHS(InterfaceC67352kd<? super NHS> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        String str = (String) this.LJLIL;
        NHT nht = this.LJLILLLLZI;
        if (C78685UuP.LJJJZ(str) && (nht instanceof NHV)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(String str, NHT nht, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        NHS nhs = new NHS(interfaceC67352kd);
        nhs.LJLIL = str;
        nhs.LJLILLLLZI = nht;
        return nhs.invokeSuspend(C76800UCe.LIZ);
    }
}
