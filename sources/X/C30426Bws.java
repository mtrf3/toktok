package X;

import Y.AfS57S0100000_5;
import android.app.Dialog;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.GestureFilterPanelChannel;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS105S0101000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bws, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30426Bws extends AbstractC32821Qo {
    public final DataChannel LJLIL;
    public final int LJLILLLLZI;
    public final float LJLJI;
    public final BaseFragment LJLJJI;
    public boolean LJLJJL;
    public VelocityTracker LJLJJLL;
    public final List<FilterModel> LJLJL;
    public final C1MZ LJLJLJ;
    public final InterfaceC08070Tj<? extends LiveEffect> LJLJLLL;
    public final GestureDetector LJLL;
    public final C62822Ol8 LJLLI;
    public C73411SrX LJLLILLLL;

    @Override // X.AbstractC32821Qo
    public final void LIZJ() {
        VelocityTracker velocityTracker = this.LJLJJLL;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        VelocityTracker velocityTracker2 = this.LJLJJLL;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.LJLJJLL = null;
    }

    public final C0WG LJ() {
        return (C0WG) this.LJLLI.getValue();
    }

    @Override // X.AbstractC32821Qo
    public final int LIZ() {
        return this.LJLILLLLZI;
    }

    public final void LJFF(String str) {
        ((C32021Nm) C30355Bvj.LJIIIIZZ()).LIZJ(str, false);
        ((C32021Nm) C30355Bvj.LJIIIIZZ()).LJI(this.LJLIL, str, false, false);
        C30355Bvj.LJIIIIZZ();
        C32021Nm.LIZ(str);
    }

    public final void LJI(int i) {
        DialogFragment dialogFragment;
        Dialog dialog;
        if (this.LJLJJI.isAdded()) {
            Fragment LJJJIL = this.LJLJJI.getChildFragmentManager().LJJJIL("LiveBeautyFilterDialogFragment");
            if ((LJJJIL instanceof DialogFragment) && (dialogFragment = (DialogFragment) LJJJIL) != null && (dialog = dialogFragment.getDialog()) != null && dialog.isShowing()) {
                return;
            }
        }
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        if (LIZJ != null && LIZJ.intValue() == i) {
            return;
        }
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        this.LJLJLLL.LJFF(i);
        LJFF("FilterGestureDetector#setLiveFilterPos");
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            LJ().LIZIZ(this.LJLIL, true);
        }
        return super.onDown(motionEvent);
    }

    @Override // X.AbstractC32821Qo
    public final boolean LIZLLL(MotionEvent event, C32811Qn c32811Qn) {
        float f;
        o.LJIIIZ(event, "event");
        if (this.LJLJJLL == null) {
            this.LJLJJLL = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LJLJJLL;
        if (velocityTracker != null) {
            velocityTracker.addMovement(event);
        }
        if ((event.getAction() & 255) == 0) {
            this.LJLJJL = false;
        }
        if (event.getPointerCount() > 1) {
            this.LJLJJL = true;
        }
        if (this.LJLJJL) {
            return false;
        }
        if (event.getAction() == 1 || event.getAction() == 3) {
            LiveComposerFilterSetting liveComposerFilterSetting = LiveComposerFilterSetting.INSTANCE;
            if (liveComposerFilterSetting.isComposerSupported() && !LJ().LIZJ()) {
                this.LJLLILLLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(2L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 227));
                if (liveComposerFilterSetting.isComposerSupported()) {
                    VelocityTracker velocityTracker2 = this.LJLJJLL;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000);
                    }
                    VelocityTracker velocityTracker3 = this.LJLJJLL;
                    if (velocityTracker3 != null) {
                        f = velocityTracker3.getXVelocity();
                    } else {
                        f = 0.0f;
                    }
                    if (Math.abs(f) > 100.0f) {
                        return this.LJLL.onTouchEvent(event);
                    }
                    LJ().LJI(new AqS105S0101000_5(this, LJ().LJFF(), 1));
                    return true;
                }
                return this.LJLL.onTouchEvent(event);
            }
        }
        return this.LJLL.onTouchEvent(event);
    }

    public C30426Bws(Context context, DataChannel dataChannel, float f, BaseFragment fragment) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = dataChannel;
        this.LJLILLLLZI = 2;
        this.LJLJI = f;
        this.LJLJJI = fragment;
        ArrayList arrayList = new ArrayList();
        this.LJLJL = arrayList;
        C1MZ LJII = C30355Bvj.LJII();
        this.LJLJLJ = LJII;
        this.LJLJLLL = C30355Bvj.LJIIIZ();
        this.LJLL = new GestureDetector(context, this);
        this.LJLLI = C221108m2.LIZIZ(C30341BvV.LJLIL);
        Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        LJII.LJI(LIZJ.intValue());
        Collection collection = (Collection) dataChannel.kv0(GestureFilterPanelChannel.class);
        if (collection != null) {
            arrayList.addAll(collection);
        }
        dataChannel.ov0(fragment, GestureFilterPanelChannel.class, new AqS171S0100000_5(this, 649));
        if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            C73943T0h.LIZ().LIZJ(fragment, C11050c1.class).LIZIZ(new AfS57S0100000_5(this, 228));
        }
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        int i;
        if (motionEvent2 == null || motionEvent == null) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        if (Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) > Math.abs(motionEvent.getRawY() - motionEvent2.getRawY())) {
            z = true;
        } else {
            z = false;
        }
        LiveComposerFilterSetting liveComposerFilterSetting = LiveComposerFilterSetting.INSTANCE;
        if (!liveComposerFilterSetting.isComposerSupported() && Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
            C73943T0h LIZ = C73943T0h.LIZ();
            if (x > 0.0f) {
                i = 1;
            } else {
                i = 2;
            }
            LIZ.LIZIZ(new C11040c0(i));
            return true;
        }
        if (!liveComposerFilterSetting.isComposerSupported() || !z) {
            return false;
        }
        LJ().LJII(new AqS105S0101000_5(this, LJ().LJFF(), 0));
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float abs;
        boolean z;
        if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported() || motionEvent2 == null || motionEvent == null) {
            return false;
        }
        float rawX = motionEvent.getRawX();
        if (LJ().LIZJ()) {
            C0WG LJ = LJ();
            if (motionEvent2.getRawX() - rawX > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            LJ.LIZ(z);
            LJ().LIZIZ(this.LJLIL, false);
            LJ().LJIIIIZZ();
        }
        if (Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) > Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) {
            return false;
        }
        if (LJ().LJ()) {
            abs = Math.abs(Math.max(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LJLJI);
        } else {
            abs = 1 - Math.abs(Math.min(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / this.LJLJI);
        }
        LJ().LIZLLL(abs);
        return true;
    }
}
