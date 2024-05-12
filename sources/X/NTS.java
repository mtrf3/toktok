package X;

import java.lang.ref.WeakReference;

/* JADX INFO: Add missing generic type declarations: [KEY] */
/* loaded from: classes11.dex */
public final /* synthetic */ class NTS<KEY> extends TBS implements InterfaceC88472Yns<KEY, WeakReference<KEY>> {
    public static final NTS LJLIL = new NTS();

    public NTS() {
        super(1, WeakReference.class, "<init>", "<init>(Ljava/lang/Object;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        return new WeakReference(obj);
    }
}
