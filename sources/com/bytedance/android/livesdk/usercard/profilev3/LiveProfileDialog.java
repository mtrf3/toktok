package com.bytedance.android.livesdk.usercard.profilev3;

import X.AbstractC29482Bhe;
import X.ActivityC45651qj;
import X.B83;
import X.C05630Jz;
import X.C0H1;
import X.C0K2;
import X.C0P2;
import X.C10A;
import X.C15380j0;
import X.C15620jO;
import X.C16880lQ;
import X.C208758Hf;
import X.C221108m2;
import X.C28507BGt;
import X.C29374Bfu;
import X.C29446Bh4;
import X.C29454BhC;
import X.C29456BhE;
import X.C29465BhN;
import X.C29473BhV;
import X.C29475BhX;
import X.C29476BhY;
import X.C29477BhZ;
import X.C29479Bhb;
import X.C29481Bhd;
import X.C29485Bhh;
import X.C29487Bhj;
import X.C29488Bhk;
import X.C29490Bhm;
import X.C29491Bhn;
import X.C29492Bho;
import X.C29503Bhz;
import X.C29778BmQ;
import X.C2A7;
import X.C2A8;
import X.C47061t0;
import X.C47135Ieh;
import X.C62822Ol8;
import X.C73113Smj;
import X.C73411SrX;
import X.C79077V1t;
import X.CN1;
import X.InterfaceC28822BSw;
import X.InterfaceC29493Bhp;
import X.InterfaceC29499Bhv;
import X.InterfaceC29502Bhy;
import X.KL2;
import X.V8L;
import X.V92;
import X.X1D;
import X.XKX;
import Y.ACListenerS25S0100000_5;
import Y.AObserverS73S0100000_5;
import Y.IDTListenerS89S0200000_5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.room.UserProfileShowingChannel;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserPreviewOptPackageSetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import q03.IDaS485S0100000_5;

/* loaded from: classes6.dex */
public final class LiveProfileDialog extends LiveDialogFragment implements InterfaceC28822BSw, InterfaceC29502Bhy {
    public static final /* synthetic */ int LLIIII = 0;
    public C29475BhX LJLIL;
    public C29456BhE LJLILLLLZI;
    public C29481Bhd LJLJI;
    public ViewGroup LJLJJI;
    public View LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public View LJLLI;
    public View LJLLILLLL;
    public C2A7 LJLLJ;
    public C47061t0 LJLLL;
    public C29454BhC LJLLLL;
    public ConstraintLayout LJLLLLLL;
    public C73113Smj LJLZ;
    public ViewGroup LJZ;
    public LiveIconView LJZI;
    public C2A8 LJZL;
    public C2A8 LL;
    public long LLD;
    public InterfaceC29499Bhv LLF;
    public User LLFF;
    public C29485Bhh LLFFF;
    public LinearLayout LLFII;
    public C29446Bh4 LLFZ;
    public C208758Hf LLI;
    public boolean LLIFFJFJJ;
    public final Map<Integer, View> LLII = new LinkedHashMap();
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 271));
    public int LJLL = -1;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLII).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    static {
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).nw(new C29487Bhj(), 0);
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).nw(new C29491Bhn(), 1);
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).nw(new C29492Bho(), 3);
        ((IUserCardService) CN1.LIZ(IUserCardService.class)).nw(new C29490Bhm(), 65536);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        int i;
        int i2;
        DialogFragment dialogFragment;
        Dialog dialog;
        C29475BhX c29475BhX = this.LJLIL;
        if (c29475BhX != null) {
            if (c29475BhX.LIZIZ) {
                i = R.layout.cya;
            } else {
                i = R.layout.cyg;
            }
            C28507BGt c28507BGt = new C28507BGt(i);
            c28507BGt.LIZIZ = 0;
            C29475BhX c29475BhX2 = this.LJLIL;
            if (c29475BhX2 != null) {
                if (c29475BhX2.LIZIZ) {
                    c28507BGt.LJII = 80;
                    c28507BGt.LJIIIZ = -1;
                    c28507BGt.LJIIJ = -1;
                    UserProfileEvent userProfileEvent = c29475BhX2.LJI;
                    String str = c29475BhX2.LJFF;
                    Boolean enterFromRankList = userProfileEvent.getEnterFromRankList();
                    o.LJIIIIZZ(enterFromRankList, "event.enterFromRankList");
                    if (!enterFromRankList.booleanValue() && !o.LJ("redpacket", userProfileEvent.mClickUserPosition) && !o.LJ("portal", userProfileEvent.mClickUserPosition) && !o.LJ("draw_guess_round_summary", userProfileEvent.mClickUserPosition) && !o.LJ("connection_list", userProfileEvent.mClickUserPosition) && (str == null || !o.LJ(str, "guest_connection"))) {
                        FragmentManager fragmentManager = getFragmentManager();
                        Fragment fragment = this;
                        loop0: while (fragmentManager != null) {
                            List<Fragment> LJJJJLI = fragmentManager.LJJJJLI();
                            ArrayList LIZIZ = s1.LIZIZ(LJJJJLI, "fm.fragments");
                            for (Fragment fragment2 : LJJJJLI) {
                                if ((fragment2 instanceof DialogFragment) && !(fragment2 instanceof LiveProfileDialog)) {
                                    LIZIZ.add(fragment2);
                                }
                            }
                            if (!LIZIZ.isEmpty()) {
                                Iterator it = LIZIZ.iterator();
                                while (it.hasNext()) {
                                    Fragment fragment3 = (Fragment) it.next();
                                    if (!(fragment3 instanceof DialogFragment) || (dialogFragment = (DialogFragment) fragment3) == null || (dialog = dialogFragment.getDialog()) == null || !dialog.isShowing()) {
                                    }
                                }
                            }
                            if (fragment == null || (fragment = fragment.getParentFragment()) == null) {
                                break;
                            }
                            fragmentManager = fragment.getFragmentManager();
                        }
                        c28507BGt.LIZJ = R.style.acp;
                    }
                    c28507BGt.LIZJ = R.style.rt;
                    break loop0;
                } else {
                    c28507BGt.LJIIIZ = C15380j0.LJFF(R.dimen.ad9);
                    c28507BGt.LJIIJ = -1;
                    c28507BGt.LIZJ = R.style.aal;
                    if (C15380j0.LJIIZILJ()) {
                        i2 = 3;
                    } else {
                        i2 = 5;
                    }
                    c28507BGt.LJII = i2;
                }
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    dataChannel.rv0(UserProfileShowingChannel.class, Boolean.TRUE);
                }
                return c28507BGt;
            }
            o.LJIJI("config");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }

    public final C29465BhN xl() {
        return (C29465BhN) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        super.dismiss();
        this.LJLJL = false;
        this.LJLJLJ = true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, X.InterfaceC29502Bhy
    public final boolean isShowing() {
        if (super.isShowing() || this.LJLJL) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C73411SrX c73411SrX;
        super.onDestroy();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.getClass();
        dataChannelGlobal.jv0(this);
        this.LLD = 0L;
        InterfaceC29499Bhv interfaceC29499Bhv = this.LLF;
        if (interfaceC29499Bhv != null) {
            C29778BmQ c29778BmQ = (C29778BmQ) interfaceC29499Bhv;
            c29778BmQ.LJIIL.LIZLLL();
            C73411SrX c73411SrX2 = c29778BmQ.LJIILIIL;
            if ((c73411SrX2 == null || !c73411SrX2.isDisposed()) && (c73411SrX = c29778BmQ.LJIILIIL) != null) {
                c73411SrX.dispose();
            }
            c29778BmQ.LJFF = 0L;
        }
        this.LLF = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        Dialog dialog;
        Window window3;
        super.onStart();
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null && (window2 = mo49getActivity.getWindow()) != null && (window2.getAttributes().flags & 1024) != 1024 && getDialog() != null && (dialog = getDialog()) != null && (window3 = dialog.getWindow()) != null) {
            try {
                window3.clearFlags(1024);
            } catch (Exception unused) {
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    public final void Al(User user) {
        boolean z;
        IInteractService iInteractService = (IInteractService) CN1.LIZ(IInteractService.class);
        if (iInteractService != null && iInteractService.hw(user)) {
            ConstraintLayout constraintLayout = this.LJLLLLLL;
            if (constraintLayout == null || this.LJZ == null) {
                return;
            }
            constraintLayout.setVisibility(0);
            Hl(false);
            IBarrageService iBarrageService = (IBarrageService) CN1.LIZ(IBarrageService.class);
            DataChannel dataChannel = this.dataChannel;
            Context context = getContext();
            C29475BhX c29475BhX = this.LJLIL;
            if (c29475BhX != null) {
                Room room = c29475BhX.LIZLLL;
                long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
                C29475BhX c29475BhX2 = this.LJLIL;
                if (c29475BhX2 != null) {
                    if (currentUserId == c29475BhX2.LIZLLL.getOwner().getId()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LLF = iBarrageService.pw(dataChannel, context, room, z, this.LJZ);
                    ConstraintLayout constraintLayout2 = this.LJLLLLLL;
                    if (constraintLayout2 != null) {
                        constraintLayout2.setOnTouchListener(new IDTListenerS89S0200000_5(this, user, 0));
                        return;
                    }
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
            o.LJIJI("config");
            throw null;
        }
        ConstraintLayout constraintLayout3 = this.LJLLLLLL;
        if (constraintLayout3 != null) {
            constraintLayout3.setVisibility(8);
        }
    }

    public final void Gl(MotionEvent motionEvent) {
        LiveIconView liveIconView;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || (liveIconView = this.LJZI) == null) {
                return;
            }
            liveIconView.setIconAttr(R.attr.atp);
            return;
        }
        LiveIconView liveIconView2 = this.LJZI;
        if (liveIconView2 == null) {
            return;
        }
        liveIconView2.setIconAttr(R.attr.atr);
    }

    public final void Hl(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        String LJIILJJIL;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        if (!z) {
            C2A8 c2a8 = this.LJZL;
            if (c2a8 != null) {
                c2a8.setVisibility(8);
            }
            C2A8 c2a82 = this.LL;
            if (c2a82 != null) {
                c2a82.setVisibility(0);
            }
            C2A8 c2a83 = this.LL;
            if (c2a83 != null) {
                c2a83.setText(R.string.ltp);
            }
            C73113Smj c73113Smj = this.LJLZ;
            if (c73113Smj != null && (layoutParams3 = c73113Smj.getLayoutParams()) != null) {
                layoutParams3.width = -2;
                C73113Smj c73113Smj2 = this.LJLZ;
                if (c73113Smj2 == null) {
                    return;
                }
                c73113Smj2.setLayoutParams(layoutParams3);
                return;
            }
            return;
        }
        if (this.LLD > 0) {
            C2A8 c2a84 = this.LJZL;
            if (c2a84 != null) {
                c2a84.setVisibility(0);
            }
            C2A8 c2a85 = this.LL;
            if (c2a85 != null) {
                c2a85.setVisibility(8);
            }
            C2A8 c2a86 = this.LJZL;
            if (c2a86 != null) {
                c2a86.setTypeface(c2a86.getTypeface(), 2);
            }
            C2A8 c2a87 = this.LJZL;
            if (c2a87 != null) {
                long j = this.LLD;
                if (j > 0 && j < 10) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append('+');
                    LJIILJJIL = C0H1.LIZJ(LIZ, this.LLD, "  ", LIZ);
                } else if (j >= 10 && j <= 99) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('+');
                    LJIILJJIL = C47135Ieh.LIZIZ(LIZ2, this.LLD, ' ', LIZ2);
                } else if (j > 99) {
                    LJIILJJIL = "+99 ";
                } else {
                    LJIILJJIL = C15380j0.LJIILJJIL(R.string.ltp);
                    if (TextUtils.isEmpty(LJIILJJIL)) {
                        LJIILJJIL = "";
                    }
                }
                c2a87.setText(LJIILJJIL);
            }
            C73113Smj c73113Smj3 = this.LJLZ;
            if (c73113Smj3 == null || (layoutParams2 = c73113Smj3.getLayoutParams()) == null) {
                return;
            }
            layoutParams2.width = C15380j0.LIZ(56.0f);
            C73113Smj c73113Smj4 = this.LJLZ;
            if (c73113Smj4 == null) {
                return;
            }
            c73113Smj4.setLayoutParams(layoutParams2);
            return;
        }
        C2A8 c2a88 = this.LJZL;
        if (c2a88 != null) {
            c2a88.setVisibility(8);
        }
        C2A8 c2a89 = this.LL;
        if (c2a89 != null) {
            c2a89.setVisibility(0);
        }
        C2A8 c2a810 = this.LL;
        if (c2a810 != null) {
            c2a810.setText(R.string.ltp);
        }
        C73113Smj c73113Smj5 = this.LJLZ;
        if (c73113Smj5 == null || (layoutParams = c73113Smj5.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = -2;
        C73113Smj c73113Smj6 = this.LJLZ;
        if (c73113Smj6 == null) {
            return;
        }
        c73113Smj6.setLayoutParams(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        if (r0.isAdmin == true) goto L20;
     */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDismiss(android.content.DialogInterface r13) {
        /*
            r12 = this;
            java.lang.String r0 = "dialog"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            super.onDismiss(r13)
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r12.dataChannel
            if (r2 == 0) goto L13
            java.lang.Class<com.bytedance.android.live.room.UserProfileShowingChannel> r1 = com.bytedance.android.live.room.UserProfileShowingChannel.class
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.rv0(r1, r0)
        L13:
            X.BhC r5 = r12.LJLLLL
            r3 = 0
            if (r5 == 0) goto L80
            X.BhN r0 = r12.xl()
            androidx.lifecycle.MutableLiveData<X.Bhk<X.BhV>> r0 = r0.LIZJ
            java.lang.Object r0 = r0.getValue()
            X.Bhk r0 = (X.C29488Bhk) r0
            if (r0 == 0) goto L2e
            T r0 = r0.LIZ
            X.BhV r0 = (X.C29473BhV) r0
            if (r0 == 0) goto L2e
            com.bytedance.android.live.base.model.user.User r3 = r0.LIZ
        L2e:
            r2 = 0
            if (r3 != 0) goto L34
        L31:
            r12.LJLJL = r2
            return
        L34:
            X.BhX r0 = r5.LIZ
            com.bytedance.android.livesdk.event.UserProfileEvent r4 = r0.LJI
            java.lang.String r0 = "livesdk_live_profile_card_duration"
            X.BZI r10 = X.C28787BRn.LIZ(r0)
            X.BhX r0 = r5.LIZ
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r0.LJII
            r10.LJIILLIIL(r0)
            X.BhX r0 = r5.LIZ
            long r0 = r0.LIZJ
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "to_user_id"
            r10.LJIJJ(r1, r0)
            java.lang.String r1 = "request_page"
            java.lang.String r0 = r5.LIZIZ()
            r10.LJIJJ(r0, r1)
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r8 = r5.LIZLLL
            java.lang.String r11 = "duration"
            X.I9A.LIZ(r6, r8, r10, r11)
            java.lang.String r1 = "click_module"
            java.lang.String r0 = r4.clickModule
            r10.LJIJJ(r0, r1)
            com.bytedance.android.livesdk.model.UserAttr r0 = r3.getUserAttr()
            if (r0 == 0) goto L7e
            boolean r0 = r0.isAdmin
            r1 = 1
            if (r0 != r1) goto L7e
        L78:
            java.lang.String r0 = "is_moderator"
            X.UFE.LIZIZ(r1, r10, r0)
            goto L31
        L7e:
            r1 = 0
            goto L78
        L80:
            java.lang.String r0 = "profileDialogLog"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog.onDismiss(android.content.DialogInterface):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0198, code lost:
    
        if (r2 == 4) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02f5, code lost:
    
        if (r2.equals("level_up") == false) goto L138;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Type inference failed for: r0v127, types: [X.BSv, T] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.bytedance.android.live.base.model.user.User, T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wl(X.C29473BhV r28) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog.wl(X.BhV):void");
    }

    public final void Dl(FragmentManager fragmentManager, String str) {
        if (this.LJLJLJ) {
            return;
        }
        super.show(fragmentManager, str);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        C29485Bhh c29485Bhh;
        LinearLayout linearLayout;
        C29485Bhh c29485Bhh2;
        int LIZ;
        C29485Bhh c29485Bhh3;
        C29485Bhh c29485Bhh4;
        C29488Bhk<C29473BhV> value;
        C29488Bhk<C29473BhV> value2;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        C29475BhX c29475BhX = this.LJLIL;
        if (c29475BhX != null) {
            if (c29475BhX.LIZIZ) {
                C0P2.LIZ(window);
                window.addFlags(LiveLayoutPreloadThreadPriority.DEFAULT);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(-1);
            } else {
                View findViewById = view.findViewById(R.id.btt);
                if (findViewById != null) {
                    findViewById.setBackgroundResource(R.drawable.ccl);
                }
            }
            View findViewById2 = view.findViewById(R.id.liz);
            if (findViewById2 != null) {
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 249), findViewById2);
            }
            this.LLFFF = (C29485Bhh) view.findViewById(R.id.jcz);
            this.LLFII = (LinearLayout) view.findViewById(R.id.bxl);
            View findViewById3 = view.findViewById(R.id.deo);
            o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.fl_loading_progress)");
            this.LJLLI = findViewById3;
            if (LiveUserPreviewOptPackageSetting.INSTANCE.isEnable()) {
                View view2 = this.LJLLI;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    C29456BhE c29456BhE = this.LJLILLLLZI;
                    if (c29456BhE != null) {
                        if (c29456BhE.LIZLLL()) {
                            i = C15380j0.LIZ(255.0f);
                        } else {
                            C29456BhE c29456BhE2 = this.LJLILLLLZI;
                            if (c29456BhE2 != null) {
                                if (!c29456BhE2.LIZJ()) {
                                    i = C15380j0.LIZ(327.0f);
                                } else {
                                    i = layoutParams.height;
                                }
                            } else {
                                o.LJIJI("profileRoleInfo");
                                throw null;
                            }
                        }
                        layoutParams.height = i;
                        View view3 = this.LJLLI;
                        if (view3 != null) {
                            view3.setLayoutParams(layoutParams);
                        } else {
                            o.LJIJI("loadingLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("profileRoleInfo");
                        throw null;
                    }
                } else {
                    o.LJIJI("loadingLayout");
                    throw null;
                }
            }
            View findViewById4 = view.findViewById(R.id.g3_);
            o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ll_error)");
            this.LJLLILLLL = findViewById4;
            View findViewById5 = view.findViewById(R.id.btt);
            o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.content_layout)");
            this.LJLJJL = findViewById5;
            View findViewById6 = view.findViewById(R.id.fo1);
            o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.lb_retry)");
            this.LJLLJ = (C2A7) findViewById6;
            View findViewById7 = view.findViewById(R.id.aj2);
            o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.bg_card_solid)");
            this.LJLLL = (C47061t0) findViewById7;
            this.LJLLLLLL = (ConstraintLayout) view.findViewById(R.id.fr2);
            this.LJLZ = (C73113Smj) view.findViewById(R.id.fr3);
            this.LJZ = (ViewGroup) view.findViewById(R.id.liz);
            this.LJZI = (LiveIconView) view.findViewById(R.id.fr_);
            this.LJZL = (C2A8) view.findViewById(R.id.fr6);
            this.LL = (C2A8) view.findViewById(R.id.frg);
            C2A7 c2a7 = this.LJLLJ;
            if (c2a7 != null) {
                C16880lQ.LJIIJ(new IDaS485S0100000_5(this, 3), c2a7);
                if (this.LJLLLL != null) {
                    SystemClock.elapsedRealtime();
                    if (xl().LIZJ.getValue() == null || (((value = xl().LIZJ.getValue()) != null && value.LIZIZ == 3) || ((value2 = xl().LIZJ.getValue()) != null && value2.LIZIZ == 4))) {
                        C29465BhN xl = xl();
                        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                        C29481Bhd c29481Bhd = this.LJLJI;
                        if (c29481Bhd != null) {
                            List<AbstractC29482Bhe<?>> LIZ2 = c29481Bhd.LIZ();
                            C29456BhE c29456BhE3 = this.LJLILLLLZI;
                            if (c29456BhE3 != null) {
                                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), xl().LJFF, null, new C29479Bhb(this, xl.LIZ(lifecycleScope, LIZ2, c29456BhE3.LJ()), null), 2);
                            } else {
                                o.LJIJI("profileRoleInfo");
                                throw null;
                            }
                        } else {
                            o.LJIJI("cellsContainer");
                            throw null;
                        }
                    } else {
                        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), xl().LJFF, null, new C29477BhZ(this, null), 2);
                    }
                    View findViewById8 = view.findViewById(R.id.g25);
                    o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.ll_cell_container)");
                    ViewGroup viewGroup = (ViewGroup) findViewById8;
                    this.LJLJJI = viewGroup;
                    View findViewById9 = viewGroup.findViewById(R.id.fyk);
                    o.LJIIIIZZ(findViewById9, "contentContainer.findVie…ive_scrollable_container)");
                    ViewGroup viewGroup2 = (ViewGroup) findViewById9;
                    C29481Bhd c29481Bhd2 = this.LJLJI;
                    if (c29481Bhd2 != null) {
                        List<AbstractC29482Bhe<?>> list = c29481Bhd2.LIZ;
                        ArrayList arrayList = new ArrayList();
                        for (AbstractC29482Bhe<?> abstractC29482Bhe : list) {
                            if (abstractC29482Bhe.LJFF()) {
                                arrayList.add(abstractC29482Bhe);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractC29482Bhe<?> abstractC29482Bhe2 = (AbstractC29482Bhe) it.next();
                            C29481Bhd c29481Bhd3 = this.LJLJI;
                            if (c29481Bhd3 != null) {
                                Context context = view.getContext();
                                o.LJIIIIZZ(context, "view.context");
                                View LIZIZ = c29481Bhd3.LIZIZ(context, abstractC29482Bhe2);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams2.topMargin = abstractC29482Bhe2.LJI();
                                layoutParams2.bottomMargin = abstractC29482Bhe2.LIZJ();
                                viewGroup2.addView(LIZIZ, layoutParams2);
                                if ((abstractC29482Bhe2 instanceof InterfaceC29493Bhp) && (c29485Bhh4 = this.LLFFF) != null) {
                                    ((ArrayList) c29485Bhh4.LLIFFJFJJ).add(abstractC29482Bhe2);
                                }
                            } else {
                                o.LJIJI("cellsContainer");
                                throw null;
                            }
                        }
                        C29475BhX c29475BhX2 = this.LJLIL;
                        if (c29475BhX2 != null) {
                            if (!c29475BhX2.LIZIZ) {
                                View view4 = new View(getContext());
                                C29481Bhd c29481Bhd4 = this.LJLJI;
                                if (c29481Bhd4 != null) {
                                    if (c29481Bhd4.LIZIZ == null) {
                                        LIZ = C15380j0.LIZ(24.0f);
                                    } else {
                                        LIZ = C15380j0.LIZ(16.0f);
                                    }
                                    viewGroup2.addView(view4, new LinearLayout.LayoutParams(-1, LIZ));
                                    Context context2 = view.getContext();
                                    o.LJIIIIZZ(context2, "view.context");
                                    C208758Hf c208758Hf = new C208758Hf(context2);
                                    this.LLI = c208758Hf;
                                    ViewGroup viewGroup3 = this.LJLJJI;
                                    if (viewGroup3 != null) {
                                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, C15380j0.LIZ(15.0f));
                                        layoutParams3.topMargin = C15380j0.LIZ(-15.0f);
                                        viewGroup3.addView(c208758Hf, layoutParams3);
                                        C208758Hf c208758Hf2 = this.LLI;
                                        if (c208758Hf2 != null && (c29485Bhh3 = this.LLFFF) != null) {
                                            ((ArrayList) c29485Bhh3.LLIFFJFJJ).add(c208758Hf2);
                                        }
                                    } else {
                                        o.LJIJI("contentContainer");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("cellsContainer");
                                    throw null;
                                }
                            }
                            C29481Bhd c29481Bhd5 = this.LJLJI;
                            if (c29481Bhd5 != null) {
                                AbstractC29482Bhe<?> abstractC29482Bhe3 = c29481Bhd5.LIZIZ;
                                if (abstractC29482Bhe3 != null) {
                                    ViewGroup viewGroup4 = this.LJLJJI;
                                    if (viewGroup4 != null) {
                                        Context context3 = view.getContext();
                                        o.LJIIIIZZ(context3, "view.context");
                                        View LIZIZ2 = c29481Bhd5.LIZIZ(context3, abstractC29482Bhe3);
                                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                                        layoutParams4.topMargin = abstractC29482Bhe3.LJI();
                                        layoutParams4.bottomMargin = abstractC29482Bhe3.LIZJ();
                                        layoutParams4.gravity = 80;
                                        viewGroup4.addView(LIZIZ2, layoutParams4);
                                        if ((abstractC29482Bhe3 instanceof InterfaceC29493Bhp) && (c29485Bhh2 = this.LLFFF) != null) {
                                            ((ArrayList) c29485Bhh2.LLIFFJFJJ).add(abstractC29482Bhe3);
                                        }
                                    } else {
                                        o.LJIJI("contentContainer");
                                        throw null;
                                    }
                                }
                                C29446Bh4 c29446Bh4 = this.LLFZ;
                                if (c29446Bh4 != null && c29446Bh4.LJLJLJ && (linearLayout = this.LLFII) != null) {
                                    Context context4 = view.getContext();
                                    o.LJIIIIZZ(context4, "view.context");
                                    linearLayout.addView(c29446Bh4.LIZLLL(context4));
                                }
                                ViewGroup viewGroup5 = this.LJLJJI;
                                if (viewGroup5 != null) {
                                    viewGroup5.setVisibility(8);
                                    xl().LIZJ.observe(this, new AObserverS73S0100000_5(this, 33));
                                    C29446Bh4 c29446Bh42 = this.LLFZ;
                                    if (c29446Bh42 != null && (c29485Bhh = this.LLFFF) != null) {
                                        ((ArrayList) c29485Bhh.LLIFFJFJJ).add(c29446Bh42);
                                    }
                                    C29485Bhh c29485Bhh5 = this.LLFFF;
                                    if (c29485Bhh5 != null) {
                                        ((ArrayList) c29485Bhh5.LLIFFJFJJ).add(new C29476BhY(this));
                                        return;
                                    }
                                    return;
                                }
                                o.LJIJI("contentContainer");
                                throw null;
                            }
                            o.LJIJI("cellsContainer");
                            throw null;
                        }
                        o.LJIJI("config");
                        throw null;
                    }
                    o.LJIJI("cellsContainer");
                    throw null;
                }
                o.LJIJI("profileDialogLog");
                throw null;
            }
            o.LJIJI("lbRetry");
            throw null;
        }
        o.LJIJI("config");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void show(androidx.fragment.app.FragmentManager r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog.show(androidx.fragment.app.FragmentManager, java.lang.String):void");
    }

    public final void Il(BorderInfo borderInfo, User user, boolean z) {
        ImageModel imageModel;
        int i;
        String str;
        String str2 = null;
        if (borderInfo != null) {
            imageModel = borderInfo.profileDecorationRibbon;
        } else {
            imageModel = null;
        }
        int i2 = 1;
        if (imageModel != null) {
            C47061t0 c47061t0 = this.LJLLL;
            if (c47061t0 != null) {
                KL2.LJIILLIIL(0, c47061t0);
                C47061t0 c47061t02 = this.LJLLL;
                if (c47061t02 != null) {
                    C15620jO.LIZJ(c47061t02, borderInfo.profileDecorationRibbon, null, null, new C29503Bhz(this, user), false);
                    C29475BhX c29475BhX = this.LJLIL;
                    if (c29475BhX != null) {
                        if (!c29475BhX.LIZIZ) {
                            float[] fArr = {C15380j0.LIZ(8.0f), C15380j0.LIZ(8.0f), 0.0f, 0.0f};
                            C47061t0 c47061t03 = this.LJLLL;
                            if (c47061t03 != null) {
                                if (!c47061t03.hasHierarchy()) {
                                    C47061t0 c47061t04 = this.LJLLL;
                                    if (c47061t04 != null) {
                                        c47061t04.setHierarchy(new C79077V1t(getResources()).LIZ());
                                    } else {
                                        o.LJIJI("bgCardSolid");
                                        throw null;
                                    }
                                }
                                C47061t0 c47061t05 = this.LJLLL;
                                if (c47061t05 != null) {
                                    V92 hierarchy = c47061t05.getHierarchy();
                                    float f = fArr[0];
                                    float f2 = fArr[1];
                                    float f3 = fArr[2];
                                    float f4 = fArr[3];
                                    V8L v8l = new V8L();
                                    v8l.LJ(f, f2, f3, f4);
                                    hierarchy.LJIL(v8l);
                                } else {
                                    o.LJIJI("bgCardSolid");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("bgCardSolid");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("config");
                        throw null;
                    }
                } else {
                    o.LJIJI("bgCardSolid");
                    throw null;
                }
            } else {
                o.LJIJI("bgCardSolid");
                throw null;
            }
        } else {
            C47061t0 c47061t06 = this.LJLLL;
            if (c47061t06 != null) {
                KL2.LJIILLIIL(8, c47061t06);
            } else {
                o.LJIJI("bgCardSolid");
                throw null;
            }
        }
        if (z) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C29475BhX c29475BhX2 = this.LJLIL;
            if (c29475BhX2 != null) {
                C05630Jz.LJFF(jSONObject3, "room_id", c29475BhX2.LIZLLL.getId());
                C29475BhX c29475BhX3 = this.LJLIL;
                if (c29475BhX3 != null) {
                    C05630Jz.LJFF(jSONObject3, "anchor_id", c29475BhX3.LIZLLL.getOwnerUserId());
                    C05630Jz.LJFF(jSONObject3, "target_user_id", user.getId());
                    if (borderInfo != null && borderInfo.icon != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    C05630Jz.LIZ(i, "border_reward", jSONObject3);
                    if (borderInfo == null || borderInfo.profileDecorationRibbon == null) {
                        i2 = 0;
                    }
                    C05630Jz.LIZ(i2, "ribbon_reward", jSONObject3);
                    if (borderInfo != null) {
                        str = borderInfo.source;
                    } else {
                        str = null;
                    }
                    if (!o.LJ(str, "")) {
                        if (borderInfo != null) {
                            str2 = borderInfo.source;
                        }
                    } else {
                        str2 = "other";
                    }
                    C05630Jz.LJI(jSONObject3, "source", str2);
                    C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
                    C0K2.LJI("ttlive_ranklist_preview_card_reward", jSONObject, jSONObject2, jSONObject4);
                    return;
                }
                o.LJIJI("config");
                throw null;
            }
            o.LJIJI("config");
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(5:11|12|13|14|15)(2:17|18))(4:19|20|14|15))(4:21|22|23|(2:25|(2:27|(4:29|(1:31)|14|15)(2:32|(1:34)(4:35|13|14|15)))(2:36|37))(2:38|39))))|43|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vl(X.C29471BhT r10, androidx.fragment.app.FragmentManager r11, java.lang.String r12, X.InterfaceC67352kd<? super java.lang.Boolean> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C29483Bhf
            if (r0 == 0) goto L29
            r7 = r13
            X.Bhf r7 = (X.C29483Bhf) r7
            int r2 = r7.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r7.LJLJJLL = r2
        L12:
            java.lang.Object r1 = r7.LJLJJI
            X.NAu r6 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLJJLL
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L43
            if (r0 == r5) goto L37
            if (r0 != r8) goto L2f
            java.lang.Object r12 = r7.LJLJI
            java.lang.String r12 = (java.lang.String) r12
            androidx.fragment.app.FragmentManager r11 = r7.LJLILLLLZI
            com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog r0 = r7.LJLIL
            goto L8b
        L29:
            X.Bhf r7 = new X.Bhf
            r7.<init>(r9, r13)
            goto L12
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L37:
            java.lang.Object r12 = r7.LJLJI
            java.lang.String r12 = (java.lang.String) r12
            androidx.fragment.app.FragmentManager r11 = r7.LJLILLLLZI
            com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog r0 = r7.LJLIL
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L9f
            goto La3
        L43:
            X.C141335gf.LIZJ(r1)
            com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting r0 = com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileV3Setting.INSTANCE     // Catch: java.lang.Throwable -> L9e
            long r0 = r0.getFetchTimeoutMs()     // Catch: java.lang.Throwable -> L9e
            X.Bhd r4 = r9.LJLJI     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            if (r4 == 0) goto L98
            X.BhX r2 = r9.LJLIL     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L92
            android.content.Context r2 = r2.LIZ     // Catch: java.lang.Throwable -> L9e
            r4.LIZJ(r2)     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 > 0) goto L76
            r9.Dl(r11, r12)     // Catch: java.lang.Throwable -> L9e
            X.BhN r2 = r9.xl()     // Catch: java.lang.Throwable -> L9e
            r7.LJLIL = r9     // Catch: java.lang.Throwable -> L9e
            r7.LJLILLLLZI = r11     // Catch: java.lang.Throwable -> L9e
            r7.LJLJI = r12     // Catch: java.lang.Throwable -> L9e
            r7.LJLJJLL = r5     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r2.LIZIZ(r10, r0, r7)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r6) goto La3
            return r6
        L76:
            X.BhN r2 = r9.xl()     // Catch: java.lang.Throwable -> L9e
            r7.LJLIL = r9     // Catch: java.lang.Throwable -> L9e
            r7.LJLILLLLZI = r11     // Catch: java.lang.Throwable -> L9e
            r7.LJLJI = r12     // Catch: java.lang.Throwable -> L9e
            r7.LJLJJLL = r8     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r0 = r2.LIZIZ(r10, r0, r7)     // Catch: java.lang.Throwable -> L9e
            if (r0 != r6) goto L89
            return r6
        L89:
            r0 = r9
            goto L8e
        L8b:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L9f
        L8e:
            r0.Dl(r11, r12)     // Catch: java.lang.Throwable -> L9f
            goto La3
        L92:
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIJI(r0)     // Catch: java.lang.Throwable -> L9e
            throw r3     // Catch: java.lang.Throwable -> L9e
        L98:
            java.lang.String r0 = "cellsContainer"
            kotlin.jvm.internal.o.LJIJI(r0)     // Catch: java.lang.Throwable -> L9e
            throw r3     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = r9
        L9f:
            r0.Dl(r11, r12)
            r5 = 0
        La3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog.vl(X.BhT, androidx.fragment.app.FragmentManager, java.lang.String, X.2kd):java.lang.Object");
    }
}
