package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.o;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* loaded from: classes6.dex */
public class CDB extends CDI {
    public final /* synthetic */ CDG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CDB(CDG cdg, ViewGroup parent) {
        super(C1FL.LIZIZ(parent, R.layout.dh7, parent, false, "from(parent.context).inf… parent, false,\n        )"));
        o.LJIIIZ(parent, "parent");
        this.LJLIL = cdg;
    }

    @Override // X.CDI
    public final void L(CDI holder, int i) {
        SpotlightInfo spotlightInfo;
        List<SpotlightItem> list;
        o.LJIIIZ(holder, "holder");
        View findViewById = this.itemView.findViewById(R.id.kaq);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.spotlight_view_pager)");
        ViewPager viewPager = (ViewPager) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.kam);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.spotlight_info)");
        ImageView imageView = (ImageView) findViewById2;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        TextView textView = (TextView) this.itemView.findViewById(R.id.kal);
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(R.id.kaf), Integer.valueOf(R.id.kag), Integer.valueOf(R.id.kah), Integer.valueOf(R.id.kai), Integer.valueOf(R.id.kaj));
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
        Iterator it = LJJIJIIJI.iterator();
        while (it.hasNext()) {
            arrayList.add(this.itemView.findViewById(((Number) it.next()).intValue()));
        }
        C16880lQ.LJIILLIIL(imageView, new ACListenerS25S0100000_5(this.LJLIL, 353));
        AqS136S0200000_5 aqS136S0200000_5 = new AqS136S0200000_5(textView, arrayList, 46);
        C34K c34k = new C34K();
        c34k.element = true;
        CD9 cd9 = new CD9(c34k, handler, arrayList, this.LJLIL, textView);
        CDG cdg = this.LJLIL;
        GetSubPrivilegeDetailResponse.Data data = cdg.LJLJI;
        if (data != null && (spotlightInfo = data.spotlightInfo) != null && (list = spotlightInfo.itemList) != null) {
            aqS136S0200000_5.invoke(Integer.valueOf(list.size()));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("1/");
            LIZ.append(list.size());
            textView.setText(X1D.LIZIZ(LIZ));
            viewPager.addOnPageChangeListener(new CDA(this, list, cd9));
            Context requireContext = cdg.LJLIL.requireContext();
            o.LJIIIIZZ(requireContext, "fragment.requireContext()");
            List LJ = C31847Ceh.LJ(CDC.LJLIL, list);
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJ, 10));
            Iterator it2 = LJ.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((SpotlightItem) it2.next()).image);
            }
            viewPager.setAdapter(new C29537BiX(requireContext, arrayList2));
        }
    }
}
