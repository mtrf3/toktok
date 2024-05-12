package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder;

import X.C117114ih;
import X.C118214kT;
import X.C118234kV;
import X.C16880lQ;
import X.C26338AVi;
import X.C45804HyK;
import X.C47261Igj;
import X.C79081V1x;
import X.EnumC72807Shn;
import X.OUP;
import X.S3I;
import X.S3L;
import X.W5F;
import X.W5U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CCDCIconsViewHolder extends PowerCell<C118214kT> {
    public final S3L LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    public CCDCIconsViewHolder() {
        S3I s3i = new S3I();
        s3i.LIZLLL = C79081V1x.LJII(2);
        this.LJLIL = s3i.LIZ();
        this.LJLILLLLZI = C79081V1x.LJII(4);
        this.LJLJI = C79081V1x.LJII(25);
        this.LJLJJI = C79081V1x.LJII(16);
    }

    public final View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this.LJLJJL;
        Integer valueOf = Integer.valueOf(R.id.g0t);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view == null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            View findViewById = itemView.findViewById(R.id.g0t);
            if (findViewById != null) {
                linkedHashMap.put(valueOf, findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C118214kT c118214kT) {
        int i;
        C118214kT t = c118214kT;
        o.LJIIIZ(t, "t");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.bn_, new C117114ih(C79081V1x.LJII(32), 0, 0, 0, false, 0, true, 254));
        List<String> list = t.LJLIL;
        if (!list.isEmpty()) {
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.g0t));
            ((ViewGroup) _$_findCachedViewById(R.id.g0t)).removeAllViews();
            if (list.size() > 7) {
                list = list.subList(0, 7);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.g0t);
                View smartImageView = new SmartImageView(this.itemView.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJLJI, this.LJLJJI);
                layoutParams.weight = 1.0f;
                smartImageView.setLayoutParams(layoutParams);
                smartImageView.setBackgroundResource(R.drawable.abg);
                viewGroup.addView(smartImageView);
            }
            C118234kV it = C47261Igj.LJJ(list).iterator();
            while (it.LJLJI) {
                int nextInt = it.nextInt();
                View childAt = ((ViewGroup) _$_findCachedViewById(R.id.g0t)).getChildAt(nextInt);
                if (childAt != null && (childAt instanceof SmartImageView)) {
                    if (nextInt != C47261Igj.LJJI(list)) {
                        i = this.LJLILLLLZI;
                    } else {
                        i = 0;
                    }
                    C26338AVi.LJI(childAt, null, null, Integer.valueOf(i), null, false, 27);
                    Object obj = ListProtector.get(list, nextInt);
                    if (((String) obj).length() <= 0) {
                        obj = null;
                    }
                    String str = (String) obj;
                    if (str == null) {
                        str = " ";
                    }
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
                    LJIIIIZZ.LJJIIJZLJL = (ImageView) childAt;
                    C16880lQ.LLJJJ(LJIIIIZZ);
                    ((SmartImageView) childAt).setCircleOptions(this.LJLIL);
                }
            }
            return;
        }
        View llIcons = _$_findCachedViewById(R.id.g0t);
        o.LJIIIIZZ(llIcons, "llIcons");
        OUP.LJIJJLI(llIcons);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return OUP.LJIL(R.layout.zo, parent, false);
    }
}
