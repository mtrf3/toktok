package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueFragment;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.morequeue.MoreQueueAssem;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.IDqS173S0200000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtH, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91355ZtH extends TAT {
    public final /* synthetic */ MoreQueueAssem LJLJJI;

    public C91355ZtH(MoreQueueAssem moreQueueAssem) {
        this.LJLJJI = moreQueueAssem;
    }

    @Override // X.TAT
    public final void LIZ(View view) {
        boolean z;
        Music music;
        InterfaceC91281Zs5 kt;
        FragmentManager supportFragmentManager;
        IContainerUtilityAbility a4 = this.LJLJJI.a4();
        if (a4 != null) {
            z = a4.w7();
        } else {
            z = false;
        }
        if (z) {
            MoreQueueAssem moreQueueAssem = this.LJLJJI;
            moreQueueAssem.getClass();
            IContainerUtilityAbility a42 = moreQueueAssem.a4();
            if (a42 == null || (kt = a42.kt()) == null) {
                return;
            }
            MDAudioQueueFragment mDAudioQueueFragment = new MDAudioQueueFragment(kt);
            ASL asl = new ASL();
            asl.LIZ.LJLLILLLL = mDAudioQueueFragment;
            asl.LJI(1);
            if (moreQueueAssem.LLFII != null) {
                int LJIIIZ = (int) (KL2.LJIIIZ(r0.getContext()) * 0.73f);
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLLLLL = LJIIIZ;
                tuxSheet.LJLLJ = true;
                tuxSheet.LJZL = true;
                tuxSheet.LJZI = false;
                ActivityC45651qj LIZ = C212428Vi.LIZ(moreQueueAssem);
                if (LIZ == null || (supportFragmentManager = LIZ.getSupportFragmentManager()) == null) {
                    return;
                }
                C91215Zr1.LIZLLL(new C91409Zu9(asl, supportFragmentManager, "MDAudioQueueSheet", EnumC91213Zqz.QUEUE_V2.ordinal(), moreQueueAssem));
                C91395Ztv c91395Ztv = moreQueueAssem.LLFZ;
                if (c91395Ztv == null) {
                    return;
                }
                C91301ZsP eventData = c91395Ztv.LJLJJI;
                o.LJIIIZ(eventData, "eventData");
                HashMap hashMap = new HashMap();
                hashMap.put("scene_name", eventData.LIZLLL);
                hashMap.put("enter_method", eventData.LJ);
                FMX.LJIIL("dsp_queue_click", hashMap);
                return;
            }
            o.LJIJI("moreRootView");
            throw null;
        }
        MoreQueueAssem moreQueueAssem2 = this.LJLJJI;
        C91395Ztv c91395Ztv2 = moreQueueAssem2.LLFZ;
        if (c91395Ztv2 == null || (music = c91395Ztv2.LJLLILLLL) == null) {
            return;
        }
        TuxIconView tuxIconView = moreQueueAssem2.LLFII;
        if (tuxIconView != null) {
            Context context = tuxIconView.getContext();
            o.LJIIIIZZ(context, "moreRootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI == null) {
                Activity validTopActivity = ActivityStack.getValidTopActivity();
                if (!(validTopActivity instanceof ActivityC45651qj) || (LJJIFFI = (ActivityC45651qj) validTopActivity) == null) {
                    return;
                }
            }
            C245319jz c245319jz = new C245319jz();
            C252659vp c252659vp = new C252659vp();
            c252659vp.LIZJ(R.raw.icon_flag);
            c252659vp.LIZ(R.string.q2_);
            c252659vp.LJ = new ACListenerS21S0100000_1(new IDqS173S0200000_29(moreQueueAssem2, music, 12), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LJ(C47261Igj.LJJIJ(c252659vp));
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            moreQueueAssem2.LLI = LIZJ;
            if (LIZJ == null) {
                return;
            }
            FragmentManager supportFragmentManager2 = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager2, "activity.supportFragmentManager");
            LIZJ.show(supportFragmentManager2, "MoreController:ActionSheet");
            return;
        }
        o.LJIJI("moreRootView");
        throw null;
    }
}
