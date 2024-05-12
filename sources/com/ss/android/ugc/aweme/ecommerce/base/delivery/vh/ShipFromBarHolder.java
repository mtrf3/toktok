package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C16880lQ;
import X.C1FL;
import X.C26730AeM;
import X.C26943Ahn;
import X.C44878HjO;
import X.C45804HyK;
import X.C62562cu;
import X.C70759Rpr;
import X.EnumC72807Shn;
import X.V0N;
import X.W5F;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ShipFromBarHolder extends ECJediViewHolder {
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShipFromBarHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.yg, viewGroup, false, "from(parent.context).inf…_from_bar, parent, false)"));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    public void L(DispatchFrom item) {
        C62562cu thumbFirstImageUrlModel;
        View findViewById;
        C62562cu thumbFirstImageUrlModel2;
        View findViewById2;
        o.LJIIIZ(item, "item");
        C26943Ahn.LIZ.getClass();
        if (C26943Ahn.LIZ()) {
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.f51));
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.emx));
            ((TextView) this.itemView.findViewById(R.id.mk2)).setText(item.title);
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.mk2));
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.f6o));
            C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.exx));
        }
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.gzn));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        M(itemView, item.warehouseTag);
        ((TextView) this.itemView.findViewById(R.id.mjz)).setText(item.text);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Image LJIJJLI = V0N.LJIJJLI(context, item.icon);
        if (LJIJJLI != null && (thumbFirstImageUrlModel2 = LJIJJLI.toThumbFirstImageUrlModel()) != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(thumbFirstImageUrlModel2);
            LIZLLL.LJIIJJI = R.drawable.adx;
            LIZLLL.LJIJJ = EnumC72807Shn.FIT_XY;
            if (C26943Ahn.LIZ()) {
                findViewById2 = this.itemView.findViewById(R.id.emx);
            } else {
                findViewById2 = this.itemView.findViewById(R.id.f51);
            }
            LIZLLL.LJJIIJZLJL = (ImageView) findViewById2;
            C16880lQ.LLJJJ(LIZLLL);
        }
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        Image LJIJJLI2 = V0N.LJIJJLI(context2, item.arrow);
        if (LJIJJLI2 != null && (thumbFirstImageUrlModel = LJIJJLI2.toThumbFirstImageUrlModel()) != null) {
            W5F LIZLLL2 = C70759Rpr.LIZLLL(thumbFirstImageUrlModel);
            LIZLLL2.LJIIJJI = R.drawable.adx;
            LIZLLL2.LJIJJ = EnumC72807Shn.FIT_XY;
            if (C26943Ahn.LIZ()) {
                findViewById = this.itemView.findViewById(R.id.f6o);
            } else {
                findViewById = this.itemView.findViewById(R.id.exx);
            }
            LIZLLL2.LJJIIJZLJL = (ImageView) findViewById;
            C16880lQ.LLJJJ(LIZLLL2);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void onBind(DispatchFrom item) {
        o.LJIIIZ(item, "item");
        L(item);
    }

    public static void M(View view, WarehouseTag warehouseTag) {
        SpannableStringBuilder spannableStringBuilder;
        if (warehouseTag == null) {
            C45804HyK.LJJIJIIJIL(view.findViewById(R.id.ngs));
            return;
        }
        C45804HyK.LJJLL(view.findViewById(R.id.ngs));
        TextView textView = (TextView) view.findViewById(R.id.mqi);
        RichTextUtil richTextUtil = RichTextUtil.LIZ;
        String str = warehouseTag.template;
        HashMap<String, String> hashMap = warehouseTag.arguments;
        Boolean bool = Boolean.TRUE;
        richTextUtil.getClass();
        C62562cu c62562cu = null;
        if (str == null || hashMap == null) {
            spannableStringBuilder = null;
        } else {
            StringBuilder sb = new StringBuilder(str);
            ArrayList arrayList = new ArrayList();
            for (String key : hashMap.keySet()) {
                String str2 = hashMap.get(key);
                if (str2 != null) {
                    arrayList.add(str2);
                    o.LJIIIIZZ(key, "key");
                    C26730AeM.LIZ(sb, key, str2);
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(sb);
            if (o.LJ(bool, Boolean.TRUE)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int indexOf = sb.indexOf(str3);
                    int length = str3.length() + indexOf;
                    if (indexOf >= 0 && length <= sb.length()) {
                        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, length, 17);
                    }
                }
            }
        }
        textView.setText(spannableStringBuilder);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Image LJIJJLI = V0N.LJIJJLI(context, warehouseTag.icon);
        if (LJIJJLI != null) {
            c62562cu = LJIJJLI.toThumbFirstImageUrlModel();
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
        LIZLLL.LJIIJJI = R.drawable.adx;
        LIZLLL.LJIJJ = EnumC72807Shn.FIT_XY;
        LIZLLL.LJJIIJZLJL = (ImageView) view.findViewById(R.id.e_p);
        C16880lQ.LLJJJ(LIZLLL);
    }
}
