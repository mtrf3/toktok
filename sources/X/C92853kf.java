package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;

/* renamed from: X.3kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C92853kf extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ ChatViewModel LJLIL;
    public final /* synthetic */ CharSequence LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ java.util.Map<String, String> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92853kf(ChatViewModel chatViewModel, CharSequence charSequence, String str, java.util.Map<String, String> map) {
        super(0);
        this.LJLIL = chatViewModel;
        this.LJLILLLLZI = charSequence;
        this.LJLJI = str;
        this.LJLJJI = map;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        ChatViewModel.jv0(this.LJLIL, this.LJLILLLLZI, this.LJLJI, null, null, null, this.LJLJJI, 28);
        return C76800UCe.LIZ;
    }
}
