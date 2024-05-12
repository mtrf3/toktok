package X;

import Y.ACListenerS28S0201000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SFD extends ArrayAdapter<String> {
    public final List<String> LJLIL;
    public final SFE LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        if (view == null) {
            view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.gx, parent, false);
            o.LJIIIIZZ(view, "from(context).inflate(R.…to_narrow, parent, false)");
        }
        View findViewById = view.findViewById(R.id.ltz);
        o.LJII(findViewById, "null cannot be cast to non-null type com.bytedance.tux.button.TuxButton");
        SY4 sy4 = (SY4) findViewById;
        sy4.setText((CharSequence) ListProtector.get(this.LJLIL, i));
        sy4.setBackground(getContext().getDrawable(R.drawable.ahq));
        sy4.setTextColor(R.attr.ca);
        C16880lQ.LJJIZ(sy4, new ACListenerS28S0201000_12(i, this, sy4, 4));
        return view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SFD(Context context, List<String> arrayList, ActivityC45651qj activityC45651qj, SFE sfe) {
        super(context, 0, arrayList);
        o.LJIIIZ(arrayList, "arrayList");
        this.LJLIL = arrayList;
        this.LJLILLLLZI = sfe;
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(activityC45651qj, 1099));
    }
}
