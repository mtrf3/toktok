package X;

import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.components.fullscreenpreview.dialog.DefaultPreviewControlBar$initFramePanel$3", f = "DefaultPreviewControlBar.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5Ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131155Ct extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AnonymousClass581 LJLIL;
    public final /* synthetic */ VecNLETrackSlotSPtr LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131155Ct(AnonymousClass581 anonymousClass581, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, InterfaceC67352kd<? super C131155Ct> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = anonymousClass581;
        this.LJLILLLLZI = vecNLETrackSlotSPtr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131155Ct(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C1297757l c1297757l = this.LJLIL.LJLJL;
        if (c1297757l != null) {
            VecNLETrackSlotSPtr slots = this.LJLILLLLZI;
            o.LJIIIIZZ(slots, "slots");
            c1297757l.LIZIZ(slots);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
