package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$queryPostedDraftEntrance$draftsInfo$1", f = "DraftViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GNY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C26336AVg>, Object> {
    public GNY(InterfaceC67352kd<? super GNY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GNY(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C60903NvH.LJIIJJI().LJJJI().LIZJ().queryDraftsInfo(new GPK(false, false, GP9.POSTED, 3));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C26336AVg> interfaceC67352kd) {
        return new GNY(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
