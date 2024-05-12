package X;

import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import kotlin.jvm.internal.o;

/* renamed from: X.L8m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53772L8m extends AbstractC53764L8e {
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(LAU.LJLIL);
    public final EnumC53808L9w LIZJ;

    @Override // X.AbstractC53764L8e
    public final TopTabProtocol LIZJ() {
        return (TopTabProtocol) ((java.util.Map) LIZLLL.getValue()).get(this.LIZJ);
    }

    @Override // X.AbstractC53764L8e
    public final EnumC53808L9w LIZIZ() {
        return this.LIZJ;
    }

    public C53772L8m(EnumC53808L9w key) {
        o.LJIIIZ(key, "key");
        this.LIZJ = key;
    }
}
