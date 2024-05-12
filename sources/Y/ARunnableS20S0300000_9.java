package Y;

import X.AbstractC07850Sn;
import X.C04330Ez;
import X.C10K;
import X.C16880lQ;
import X.C1DD;
import X.C2049182l;
import X.C2050382x;
import X.C25620zW;
import X.C44384HbQ;
import X.C53665L4j;
import X.C53986LGs;
import X.C54082LKk;
import X.C54113LLp;
import X.C54116LLs;
import X.C54133LMj;
import X.C55952Lxc;
import X.C56309M8b;
import X.C56311M8d;
import X.C62387Oe7;
import X.C62562cu;
import X.C63081OpJ;
import X.C71899SJr;
import X.C78939UyV;
import X.C79045V0n;
import X.EnumC53663L4h;
import X.EnumC56312M8e;
import X.EnumC56313M8f;
import X.EnumC56314M8g;
import X.EnumC71803SFz;
import X.EnumC71900SJs;
import X.FMX;
import X.InterfaceC56316M8i;
import X.InterfaceC56318M8k;
import X.InterfaceC73573Su9;
import X.L21;
import X.L4O;
import X.L54;
import X.L59;
import X.L69;
import X.L7P;
import X.LH6;
import X.LND;
import X.M74;
import X.MFV;
import X.MH7;
import X.MH9;
import X.V1M;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.poplayer.core.PopupTaskExecutor;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.detail.panel.StickerButtonPanel;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsEmptyPageSharePackage;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFSocialAssem;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ARunnableS20S0300000_9 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$4() {
        C2049182l.LIZ = W5U.LIZJ().LIZIZ(new C62562cu(((MH7) this.l0).LJLIL.getVideo().getAiDynamicCover().getUrlList()));
        C2050382x.LIZ.execute(new ARunnableS20S0300000_9((MH7) this.l0, (MH9) this.l1, (View) this.l2, 5));
    }

    public final void LIZ$9() {
        C2049182l.LIZ = W5U.LIZJ().LIZIZ(new C62562cu(((MFV) this.l2).LJLIL.getVideo().getAiDynamicCover().getUrlList()));
        C2050382x.LIZ.execute(new ARunnableS45S0100000_9(this, 230));
    }

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
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        L21<?, ?> l21 = ((C53665L4j) this.l0).LJIJJLI().get((EnumC53663L4h) this.l1);
        if (l21 == null) {
            return;
        }
        L4O l4o = ((C53665L4j) this.l0).LJJ().get((EnumC53663L4h) this.l1);
        if (l4o == null && ((Set) L54.LIZ.getValue()).contains((L59) this.l2)) {
            return;
        }
        L69 l69 = ((C53665L4j) this.l0).LJLIL;
        if (l69 != null) {
            l21.LIZIZ(l4o, l69, (L59) this.l2);
        } else {
            o.LJIJI("containerView");
            throw null;
        }
    }

    public final void LIZ$1() {
        W5F LJII = W5U.LJII(C78939UyV.LJ(((NewFaceStickerBean) this.l0).iconUrl));
        LJII.LJJIIJ = (SmartImageView) ((View) this.l1).findViewById(R.id.khy);
        LJII.LJIIL = 200;
        C16880lQ.LLJJJ(LJII);
        StickerButtonPanel stickerButtonPanel = (StickerButtonPanel) this.l2;
        View findViewById = ((View) this.l1).findViewById(R.id.kkb);
        o.LJIIIIZZ(findViewById, "it.sticker_title_container");
        TuxTextView tuxTextView = (TuxTextView) ((View) this.l1).findViewById(R.id.kka);
        o.LJIIIIZZ(tuxTextView, "it.sticker_title");
        String str = ((NewFaceStickerBean) this.l0).name;
        o.LJIIIIZZ(str, "item.name");
        stickerButtonPanel.getClass();
        StickerButtonPanel.LLILII(findViewById, tuxTextView, str);
        C16880lQ.LJJJJI((TuxTextView) ((View) this.l1).findViewById(R.id.kka), new ACListenerS44S0200000_9((NewFaceStickerBean) this.l0, (StickerButtonPanel) this.l2, 8));
        C16880lQ.LJJIJLIJ((SmartImageView) ((View) this.l1).findViewById(R.id.khy), new ACListenerS44S0200000_9((NewFaceStickerBean) this.l0, (StickerButtonPanel) this.l2, 9));
        C16880lQ.LJIIJ(new ACListenerS44S0200000_9((NewFaceStickerBean) this.l0, (StickerButtonPanel) this.l2, 10), ((View) this.l1).findViewById(R.id.ap4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0013, B:9:0x0056, B:11:0x0060, B:14:0x006a, B:15:0x012c, B:19:0x006d, B:21:0x0075, B:24:0x0081, B:26:0x0084, B:28:0x0096, B:30:0x009e, B:31:0x00ad, B:33:0x00b3, B:34:0x00c1, B:35:0x00c4, B:37:0x00c8, B:38:0x00cc, B:43:0x00d8, B:48:0x00e4, B:53:0x00ed, B:58:0x00f9, B:63:0x0105, B:68:0x0111, B:72:0x011c, B:78:0x0138, B:82:0x014c, B:84:0x0154, B:85:0x015b, B:87:0x0163, B:88:0x0169, B:94:0x0146, B:95:0x009c, B:96:0x0042), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0013, B:9:0x0056, B:11:0x0060, B:14:0x006a, B:15:0x012c, B:19:0x006d, B:21:0x0075, B:24:0x0081, B:26:0x0084, B:28:0x0096, B:30:0x009e, B:31:0x00ad, B:33:0x00b3, B:34:0x00c1, B:35:0x00c4, B:37:0x00c8, B:38:0x00cc, B:43:0x00d8, B:48:0x00e4, B:53:0x00ed, B:58:0x00f9, B:63:0x0105, B:68:0x0111, B:72:0x011c, B:78:0x0138, B:82:0x014c, B:84:0x0154, B:85:0x015b, B:87:0x0163, B:88:0x0169, B:94:0x0146, B:95:0x009c, B:96:0x0042), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0013, B:9:0x0056, B:11:0x0060, B:14:0x006a, B:15:0x012c, B:19:0x006d, B:21:0x0075, B:24:0x0081, B:26:0x0084, B:28:0x0096, B:30:0x009e, B:31:0x00ad, B:33:0x00b3, B:34:0x00c1, B:35:0x00c4, B:37:0x00c8, B:38:0x00cc, B:43:0x00d8, B:48:0x00e4, B:53:0x00ed, B:58:0x00f9, B:63:0x0105, B:68:0x0111, B:72:0x011c, B:78:0x0138, B:82:0x014c, B:84:0x0154, B:85:0x015b, B:87:0x0163, B:88:0x0169, B:94:0x0146, B:95:0x009c, B:96:0x0042), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0163 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0013, B:9:0x0056, B:11:0x0060, B:14:0x006a, B:15:0x012c, B:19:0x006d, B:21:0x0075, B:24:0x0081, B:26:0x0084, B:28:0x0096, B:30:0x009e, B:31:0x00ad, B:33:0x00b3, B:34:0x00c1, B:35:0x00c4, B:37:0x00c8, B:38:0x00cc, B:43:0x00d8, B:48:0x00e4, B:53:0x00ed, B:58:0x00f9, B:63:0x0105, B:68:0x0111, B:72:0x011c, B:78:0x0138, B:82:0x014c, B:84:0x0154, B:85:0x015b, B:87:0x0163, B:88:0x0169, B:94:0x0146, B:95:0x009c, B:96:0x0042), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0146 A[Catch: all -> 0x0173, TRY_ENTER, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0013, B:9:0x0056, B:11:0x0060, B:14:0x006a, B:15:0x012c, B:19:0x006d, B:21:0x0075, B:24:0x0081, B:26:0x0084, B:28:0x0096, B:30:0x009e, B:31:0x00ad, B:33:0x00b3, B:34:0x00c1, B:35:0x00c4, B:37:0x00c8, B:38:0x00cc, B:43:0x00d8, B:48:0x00e4, B:53:0x00ed, B:58:0x00f9, B:63:0x0105, B:68:0x0111, B:72:0x011c, B:78:0x0138, B:82:0x014c, B:84:0x0154, B:85:0x015b, B:87:0x0163, B:88:0x0169, B:94:0x0146, B:95:0x009c, B:96:0x0042), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:3:0x0013, B:9:0x0056, B:11:0x0060, B:14:0x006a, B:15:0x012c, B:19:0x006d, B:21:0x0075, B:24:0x0081, B:26:0x0084, B:28:0x0096, B:30:0x009e, B:31:0x00ad, B:33:0x00b3, B:34:0x00c1, B:35:0x00c4, B:37:0x00c8, B:38:0x00cc, B:43:0x00d8, B:48:0x00e4, B:53:0x00ed, B:58:0x00f9, B:63:0x0105, B:68:0x0111, B:72:0x011c, B:78:0x0138, B:82:0x014c, B:84:0x0154, B:85:0x015b, B:87:0x0163, B:88:0x0169, B:94:0x0146, B:95:0x009c, B:96:0x0042), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS20S0300000_9.LIZ$2():void");
    }

    public final void LIZ$3() {
        int i;
        FMX.LJIIL("inbox_message_cell", (Map) this.l0);
        if (((InboxEntrancePod) this.l1).entranceCell.getCellId() == 7 && (i = ((MultiViewModel) this.l2).LLIIZ) >= 0) {
            ((Map) this.l0).put("rank", String.valueOf(i));
            IMService.createIIMServicebyMonsterPlugin(false).getInboxAnalytics().LIZIZ((Map) this.l0);
        }
    }

    public final void LIZ$6() {
        try {
            ((PopupTaskExecutor) this.l0).LJ((C56309M8b) this.l1, (C54082LKk) this.l2);
        } catch (Exception e) {
            M74 m74 = ((C56309M8b) this.l1).LJLJJLL;
            EnumC56313M8f enumC56313M8f = EnumC56313M8f.EXCEPTION;
            m74.showPopupFailed(enumC56313M8f.getErrCode(), e.toString());
            InterfaceC56318M8k interfaceC56318M8k = PopupManager.LIZLLL().LJ;
            if (interfaceC56318M8k != null) {
                M74 m742 = ((C56309M8b) this.l1).LJLJJLL;
                enumC56313M8f.getErrCode();
                interfaceC56318M8k.LIZIZ(m742, e.toString());
            }
            C56309M8b c56309M8b = (C56309M8b) this.l1;
            C56311M8d.LIZIZ(c56309M8b, EnumC56314M8g.POPUP_SHOW_EXCEPTION, c56309M8b.LJLJJI.getSceneId(), C1DD.LJ("show pop error: ", e), null);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(((C56309M8b) this.l1).LJLILLLLZI);
            LIZ.append(" shows failed because of error: \r\n ");
            LIZ.append(Log.getStackTraceString(e));
            LIZ.append('.');
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(((C56309M8b) this.l1).LJLILLLLZI);
            LIZ2.append(" shows failed because of error: \r\n ");
            LIZ2.append(Log.getStackTraceString(e));
            LIZ2.append('.');
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg, "msg");
            PopupManager.LIZLLL().LIZJ.invoke(msg);
            ((C56309M8b) this.l1).LJLJJLL.getStateWrapper().LIZIZ();
            if (!PopupManager.LIZLLL().LIZ) {
            } else {
                throw e;
            }
        }
    }

    public final void LIZ$8() {
        C53986LGs c53986LGs;
        int i;
        C54116LLs c54116LLs = (C54116LLs) this.l1;
        C54113LLp c54113LLp = (C54113LLp) this.l2;
        c54116LLs.getClass();
        C54116LLs.LJJIIZ(c54113LLp);
        C54116LLs c54116LLs2 = (C54116LLs) this.l1;
        C54113LLp c54113LLp2 = (C54113LLp) this.l2;
        LH6 lh6 = c54116LLs2.LIZLLL.LIZLLL;
        if (c54116LLs2.LIZIZ == L7P.DARK) {
            if (c54116LLs2.LJIILJJIL()) {
                c53986LGs = lh6.LIZIZ;
            } else {
                c53986LGs = lh6.LIZLLL;
            }
        } else if (c54116LLs2.LJIILJJIL()) {
            c53986LGs = lh6.LIZ;
        } else {
            c53986LGs = lh6.LIZJ;
        }
        c54113LLp2.setTabIconImageDrawable(c54116LLs2.LIZJ.LIZLLL(c53986LGs.LJLIL, c54113LLp2.getContext()));
        Context context = c54113LLp2.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(c53986LGs.LJLILLLLZI, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        c54113LLp2.setTitleTextColor(i);
        c54116LLs2.LJJIIZI(c54113LLp2, c54116LLs2.LJIILJJIL());
    }

    public final void LIZ$5() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((C56309M8b) this.l0).LJLILLLLZI);
        LIZ.append(" calls runAsyncTask.");
        C44384HbQ.LLFZ(X1D.LIZIZ(LIZ));
        try {
            ((InterfaceC56316M8i) this.l1).LJI((C54082LKk) this.l2);
        } catch (Throwable th) {
            M74 m74 = ((C56309M8b) this.l0).LJLJJLL;
            EnumC56313M8f enumC56313M8f = EnumC56313M8f.ASYNC_FALSE;
            int errCode = enumC56313M8f.getErrCode();
            StringBuilder LIZ2 = X1D.LIZ();
            EnumC56312M8e enumC56312M8e = EnumC56312M8e.ASYNC_EXCEPTION;
            LIZ2.append(enumC56312M8e.getErrMsg());
            LIZ2.append(th);
            LIZ2.append('.');
            m74.showPopupFailed(errCode, X1D.LIZIZ(LIZ2));
            InterfaceC56318M8k interfaceC56318M8k = PopupManager.LIZLLL().LJ;
            if (interfaceC56318M8k != null) {
                M74 m742 = ((C56309M8b) this.l0).LJLJJLL;
                enumC56313M8f.getErrCode();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(enumC56312M8e.getErrMsg());
                LIZ3.append(th);
                LIZ3.append('.');
                interfaceC56318M8k.LIZIZ(m742, X1D.LIZIZ(LIZ3));
            }
            C56309M8b c56309M8b = (C56309M8b) this.l0;
            C56311M8d.LIZIZ(c56309M8b, EnumC56314M8g.POPUP_ASYNC_EXCEPTION, c56309M8b.LJLJJI.getSceneId(), C25620zW.LIZ("runAsyncTask failed: ", th), null);
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(((C56309M8b) this.l0).LJLILLLLZI);
            LIZ4.append(" runAsyncTask failed because of error: \r\n ");
            LIZ4.append(Log.getStackTraceString(th));
            LIZ4.append('.');
            C44384HbQ.LLFZ(X1D.LIZIZ(LIZ4));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(((C56309M8b) this.l0).LJLILLLLZI);
            LIZ5.append(" runAsyncTask failed because of error: \r\n ");
            LIZ5.append(Log.getStackTraceString(th));
            LIZ5.append('.');
            String msg = X1D.LIZIZ(LIZ5);
            o.LJIIIZ(msg, "msg");
            PopupManager.LIZLLL().LIZJ.invoke(msg);
            if (!PopupManager.LIZLLL().LIZ) {
                V1M.LJJJJJ((InterfaceC56316M8i) this.l1, false);
                return;
            }
            throw th;
        }
    }

    public final void LIZ$7() {
        if (C54133LMj.LIZIZ()) {
            LinearLayout container = (LinearLayout) ((View) this.l0).findViewById(R.id.k4b);
            MFSocialAssem mFSocialAssem = (MFSocialAssem) this.l1;
            Fragment fragment = (Fragment) this.l2;
            o.LJIIIIZZ(container, "container");
            LND lnd = new LND(fragment, container);
            LinearLayout linearLayout = lnd.LJLILLLLZI;
            View findViewById = linearLayout.findViewById(R.id.e1b);
            C16880lQ.LJJJJI((TuxTextView) findViewById, new ACListenerS29S0100000_9(lnd, 134));
            o.LJIIIIZZ(findViewById, "findViewById<TuxTextView…)\n            }\n        }");
            lnd.LJLJI = (TuxTextView) findViewById;
            View findViewById2 = linearLayout.findViewById(R.id.kep);
            if (findViewById2 != null) {
                ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                if (layoutParams != null) {
                    Context context = linearLayout.getContext();
                    o.LJIIIIZZ(context, "context");
                    layoutParams.height = C63081OpJ.LJJJJLI(context);
                    findViewById2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            View findViewById3 = linearLayout.findViewById(R.id.dy3);
            C71899SJr c71899SJr = new C71899SJr();
            c71899SJr.LIZJ = Integer.valueOf(C04330Ez.LIZIZ(linearLayout.getContext(), R.color.lk));
            c71899SJr.LJ = Float.valueOf(0.43f);
            c71899SJr.LJFF = Float.valueOf(0.0f);
            c71899SJr.LJI = EnumC71803SFz.VERTICAL;
            c71899SJr.LJII = EnumC71900SJs.LINEAR;
            Context context2 = linearLayout.getContext();
            o.LJIIIIZZ(context2, "context");
            findViewById3.setBackground(c71899SJr.LIZ(context2));
            lnd.LIZ();
            mFSocialAssem.LJLJLJ = lnd;
        }
    }

    public static final void run$0(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            ((InterfaceC73573Su9) aRunnableS20S0300000_9.l1).onNext((FriendsFeedResponse) aRunnableS20S0300000_9.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            MH7.l0((MH7) aRunnableS20S0300000_9.l0, (MH9) aRunnableS20S0300000_9.l1, (View) aRunnableS20S0300000_9.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            FriendsFeedEmptyPageCell friendsFeedEmptyPageCell = (FriendsFeedEmptyPageCell) aRunnableS20S0300000_9.l0;
            Object LJIIJJI = ((C10K) aRunnableS20S0300000_9.l1).LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "res.result");
            friendsFeedEmptyPageCell.L((C62387Oe7) LJIIJJI, (FriendsEmptyPageSharePackage) aRunnableS20S0300000_9.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        try {
            ((BottomTabAbility) aRunnableS20S0300000_9.l0).NS("SHOP_MALL", (AbstractC07850Sn) aRunnableS20S0300000_9.l1, new C55952Lxc(), (FrameLayout.LayoutParams) aRunnableS20S0300000_9.l2, ImageView.ScaleType.CENTER);
        } catch (Throwable unused) {
        }
    }

    public static final void run$9(ARunnableS20S0300000_9 aRunnableS20S0300000_9) {
        boolean LIZ;
        try {
            aRunnableS20S0300000_9.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS20S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
