package com.ss.android.ugc.aweme.topic.book.detail;

import X.C16880lQ;
import X.C214298b3;
import X.C51029K0z;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7RG;
import X.C9BE;
import X.OSZ;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import q03.IDaS199S0200000_3;

/* loaded from: classes4.dex */
public final class BookDescAssem extends DynamicAssem {
    public static final Map<String, Integer> LJLLI = C51029K0z.LJJIIZI(new OSZ("rating", Integer.valueOf(R.id.inj)));
    public final C214298b3 LJLJLLL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.csf;
    }

    public BookDescAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(BookDetailVM.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1055), C7RG.INSTANCE, null);
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem
    public final Map<String, Integer> K3() {
        return LJLLI;
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        assembleChildren();
        Map<String, Object> map = getConfig().LJ;
        TextView textView = (TextView) _$_findCachedViewById(R.id.title);
        Object obj = map.get("title");
        String str3 = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.kp9);
        Object obj2 = map.get("author");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        Object obj3 = map.get("desc");
        if (obj3 instanceof String) {
            str3 = (String) obj3;
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.c84);
        if (str3 == null || str3.length() == 0) {
            str3 = tuxTextView.getContext().getString(R.string.cci);
        }
        tuxTextView.setText(str3);
        C16880lQ.LJIIJ(new IDaS199S0200000_3(tuxTextView, this, 2), tuxTextView);
    }
}
