package X;

import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import com.ss.android.ugc.aweme.emoji.stickerstore.favsticker.PopularStickerListManager;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.PopularStickerStruct;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiGridPage$getPopularStickers$1", f = "EmojiGridPage.kt", l = {442, 463}, m = "invokeSuspend")
/* renamed from: X.2sA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72022sA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3UO LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72022sA(C3UO c3uo, InterfaceC67352kd<? super C72022sA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3uo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72022sA(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<C105454Bx> list;
        List<C105454Bx> data;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            PopularStickerListManager popularStickerListManager = (PopularStickerListManager) this.LJLILLLLZI.LJIIZILJ.getValue();
            if (popularStickerListManager != null) {
                BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter = this.LJLILLLLZI.LJIILIIL;
                if (baseEmojiGridAdapter != null) {
                    list = baseEmojiGridAdapter.getData();
                } else {
                    list = null;
                }
                this.LJLIL = 1;
                obj = popularStickerListManager.LIZIZ(list, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            this.LJLILLLLZI.LJIILL = false;
            return C76800UCe.LIZ;
        }
        List<PopularStickerStruct> list2 = (List) obj;
        if (list2 != null && (!list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            C3UO c3uo = this.LJLILLLLZI;
            BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter2 = c3uo.LJIILIIL;
            if (baseEmojiGridAdapter2 != null && (data = baseEmojiGridAdapter2.getData()) != null) {
                arrayList.addAll(data);
            }
            String string = c3uo.LIZJ().getContext().getString(R.string.hay);
            o.LJIIIIZZ(string, "contentView.context.getS…er_popularSticker_anchor)");
            arrayList.add(new C72042sC(string));
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            for (PopularStickerStruct popularStickerStruct : list2) {
                C105454Bx c105454Bx = new C105454Bx();
                c105454Bx.LJII = Boolean.TRUE;
                c105454Bx.LIZLLL = popularStickerStruct.getStickerType();
                c105454Bx.LJ = popularStickerStruct.getSetSticker();
                c105454Bx.LJFF = popularStickerStruct.getVideoSticker();
                arrayList2.add(c105454Bx);
            }
            arrayList.addAll(arrayList2);
            this.LJLILLLLZI.LJIILL = true;
            if (!C88963eO.LIZJ()) {
                XIF xif = EXV.LIZ;
                C72032sB c72032sB = new C72032sB(this.LJLILLLLZI, arrayList, null);
                this.LJLIL = 2;
                if (XKX.LJI(xif, c72032sB, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            return C76800UCe.LIZ;
        }
        this.LJLILLLLZI.LJIILL = false;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
