package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.video2sticker.compile.Video2StickerNextTaskRunnerKt$onNext$textList$1", f = "Video2StickerNextTaskRunner.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5T0, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends String>>, Object> {
    public final /* synthetic */ InterfaceC136385Ww LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5T0(InterfaceC136385Ww interfaceC136385Ww, InterfaceC67352kd<? super C5T0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC136385Ww;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5T0(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<TextStickerModel> W50 = this.LJLIL.W50();
        ArrayList arrayList = new ArrayList(C32I.LJJL(W50, 10));
        Iterator<TextStickerModel> it = W50.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getTextStr());
        }
        return arrayList;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends String>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
