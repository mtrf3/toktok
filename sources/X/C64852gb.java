package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$getOpenGlVersionFromFile$2", f = "EffectParser.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2gb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64852gb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public final /* synthetic */ File LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64852gb(File file, InterfaceC67352kd<? super C64852gb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = file;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64852gb(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        OJD ojd = new OJD("#version\\s+([0-9]+)\\s+es");
        File file = this.LJLIL;
        o.LJIIIZ(file, "file");
        Iterator it = ((ArrayList) C38485F8n.LLLFF(file)).iterator();
        while (it.hasNext()) {
            InterfaceC59973NgH find$default = OJD.find$default(ojd, (String) it.next(), 0, 2, null);
            if (find$default != null) {
                try {
                    if (find$default.LIZ().size() == 2) {
                        return new Integer(CastIntegerProtector.parseInt((String) ListProtector.get(find$default.LIZ(), 1)));
                    }
                    continue;
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
