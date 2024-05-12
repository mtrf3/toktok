package X;

import com.ss.android.ugc.aweme.core.SmallAppWidgetProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.model.ItemLikeListPreview;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCH<T1, T2> implements InterfaceC73459SsJ {
    public static final MCH<T1, T2> LJLIL = new MCH<>();

    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        MCK mck = (MCK) obj;
        if (obj2 == null) {
            StringBuilder sb = new StringBuilder("now widget update success, isEnabled: ");
            sb.append(mck.LIZ);
            sb.append(", nowInfo: ");
            List<Aweme> list = mck.LIZIZ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAid());
            }
            sb.append(arrayList);
            sb.append(", like list total cnt: ");
            List<ItemLikeListPreview> list2 = mck.LIZJ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<ItemLikeListPreview> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().getTotalCount()));
            }
            sb.append(arrayList2);
            sb.append("widget feed logId: ");
            sb.append(mck.LJFF);
            sb.append(", like list logId: ");
            sb.append(mck.LJI);
            MCT.LIZIZ("NowWidgetViewModel", sb.toString());
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("now widget update error, bean: ");
            LIZ.append(mck);
            String message = X1D.LIZIZ(LIZ);
            o.LJIIIZ(message, "message");
        }
        if (mck == null) {
            mck = new MCK(MCI.LIZ(), null, null, null, null, 126);
        }
        MCI.LIZ = mck;
        MCI.LIZIZ.set(false);
        MB2.LIZ.getClass();
        MB1.LIZIZ.set(200);
        C56374MAo.LIZLLL(EF7.LIZIZ(), "com.ss.android.ugc.tiktok.app.widget.NOW_WIDGET_CHECK_STATE", C47261Igj.LJJIJIIJI(new MCN(), new MCG(), new SmallAppWidgetProvider()));
    }
}
