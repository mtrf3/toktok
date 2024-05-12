package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S96 extends F9E implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    public S96() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public /* synthetic */ S96(int i) {
        this("", "", "", "");
    }

    public S96(String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "title", str2, "content1", str3, "content2", str4, "content3");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
    }

    public static S96 L(S96 s96, String title, String content1, String content2, String content3, int i) {
        if ((i & 1) != 0) {
            title = s96.LJLIL;
        }
        if ((i & 2) != 0) {
            content1 = s96.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            content2 = s96.LJLJI;
        }
        if ((i & 8) != 0) {
            content3 = s96.LJLJJI;
        }
        s96.getClass();
        o.LJIIIZ(title, "title");
        o.LJIIIZ(content1, "content1");
        o.LJIIIZ(content2, "content2");
        o.LJIIIZ(content3, "content3");
        return new S96(title, content1, content2, content3);
    }
}
