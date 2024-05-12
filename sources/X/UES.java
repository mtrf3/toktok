package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import webcast.data.RealtimeViolationRecord;

/* loaded from: classes14.dex */
public final class UES extends UEU {
    public final LinearLayout LJLIL;
    public final C47121t6 LJLILLLLZI;
    public final LiveIconView LJLJI;
    public final C47121t6 LJLJJI;
    public final C47121t6 LJLJJL;
    public final C47121t6 LJLJJLL;
    public final C47121t6 LJLJL;
    public final /* synthetic */ UEQ LJLJLJ;

    @Override // X.UEU
    public final void M(long j) {
        this.LJLJJI.setText(C31012CFc.LJIIIZ(j));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UES(UEQ ueq, View view) {
        super(view);
        this.LJLJLJ = ueq;
        View findViewById = view.findViewById(R.id.ig3);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.punish_card_item_view)");
        this.LJLIL = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.kdr);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.start_time)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.bw8);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.countdown_icon)");
        this.LJLJI = (LiveIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.bwe);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.countdown_timer)");
        this.LJLJJI = (C47121t6) findViewById4;
        View findViewById5 = view.findViewById(R.id.title);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.title)");
        this.LJLJJL = (C47121t6) findViewById5;
        View findViewById6 = view.findViewById(R.id.ipa);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.reason)");
        this.LJLJJLL = (C47121t6) findViewById6;
        View findViewById7 = view.findViewById(R.id.ktn);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.suggestion)");
        this.LJLJL = (C47121t6) findViewById7;
    }

    @Override // X.UEU
    public final void L(UEU holder, RealtimeViolationRecord realtimeViolationRecord) {
        o.LJIIIZ(holder, "holder");
        this.LJLIL.setBackground(C04270Et.LIZIZ(this.LJLJLJ.LJLIL, R.drawable.cok));
        this.LJLJJI.setText("00:00");
        this.LJLJLJ.LJLJJI.remove(holder);
        this.LJLJLJ.getClass();
        UEQ.LJLZ(realtimeViolationRecord, holder, true);
    }
}
