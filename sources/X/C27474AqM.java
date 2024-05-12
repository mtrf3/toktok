package X;

import kotlin.jvm.internal.o;

/* renamed from: X.AqM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27474AqM implements InterfaceC87283bg {
    public static final /* synthetic */ int LJLJL = 0;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    public final java.util.Map<String, String> LIZ() {
        return C113554cx.LJJL(new OSZ("page_name", this.LJLIL), new OSZ("enter_from", this.LJLILLLLZI), new OSZ("previous_page", this.LJLJI), new OSZ("EVENT_ORIGIN_FEATURE", this.LJLJJLL));
    }

    public C27474AqM(String str, String enterFrom, String previousPage, long j, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        this.LJLIL = str;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = previousPage;
        this.LJLJJI = j;
        this.LJLJJL = z;
        this.LJLJJLL = "TEMAI";
    }
}
