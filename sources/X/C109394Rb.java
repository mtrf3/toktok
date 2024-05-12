package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C109394Rb extends AbstractC62595OhT implements InterfaceC113814dN {
    public final Activity LLFF;
    public RecyclerView LLFFF;
    public final C62822Ol8 LLFII;

    public final String LJ(Aweme aweme) {
        String string;
        o.LJIIIZ(aweme, "aweme");
        if (aweme.isSubOnlyVideo()) {
            return C207798Dn.LIZIZ(this.LJLJLJ, R.string.p8q, "mContext.resources.getSt…cribersInAppBanner_title)");
        }
        if (aweme.getStatus().getPrivateStatus() == 2) {
            return C207798Dn.LIZIZ(this.LJLJLJ, R.string.p8o, "mContext.resources.getSt…friendsInAppBanner_title)");
        }
        if (aweme.getStatus().getPrivateStatus() == 0) {
            if (HG3.LJIILL().getCurUser().isSecret()) {
                string = this.LJLJLJ.getResources().getString(R.string.p8n);
            } else {
                string = this.LJLJLJ.getResources().getString(R.string.p8m);
            }
            o.LJIIIIZZ(string, "if (AccountProxyService.…veryoneInAppBanner_title)");
            return string;
        }
        return C207798Dn.LIZIZ(this.LJLJLJ, R.string.p8m, "mContext.resources.getSt…veryoneInAppBanner_title)");
    }

    public final String LJFF(Aweme aweme) {
        String string;
        o.LJIIIZ(aweme, "aweme");
        if (aweme.isSubOnlyVideo()) {
            return C207798Dn.LIZIZ(this.LJLJLJ, R.string.p91, "mContext.resources.getSt…cribersInAppBanner_title)");
        }
        if (aweme.getStatus().getPrivateStatus() == 2) {
            return C207798Dn.LIZIZ(this.LJLJLJ, R.string.p90, "mContext.resources.getSt…friendsInAppBanner_title)");
        }
        if (aweme.getStatus().getPrivateStatus() == 0) {
            if (HG3.LJIILL().getCurUser().isSecret()) {
                string = this.LJLJLJ.getResources().getString(R.string.p8z);
            } else {
                string = this.LJLJLJ.getResources().getString(R.string.p8y);
            }
            o.LJIIIIZZ(string, "if (AccountProxyService.…veryoneInAppBanner_title)");
            return string;
        }
        return C207798Dn.LIZIZ(this.LJLJLJ, R.string.p8y, "mContext.resources.getSt…veryoneInAppBanner_title)");
    }

    @Override // X.InterfaceC113814dN
    public final void LJIIIZ(InterfaceC62225ObV channel, View view) {
        o.LJIIIZ(channel, "channel");
        this.LJZI.LJIIJ.extras.putString("enter_from", "publish_share_panel");
        this.LJZI.LJIIJ.extras.putString("enter_method", "publish_then_share");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C110824Wo(this, channel, view, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C109394Rb(ActivityC45651qj context, C62387Oe7 c62387Oe7, String[] strArr, Aweme aweme) {
        super(context, c62387Oe7, strArr);
        CharSequence text;
        CharSequence text2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        this.LLFF = context;
        C62387Oe7 c62387Oe72 = this.LJZI;
        if (c62387Oe72.LJFF) {
            ORS.LJJLIL(new AqS167S0100000_1(this, 193), c62387Oe72.LIZ);
        }
        RecyclerView recyclerView = (RecyclerView) this.LJLIL.findViewById(R.id.juz);
        this.LLFFF = recyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        if (C62417Oeb.LJ(aweme)) {
            TuxTextView tuxTextView = this.LJLJI;
            if (C4PN.LIZ()) {
                text2 = LJ(aweme);
            } else {
                text2 = this.LJLJLJ.getResources().getText(R.string.r3m);
            }
            tuxTextView.setText(text2);
        } else {
            TuxTextView tuxTextView2 = this.LJLJI;
            if (C4PN.LIZ()) {
                text = LJFF(aweme);
            } else {
                text = this.LJLJLJ.getResources().getText(R.string.jd4);
            }
            tuxTextView2.setText(text);
        }
        TuxTextView mShareDesc = this.LJLJI;
        o.LJIIIIZZ(mShareDesc, "mShareDesc");
        C26338AVi.LJI(mShareDesc, Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.a78)), 0, 0, 0, false, 16);
        if (!(this instanceof C4PO)) {
            C113854dR c113854dR = new C113854dR(context, this, !C4PQ.LIZIZ(), true, 0, 0, null, 112);
            this.LL.setVisibility(0);
            c113854dR.setData(this.LJZI.LIZ);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            RecyclerView recyclerView2 = this.LL;
            recyclerView2.setLayoutManager(linearLayoutManager);
            recyclerView2.setAdapter(c113854dR);
        } else {
            this.LL.setVisibility(8);
        }
        C62708OjI.LIZ(aweme, "ug_publish_popup_share_show", null);
        this.LLFII = C221108m2.LIZIZ(new AqS151S0100000_1(this, 716));
    }
}
