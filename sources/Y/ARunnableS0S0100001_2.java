package Y;

import X.C06420Na;
import X.C130585Ao;
import X.C173636rf;
import X.C54D;
import X.C54Y;
import X.C5EW;
import X.C6KO;
import X.C6KV;
import X.InterfaceC133955Nn;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundAdjustFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes3.dex */
public class ARunnableS0S0100001_2 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        float f;
        int width;
        ((C6KO) this.l0).LJI();
        C6KO c6ko = (C6KO) this.l0;
        int i = c6ko.LJLJJLL - c6ko.LJLJJL;
        if (C173636rf.LIZIZ(c6ko.getContext())) {
            C6KO c6ko2 = (C6KO) this.l0;
            f = C06420Na.LIZIZ(1, this.f1, i, c6ko2.LJLJI);
            width = c6ko2.LJLIL.getWidth() / 2;
        } else {
            C6KO c6ko3 = (C6KO) this.l0;
            f = (i * this.f1) + c6ko3.LJLJI;
            width = c6ko3.LJLIL.getWidth() / 2;
        }
        ((C6KO) this.l0).LJIIIIZZ((int) (f - width));
    }

    public final void LIZ$1() {
        HorizontalScrollView horizontalScrollView;
        C54D c54d = (C54D) ((SoundAdjustFragment) this.l0)._$_findCachedViewById(R.id.k7b);
        if (c54d != null) {
            float floatValue = c54d.getAudioSelectFramePosition().getFirst().floatValue();
            float floatValue2 = c54d.LJLJJI - c54d.getAudioSelectFramePosition().getSecond().floatValue();
            C130585Ao c130585Ao = (C130585Ao) c54d.LIZ(R.id.a_e);
            if (c130585Ao != null) {
                c130585Ao.LJLJI.setPadding((int) floatValue, 0, (int) floatValue2, 0);
            }
            ((C130585Ao) c54d.LIZ(R.id.a_e)).LIZ(((C54Y) c54d.LIZ(R.id.a_b)).getSelectFrameRect().left, ((C54Y) c54d.LIZ(R.id.a_b)).getSelectFrameRect().width(), c54d.getAudioTrackLeftPadding());
        }
        C54D c54d2 = (C54D) ((SoundAdjustFragment) this.l0)._$_findCachedViewById(R.id.k7b);
        if (c54d2 != null && (horizontalScrollView = (HorizontalScrollView) c54d2.LIZ(R.id.a_e)) != null) {
            horizontalScrollView.scrollTo((int) this.f1, 0);
        }
    }

    public static final void run$0(ARunnableS0S0100001_2 aRunnableS0S0100001_2) {
        boolean LIZ;
        try {
            ((C6KV) aRunnableS0S0100001_2.l0).LIZ();
            C6KV c6kv = (C6KV) aRunnableS0S0100001_2.l0;
            ((C6KV) aRunnableS0S0100001_2.l0).LIZJ((int) ((((c6kv.LJLJJLL - c6kv.LJLJJL) * aRunnableS0S0100001_2.f1) + c6kv.LJLJI) - (c6kv.LJLIL.getWidth() / 2)));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS0S0100001_2 aRunnableS0S0100001_2) {
        boolean LIZ;
        try {
            aRunnableS0S0100001_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS0S0100001_2 aRunnableS0S0100001_2) {
        boolean LIZ;
        try {
            aRunnableS0S0100001_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS0S0100001_2 aRunnableS0S0100001_2) {
        boolean LIZ;
        try {
            ViewGroup.MarginLayoutParams params = ((C5EW) aRunnableS0S0100001_2.l0).getParams();
            if (params != null) {
                params.setMarginStart(((C5EW) aRunnableS0S0100001_2.l0).getMinStartMargin() + ((int) ((((C5EW) aRunnableS0S0100001_2.l0).getMaxStartMargin() - ((C5EW) aRunnableS0S0100001_2.l0).getMinStartMargin()) * aRunnableS0S0100001_2.f1)));
            }
            C5EW c5ew = (C5EW) aRunnableS0S0100001_2.l0;
            c5ew.setLayoutParams(c5ew.getParams());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS0S0100001_2 aRunnableS0S0100001_2) {
        boolean LIZ;
        try {
            ((InterfaceC133955Nn) aRunnableS0S0100001_2.l0).onCompileProgress(aRunnableS0S0100001_2.f1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS0S0100001_2(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
