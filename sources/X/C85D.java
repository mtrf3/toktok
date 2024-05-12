package X;

import android.text.style.ForegroundColorSpan;

/* renamed from: X.85D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C85D extends AbstractC65781Prl implements InterfaceC65784Pro<AnonymousClass850> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85D(String str, int i) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final AnonymousClass850 invoke() {
        return new AnonymousClass850(this.LJLIL, C47261Igj.LJJIJIL(new ForegroundColorSpan(this.LJLILLLLZI)), AnonymousClass853.AUTO_TRANSLATED, 8);
    }
}
