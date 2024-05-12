package X;

import fjb.a;
import java.io.File;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.EditorProTTSHelper$readText$2$ttsDuration$1", f = "EditorProTTSHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137815az extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public final /* synthetic */ File LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137815az(File file, InterfaceC67352kd<? super C137815az> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = file;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137815az(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return new Integer(HOH.LIZIZ(4, this.LJLIL.getAbsolutePath()));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
