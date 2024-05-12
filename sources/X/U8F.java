package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes14.dex */
public final class U8F implements InterfaceC29937Boz {
    public final /* synthetic */ U7Z LIZ;
    public final /* synthetic */ List<LinkUser> LIZIZ;
    public final /* synthetic */ List<LinkUser> LIZJ;

    public U8F(U7Z u7z, List<LinkUser> list, List<LinkUser> list2) {
        this.LIZ = u7z;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        this.LIZ.LJIJJLI(this.LIZIZ);
        CopyOnWriteArrayList<U87> copyOnWriteArrayList = this.LIZ.LJIIZILJ;
        List<LinkUser> list = this.LIZJ;
        List<LinkUser> list2 = this.LIZIZ;
        Iterator<U87> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(list, list2);
        }
    }
}
