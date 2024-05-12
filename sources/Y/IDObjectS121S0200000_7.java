package Y;

import X.C10H;
import X.C10K;
import X.C42796Gqu;
import X.C42802Gr0;
import X.C68322mC;
import X.C72972SkS;
import X.C73030SlO;
import X.C768930b;
import X.C79045V0n;
import X.DialogC42922Gsw;
import X.GBM;
import X.GSR;
import X.SY4;
import X.T5T;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import com.ss.android.ugc.aweme.api.AnchorSearchService;
import com.ss.android.ugc.aweme.compliance.business.search.feedback.SearchAidFeedbackFragment;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes8.dex */
public class IDObjectS121S0200000_7 implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(IDObjectS121S0200000_7 iDObjectS121S0200000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(IDObjectS121S0200000_7 iDObjectS121S0200000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(IDObjectS121S0200000_7 iDObjectS121S0200000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(IDObjectS121S0200000_7 iDObjectS121S0200000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(IDObjectS121S0200000_7 iDObjectS121S0200000_7, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                return;
            case 1:
                afterTextChanged$1(this, editable);
                return;
            case 2:
                afterTextChanged$2(this, editable);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                return;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                return;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                return;
            default:
                return;
        }
    }

    public static final void afterTextChanged$0(IDObjectS121S0200000_7 iDObjectS121S0200000_7, Editable editable) {
        int i;
        int i2;
        boolean z = false;
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        String LIZLLL = C72972SkS.LIZLLL(i, "/500");
        if (i > 500) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LIZLLL);
            Context context = ((T5T) iDObjectS121S0200000_7.l0).getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.e7, context);
            if (LJI != null) {
                i2 = LJI.intValue();
            } else {
                i2 = 0;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i2), 0, String.valueOf(i).length(), 18);
            ((TextView) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.njv)).setText(spannableStringBuilder);
            ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.cyc).setVisibility(0);
            ((ImageView) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.cyf)).setVisibility(0);
            ((SY4) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.kpi)).setEnabled(false);
            return;
        }
        ((TextView) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.njv)).setText(LIZLLL);
        ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.cyc).setVisibility(4);
        ((ImageView) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.cyf)).setVisibility(4);
        SY4 sy4 = (SY4) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1)._$_findCachedViewById(R.id.kpi);
        if (((GBM) ((SearchAidFeedbackFragment) iDObjectS121S0200000_7.l1).LJLJLJ.getValue()).LJLILLLLZI > 0) {
            z = true;
        }
        sy4.setEnabled(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
    
        if (r7 > r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ae, code lost:
    
        if (r4 >= r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
    
        r3 = r8.substring(r4, r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$1(Y.IDObjectS121S0200000_7 r12, android.text.Editable r13) {
        /*
            java.lang.Object r0 = r12.l1
            X.Gqu r0 = (X.C42796Gqu) r0
            java.lang.String r1 = r0.LJLL
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L21
            java.lang.String r0 = "#"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L21
            java.lang.Object r0 = r12.l1
            X.Gqu r0 = (X.C42796Gqu) r0
            r0.LJI(r3)
        L1a:
            java.lang.Object r0 = r12.l0
            X.GSR r0 = (X.GSR) r0
            r0.LLJI = r2
            return
        L21:
            java.lang.Object r5 = r12.l1
            X.Gqu r5 = (X.C42796Gqu) r5
            java.lang.Object r0 = r12.l0
            X.GSR r0 = (X.GSR) r0
            java.lang.String r8 = r0.getNoAdTagText()
            X.GQ5 r0 = r5.LJLJLLL
            X.GSR r4 = r0.LIZIZ
            int r1 = r4.getSelectionStart()
            int r0 = r8.length()
            int r7 = java.lang.Math.min(r1, r0)
            boolean r0 = r4.LLJI
            r6 = 1
            if (r0 == 0) goto L4e
            r5.LLIFFJFJJ = r6
            int r1 = r4.LLJIJIL
            int r0 = r8.length()
            int r7 = java.lang.Math.min(r1, r0)
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r5 = 35
            if (r0 != 0) goto L6c
            int r4 = r7 + (-1)
            int r1 = r8.length()
        L5c:
            r11 = 10
            r10 = 64
            r9 = 32
            if (r4 < 0) goto L9e
            char r0 = r8.charAt(r4)
            if (r0 == r9) goto L6c
            if (r0 != r10) goto L8a
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lcd
            java.lang.Object r0 = r12.l1
            X.Gqu r0 = (X.C42796Gqu) r0
            r0.LJLLLLLL = r6
            int r0 = r3.lastIndexOf(r5)
            java.lang.Object r1 = r12.l1
            X.Gqu r1 = (X.C42796Gqu) r1
            int r0 = r0 + 1
            java.lang.String r0 = r3.substring(r0)
            r1.LJI(r0)
            goto L1a
        L8a:
            if (r0 != r11) goto L9c
            X.HEa r0 = X.C78934UyQ.LJLIL
            X.HF1 r0 = r0.LIZLLL()
            r0.getClass()
            boolean r0 = X.AnonymousClass842.LIZ()
            if (r0 == 0) goto Lca
            goto L6c
        L9c:
            if (r0 != r5) goto Lca
        L9e:
            if (r7 >= r1) goto Laa
            char r0 = r8.charAt(r7)
            if (r0 == r5) goto Laa
            if (r0 == r9) goto Laa
            if (r0 != r10) goto Lb5
        Laa:
            if (r4 < 0) goto L6c
            if (r7 > r1) goto L6c
            if (r4 >= r7) goto L6c
            java.lang.String r3 = r8.substring(r4, r7)
            goto L6c
        Lb5:
            if (r0 != r11) goto Lc7
            X.HEa r0 = X.C78934UyQ.LJLIL
            X.HF1 r0 = r0.LIZLLL()
            r0.getClass()
            boolean r0 = X.AnonymousClass842.LIZ()
            if (r0 == 0) goto Lc7
            goto Laa
        Lc7:
            int r7 = r7 + 1
            goto L9e
        Lca:
            int r4 = r4 + (-1)
            goto L5c
        Lcd:
            java.lang.Object r1 = r12.l1
            X.Gqu r1 = (X.C42796Gqu) r1
            boolean r0 = r1.LLIFFJFJJ
            if (r0 == 0) goto Ld9
            r1.LLIFFJFJJ = r2
            goto L1a
        Ld9:
            r1.LIZ()
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDObjectS121S0200000_7.afterTextChanged$1(Y.IDObjectS121S0200000_7, android.text.Editable):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.10H] */
    public static final void afterTextChanged$2(IDObjectS121S0200000_7 iDObjectS121S0200000_7, Editable editable) {
        if (editable != null) {
            C68322mC c68322mC = (C68322mC) iDObjectS121S0200000_7.l0;
            DialogC42922Gsw dialogC42922Gsw = (DialogC42922Gsw) iDObjectS121S0200000_7.l1;
            ((C10H) c68322mC.element).LIZ();
            ?? c10h = new C10H();
            c68322mC.element = c10h;
            if (editable.length() > 0) {
                TuxIconView tuxIconView = dialogC42922Gsw.LJLLLLLL;
                if (tuxIconView != null) {
                    tuxIconView.setVisibility(0);
                }
                C768930b c768930b = AnchorSearchService.LIZ;
                String obj = editable.toString();
                c768930b.getClass();
                C10K<AnchorSearchResponse> anchorSearchResponse = C768930b.LIZIZ.getAnchorSearchResponse(obj);
                anchorSearchResponse.LJ(new AgS110S0200000_7(anchorSearchResponse, dialogC42922Gsw, 9), C10K.LJIIIIZZ, c10h.LIZIZ());
                return;
            }
            dialogC42922Gsw.LJJ();
        }
    }

    public IDObjectS121S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onTextChanged$1(IDObjectS121S0200000_7 iDObjectS121S0200000_7, CharSequence charSequence, int i, int i2, int i3) {
        HashTagMobHelper hashTagMobHelper;
        List<? extends C42802Gr0> list;
        if (((GSR) iDObjectS121S0200000_7.l0).getText() != null) {
            ((C42796Gqu) iDObjectS121S0200000_7.l1).LJLL = ((GSR) iDObjectS121S0200000_7.l0).getNoAdTagText();
        } else {
            ((C42796Gqu) iDObjectS121S0200000_7.l1).LJLL = "";
        }
        C42796Gqu c42796Gqu = (C42796Gqu) iDObjectS121S0200000_7.l1;
        BaseTitleHelper baseTitleHelper = c42796Gqu.LL;
        if (baseTitleHelper != null) {
            String value = c42796Gqu.LJLL;
            o.LJIIIZ(value, "value");
            int LJJLIIIJLLLLLLLZ = s.LJJLIIIJLLLLLLLZ(value, '#', 0, 6);
            if (LJJLIIIJLLLLLLLZ != -1) {
                String substring = value.substring(0, LJJLIIIJLLLLLLLZ);
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                baseTitleHelper.LJLIL = s.LL(substring, '#');
            }
        }
        if (C73030SlO.LJFF(((C42796Gqu) iDObjectS121S0200000_7.l1).LJLL)) {
            ((C42796Gqu) iDObjectS121S0200000_7.l1).LJLLLLLL = true;
            return;
        }
        String str = "input_sharp";
        if (((C42796Gqu) iDObjectS121S0200000_7.l1).LJLL.endsWith("#")) {
            C42796Gqu c42796Gqu2 = (C42796Gqu) iDObjectS121S0200000_7.l1;
            c42796Gqu2.LJLLLLLL = true;
            if (i3 == 0) {
                str = "clear_to_sharp";
            }
            HashTagMobHelper hashTagMobHelper2 = c42796Gqu2.LLD;
            if (hashTagMobHelper2 == null) {
                return;
            }
            hashTagMobHelper2.jv0(str);
            return;
        }
        C42796Gqu c42796Gqu3 = (C42796Gqu) iDObjectS121S0200000_7.l1;
        if (c42796Gqu3.LJLLLLLL && !c42796Gqu3.LJLL.isEmpty() && (hashTagMobHelper = ((C42796Gqu) iDObjectS121S0200000_7.l1).LLD) != null && hashTagMobHelper.LJLJJI != null && (list = hashTagMobHelper.LJLJJLL) != null && !list.isEmpty()) {
            int i4 = 0;
            while (true) {
                if (i4 >= list.size()) {
                    break;
                }
                C42802Gr0 c42802Gr0 = (C42802Gr0) ListProtector.get(list, i4);
                if (o.LJ(hashTagMobHelper.LJLJJI, c42802Gr0.LIZ.challengeName)) {
                    hashTagMobHelper.hv0("input_sharp", c42802Gr0, Integer.valueOf(i4), "input");
                    break;
                }
                i4++;
            }
        }
        C42796Gqu c42796Gqu4 = (C42796Gqu) iDObjectS121S0200000_7.l1;
        c42796Gqu4.LJLLLLLL = false;
        c42796Gqu4.LIZ();
    }
}
