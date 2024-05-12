package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.like.LikeHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Bph, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C29981Bph extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ LikeHelper LJLIL;

    public C29981Bph(LikeHelper likeHelper) {
        this.LJLIL = likeHelper;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        LikeHelper likeHelper = this.LJLIL;
        if (likeHelper.LJJI()) {
            Iterator it = ((ArrayList) likeHelper.LLILLIZIL).iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            if (!likeHelper.LJLLJ) {
                likeHelper.LJLJJLL++;
                likeHelper.LJLJL = 0;
                likeHelper.LJLLJ = true;
                return true;
            }
        }
        if (super.onDoubleTap(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        View view;
        View view2;
        LikeHelper likeHelper = this.LJLIL;
        float LJJII = likeHelper.LJJII(motionEvent);
        float LJJIII = this.LJLIL.LJJIII(motionEvent);
        if (likeHelper.LJJI() && likeHelper.LJLLJ) {
            likeHelper.LJLJL++;
            likeHelper.LJLLL++;
            if (likeHelper.LJLLLL <= 0.0f && likeHelper.LJLLLLLL <= 0.0f && (view = likeHelper.LLII) != null && view.getMeasuredWidth() != 0 && likeHelper.LLII.getMeasuredHeight() != 0 && (view2 = likeHelper.LLIFFJFJJ) != null && view2.getMeasuredWidth() != 0 && likeHelper.LLIFFJFJJ.getMeasuredHeight() != 0) {
                int[] iArr = new int[2];
                likeHelper.LLII.getLocationInWindow(iArr);
                if (iArr[0] <= C81185Vtd.LIZLLL() && iArr[1] <= C81185Vtd.LIZIZ()) {
                    int[] iArr2 = new int[2];
                    likeHelper.LLIFFJFJJ.getLocationInWindow(iArr2);
                    int i = iArr[0] - iArr2[0];
                    int i2 = iArr[1] - iArr2[1];
                    likeHelper.LJLLLL = (likeHelper.LLII.getMeasuredWidth() / 2.0f) + i;
                    likeHelper.LJLLLLLL = (likeHelper.LLII.getMeasuredHeight() / 2.0f) + i2;
                }
            }
            int i3 = likeHelper.LJLJJLL;
            int i4 = likeHelper.LJLJL;
            int i5 = likeHelper.LJLLL;
            float f = likeHelper.LJLLLL;
            float f2 = likeHelper.LJLLLLLL;
            likeHelper.LJJIIZ(i3, i4, i5, LJJII, LJJIII, f, f2);
            Iterator it = ((ArrayList) likeHelper.LJLJJL).iterator();
            while (it.hasNext()) {
                InterfaceC29986Bpm interfaceC29986Bpm = (InterfaceC29986Bpm) it.next();
                long currentTimeMillis = System.currentTimeMillis();
                interfaceC29986Bpm.g4(likeHelper, i3, i4, LJJII, LJJIII, f, f2);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                String name = interfaceC29986Bpm.A4();
                o.LJIIIZ(name, "name");
                HashMap<String, C29987Bpn> hashMap = C29982Bpi.LJIIIZ;
                if (!hashMap.containsKey(name)) {
                    hashMap.put(name, new C29987Bpn());
                }
                C29987Bpn c29987Bpn = hashMap.get(name);
                if (c29987Bpn != null) {
                    c29987Bpn.LIZIZ += currentTimeMillis2;
                    c29987Bpn.LIZJ++;
                    if (c29987Bpn.LIZ < currentTimeMillis2) {
                        c29987Bpn.LIZ = currentTimeMillis2;
                    }
                }
            }
            likeHelper.LLILLJJLI.removeMessages(1);
            likeHelper.LLILLJJLI.sendEmptyMessageDelayed(1, likeHelper.LJLJLJ);
            return true;
        }
        if (super.onDown(motionEvent)) {
            return true;
        }
        return false;
    }
}
