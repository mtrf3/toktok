package Y;

import X.AbstractC91394Ztu;
import X.ActivityC45651qj;
import X.C77869UhF;
import X.C8VV;
import X.C91369ZtV;
import X.C91506Zvi;
import X.LSY;
import android.view.View;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS173S0200000_29;

/* loaded from: classes22.dex */
public class IDRunnableS32S0200000_29 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C91369ZtV c91369ZtV = (C91369ZtV) this.l0;
        View view = (View) this.l1;
        c91369ZtV.getClass();
        c91369ZtV.LJ = (C77869UhF) view.findViewById(R.id.f41);
        ((C91369ZtV) this.l0).LJFF = (LSY) ((View) this.l1).findViewById(R.id.f46);
        LSY lsy = ((C91369ZtV) this.l0).LJFF;
        if (lsy != null) {
            lsy.setVisibility(0);
        }
        C77869UhF c77869UhF = ((C91369ZtV) this.l0).LJ;
        if (c77869UhF != null) {
            c77869UhF.setVisibility(8);
        }
        LSY lsy2 = ((C91369ZtV) this.l0).LJFF;
        if (lsy2 != null) {
            lsy2.LJLIL.start();
            lsy2.LJLJI.LJLLJ.start();
        }
    }

    public static final void run$0(IDRunnableS32S0200000_29 iDRunnableS32S0200000_29) {
        boolean LIZ;
        try {
            ((View) iDRunnableS32S0200000_29.l0).setVisibility(8);
            C91369ZtV c91369ZtV = (C91369ZtV) iDRunnableS32S0200000_29.l1;
            c91369ZtV.LJ = null;
            LSY lsy = c91369ZtV.LJFF;
            if (lsy != null) {
                lsy.LIZ();
            }
            ((C91369ZtV) iDRunnableS32S0200000_29.l1).LJFF = null;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS32S0200000_29 iDRunnableS32S0200000_29) {
        boolean LIZ;
        try {
            iDRunnableS32S0200000_29.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS32S0200000_29 iDRunnableS32S0200000_29) {
        boolean LIZ;
        try {
            if (((BasePlayerFragment) iDRunnableS32S0200000_29.l0).mo49getActivity() != null) {
                ActivityC45651qj mo49getActivity = ((BasePlayerFragment) iDRunnableS32S0200000_29.l0).mo49getActivity();
                if (mo49getActivity == null || !mo49getActivity.isFinishing()) {
                    ActivityC45651qj mo49getActivity2 = ((BasePlayerFragment) iDRunnableS32S0200000_29.l0).mo49getActivity();
                    if (mo49getActivity2 == null || !mo49getActivity2.isDestroyed()) {
                        BasePlayerFragment basePlayerFragment = (BasePlayerFragment) iDRunnableS32S0200000_29.l0;
                        C8VV.LIZ(basePlayerFragment, false, new IDqS173S0200000_29((AbstractC91394Ztu) iDRunnableS32S0200000_29.l1, basePlayerFragment, 18));
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public IDRunnableS32S0200000_29(android.view.View r2, X.C91369ZtV r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS32S0200000_29.<init>(android.view.View, X.ZtV, int):void");
    }

    public IDRunnableS32S0200000_29(C91506Zvi c91506Zvi, BasePlayerFragment basePlayerFragment, int i) {
        this.$t = i;
        this.l0 = basePlayerFragment;
        this.l1 = c91506Zvi;
    }
}
