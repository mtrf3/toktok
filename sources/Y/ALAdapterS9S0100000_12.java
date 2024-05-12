package Y;

import X.C29306Beo;
import X.C53799L9n;
import X.C55953Lxd;
import X.C71188Rwm;
import X.C71216RxE;
import X.C71237RxZ;
import X.C71417S1d;
import X.C73046Sle;
import X.C73053Sll;
import X.C73063Slv;
import X.C74243TBv;
import X.LC5;
import X.ORS;
import X.SY4;
import X.T5P;
import X.T5Q;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.broadcast.preview.LiveCoverCameraFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.assem.music.addtodsp.AddToMusicDspButtonAssem;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ALAdapterS9S0100000_12 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationCancel$0(this, animator);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                return;
            case 1:
                onAnimationEnd$1(this, animator);
                return;
            case 2:
                onAnimationEnd$2(this, animator);
                return;
            case 3:
                onAnimationEnd$3(this, animator);
                return;
            case 4:
                onAnimationEnd$4(this, animator);
                return;
            case 5:
                onAnimationEnd$5(this, animator);
                return;
            case 6:
                onAnimationEnd$6(this, animator);
                return;
            case 7:
                onAnimationEnd$7(this, animator);
                return;
            case 8:
                onAnimationEnd$8(this, animator);
                return;
            case 9:
            case 15:
            default:
                super.onAnimationEnd(animator);
                return;
            case 10:
                onAnimationEnd$9(this, animator);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onAnimationEnd$10(this, animator);
                return;
            case 12:
                onAnimationEnd$11(this, animator);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onAnimationEnd$12(this, animator);
                return;
            case 14:
                onAnimationEnd$13(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationEnd$14(this, animator);
                return;
            case 17:
                onAnimationEnd$15(this, animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 9:
                onAnimationStart$0(this, animator);
                return;
            case 10:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
            case 14:
            default:
                super.onAnimationStart(animator);
                return;
            case 12:
                onAnimationStart$1(this, animator);
                return;
            case 15:
                onAnimationStart$2(this, animator);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onAnimationStart$3(this, animator);
                return;
            case 17:
                onAnimationStart$4(this, animator);
                return;
        }
    }

    public ALAdapterS9S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationCancel$0(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C71188Rwm) aLAdapterS9S0100000_12.l0).LJIJI();
    }

    public static final void onAnimationEnd$0(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C73063Slv) aLAdapterS9S0100000_12.l0).setNeedShowMask(false);
        ((C73063Slv) aLAdapterS9S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationEnd$1(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C73063Slv) aLAdapterS9S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationEnd$10(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C74243TBv) aLAdapterS9S0100000_12.l0).N().setVisibility(8);
    }

    public static final void onAnimationEnd$11(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SY4 sy4 = ((AddToMusicDspButtonAssem) aLAdapterS9S0100000_12.l0).LLFZ;
        if (sy4 == null) {
            return;
        }
        sy4.setVisibility(8);
    }

    public static final void onAnimationEnd$12(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C73053Sll) aLAdapterS9S0100000_12.l0).setNeedShowMask(true);
        if (((C73053Sll) aLAdapterS9S0100000_12.l0).getNeedHide()) {
            ((C73053Sll) aLAdapterS9S0100000_12.l0).LIZJ(3000L);
        }
        ((C73053Sll) aLAdapterS9S0100000_12.l0).LIZLLL();
    }

    public static final void onAnimationEnd$13(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C71417S1d c71417S1d = (C71417S1d) aLAdapterS9S0100000_12.l0;
        LC5.LIZJ(c71417S1d.LJLLL, c71417S1d.LJLLLLLL, c71417S1d.LJLLJ, c71417S1d.LLF, LC5.LIZIZ(c71417S1d.LJLLLL), LC5.LIZIZ(((C71417S1d) aLAdapterS9S0100000_12.l0).LJLZ), new AqS178S0100000_12((C71417S1d) aLAdapterS9S0100000_12.l0, 566));
    }

    public static final void onAnimationEnd$14(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(animation, "animation");
        IIconSlot.SlotViewModel slotViewModel = ((C71188Rwm) aLAdapterS9S0100000_12.l0).LJLJL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLLLL) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        ((C71188Rwm) aLAdapterS9S0100000_12.l0).LJIJI();
    }

    public static final void onAnimationEnd$15(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJI(((LiveCoverCameraFragment) aLAdapterS9S0100000_12.l0)._$_findCachedViewById(R.id.djh));
    }

    public static final void onAnimationEnd$2(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C73063Slv) aLAdapterS9S0100000_12.l0).setNeedShowMask(true);
        ((C73063Slv) aLAdapterS9S0100000_12.l0).LIZIZ(3000L);
        ((C73063Slv) aLAdapterS9S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationEnd$3(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C73046Sle) aLAdapterS9S0100000_12.l0).setNeedShowMask(false);
        ((C73046Sle) aLAdapterS9S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationEnd$4(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        ((C73046Sle) aLAdapterS9S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationEnd$5(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C73046Sle) aLAdapterS9S0100000_12.l0).setNeedShowMask(true);
        ((C73046Sle) aLAdapterS9S0100000_12.l0).LIZIZ(3000L);
        ((C73046Sle) aLAdapterS9S0100000_12.l0).LIZJ();
    }

    public static final void onAnimationEnd$6(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator p0) {
        o.LJIIIZ(p0, "p0");
        ((C73053Sll) aLAdapterS9S0100000_12.l0).setNeedShowMask(false);
        ((C73053Sll) aLAdapterS9S0100000_12.l0).LIZLLL();
    }

    public static final void onAnimationEnd$7(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animator) {
        T5Q t5q = ((T5P) aLAdapterS9S0100000_12.l0).LJLIL;
        if (t5q != null) {
            t5q.LIZ();
        }
    }

    public static final void onAnimationEnd$8(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((SmartImageView) aLAdapterS9S0100000_12.l0, "scaleX", 0.6f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((SmartImageView) aLAdapterS9S0100000_12.l0, "scaleY", 0.6f, 1.0f);
        ofFloat.setDuration(266L);
        ofFloat.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat2.setDuration(266L);
        ofFloat2.setInterpolator(C55953Lxd.LIZLLL());
        ofFloat.start();
        ofFloat2.start();
    }

    public static final void onAnimationEnd$9(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        ((C74243TBv) aLAdapterS9S0100000_12.l0).M().setVisibility(8);
    }

    public static final void onAnimationStart$0(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        View view = (View) aLAdapterS9S0100000_12.l0;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "root.context");
        view.setBackground(context.getResources().getDrawable(R.drawable.w5));
    }

    public static final void onAnimationStart$1(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        SY4 sy4 = ((AddToMusicDspButtonAssem) aLAdapterS9S0100000_12.l0).LLI;
        if (sy4 != null) {
            sy4.setAlpha(0.0f);
        }
        SY4 sy42 = ((AddToMusicDspButtonAssem) aLAdapterS9S0100000_12.l0).LLI;
        if (sy42 != null) {
            sy42.setVisibility(0);
        }
        SY4 sy43 = ((AddToMusicDspButtonAssem) aLAdapterS9S0100000_12.l0).LLFZ;
        if (sy43 != null) {
            sy43.setAlpha(1.0f);
        }
        SY4 sy44 = ((AddToMusicDspButtonAssem) aLAdapterS9S0100000_12.l0).LLFZ;
        if (sy44 == null) {
            return;
        }
        sy44.setVisibility(0);
    }

    public static final void onAnimationStart$2(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        super.onAnimationStart(animation);
        ViewGroup viewGroup = ((C71417S1d) aLAdapterS9S0100000_12.l0).LJLLJ;
        if (viewGroup != null) {
            viewGroup.setAlpha(0.0f);
        }
        ViewGroup viewGroup2 = ((C71417S1d) aLAdapterS9S0100000_12.l0).LJLLJ;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(0);
    }

    public static final void onAnimationStart$3(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        MutableLiveData<String> mutableLiveData;
        String idStr;
        C71216RxE c71216RxE;
        MutableLiveData<String> mutableLiveData2;
        o.LJIIIZ(animation, "animation");
        C71188Rwm c71188Rwm = (C71188Rwm) aLAdapterS9S0100000_12.l0;
        int i = c71188Rwm.LLILZLL;
        if (i == 3 || i == 4) {
            IIconSlot.SlotViewModel slotViewModel = c71188Rwm.LJLJL;
            if (slotViewModel != null) {
                mutableLiveData = slotViewModel.LJLJJI;
            } else {
                mutableLiveData = null;
            }
            if (mutableLiveData != null) {
                mutableLiveData.setValue("");
            }
            IIconSlot.SlotViewModel slotViewModel2 = ((C71188Rwm) aLAdapterS9S0100000_12.l0).LJLJL;
            if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LJLLI) != null) {
                mutableLiveData2.setValue("");
            }
            Room room = ((C71188Rwm) aLAdapterS9S0100000_12.l0).LJLJLLL;
            if (room != null && (idStr = room.getIdStr()) != null && (c71216RxE = ((C71188Rwm) aLAdapterS9S0100000_12.l0).LLILZIL) != null) {
                C53799L9n.LIZLLL(5, idStr, "SLOT_LIVE_WATCHER_TOOLBAR");
                c71216RxE.LIZ("show_anim", null, true);
                C71237RxZ c71237RxZ = c71216RxE.LIZ;
                String userId = c71216RxE.LIZIZ;
                c71237RxZ.getClass();
                o.LJIIIZ(userId, "userId");
                String[] stringArray = c71237RxZ.LIZ.getStringArray(i0.LJFF("show_anim_room_set_", userId), new String[0]);
                o.LJIIIIZZ(stringArray, "keva.getStringArray(\"${S…}\", emptyArray<String>())");
                C71237RxZ c71237RxZ2 = c71216RxE.LIZ;
                ArrayList arrayList = new ArrayList();
                ORS.LJJLIIIJJIZ(arrayList, stringArray);
                arrayList.add(idStr);
                String[] roomList = (String[]) arrayList.toArray(new String[0]);
                String userId2 = c71216RxE.LIZIZ;
                c71237RxZ2.getClass();
                o.LJIIIZ(roomList, "roomList");
                o.LJIIIZ(userId2, "userId");
                c71237RxZ2.LIZ.storeStringArray(i0.LJFF("show_anim_room_set_", userId2), roomList);
            }
        }
    }

    public static final void onAnimationStart$4(ALAdapterS9S0100000_12 aLAdapterS9S0100000_12, Animator animation) {
        o.LJIIIZ(animation, "animation");
        C29306Beo.LJJLJLI(((LiveCoverCameraFragment) aLAdapterS9S0100000_12.l0)._$_findCachedViewById(R.id.djh));
    }
}
