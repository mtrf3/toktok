package Y;

import X.AbstractC027608y;
import X.AbstractC030109x;
import X.AbstractC06680Oa;
import X.AbstractC16850lN;
import X.AnonymousClass139;
import X.AnonymousClass291;
import X.BPM;
import X.BZI;
import X.BinderC39601gy;
import X.C021006k;
import X.C021106l;
import X.C03070Ad;
import X.C03080Ae;
import X.C03150Al;
import X.C03970Dp;
import X.C04740Go;
import X.C06460Ne;
import X.C09630Zj;
import X.C09970aH;
import X.C09O;
import X.C09T;
import X.C09U;
import X.C0AM;
import X.C0AR;
import X.C0B6;
import X.C0BJ;
import X.C0EV;
import X.C0GY;
import X.C0NB;
import X.C0RD;
import X.C0VT;
import X.C0VU;
import X.C0VW;
import X.C0ZY;
import X.C12F;
import X.C14520hc;
import X.C14I;
import X.C14K;
import X.C15750jb;
import X.C16360ka;
import X.C16880lQ;
import X.C17250m1;
import X.C19000oq;
import X.C19110p1;
import X.C19380pS;
import X.C1BI;
import X.C1C8;
import X.C1EU;
import X.C1FB;
import X.C21260sU;
import X.C22810uz;
import X.C22830v1;
import X.C23770wX;
import X.C25140yk;
import X.C25380z8;
import X.C25530zN;
import X.C265012g;
import X.C28787BRn;
import X.C28R;
import X.C29251Cv;
import X.C29401Dk;
import X.C29681Em;
import X.C29921Fk;
import X.C2A4;
import X.C30868C9o;
import X.C31041Js;
import X.C34811Yf;
import X.C35591aV;
import X.C36801cS;
import X.C37661dq;
import X.C38459F7n;
import X.C40171ht;
import X.C41481k0;
import X.C42681lw;
import X.C42951mN;
import X.C43731nd;
import X.C44061oA;
import X.C44521ou;
import X.C47121t6;
import X.C61447O9r;
import X.C63986P9i;
import X.C76L;
import X.IRT;
import X.InterfaceC03990Dr;
import X.InterfaceC04000Ds;
import X.InterfaceC13800gS;
import X.InterfaceC15040iS;
import X.InterfaceC30442Bx8;
import X.MPE;
import X.PCD;
import X.PCE;
import X.PH3;
import X.PK0;
import X.PKN;
import X.RunnableC20560rM;
import X.RunnableC25350z5;
import X.RunnableC31065CHd;
import X.X1D;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.bytedance.RxLiveEvent;
import com.bytedance.android.live.broadcast.highlight.DownloadProgressDialog;
import com.bytedance.android.live.effect.filter.LiveFilterFragment;
import com.bytedance.android.live.effect.filter.composerfilter.LiveComposerFilterFragment;
import com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS29S0200000 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

    public final void LIZ$10() {
        if (C17250m1.LIZ().LJIIIIZZ()) {
            int size = ((ArrayList) ((LiveComposerFilterFragment) this.l0).LJLJJI).size();
            for (int i = 0; i < size; i++) {
                if (((LiveEffect) ListProtector.get(((LiveComposerFilterFragment) this.l0).LJLJJI, i)).isNew) {
                    ((RunnableC31065CHd) this.l1).LJLI(i);
                    C17250m1.LIZ().LJIIJJI();
                    return;
                }
            }
        }
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) this.l1;
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        runnableC31065CHd.LJLI(LIZJ.intValue());
    }

    public final void LIZ$16() {
        View view;
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            Object changes = it.next();
            o.LJIIIIZZ(changes, "changes");
            C14I c14i = (C14I) changes;
            C44521ou c44521ou = (C44521ou) this.l1;
            c44521ou.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("animateChangeImpl, from (");
            LIZ.append(c14i.LIZJ);
            LIZ.append(", ");
            LIZ.append(c14i.LIZLLL);
            LIZ.append(") to (");
            LIZ.append(c14i.LJ);
            LIZ.append(", ");
            LIZ.append(c14i.LJFF);
            LIZ.append(')');
            C0NB.LIZIZ("BaseAnimator", X1D.LIZIZ(LIZ));
            RecyclerView.ViewHolder viewHolder = c14i.LIZ;
            View view2 = null;
            if (viewHolder != null) {
                view = viewHolder.itemView;
            } else {
                view = null;
            }
            RecyclerView.ViewHolder viewHolder2 = c14i.LIZIZ;
            if (viewHolder2 != null) {
                view2 = viewHolder2.itemView;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c44521ou.LJFF);
                o.LJIIIIZZ(duration, "view.animate().setDurati…ngeDuration\n            )");
                c44521ou.LJIIZILJ.add(c14i.LIZ);
                duration.translationX(c14i.LJ - c14i.LIZJ);
                duration.translationY(c14i.LJFF - c14i.LIZLLL);
                duration.alpha(0.0f).setListener(new IDLAdapterS0S0400000(c44521ou, c14i, duration, view, 6)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c44521ou.LJIIZILJ.add(c14i.LIZIZ);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c44521ou.LJFF).alpha(1.0f).setListener(new IDLAdapterS0S0400000(c44521ou, c14i, animate, view2, 7)).start();
            }
        }
        ((ArrayList) this.l0).clear();
        ((C44521ou) this.l1).LJIILIIL.remove((ArrayList) this.l0);
    }

    public final void LIZ$9() {
        if (C15750jb.LIZ.LJIIJ()) {
            int size = ((ArrayList) ((LiveFilterFragment) this.l0).LJLIL).size();
            for (int i = 0; i < size; i++) {
                if (((LiveEffect) ListProtector.get(((LiveFilterFragment) this.l0).LJLIL, i)).isNew) {
                    ((RunnableC31065CHd) this.l1).LJLI(i);
                    C15750jb.LIZ.LJIILL();
                    return;
                }
            }
        }
        RunnableC31065CHd runnableC31065CHd = (RunnableC31065CHd) this.l1;
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        runnableC31065CHd.LJLI(LIZJ.intValue());
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
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                run$16(this);
                return;
            case 17:
                run$17(this);
                return;
            case 18:
                run$18(this);
                return;
            case 19:
                run$19(this);
                return;
            case 20:
                run$20(this);
                return;
            case 21:
                run$21(this);
                return;
            case 22:
                run$22(this);
                return;
            case 23:
                run$23(this);
                return;
            case 24:
                run$24(this);
                return;
            case 25:
                run$25(this);
                return;
            case 26:
                run$26(this);
                return;
            case 27:
                run$27(this);
                return;
            case 28:
                run$28(this);
                return;
            case 29:
                run$29(this);
                return;
            case 30:
                run$30(this);
                return;
            case 31:
                run$31(this);
                return;
            case 32:
                run$32(this);
                return;
            case 33:
                run$33(this);
                return;
            case 34:
                run$34(this);
                return;
            case 35:
                run$35(this);
                return;
            case 36:
                run$36(this);
                return;
            case 37:
                run$37(this);
                return;
            case 38:
                run$38(this);
                return;
            case 39:
                run$39(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                run$40(this);
                return;
            case 41:
                run$41(this);
                return;
            case 42:
                run$42(this);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                run$43(this);
                return;
            case 44:
                run$44(this);
                return;
            case 45:
                run$45(this);
                return;
            case 46:
                run$46(this);
                return;
            case 47:
                run$47(this);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                run$48(this);
                return;
            case C61447O9r.LJIIJ:
                run$49(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        try {
            Method method = C021106l.LIZLLL;
            if (method != null) {
                method.invoke(this.l0, this.l1, Boolean.FALSE, "AppCompat recreation");
            } else {
                C021106l.LJ.invoke(this.l0, this.l1, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class || e.getMessage() == null || !e.getMessage().startsWith("Unable to stop")) {
            } else {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$1() {
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            C03080Ae c03080Ae = (C03080Ae) it.next();
            final C40171ht c40171ht = (C40171ht) this.l1;
            final RecyclerView.ViewHolder viewHolder = c03080Ae.LIZ;
            int i = c03080Ae.LIZIZ;
            int i2 = c03080Ae.LIZJ;
            int i3 = c03080Ae.LIZLLL;
            int i4 = c03080Ae.LJ;
            c40171ht.getClass();
            final View view = viewHolder.itemView;
            final int i5 = i3 - i;
            final int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            final ViewPropertyAnimator animate = view.animate();
            c40171ht.LJIILL.add(viewHolder);
            animate.setDuration(c40171ht.LJIIL()).setListener(new AnimatorListenerAdapter() { // from class: X.0Ag
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    if (i5 != 0) {
                        view.setTranslationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.setTranslationY(0.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    C40171ht.this.LJII(viewHolder);
                    C40171ht.this.LJIILL.remove(viewHolder);
                    C40171ht.this.LJJIFFI();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    C40171ht.this.getClass();
                }
            }).start();
        }
        ((ArrayList) this.l0).clear();
        ((C40171ht) this.l1).LJIIL.remove((ArrayList) this.l0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$11() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS29S0200000.LIZ$11():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$12() {
        try {
            final C0VT c0vt = (C0VT) ((C43731nd) this.l0).get();
            if (c0vt != null) {
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Updating notification for %s", new Object[]{((RunnableC20560rM) this.l1).LJLJI.LIZJ});
                LIZ.getClass();
                RunnableC20560rM runnableC20560rM = (RunnableC20560rM) this.l1;
                ListenableWorker listenableWorker = runnableC20560rM.LJLJJI;
                listenableWorker.LJLJJL = true;
                C43731nd<Void> c43731nd = runnableC20560rM.LJLIL;
                C0VU c0vu = runnableC20560rM.LJLJJL;
                final Context context = runnableC20560rM.LJLILLLLZI;
                final UUID uuid = listenableWorker.LJLILLLLZI.LIZ;
                final C34811Yf c34811Yf = (C34811Yf) c0vu;
                c34811Yf.getClass();
                final C43731nd c43731nd2 = new C43731nd();
                ((C35591aV) c34811Yf.LIZ).LIZ(new Runnable() { // from class: X.0rN
                    public final void LIZ() {
                        try {
                            if (!(c43731nd2.LJLIL instanceof C22560ua)) {
                                String uuid2 = uuid.toString();
                                EnumC08510Vb LJFF = ((C1Y1) C34811Yf.this.LIZJ).LJFF(uuid2);
                                if (LJFF != null && !LJFF.isFinished()) {
                                    ((C1OR) C34811Yf.this.LIZIZ).LJI(uuid2, c0vt);
                                    C16880lQ.LLLL(context, C1DA.LIZ(context, uuid2, c0vt));
                                } else {
                                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                                }
                            }
                            c43731nd2.LJIIIIZZ(null);
                        } catch (Throwable th) {
                            c43731nd2.LJIIIZ(th);
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean LIZ2;
                        try {
                            LIZ();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
                c43731nd.LJIIJ(c43731nd2);
                return;
            }
            throw new IllegalStateException(C16880lQ.LLLZ("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{((RunnableC20560rM) this.l1).LJLJI.LIZJ}));
        } catch (Throwable th) {
            ((RunnableC20560rM) this.l1).LJLIL.LJIIIZ(th);
        }
    }

    public final void LIZ$13() {
        C21260sU c21260sU = (C21260sU) this.l1;
        IRT irt = (IRT) this.l0;
        c21260sU.getClass();
        if (C09970aH.LJII()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record batteryLog: ");
            LIZ.append(irt.toString());
            LIZ.append(" , mReportedInMainProcess: ");
            LIZ.append(c21260sU.LIZ);
            X1D.LIZIZ(LIZ);
        }
        if (c21260sU.LIZ || !C09970aH.LJIIIIZZ()) {
            if (TextUtils.isEmpty(c21260sU.LIZJ)) {
                c21260sU.LIZJ = String.valueOf(System.currentTimeMillis());
            }
            irt.LJIIJ = C09970aH.LJIIIIZZ();
            irt.LJIIIZ = C09970aH.LIZIZ();
            irt.LJIIJJI = c21260sU.LIZJ;
            if (TextUtils.isEmpty(irt.LJFF)) {
                irt.LJFF = c21260sU.LIZIZ;
            }
            try {
                if (C09970aH.LJII()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("saveBatteryLog into db: ");
                    LIZ2.append(irt);
                    X1D.LIZIZ(LIZ2);
                }
                c21260sU.LIZIZ().LJFF(irt);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        irt.LJFF = c21260sU.LIZIZ;
        synchronized (c21260sU.LJ) {
            if (c21260sU.LJ.size() > 100) {
                c21260sU.LJ.poll();
            }
            c21260sU.LJ.add(irt);
        }
    }

    public final void LIZ$14() {
        C04740Go lottieDrawable = ((C23770wX) this.l1).LIZ;
        Bitmap bitmap = (Bitmap) this.l0;
        o.LJIIJ(lottieDrawable, "lottieDrawable");
        o.LJIIJ(bitmap, "bitmap");
        ArrayList<Bitmap> arrayList = C25140yk.LIZ.get(Integer.valueOf(lottieDrawable.hashCode()));
        if (arrayList != null) {
            synchronized (arrayList) {
                if (!arrayList.contains(bitmap)) {
                    arrayList.add(bitmap);
                }
            }
        }
    }

    public final void LIZ$15() {
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            Object additions = it.next();
            o.LJIIIIZZ(additions, "additions");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) additions;
            C44521ou c44521ou = (C44521ou) this.l1;
            c44521ou.getClass();
            C0NB.LIZIZ("BaseAnimator", "animateAddImpl");
            View view = viewHolder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            ViewPropertyAnimator animate = view.animate();
            c44521ou.LJIILJJIL.add(viewHolder);
            animate.alpha(1.0f).setDuration(c44521ou.LIZJ).setListener(new IDLAdapterS0S0400000(view, animate, viewHolder, c44521ou, 5)).start();
        }
        ((ArrayList) this.l0).clear();
        ((C44521ou) this.l1).LJIIJJI.remove((ArrayList) this.l0);
    }

    public final void LIZ$17() {
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            Object moves = it.next();
            o.LJIIIIZZ(moves, "moves");
            C14K c14k = (C14K) moves;
            C44521ou c44521ou = (C44521ou) this.l1;
            final RecyclerView.ViewHolder holder = c14k.LIZ;
            final int i = c14k.LIZIZ;
            final int i2 = c14k.LIZJ;
            final int i3 = c14k.LIZLLL;
            final int i4 = c14k.LJ;
            final C28R c28r = (C28R) c44521ou;
            c28r.getClass();
            o.LJIIIZ(holder, "holder");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("animateMoveImpl, from (");
            LIZ.append(i);
            LIZ.append(", ");
            LIZ.append(i2);
            C1EU.LIZJ(LIZ, ") to (", i3, ", ", i4);
            LIZ.append(')');
            C0NB.LIZIZ("BaseAnimator", X1D.LIZIZ(LIZ));
            if (!c28r.LJIJJ ? !(i3 > i || i4 > i2) : !(i > i3 || i4 > i2)) {
                if (i3 != i || c28r.LJIJI + i4 < i2) {
                    final ViewPropertyAnimator animate = holder.itemView.animate();
                    animate.scaleX(0.01f);
                    animate.scaleY(0.01f);
                    animate.setDuration(150L);
                    animate.withEndAction(new Runnable() { // from class: X.14N
                        public final void LIZ() {
                            final RecyclerView.ViewHolder viewHolder = RecyclerView.ViewHolder.this;
                            View view = viewHolder.itemView;
                            final int i5 = i;
                            final int i6 = i3;
                            final int i7 = i2;
                            final int i8 = i4;
                            final C28R c28r2 = c28r;
                            view.setTranslationX(0.0f);
                            view.setTranslationY(0.0f);
                            final ViewPropertyAnimator animate2 = view.animate();
                            animate2.scaleX(1.0f);
                            animate2.scaleY(1.0f);
                            animate2.setDuration(150L);
                            animate2.setListener(new Animator.AnimatorListener() { // from class: X.14M
                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationRepeat(Animator p0) {
                                    o.LJIIIZ(p0, "p0");
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    o.LJIIIZ(animator, "animator");
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationCancel(Animator animator) {
                                    o.LJIIIZ(animator, "animator");
                                    RecyclerView.ViewHolder viewHolder2 = viewHolder;
                                    View view2 = viewHolder2.itemView;
                                    int i9 = i5;
                                    int i10 = i6;
                                    int i11 = i7;
                                    int i12 = i8;
                                    view2.setScaleX(1.0f);
                                    view2.setScaleY(1.0f);
                                    if (i9 != i10) {
                                        viewHolder2.itemView.setTranslationX(0.0f);
                                    }
                                    if (i11 != i12) {
                                        viewHolder2.itemView.setTranslationY(0.0f);
                                    }
                                }

                                @Override // android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    o.LJIIIZ(animator, "animator");
                                    animate2.setListener(null);
                                    c28r2.LJII(viewHolder);
                                    c28r2.LJIILL.remove(viewHolder);
                                    c28r2.LJJIFFI();
                                }
                            }).start();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean LIZ2;
                            try {
                                LIZ();
                            } finally {
                                if (LIZ2) {
                                }
                            }
                        }
                    }).setListener(new Animator.AnimatorListener() { // from class: X.14O
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator p0) {
                            o.LJIIIZ(p0, "p0");
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator p0) {
                            o.LJIIIZ(p0, "p0");
                            RecyclerView.ViewHolder viewHolder = holder;
                            View view = viewHolder.itemView;
                            int i5 = i;
                            int i6 = i3;
                            int i7 = i2;
                            int i8 = i4;
                            view.setScaleX(1.0f);
                            view.setScaleY(1.0f);
                            if (i5 != i6) {
                                viewHolder.itemView.setTranslationX(0.0f);
                            }
                            if (i7 != i8) {
                                viewHolder.itemView.setTranslationY(0.0f);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            o.LJIIIZ(animator, "animator");
                            animate.setListener(null);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            o.LJIIIZ(animator, "animator");
                            c28r.getClass();
                        }
                    }).start();
                }
            }
            StringBuilder LIZJ = C06460Ne.LIZJ("animateMoveImpl, from (", i, ", ", i2, ") to (");
            LIZJ.append(i3);
            LIZJ.append(", ");
            LIZJ.append(i4);
            LIZJ.append(')');
            C0NB.LIZIZ("BaseAnimator", X1D.LIZIZ(LIZJ));
            final View view = holder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            final int i5 = i3 - i;
            final int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            final ViewPropertyAnimator animate2 = view.animate();
            c28r.LJIILL.add(holder);
            animate2.setDuration(c28r.LJ).setListener(new AnimatorListenerAdapter() { // from class: X.14L
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    if (i5 != 0) {
                        view.setTranslationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.setTranslationY(0.0f);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    animate2.setListener(null);
                    c28r.LJII(holder);
                    c28r.LJIILL.remove(holder);
                    c28r.LJJIFFI();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    o.LJIIIZ(animator, "animator");
                    c28r.getClass();
                }
            }).start();
        }
        ((ArrayList) this.l0).clear();
        ((C44521ou) this.l1).LJIIL.remove((ArrayList) this.l0);
    }

    public final void LIZ$2() {
        View view;
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            C03070Ad c03070Ad = (C03070Ad) it.next();
            C40171ht c40171ht = (C40171ht) this.l1;
            c40171ht.getClass();
            RecyclerView.ViewHolder viewHolder = c03070Ad.LIZ;
            View view2 = null;
            if (viewHolder == null) {
                view = null;
            } else {
                view = viewHolder.itemView;
            }
            RecyclerView.ViewHolder viewHolder2 = c03070Ad.LIZIZ;
            if (viewHolder2 != null) {
                view2 = viewHolder2.itemView;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(c40171ht.LJIIJJI());
                c40171ht.LJIIZILJ.add(c03070Ad.LIZ);
                duration.translationX(c03070Ad.LJ - c03070Ad.LIZJ);
                duration.translationY(c03070Ad.LJFF - c03070Ad.LIZLLL);
                duration.alpha(0.0f).setListener(new IDLAdapterS0S0400000(c03070Ad, duration, view, c40171ht, 2)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                c40171ht.LJIIZILJ.add(c03070Ad.LIZIZ);
                animate.translationX(0.0f).translationY(0.0f).setDuration(c40171ht.LJIIJJI()).alpha(1.0f).setListener(new IDLAdapterS0S0400000(c03070Ad, animate, view2, c40171ht, 3)).start();
            }
        }
        ((ArrayList) this.l0).clear();
        ((C40171ht) this.l1).LJIILIIL.remove((ArrayList) this.l0);
    }

    public final void LIZ$3() {
        Iterator it = ((ArrayList) this.l0).iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
            C40171ht c40171ht = (C40171ht) this.l1;
            c40171ht.getClass();
            View view = viewHolder.itemView;
            ViewPropertyAnimator animate = view.animate();
            c40171ht.LJIILJJIL.add(viewHolder);
            animate.alpha(1.0f).setDuration(c40171ht.LIZJ).setListener(new IDLAdapterS0S0400000(view, animate, c40171ht, viewHolder, 1)).start();
        }
        ((ArrayList) this.l0).clear();
        ((C40171ht) this.l1).LJIIJJI.remove((ArrayList) this.l0);
    }

    public final void LIZ$4() {
        RecyclerView recyclerView = ((C1C8) this.l1).LJZ;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            C0B6 c0b6 = (C0B6) this.l0;
            if (!c0b6.LJLLI && c0b6.LJLJJL.getAbsoluteAdapterPosition() != -1) {
                AbstractC030109x itemAnimator = ((C1C8) this.l1).LJZ.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.LJIILL(null)) {
                    C1C8 c1c8 = (C1C8) this.l1;
                    int size = ((ArrayList) c1c8.LJLLLLLL).size();
                    for (int i = 0; i < size; i++) {
                        if (((C0B6) ListProtector.get(c1c8.LJLLLLLL, i)).LJLLILLLL) {
                        }
                    }
                    ((C1C8) this.l1).LJLLJ.LJIILL(((C0B6) this.l0).LJLJJL);
                    return;
                }
                ((C1C8) this.l1).LJZ.post(this);
            }
        }
    }

    public final void LIZ$5() {
        Exception exc = (Exception) this.l0;
        if (exc instanceof C29401Dk) {
            BPM bpm = new BPM();
            C0EV c0ev = (C0EV) this.l1;
            bpm.LIZ = ((C29401Dk) exc).getPrompt();
            bpm.LIZLLL = true;
            bpm.LJFF = c0ev.LIZLLL;
            C30868C9o.LJII(bpm);
            return;
        }
        BPM bpm2 = new BPM();
        C0EV c0ev2 = (C0EV) this.l1;
        bpm2.LIZJ = R.string.jwv;
        bpm2.LIZIZ = "pm_mt_LIVEKaraoke_errorToast";
        bpm2.LIZLLL = true;
        bpm2.LJFF = c0ev2.LIZLLL;
        C30868C9o.LJII(bpm2);
    }

    public final void LIZ$6() {
        InterfaceC04000Ds interfaceC04000Ds = (InterfaceC04000Ds) ((IDRunnableS2S0300000) this.l1).l1;
        AnonymousClass291 anonymousClass291 = (AnonymousClass291) this.l0;
        C1FB c1fb = (C1FB) interfaceC04000Ds;
        C04740Go c04740Go = c1fb.LIZJ;
        C0GY c0gy = c1fb.LIZ;
        C0GY c0gy2 = c04740Go.LJLILLLLZI;
        if (c0gy2 == null || c0gy2 != c0gy) {
            return;
        }
        c04740Go.invalidateSelf();
        if (anonymousClass291 != null) {
            C04740Go c04740Go2 = c1fb.LIZJ;
            c04740Go2.LJLLL = anonymousClass291;
            if (C03970Dp.LIZ) {
                c04740Go2.LJFF();
            }
        } else {
            c1fb.LIZJ.LIZJ();
        }
        c1fb.LIZJ.LJIJJ();
        InterfaceC03990Dr interfaceC03990Dr = c1fb.LIZIZ;
        if (interfaceC03990Dr == null) {
            return;
        }
        ((C29681Em) interfaceC03990Dr).LIZ.setCompositionAfter(true);
    }

    public final void LIZ$7() {
        DataChannel dataChannel = ((LiveVoiceEffectDialogFragment) this.l0).dataChannel;
        LiveEffect liveEffect = (LiveEffect) this.l1;
        o.LJIIIZ(liveEffect, "liveEffect");
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_voice_effective_use");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(liveEffect.nameForEnglish, "effect_name");
        LIZ.LJIJJ(Long.valueOf(liveEffect.effectId), "effect_id");
        LIZ.LJIJJ(liveEffect.getResourceId(), "resource_id");
        LIZ.LJIJJ(AnonymousClass139.LIZIZ, "select_scene");
        LIZ.LJJIIJZLJL();
    }

    public final void LIZ$8() {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("Scheduling work %s", new Object[]{((C19380pS) this.l0).LIZ});
        LIZ.getClass();
        ((C0ZY) this.l1).LIZ.LIZJ((C19380pS) this.l0);
    }

    public static final void run$0(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((BinderC39601gy) iDRunnableS29S0200000.l1).LJLJI.LJJJI((Bundle) iDRunnableS29S0200000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C021006k) iDRunnableS29S0200000.l0).LJLIL = iDRunnableS29S0200000.l1;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            try {
                ((Runnable) iDRunnableS29S0200000.l0).run();
                ((C0BJ) iDRunnableS29S0200000.l1).LIZ();
            } catch (Throwable th) {
                ((C0BJ) iDRunnableS29S0200000.l1).LIZ();
                throw th;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$16(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((RxLiveEvent) iDRunnableS29S0200000.l0).LJII(iDRunnableS29S0200000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$17(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            C22810uz remove = ((C29921Fk) iDRunnableS29S0200000.l0).LJ.remove(((C22810uz) iDRunnableS29S0200000.l1).LIZ);
            if (remove != null) {
                ((C29921Fk) iDRunnableS29S0200000.l0).LIZJ(remove);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$18(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            if (((C22810uz) iDRunnableS29S0200000.l0).LJFF.compareAndSet(0, 2)) {
                ((C29921Fk) iDRunnableS29S0200000.l1).LJII(new IDRunnableS85S0100000((C22810uz) iDRunnableS29S0200000.l0, 42));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$19(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C29921Fk) iDRunnableS29S0200000.l0).LJIIIIZZ((C22810uz) iDRunnableS29S0200000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((Application) iDRunnableS29S0200000.l0).unregisterActivityLifecycleCallbacks((C021006k) iDRunnableS29S0200000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$20(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            if (((C22810uz) iDRunnableS29S0200000.l0).LJFF.compareAndSet(0, 1)) {
                ((C22810uz) iDRunnableS29S0200000.l0).LIZJ.LJIILIIL((C22830v1) iDRunnableS29S0200000.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$21(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            if (((C22810uz) iDRunnableS29S0200000.l0).LJFF.compareAndSet(0, 1)) {
                ((C22810uz) iDRunnableS29S0200000.l0).LIZJ.LJIILIIL((C22830v1) iDRunnableS29S0200000.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$22(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$7();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$23(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            C31041Js c31041Js = (C31041Js) iDRunnableS29S0200000.l1;
            c31041Js.LIZIZ(c31041Js.LIZIZ, (C0RD) iDRunnableS29S0200000.l0, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$24(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$8();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$25(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            if (C63986P9i.LJIIIZ(PK0.LJIIIIZZ.getNativeCrashUploadUrl(), ((PKN) iDRunnableS29S0200000.l0).LIZ.toString(), (File) iDRunnableS29S0200000.l1).LIZ == 0) {
                C09630Zj.LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$26(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            C38459F7n c38459F7n = (C38459F7n) iDRunnableS29S0200000.l0;
            PCE.LIZLLL(new PCD(c38459F7n.LIZ, c38459F7n.LIZIZ, null, c38459F7n.LIZJ, c38459F7n.LIZLLL, (JSONObject) iDRunnableS29S0200000.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$27(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            MPE mpe = (MPE) iDRunnableS29S0200000.l0;
            Typeface typeface = (Typeface) iDRunnableS29S0200000.l1;
            AbstractC06680Oa abstractC06680Oa = ((C41481k0) mpe).LJLJLJ;
            if (abstractC06680Oa != null) {
                abstractC06680Oa.LIZLLL(typeface);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$28(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((InterfaceC15040iS) iDRunnableS29S0200000.l0).accept(iDRunnableS29S0200000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$29(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C42681lw) iDRunnableS29S0200000.l0).LJJIJ((List) iDRunnableS29S0200000.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$30(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        C42951mN<C2A4> c42951mN;
        try {
            ViewGroup viewGroup = ((C14520hc) iDRunnableS29S0200000.l0).LIZIZ;
            if (viewGroup != null) {
                C16880lQ.LJLLL((C2A4) iDRunnableS29S0200000.l1, viewGroup);
            }
            if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable() && (c42951mN = ((C14520hc) iDRunnableS29S0200000.l0).LJFF) != null) {
                c42951mN.LIZ((C2A4) iDRunnableS29S0200000.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$31(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$9();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$32(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            Iterator it = ((List) iDRunnableS29S0200000.l0).iterator();
            while (it.hasNext()) {
                ((InterfaceC13800gS) it.next()).LIZ(((AbstractC16850lN) iDRunnableS29S0200000.l1).LJ);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$33(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$10();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$34(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$11();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$35(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            C19000oq c19000oq = (C19000oq) iDRunnableS29S0200000.l1;
            c19000oq.LIZJ.LIZ(c19000oq.LIZ, (C19110p1) iDRunnableS29S0200000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$36(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C43731nd) iDRunnableS29S0200000.l0).LJIIJ(((RunnableC20560rM) iDRunnableS29S0200000.l1).LJLJJI.LIZ());
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$37(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$12();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$38(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$13();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$39(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$14();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            int size = ((ArrayList) iDRunnableS29S0200000.l0).size();
            for (int i = 0; i < size; i++) {
                View view = (View) ListProtector.get((ArrayList) iDRunnableS29S0200000.l0, i);
                String LJIIJ = C16360ka.LJIIJ(view);
                if (LJIIJ != null) {
                    C16360ka.LJIJJLI(view, AbstractC027608y.findKeyForValue((Map) iDRunnableS29S0200000.l1, LJIIJ));
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$40(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            synchronized (((ConstraintTrackingWorker) iDRunnableS29S0200000.l1).LJLJL) {
                if (((ConstraintTrackingWorker) iDRunnableS29S0200000.l1).LJLJLJ) {
                    ((ConstraintTrackingWorker) iDRunnableS29S0200000.l1).LJLJLLL.LJIIIIZZ(new C29251Cv());
                } else {
                    ((ConstraintTrackingWorker) iDRunnableS29S0200000.l1).LJLJLLL.LJIIJ((C76L) iDRunnableS29S0200000.l0);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$41(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            RunnableC25350z5 runnableC25350z5 = (RunnableC25350z5) iDRunnableS29S0200000.l1;
            C25380z8 c25380z8 = runnableC25350z5.LJLJJL;
            if (c25380z8.LJI == runnableC25350z5.LJLJI) {
                List<T> list = runnableC25350z5.LJLILLLLZI;
                C03150Al c03150Al = (C03150Al) iDRunnableS29S0200000.l0;
                Runnable runnable = runnableC25350z5.LJLJJI;
                Collection collection = c25380z8.LJFF;
                c25380z8.LJ = list;
                c25380z8.LJFF = Collections.unmodifiableList(list);
                c03150Al.LIZIZ(c25380z8.LIZ);
                c25380z8.LIZ(collection, runnable);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$42(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C44061oA) iDRunnableS29S0200000.l1).LJLILLLLZI.add((PH3) iDRunnableS29S0200000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$43(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C44061oA) iDRunnableS29S0200000.l1).LJLILLLLZI.remove((PH3) iDRunnableS29S0200000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$44(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            ((C25530zN) iDRunnableS29S0200000.l1).LIZ.addAll((Set) iDRunnableS29S0200000.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$45(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            DownloadProgressDialog downloadProgressDialog = ((C36801cS) iDRunnableS29S0200000.l0).LIZJ;
            if (downloadProgressDialog != null) {
                int downloadProcess = ((DownloadInfo) iDRunnableS29S0200000.l1).getDownloadProcess();
                ProgressBar progressBar = downloadProgressDialog.LJLIL;
                if (progressBar != null) {
                    progressBar.setProgress(downloadProcess);
                }
                C47121t6 c47121t6 = downloadProgressDialog.LJLILLLLZI;
                if (c47121t6 != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(downloadProcess);
                    LIZ2.append('%');
                    c47121t6.setText(X1D.LIZIZ(LIZ2));
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$46(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            Rect rect = new Rect();
            ((View) iDRunnableS29S0200000.l0).getWindowVisibleDisplayFrame(rect);
            if (rect.top == 0) {
                ((C37661dq) iDRunnableS29S0200000.l1).getClass();
            }
            C37661dq c37661dq = (C37661dq) iDRunnableS29S0200000.l1;
            c37661dq.getClass();
            C12F c12f = C12F.CMD_ORIENTATION_CHANGED;
            c12f.setParam(new C265012g(true, 0));
            c37661dq.LJIJ(c12f);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$47(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$15();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$48(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$16();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$49(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$17();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            int size = ((ArrayList) iDRunnableS29S0200000.l0).size();
            for (int i = 0; i < size; i++) {
                View view = (View) ListProtector.get((ArrayList) iDRunnableS29S0200000.l0, i);
                C16360ka.LJIJJLI(view, (String) ((Map) iDRunnableS29S0200000.l1).get(C16360ka.LJIIJ(view)));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            C09O remove = ((C09T) iDRunnableS29S0200000.l1).LIZ.LJLJJI.remove(((C1BI) ((C09U) iDRunnableS29S0200000.l0)).LIZ());
            if (remove != null) {
                ((C1BI) remove.LJLJJI).LIZ().unlinkToDeath(remove, 0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            IBinder LIZ2 = ((C1BI) ((C09U) iDRunnableS29S0200000.l0)).LIZ();
            C09O remove = ((C09T) iDRunnableS29S0200000.l1).LIZ.LJLJJI.remove(LIZ2);
            if (remove != null) {
                LIZ2.unlinkToDeath(remove, 0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            C0AM c0am = (C0AM) iDRunnableS29S0200000.l1;
            C0AR c0ar = c0am.LJLJJL;
            if (c0ar.LJI == c0am.LJLJI) {
                List<T> list = c0am.LJLILLLLZI;
                C03150Al c03150Al = (C03150Al) iDRunnableS29S0200000.l0;
                Runnable runnable = c0am.LJLJJI;
                Collection collection = c0ar.LJFF;
                c0ar.LJ = list;
                c0ar.LJFF = Collections.unmodifiableList(list);
                c03150Al.LIZIZ(c0ar.LIZ);
                c0ar.LIZ(collection, runnable);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(IDRunnableS29S0200000 iDRunnableS29S0200000) {
        boolean LIZ;
        try {
            iDRunnableS29S0200000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public IDRunnableS29S0200000(X.C22810uz r2, X.C29921Fk r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 17: goto Le;
                case 18: goto L5;
                case 19: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS29S0200000.<init>(X.0uz, X.1Fk, int):void");
    }

    public IDRunnableS29S0200000(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public IDRunnableS29S0200000(C1C8 c1c8, C0B6 c0b6, int i, int i2) {
        this.$t = i2;
        this.l1 = c1c8;
        this.l0 = c0b6;
    }
}
