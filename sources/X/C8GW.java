package X;

import Y.ACListenerS23S0100000_3;
import android.os.Build;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.8GW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GW extends AbstractC208448Ga {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final String LJLJJLL;
    public final C8GY LJLJL;
    public final boolean LJLJLJ;

    @Override // X.MFR
    public final void LLZLLLL() {
        Aweme aweme = this.LJLIL;
        if (aweme != null) {
            P(aweme.getVideo());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        if (X.C78685UuP.LJJJZ(r1) != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            r2 = 0
            r3 = 8
            if (r6 == 0) goto L39
            r5.LJLIL = r6
            com.ss.android.ugc.aweme.feed.model.Video r0 = r6.getVideo()
            r5.P(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r4 = r6.getStatistics()
            boolean r0 = r5.LJLJLJ
            r1 = 2131369778(0x7f0a1f32, float:1.8359544E38)
            if (r0 == 0) goto L93
            android.view.View r0 = r5.itemView
            android.view.View r1 = r0.findViewById(r1)
            if (r1 != 0) goto L89
        L21:
            if (r4 == 0) goto L39
            android.view.View r1 = r5.itemView
            r0 = 2131369779(0x7f0a1f33, float:1.8359546E38)
            android.view.View r3 = r1.findViewById(r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            long r0 = r4.getPlayCount()
            java.lang.String r0 = X.C77123UOp.LJJIIJ(r0)
            r3.setText(r0)
        L39:
            android.view.View r1 = r5.itemView
            r0 = 2131369777(0x7f0a1f31, float:1.8359542E38)
            android.view.View r4 = r1.findViewById(r0)
            if (r4 != 0) goto L45
        L44:
            return
        L45:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r5.LJLIL
            if (r3 == 0) goto L86
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r0 = r3.getVideoMaskInfo()
            if (r0 == 0) goto L86
            java.lang.Boolean r1 = r0.getShowMask()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L86
            r1 = 0
            if (r3 == 0) goto L84
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r0 = r3.getVideoMaskInfo()
            if (r0 == 0) goto L84
            java.lang.String r0 = r0.getTitle()
        L68:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L86
            if (r3 == 0) goto L7a
            com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r0 = r3.getVideoMaskInfo()
            if (r0 == 0) goto L7a
            java.lang.String r1 = r0.getCancelMaskLabel()
        L7a:
            boolean r0 = X.C78685UuP.LJJJZ(r1)
            if (r0 == 0) goto L86
        L80:
            r4.setVisibility(r2)
            goto L44
        L84:
            r0 = r1
            goto L68
        L86:
            r2 = 8
            goto L80
        L89:
            if (r4 != 0) goto L91
            r0 = 8
        L8d:
            r1.setVisibility(r0)
            goto L21
        L91:
            r0 = 0
            goto L8d
        L93:
            android.view.View r0 = r5.itemView
            android.view.View r0 = r0.findViewById(r1)
            if (r0 != 0) goto L9c
            goto L39
        L9c:
            r0.setVisibility(r3)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GW.N(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0070, code lost:
    
        if (X.C48207Ivz.LIZ(r1) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(final com.ss.android.ugc.aweme.feed.model.Video r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8GW.P(com.ss.android.ugc.aweme.feed.model.Video):void");
    }

    public C8GW(final View view, String str, C8GY c8gy, boolean z) {
        new AbstractC208618Gr<Aweme>(view) { // from class: X.8Ga
        };
        this.LJLJJLL = str;
        this.LJLJL = c8gy;
        this.LJLJLJ = z;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.fd4);
        this.LJLILLLLZI = smartImageView;
        if (smartImageView != null) {
            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS23S0100000_3(this, 194));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SmartImageView smartImageView2 = this.LJLILLLLZI;
            if (smartImageView2 != null) {
                smartImageView2.setForeground(C04270Et.LIZIZ(view.getContext(), R.drawable.bm6));
            }
        } else {
            C7FA.LIZIZ(this.LJLILLLLZI);
        }
        View findViewById = view.findViewById(R.id.fd5);
        if (findViewById == null) {
            return;
        }
        findViewById.setVisibility(8);
    }
}
