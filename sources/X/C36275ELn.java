package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.uploader.ContactUploader", f = "ContactUploader.kt", l = {33}, m = "upload")
/* renamed from: X.ELn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36275ELn extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C36284ELw LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36275ELn(C36284ELw c36284ELw, InterfaceC67352kd<? super C36275ELn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c36284ELw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, this);
    }
}
