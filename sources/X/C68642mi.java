package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutTemplateComponent$compressMedias$3", f = "AutoCutTemplateComponent.kt", l = {318, 319}, m = "invokeSuspend")
/* renamed from: X.2mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68642mi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ List<HJU> LJLJJI;
    public final /* synthetic */ InterfaceC68662mk LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ HKJ LJLJL;
    public final /* synthetic */ Context LJLJLJ;
    public final /* synthetic */ CreativeInfo LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68642mi(List<HJU> list, InterfaceC68662mk interfaceC68662mk, long j, HKJ hkj, Context context, CreativeInfo creativeInfo, InterfaceC67352kd<? super C68642mi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = list;
        this.LJLJJL = interfaceC68662mk;
        this.LJLJJLL = j;
        this.LJLJL = hkj;
        this.LJLJLJ = context;
        this.LJLJLLL = creativeInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68642mi c68642mi = new C68642mi(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, interfaceC67352kd);
        c68642mi.LJLJI = obj;
        return c68642mi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68642mi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
