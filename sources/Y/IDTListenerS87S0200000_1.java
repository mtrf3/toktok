package Y;

import X.AnonymousClass470;
import X.C0A2;
import X.C111964aO;
import X.C111994aR;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.service.search.IIMSearchEntranceWidget;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDTListenerS87S0200000_1 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS87S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(IDTListenerS87S0200000_1 iDTListenerS87S0200000_1, View view, MotionEvent motionEvent) {
        boolean onTouchEvent = ((GestureDetector) iDTListenerS87S0200000_1.l0).onTouchEvent(motionEvent);
        Iterator<View.OnTouchListener> it = ((AnonymousClass470) iDTListenerS87S0200000_1.l1).LIZJ.iterator();
        while (it.hasNext()) {
            it.next().onTouch(view, motionEvent);
        }
        return onTouchEvent;
    }

    public static final boolean onTouch$1(IDTListenerS87S0200000_1 iDTListenerS87S0200000_1, View view, MotionEvent motionEvent) {
        if (o.LJ(view, (RecyclerView) iDTListenerS87S0200000_1.l0) && ((GestureDetector) iDTListenerS87S0200000_1.l1).onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS87S0200000_1 iDTListenerS87S0200000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((C111964aO) iDTListenerS87S0200000_1.l0).LJLLLLLL((View) iDTListenerS87S0200000_1.l1);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$3(IDTListenerS87S0200000_1 iDTListenerS87S0200000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            ((C111964aO) iDTListenerS87S0200000_1.l0).LJLLLLLL((View) iDTListenerS87S0200000_1.l1);
            return true;
        }
        return true;
    }

    public static final boolean onTouch$4(IDTListenerS87S0200000_1 iDTListenerS87S0200000_1, View view, MotionEvent motionEvent) {
        boolean z;
        LinearLayoutManager linearLayoutManager;
        if (((IIMSearchEntranceWidget) iDTListenerS87S0200000_1.l0).LJIILLIIL()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            C0A2 layoutManager = ((RecyclerView) iDTListenerS87S0200000_1.l1).getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.LLIL() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (C111994aR.LIZ == Integer.MAX_VALUE) {
                if (z) {
                    C111994aR.LIZ = (int) motionEvent.getRawY();
                    return true;
                }
            } else if (z && ((int) motionEvent.getRawY()) - C111994aR.LIZ > 0) {
                ((IIMSearchEntranceWidget) iDTListenerS87S0200000_1.l0).LJIIZILJ();
                return true;
            }
            return false;
        }
        C111994aR.LIZ = Integer.MAX_VALUE;
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS87S0200000_1 iDTListenerS87S0200000_1, View view, MotionEvent motionEvent) {
        if (o.LJ(view, (RecyclerView) iDTListenerS87S0200000_1.l0) && ((GestureDetector) iDTListenerS87S0200000_1.l1).onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }
}
