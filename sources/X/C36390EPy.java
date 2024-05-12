package X;

import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.normal.MobileEffectUploadTask$uploadAMEDrafts$1", f = "MobileEffectUploadTask.kt", l = {101, 113}, m = "invokeSuspend")
/* renamed from: X.EPy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36390EPy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public ERH LJLIL;
    public UploadImageConfig LJLILLLLZI;
    public UploadImageConfig LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ List<UploadableDraftEffect> LJLJL;
    public final /* synthetic */ ERH LJLJLJ;
    public final /* synthetic */ UploadImageConfig LJLJLLL;
    public final /* synthetic */ UploadImageConfig LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36390EPy(List<UploadableDraftEffect> list, ERH erh, UploadImageConfig uploadImageConfig, UploadImageConfig uploadImageConfig2, InterfaceC67352kd<? super C36390EPy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = list;
        this.LJLJLJ = erh;
        this.LJLJLLL = uploadImageConfig;
        this.LJLL = uploadImageConfig2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36390EPy(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0039, code lost:
    
        X.C78897Uxp.LJJLIIIIJ(r5, "UpdateEffectResult.FailToGetAuthKey");
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:12:0x0039). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e5 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36390EPy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
