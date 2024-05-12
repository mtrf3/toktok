package X;

import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.StickerInfoInit$createInfoSticker$2$1$1", f = "StickerInfoInit.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ZC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5ZC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C137415aL LJLIL;
    public final /* synthetic */ List<OSZ<C121514pn, Effect>> LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<List<? extends OSZ<C121514pn, ? extends StickerItemModel>>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5ZC(C137415aL c137415aL, List<? extends OSZ<C121514pn, ? extends Effect>> list, InterfaceC67352kd<? super List<? extends OSZ<C121514pn, ? extends StickerItemModel>>> interfaceC67352kd, InterfaceC67352kd<? super C5ZC> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLIL = c137415aL;
        this.LJLILLLLZI = list;
        this.LJLJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5ZC(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ChangeAvatarModel changeAvatarModel = this.LJLIL.LIZIZ.creativeModel.changeAvatarModel;
        List<OSZ<C121514pn, Effect>> list = this.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<OSZ<C121514pn, Effect>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSecond().getEffectId());
        }
        List<String> LLJI = ORZ.LLJI(arrayList);
        changeAvatarModel.getClass();
        o.LJIIIZ(LLJI, "<set-?>");
        changeAvatarModel.stickerIds = LLJI;
        List<OSZ<C121514pn, Effect>> list2 = this.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
        for (OSZ<C121514pn, Effect> osz : list2) {
            C121514pn first = osz.getFirst();
            StickerItemModel stickerItemModel = new StickerItemModel();
            stickerItemModel.initWidth = 0.0f;
            stickerItemModel.initHeight = 0.0f;
            stickerItemModel.path = osz.getFirst().LJIIJJI;
            stickerItemModel.stickerId = osz.getFirst().LJIILJJIL;
            stickerItemModel.type = osz.getSecond().getEffectType();
            stickerItemModel.uuid = osz.getFirst().LIZ;
            stickerItemModel.startTime = 0;
            stickerItemModel.endTime = C149525ts.LIZ().maxDuration;
            stickerItemModel.uiStartTime = 0;
            stickerItemModel.uiEndTime = C149525ts.LIZ().maxDuration;
            stickerItemModel.currentOffsetX = osz.getFirst().LJ;
            stickerItemModel.currentOffsetY = osz.getFirst().LJFF;
            arrayList2.add(new OSZ(first, stickerItemModel));
        }
        List LLJI2 = ORZ.LLJI(arrayList2);
        InterfaceC67352kd<List<? extends OSZ<C121514pn, ? extends StickerItemModel>>> interfaceC67352kd = this.LJLJI;
        C3C5.m7constructorimpl(LLJI2);
        interfaceC67352kd.resumeWith(LLJI2);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
