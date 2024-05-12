package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.Jag, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49434Jag<T> implements InterfaceC73463SsN<T> {
    public final /* synthetic */ AbstractC49433Jaf<T> LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public C49434Jag(AbstractC49433Jaf<T> abstractC49433Jaf) {
        this.LJLIL = abstractC49433Jaf;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        AbstractC49433Jaf<T> abstractC49433Jaf = this.LJLIL;
        abstractC49433Jaf.mIsLoading = false;
        List<C8BT> list = abstractC49433Jaf.mNotifyListeners;
        if (list != null) {
            Iterator<C8BT> it = list.iterator();
            while (it.hasNext()) {
                it.next().onFailed((Exception) e);
            }
        }
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(Object obj) {
        InterfaceC49435Jah t = (InterfaceC49435Jah) obj;
        o.LJIIIZ(t, "t");
        AbstractC49433Jaf<T> abstractC49433Jaf = this.LJLIL;
        abstractC49433Jaf.mIsLoading = false;
        abstractC49433Jaf.handleData(t);
        List<C8BT> list = this.LJLIL.mNotifyListeners;
        if (list != null) {
            Iterator<C8BT> it = list.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
        }
    }
}
