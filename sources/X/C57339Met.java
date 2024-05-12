package X;

import Y.IDfS130S0100000_9;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.api.MusicDetailApiV2;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import fjb.a;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel$fetchMusicDetail$3", f = "MusicDetailViewModel.kt", l = {199, 202}, m = "invokeSuspend")
/* renamed from: X.Met, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57339Met extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MusicDetailViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57339Met(MusicDetailViewModel musicDetailViewModel, boolean z, InterfaceC67352kd<? super C57339Met> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = musicDetailViewModel;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57339Met(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC199577sP enumC199577sP;
        EnumC199577sP enumC199577sP2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            boolean LJIIZILJ = CommerceMediaServiceImpl.LIZJ().LJIIZILJ();
            TreeMap treeMap = new TreeMap();
            MusicDetailViewModel musicDetailViewModel = this.LJLILLLLZI;
            treeMap.put("item_id", musicDetailViewModel.LJLJI);
            treeMap.put("video_id", musicDetailViewModel.LJLJJL);
            Integer num = musicDetailViewModel.LJLJJLL;
            if (num != null && num.intValue() == 1) {
                treeMap.put("enter_from", String.valueOf(musicDetailViewModel.LJLJJLL));
            }
            if (C44208HWq.LIZ) {
                C8SY c8sy = MusicDetailApiV2.LIZ;
                String str = this.LJLILLLLZI.LJLILLLLZI;
                if (str != null) {
                    boolean z = this.LJLJI;
                    Integer num2 = new Integer(LJIIZILJ ? 1 : 0);
                    c8sy.getClass();
                    XGR LIZIZ = XGJ.LIZ().LIZIZ(new C57340Meu(str, num2.intValue(), treeMap));
                    AbstractC54815LfH abstractC54815LfH = (AbstractC54815LfH) C8SY.LIZIZ.getValue();
                    C57343Mex c57343Mex = C57343Mex.LJLIL;
                    C57345Mez c57345Mez = C57345Mez.LJLIL;
                    if (o.LJ(MusicDetail.class, C57346Mf0.class) || (c57343Mex != null && c57345Mez != null)) {
                        LIZIZ.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH, c57343Mex, c57345Mez, C57346Mf0.class, MusicDetail.class)));
                        if (!z) {
                            enumC199577sP2 = EnumC199577sP.NetWhenCacheMiss;
                        } else {
                            enumC199577sP2 = EnumC199577sP.NetworkOnly;
                        }
                        C78977Uz7.LJJIJL(LIZIZ, enumC199577sP2);
                        InterfaceC65462ha LIZIZ2 = LIZIZ.LIZIZ();
                        IDfS130S0100000_9 iDfS130S0100000_9 = new IDfS130S0100000_9(this.LJLILLLLZI, 3);
                        this.LJLIL = 1;
                        if (LIZIZ2.collect(iDfS130S0100000_9, this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("po is ");
                        LIZ.append(MusicDetail.class);
                        LIZ.append(", do is ");
                        LIZ.append(C57346Mf0.class);
                        LIZ.append(", please pass the onFetchCache and onQueryNet param to map cache");
                        String LIZIZ3 = X1D.LIZIZ(LIZ);
                        LIZIZ3.toString();
                        throw new IllegalStateException(LIZIZ3);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                C8SY c8sy2 = MusicDetailApiV2.LIZ;
                String str2 = this.LJLILLLLZI.LJLILLLLZI;
                if (str2 != null) {
                    boolean z2 = this.LJLJI;
                    Integer num3 = new Integer(LJIIZILJ ? 1 : 0);
                    c8sy2.getClass();
                    XGR LIZIZ4 = XGJ.LIZ().LIZIZ(new C57336Meq(str2, 0, num3.intValue(), treeMap));
                    AbstractC54815LfH abstractC54815LfH2 = (AbstractC54815LfH) C8SY.LIZIZ.getValue();
                    C57342Mew c57342Mew = C57342Mew.LJLIL;
                    C57344Mey c57344Mey = C57344Mey.LJLIL;
                    if (o.LJ(MusicDetail.class, C57338Mes.class) || (c57342Mew != null && c57344Mey != null)) {
                        LIZIZ4.LIZ(new C84569XGz(new C57354Mf8(abstractC54815LfH2, c57342Mew, c57344Mey, C57338Mes.class, MusicDetail.class)));
                        if (!z2) {
                            enumC199577sP = EnumC199577sP.NetWhenCacheMiss;
                        } else {
                            enumC199577sP = EnumC199577sP.NetworkOnly;
                        }
                        C78977Uz7.LJJIJL(LIZIZ4, enumC199577sP);
                        InterfaceC65462ha LIZIZ5 = LIZIZ4.LIZIZ();
                        IDfS130S0100000_9 iDfS130S0100000_92 = new IDfS130S0100000_9(this.LJLILLLLZI, 4);
                        this.LJLIL = 2;
                        if (LIZIZ5.collect(iDfS130S0100000_92, this) == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("po is ");
                        LIZ2.append(MusicDetail.class);
                        LIZ2.append(", do is ");
                        LIZ2.append(C57338Mes.class);
                        LIZ2.append(", please pass the onFetchCache and onQueryNet param to map cache");
                        String LIZIZ6 = X1D.LIZIZ(LIZ2);
                        LIZIZ6.toString();
                        throw new IllegalStateException(LIZIZ6);
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
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
