package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xmu, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85864Xmu extends F9E {
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public final InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJLJJLL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public C85864Xmu() {
        this(C34411Dex.LJLIL, C85877Xn7.LJLIL, C85878Xn8.LJLIL, C34412Dey.LJLIL, C85879Xn9.LJLIL, C123214sX.LJLIL, C34413Dez.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C85864Xmu(InterfaceC88472Yns<? super Integer, C76800UCe> selectTheme, InterfaceC65784Pro<C76800UCe> save, InterfaceC65784Pro<C76800UCe> cancel, InterfaceC88472Yns<? super Boolean, C76800UCe> playOrPause, InterfaceC65784Pro<C76800UCe> none, InterfaceC88471Ynr<? super Integer, ? super Integer, C76800UCe> scrollVisiblePos, InterfaceC88472Yns<? super Integer, C76800UCe> viewAttachedToWindowListener) {
        o.LJIIIZ(selectTheme, "selectTheme");
        o.LJIIIZ(save, "save");
        o.LJIIIZ(cancel, "cancel");
        o.LJIIIZ(playOrPause, "playOrPause");
        o.LJIIIZ(none, "none");
        o.LJIIIZ(scrollVisiblePos, "scrollVisiblePos");
        o.LJIIIZ(viewAttachedToWindowListener, "viewAttachedToWindowListener");
        this.LJLIL = selectTheme;
        this.LJLILLLLZI = save;
        this.LJLJI = cancel;
        this.LJLJJI = playOrPause;
        this.LJLJJL = none;
        this.LJLJJLL = scrollVisiblePos;
        this.LJLJL = viewAttachedToWindowListener;
    }
}
