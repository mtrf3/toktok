package X;

import Y.ACListenerS35S0300000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LdT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54703LdT extends C8HS<C54705LdV> {
    public C54703LdT() {
        super(false, 1, null);
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<C54705LdV> data;
        List<T> list = this.mmItems;
        if (list != 0 && (data = getData()) != null && (viewHolder instanceof C54702LdS)) {
            C54702LdS c54702LdS = (C54702LdS) viewHolder;
            C54705LdV skyLightItem = (C54705LdV) ListProtector.get(list, i);
            ArrayList arrayList = new ArrayList();
            for (C54705LdV c54705LdV : data) {
                if (c54705LdV instanceof C54705LdV) {
                    arrayList.add(c54705LdV);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                o.LJII(next, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.mall.ui.skylight.MallSkylightUserInfo");
                arrayList2.add(next);
            }
            c54702LdS.getClass();
            o.LJIIIZ(skyLightItem, "skyLightItem");
            C78765Uvh.LJIIIZ(c54702LdS.LJLILLLLZI, skyLightItem.LIZ, -1, -1);
            c54702LdS.LJLJI.setText(skyLightItem.LIZIZ);
            c54702LdS.LJLJJL.setVisibility(0);
            c54702LdS.LJLJJI.setText("LIVE");
            c54702LdS.LJLJJLL.LJIIIIZZ(null, C54702LdS.class);
            C16880lQ.LJIIJ(new ACListenerS35S0300000_9(c54702LdS, skyLightItem, arrayList2, 9), c54702LdS.LJLIL);
            String str = skyLightItem.LIZJ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = skyLightItem.LJ;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = skyLightItem.LIZLLL;
            if (str4 != null) {
                str2 = str4;
            }
            C76542zS.LIZJ("livesdk_live_show", new C51766KTi(str, str2, str3));
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a06, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new C54702LdS(view);
    }
}
