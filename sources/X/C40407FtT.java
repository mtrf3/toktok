package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.services.IInitialChooseLanguageManager;
import java.lang.ref.SoftReference;
import java.util.concurrent.Callable;

/* renamed from: X.FtT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40407FtT implements IInitialChooseLanguageManager {
    public boolean LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public SoftReference<Context> LIZLLL;
    public boolean LJ;
    public AY5 LJFF;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r0 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r2 == 1) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C40407FtT() {
        /*
            r6 = this;
            r6.<init>()
            android.content.Context r0 = X.EF7.LIZIZ()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = "en"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r3 = 1
            r0 = r0 ^ 1
            r5 = r0 ^ 1
            r4 = 0
            if (r5 == 0) goto L43
            java.lang.String r0 = "MY"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r1 = r0[r4]
            java.lang.String r0 = X.C85990Xow.LIZIZ()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L79
            r6.LIZJ = r1
            X.FcR r0 = X.C38986FRu.LIZ()
            int r0 = r0.LIZJ()
            if (r0 != r3) goto L43
            r5 = 0
        L43:
            r2 = 2
            if (r5 != 0) goto L4c
            X.C39576Fg4.LIZ(r2)
        L49:
            r6.LIZ = r4
            return
        L4c:
            android.content.Context r1 = X.EF7.LIZIZ()
            java.lang.String r0 = "InitialChooseLanguagePreferences"
            com.bytedance.keva.Keva r1 = com.bytedance.keva.KevaImpl.getRepoFromSp(r1, r0, r4)
            java.lang.String r0 = "getRepoFromSp(AppContext…ants.MODE_SINGLE_PROCESS)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "languageDialogShowState"
            int r0 = r1.getInt(r0, r4)
            if (r0 == 0) goto L68
            if (r0 == r3) goto L66
        L65:
            r3 = 0
        L66:
            r4 = r3
            goto L49
        L68:
            java.lang.Boolean r0 = X.C38987FRv.LIZLLL()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L73
            r2 = 1
        L73:
            X.C39576Fg4.LIZ(r2)
            if (r2 != r3) goto L65
            goto L66
        L79:
            r5 = 0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40407FtT.<init>():void");
    }

    public final void LIZ(final Context context) {
        final String[] strArr;
        ComponentCallbacks2 LJIJJ;
        SoftReference<Context> softReference;
        if (!this.LJ) {
            return;
        }
        if ((context == null && ((softReference = this.LIZLLL) == null || (context = softReference.get()) == null)) || C55511LqV.LJIIIZ) {
            return;
        }
        if (TextUtils.equals(this.LIZJ, "MY")) {
            strArr = new String[]{"ms-MY", "zh-Hant-TW", "en"};
        } else {
            strArr = null;
        }
        if (this.LIZ && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (LJIJJ instanceof InterfaceC55058LjC)) {
            InterfaceC36571c5 curFragment = ((InterfaceC55058LjC) LJIJJ).getCurFragment();
            if (curFragment instanceof InterfaceC54054LJi) {
                InterfaceC36571c5 w2 = ((InterfaceC54054LJi) curFragment).w2();
                if ((w2 instanceof InterfaceC40408FtU) && ((InterfaceC40408FtU) w2).og().equals("FeedRecommendFragment") && this.LIZIZ && strArr != null) {
                    C10K.LIZIZ(new Callable() { // from class: X.AY7
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C40407FtT c40407FtT = C40407FtT.this;
                            Context context2 = context;
                            String[] strArr2 = strArr;
                            c40407FtT.getClass();
                            if ((context2 instanceof Activity) && C45804HyK.LJIJJ(context2).isFinishing()) {
                                return null;
                            }
                            if (c40407FtT.LJFF == null) {
                                c40407FtT.LJFF = new AY5(context2, strArr2);
                            }
                            if (!c40407FtT.LJFF.isShowing()) {
                                AY5 ay5 = c40407FtT.LJFF;
                                if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/i18n/language/initial/InitialChooseLanguageDialog", "show", ay5, new Object[0], "void", new C65300Pk0(false, "()V", "5732683574684891218")).LIZ) {
                                    ay5.show();
                                }
                            }
                            c40407FtT.LIZ = false;
                            return null;
                        }
                    }, C10K.LJIIIIZZ, null);
                }
            }
        }
    }
}
