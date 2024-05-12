package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xw4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86432Xw4 implements InterfaceC86437Xw9 {
    public final /* synthetic */ C86431Xw3 LIZ;

    public C86432Xw4(C86431Xw3 c86431Xw3) {
        this.LIZ = c86431Xw3;
    }

    @Override // X.InterfaceC86437Xw9
    public final void LIZJ(int i) {
        long j;
        Long l;
        long j2;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean2;
        long j3;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean3;
        List<PollStruct.OptionsBean> options3;
        PollStruct.OptionsBean optionsBean4;
        List<PollStruct.OptionsBean> options4;
        PollStruct.OptionsBean optionsBean5;
        String str;
        C223778qL c223778qL;
        long j4;
        Long l2;
        long j5;
        PollStruct.OptionsBean optionsBean6;
        List<PollStruct.OptionsBean> options5;
        PollStruct.OptionsBean optionsBean7;
        long j6;
        List<PollStruct.OptionsBean> options6;
        PollStruct.OptionsBean optionsBean8;
        List<PollStruct.OptionsBean> options7;
        PollStruct.OptionsBean optionsBean9;
        List<PollStruct.OptionsBean> options8;
        PollStruct.OptionsBean optionsBean10;
        String str2;
        C223778qL c223778qL2;
        if (AV1.LJIIJJI()) {
            return;
        }
        if (i == R.id.hwb) {
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                Context context = this.LIZ.getContext();
                o.LJIIIIZZ(context, "context");
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                o.LJI(LJIJJ);
                C245649kW interactStickerParams = this.LIZ.getInteractStickerParams();
                if (interactStickerParams == null || (c223778qL2 = interactStickerParams.LJIIZILJ) == null || (str2 = c223778qL2.LIZ) == null) {
                    str2 = "";
                }
                J9P.LIZIZ(LJIJJ, str2, "", null, null);
                return;
            }
            C86431Xw3 c86431Xw3 = this.LIZ;
            PollStruct pollStruct = c86431Xw3.LJZL;
            if (pollStruct != null && (options8 = pollStruct.getOptions()) != null && (optionsBean10 = (PollStruct.OptionsBean) ListProtector.get(options8, 0)) != null) {
                j4 = optionsBean10.getOptionId();
            } else {
                j4 = 0;
            }
            c86431Xw3.LJLLL = j4;
            float LIZJ = this.LIZ.LIZJ(0, 1);
            TextView textView = this.LIZ.LJLJJL;
            StringBuilder LIZ = X1D.LIZ();
            String LLLZ = C16880lQ.LLLZ("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(LIZJ)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            LIZ.append(LLLZ);
            LIZ.append('%');
            textView.setText(X1D.LIZIZ(LIZ));
            TextView textView2 = this.LIZ.LJLJLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            String LLLZ2 = C16880lQ.LLLZ("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100 - LIZJ)}, 1));
            o.LJIIIIZZ(LLLZ2, "format(format, *args)");
            LIZ2.append(LLLZ2);
            LIZ2.append('%');
            textView2.setText(X1D.LIZIZ(LIZ2));
            C86431Xw3 c86431Xw32 = this.LIZ;
            C86433Xw5 c86433Xw5 = c86431Xw32.LJLJI;
            TextView textView3 = c86431Xw32.LJLJJI;
            TextView textView4 = c86431Xw32.LJLJJL;
            int i2 = (int) LIZJ;
            c86433Xw5.setProgressDrawable(C04270Et.LIZIZ(c86431Xw32.getContext(), R.drawable.bvn));
            c86431Xw32.LIZIZ(c86433Xw5, textView3, textView4, i2, true);
            C86431Xw3 c86431Xw33 = this.LIZ;
            C86433Xw5 c86433Xw52 = c86431Xw33.LJLJL;
            c86433Xw52.setProgressDrawable(C04270Et.LIZIZ(c86431Xw33.getContext(), R.drawable.bvp));
            c86431Xw33.LIZIZ(c86433Xw52, c86431Xw33.LJLJLJ, c86431Xw33.LJLJLLL, 100 - i2, false);
            this.LIZ.setStatus(1);
            C86431Xw3 c86431Xw34 = this.LIZ;
            PollStruct pollStruct2 = c86431Xw34.LJZL;
            if (pollStruct2 != null && (options7 = pollStruct2.getOptions()) != null && (optionsBean9 = (PollStruct.OptionsBean) ListProtector.get(options7, 0)) != null) {
                l2 = Long.valueOf(optionsBean9.getOptionId());
            } else {
                l2 = null;
            }
            c86431Xw34.LJFF(l2);
            PollStruct pollStruct3 = this.LIZ.LJZL;
            if (pollStruct3 != null) {
                List<PollStruct.OptionsBean> options9 = pollStruct3.getOptions();
                if (options9 != null && (optionsBean6 = (PollStruct.OptionsBean) ListProtector.get(options9, 0)) != null) {
                    j5 = optionsBean6.getOptionId();
                } else {
                    j5 = 0;
                }
                pollStruct3.setSelectOptionId(j5);
            }
            PollStruct pollStruct4 = this.LIZ.LJZL;
            if (pollStruct4 != null && (options5 = pollStruct4.getOptions()) != null && (optionsBean7 = (PollStruct.OptionsBean) ListProtector.get(options5, 0)) != null) {
                PollStruct pollStruct5 = this.LIZ.LJZL;
                if (pollStruct5 != null && (options6 = pollStruct5.getOptions()) != null && (optionsBean8 = (PollStruct.OptionsBean) ListProtector.get(options6, 0)) != null) {
                    j6 = optionsBean8.getPollCount();
                } else {
                    j6 = 0;
                }
                optionsBean7.setPollCount(j6 + 1);
            }
            this.LIZ.LIZLLL("A");
            this.LIZ.LJ();
            return;
        }
        if (i == R.id.hwc) {
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                Context context2 = this.LIZ.getContext();
                o.LJIIIIZZ(context2, "context");
                Activity LJIJJ2 = C45804HyK.LJIJJ(context2);
                o.LJI(LJIJJ2);
                C245649kW interactStickerParams2 = this.LIZ.getInteractStickerParams();
                if (interactStickerParams2 == null || (c223778qL = interactStickerParams2.LJIIZILJ) == null || (str = c223778qL.LIZ) == null) {
                    str = "";
                }
                J9P.LIZIZ(LJIJJ2, str, "", null, null);
                return;
            }
            C86431Xw3 c86431Xw35 = this.LIZ;
            PollStruct pollStruct6 = c86431Xw35.LJZL;
            if (pollStruct6 != null && (options4 = pollStruct6.getOptions()) != null && (optionsBean5 = (PollStruct.OptionsBean) ListProtector.get(options4, 1)) != null) {
                j = optionsBean5.getOptionId();
            } else {
                j = 0;
            }
            c86431Xw35.LJLLL = j;
            float LIZJ2 = this.LIZ.LIZJ(1, 1);
            TextView textView5 = this.LIZ.LJLJLLL;
            StringBuilder LIZ3 = X1D.LIZ();
            String LLLZ3 = C16880lQ.LLLZ("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(LIZJ2)}, 1));
            o.LJIIIIZZ(LLLZ3, "format(format, *args)");
            LIZ3.append(LLLZ3);
            LIZ3.append('%');
            textView5.setText(X1D.LIZIZ(LIZ3));
            TextView textView6 = this.LIZ.LJLJJL;
            StringBuilder LIZ4 = X1D.LIZ();
            String LLLZ4 = C16880lQ.LLLZ("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100 - LIZJ2)}, 1));
            o.LJIIIIZZ(LLLZ4, "format(format, *args)");
            LIZ4.append(LLLZ4);
            LIZ4.append('%');
            textView6.setText(X1D.LIZIZ(LIZ4));
            C86431Xw3 c86431Xw36 = this.LIZ;
            C86433Xw5 c86433Xw53 = c86431Xw36.LJLJL;
            TextView textView7 = c86431Xw36.LJLJLJ;
            TextView textView8 = c86431Xw36.LJLJLLL;
            int i3 = (int) LIZJ2;
            c86433Xw53.setProgressDrawable(C04270Et.LIZIZ(c86431Xw36.getContext(), R.drawable.bvn));
            c86431Xw36.LIZIZ(c86433Xw53, textView7, textView8, i3, true);
            C86431Xw3 c86431Xw37 = this.LIZ;
            C86433Xw5 c86433Xw54 = c86431Xw37.LJLJI;
            c86433Xw54.setProgressDrawable(C04270Et.LIZIZ(c86431Xw37.getContext(), R.drawable.bvp));
            c86431Xw37.LIZIZ(c86433Xw54, c86431Xw37.LJLJJI, c86431Xw37.LJLJJL, 100 - i3, false);
            this.LIZ.setStatus(2);
            C86431Xw3 c86431Xw38 = this.LIZ;
            PollStruct pollStruct7 = c86431Xw38.LJZL;
            if (pollStruct7 != null && (options3 = pollStruct7.getOptions()) != null && (optionsBean4 = (PollStruct.OptionsBean) ListProtector.get(options3, 1)) != null) {
                l = Long.valueOf(optionsBean4.getOptionId());
            } else {
                l = null;
            }
            c86431Xw38.LJFF(l);
            PollStruct pollStruct8 = this.LIZ.LJZL;
            if (pollStruct8 != null) {
                List<PollStruct.OptionsBean> options10 = pollStruct8.getOptions();
                if (options10 != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options10, 1)) != null) {
                    j2 = optionsBean.getOptionId();
                } else {
                    j2 = 0;
                }
                pollStruct8.setSelectOptionId(j2);
            }
            PollStruct pollStruct9 = this.LIZ.LJZL;
            if (pollStruct9 != null && (options = pollStruct9.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options, 1)) != null) {
                PollStruct pollStruct10 = this.LIZ.LJZL;
                if (pollStruct10 != null && (options2 = pollStruct10.getOptions()) != null && (optionsBean3 = (PollStruct.OptionsBean) ListProtector.get(options2, 1)) != null) {
                    j3 = optionsBean3.getPollCount();
                } else {
                    j3 = 0;
                }
                optionsBean2.setPollCount(j3 + 1);
            }
            this.LIZ.LIZLLL("B");
            this.LIZ.LJ();
        }
    }
}
