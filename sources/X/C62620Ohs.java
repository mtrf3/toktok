package X;

import com.ss.android.ugc.aweme.share.model.ShortenModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Ohs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62620Ohs<T, R> implements InterfaceC48038ItG {
    public static final C62620Ohs<T, R> LJLIL = new C62620Ohs<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        ShortenModel it = (ShortenModel) obj;
        o.LJIIIZ(it, "it");
        C109254Qn.LIZIZ = System.currentTimeMillis();
        return it.getShortenUrl();
    }
}
