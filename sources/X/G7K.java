package X;

import Y.AfS59S0100000_7;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.shortvideo.CheckTitleSensitivityResult;
import com.ss.android.ugc.aweme.shortvideo.PostPrompts;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class G7K {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final boolean LIZ;
    public Boolean LIZIZ;
    public CheckTitleSensitivityResult LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public T03 LJFF;
    public final long LJI;
    public C73411SrX LJII;
    public C73411SrX LJIIIIZZ;

    public final void LIZ() {
        CheckTitleSensitivityResult checkTitleSensitivityResult;
        PostPrompts postPrompts;
        String postAnyway;
        CheckTitleSensitivityResult checkTitleSensitivityResult2;
        PostPrompts postPrompts2;
        String goBack;
        PostPrompts postPrompts3;
        H78.LIZ("TitleSensitivity checkresult triggered");
        CheckTitleSensitivityResult checkTitleSensitivityResult3 = this.LIZJ;
        String str = null;
        if (checkTitleSensitivityResult3 != null && (postPrompts3 = checkTitleSensitivityResult3.getPostPrompts()) != null) {
            str = postPrompts3.getText();
        }
        boolean z = false;
        if (str != null && str.length() != 0 && (checkTitleSensitivityResult = this.LIZJ) != null && (postPrompts = checkTitleSensitivityResult.getPostPrompts()) != null && (postAnyway = postPrompts.getPostAnyway()) != null && postAnyway.length() != 0 && (checkTitleSensitivityResult2 = this.LIZJ) != null && (postPrompts2 = checkTitleSensitivityResult2.getPostPrompts()) != null && (goBack = postPrompts2.getGoBack()) != null && goBack.length() != 0) {
            z = true;
        }
        this.LIZIZ = Boolean.valueOf(z);
    }

    public final void LIZIZ() {
        String str = this.LIZLLL;
        if (str == null || str.length() == 0) {
            str = "";
        }
        if (C44172HVg.LJIJ.isChildrenMode()) {
            return;
        }
        C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI();
        C73870Syw LJJLIIIJJI = H0W.LIZIZ(str, EnumC41098GBa.TEXT_TYPE_TITLE).LJJLIIIJJI(this.LJI, TimeUnit.MILLISECONDS);
        C73320Sq4.LIZIZ(16, "initialCapacity");
        T03 t03 = new T03(LJJLIIIJJI);
        this.LJII = (C73411SrX) t03.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(this, 36), new AfS59S0100000_7(this, 37));
        this.LJFF = t03;
    }

    public G7K() {
        this.LJI = Q7K.LIZIZ("maximum_delay", LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G7K(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.LIZ = r7
            r3 = 0
            if (r5 == 0) goto L14
            int r0 = r5.length()
            if (r0 <= 0) goto L14
            r0 = 32
            java.lang.String r6 = X.C00F.LIZIZ(r5, r0, r6)
        L14:
            X.HEa r0 = X.C78934UyQ.LJLIL
            X.HF1 r0 = r0.LIZLLL()
            r0.getClass()
            boolean r0 = X.AnonymousClass842.LIZ()
            r2 = 0
            if (r0 == 0) goto L2e
            if (r6 == 0) goto L51
            java.lang.String r1 = "\n+"
            java.lang.String r0 = " "
            java.lang.String r6 = X.QZP.LIZIZ(r1, r6, r0)
        L2e:
            if (r6 == 0) goto L51
            java.lang.CharSequence r0 = ujb.s.LJZI(r6)
            java.lang.String r1 = r0.toString()
        L38:
            r4.LIZJ = r2
            r4.LIZIZ = r2
            r4.LJ = r3
            r4.LJFF = r2
            X.SrX r0 = r4.LJII
            if (r0 == 0) goto L47
            r0.dispose()
        L47:
            X.SrX r0 = r4.LJIIIIZZ
            if (r0 == 0) goto L4e
            r0.dispose()
        L4e:
            r4.LIZLLL = r1
            return
        L51:
            r1 = r2
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G7K.<init>(java.lang.String, java.lang.String, boolean):void");
    }
}
