package X;

import fjb.a;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.caption.TextSegmentHelper$measure$2", f = "TextSegmentHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Bel, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29303Bel extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C29301Bej LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29303Bel(C29301Bej c29301Bej, String str, InterfaceC67352kd<? super C29303Bel> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c29301Bej;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29303Bel(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LIZLLL = new ArrayList<>();
        this.LJLIL.LIZJ = new HashMap<>();
        C29301Bej c29301Bej = this.LJLIL;
        String str = this.LJLILLLLZI;
        c29301Bej.getClass();
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        o.LJIIIIZZ(wordInstance, "getWordInstance()");
        wordInstance.setText(str);
        int first = wordInstance.first();
        int next = wordInstance.next();
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i = first;
            first = next;
            if (next != -1) {
                arrayList.add(str.subSequence(i, next).toString());
                next = wordInstance.next();
            } else {
                c29301Bej.LIZ(0, arrayList);
                this.LJLIL.LIZJ.clear();
                return C76800UCe.LIZ;
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
