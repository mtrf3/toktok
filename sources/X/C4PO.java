package X;

import Y.AObserverS69S0100000_1;
import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4PO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PO extends C109394Rb implements InterfaceC83893Qz {
    public final Activity LLFZ;
    public final Aweme LLI;
    public final C4OT LLIFFJFJJ;
    public final CreateAwemeResponse LLII;
    public final C4PW LLIIII;
    public final SharePanelViewModel LLIIIILZ;

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    @Override // X.AbstractC62595OhT, X.InterfaceC44975Hkx
    public final void onDismiss() {
        super.onDismiss();
        C57082Lw.LIZ.LIZ("key_need_hide_pop_window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r1.equals(r0) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    @Override // X.InterfaceC83893Qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ks(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r14) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4PO.ks(java.util.List):void");
    }

    @Override // X.InterfaceC83893Qz
    public final boolean HY(IMContact contact, boolean z) {
        o.LJIIIZ(contact, "contact");
        C4OT c4ot = this.LLIFFJFJJ;
        if (c4ot != null) {
            BaseSharePackage baseSharePackage = this.LJZI.LJIIJ;
            o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            if (!c4ot.LJIIJ((SharePackage) baseSharePackage)) {
                return false;
            }
        }
        List LJJIJIL = C47261Igj.LJJIJIL(contact);
        this.LJZI.LJIIJ.extras.putBoolean("is_ad", this.LLI.isAd());
        BaseSharePackage baseSharePackage2 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C4KZ.LIZLLL((SharePackage) baseSharePackage2, contact, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        BaseSharePackage baseSharePackage3 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        SharePackage sharePackage = (SharePackage) baseSharePackage3;
        C4OT c4ot2 = this.LLIFFJFJJ;
        if (c4ot2 != null) {
            c4ot2.LIZ(sharePackage);
        }
        BaseSharePackage baseSharePackage4 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C87277YNd.LJJIJL((SharePackage) baseSharePackage4, LJJIJIL);
        BaseSharePackage baseSharePackage5 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C87277YNd.LJJIJIL((SharePackage) baseSharePackage5, contact);
        this.LJZI.LJIIJ.extras.putString("enter_method", "publish_then_share_icon");
        this.LJZI.LJIIJ.extras.putBoolean("sending_message_has_animation", false);
        BaseSharePackage baseSharePackage6 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C101243yC.LIZIZ((SharePackage) baseSharePackage6, LJJIJIL, this.LLIFFJFJJ, EnumC84133Rx.RECENT_SHARED);
        onDismiss();
        return false;
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
        this.LJLIL.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4PO(ActivityC45651qj context, C62387Oe7 c62387Oe7, String[] strArr, Aweme aweme, C4RA c4ra, CreateAwemeResponse createAwemeResponse) {
        super(context, c62387Oe7, strArr, aweme);
        CharSequence text;
        CharSequence text2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        this.LLFZ = context;
        this.LLI = aweme;
        this.LLIFFJFJJ = c4ra;
        this.LLII = createAwemeResponse;
        BaseSharePackage baseSharePackage = c62387Oe7.LJIIJ;
        o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        SharePackage sharePackage = (SharePackage) baseSharePackage;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        EnumC84123Rw enumC84123Rw = EnumC84123Rw.NORMAL;
        EnumC84133Rx enumC84133Rx = EnumC84133Rx.RECENT_SHARED;
        C3WF.LIZ.getClass();
        SharePanelViewModel LIZ = C3WG.LIZ(sharePackage, this, c61878OQg, enumC84123Rw, 0, enumC84133Rx, false, C3WF.LIZ() != enumC84133Rx, false, false, null, C57434MgQ.LIZIZ(context), 7696);
        this.LLIIIILZ = LIZ;
        C4PW c4pw = new C4PW(context, this, LIZ);
        this.LLIIII = c4pw;
        C62846OlW c62846OlW = this.LJLILLLLZI;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(8);
        }
        this.LJLIL.setVisibility(8);
        this.LJZI.LJIIJ.extras.putString("enter_method", "publish_then_share");
        this.LJZI.LJIIJ.extras.putString("enter_from", "publish_share_panel");
        Z89 z89 = Z89.LIZIZ;
        if (z89.LIZIZ(aweme)) {
            this.LJLJI.setText(this.LJLJLJ.getResources().getText(R.string.j4x));
        } else if (C62417Oeb.LJ(aweme)) {
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
        this.LJZI.LJIIJ.extras.putString("enter_from", "publish_share_panel");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.a7p);
        LinearLayout llBg = this.LJLLLLLL;
        o.LJIIIIZZ(llBg, "llBg");
        C26338AVi.LJI(llBg, Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), Integer.valueOf(dimensionPixelOffset), false, 16);
        C16300kU.LJIILLIIL(this.LJLLLLLL, C04270Et.LIZIZ(context, R.drawable.c4w));
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.a7o);
        LinearLayout llBg2 = this.LJLLLLLL;
        o.LJIIIIZZ(llBg2, "llBg");
        C26338AVi.LJIIIZ(llBg2, 0, Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.a78)), 0, Integer.valueOf(dimensionPixelOffset2), 16);
        View publishContentView = this.LJLJJL;
        o.LJIIIIZZ(publishContentView, "publishContentView");
        C26338AVi.LJIIIZ(publishContentView, 0, 0, 0, 0, 16);
        TuxTextView mShareDesc = this.LJLJI;
        o.LJIIIIZZ(mShareDesc, "mShareDesc");
        C26338AVi.LJI(mShareDesc, Integer.valueOf(context.getResources().getDimensionPixelOffset(R.dimen.a7l)), 0, 0, 0, false, 16);
        if (z89.LIZIZ(aweme) && (C4PR.LIZ() || aweme.isPrivate())) {
            C4PS.LIZ.getClass();
            if (C4PS.LIZ()) {
                this.LJLJJLL.setVisibility(8);
                if (!Keva.getRepo("keva_share_repo").getBoolean("key_has_shown_under_18_tip", false)) {
                    this.LJLJJLL.setText(context.getString(R.string.t3e));
                    this.LJLJJLL.setVisibility(0);
                    Keva.getRepo("keva_share_repo").storeBoolean("key_has_shown_under_18_tip", true);
                    LinearLayout llBg3 = this.LJLLLLLL;
                    o.LJIIIIZZ(llBg3, "llBg");
                    llBg3.setPadding(llBg3.getPaddingLeft(), llBg3.getPaddingTop(), llBg3.getPaddingRight(), 0);
                }
            }
        }
        if (z89.LIZIZ(aweme) && MWX.LIZIZ.LIZJ()) {
            this.LJLILLLLZI.getLayoutParams().width = C7MY.LIZIZ(48);
            this.LJLILLLLZI.getLayoutParams().height = C7MY.LIZIZ(64);
            C62846OlW mImage = this.LJLILLLLZI;
            o.LJIIIIZZ(mImage, "mImage");
            C26338AVi.LJI(mImage, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), null, AnonymousClass391.LIZJ(8), null, false, 26);
            TuxTextView mShareDesc2 = this.LJLJI;
            o.LJIIIIZZ(mShareDesc2, "mShareDesc");
            C26338AVi.LJI(mShareDesc2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), null, null, null, false, 30);
            LinearLayout llBg4 = this.LJLLLLLL;
            o.LJIIIIZZ(llBg4, "llBg");
            C26338AVi.LJIIIZ(llBg4, null, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 23);
        }
        List<InterfaceC62225ObV> list = this.LJZI.LIZ;
        ArrayList LJ = AnonymousClass391.LJ(list, "channels");
        for (InterfaceC62225ObV interfaceC62225ObV : list) {
            if (!o.LJ("chat_merge", interfaceC62225ObV.key())) {
                LJ.add(interfaceC62225ObV);
            }
        }
        c4pw.LJZL().setData(LJ);
        c4pw.notifyDataSetChanged();
        this.LLIIIILZ.LJIILIIL();
        RecyclerView recyclerView = this.LLFFF;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LLIIII);
            recyclerView.setVisibility(0);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        }
        C57082Lw.LIZ.LIZIZ("key_need_hide_pop_window").observeForever(new AObserverS69S0100000_1(this, 63));
        try {
            if (Z89.LIZIZ.LIZIZ(this.LLI)) {
                new C61996OUu(this.LLFZ).LIZ(0);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
