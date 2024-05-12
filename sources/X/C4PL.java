package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4PL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4PL extends C109394Rb implements InterfaceC83893Qz {
    public final Activity LLFZ;
    public final Aweme LLI;
    public final C4OT LLIFFJFJJ;
    public C4PX LLII;
    public float LLIIII;
    public float LLIIIILZ;
    public float LLIIIJ;
    public int LLIIIL;

    @Override // X.InterfaceC83893Qz
    public final void Ql(int i, int i2, boolean z) {
    }

    @Override // X.InterfaceC83893Qz
    public final void nG(IMContact iMContact) {
    }

    @Override // X.InterfaceC83893Qz
    public final void sz(long j, boolean z, int i, boolean z2, int i2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r1.equals(r0) != false) goto L16;
     */
    @Override // X.InterfaceC83893Qz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ks(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "list"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            int r1 = r5.size()
            r2 = 0
            r0 = 4
            if (r1 <= r0) goto L11
            java.util.List r5 = r5.subList(r2, r0)
        L11:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onLoadComplete: "
            r1.append(r0)
            int r0 = r5.size()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ShareSuccessPopWindow"
            X.C34B.LJI(r0, r1)
            boolean r0 = r5.isEmpty()
            r3 = 0
            if (r0 != 0) goto L58
            int r1 = r5.size()
            r0 = 1
            if (r1 != r0) goto L6a
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r2)
            com.ss.android.ugc.aweme.im.service.model.IMContact r1 = (com.ss.android.ugc.aweme.im.service.model.IMContact) r1
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.im.service.model.IMUser
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = (com.ss.android.ugc.aweme.im.service.model.IMUser) r1
            java.lang.String r1 = r1.getUid()
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C80763Ey.LIZJ()
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.getUid()
        L52:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
        L58:
            androidx.recyclerview.widget.RecyclerView r1 = r4.LLFFF
            if (r1 != 0) goto L62
        L5c:
            android.view.View r0 = r4.LJLIL
            r0.setVisibility(r2)
            return
        L62:
            r0 = 8
            r1.setVisibility(r0)
            goto L5c
        L68:
            r0 = r3
            goto L52
        L6a:
            com.ss.android.ugc.aweme.im.service.IIMUnder16Proxy r0 = X.C78966Uyw.LJJIJ()
            boolean r0 = r0.LIZIZ()
            if (r0 != 0) goto L58
            androidx.recyclerview.widget.RecyclerView r0 = r4.LLFFF
            if (r0 != 0) goto L80
        L78:
            X.4PX r0 = r4.LLII
            if (r0 == 0) goto L5c
            r0.LJZ(r3, r3, r5)
            goto L5c
        L80:
            r0.setVisibility(r2)
            goto L78
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4PL.ks(java.util.List):void");
    }

    @Override // X.InterfaceC83893Qz
    public final boolean HY(IMContact contact, boolean z) {
        C4PL c4pl;
        o.LJIIIZ(contact, "contact");
        if (contact instanceof C108724Om) {
            c4pl = this;
        } else {
            c4pl = null;
        }
        if (c4pl != null) {
            C4NQ c4nq = new C4NQ() { // from class: X.4OY
                @Override // X.C4NQ
                public final void LJI() {
                }

                @Override // X.C4NQ
                public final void LIZ(SharePackage sharePackage) {
                    o.LJIIIZ(sharePackage, "sharePackage");
                    C4OT c4ot = C4PL.this.LLIFFJFJJ;
                    if (c4ot != null) {
                        c4ot.LIZ(sharePackage);
                    }
                }

                @Override // X.C4NQ
                public final void LIZIZ(SharePackage sharePackage) {
                    o.LJIIIZ(sharePackage, "sharePackage");
                    C4OT c4ot = C4PL.this.LLIFFJFJJ;
                    if (c4ot != null) {
                        c4ot.LIZIZ(sharePackage);
                    }
                }

                @Override // X.C4NQ
                public final void LIZJ(SharePackage sharePackage) {
                    o.LJIIIZ(sharePackage, "sharePackage");
                    C4OT c4ot = C4PL.this.LLIFFJFJJ;
                    if (c4ot != null) {
                        c4ot.LJIIIIZZ(sharePackage);
                    }
                }

                @Override // X.C4NQ
                public final void LJFF(SharePackage sharePackage) {
                    o.LJIIIZ(sharePackage, "sharePackage");
                }

                @Override // X.C4NQ
                public final void LIZLLL(Dialog dialog, SharePackage sharePackage) {
                    C108624Oc.LIZ(dialog, sharePackage);
                }

                @Override // X.C4NQ
                public final void LJ(Dialog dialog, SharePackage sharePackage) {
                    C108624Oc.LIZIZ(dialog, sharePackage);
                }
            };
            this.LJZI.LJIIJ.extras.putBoolean("sending_message_has_animation", false);
            Activity activity = this.LLFZ;
            BaseSharePackage baseSharePackage = this.LJZI.LJIIJ;
            o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            C16880lQ.LIZ(C4NK.LIZ(activity, (SharePackage) baseSharePackage, null, OQY.INSTANCE, true, c4nq, false, null, false, null, false, 4036));
            BaseSharePackage baseSharePackage2 = this.LJZI.LJIIJ;
            o.LJII(baseSharePackage2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            C4KZ.LIZLLL((SharePackage) baseSharePackage2, null, true, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
            onDismiss();
            return false;
        }
        C4OT c4ot = this.LLIFFJFJJ;
        if (c4ot != null) {
            BaseSharePackage baseSharePackage3 = this.LJZI.LJIIJ;
            o.LJII(baseSharePackage3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            if (!c4ot.LJIIJ((SharePackage) baseSharePackage3)) {
                return false;
            }
        }
        List LJJIJIL = C47261Igj.LJJIJIL(contact);
        this.LJZI.LJIIJ.extras.putBoolean("is_ad", this.LLI.isAd());
        BaseSharePackage baseSharePackage4 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C4KZ.LIZLLL((SharePackage) baseSharePackage4, contact, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        BaseSharePackage baseSharePackage5 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        SharePackage sharePackage = (SharePackage) baseSharePackage5;
        C4OT c4ot2 = this.LLIFFJFJJ;
        if (c4ot2 != null) {
            c4ot2.LIZ(sharePackage);
        }
        BaseSharePackage baseSharePackage6 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C87277YNd.LJJIJL((SharePackage) baseSharePackage6, LJJIJIL);
        BaseSharePackage baseSharePackage7 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C87277YNd.LJJIJIL((SharePackage) baseSharePackage7, contact);
        this.LJZI.LJIIJ.extras.putBoolean("sending_message_has_animation", false);
        this.LJZI.LJIIJ.extras.putString("enter_method", "publish_then_share_icon");
        BaseSharePackage baseSharePackage8 = this.LJZI.LJIIJ;
        o.LJII(baseSharePackage8, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
        C101243yC.LIZIZ((SharePackage) baseSharePackage8, LJJIJIL, this.LLIFFJFJJ, EnumC84133Rx.RECENT_SENT);
        onDismiss();
        return false;
    }

    @Override // X.InterfaceC83893Qz
    public final void xN(Throwable e, List list) {
        o.LJIIIZ(list, "list");
        o.LJIIIZ(e, "e");
        RecyclerView recyclerView = this.LLFFF;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        this.LJLIL.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4PL(ActivityC45651qj context, C62387Oe7 c62387Oe7, String[] strArr, Aweme aweme, C4RA c4ra) {
        super(context, c62387Oe7, strArr, aweme);
        int dimensionPixelOffset;
        float LIZJ;
        CharSequence text;
        boolean z;
        CharSequence text2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        this.LLFZ = context;
        this.LLI = aweme;
        this.LLIFFJFJJ = c4ra;
        int LJIIJJI = KL2.LJIIJJI(context);
        this.LLIIIL = context.getResources().getDimensionPixelOffset(R.dimen.a78);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.a79);
        float f = C4PX.LJZI;
        if (!C4PQ.LIZIZ()) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.t3);
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.v0);
        }
        float f2 = dimensionPixelOffset;
        this.LLIIII = (f - f2) / 2;
        float f3 = LJIIJJI;
        if (f3 < KL2.LIZJ(context, 375.0f)) {
            LIZJ = KL2.LIZJ(context, 6.0f);
        } else if (f3 > KL2.LIZJ(context, 428.0f)) {
            LIZJ = KL2.LIZJ(context, 13.0f);
        } else {
            LIZJ = (((0.5f * f2) + (((f3 - (this.LLIIIL * 3.0f)) - KL2.LIZJ(context, 10.0f)) - (1.5f * f))) - (4 * f)) / 5;
        }
        this.LLIIIJ = LIZJ;
        this.LLIIIILZ = ((f + LIZJ) - f2) - dimensionPixelOffset2;
        C62846OlW c62846OlW = this.LJLILLLLZI;
        if (c62846OlW != null) {
            c62846OlW.setVisibility(8);
        }
        this.LJZI.LJIIJ.extras.putString("enter_method", "publish_then_share");
        this.LJZI.LJIIJ.extras.putString("enter_from", "publish_share_panel");
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
        View publishContentView = this.LJLJJL;
        o.LJIIIIZZ(publishContentView, "publishContentView");
        C26338AVi.LJIIIZ(publishContentView, 0, 0, 0, 0, 16);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R.dimen.a7p);
        LinearLayout llBg = this.LJLLLLLL;
        o.LJIIIIZZ(llBg, "llBg");
        C26338AVi.LJI(llBg, Integer.valueOf(dimensionPixelOffset3), Integer.valueOf(dimensionPixelOffset3), Integer.valueOf(dimensionPixelOffset3), Integer.valueOf(dimensionPixelOffset3), false, 16);
        this.LL.LJII(new C4OL((int) this.LLIIII, (int) this.LLIIIILZ, 0), -1);
        C16300kU.LJIILLIIL(this.LJLLLLLL, C04270Et.LIZIZ(context, R.drawable.c4u));
        if (C4PQ.LIZIZ()) {
            int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R.dimen.a7l);
            LinearLayout llBg2 = this.LJLLLLLL;
            o.LJIIIIZZ(llBg2, "llBg");
            C26338AVi.LJIIIZ(llBg2, 0, Integer.valueOf(dimensionPixelOffset4), 0, Integer.valueOf(dimensionPixelOffset4), 16);
            TuxTextView mShareDesc = this.LJLJI;
            o.LJIIIIZZ(mShareDesc, "mShareDesc");
            C26338AVi.LJI(mShareDesc, Integer.valueOf((int) KL2.LIZJ(this.LJLJLJ, 20.0f)), 0, 0, 0, false, 16);
        } else {
            TuxTextView mShareDesc2 = this.LJLJI;
            o.LJIIIIZZ(mShareDesc2, "mShareDesc");
            C26338AVi.LJI(mShareDesc2, Integer.valueOf((int) KL2.LIZJ(this.LJLJLJ, 22.0f)), 0, 0, 0, false, 16);
        }
        if (!C78966Uyw.LJJIJ().LIZIZ()) {
            this.LJLIL.setVisibility(8);
            BaseSharePackage baseSharePackage = this.LJZI.LJIIJ;
            o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
            SharePackage sharePackage = (SharePackage) baseSharePackage;
            C61878OQg c61878OQg = C61878OQg.INSTANCE;
            C3WF.LIZ.getClass();
            EnumC84133Rx LIZ = C3WF.LIZ();
            if (C3WF.LIZ() != EnumC84133Rx.RECENT_SHARED) {
                z = true;
            } else {
                z = false;
            }
            SharePanelViewModel LIZ2 = C3WG.LIZ(sharePackage, this, c61878OQg, null, 0, LIZ, false, z, false, false, null, null, 15896);
            LIZ2.LJIILIIL();
            this.LLII = new C4PX(this.LLIIIL, this.LLIIIJ, context, LIZ2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            RecyclerView recyclerView = this.LLFFF;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.LLII);
                recyclerView.setLayoutManager(linearLayoutManager);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.LLFFF;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
        this.LJLIL.setVisibility(0);
    }
}
