package com.bytedance.android.livesdk.pip;

import X.B5Y;
import X.B6S;
import X.B6T;
import X.B83;
import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C28507BGt;
import X.C29374Bfu;
import X.C47121t6;
import X.C76800UCe;
import X.CN1;
import X.CVR;
import X.InterfaceC28738BPq;
import X.InterfaceC65784Pro;
import X.KL2;
import X.QZY;
import X.X1D;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePipTextureViewEnableSetting;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PipVideoViewContainDialog extends LiveDialogFragment {
    public String LJLIL;
    public FrameLayout LJLILLLLZI;
    public FrameLayout LJLJI;
    public View LJLJJI;
    public CVR LJLJJL;
    public ViewGroup LJLJJLL;
    public ViewGroup LJLJL;
    public C47121t6 LJLJLJ;
    public C47121t6 LJLJLLL;
    public B6T LJLL;
    public int LJLLI;
    public long LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.dg4);
        c28507BGt.LIZJ = R.style.acj;
        c28507BGt.LIZIZ = 1;
        c28507BGt.LJI = 0.0f;
        c28507BGt.LJIIIZ = -1;
        c28507BGt.LJIIJ = -1;
        c28507BGt.LJII = 17;
        return c28507BGt;
    }

    public final void vl() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        FrameLayout frameLayout = this.LJLJI;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (frameLayout != null) {
            layoutParams = frameLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            FrameLayout frameLayout2 = this.LJLJI;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
            FrameLayout frameLayout3 = this.LJLJI;
            if (frameLayout3 != null) {
                frameLayout3.setTranslationX(0.0f);
            }
            FrameLayout frameLayout4 = this.LJLJI;
            if (frameLayout4 != null) {
                frameLayout4.setTranslationY(0.0f);
            }
        }
        View view = this.LJLJJI;
        if (view != null) {
            layoutParams2 = view.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.rightMargin = 0;
            marginLayoutParams2.bottomMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            if (view != null) {
                view.setLayoutParams(layoutParams2);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
            }
        }
        ViewGroup viewGroup = this.LJLJL;
        if (viewGroup != null) {
            layoutParams3 = viewGroup.getLayoutParams();
        }
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams3.topMargin = 0;
            marginLayoutParams3.rightMargin = 0;
            marginLayoutParams3.bottomMargin = 0;
            marginLayoutParams3.leftMargin = 0;
            if (viewGroup != null) {
                viewGroup.setLayoutParams(layoutParams3);
                viewGroup.setTranslationX(0.0f);
                viewGroup.setTranslationY(0.0f);
            }
        }
        C0NB.LJIIIZ("picture_in_picture", " adapterPipLayout, ");
        FrameLayout frameLayout5 = this.LJLJI;
        if (frameLayout5 != null) {
            frameLayout5.measure(0, 0);
        }
    }

    public final void wl() {
        View videoView;
        Integer num;
        FrameLayout frameLayout = this.LJLILLLLZI;
        if (frameLayout != null && frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(this.LJLIL);
        if (LIZIZ != null && (videoView = LIZIZ.getVideoView()) != null) {
            this.LJLJJI = videoView;
            if (videoView.getParent() instanceof ViewGroup) {
                ViewParent parent = videoView.getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                C16880lQ.LJLLL(videoView, (ViewGroup) parent);
            }
            FrameLayout frameLayout2 = this.LJLILLLLZI;
            if (frameLayout2 != null) {
                frameLayout2.addView(videoView);
            }
            vl();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("  mPipVideoViewContainer?.addView(mVideoView)width: ");
            LIZ.append(videoView.getWidth());
            LIZ.append(",height: ");
            LIZ.append(videoView.getHeight());
            LIZ.append(",mPipVideoViewContainer width: ");
            FrameLayout frameLayout3 = this.LJLILLLLZI;
            Integer num2 = null;
            if (frameLayout3 != null) {
                num = Integer.valueOf(frameLayout3.getWidth());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(",mPipVideoViewContainer height: ");
            FrameLayout frameLayout4 = this.LJLILLLLZI;
            if (frameLayout4 != null) {
                num2 = Integer.valueOf(frameLayout4.getHeight());
            }
            QZY.LIZJ(LIZ, num2, LIZ, "picture_in_picture");
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        this.LJLLILLLL = 0L;
        B6T b6t = this.LJLL;
        if (b6t != null) {
            b6t.LIZJ.removeCallbacks(b6t.LIZLLL);
            b6t.LIZJ.removeCallbacks(b6t.LJ);
        }
        this.LJLL = null;
        this.LJLIL = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewParent viewParent;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJI = (FrameLayout) view.findViewById(R.id.j71);
        this.LJLILLLLZI = (FrameLayout) view.findViewById(R.id.hqc);
        this.LJLJL = (ViewGroup) view.findViewById(R.id.fwl);
        this.LJLJLJ = (C47121t6) view.findViewById(R.id.hq8);
        this.LJLJLLL = (C47121t6) view.findViewById(R.id.bw3);
        this.LJLJJL = (CVR) view.findViewById(R.id.fxn);
        if (LivePipTextureViewEnableSetting.INSTANCE.getValue()) {
            InterfaceC28738BPq LIZIZ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZIZ(this.LJLIL);
            if (LIZIZ != null) {
                int videoSize = LIZIZ.getVideoSize() & 65535;
                int videoSize2 = LIZIZ.getVideoSize() >> 16;
                this.LJLJJI = LIZIZ.getVideoView();
                CVR cvr = this.LJLJJL;
                if (cvr != null) {
                    cvr.setVideoSize(videoSize, videoSize2);
                }
                CVR cvr2 = this.LJLJJL;
                if (cvr2 != null) {
                    cvr2.LIZ(0, "pip");
                }
                LIZIZ.LJJJJJ(this.LJLJJL);
                return;
            }
            return;
        }
        vl();
        if (((IInteractService) CN1.LIZ(IInteractService.class)).xz(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()) == B5Y.GUEST_AUDIENCE) {
            SurfaceView Bo = ((IInteractService) CN1.LIZ(IInteractService.class)).Bo();
            FrameLayout frameLayout = this.LJLILLLLZI;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(-16777216);
            }
            if (Bo != null && this.LJLLILLLL != 0) {
                this.LJLJJI = Bo;
                FrameLayout frameLayout2 = this.LJLILLLLZI;
                if (frameLayout2 != null && frameLayout2.getChildCount() > 0) {
                    frameLayout2.removeAllViews();
                }
                C0NB.LIZIZ("picture_in_picture", "  addLinkRoomVideoView");
                View view2 = this.LJLJJI;
                ViewParent viewParent2 = null;
                if (view2 != null) {
                    viewParent = view2.getParent();
                } else {
                    viewParent = null;
                }
                if (viewParent instanceof ViewGroup) {
                    View view3 = this.LJLJJI;
                    if (view3 != null) {
                        viewParent2 = view3.getParent();
                    }
                    o.LJII(viewParent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ViewGroup viewGroup = (ViewGroup) viewParent2;
                    this.LJLJJLL = viewGroup;
                    C16880lQ.LJLLL(this.LJLJJI, viewGroup);
                }
                FrameLayout frameLayout3 = this.LJLILLLLZI;
                if (frameLayout3 != null) {
                    frameLayout3.addView(this.LJLJJI);
                }
                vl();
                return;
            }
            wl();
            return;
        }
        wl();
    }

    public final void xl(int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLLI = i;
        KL2.LJIILLIIL(0, this.LJLJL);
        KL2.LJIILLIIL(8, this.LJLILLLLZI);
        vl();
        C47121t6 c47121t6 = this.LJLJLJ;
        if (c47121t6 != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                c47121t6.setText(C15380j0.LJIILJJIL(R.string.jyh));
                            }
                        } else {
                            c47121t6.setText(C15380j0.LJIILJJIL(R.string.m8c));
                        }
                    } else {
                        c47121t6.setText(C15380j0.LJIILJJIL(R.string.nnk));
                    }
                } else {
                    c47121t6.setText(C15380j0.LJIILJJIL(R.string.nnh));
                }
            } else {
                c47121t6.setText(C15380j0.LJIILJJIL(R.string.nnj));
            }
        }
        if (this.LJLL != null) {
            return;
        }
        B6S b6s = new B6S(this, interfaceC65784Pro);
        B6T b6t = new B6T(b6s);
        this.LJLL = b6t;
        b6s.onStart(b6t.LIZ);
        b6t.LIZJ.postDelayed(b6t.LJ, 0L);
    }
}
