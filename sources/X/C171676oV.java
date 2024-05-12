package X;

import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.MediaItem;
import com.ss.android.ugc.cut_ui.TextItem;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity$startCompressAndWait$1$2", f = "NLECutCompressActivity.kt", l = {155, 156}, m = "invokeSuspend")
/* renamed from: X.6oV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C171676oV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public long LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C171856on LJLJI;
    public final /* synthetic */ NLECutCompressActivity LJLJJI;
    public final /* synthetic */ OSZ<ArrayList<MediaItem>, ArrayList<TextItem>> LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ CutSource LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C171676oV(C171856on c171856on, NLECutCompressActivity nLECutCompressActivity, OSZ<? extends ArrayList<MediaItem>, ? extends ArrayList<TextItem>> osz, long j, CutSource cutSource, InterfaceC67352kd<? super C171676oV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c171856on;
        this.LJLJJI = nLECutCompressActivity;
        this.LJLJJL = osz;
        this.LJLJJLL = j;
        this.LJLJL = cutSource;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C171676oV(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.6oZ, X.6oY] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C171676oV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
