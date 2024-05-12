package Y;

import X.ASL;
import X.ActivityC45651qj;
import X.C164176cP;
import X.C234529Ii;
import X.C235119Kp;
import X.C27740Aue;
import X.C41858Gbm;
import X.C54289LSj;
import X.C61386O7i;
import X.C61395O7r;
import X.C61402O7y;
import X.C62710OjK;
import X.C62876Om0;
import X.C68322mC;
import X.DV4;
import X.O79;
import X.O7E;
import X.O7F;
import X.O7W;
import X.O86;
import X.O87;
import X.O8G;
import X.O8I;
import android.app.Activity;
import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDTListenerS91S0200000_10 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public IDTListenerS91S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public static final boolean onTouch$0(IDTListenerS91S0200000_10 iDTListenerS91S0200000_10, View view, MotionEvent motionEvent) {
        O8G o8g;
        int i;
        if (((O7W) iDTListenerS91S0200000_10.l1).getTouchDelegate() != null && ((O7W) iDTListenerS91S0200000_10.l1).getTouchDelegate().onTouchEvent(motionEvent)) {
            return true;
        }
        O7W o7w = (O7W) iDTListenerS91S0200000_10.l1;
        C61386O7i c61386O7i = o7w.LLIIZ;
        if (c61386O7i != null && ((i = c61386O7i.LIZIZ.LLJILJIL) == 7 || i == 6)) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    float x = motionEvent.getX() - c61386O7i.LJFF.x;
                    float y = motionEvent.getY() - c61386O7i.LJFF.y;
                    if (Math.abs(x) <= Math.abs(y) && y < 0.0f && Math.abs(y) >= c61386O7i.LJI) {
                        O87 o87 = (O87) c61386O7i.LJ;
                        o87.LIZ.LJIILIIL();
                        O7F o7f = (O7F) o87.LIZ.LLII;
                        O86 o86 = o7f.LIZ;
                        O8I o8i = new O8I();
                        o8i.LIZ = 4;
                        o86.LIZJ(o8i);
                        o7f.LIZIZ();
                        O7W o7w2 = o87.LIZ;
                        if (o7w2.LLIL != null) {
                            o7w2.LLFFF = 8;
                            o7w2.LJIILL();
                        }
                        O79.LIZIZ().LJII(o87.LIZ.LLIFFJFJJ, "swipe_up");
                        return true;
                    }
                }
            } else {
                c61386O7i.LJFF.set(motionEvent.getX(), motionEvent.getY());
            }
        }
        GestureDetector gestureDetector = o7w.LLIIJLIL;
        if ((gestureDetector == null || !gestureDetector.onTouchEvent(motionEvent)) && ((motionEvent.getAction() != 1 || (o8g = o7w.LLIIL) == null || !o8g.LIZ()) && !o7w.LLILIL && motionEvent.getAction() == 1)) {
            ((O7W) iDTListenerS91S0200000_10.l1).LIZIZ((O7E) iDTListenerS91S0200000_10.l0, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }

    public static final boolean onTouch$1(IDTListenerS91S0200000_10 iDTListenerS91S0200000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((O7W) iDTListenerS91S0200000_10.l1).LJIILIIL();
            C61402O7y c61402O7y = new C61402O7y();
            c61402O7y.LIZ = -1;
            c61402O7y.LJ = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            O7W o7w = (O7W) iDTListenerS91S0200000_10.l1;
            c61402O7y.LIZLLL = o7w.LLD;
            c61402O7y.LIZJ = "click_open_app_area";
            C61395O7r c61395O7r = new C61395O7r(c61402O7y);
            ((O7F) o7w.LLII).LIZLLL((O7E) iDTListenerS91S0200000_10.l0, c61395O7r);
            ((O7F) ((O7W) iDTListenerS91S0200000_10.l1).LLII).LJ();
        }
        return true;
    }

    public static final boolean onTouch$2(IDTListenerS91S0200000_10 iDTListenerS91S0200000_10, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((O7W) iDTListenerS91S0200000_10.l1).LIZJ((O7E) iDTListenerS91S0200000_10.l0, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static final boolean onTouch$3(IDTListenerS91S0200000_10 iDTListenerS91S0200000_10, View view, MotionEvent motionEvent) {
        boolean z;
        String url;
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        UrlModel cover;
        List<String> urlList;
        String url2;
        ActivityC45651qj activityC45651qj2;
        FragmentManager supportFragmentManager2;
        UrlModel cover2;
        List<String> urlList2;
        if (C54289LSj.LIZIZ(motionEvent.getRawX(), motionEvent.getRawY(), ((C54289LSj) iDTListenerS91S0200000_10.l0).LIZLLL) || C54289LSj.LIZIZ(motionEvent.getRawX(), motionEvent.getRawY(), ((C54289LSj) iDTListenerS91S0200000_10.l0).LJ)) {
            if (DV4.LIZ() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C54289LSj c54289LSj = (C54289LSj) iDTListenerS91S0200000_10.l0;
                C62876Om0 c62876Om0 = new C62876Om0(c54289LSj.LIZ, (Aweme) iDTListenerS91S0200000_10.l1, c54289LSj.LIZIZ, c54289LSj.LIZJ);
                C68322mC c68322mC = new C68322mC();
                ASL asl = new ASL();
                C235119Kp c235119Kp = new C235119Kp();
                C234529Ii LIZJ = s1.LIZJ();
                LIZJ.LIZJ = R.raw.icon_x_mark_small;
                LIZJ.LIZIZ(new AqS157S0100000_7(c68322mC, 650));
                c235119Kp.LIZIZ(LIZJ);
                c235119Kp.LIZJ(c62876Om0.LJFF);
                asl.LIZ.LJLLL = c235119Kp;
                asl.LJI(0);
                asl.LIZ(c62876Om0.LJII);
                ?? r5 = asl.LIZ;
                r5.LJZI = false;
                r5.LJLILLLLZI = new IDDListenerS149S0100000_10(c62876Om0, 6);
                c68322mC.element = r5;
                C62876Om0.LJIIZILJ = r5;
                Video video = c62876Om0.LIZIZ.getVideo();
                if (video == null || (cover2 = video.getCover()) == null || (urlList2 = cover2.getUrlList()) == null || !(true ^ urlList2.isEmpty())) {
                    url2 = "";
                } else {
                    url2 = (String) ListProtector.get(urlList2, 0);
                }
                C164176cP c164176cP = c62876Om0.LJIILJJIL;
                o.LJIIIIZZ(url2, "url");
                c164176cP.LIZIZ(url2);
                c62876Om0.LJIIJJI.LIZIZ(c62876Om0.LJIILLIIL);
                c62876Om0.LIZIZ();
                c62876Om0.LJIIL.LIZLLL();
                C62710OjK c62710OjK = c62876Om0.LJIIL;
                AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(c68322mC, 651);
                c62710OjK.getClass();
                c62710OjK.LJI = aqS157S0100000_7;
                c62710OjK.LJFF = new AqS157S0200000_10(c62876Om0, (C62876Om0) c68322mC, (C68322mC<TuxSheet>) 43);
                c62876Om0.LIZ();
                Activity LIZ = C27740Aue.LIZ(c62876Om0.LIZ);
                if ((LIZ instanceof ActivityC45651qj) && (activityC45651qj2 = (ActivityC45651qj) LIZ) != null && (supportFragmentManager2 = activityC45651qj2.getSupportFragmentManager()) != null) {
                    ((DialogFragment) c68322mC.element).show(supportFragmentManager2, "");
                    C41858Gbm.LIZIZ(c62876Om0.LIZJ, c62876Om0.LIZIZ, c62876Om0.LIZLLL);
                }
            } else if (DV4.LIZ() == 4) {
                C54289LSj c54289LSj2 = (C54289LSj) iDTListenerS91S0200000_10.l0;
                C62876Om0 c62876Om02 = new C62876Om0(c54289LSj2.LIZ, (Aweme) iDTListenerS91S0200000_10.l1, c54289LSj2.LIZIZ, c54289LSj2.LIZJ);
                C68322mC c68322mC2 = new C68322mC();
                ASL asl2 = new ASL();
                C235119Kp c235119Kp2 = new C235119Kp();
                C234529Ii LIZJ2 = s1.LIZJ();
                LIZJ2.LIZJ = R.raw.icon_x_mark_small;
                LIZJ2.LIZIZ(new AqS157S0100000_7(c68322mC2, 648));
                c235119Kp2.LIZIZ(LIZJ2);
                c235119Kp2.LIZJ(c62876Om02.LJFF);
                asl2.LIZ.LJLLL = c235119Kp2;
                asl2.LJI(0);
                asl2.LIZ(c62876Om02.LJII);
                ?? r2 = asl2.LIZ;
                r2.LJZI = false;
                r2.LJLILLLLZI = new IDDListenerS149S0100000_10(c62876Om02, 5);
                c68322mC2.element = r2;
                C62876Om0.LJIIZILJ = r2;
                Video video2 = c62876Om02.LIZIZ.getVideo();
                if (video2 == null || (cover = video2.getCover()) == null || (urlList = cover.getUrlList()) == null || !(true ^ urlList.isEmpty())) {
                    url = "";
                } else {
                    url = (String) ListProtector.get(urlList, 0);
                }
                C164176cP c164176cP2 = c62876Om02.LJIILJJIL;
                o.LJIIIIZZ(url, "url");
                c164176cP2.LIZIZ(url);
                c62876Om02.LJIIJJI.LIZIZ(c62876Om02.LJIILLIIL);
                c62876Om02.LIZJ();
                c62876Om02.LJIIL.LIZLLL();
                C62710OjK c62710OjK2 = c62876Om02.LJIIL;
                AqS157S0100000_7 aqS157S0100000_72 = new AqS157S0100000_7(c68322mC2, 649);
                c62710OjK2.getClass();
                c62710OjK2.LJI = aqS157S0100000_72;
                c62710OjK2.LJFF = new AqS157S0200000_10(c62876Om02, (C62876Om0) c68322mC2, (C68322mC<TuxSheet>) 45);
                c62876Om02.LIZ();
                Activity LIZ2 = C27740Aue.LIZ(c62876Om02.LIZ);
                if ((LIZ2 instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) LIZ2) != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                    ((DialogFragment) c68322mC2.element).show(supportFragmentManager, "");
                    C41858Gbm.LIZIZ(c62876Om02.LIZJ, c62876Om02.LIZIZ, c62876Om02.LIZLLL);
                }
            }
            ((C54289LSj) iDTListenerS91S0200000_10.l0).dismiss();
            return true;
        }
        return ((C54289LSj) iDTListenerS91S0200000_10.l0).LIZ.getWindow().getDecorView().dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getRawX(), motionEvent.getRawY(), motionEvent.getPressure(), motionEvent.getSize(), motionEvent.getMetaState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags()));
    }
}
