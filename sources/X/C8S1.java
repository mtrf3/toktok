package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("story2_tap_to_next_video_guide")
/* renamed from: X.8S1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8S1 extends AbstractC211528Rw {
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public C8S2 LJLJJLL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 7001;
    }

    @Override // X.AbstractC211528Rw
    public final void LJIIIIZZ() {
        C8S2 c8s2 = this.LJLJJLL;
        if (c8s2 != null) {
            XKQ xkq = c8s2.LJFF;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            c8s2.LJFF = null;
            c8s2.LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8S1(ConstraintLayout rootContainer, C211538Rx c211538Rx) {
        super("tap_to_forward");
        o.LJIIIZ(rootContainer, "rootContainer");
        this.LJLJJL = c211538Rx;
        new WeakReference(rootContainer);
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        float f;
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ == null) {
            wrapper.LIZ();
            return;
        }
        View decorView = LIZJ.getWindow().getDecorView();
        if (!(decorView instanceof FrameLayout) || decorView == null) {
            wrapper.LIZ();
            return;
        }
        WeakReference weakReference = new WeakReference(decorView);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(wrapper, 1554);
        C8S2 c8s2 = new C8S2(LIZJ, weakReference, aqS153S0100000_3, new AqS153S0100000_3(this, 1555));
        View view = (View) c8s2.LJ.getValue();
        if (view == null) {
            aqS153S0100000_3.invoke();
        } else {
            ViewGroup viewGroup = (ViewGroup) C78966Uyw.LJJLI(weakReference, C8S4.LJLIL);
            if (viewGroup == null) {
                aqS153S0100000_3.invoke();
            } else {
                TextView textView = (TextView) view.findViewById(R.id.e1a);
                if (textView != null) {
                    Resources resources = view.getResources();
                    if (C90193gN.LIZ()) {
                        i = R.string.rqg;
                    } else {
                        i = R.string.rqh;
                    }
                    textView.setText(resources.getString(i));
                }
                View findViewById = view.findViewById(R.id.a5h);
                if (findViewById != null) {
                    if (C90193gN.LIZ()) {
                        f = -1.0f;
                    } else {
                        f = 1.0f;
                    }
                    findViewById.setScaleX(f);
                }
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                viewGroup.addView(view);
                final C29701Eo c29701Eo = (C29701Eo) view.findViewById(R.id.a5h);
                C04650Gf.LJI(new FileInputStream(C8O0.LIZ()), "story_2_tap_gesture_guide").LIZIZ(new InterfaceC04760Gq() { // from class: X.8S3
                    @Override // X.InterfaceC04760Gq
                    public final void onResult(Object obj) {
                        C29701Eo.this.setComposition((C0GY) obj);
                        C29701Eo.this.playAnimation();
                    }
                });
                view.setAlpha(0.0f);
                view.animate().alpha(1.0f).setDuration(250L).setListener(null);
                c8s2.LJFF = XKX.LIZLLL(C780334l.LJLIL, EXV.LIZ, null, new C63262e2(c8s2, null), 2);
            }
        }
        this.LJLJJLL = c8s2;
    }
}
