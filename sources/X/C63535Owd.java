package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;

/* renamed from: X.Owd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63535Owd implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ C63622Oy2 LIZ;
    public final /* synthetic */ Runnable LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C63534Owc LJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        this.LJ.LJIILIIL(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.4o7] */
    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        C115284fk.LJIILIIL().LJIJI(14, c63120Opw2);
        this.LJ.LIZJ = true;
        C63534Owc c63534Owc = this.LJ;
        C63622Oy2 c63622Oy2 = this.LIZ;
        c63534Owc.getClass();
        ?? newBuilder2 = c63622Oy2.LJLJJLL.body.set_conversation_setting_info_body.newBuilder2();
        newBuilder2.LJ = Long.valueOf(c63120Opw2.getConversationShortId());
        SetConversationSettingInfoRequestBody build = newBuilder2.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJ = build;
        c63534Owc.LJIIL(c63120Opw2.getInboxType(), c89453Z8v.build(), c63622Oy2.LJLJJI, C03660Ck.LIZJ("retry", "refresh_conv"), c63622Oy2.LJLJJL);
    }

    public C63535Owd(C63534Owc c63534Owc, C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10, String str, String str2) {
        this.LJ = c63534Owc;
        this.LIZ = c63622Oy2;
        this.LIZIZ = aRunnableS29S0200000_10;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
