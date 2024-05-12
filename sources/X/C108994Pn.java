package X;

import Y.ACListenerS21S0100000_1;
import Y.AObserverS65S0200000_1;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Pn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108994Pn extends RecyclerView.ViewHolder implements C4QS {
    public static final int LJLZ = EF7.LIZIZ().getResources().getDimensionPixelSize(R.dimen.vc);
    public SharePanelViewModel LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;
    public final TextView LJLJJI;
    public final SmartAvatarImageView LJLJJL;
    public final C71897SJp LJLJJLL;
    public IMContact LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final int LJLLI;
    public final C119354mJ LJLLILLLL;
    public final C109044Ps LJLLJ;
    public AObserverS65S0200000_1 LJLLL;
    public C107724Kq LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    public final void L() {
        IMContact iMContact = this.LJLJL;
        boolean z = false;
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            Q(iMUser.isOnline());
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C112244aq.LIZ(itemView, iMUser.getUid(), Boolean.valueOf(iMUser.isOnline()));
            C107724Kq c107724Kq = this.LJLLLL;
            if (c107724Kq != null) {
                if (AV1.LJIJI(iMUser.getUid()) || iMUser.isOnline()) {
                    z = true;
                }
                c107724Kq.LJI = Boolean.valueOf(z);
                return;
            }
            return;
        }
        if (iMContact instanceof IMConversation) {
            Q(false);
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            itemView2.setTag(R.id.eg1, null);
            return;
        }
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        itemView3.setTag(R.id.eg1, null);
    }

    @Override // X.C4QS
    public final void onAttachedToWindow() {
        IMContact iMContact = this.LJLJL;
        if (iMContact != null) {
            C107234It.LJIIIIZZ(iMContact, this.LJLJLJ, "row", this.LJLIL.LJLIL, false);
        }
        C78949Uyf.LJJJ(this, this.LJLJL, this.LJLLLL, 0);
    }

    @Override // X.C4QS
    public final void onDetachedFromWindow() {
        C108964Pk c108964Pk;
        C109044Ps c109044Ps = this.LJLLJ;
        if (c109044Ps != null && (c108964Pk = c109044Ps.LJIIJ.LJFF) != null) {
            RunnableC108944Pi runnableC108944Pi = c108964Pk.LIZLLL;
            if (runnableC108944Pi != null) {
                c108964Pk.LIZJ.removeCallbacks(runnableC108944Pi);
            }
            c108964Pk.LIZLLL = null;
        }
        ((InterfaceC1040946r) this.LJLLLLLL.getValue()).LIZIZ();
    }

    public final void M(IMConversation iMConversation) {
        CharSequence charSequence;
        TextView textView = this.LJLJJI;
        String displayName = iMConversation.getDisplayName();
        if (displayName == null || displayName.length() == 0) {
            charSequence = "";
        } else {
            String it = iMConversation.getDisplayName();
            o.LJIIIIZZ(it, "it");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C45804HyK.LJJLJ(it));
            TextPaint paint = this.LJLJJI.getPaint();
            o.LJIIIIZZ(paint, "nameTv.paint");
            charSequence = C4SF.LIZ(spannableStringBuilder, paint, this.LJLILLLLZI, this.LJLJJI.getMaxLines());
        }
        textView.setText(charSequence);
    }

    public final void N(IMContact contact) {
        boolean z;
        float f;
        o.LJIIIZ(contact, "contact");
        boolean contains = this.LJLIL.LJIIIIZZ().contains(contact);
        T(contains);
        boolean z2 = false;
        if (!this.LJLIL.LLD || ((contact instanceof IMUser) && IMUser.isFriend(((IMUser) contact).getFollowStatus()))) {
            z = false;
        } else {
            z = true;
        }
        if (this.LJLIL.LLFF || z) {
            z2 = true;
        }
        this.LJLL = z2;
        if (!contains) {
            if (z) {
                this.LJLL = true;
            }
            SmartAvatarImageView smartAvatarImageView = this.LJLJJL;
            if (z) {
                f = 0.34f;
            } else {
                f = 1.0f;
            }
            smartAvatarImageView.setAlpha(f);
            boolean z3 = this.LJLJL instanceof IMUser;
            if (!z) {
                return;
            }
        }
        this.LJLJJL.setAlpha(0.34f);
    }

    public final void P(IMUser iMUser) {
        boolean z;
        CharSequence LIZ;
        TextView textView = this.LJLJJI;
        String displayName = iMUser.getDisplayName();
        boolean z2 = true;
        if (displayName == null || displayName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZ = "";
        } else {
            String it = iMUser.getDisplayName();
            o.LJIIIIZZ(it, "it");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C45804HyK.LJJLJ(it));
            TextPaint paint = this.LJLJJI.getPaint();
            o.LJIIIIZZ(paint, "nameTv.paint");
            LIZ = C4SF.LIZ(spannableStringBuilder, paint, this.LJLILLLLZI, this.LJLJJI.getMaxLines());
        }
        textView.setText(LIZ);
        String LJJJJZ = ujb.o.LJJJJZ(this.LJLJJI.getText().toString(), "\n", "", false);
        if (o.LJ(iMUser.getDisplayName(), LJJJJZ) || !ujb.o.LJJJJ(LJJJJZ, "...", false)) {
            z2 = false;
        }
        Context context = this.LJLJJI.getContext();
        String customVerify = iMUser.getCustomVerify();
        String enterpriseVerifyReason = iMUser.getEnterpriseVerifyReason();
        TextView textView2 = this.LJLJJI;
        if (context == null || textView2 == null || !AJ9.LIZJ(customVerify, enterpriseVerifyReason)) {
            return;
        }
        AJ9.LJFF(context, textView2, z2);
    }

    public final void Q(boolean z) {
        if (z && this.LJLJI) {
            this.LJLLILLLL.setActive(true);
            this.LJLLILLLL.setVisibility(0);
            this.LJLLILLLL.LIZ(R.attr.cr);
            return;
        }
        this.LJLLILLLL.setVisibility(8);
    }

    public final void T(boolean z) {
        int i;
        float f;
        this.LJLJLLL = z;
        this.LJLJJLL.setSelected(z);
        this.LJLJJLL.setChecked(z);
        C71897SJp c71897SJp = this.LJLJJLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        c71897SJp.setVisibility(i);
        SmartAvatarImageView smartAvatarImageView = this.LJLJJL;
        if (z) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        smartAvatarImageView.setAlpha(f);
        if (z) {
            Q(false);
        } else {
            L();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108994Pn(View view, SharePanelViewModel viewModel, boolean z, int i, boolean z2, boolean z3, int i2, boolean z4, int i3) {
        super(view);
        String str;
        Bundle bundle;
        TuxIconView tuxIconView;
        int i4;
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
        this.LJLILLLLZI = i;
        this.LJLJI = z4;
        this.LJLJLJ = -1;
        this.LJLLI = 2;
        view.getLayoutParams().width = i;
        View findViewById = view.findViewById(R.id.gw7);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.name_tv)");
        TextView textView = (TextView) findViewById;
        this.LJLJJI = textView;
        textView.setImportantForAccessibility(2);
        View findViewById2 = view.findViewById(R.id.acf);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.avatar_iv)");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById2;
        this.LJLJJL = smartAvatarImageView;
        smartAvatarImageView.setImportantForAccessibility(2);
        View findViewById3 = view.findViewById(R.id.e2j);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.has_selected_fl)");
        C71897SJp c71897SJp = (C71897SJp) findViewById3;
        this.LJLJJLL = c71897SJp;
        c71897SJp.setImportantForAccessibility(2);
        View findViewById4 = view.findViewById(R.id.pq);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.activity_status_view)");
        this.LJLLILLLL = (C119354mJ) findViewById4;
        C105004Ae.LIZIZ();
        if (z) {
            view.getLayoutParams().width = C7MY.LIZIZ(62);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = C7MY.LIZIZ(8);
            textView.setLayoutParams(layoutParams2);
        }
        if (z2) {
            int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R.dimen.v0);
            smartAvatarImageView.getLayoutParams().height = dimensionPixelOffset;
            smartAvatarImageView.getLayoutParams().width = dimensionPixelOffset;
        }
        this.LJLLI = i2;
        textView.setMaxLines(i2);
        Context context = textView.getContext();
        o.LJIIIIZZ(context, "nameTv.context");
        Integer LJI = C79045V0n.LJI(i3, context);
        if (LJI != null) {
            textView.setTextColor(LJI.intValue());
        }
        if (z3 && (tuxIconView = (TuxIconView) view.findViewById(R.id.ce6)) != null) {
            if (z2) {
                i4 = 22;
            } else {
                i4 = 24;
            }
            float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(i4));
            int i5 = (int) LJIIZILJ;
            tuxIconView.getLayoutParams().width = i5;
            tuxIconView.getLayoutParams().height = i5;
            tuxIconView.setVisibility(0);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_paperplane_fill;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            int LIZIZ = C7MY.LIZIZ(11);
            c2068389v.LIZIZ = LIZIZ;
            c2068389v.LIZJ = LIZIZ;
            tuxIconView.setTuxIcon(c2068389v);
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.eb);
            c110614Vt.LIZJ = Float.valueOf(LJIIZILJ);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(3);
            c110614Vt.LJFF = Integer.valueOf(R.attr.dj);
            Context context2 = tuxIconView.getContext();
            o.LJIIIIZZ(context2, "context");
            tuxIconView.setBackground(c110614Vt.LIZ(context2));
        }
        AqS167S0100000_1 aqS167S0100000_1 = new AqS167S0100000_1(this, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS21S0100000_1(aqS167S0100000_1, 271));
        C16880lQ.LJIJI(textView, new ACListenerS21S0100000_1(aqS167S0100000_1, 271));
        C16880lQ.LJJJI(c71897SJp, new ACListenerS21S0100000_1(aqS167S0100000_1, 271));
        SharePackage sharePackage = this.LJLIL.LJLIL;
        if (sharePackage != null && (bundle = sharePackage.extras) != null) {
            str = bundle.getString("panel_source");
        } else {
            str = null;
        }
        int LIZIZ2 = C4P2.LIZIZ(str);
        if (z && C109254Qn.LIZIZ(this.LJLIL.LJLIL)) {
            if (LIZIZ2 == 1) {
                Context context3 = view.getContext();
                o.LJIIIIZZ(context3, "itemView.context");
                this.LJLLJ = new C109044Ps(context3, this.LJLIL);
            }
            C109044Ps c109044Ps = this.LJLLJ;
            if (c109044Ps != null) {
                c109044Ps.LIZLLL((ViewGroup) view);
            }
        }
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1046));
    }
}
