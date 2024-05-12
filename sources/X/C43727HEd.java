package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.MergedTemplateListResponseWrapper;
import com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.UlikeMergedTemplateStruct;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.HEd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43727HEd<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C173166qu LJLILLLLZI;

    public C43727HEd(long j, C173166qu c173166qu) {
        this.LJLIL = j;
        this.LJLILLLLZI = c173166qu;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        String str;
        MergedTemplateListResponseWrapper it = (MergedTemplateListResponseWrapper) obj;
        o.LJIIIZ(it, "it");
        int i = it.status;
        if (i == 0) {
            ArrayList<UlikeMergedTemplateStruct> arrayList = it.data.templateList;
            ArrayList arrayList2 = new ArrayList();
            Iterator<UlikeMergedTemplateStruct> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC82548WaW LJJJJL = C17J.LJJJJL(it2.next());
                if (LJJJJL != null) {
                    arrayList2.add(LJJJJL);
                }
            }
            boolean z = !arrayList2.isEmpty();
            int i2 = it.status;
            if (arrayList2.isEmpty()) {
                str = "template_list is empty";
            } else {
                str = it.message;
            }
            C173306r8.LIZIZ(z, i2, str, this.LJLIL, this.LJLILLLLZI);
            return arrayList2;
        }
        C173306r8.LIZIZ(false, i, it.message, this.LJLIL, this.LJLILLLLZI);
        return C61878OQg.INSTANCE;
    }
}
