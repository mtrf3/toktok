package X;

import Y.ACListenerS47S0200000_13;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76206TvW extends AbstractC76856UEi<C76034Tsk> {
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final /* synthetic */ C76205TvV LLIIIJ;

    @Override // X.InterfaceC76136TuO
    public final C47121t6 LJJ() {
        return null;
    }

    @Override // X.InterfaceC76136TuO
    public final ViewGroup LJJIII() {
        return null;
    }

    @Override // X.InterfaceC76136TuO
    public final C47121t6 LJJJJL() {
        return null;
    }

    @Override // X.InterfaceC75966Tre
    public final DataChannel LJIIL() {
        return this.LLIIIJ.LJ;
    }

    @Override // X.AbstractC76213Tvd
    public final void LJJJJIZL() {
        C76132TuK.LJLJJLL.getClass();
        C76132TuK.LJJIII(this);
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75963Trb LLJLLL() {
        return this.LLIIIJ.LIZLLL;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75964Trc o() {
        return this.LLIIIJ.LIZJ;
    }

    @Override // X.AbstractC76213Tvd
    public final void onViewDetachedFromWindow() {
        C76132TuK.LJLJJLL.getClass();
        C76132TuK.LJJIII(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76206TvW(C76205TvV c76205TvV, View view) {
        super(view);
        this.LLIIIJ = c76205TvV;
        this.LLFZ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 670));
        this.LLI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 673));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 672));
        this.LLII = C221108m2.LIZIZ(new AqS163S0100000_13(view, 674));
        this.LLIIII = C221108m2.LIZIZ(new AqS163S0100000_13(view, 671));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 675));
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C75981Trt data = (C75981Trt) obj;
        o.LJIIIZ(data, "data");
        C75953TrR.LJJ(this, data);
        C76132TuK.LJLJJLL.LJJIIJZLJL(this, data);
        Object value = this.LLFZ.getValue();
        o.LJIIIIZZ(value, "<get-bestTeammateBackGround>(...)");
        C15490jB.LJ((View) value, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_best_teammate_invite_background.png");
        Object value2 = this.LLI.getValue();
        o.LJIIIIZZ(value2, "<get-bestTeammateQuestionIcon>(...)");
        C15490jB.LJ((View) value2, CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_ic_best_teammate_question.png");
        Object value3 = this.LLFZ.getValue();
        o.LJIIIIZZ(value3, "<get-bestTeammateBackGround>(...)");
        ((ImageView) value3).setVisibility(0);
        Object value4 = this.LLI.getValue();
        o.LJIIIIZZ(value4, "<get-bestTeammateQuestionIcon>(...)");
        ((ImageView) value4).setVisibility(0);
        Object value5 = this.LLII.getValue();
        o.LJIIIIZZ(value5, "<get-bestTeammateTitle>(...)");
        ((View) value5).setVisibility(0);
        Object value6 = this.LLIIII.getValue();
        o.LJIIIIZZ(value6, "<get-bestTeammateDesc>(...)");
        ((View) value6).setVisibility(0);
        Object value7 = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value7, "<get-hotClickArea>(...)");
        ((View) value7).setVisibility(0);
        Object value8 = this.LLIFFJFJJ.getValue();
        o.LJIIIIZZ(value8, "<get-bestTeammateIcon>(...)");
        C76217Tvh c76217Tvh = (C76217Tvh) value8;
        if (c76217Tvh.getVisibility() != 0) {
            c76217Tvh.LIZIZ(16.0f);
            C29306Beo.LJJLJLI(c76217Tvh);
        }
        Object value9 = this.LLII.getValue();
        o.LJIIIIZZ(value9, "<get-bestTeammateTitle>(...)");
        ((TextView) value9).setText(C15380j0.LJIILJJIL(R.string.ol1));
        Object value10 = this.LLIIII.getValue();
        o.LJIIIIZZ(value10, "<get-bestTeammateDesc>(...)");
        ((TextView) value10).setText(C15380j0.LJIILJJIL(R.string.ol0));
        Object value11 = this.LLIIIILZ.getValue();
        o.LJIIIIZZ(value11, "<get-hotClickArea>(...)");
        C16880lQ.LJIL((ConstraintLayout) value11, new ACListenerS47S0200000_13(this.LLIIIJ, this, 54));
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C75981Trt data = (C75981Trt) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        C75953TrR.LJLJJLL.LJIJJ(this, data, i, payloads);
        C76132TuK.LJLJJLL.LJJIIZ(this, data, i, payloads);
    }
}
