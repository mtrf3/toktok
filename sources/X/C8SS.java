package X;

import com.ss.android.ugc.aweme.music.api.MusicDetailApiV2;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS93S0101000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.MusicCollectViewModel$collectMusic$1", f = "MusicCollectViewModel.kt", l = {126}, m = "invokeSuspend")
/* renamed from: X.8SS, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicCollectViewModel LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8SS(MusicCollectViewModel musicCollectViewModel, int i, InterfaceC67352kd<? super C8SS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicCollectViewModel;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C8SS(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C8SY c8sy = MusicDetailApiV2.LIZ;
            String str = this.LJLILLLLZI.LJLIL;
            if (str != null) {
                int i2 = this.LJLJI;
                c8sy.getClass();
                XGR LIZ = XGJ.LIZ().LIZ(new C8ST(str, i2));
                LIZ.LIZ(new XH4(new XHU(str)));
                CollectMusicResponse collectMusicResponse = new CollectMusicResponse();
                collectMusicResponse.action = i2;
                LIZ.LIZ(new C84568XGy(new C8SV(collectMusicResponse)));
                InterfaceC65462ha LIZIZ = LIZ.LIZIZ();
                final MusicCollectViewModel musicCollectViewModel = this.LJLILLLLZI;
                final int i3 = this.LJLJI;
                InterfaceC64672gJ<XGX<C8SV>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<C8SV>>() { // from class: X.8SR
                    @Override // X.InterfaceC64672gJ
                    public final Object emit(XGX<C8SV> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                        XGX<C8SV> xgx2 = xgx;
                        if (xgx2 instanceof XGW) {
                            CollectMusicResponse collectMusicResponse2 = ((C8SV) ((XGW) xgx2).LJ).LIZ;
                            if (collectMusicResponse2 != null) {
                                MusicCollectViewModel.this.setState(new AqS93S0101000_3(i3, collectMusicResponse2, 17));
                            }
                        } else if (xgx2 instanceof XGT) {
                            MusicCollectViewModel.this.setState(new AqS169S0100000_3(xgx2, (XGX<C186307Sw>) 921));
                        }
                        return C76800UCe.LIZ;
                    }
                };
                this.LJLIL = 1;
                if (LIZIZ.collect(interfaceC64672gJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
