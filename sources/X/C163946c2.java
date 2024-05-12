package X;

import com.ss.android.ugc.gamora.editor.sticker.nature.model.NatureSpeciesModel;
import com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureViewModel;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureViewModel$2", f = "NatureViewModel.kt", l = {58}, m = "invokeSuspend")
/* renamed from: X.6c2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163946c2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NatureViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163946c2(NatureViewModel natureViewModel, InterfaceC67352kd<? super C163946c2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = natureViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C163946c2(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final NatureViewModel natureViewModel = this.LJLILLLLZI;
            this.LJLIL = 1;
            Object collect = natureViewModel.LJLIL.LJ.collect(new InterfaceC64672gJ<AbstractC164156cN<? extends List<? extends NatureSpeciesModel>>>() { // from class: X.6c3
                @Override // X.InterfaceC64672gJ
                public final Object emit(AbstractC164156cN<? extends List<? extends NatureSpeciesModel>> abstractC164156cN, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    C164136cL c164136cL;
                    AbstractC164156cN<? extends List<? extends NatureSpeciesModel>> abstractC164156cN2 = abstractC164156cN;
                    o.LJIIIZ(abstractC164156cN2, "<this>");
                    if (abstractC164156cN2 instanceof C164166cO) {
                        NatureViewModel.this.LJLJL.postValue(new Integer(8));
                        NatureViewModel.this.LJLJJL.postValue(new Integer(8));
                        NatureViewModel.this.LJLJI.postValue(new Integer(0));
                    } else {
                        boolean z = abstractC164156cN2 instanceof C164136cL;
                        if (z && ((C164136cL) abstractC164156cN2).LIZ != 0) {
                            NatureViewModel.this.LJLJI.postValue(new Integer(8));
                            Object obj2 = null;
                            if (z && (c164136cL = (C164136cL) abstractC164156cN2) != null) {
                                obj2 = c164136cL.LIZ;
                            }
                            List<NatureSpeciesModel> list = (List) obj2;
                            if (list != null) {
                                NatureViewModel.this.LJLJLLL.postValue(list);
                                if (list.size() == 0) {
                                    NatureViewModel.this.LJLJJL.postValue(new Integer(0));
                                    C163966c4.LIZ(new Integer(1));
                                } else {
                                    NatureViewModel.this.LJLJL.postValue(new Integer(0));
                                }
                            }
                        } else if (abstractC164156cN2 instanceof C164146cM) {
                            NatureViewModel.this.LJLJI.postValue(new Integer(8));
                            NatureViewModel.this.LJLJJL.postValue(new Integer(0));
                            C163966c4.LIZ(new Integer(2));
                        }
                    }
                    return C76800UCe.LIZ;
                }
            }, this);
            if (collect != enumC58928NAu) {
                collect = C76800UCe.LIZ;
            }
            if (collect == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
