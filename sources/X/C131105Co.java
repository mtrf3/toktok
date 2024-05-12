package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.fuctiontrack.audio.AudioItemView$setSegment$2", f = "AudioItemHolder.kt", l = {274}, m = "invokeSuspend")
/* renamed from: X.5Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131105Co extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NLETrackSlot LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ C130545Ak LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131105Co(NLETrackSlot nLETrackSlot, long j, C130545Ak c130545Ak, InterfaceC67352kd<? super C131105Co> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nLETrackSlot;
        this.LJLJI = j;
        this.LJLJJI = c130545Ak;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131105Co(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1 A[RETURN] */
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
        throw new UnsupportedOperationException("Method not decompiled: X.C131105Co.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
