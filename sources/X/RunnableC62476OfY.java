package X;

import Y.ACListenerS30S0100000_10;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.OfY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC62476OfY implements Runnable {
    public final /* synthetic */ SkeletonSharePanelFragment LJLIL;

    public RunnableC62476OfY(SkeletonSharePanelFragment skeletonSharePanelFragment) {
        this.LJLIL = skeletonSharePanelFragment;
    }

    public final void LIZ() {
        TuxSheet tuxSheet;
        Dialog dialog;
        View findViewById;
        int i;
        C25600zU LJJL;
        Integer LJI;
        C62387Oe7 c62387Oe7;
        SkeletonSharePanelFragment skeletonSharePanelFragment = this.LJLIL;
        skeletonSharePanelFragment.getClass();
        SystemClock.elapsedRealtime();
        try {
            c62387Oe7 = skeletonSharePanelFragment.LJLJJL;
        } catch (Exception unused) {
        }
        if (c62387Oe7 != null) {
            if (c62387Oe7.LJJIII) {
                Context context = skeletonSharePanelFragment.getContext();
                while (true) {
                    if (context != null) {
                        Activity LJIJJ = C45804HyK.LJIJJ(context);
                        if (LJIJJ != null) {
                            Vibrator vibrator = (Vibrator) C16880lQ.LLILIL(LJIJJ, "vibrator");
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (vibrator != null) {
                                    vibrator.vibrate(VibrationEffect.createOneShot(15L, 100));
                                }
                            } else if (vibrator != null) {
                                vibrator.vibrate(15L);
                            }
                        } else if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        break;
                    }
                }
            }
            try {
                if (((LinearLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.g69)) != null) {
                    SystemClock.elapsedRealtime();
                    int LJIILL = KL2.LJIILL(skeletonSharePanelFragment.getContext(), skeletonSharePanelFragment.LJLL.getPeekHeight());
                    C62387Oe7 c62387Oe72 = skeletonSharePanelFragment.LJLJJL;
                    if (c62387Oe72 != null) {
                        InterfaceC62474OfW interfaceC62474OfW = c62387Oe72.LJIILIIL;
                        if (interfaceC62474OfW != null) {
                            LinearLayout ll_skeleton_panel_root = (LinearLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.g69);
                            o.LJIIIIZZ(ll_skeleton_panel_root, "ll_skeleton_panel_root");
                            C62387Oe7 c62387Oe73 = skeletonSharePanelFragment.LJLJJL;
                            if (c62387Oe73 != null) {
                                interfaceC62474OfW.LJFF(ll_skeleton_panel_root, c62387Oe73, new C5JV(LJIILL, 1));
                            } else {
                                o.LJIJI("sharePanelConfig");
                                throw null;
                            }
                        }
                        C62387Oe7 c62387Oe74 = skeletonSharePanelFragment.LJLJJL;
                        if (c62387Oe74 != null) {
                            C62468OfQ.LJIIIZ(c62387Oe74);
                            C62387Oe7 c62387Oe75 = skeletonSharePanelFragment.LJLJJL;
                            if (c62387Oe75 != null) {
                                C62468OfQ.LJIIIIZZ(c62387Oe75);
                                if (skeletonSharePanelFragment.Jl()) {
                                    C62387Oe7 c62387Oe76 = skeletonSharePanelFragment.LJLJJL;
                                    if (c62387Oe76 != null) {
                                        InterfaceC88473Ynt<? super Integer, ? super Boolean, ? super Integer, ? extends OSZ<? extends View, ? extends FrameLayout.LayoutParams>> interfaceC88473Ynt = c62387Oe76.LJJIIZI;
                                        if (interfaceC88473Ynt != null) {
                                            Integer valueOf = Integer.valueOf(((ArrayList) skeletonSharePanelFragment.LJLIL).size());
                                            Boolean valueOf2 = Boolean.valueOf(skeletonSharePanelFragment.LJLLJ);
                                            LinearLayout ll_bottom_area_container = (LinearLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.g1y);
                                            o.LJIIIIZZ(ll_bottom_area_container, "ll_bottom_area_container");
                                            OSZ<? extends View, ? extends FrameLayout.LayoutParams> invoke = interfaceC88473Ynt.invoke(valueOf, valueOf2, Integer.valueOf(ll_bottom_area_container.getHeight()));
                                            if (invoke != null) {
                                                C62387Oe7 c62387Oe77 = skeletonSharePanelFragment.LJLJJL;
                                                if (c62387Oe77 != null) {
                                                    if (c62387Oe77.LJJII) {
                                                        if (skeletonSharePanelFragment.Kl()) {
                                                            skeletonSharePanelFragment.Gl();
                                                            LinearLayout linearLayout = (LinearLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.g69);
                                                            Context context2 = skeletonSharePanelFragment.getContext();
                                                            if (context2 != null && (LJJL = C78857UxB.LJJL(context2)) != null && (LJI = C79045V0n.LJI(R.attr.fx, LJJL)) != null) {
                                                                i = LJI.intValue();
                                                            } else {
                                                                i = 0;
                                                            }
                                                            linearLayout.setBackgroundColor(i);
                                                        }
                                                    } else {
                                                        skeletonSharePanelFragment.Gl();
                                                    }
                                                    View first = invoke.getFirst();
                                                    if (first != null) {
                                                        View findViewWithTag = ((FrameLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.c2l)).findViewWithTag(6532525);
                                                        if (findViewWithTag != null) {
                                                            C16880lQ.LJLLLL(findViewWithTag, (FrameLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.c2l));
                                                        }
                                                        first.setTag(6532525);
                                                        if (invoke.getSecond() != null) {
                                                            ((FrameLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.c2l)).addView(first, invoke.getSecond());
                                                        } else {
                                                            ((FrameLayout) skeletonSharePanelFragment._$_findCachedViewById(R.id.c2l)).addView(first);
                                                        }
                                                        InterfaceC62545Ogf interfaceC62545Ogf = C62494Ofq.LIZLLL;
                                                        if (interfaceC62545Ogf != null) {
                                                            interfaceC62545Ogf.LIZJ(Boolean.TRUE);
                                                        }
                                                    }
                                                } else {
                                                    o.LJIJI("sharePanelConfig");
                                                    throw null;
                                                }
                                            }
                                        }
                                        skeletonSharePanelFragment.Gl();
                                    } else {
                                        o.LJIJI("sharePanelConfig");
                                        throw null;
                                    }
                                }
                            } else {
                                o.LJIJI("sharePanelConfig");
                                throw null;
                            }
                        } else {
                            o.LJIJI("sharePanelConfig");
                            throw null;
                        }
                    } else {
                        o.LJIJI("sharePanelConfig");
                        throw null;
                    }
                }
            } catch (Exception unused2) {
            }
            TuxSheet tuxSheet2 = skeletonSharePanelFragment.LJLILLLLZI;
            if (tuxSheet2 != null && tuxSheet2.getDialog() != null && (tuxSheet = skeletonSharePanelFragment.LJLILLLLZI) != null && (dialog = tuxSheet.getDialog()) != null && (findViewById = dialog.findViewById(R.id.liz)) != null) {
                C16880lQ.LJIIJ(new ACListenerS30S0100000_10(skeletonSharePanelFragment, 106), findViewById);
                return;
            }
            return;
        }
        o.LJIJI("sharePanelConfig");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
