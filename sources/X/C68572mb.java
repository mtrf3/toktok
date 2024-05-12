package X;

import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerScene$onActivityCreated$4$1", f = "EditInfoStickerScene.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2mb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68572mb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C1548165t LJLIL;
    public final /* synthetic */ List<OSZ<C121514pn, Effect>> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C68572mb(C1548165t c1548165t, List<? extends OSZ<C121514pn, ? extends Effect>> list, InterfaceC67352kd<? super C68572mb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c1548165t;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68572mb(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ChangeAvatarModel changeAvatarModel = this.LJLIL.LLJJJIL().creativeModel.changeAvatarModel;
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
        C1548165t c1548165t = this.LJLIL;
        for (OSZ<C121514pn, Effect> osz : list2) {
            c1548165t.LLJJIJI().IL(osz.getFirst(), null, osz.getSecond().getEffectType());
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
