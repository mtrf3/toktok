package Y;

import X.BG7;
import X.C29275BeJ;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadImageMethod;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;

/* loaded from: classes6.dex */
public class IDxS129S0200000_5 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$1(IDxS129S0200000_5 iDxS129S0200000_5) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                onError$1(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public static final void onComplete$0(IDxS129S0200000_5 iDxS129S0200000_5) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) iDxS129S0200000_5.l1;
        UploadImageMethod.Result.ImageResult[] imageResultArr = (UploadImageMethod.Result.ImageResult[]) iDxS129S0200000_5.l0;
        uploadImageMethod.getClass();
        uploadImageMethod.finishWithResult(new UploadImageMethod.Result(imageResultArr));
    }

    public static final void onError$0(IDxS129S0200000_5 iDxS129S0200000_5, Throwable th) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) iDxS129S0200000_5.l1;
        UploadImageMethod.Result.ImageResult[] imageResultArr = (UploadImageMethod.Result.ImageResult[]) iDxS129S0200000_5.l0;
        uploadImageMethod.getClass();
        uploadImageMethod.finishWithResult(new UploadImageMethod.Result(imageResultArr));
    }

    public static final void onError$1(IDxS129S0200000_5 iDxS129S0200000_5, Throwable th) {
        BG7 bg7 = (BG7) iDxS129S0200000_5.l0;
        if (bg7 != null) {
            bg7.LIZIZ();
        }
    }

    public static final void onNext$0(IDxS129S0200000_5 iDxS129S0200000_5, Object obj) {
        UploadImageMethod uploadImageMethod = (UploadImageMethod) iDxS129S0200000_5.l1;
        int i = uploadImageMethod.LJLJJI + 1;
        uploadImageMethod.LJLJJI = i;
        UploadImageMethod.Result.ImageResult[] imageResultArr = (UploadImageMethod.Result.ImageResult[]) iDxS129S0200000_5.l0;
        if (i == imageResultArr.length) {
            uploadImageMethod.finishWithResult(new UploadImageMethod.Result(imageResultArr));
        }
    }

    public static final void onNext$1(IDxS129S0200000_5 iDxS129S0200000_5, Object obj) {
        FollowPair followPair = (FollowPair) obj;
        BG7 bg7 = (BG7) iDxS129S0200000_5.l0;
        if (bg7 != null) {
            bg7.LIZ(followPair);
        }
    }

    public static final void onSubscribe$0(IDxS129S0200000_5 iDxS129S0200000_5, InterfaceC92693kP interfaceC92693kP) {
        ((UploadImageMethod) iDxS129S0200000_5.l1).LJLIL = interfaceC92693kP;
    }

    public static final void onSubscribe$1(IDxS129S0200000_5 iDxS129S0200000_5, InterfaceC92693kP interfaceC92693kP) {
        ((C29275BeJ) iDxS129S0200000_5.l1).LIZ.LIZ(interfaceC92693kP);
    }

    public IDxS129S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
