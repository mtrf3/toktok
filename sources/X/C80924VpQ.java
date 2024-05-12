package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.VpQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80924VpQ extends TuxTextView {
    public final boolean LJLLLL;
    public boolean LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public final java.util.Map<Integer, View> LL;

    @Override // com.bytedance.tux.input.TuxTextView
    public final View LJJIJIL(int i) {
        java.util.Map<Integer, View> map = this.LL;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80924VpQ(Context context) {
        super(context, null, 0);
        this.LL = C62850Ola.LJFF(context, "context");
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        this.LJZI = true;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "this.context");
        this.LJZ = AnonymousClass636.LJIIIIZZ(R.attr.eb, context2);
        int i = C78885Uxd.LIZIZ;
        this.LJLZ = i;
        int LIZJ = C78885Uxd.LIZJ(i);
        if (this.LJZI) {
            setTextColor(this.LJLLLLLL ? this.LJLZ : LIZJ);
        }
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.LJZL) {
                if (this.LJLLLL) {
                    setTextColor(this.LJZ);
                    return;
                }
                return;
            }
            setTextColor(this.LJLZ);
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "this.context");
        setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, context));
    }

    public final void setOldPanelStyle(boolean z) {
        int i = C78885Uxd.LIZIZ;
        this.LJLZ = i;
        int LIZJ = C78885Uxd.LIZJ(i);
        if (this.LJLLLLLL) {
            LIZJ = this.LJLZ;
        }
        setTextColor(LIZJ);
    }

    public final void setSelectTextColor(int i) {
        this.LJLZ = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
    }

    public final void setStatusTextColor(int i) {
        this.LJZ = i;
        boolean z = this.LJZL;
        this.LJZL = z;
        if (z) {
            if (this.LJLLLL) {
                setTextColor(i);
                return;
            }
            return;
        }
        setTextColor(this.LJLZ);
    }
}
