package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9Ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232609Ay extends F9E implements C33Q {
    public final AbstractC72932td<TB5> LJLIL;
    public final C43I<Boolean> LJLILLLLZI;

    public C232609Ay() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public /* synthetic */ C232609Ay(int i) {
        this(C33X.LIZ, new C43I(Boolean.FALSE));
    }

    public C232609Ay(AbstractC72932td<TB5> subtitleTranslationRequest, C43I<Boolean> isTranslationSubtitle) {
        o.LJIIIZ(subtitleTranslationRequest, "subtitleTranslationRequest");
        o.LJIIIZ(isTranslationSubtitle, "isTranslationSubtitle");
        this.LJLIL = subtitleTranslationRequest;
        this.LJLILLLLZI = isTranslationSubtitle;
    }

    public static C232609Ay L(C232609Ay c232609Ay, AbstractC72932td abstractC72932td) {
        C43I<Boolean> isTranslationSubtitle = c232609Ay.LJLILLLLZI;
        c232609Ay.getClass();
        o.LJIIIZ(isTranslationSubtitle, "isTranslationSubtitle");
        return new C232609Ay(abstractC72932td, isTranslationSubtitle);
    }
}
