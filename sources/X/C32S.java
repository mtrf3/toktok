package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.emojiPageV2.PopHelper$bindPopupWindowShow$1$1", f = "PopHelper.kt", l = {323, 327, 339}, m = "invokeSuspend")
/* renamed from: X.32S, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32S extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Long LJLJL;
    public final /* synthetic */ VideoSticker LJLJLJ;
    public final /* synthetic */ SetSticker LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ C4CB LJLLILLLL;
    public final /* synthetic */ RecyclerView LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32S(boolean z, boolean z2, String str, Long l, VideoSticker videoSticker, SetSticker setSticker, boolean z3, Integer num, C4CB c4cb, RecyclerView recyclerView, InterfaceC67352kd<? super C32S> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = str;
        this.LJLJL = l;
        this.LJLJLJ = videoSticker;
        this.LJLJLLL = setSticker;
        this.LJLL = z3;
        this.LJLLI = num;
        this.LJLLILLLL = c4cb;
        this.LJLLJ = recyclerView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32S(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32S.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
