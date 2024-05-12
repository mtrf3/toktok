package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.6SN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SN extends T5T {
    public final CopyOnWriteArrayList<InterfaceC88471Ynr<Integer, KeyEvent, C76800UCe>> LJLJJLL;
    public final CopyOnWriteArrayList<InterfaceC88471Ynr<Integer, KeyEvent, C76800UCe>> LJLJL;
    public boolean LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6SN(Context context) {
        super(context, null, R.attr.jy);
        new LinkedHashMap();
        this.LJLJJLL = new CopyOnWriteArrayList<>();
        this.LJLJL = new CopyOnWriteArrayList<>();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJLJ) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<InterfaceC88471Ynr<Integer, KeyEvent, C76800UCe>> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().invoke(Integer.valueOf(i), keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        Iterator<InterfaceC88471Ynr<Integer, KeyEvent, C76800UCe>> it = this.LJLJL.iterator();
        while (it.hasNext()) {
            it.next().invoke(Integer.valueOf(i), keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }
}
