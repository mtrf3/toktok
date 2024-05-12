package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class VG4 extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public final GestureDetector LJLIL;
    public final ScaleGestureDetector LJLILLLLZI;
    public ArrayList<GestureDetector.SimpleOnGestureListener> LJLJI;
    public ArrayList<ScaleGestureDetector.OnScaleGestureListener> LJLJJI;

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public VG4(Context context) {
        this.LJLIL = new GestureDetector(context, this);
        this.LJLILLLLZI = new ScaleGestureDetector(context, this);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ArrayList<ScaleGestureDetector.OnScaleGestureListener> arrayList = this.LJLJJI;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<ScaleGestureDetector.OnScaleGestureListener> it = this.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().onScale(scaleGestureDetector);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ArrayList<GestureDetector.SimpleOnGestureListener> arrayList = this.LJLJI;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<GestureDetector.SimpleOnGestureListener> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().onScroll(motionEvent, motionEvent2, f, f2);
        }
        return true;
    }
}
