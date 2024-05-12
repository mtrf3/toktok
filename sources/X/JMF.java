package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMF extends AbstractC65781Prl implements InterfaceC88472Yns<JMH<C49013JLl>, C76800UCe> {
    public static final JMF LJLIL = new JMF();

    public JMF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(JMH<C49013JLl> jmh) {
        JMH<C49013JLl> searchSingleCardTemplate = jmh;
        o.LJIIIZ(searchSingleCardTemplate, "$this$searchSingleCardTemplate");
        JMG init = JMG.LJLIL;
        o.LJIIIZ(init, "init");
        JMP<C49013JLl> jmp = new JMP<>();
        init.invoke(jmp);
        searchSingleCardTemplate.LIZ = jmp;
        JM6 init2 = JM6.LJLIL;
        o.LJIIIZ(init2, "init");
        JM7<C49013JLl> jm7 = new JM7<>();
        init2.invoke(jm7);
        searchSingleCardTemplate.LIZIZ = jm7;
        return C76800UCe.LIZ;
    }
}
