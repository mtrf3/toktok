package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S11S0300000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Rez, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70085Rez extends FrameLayout {
    public SpannableStringBuilder LJLIL;
    public boolean LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZJ() {
        View LIZ = LIZ(R.id.hk_);
        if (LIZ == null) {
            return;
        }
        LIZ.setVisibility(8);
    }

    public C70085Rez(Context context) {
        super(context, null);
        C27533ArJ.LIZ(R.layout.a20, context, this, true);
        this.LJLIL = new SpannableStringBuilder();
    }

    public static String LIZIZ(long j, PdpViewModel pdpViewModel) {
        List<Announcement> list;
        Announcement announcement;
        Long usableEndTime;
        StringBuilder LIZ;
        StringBuilder LIZ2;
        String LIZIZ;
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (productPackStruct != null && (list = productPackStruct.announcements) != null && (announcement = (Announcement) ListProtector.get(list, 0)) != null && (usableEndTime = announcement.getUsableEndTime()) != null) {
            long longValue = usableEndTime.longValue() - (j / 1000);
            if (longValue >= 0 && longValue > 0) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(' ');
                long j2 = 3600;
                long j3 = longValue / j2;
                long j4 = longValue - (j2 * j3);
                long j5 = 60;
                long j6 = j4 / j5;
                long j7 = longValue % j5;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("");
                if (j3 >= 10) {
                    LIZ = X1D.LIZ();
                } else {
                    LIZ = X1D.LIZ();
                    LIZ.append('0');
                }
                LIZ.append(j3);
                LIZ.append(':');
                LIZ4.append(X1D.LIZIZ(LIZ));
                String LIZIZ2 = X1D.LIZIZ(LIZ4);
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append(LIZIZ2);
                if (j6 >= 10) {
                    LIZ2 = X1D.LIZ();
                } else {
                    LIZ2 = X1D.LIZ();
                    LIZ2.append('0');
                }
                LIZ2.append(j6);
                LIZ2.append(':');
                LIZ5.append(X1D.LIZIZ(LIZ2));
                String LIZIZ3 = X1D.LIZIZ(LIZ5);
                StringBuilder LIZ6 = X1D.LIZ();
                LIZ6.append(LIZIZ3);
                if (j7 >= 10) {
                    LIZIZ = String.valueOf(j7);
                } else {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append('0');
                    LIZ7.append(j7);
                    LIZIZ = X1D.LIZIZ(LIZ7);
                }
                LIZ6.append(LIZIZ);
                LIZ3.append(X1D.LIZIZ(LIZ6));
                return X1D.LIZIZ(LIZ3);
            }
        }
        return C27162AlK.LJIIJJI;
    }

    public final void LJ(ProductUnavailableInfo productUnavailableInfo, PdpViewModel viewModel) {
        boolean z;
        int i;
        TextView textView;
        o.LJIIIZ(viewModel, "viewModel");
        if (productUnavailableInfo == null) {
            return;
        }
        View LIZ = LIZ(R.id.hk_);
        int i2 = 0;
        if (LIZ != null) {
            LIZ.setVisibility(0);
        }
        View LIZ2 = LIZ(R.id.hk5);
        if (LIZ2 != null) {
            LIZ2.setVisibility(8);
        }
        String str = productUnavailableInfo.text;
        if (str != null && (textView = (TextView) LIZ(R.id.lm_)) != null) {
            textView.setText(str);
        }
        Integer num = productUnavailableInfo.unavailableReason;
        if (num == null || num.intValue() != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View tt_tips_action = LIZ(R.id.lm8);
            o.LJIIIIZZ(tt_tips_action, "tt_tips_action");
            tt_tips_action.setVisibility(0);
            ImageView tt_tips_arrow = (ImageView) LIZ(R.id.lm9);
            o.LJIIIIZZ(tt_tips_arrow, "tt_tips_arrow");
            tt_tips_arrow.setVisibility(0);
            TextView textView2 = (TextView) LIZ(R.id.lm8);
            String str2 = productUnavailableInfo.actionText;
            if (str2 == null) {
                str2 = getResources().getString(R.string.f5h);
            }
            textView2.setText(str2);
        } else {
            View tt_tips_action2 = LIZ(R.id.lm8);
            o.LJIIIIZZ(tt_tips_action2, "tt_tips_action");
            String str3 = productUnavailableInfo.actionText;
            if (str3 == null || ujb.o.LJJJJJL(str3)) {
                i = 8;
            } else {
                i = 0;
            }
            tt_tips_action2.setVisibility(i);
            ImageView tt_tips_arrow2 = (ImageView) LIZ(R.id.lm9);
            o.LJIIIIZZ(tt_tips_arrow2, "tt_tips_arrow");
            String str4 = productUnavailableInfo.actionText;
            if (str4 == null || ujb.o.LJJJJJL(str4)) {
                i2 = 8;
            }
            tt_tips_arrow2.setVisibility(i2);
            ((TextView) LIZ(R.id.lm8)).setText(productUnavailableInfo.actionText);
        }
        View LIZ3 = LIZ(R.id.lm8);
        if (LIZ3 != null) {
            C16880lQ.LJIIJ(new Au2S11S0300000_12(this, viewModel, productUnavailableInfo, 10), LIZ3);
        }
        View LIZ4 = LIZ(R.id.lm9);
        if (LIZ4 != null) {
            C16880lQ.LJIIJ(new Au2S11S0300000_12(this, viewModel, productUnavailableInfo, 11), LIZ4);
        }
        if (!this.LJLILLLLZI) {
            C70414RkI c70414RkI = viewModel.LLFII;
            if (c70414RkI != null) {
                C70082Rew c70082Rew = new C70082Rew("tiktokec_module_show");
                ConcurrentHashMap<String, Object> commonParams = c70414RkI.LIZIZ;
                o.LJIIIZ(commonParams, "commonParams");
                c70082Rew.LIZIZ.putAll(commonParams);
                c70082Rew.LIZIZ();
            }
            this.LJLILLLLZI = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r0.intValue() == 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3, android.view.View r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo r5) {
        /*
            boolean r0 = r3.qw0()
            if (r0 == 0) goto L32
            X.RkI r1 = r3.LLFII
            if (r1 == 0) goto L20
            X.Rew r2 = new X.Rew
            java.lang.String r0 = "tiktokec_module_click"
            r2.<init>(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r1 = r1.LIZIZ
            java.lang.String r0 = "commonParams"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r0 = r2.LIZIZ
            r0.putAll(r1)
            r2.LIZIZ()
        L20:
            if (r5 == 0) goto L26
            java.lang.Integer r0 = r5.actionRedirectType
            if (r0 != 0) goto L3c
        L26:
            r2 = 0
        L27:
            r1 = 0
            if (r2 == 0) goto L33
            X.Afn r0 = new X.Afn
            r0.<init>(r4, r3, r1)
            X.C78565UsT.LJJIJIL(r3, r0)
        L32:
            return
        L33:
            X.Afp r0 = new X.Afp
            r0.<init>(r4, r3, r1)
            X.C78565UsT.LJJIJIL(r3, r0)
            goto L32
        L3c:
            int r0 = r0.intValue()
            r2 = 1
            if (r0 != r2) goto L26
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70085Rez.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, android.view.View, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo):void");
    }
}
