package X;

import Y.ARunnableS34S0200000_15;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.FeedCountStickerDialogFragment;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86425Xvx extends AbstractC224038ql {
    public final C223878qV LJLLI;
    public FeedCountStickerDialogFragment LJLLILLLL;
    public C86003Xp9 LJLLJ;
    public final C86427Xvz LJLLL;
    public final Aweme LJLLLL;
    public final C86426Xvy LJLLLLLL;

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 10;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    public final C86003Xp9 LJJ() {
        CountDownStickerStruct countDownStickerStruct;
        CountDownStickerStruct countDownStickerStruct2 = null;
        if (this.LJLLJ == null) {
            C86003Xp9 c86003Xp9 = new C86003Xp9(this.LJLILLLLZI);
            this.LJLLJ = c86003Xp9;
            LinearLayout stickerView = c86003Xp9.getStickerView();
            if (stickerView != null) {
                stickerView.setVisibility(4);
            }
            C86003Xp9 c86003Xp92 = this.LJLLJ;
            if (c86003Xp92 != null) {
                InteractStickerStruct interactStickerStruct = this.LJLJLLL;
                if (interactStickerStruct != null) {
                    countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
                } else {
                    countDownStickerStruct = null;
                }
                c86003Xp92.setCountDownStickerStruct(countDownStickerStruct);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            C86003Xp9 c86003Xp93 = this.LJLLJ;
            if (c86003Xp93 != null) {
                c86003Xp93.setLayoutParams(layoutParams);
            }
            C86003Xp9 c86003Xp94 = this.LJLLJ;
            if (c86003Xp94 != null) {
                c86003Xp94.post(new ARunnableS34S0200000_15(this, c86003Xp94, 57));
            }
        }
        C86003Xp9 c86003Xp95 = this.LJLLJ;
        if (c86003Xp95 != null) {
            InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
            if (interactStickerStruct2 != null) {
                countDownStickerStruct2 = interactStickerStruct2.getCountDownStickerStruct();
            }
            c86003Xp95.setData(countDownStickerStruct2);
        }
        C86003Xp9 c86003Xp96 = this.LJLLJ;
        if (c86003Xp96 != null) {
            c86003Xp96.postInvalidate();
        }
        return this.LJLLJ;
    }

    public final void LJJI() {
        C1AU c1au;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        String str;
        String str2;
        String str3;
        CountDownStickerStruct countDownStickerStruct;
        String str4;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        CountDownStickerStruct countDownStickerStruct2;
        FeedCountStickerDialogFragment feedCountStickerDialogFragment;
        String str5;
        String str6;
        String str7;
        C223778qL c223778qL4;
        C223778qL c223778qL5;
        C223778qL c223778qL6;
        String str8 = null;
        if (this.LJLLILLLL == null) {
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            if (interactStickerStruct != null) {
                countDownStickerStruct2 = interactStickerStruct.getCountDownStickerStruct();
            } else {
                countDownStickerStruct2 = null;
            }
            Aweme aweme = this.LJLLLL;
            C245649kW c245649kW = this.LJLJJI;
            if (countDownStickerStruct2 == null) {
                feedCountStickerDialogFragment = null;
            } else {
                feedCountStickerDialogFragment = new FeedCountStickerDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("countdown_sticker_data", countDownStickerStruct2);
                bundle.putSerializable("countdown_sticker_aweme", aweme);
                if (c245649kW != null && (c223778qL6 = c245649kW.LJIIZILJ) != null) {
                    str5 = c223778qL6.LIZJ;
                } else {
                    str5 = null;
                }
                bundle.putString("group_id", str5);
                if (c245649kW != null && (c223778qL5 = c245649kW.LJIIZILJ) != null) {
                    str6 = c223778qL5.LIZIZ;
                } else {
                    str6 = null;
                }
                bundle.putString("author_id", str6);
                if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
                    str7 = c223778qL4.LIZ;
                } else {
                    str7 = null;
                }
                bundle.putString("enter_from", str7);
                feedCountStickerDialogFragment.setArguments(bundle);
            }
            this.LJLLILLLL = feedCountStickerDialogFragment;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLILLLLZI);
        o.LJI(LJJIFFI);
        LJJIFFI.getSupportFragmentManager().LJJIL();
        FeedCountStickerDialogFragment feedCountStickerDialogFragment2 = this.LJLLILLLL;
        if (feedCountStickerDialogFragment2 != null && feedCountStickerDialogFragment2.isAdded()) {
            return;
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment3 = this.LJLLILLLL;
        if (feedCountStickerDialogFragment3 != null && feedCountStickerDialogFragment3.isVisible()) {
            return;
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment4 = this.LJLLILLLL;
        if (feedCountStickerDialogFragment4 != null && feedCountStickerDialogFragment4.isRemoving()) {
            return;
        }
        Activity LJIILL = C78949Uyf.LJIILL(this.LJLILLLLZI);
        if (!(LJIILL instanceof C29S) || (c1au = (C1AU) LJIILL) == null || (lifecycle = c1au.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || !currentState.isAtLeast(Lifecycle.State.RESUMED)) {
            return;
        }
        FeedCountStickerDialogFragment feedCountStickerDialogFragment5 = this.LJLLILLLL;
        if (feedCountStickerDialogFragment5 != null) {
            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLILLLLZI);
            o.LJI(LJJIFFI2);
            FragmentManager supportFragmentManager = LJJIFFI2.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity)!!.supportFragmentManager");
            feedCountStickerDialogFragment5.showNow(supportFragmentManager, "FeedCountDownStickerDialogFragment");
        }
        C86003Xp9 c86003Xp9 = this.LJLLJ;
        if (c86003Xp9 != null) {
            c86003Xp9.setFeedCountdownStickerDialogFragment(this.LJLLILLLL);
        }
        C188727au c188727au = new C188727au();
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str = c223778qL3.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str2 = c223778qL2.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str3 = c223778qL.LIZ;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("enter_from", str3);
        InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
        if (interactStickerStruct2 != null) {
            countDownStickerStruct = interactStickerStruct2.getCountDownStickerStruct();
        } else {
            countDownStickerStruct = null;
        }
        c188727au.LJ(C27331Ao3.LIZ(countDownStickerStruct), "countdown_time");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        Aweme aweme2 = this.LJLLLL;
        if (aweme2 != null) {
            str8 = aweme2.getAuthorUid();
        }
        c188727au.LIZLLL(TextUtils.equals(curUserId, str8) ? 1 : 0, "is_author");
        C245649kW c245649kW5 = this.LJLJJI;
        if (c245649kW5 == null || (str4 = c245649kW5.LJI) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("enter_method", str4);
        FMX.LJIIL("livesdk_cd_layer_show", c188727au.LIZ);
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void onResume() {
        this.LJLLI.LIZ(this.LJLLLLLL);
    }

    @Override // X.Y1I
    public final /* bridge */ /* synthetic */ View LIZ(int i) {
        return LJJ();
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C86427Xvz c86427Xvz = this.LJLLL;
        c86427Xvz.getClass();
        c86427Xvz.LJLJJI = interactStickerParams;
        C86003Xp9 LJJ = LJJ();
        if (LJJ != null) {
            LJJ.post(RunnableC86430Xw2.LJLIL);
        }
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return this.LJLLL.LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return this.LJLLL.LJIILIIL(j, i, f, f2, popListener);
    }

    public C86425Xvx(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, Aweme aweme, C223878qV c223878qV) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        this.LJLLI = c223878qV;
        this.LJLLL = new C86427Xvz(context, this, interactStickerStruct, c245649kW);
        this.LJLLLL = aweme;
        C86426Xvy c86426Xvy = new C86426Xvy(this);
        this.LJLLLLLL = c86426Xvy;
        if (c245649kW != null && c245649kW.LJFF == 1) {
            LJJI();
        }
        c223878qV.LIZ(c86426Xvy);
    }
}
