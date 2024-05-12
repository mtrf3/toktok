package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.EditorProTTSHelper$readText$2", f = "EditorProTTSHelper.kt", l = {93, 102, 110}, m = "invokeSuspend")
/* renamed from: X.5aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137785aw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C137805ay LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final /* synthetic */ NLETrackSlot LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C137785aw(C137805ay c137805ay, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, NLETrackSlot nLETrackSlot, String str, String str2, boolean z, InterfaceC67352kd<? super C137785aw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c137805ay;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = nLETrackSlot;
        this.LJLJJLL = str;
        this.LJLJL = str2;
        this.LJLJLJ = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137785aw(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137785aw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
