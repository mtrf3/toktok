package X;

import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM$handleFavoriteOptimsticUI$5", f = "VideoFavoriteVM.kt", l = {602}, m = "invokeSuspend")
/* renamed from: X.2g3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64512g3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ VideoFavoriteVM LJLJI;
    public final /* synthetic */ InterfaceC79150V4o LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64512g3(VideoFavoriteVM videoFavoriteVM, InterfaceC79150V4o interfaceC79150V4o, InterfaceC67352kd<? super C64512g3> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = videoFavoriteVM;
        this.LJLJJI = interfaceC79150V4o;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64512g3 c64512g3 = new C64512g3(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c64512g3.LJLILLLLZI = obj;
        return c64512g3;
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
            final InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            final VideoItemParams gv0 = this.LJLJI.gv0();
            if (gv0 != null) {
                final VideoFavoriteVM videoFavoriteVM = this.LJLJI;
                final InterfaceC79150V4o interfaceC79150V4o = this.LJLJJI;
                Aweme aweme = gv0.getAweme();
                o.LJIIIIZZ(aweme, "item.aweme");
                String str = gv0.mEventType;
                if (str == null) {
                    str = "";
                }
                String str2 = gv0.mFrom;
                if (str2 == null) {
                    str2 = "";
                }
                InterfaceC65462ha LIZ = C203857zJ.LIZ(aweme, str, str2, videoFavoriteVM.ov0(), videoFavoriteVM.lv0());
                InterfaceC64672gJ<C64492g1> interfaceC64672gJ = new InterfaceC64672gJ<C64492g1>() { // from class: X.2g2
                    @Override // X.InterfaceC64672gJ
                    public final Object emit(C64492g1 c64492g1, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                        Object LJI;
                        C64492g1 c64492g12 = c64492g1;
                        if (c64492g12 == null) {
                            interfaceC79150V4o.LIZIZ(null);
                        } else {
                            EnumC78982UzC enumC78982UzC = c64492g12.LIZ;
                            EnumC78982UzC enumC78982UzC2 = EnumC78982UzC.Optimistic;
                            if (enumC78982UzC != enumC78982UzC2) {
                                interfaceC79150V4o.LIZIZ(null);
                            }
                            if (c64492g12.LIZIZ == null && c64492g12.LIZ == enumC78982UzC2 && (LJI = XKX.LJI(C36636EZk.LIZ, new C64522g4(videoFavoriteVM, gv0, null), interfaceC67352kd)) == EnumC58928NAu.COROUTINE_SUSPENDED) {
                                return LJI;
                            }
                        }
                        return C76800UCe.LIZ;
                    }
                };
                this.LJLIL = 1;
                if (((C65482hc) LIZ).collect(interfaceC64672gJ, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
