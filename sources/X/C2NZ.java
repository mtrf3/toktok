package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2NZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2NZ extends TuxTextView {
    public Fragment LJLLLL;
    public BaseListFragmentPanel LJLLLLLL;
    public boolean LJLZ;
    public final java.util.Map<Integer, View> LJZ;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LJZ;
        Integer valueOf = Integer.valueOf(R.id.title);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        View view = (View) linkedHashMap.get(valueOf);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.title);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(valueOf, findViewById);
        return findViewById;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2NZ(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2NZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        this.LJZ = C62850Ola.LJFF(context, "context");
        setPadding(C7MY.LIZIZ(6), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), C7MY.LIZIZ(15), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
        setBackground(getContext().getDrawable(R.drawable.ahm));
        String string = getContext().getString(R.string.p87);
        o.LJIIIIZZ(string, "context.getString(R.stri…ressPush_FYP_widget_body)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{Integer.valueOf(C2NK.LIZ())}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        setText(LLLZ);
        setVisibility(8);
    }
}
