package X;

import java.io.File;

/* renamed from: X.GvL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43071GvL<I, O> implements C14Q {
    public final /* synthetic */ java.util.Set<String> LJLIL;

    public C43071GvL(java.util.Set<String> set) {
        this.LJLIL = set;
    }

    @Override // X.C14Q
    public final Object apply(Object obj) {
        return Boolean.valueOf(!this.LJLIL.contains(((File) obj).getPath()));
    }
}
