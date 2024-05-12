package X;

import android.text.Editable;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.ChatRoomInputVM$sendMessage$1", f = "ChatRoomInputVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92883ki extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ChatRoomInputVM LJLIL;
    public final /* synthetic */ Editable LJLILLLLZI;
    public final /* synthetic */ C99033ud LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ List<RichTextInfo> LJLJJL;
    public final /* synthetic */ C109544Rq LJLJJLL;
    public final /* synthetic */ InterfaceC88923eK LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92883ki(ChatRoomInputVM chatRoomInputVM, Editable editable, C99033ud c99033ud, String str, List<RichTextInfo> list, C109544Rq c109544Rq, InterfaceC88923eK interfaceC88923eK, InterfaceC67352kd<? super C92883ki> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = chatRoomInputVM;
        this.LJLILLLLZI = editable;
        this.LJLJI = c99033ud;
        this.LJLJJI = str;
        this.LJLJJL = list;
        this.LJLJJLL = c109544Rq;
        this.LJLJL = interfaceC88923eK;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C92883ki(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0157, code lost:
    
        if (r5 != null) goto L45;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92883ki.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
