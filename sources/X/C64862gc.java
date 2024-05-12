package X;

import fjb.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$extractOpenGlEsVersion$2", f = "EffectParser.kt", l = {241}, m = "invokeSuspend")
/* renamed from: X.2gc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64862gc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ File LJLJI;
    public final /* synthetic */ XKW LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64862gc(File file, XKW xkw, InterfaceC67352kd<? super C64862gc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = file;
        this.LJLJJI = xkw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C64862gc c64862gc = new C64862gc(this.LJLJI, this.LJLJJI, interfaceC67352kd);
        c64862gc.LJLILLLLZI = obj;
        return c64862gc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            OJD ojd = new OJD("AmazingFeature/xshader/([a-zA-Z0-9_]+).frag$");
            File file = this.LJLJI;
            o.LJIIIZ(file, "file");
            List LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(C34T.LLLIIII(file, EnumC67182kM.TOP_DOWN)));
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : LJJIJLIJ) {
                String path = ((File) obj3).getPath();
                o.LJIIIIZZ(path, "it.path");
                if (ojd.containsMatchIn(path)) {
                    arrayList.add(obj3);
                }
            }
            XKW xkw = this.LJLJJI;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(XKX.LIZIZ(interfaceC70422pa, null, null, new C63772er((File) it.next(), xkw, null), 3));
            }
            this.LJLIL = 1;
            obj = T1W.LIZ(arrayList2, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        Iterator it2 = ((ArrayList) ORZ.LJLL((Iterable) obj)).iterator();
        if (it2.hasNext()) {
            obj2 = it2.next();
            while (it2.hasNext()) {
                obj2 = new Integer(Math.max(((Number) obj2).intValue(), ((Number) it2.next()).intValue()));
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
