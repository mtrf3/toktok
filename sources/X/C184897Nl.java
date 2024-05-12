package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7Nl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184897Nl extends F9E implements InterfaceC87283bg {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final C7PR LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C184897Nl(String topicId, String pageId, C7PR topicType) {
        o.LJIIIZ(topicId, "topicId");
        o.LJIIIZ(pageId, "pageId");
        o.LJIIIZ(topicType, "topicType");
        this.LJLIL = topicId;
        this.LJLILLLLZI = pageId;
        this.LJLJI = "book_detail_page";
        this.LJLJJI = topicType;
    }
}
