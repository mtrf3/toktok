package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.ability.OpenPhotoNextServiceImpl$gotoNextPage$1$1", f = "OpenPhotoNextServiceImpl.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "invokeSuspend")
/* renamed from: X.GMt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41403GMt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ShortVideoContext LJLILLLLZI;
    public final /* synthetic */ List<String> LJLJI;
    public final /* synthetic */ C43617H9x LJLJJI;
    public final /* synthetic */ Bundle LJLJJL;
    public final /* synthetic */ IPageToFinish LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41403GMt(ShortVideoContext shortVideoContext, List<String> list, C43617H9x c43617H9x, Bundle bundle, IPageToFinish iPageToFinish, InterfaceC67352kd<? super C41403GMt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = list;
        this.LJLJJI = c43617H9x;
        this.LJLJJL = bundle;
        this.LJLJJLL = iPageToFinish;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41403GMt(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, T] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41403GMt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
