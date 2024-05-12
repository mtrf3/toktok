package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchBarIconGenerator$getSearchKeyword$2", f = "SearchBarIconGenerator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.K0t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51023K0t extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ C54136LMm LJLILLLLZI;
    public final /* synthetic */ TextView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51023K0t(TextView textView, C54136LMm c54136LMm, Aweme aweme, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aweme;
        this.LJLILLLLZI = c54136LMm;
        this.LJLJI = textView;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        Aweme aweme = this.LJLIL;
        return new C51023K0t(this.LJLJI, this.LJLILLLLZI, aweme, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:3:0x0003, B:5:0x0008, B:7:0x000e, B:9:0x0014, B:10:0x0018, B:12:0x001e, B:14:0x0027, B:15:0x002b, B:18:0x0033, B:19:0x0035, B:21:0x003b, B:22:0x003f, B:26:0x0052, B:28:0x005a, B:34:0x0069, B:36:0x0071, B:38:0x007b, B:41:0x0085, B:44:0x008a, B:46:0x0097, B:48:0x009f, B:49:0x00a9, B:51:0x00af, B:54:0x00b7, B:57:0x00c3, B:60:0x00d5, B:62:0x00dd, B:64:0x00e3, B:65:0x00e7, B:67:0x00ed, B:68:0x0102, B:76:0x0107, B:78:0x010f, B:80:0x0115, B:82:0x0121, B:83:0x0125, B:85:0x012c, B:87:0x0132, B:88:0x0136, B:90:0x013c, B:94:0x014f, B:98:0x0090), top: B:2:0x0003 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51023K0t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
