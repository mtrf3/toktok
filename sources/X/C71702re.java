package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.emojiPageV2.BaseEmojiGridAdapter;
import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.emojiPageV2.EmojiGridPage$setData$1$1", f = "EmojiGridPage.kt", l = {334}, m = "invokeSuspend")
/* renamed from: X.2re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71702re extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3UO LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71702re(C3UO c3uo, InterfaceC67352kd<? super C71702re> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3uo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71702re(this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.2sr] */
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
            C71512rL c71512rL = C71512rL.LJII;
            final C3UO c3uo = this.LJLILLLLZI;
            ?? r1 = new InterfaceC65692hx() { // from class: X.2sr
                @Override // X.InterfaceC65692hx
                public final C76800UCe onFailed() {
                    C3UO c3uo2 = C3UO.this;
                    BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter = c3uo2.LJIILIIL;
                    if (baseEmojiGridAdapter != null) {
                        baseEmojiGridAdapter.showPullUpLoadMore(c3uo2.LJFF(), false);
                    }
                    return C76800UCe.LIZ;
                }

                @Override // X.InterfaceC65692hx
                public final C76800UCe onSuccess(List list) {
                    C3UO c3uo2 = C3UO.this;
                    BaseEmojiGridAdapter<C105454Bx> baseEmojiGridAdapter = c3uo2.LJIILIIL;
                    if (baseEmojiGridAdapter != null) {
                        if (C113644d6.LIZIZ()) {
                            C105454Bx c105454Bx = new C105454Bx();
                            c105454Bx.LIZLLL = new Integer(EnumC73222u6.ENTRANCE.getType());
                            c105454Bx.LJ = null;
                            c105454Bx.LJFF = null;
                            ListProtector.add(list, 0, c105454Bx);
                        }
                        if (!((ArrayList) list).isEmpty()) {
                            baseEmojiGridAdapter.setDataAfterLoadMore(list);
                        }
                        List<C105454Bx> data = baseEmojiGridAdapter.getData();
                        if (data != null) {
                            c3uo2.LJIIJ(data);
                        }
                        if (C71512rL.LJII.LJI) {
                            baseEmojiGridAdapter.resetLoadMoreState();
                        } else {
                            baseEmojiGridAdapter.setLoadMoreListener((InterfaceC191547fS) null);
                            baseEmojiGridAdapter.setShowFooter(false);
                            c3uo2.LJ();
                        }
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (c71512rL.LJJII(r1, this) == enumC58928NAu) {
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
