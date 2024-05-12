package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.api.FirstStickerPanelChannel;
import com.bytedance.android.live.effect.api.SelectH5StickerInPreview;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.EffectFirstPanelHelper$fetchEffectFirstPanelListOld$1$1", f = "EffectFirstPanelHelper.kt", l = {145}, m = "invokeSuspend")
/* renamed from: X.2Bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54352Bj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ StickerEffectViewModel LJLJI;
    public final /* synthetic */ DataChannel LJLJJI;
    public final /* synthetic */ C37 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54352Bj(StickerEffectViewModel stickerEffectViewModel, DataChannel dataChannel, C37 c37, InterfaceC67352kd<? super C54352Bj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = stickerEffectViewModel;
        this.LJLJJI = dataChannel;
        this.LJLJJL = c37;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54352Bj c54352Bj = new C54352Bj(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c54352Bj.LJLILLLLZI = obj;
        return c54352Bj;
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
            StickerEffectViewModel stickerEffectViewModel = this.LJLJI;
            stickerEffectViewModel.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), C78613UtF.LIZJ, null, new C55872Hf(stickerEffectViewModel, null), 2);
            this.LJLJI.ov0();
            this.LJLJI.pv0();
            final StickerEffectViewModel stickerEffectViewModel2 = this.LJLJI;
            XLL xll = stickerEffectViewModel2.LJLJI;
            final DataChannel dataChannel = this.LJLJJI;
            final C37 c37 = this.LJLJJL;
            InterfaceC64672gJ<AbstractC261010s<? extends LiveEffect>> interfaceC64672gJ = new InterfaceC64672gJ<AbstractC261010s<? extends LiveEffect>>() { // from class: X.1KM
                @Override // X.InterfaceC64672gJ
                public final Object emit(AbstractC261010s<? extends LiveEffect> abstractC261010s, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    LiveEffect liveEffect;
                    LiveEffect liveEffect2;
                    AbstractC261010s<? extends LiveEffect> abstractC261010s2 = abstractC261010s;
                    if (abstractC261010s2 instanceof C37151d1) {
                        C37151d1 c37151d1 = (C37151d1) abstractC261010s2;
                        C0LU.LJ(c37151d1.LIZ);
                        DataChannel.this.rv0(FirstStickerPanelChannel.class, c37151d1.LIZ);
                        C37 c372 = c37;
                        if (c372 == C37.PREVIEW) {
                            if (C1HD.LIZIZ != null) {
                                LiveEffect LIZ = C1HD.LIZ(c37151d1.LIZ);
                                if (LIZ != null) {
                                    DataChannel.this.qv0(SelectH5StickerInPreview.class, LIZ);
                                }
                            } else {
                                C0WZ LJFF = C40641ie.LJLIL.LJFF(c37151d1.LIZ, c372);
                                if (LJFF != null && (liveEffect2 = LJFF.LIZ) != null) {
                                    stickerEffectViewModel2.lv0(liveEffect2, null);
                                }
                            }
                        } else {
                            C0WZ LJFF2 = C40641ie.LJLIL.LJFF(c37151d1.LIZ, c372);
                            if (LJFF2 != null && (liveEffect = LJFF2.LIZ) != null) {
                                stickerEffectViewModel2.lv0(liveEffect, null);
                            }
                        }
                        if (c37.isBroadcast()) {
                            int size = c37151d1.LIZ.size();
                            if (size > 15) {
                                size = 15;
                            }
                            for (LiveEffect liveEffect3 : c37151d1.LIZ.subList(0, size)) {
                                if (C77412UZs.LJIL(liveEffect3)) {
                                    List<? extends LiveEffect> list = liveEffect3.subStickers;
                                    if (list != null) {
                                        Iterator<? extends LiveEffect> it = list.iterator();
                                        while (it.hasNext()) {
                                            stickerEffectViewModel2.lv0(it.next(), null);
                                        }
                                    }
                                } else {
                                    stickerEffectViewModel2.lv0(liveEffect3, null);
                                }
                            }
                        }
                        C48841JEv.LIZJ(interfaceC70422pa, null);
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (xll.collect(interfaceC64672gJ, this) == enumC58928NAu) {
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
