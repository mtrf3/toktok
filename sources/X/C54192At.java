package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import defpackage.q;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchFavoriteEffect$1", f = "StickerEffectViewModel.kt", l = {128, 129, 131}, m = "invokeSuspend")
/* renamed from: X.2At, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54192At extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54192At(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C54192At> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54192At(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception unused) {
            XLL xll = this.LJLILLLLZI.LJLJI;
            AbstractC261010s abstractC261010s = new AbstractC261010s() { // from class: X.1cr
                public final boolean LIZ = true;
                public final String LIZIZ = "fetchFavoriteEffect failed";

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C37051cr)) {
                        return false;
                    }
                    C37051cr c37051cr = (C37051cr) obj2;
                    return this.LIZ == c37051cr.LIZ && o.LJ(this.LIZIZ, c37051cr.LIZIZ);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [int] */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v6 */
                public final int hashCode() {
                    boolean z = this.LIZ;
                    ?? r0 = z;
                    if (z) {
                        r0 = 1;
                    }
                    return this.LIZIZ.hashCode() + (r0 * 31);
                }

                public final String toString() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("FetchFavoriteError(noAvailableData=");
                    LIZ.append(this.LIZ);
                    LIZ.append(", errorMsg=");
                    return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
                }
            };
            this.LJLIL = 3;
            if (xll.emit(abstractC261010s, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C141335gf.LIZJ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                }
                return C76800UCe.LIZ;
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            final C39011g1 c39011g1 = this.LJLILLLLZI.LJLJJI;
            this.LJLIL = 1;
            c39011g1.getClass();
            if (EffectParseOptSetting.enableOpt()) {
                obj = c39011g1.LJIIIZ(this);
            } else {
                final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                final long currentTimeMillis = System.currentTimeMillis();
                c39011g1.LJLILLLLZI.fetchFavoriteList(c39011g1.LJLIL, new IFetchFavoriteList() { // from class: X.1pH
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList
                    public final void onFailed(ExceptionResult exceptionResult) {
                        C32041No.LJIILJJIL(2, System.currentTimeMillis() - currentTimeMillis, "favorite");
                        InterfaceC67352kd<C1QC> interfaceC67352kd = c84654XKg;
                        C1QC c1qc = c39011g1.LJLJLJ;
                        C1QC c1qc2 = new C1QC(c1qc.LJLIL, c1qc.LJLJI, C61878OQg.INSTANCE, null, 56);
                        C3C5.m7constructorimpl(c1qc2);
                        interfaceC67352kd.resumeWith(c1qc2);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(FetchFavoriteListResponse fetchFavoriteListResponse) {
                        String str = "favorite";
                        C32041No.LJIILJJIL(1, System.currentTimeMillis() - currentTimeMillis, "favorite");
                        C1QC LIZ = new C15T(str, str).LIZ(fetchFavoriteListResponse);
                        O6R.LJJIIJ(LIZ);
                        C39011g1 c39011g12 = c39011g1;
                        String str2 = c39011g12.LJLJLJ.LJLIL;
                        c39011g12.LJLJLJ = new C1QC(str2, str2, LIZ.LJLILLLLZI, null, 56);
                        InterfaceC67352kd<C1QC> interfaceC67352kd = c84654XKg;
                        C1QC c1qc = c39011g1.LJLJLJ;
                        C3C5.m7constructorimpl(c1qc);
                        interfaceC67352kd.resumeWith(c1qc);
                    }
                });
                obj = c84654XKg.LIZ();
            }
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        XLL xll2 = this.LJLILLLLZI.LJLJI;
        C37021co c37021co = new C37021co((C1QC) obj);
        this.LJLIL = 2;
        if (xll2.emit(c37021co, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
