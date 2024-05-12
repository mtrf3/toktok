package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel", f = "EditCapCutViewModel.kt", l = {186}, m = "goToCC")
/* renamed from: X.5Z4, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Z4 extends C3CS {
    public EditCapCutViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ EditCapCutViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5Z4(EditCapCutViewModel editCapCutViewModel, InterfaceC67352kd<? super C5Z4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = editCapCutViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.Lv0(this);
    }
}
