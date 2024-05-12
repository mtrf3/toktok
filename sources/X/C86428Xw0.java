package X;

import Y.ARunnableS26S0300000_15;
import Y.ARunnableS34S0200000_15;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xw0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86428Xw0 extends AbstractC224038ql {
    public final InterfaceC74204TAi LJLLI;
    public final C223878qV LJLLILLLL;
    public C86431Xw3 LJLLJ;
    public final C223578q1 LJLLL;
    public PollBottomSheetDialogFragment LJLLLL;
    public final C86429Xw1 LJLLLLLL;

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 3;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LJLILLLLZI);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(this.LJLILLLLZI, null, 6, 0);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJLILLLLZI));
        tuxTextView.setTuxFont(62);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = (int) KL2.LIZJ(this.LJLILLLLZI, 1.0f);
        tuxTextView.setLayoutParams(layoutParams2);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.LJLILLLLZI.getString(R.string.qft));
        C116474hf c116474hf = new C116474hf(this.LJLILLLLZI, null);
        c116474hf.setImageResource(R.drawable.bvr);
        linearLayout.addView(tuxTextView);
        linearLayout.addView(c116474hf);
        return linearLayout;
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
        String str;
        String str2;
        String str3;
        String str4;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        String str5 = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL4.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str5 = c223778qL.LIZ;
        }
        c188727au.LJIIIZ("enter_from", str5);
        StickerAttrStruct LIZ = C223998qh.LIZ(this.LJLJLLL);
        if (LIZ == null || (str4 = LIZ.getPollStickerId()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("prop_id", str4);
        FMX.LJIIL("poll_prop_click", c188727au.LIZ);
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
        String str;
        String str2;
        String str3;
        String str4;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        String str5 = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL4.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str5 = c223778qL.LIZ;
        }
        c188727au.LJIIIZ("enter_from", str5);
        StickerAttrStruct LIZ = C223998qh.LIZ(this.LJLJLLL);
        if (LIZ == null || (str4 = LIZ.getPollStickerId()) == null) {
            str4 = "";
        }
        c188727au.LJIIIZ("prop_id", str4);
        FMX.LJIIL("poll_prop_label_click", c188727au.LIZ);
        LJJI();
    }

    public final C86431Xw3 LJJ() {
        PollStruct pollStruct;
        User user;
        String str;
        FrameLayout frameLayout;
        float[] fArr;
        InterfaceC86436Xw8 interfaceC86436Xw8 = null;
        if (this.LJLLJ == null) {
            C86431Xw3 c86431Xw3 = new C86431Xw3(this.LJLILLLLZI);
            this.LJLLJ = c86431Xw3;
            c86431Xw3.setInteractStickerParams(this.LJLJJI);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C86431Xw3 c86431Xw32 = this.LJLLJ;
            if (c86431Xw32 != null) {
                c86431Xw32.setLayoutParams(layoutParams);
            }
            C86431Xw3 c86431Xw33 = this.LJLLJ;
            if (c86431Xw33 != null) {
                frameLayout = c86431Xw33.getPollView();
            } else {
                frameLayout = null;
            }
            if (frameLayout != null) {
                frameLayout.setVisibility(4);
            }
            C86431Xw3 c86431Xw34 = this.LJLLJ;
            if (c86431Xw34 != null) {
                C223578q1 c223578q1 = this.LJLLL;
                List<NormalTrackTimeStamp> LIZIZ = c223578q1.LIZIZ(0L, c223578q1.LJLJI);
                if (LIZIZ == null || C79004UzY.LJJIFFI(LIZIZ) || ListProtector.get(LIZIZ, 0) == null) {
                    fArr = null;
                } else {
                    Object obj = ListProtector.get(LIZIZ, 0);
                    o.LJI(obj);
                    RectF LIZ = c223578q1.LIZ((NormalTrackTimeStamp) obj);
                    float f = LIZ.left;
                    float f2 = LIZ.top;
                    float f3 = LIZ.right;
                    float f4 = LIZ.bottom;
                    fArr = new float[]{f, f2, f3, f2, f, f4, f3, f4};
                    Matrix matrix = new Matrix();
                    Object obj2 = ListProtector.get(LIZIZ, 0);
                    o.LJI(obj2);
                    float rotation = ((NormalTrackTimeStamp) obj2).getRotation();
                    float f5 = fArr[2];
                    float f6 = fArr[0];
                    float LIZ2 = C1I0.LIZ(f5, f6, 2.0f, f6);
                    float f7 = fArr[5];
                    float f8 = fArr[3];
                    matrix.postRotate(rotation, LIZ2, ((f7 - f8) / 2.0f) + f8);
                    matrix.mapPoints(fArr);
                }
                c86431Xw34.setPoints(fArr);
            }
            C86431Xw3 c86431Xw35 = this.LJLLJ;
            if (c86431Xw35 != null) {
                c86431Xw35.post(new ARunnableS34S0200000_15(this, c86431Xw35, 58));
            }
        }
        C86431Xw3 c86431Xw36 = this.LJLLJ;
        if (c86431Xw36 != null) {
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            if (interactStickerStruct != null) {
                pollStruct = interactStickerStruct.getPollStruct();
            } else {
                pollStruct = null;
            }
            C245649kW c245649kW = this.LJLJJI;
            if (c245649kW != null) {
                user = c245649kW.LIZJ;
            } else {
                user = null;
            }
            boolean LJIJ = AV1.LJIJ(user);
            C245649kW c245649kW2 = this.LJLJJI;
            if (c245649kW2 == null || (str = c245649kW2.LIZLLL) == null) {
                str = "";
            }
            if (c245649kW2 != null) {
                interfaceC86436Xw8 = c245649kW2.LJIILL;
            }
            c86431Xw36.LJI(pollStruct, LJIJ, str, interfaceC86436Xw8, this.LJLJLLL);
        }
        C86431Xw3 c86431Xw37 = this.LJLLJ;
        if (c86431Xw37 != null) {
            c86431Xw37.postInvalidate();
        }
        return this.LJLLJ;
    }

    public final void LJJI() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        InterfaceC86436Xw8 interfaceC86436Xw8;
        PollStruct pollStruct;
        List<PollStruct.OptionsBean> options;
        C223778qL c223778qL;
        C223778qL c223778qL2;
        C223778qL c223778qL3;
        C223778qL c223778qL4;
        C188727au c188727au = new C188727au();
        C245649kW c245649kW = this.LJLJJI;
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment = null;
        if (c245649kW != null && (c223778qL4 = c245649kW.LJIIZILJ) != null) {
            str = c223778qL4.LIZJ;
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        C245649kW c245649kW2 = this.LJLJJI;
        if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
            str2 = c223778qL3.LIZIZ;
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("author_id", str2);
        C245649kW c245649kW3 = this.LJLJJI;
        if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
            str3 = c223778qL2.LIZLLL;
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("log_pb", str3);
        C245649kW c245649kW4 = this.LJLJJI;
        if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
            str4 = c223778qL.LIZ;
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("enter_from", str4);
        StickerAttrStruct LIZ = C223998qh.LIZ(this.LJLJLLL);
        if (LIZ == null || (str5 = LIZ.getPollStickerId()) == null) {
            str5 = "";
        }
        c188727au.LJIIIZ("prop_id", str5);
        FMX.LJIIL("enter_poll_detail", c188727au.LIZ);
        if (this.LJLLLL == null) {
            InteractStickerStruct interactStickerStruct = this.LJLJLLL;
            if (interactStickerStruct != null && (pollStruct = interactStickerStruct.getPollStruct()) != null && (options = pollStruct.getOptions()) != null && options.size() >= 2) {
                pollBottomSheetDialogFragment = new PollBottomSheetDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("key_poll", pollStruct);
                pollBottomSheetDialogFragment.setArguments(bundle);
            }
            this.LJLLLL = pollBottomSheetDialogFragment;
        }
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(this.LJLILLLLZI);
        o.LJI(LJJIFFI);
        LJJIFFI.getSupportFragmentManager().LJJIL();
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment2 = this.LJLLLL;
        if (pollBottomSheetDialogFragment2 != null && pollBottomSheetDialogFragment2.isAdded()) {
            return;
        }
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment3 = this.LJLLLL;
        if (pollBottomSheetDialogFragment3 != null && pollBottomSheetDialogFragment3.isVisible()) {
            return;
        }
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment4 = this.LJLLLL;
        if (pollBottomSheetDialogFragment4 != null && pollBottomSheetDialogFragment4.isRemoving()) {
            return;
        }
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment5 = this.LJLLLL;
        if (pollBottomSheetDialogFragment5 != null) {
            pollBottomSheetDialogFragment5.LJLJLLL = this.LJLLI;
            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(this.LJLILLLLZI);
            o.LJI(LJJIFFI2);
            FragmentManager supportFragmentManager = LJJIFFI2.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "context.fragmentActivity)!!.supportFragmentManager");
            pollBottomSheetDialogFragment5.show(supportFragmentManager, "VoteBottomSheetDialogFragment");
        }
        PollBottomSheetDialogFragment pollBottomSheetDialogFragment6 = this.LJLLLL;
        if (pollBottomSheetDialogFragment6 != null) {
            pollBottomSheetDialogFragment6.LJLJLJ = new C74198TAc(this);
        }
        C245649kW c245649kW5 = this.LJLJJI;
        if (c245649kW5 == null || (interfaceC86436Xw8 = c245649kW5.LJIILL) == null) {
            return;
        }
        interfaceC86436Xw8.LJ();
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void onResume() {
        this.LJLLILLLL.LIZ(this.LJLLLLLL);
    }

    @Override // X.Y1I
    public final /* bridge */ /* synthetic */ View LIZ(int i) {
        return LJJ();
    }

    @Override // X.AbstractC224038ql, X.Y1E
    public final void LIZLLL(InteractStickerStruct interactStickerStruct) {
        this.LJLJLLL = interactStickerStruct;
        LJJ();
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C223578q1 c223578q1 = this.LJLLL;
        c223578q1.getClass();
        c223578q1.LJLJJI = interactStickerParams;
        C86431Xw3 LJJ = LJJ();
        if (LJJ != null) {
            LJJ.post(new ARunnableS26S0300000_15(LJJ, this, interactStickerParams, 9));
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

    public C86428Xw0(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, InteractStickerWidget interactStickerWidget, C223878qV c223878qV) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        this.LJLLI = interactStickerWidget;
        this.LJLLILLLL = c223878qV;
        this.LJLLL = new C223578q1(context, this, interactStickerStruct, c245649kW);
        C86429Xw1 c86429Xw1 = new C86429Xw1(this);
        this.LJLLLLLL = c86429Xw1;
        if (c245649kW != null && c245649kW.LJ) {
            LJJI();
        }
        AVExternalServiceImpl.LIZ().typeFaceService().prefetch(context);
        c223878qV.LIZ(c86429Xw1);
    }
}
