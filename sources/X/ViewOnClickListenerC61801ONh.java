package X;

import Y.ARunnableS29S0200000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.ONh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC61801ONh implements View.OnClickListener {
    public final /* synthetic */ C61800ONg LJLIL;

    public ViewOnClickListenerC61801ONh(C61800ONg c61800ONg) {
        this.LJLIL = c61800ONg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OO3 oo3;
        String str;
        Integer num;
        String str2;
        OO3 oo32;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator translationY;
        String aid;
        Integer num2;
        String str3;
        String str4;
        long j;
        String str5;
        String str6;
        int id = view.getId();
        if (id == R.id.eor) {
            C61800ONg c61800ONg = this.LJLIL;
            Context context = c61800ONg.LIZIZ;
            if (context != null) {
                OOH ooh = new OOH(context, false, c61800ONg.LJJII, c61800ONg, null, null, null);
                ooh.setOnDismissListener(DialogInterfaceOnDismissListenerC61816ONw.LJLIL);
                if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/feed/survey/dialog/SurveyOtherInputBottomDialog", "show", ooh, new Object[0], "void", new C65300Pk0(false, "()V", "1769593988546984865")).LIZ) {
                    return;
                }
                ooh.show();
                return;
            }
            return;
        }
        if (id == R.id.beq) {
            TuxTextView tuxTextView = this.LJLIL.LJIJ;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setText("");
            return;
        }
        boolean z = true;
        Integer num3 = null;
        String str7 = null;
        String str8 = null;
        Integer num4 = null;
        if (id == R.id.azi) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) this.LJLIL.LIZ).entrySet()) {
                ((Number) entry.getKey()).intValue();
                arrayList.add(entry.getValue());
            }
            EnumC61773OMf enumC61773OMf = EnumC61773OMf.SUBMIT;
            C61800ONg c61800ONg2 = this.LJLIL;
            String str9 = c61800ONg2.LJFF;
            Aweme aweme = c61800ONg2.LJIIIZ;
            Option option = c61800ONg2.LJI;
            if (option != null) {
                num2 = Integer.valueOf(option.getId());
            } else {
                num2 = null;
            }
            Option[] LIZIZ = this.LJLIL.LIZIZ();
            C61800ONg c61800ONg3 = this.LJLIL;
            C61779OMl.LIZLLL(c61800ONg3.LJII, aweme, enumC61773OMf, c61800ONg3.LJIIJ, num2, str9, c61800ONg3.LJJII, true, LIZIZ);
            C61800ONg c61800ONg4 = this.LJLIL;
            c61800ONg4.getClass();
            C61798ONe LIZ = C55016LiW.LIZ();
            Aweme aweme2 = c61800ONg4.LJIIIZ;
            if (aweme2 != null) {
                str3 = aweme2.getAid();
            } else {
                str3 = null;
            }
            C61811ONr LIZ2 = LIZ.LIZ(str3);
            if (LIZ2 != null) {
                LIZ2.LJI = true;
                C61798ONe LIZ3 = C55016LiW.LIZ();
                Aweme aweme3 = c61800ONg4.LJIIIZ;
                if (aweme3 != null) {
                    str6 = aweme3.getAid();
                } else {
                    str6 = null;
                }
                LIZ3.LIZLLL(str6, LIZ2);
            }
            C61800ONg c61800ONg5 = this.LJLIL;
            c61800ONg5.getClass();
            C61798ONe LIZ4 = C55016LiW.LIZ();
            Aweme aweme4 = c61800ONg5.LJIIIZ;
            if (aweme4 != null) {
                str4 = aweme4.getAid();
            } else {
                str4 = null;
            }
            C61811ONr LIZ5 = LIZ4.LIZ(str4);
            if (LIZ5 != null) {
                LIZ5.LIZJ = true;
                LIZ5.LIZLLL = true;
                LIZ5.LJFF = true;
                C61798ONe LIZ6 = C55016LiW.LIZ();
                Aweme aweme5 = c61800ONg5.LJIIIZ;
                if (aweme5 != null) {
                    str5 = aweme5.getAid();
                } else {
                    str5 = null;
                }
                LIZ6.LIZLLL(str5, LIZ5);
            }
            if (C61779OMl.LJFF(this.LJLIL.LIZLLL)) {
                C61815ONv c61815ONv = new C61815ONv();
                c61815ONv.LIZIZ = true;
                c61815ONv.LIZ = this.LJLIL.LJII;
                c61815ONv.LIZJ = arrayList;
                C61798ONe LIZ7 = C55016LiW.LIZ();
                Aweme aweme6 = this.LJLIL.LJIIIZ;
                if (aweme6 != null) {
                    str7 = aweme6.getAid();
                }
                LIZ7.LJ(str7, c61815ONv);
                this.LJLIL.LIZJ(true);
                C61804ONk c61804ONk = this.LJLIL.LJJIFFI;
                if (c61804ONk != null) {
                    c61804ONk.LJLILLLLZI = false;
                    c61804ONk.notifyDataSetChanged();
                }
            } else {
                Context context2 = this.LJLIL.LIZIZ;
                if (context2 != null) {
                    C5S1 c5s1 = new C5S1(context2);
                    c5s1.LIZJ(R.string.rx2);
                    c5s1.LIZ(R.raw.icon_tick_fill_small);
                    c5s1.LIZIZ(R.attr.e8);
                    c5s1.LJ();
                }
                View view2 = this.LJLIL.LJIIJJI;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.LJLIL.LJI();
            }
            Handler handler = new Handler();
            C61800ONg c61800ONg6 = this.LJLIL;
            ARunnableS46S0100000_10 aRunnableS46S0100000_10 = new ARunnableS46S0100000_10(c61800ONg6, 214);
            if (C61779OMl.LJFF(c61800ONg6.LIZLLL)) {
                j = 800;
            } else {
                j = 0;
            }
            handler.postDelayed(aRunnableS46S0100000_10, j);
            return;
        }
        if (id == R.id.dxa) {
            C61798ONe LIZ8 = C55016LiW.LIZ();
            Aweme aweme7 = this.LJLIL.LJIIIZ;
            if (aweme7 != null && (aid = aweme7.getAid()) != null) {
                C0M6<String, C61815ONv> c0m6 = LIZ8.LIZ;
                if (c0m6 != null) {
                    c0m6.LIZLLL(aid);
                }
            } else {
                LIZ8.getClass();
            }
            C61800ONg c61800ONg7 = this.LJLIL;
            View view3 = c61800ONg7.LJIIJJI;
            if (view3 != null) {
                C09K.LIZ(view3, 0.0f, 200L).withEndAction(new ARunnableS29S0200000_10(view3, c61800ONg7, 67)).start();
                if (C61779OMl.LJ(c61800ONg7.LIZLLL) && (oo32 = c61800ONg7.LJJI) != null) {
                    oo32.LJJJJ = false;
                    FrameLayout frameLayout = oo32.LJIL;
                    if (frameLayout != null && (animate = frameLayout.animate()) != null && (translationY = animate.translationY(-(oo32.LIZIZ + oo32.LIZJ))) != null) {
                        translationY.start();
                    }
                }
            }
            C61798ONe LIZ9 = C55016LiW.LIZ();
            Aweme aweme8 = this.LJLIL.LJIIIZ;
            if (aweme8 != null) {
                str = aweme8.getAid();
            } else {
                str = null;
            }
            if (LIZ9.LIZ(str) == null) {
                return;
            }
            C61800ONg c61800ONg8 = this.LJLIL;
            EnumC61773OMf enumC61773OMf2 = EnumC61773OMf.BACK;
            String str10 = c61800ONg8.LJFF;
            Aweme aweme9 = c61800ONg8.LJIIIZ;
            Option option2 = c61800ONg8.LJI;
            if (option2 != null) {
                num = Integer.valueOf(option2.getId());
            } else {
                num = null;
            }
            C61779OMl.LIZLLL(c61800ONg8.LJII, aweme9, enumC61773OMf2, c61800ONg8.LJIIJ, num, str10, c61800ONg8.LJJII, !r6.LJFF, c61800ONg8.LIZIZ());
            C61798ONe LIZ10 = C55016LiW.LIZ();
            Aweme aweme10 = c61800ONg8.LJIIIZ;
            if (aweme10 != null) {
                str2 = aweme10.getAid();
            } else {
                str2 = null;
            }
            C61811ONr LIZ11 = LIZ10.LIZ(str2);
            if (LIZ11 == null) {
                return;
            }
            LIZ11.LJFF = true;
            C61798ONe LIZ12 = C55016LiW.LIZ();
            Aweme aweme11 = c61800ONg8.LJIIIZ;
            if (aweme11 != null) {
                str8 = aweme11.getAid();
            }
            LIZ12.LIZLLL(str8, LIZ11);
            return;
        }
        if (id == R.id.eb1) {
            View view4 = this.LJLIL.LJIIJJI;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            C2U8.LIZ(new C68382mI());
            this.LJLIL.LJI();
            EnumC61773OMf enumC61773OMf3 = EnumC61773OMf.CANCEL;
            C61800ONg c61800ONg9 = this.LJLIL;
            String str11 = c61800ONg9.LJFF;
            Aweme aweme12 = c61800ONg9.LJIIIZ;
            Option option3 = c61800ONg9.LJI;
            if (option3 != null) {
                num4 = Integer.valueOf(option3.getId());
            }
            Option[] LIZIZ2 = this.LJLIL.LIZIZ();
            C61800ONg c61800ONg10 = this.LJLIL;
            C61779OMl.LIZLLL(c61800ONg10.LJII, aweme12, enumC61773OMf3, c61800ONg10.LJIIJ, num4, str11, c61800ONg10.LJJII, true, LIZIZ2);
            return;
        }
        if (id != R.id.d33 || (oo3 = this.LJLIL.LJJI) == null || !oo3.LJIIJJI) {
            return;
        }
        oo3.LJIILJJIL(1.0f, 0.0f, false);
        C61800ONg c61800ONg11 = this.LJLIL;
        Aweme aweme13 = c61800ONg11.LJIIIZ;
        if (aweme13 == null) {
            return;
        }
        C61811ONr LIZ13 = C55016LiW.LIZ().LIZ(aweme13.getAid());
        if (LIZ13 == null) {
            LIZ13 = new C61811ONr();
            C55016LiW.LIZ().LIZLLL(aweme13.getAid(), LIZ13);
        }
        if (!LIZ13.LJIIJ) {
            EnumC61773OMf enumC61773OMf4 = EnumC61773OMf.CLICK_VIDEO;
            String str12 = c61800ONg11.LJFF;
            Aweme aweme14 = c61800ONg11.LJIIIZ;
            Option option4 = c61800ONg11.LJI;
            if (option4 != null) {
                num3 = Integer.valueOf(option4.getId());
            }
            z = true;
            C61779OMl.LIZLLL(c61800ONg11.LJII, aweme14, enumC61773OMf4, c61800ONg11.LJIIJ, num3, str12, c61800ONg11.LJJII, true, c61800ONg11.LIZIZ());
        }
        LIZ13.LJIIJ = z;
    }
}
