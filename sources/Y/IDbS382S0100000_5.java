package Y;

import X.AbstractC38123Exj;
import X.C31886CfK;
import X.C76884UFk;
import X.C76885UFl;
import X.InterfaceC31920Cfs;
import X.QBR;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ChooseImageMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ShareInfoMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.SharePanelMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadPhotoV2Method;
import com.bytedance.android.livesdk.container.ui.HybridFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.lynx.ui.TTLiveLynxFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public class IDbS382S0100000_5 implements InterfaceC31920Cfs {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC31920Cfs
    public final AbstractC38123Exj LIZ() {
        switch (this.$t) {
            case 0:
                return LIZ$0(this);
            case 1:
                return LIZ$1(this);
            case 2:
                return LIZ$2(this);
            case 3:
                return LIZ$3(this);
            case 4:
                return LIZ$4(this);
            case 5:
                return LIZ$5(this);
            case 6:
                return LIZ$6(this);
            case 7:
                return LIZ$7(this);
            case 8:
                return LIZ$8(this);
            case 9:
                return LIZ$9(this);
            case 10:
                return LIZ$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return LIZ$11(this);
            case 12:
                return LIZ$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return LIZ$13(this);
            case 14:
                return LIZ$14(this);
            case 15:
                return LIZ$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return LIZ$16(this);
            case 17:
                return LIZ$17(this);
            case 18:
                return LIZ$18(this);
            case 19:
                return LIZ$19(this);
            case 20:
                return LIZ$20(this);
            case 21:
                return LIZ$21(this);
            case 22:
                return LIZ$22(this);
            case 23:
                return LIZ$23(this);
            case 24:
                return LIZ$24(this);
            case 25:
                return LIZ$25(this);
            case 26:
                return LIZ$26(this);
            case 27:
                return LIZ$27(this);
            case 28:
                return LIZ$28(this);
            case 29:
                return LIZ$29(this);
            case 30:
                return LIZ$30(this);
            default:
                return null;
        }
    }

    public static final AbstractC38123Exj LIZ$0(IDbS382S0100000_5 iDbS382S0100000_5) {
        ChooseImageMethod chooseImageMethod = new ChooseImageMethod((TTLiveLynxFragment) iDbS382S0100000_5.l0);
        ((TTLiveLynxFragment) iDbS382S0100000_5.l0).LL = chooseImageMethod;
        return chooseImageMethod;
    }

    public static final AbstractC38123Exj LIZ$1(IDbS382S0100000_5 iDbS382S0100000_5) {
        C76884UFk c76884UFk = new C76884UFk((TTLiveLynxFragment) iDbS382S0100000_5.l0);
        ((TTLiveLynxFragment) iDbS382S0100000_5.l0).LLD = c76884UFk;
        return c76884UFk;
    }

    public static final AbstractC38123Exj LIZ$10(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        return new EditImageForSubMethod(tTLiveBrowserFragment);
    }

    public static final AbstractC38123Exj LIZ$11(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        C76885UFl c76885UFl = new C76885UFl(tTLiveBrowserFragment);
        tTLiveBrowserFragment.LLIIZ = c76885UFl;
        return c76885UFl;
    }

    public static final AbstractC38123Exj LIZ$12(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new EncryptedUploadMethod((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$13(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new ChooseImageMethod((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$14(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new C76884UFk((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$15(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new QBR((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$16(IDbS382S0100000_5 iDbS382S0100000_5) {
        C31886CfK c31886CfK = (C31886CfK) iDbS382S0100000_5.l0;
        c31886CfK.getClass();
        return new QBR(c31886CfK.LJLIL);
    }

    public static final AbstractC38123Exj LIZ$17(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new EditImageForSubMethod((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$18(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new C76885UFl((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$19(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new UploadPhotoV2Method((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$2(IDbS382S0100000_5 iDbS382S0100000_5) {
        EditImageForSubMethod editImageForSubMethod = new EditImageForSubMethod((TTLiveLynxFragment) iDbS382S0100000_5.l0);
        ((TTLiveLynxFragment) iDbS382S0100000_5.l0).getClass();
        return editImageForSubMethod;
    }

    public static final AbstractC38123Exj LIZ$20(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new ShareInfoMethod((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$21(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new SharePanelMethod((SparkContext) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$22(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new SharePanelMethod((HybridFragment) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$23(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new ShareInfoMethod((HybridFragment) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$24(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new SharePanelMethod((HybridFragment) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$25(IDbS382S0100000_5 iDbS382S0100000_5) {
        UploadPhotoV2Method uploadPhotoV2Method = new UploadPhotoV2Method((HybridFragment) iDbS382S0100000_5.l0);
        ((HybridFragment) iDbS382S0100000_5.l0).LJLJLJ.put("uploadPicture", uploadPhotoV2Method);
        return uploadPhotoV2Method;
    }

    public static final AbstractC38123Exj LIZ$26(IDbS382S0100000_5 iDbS382S0100000_5) {
        EncryptedUploadMethod encryptedUploadMethod = new EncryptedUploadMethod((HybridFragment) iDbS382S0100000_5.l0);
        ((HybridFragment) iDbS382S0100000_5.l0).LJLJLJ.put("upload", encryptedUploadMethod);
        return encryptedUploadMethod;
    }

    public static final AbstractC38123Exj LIZ$27(IDbS382S0100000_5 iDbS382S0100000_5) {
        ChooseImageMethod chooseImageMethod = new ChooseImageMethod((HybridFragment) iDbS382S0100000_5.l0);
        ((HybridFragment) iDbS382S0100000_5.l0).LJLJLJ.put("chooseImage", chooseImageMethod);
        return chooseImageMethod;
    }

    public static final AbstractC38123Exj LIZ$28(IDbS382S0100000_5 iDbS382S0100000_5) {
        C76884UFk c76884UFk = new C76884UFk((HybridFragment) iDbS382S0100000_5.l0);
        ((HybridFragment) iDbS382S0100000_5.l0).LJLJLJ.put("chooseImageForSub", c76884UFk);
        return c76884UFk;
    }

    public static final AbstractC38123Exj LIZ$29(IDbS382S0100000_5 iDbS382S0100000_5) {
        return new EditImageForSubMethod((HybridFragment) iDbS382S0100000_5.l0);
    }

    public static final AbstractC38123Exj LIZ$3(IDbS382S0100000_5 iDbS382S0100000_5) {
        C76885UFl c76885UFl = new C76885UFl((TTLiveLynxFragment) iDbS382S0100000_5.l0);
        ((TTLiveLynxFragment) iDbS382S0100000_5.l0).LLF = c76885UFl;
        return c76885UFl;
    }

    public static final AbstractC38123Exj LIZ$30(IDbS382S0100000_5 iDbS382S0100000_5) {
        C76885UFl c76885UFl = new C76885UFl((HybridFragment) iDbS382S0100000_5.l0);
        ((HybridFragment) iDbS382S0100000_5.l0).LJLJLJ.put("openCameraForSub", c76885UFl);
        return c76885UFl;
    }

    public static final AbstractC38123Exj LIZ$4(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        return new ShareInfoMethod(tTLiveBrowserFragment);
    }

    public static final AbstractC38123Exj LIZ$5(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        return new SharePanelMethod(tTLiveBrowserFragment);
    }

    public static final AbstractC38123Exj LIZ$6(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        UploadPhotoV2Method uploadPhotoV2Method = new UploadPhotoV2Method(tTLiveBrowserFragment);
        tTLiveBrowserFragment.LLIIL = uploadPhotoV2Method;
        return uploadPhotoV2Method;
    }

    public static final AbstractC38123Exj LIZ$7(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        ChooseImageMethod chooseImageMethod = new ChooseImageMethod(tTLiveBrowserFragment);
        tTLiveBrowserFragment.LLIIJLIL = chooseImageMethod;
        return chooseImageMethod;
    }

    public static final AbstractC38123Exj LIZ$8(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        EncryptedUploadMethod encryptedUploadMethod = new EncryptedUploadMethod(tTLiveBrowserFragment);
        tTLiveBrowserFragment.LLIILII = encryptedUploadMethod;
        return encryptedUploadMethod;
    }

    public static final AbstractC38123Exj LIZ$9(IDbS382S0100000_5 iDbS382S0100000_5) {
        TTLiveBrowserFragment tTLiveBrowserFragment = (TTLiveBrowserFragment) iDbS382S0100000_5.l0;
        tTLiveBrowserFragment.getClass();
        C76884UFk c76884UFk = new C76884UFk(tTLiveBrowserFragment);
        tTLiveBrowserFragment.LLIILZL = c76884UFk;
        return c76884UFk;
    }

    public IDbS382S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
