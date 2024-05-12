package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TvP, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76199TvP extends AbstractC76213Tvd<C75984Trw> implements InterfaceC75959TrX {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public EnumC76210Tva LJZ;
    public EnumC75958TrW LJZI;
    public final /* synthetic */ C76200TvQ LJZL;

    @Override // X.InterfaceC75959TrX
    public final C2A7 LIZIZ() {
        return (C2A7) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC75966Tre
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC75966Tre
    public final DataChannel LJIIL() {
        return this.LJZL.LJFF;
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75963Trb LLJLLL() {
        return this.LJZL.LIZLLL;
    }

    public final C47121t6 N() {
        return (C47121t6) this.LJLL.getValue();
    }

    public final C47121t6 P() {
        return (C47121t6) this.LJLLLLLL.getValue();
    }

    public final C2A7 Q() {
        return (C2A7) this.LJLLILLLL.getValue();
    }

    @Override // X.InterfaceC75959TrX
    public final InterfaceC75964Trc o() {
        return this.LJZL.LIZJ;
    }

    @Override // X.InterfaceC75959TrX
    public final EnumC75958TrW LLLLL() {
        return this.LJZI;
    }

    @Override // X.InterfaceC75959TrX
    public final void LJJJLZIJ(EnumC75958TrW state) {
        o.LJIIIZ(state, "state");
        this.LJZI = state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76199TvP(C76200TvQ c76200TvQ, View view) {
        super(view);
        this.LJZL = c76200TvQ;
        this.LJLIL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 689));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 688));
        this.LJLJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 682));
        this.LJLJJI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 693));
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 691));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 678));
        this.LJLJL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 677));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 692));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 687));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 679));
        this.LJLLI = C221108m2.LIZIZ(new AqS163S0100000_13(view, 683));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 690));
        this.LJLLJ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 680));
        this.LJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 686));
        this.LJLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 685));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS163S0100000_13(view, 684));
        this.LJLZ = C221108m2.LIZIZ(new AqS163S0100000_13(view, 681));
        this.LJZ = EnumC76210Tva.UNKNOWN;
        this.LJZI = EnumC75958TrW.NORMAL;
    }

    public static void U(C76199TvP c76199TvP, C75984Trw c75984Trw) {
        C29306Beo.LJJLJLI((View) c76199TvP.LJLJI.getValue());
        int userCount = c75984Trw.LJLIL.getUserCount();
        String LIZ = C76099Ttn.LIZ(c75984Trw.LJLIL.getStatus());
        if (userCount == 0) {
            ImageView imageView = (ImageView) c76199TvP.LJLJJLL.getValue();
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (C29306Beo.LJIJJLI(LIZ)) {
                TextView textView = (TextView) c76199TvP.LJLJL.getValue();
                if (textView == null) {
                    return;
                }
                textView.setText(LIZ);
                return;
            }
            View view = (View) c76199TvP.LJLJL.getValue();
            if (view == null) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        C29306Beo.LJJLJLI((View) c76199TvP.LJLJJLL.getValue());
        String LJIIL = b.LJIIL(userCount);
        if (C29306Beo.LJIJJLI(LIZ)) {
            TextView textView2 = (TextView) c76199TvP.LJLJL.getValue();
            if (textView2 == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(LJIIL);
            sb.append(" ");
            sb.append(C15380j0.LJIILJJIL(R.string.t1a));
            sb.append(" ");
            sb.append(LIZ);
            textView2.setText(sb);
            return;
        }
        TextView textView3 = (TextView) c76199TvP.LJLJL.getValue();
        if (textView3 == null) {
            return;
        }
        textView3.setText(LJIIL);
    }

    @Override // X.AbstractC76213Tvd
    public final void L(int i, Object obj) {
        C75984Trw data = (C75984Trw) obj;
        o.LJIIIZ(data, "data");
        T(this, data, i, false);
    }

    @Override // X.AbstractC76213Tvd
    public final void M(int i, Object obj, List payloads) {
        C75984Trw data = (C75984Trw) obj;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(payloads, "payloads");
        T(this, data, i, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(X.C76199TvP r14, X.C75984Trw r15, int r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76199TvP.T(X.TvP, X.Trw, int, boolean):void");
    }
}
