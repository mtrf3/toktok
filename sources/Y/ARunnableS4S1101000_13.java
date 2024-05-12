package Y;

import X.C0K2;
import X.C30868C9o;
import X.C31012CFc;
import X.U66;
import X.U7U;
import X.U9F;
import X.UA9;
import X.UC0;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcStartResultMessage;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.EnableCoHostDetailedDisableReasonSetting;
import com.zhiliaoapp.musically.R;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS4S1101000_13 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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
            case 5:
                run$5(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(ARunnableS4S1101000_13 aRunnableS4S1101000_13) {
        String string;
        LinkControlWidget linkControlWidget = (LinkControlWidget) aRunnableS4S1101000_13.l1;
        int i = aRunnableS4S1101000_13.i2;
        String str = aRunnableS4S1101000_13.s0;
        if (linkControlWidget.context == null) {
            string = "";
        } else if (EnableCoHostDetailedDisableReasonSetting.INSTANCE.getValue()) {
            if (i != 5) {
                if (i != 11) {
                    if (i != 14) {
                        if (i != 16) {
                            if (i != 22) {
                                if (i != 24) {
                                    string = linkControlWidget.context.getString(R.string.jup);
                                } else if (TextUtils.isEmpty(str)) {
                                    string = linkControlWidget.context.getString(R.string.jup);
                                } else {
                                    string = linkControlWidget.context.getString(R.string.lw3, str);
                                }
                            } else {
                                string = linkControlWidget.context.getString(R.string.kkv);
                            }
                        } else {
                            string = linkControlWidget.context.getString(R.string.kjn);
                        }
                    }
                } else {
                    string = linkControlWidget.context.getString(R.string.kif);
                }
            }
            string = linkControlWidget.context.getString(R.string.kh8);
        } else if (i != 2 && i != 4 && i != 11) {
            string = linkControlWidget.context.getString(R.string.kh8);
        } else {
            string = linkControlWidget.context.getString(R.string.jup);
        }
        C30868C9o.LJI(string);
    }

    public static final void run$1(ARunnableS4S1101000_13 aRunnableS4S1101000_13) {
        boolean LIZ;
        try {
            if (LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutLoadReportEnable()) {
                JSONObject LIZ2 = ((LayoutSlardarMonitor) aRunnableS4S1101000_13.l1).LIZ("linkmic_layout_load");
                int i = aRunnableS4S1101000_13.i2;
                String str = aRunnableS4S1101000_13.s0;
                LIZ2.put("layout_data_size", i);
                LIZ2.put("hash", str);
                C0K2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, LIZ2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS4S1101000_13 aRunnableS4S1101000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS1S1201200_13((U66) aRunnableS4S1101000_13.l1, aRunnableS4S1101000_13.s0, aRunnableS4S1101000_13.i2, UC0.LJIJI((U66) aRunnableS4S1101000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), 1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS4S1101000_13 aRunnableS4S1101000_13) {
        boolean LIZ;
        try {
            UA9.LJFF().LIZIZ(new ARunnableS1S1201200_13((U66) aRunnableS4S1101000_13.l1, aRunnableS4S1101000_13.s0, aRunnableS4S1101000_13.i2, UC0.LJIJI((U66) aRunnableS4S1101000_13.l1), C31012CFc.LIZIZ(), System.currentTimeMillis(), 2));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS4S1101000_13 aRunnableS4S1101000_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS4S1101000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJJI(new LinkCoreError(aRunnableS4S1101000_13.i2, aRunnableS4S1101000_13.s0));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS4S1101000_13 aRunnableS4S1101000_13) {
        boolean LIZ;
        try {
            LinkCoreError linkCoreError = new LinkCoreError(aRunnableS4S1101000_13.i2, aRunnableS4S1101000_13.s0);
            U9F u9f = ((U7U) aRunnableS4S1101000_13.l1).LJFF;
            if (u9f != null) {
                u9f.LJLLLLLL(linkCoreError);
            }
            U9F u9f2 = ((U7U) aRunnableS4S1101000_13.l1).LJFF;
            if (u9f2 != null) {
                u9f2.LJLIIL(new RtcStartResultMessage(false, linkCoreError));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS4S1101000_13(int r2, X.U7U r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.i2 = r2
            r0.s0 = r4
            r0.l1 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r3
            r0.i2 = r2
            r0.s0 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S1101000_13.<init>(int, X.U7U, java.lang.String, int):void");
    }

    public ARunnableS4S1101000_13(int i, Object obj, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
