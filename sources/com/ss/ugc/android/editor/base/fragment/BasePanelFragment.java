package com.ss.ugc.android.editor.base.fragment;

import X.C1280550v;
import X.C1291054w;
import X.C1291154x;
import X.C140545fO;
import X.C16880lQ;
import X.C57D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public abstract class BasePanelFragment extends BaseFragment {
    public TextView LJLILLLLZI;
    public View LJLJI;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final C1291154x LJLJJI = C1291054w.LIZ().LJLILLLLZI;
    public final C57D LJLJJL = C1280550v.LIZ().LIZ().LIZ;

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.base.fragment.BaseFragment
    public final void vl() {
    }

    public abstract int xl();

    public BasePanelFragment() {
        C57D c57d = C1280550v.LIZ().LIZ().LIZ;
        if (c57d != null) {
            c57d.getResourceConfig();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LJLJJLL = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LJLJJLL = true;
    }

    @Override // com.ss.ugc.android.editor.base.fragment.BaseFragment
    public final void wl(LayoutInflater inflater, View view) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(inflater, "inflater");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.hbv);
        if (xl() > 0) {
            if (getContext() == null) {
                return;
            }
            C16880lQ.LLLLIILL(inflater, xl(), viewGroup, true);
            this.LJLILLLLZI = (TextView) view.findViewById(R.id.md_);
            this.LJLJI = view.findViewById(R.id.j5u);
            ImageView imageView = (ImageView) view.findViewById(R.id.f8b);
            C1291154x c1291154x = this.LJLJJI;
            if (c1291154x != null) {
                int i = c1291154x.LJLIL;
                if (i != 0) {
                    imageView.setImageResource(i);
                }
                if (c1291154x.LJLJJI != 0) {
                    TextView textView = this.LJLILLLLZI;
                    o.LJI(textView);
                    Context context = getContext();
                    o.LJI(context);
                    textView.setTextColor(context.getResources().getColor(c1291154x.LJLJJI));
                }
                if (c1291154x.LJLJI != 0) {
                    TextView textView2 = this.LJLILLLLZI;
                    o.LJI(textView2);
                    textView2.setTextSize(c1291154x.LJLJI);
                }
            }
            C140545fO.LIZ(imageView, 600L, new AqS168S0100000_2(this, 507));
            return;
        }
        throw new IllegalStateException("contentViewLayoutId is invalid.");
    }
}
