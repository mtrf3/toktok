package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.EditorProTTSHelper$readText$2$file$1", f = "EditorProTTSHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137795ax extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super File>, Object> {
    public final /* synthetic */ C137805ay LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137795ax(C137805ay c137805ay, String str, InterfaceC67352kd<? super C137795ax> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c137805ay;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137795ax(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        CreativeInfo creativeInfo = this.LJLIL.LJLILLLLZI.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        return C167496hl.LIZ(creativeInfo, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super File> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}