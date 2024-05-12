package X;

import Y.ACListenerS34S0400000_13;
import Y.ACListenerS47S0200000_13;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.data.AppealInfo;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public final class UER extends UEU {
    public final C47121t6 LJLIL;
    public final LiveIconView LJLILLLLZI;
    public final C47121t6 LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C47121t6 LJLJJLL;
    public final /* synthetic */ UEQ LJLJL;

    @Override // X.UEU
    public final void M(long j) {
        this.LJLJI.setText(C31012CFc.LJIIIZ(j));
    }

    public final void N(RealtimeViolationRecord realtimeViolationRecord) {
        AppealInfo appealInfo;
        int i;
        int i2;
        Drawable drawable = null;
        if (realtimeViolationRecord != null && (appealInfo = realtimeViolationRecord.appealInfo) != null && appealInfo.showAppeal) {
            C29306Beo.LJJLJLI(this.LJLJJLL);
            C47121t6 c47121t6 = this.LJLJJLL;
            int i3 = appealInfo.appealStatus;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        i = R.string.o6q;
                    } else {
                        i = R.string.o6r;
                    }
                } else {
                    i = R.string.o6u;
                }
            } else {
                i = R.string.o6s;
            }
            c47121t6.setText(i);
            C47121t6 c47121t62 = this.LJLJJLL;
            int i4 = appealInfo.appealStatus;
            int i5 = R.color.acm;
            if (i4 != 0) {
                if (i4 != 1) {
                    i2 = R.color.a3j;
                } else {
                    i2 = R.color.abg;
                }
            } else {
                i2 = R.color.acm;
            }
            C87277YNd.LJJIIJZLJL(c47121t62, i2);
            C47121t6 c47121t63 = this.LJLJJLL;
            int i6 = appealInfo.appealStatus;
            if (i6 != 0) {
                if (i6 == 1) {
                    drawable = C15380j0.LJI(R.drawable.caj);
                }
            } else {
                drawable = C15380j0.LJI(R.drawable.cai);
            }
            c47121t63.setBackground(drawable);
            C47121t6 c47121t64 = this.LJLJJLL;
            if (appealInfo.appealStatus != 0) {
                i5 = R.color.abg;
            }
            C87277YNd.LJJIIJZLJL(c47121t64, i5);
            C16880lQ.LJJIIZ(this.LJLJJLL, new ACListenerS34S0400000_13(realtimeViolationRecord, this.LJLJL, appealInfo, this, 1));
            return;
        }
        C29306Beo.LJI(this.LJLJJLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UER(UEQ ueq, View view) {
        super(view);
        this.LJLJL = ueq;
        View findViewById = view.findViewById(R.id.kdr);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.start_time)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.ngz);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.warning_icon)");
        this.LJLILLLLZI = (LiveIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bwe);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.countdown_timer)");
        this.LJLJI = (C47121t6) findViewById3;
        View findViewById4 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.title)");
        this.LJLJJI = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.ipa);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.reason)");
        this.LJLJJL = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.a6t);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.appeal_view)");
        this.LJLJJLL = (C47121t6) findViewById6;
    }

    @Override // X.UEU
    public final void L(UEU holder, RealtimeViolationRecord realtimeViolationRecord) {
        o.LJIIIZ(holder, "holder");
        C16880lQ.LJJIIZ(this.LJLJJLL, new ACListenerS47S0200000_13(realtimeViolationRecord, this.LJLJL, 39));
        realtimeViolationRecord.status = 1;
        this.itemView.setBackground(C04270Et.LIZIZ(this.LJLJL.LJLIL, R.drawable.cok));
        C87277YNd.LJJIIJZLJL(this.LJLJI, R.color.a3j);
        this.LJLJI.setText(R.string.o6w);
        this.LJLJL.LJLJJI.remove(holder);
        this.LJLILLLLZI.setIconTint(C15380j0.LIZIZ(R.color.a3j));
        this.LJLJL.getClass();
        UEQ.LJLZ(realtimeViolationRecord, holder, true);
    }
}
