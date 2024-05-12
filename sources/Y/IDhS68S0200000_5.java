package Y;

import X.AbstractC73672Svk;
import X.AbstractC73745Swv;
import X.C31866Cf0;
import X.InterfaceC48038ItG;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EncryptedUploadMethod;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadPhotoV2Method;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDhS68S0200000_5 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS68S0200000_5 iDhS68S0200000_5, Object obj) {
        UploadPhotoV2Method uploadPhotoV2Method = (UploadPhotoV2Method) iDhS68S0200000_5.l0;
        byte[] bArr = (byte[]) iDhS68S0200000_5.l1;
        uploadPhotoV2Method.getClass();
        return ((AbstractC73745Swv) obj).LIZJ(new IDhS71S0200000_12(uploadPhotoV2Method, bArr, 0));
    }

    public static final Object apply$1(IDhS68S0200000_5 iDhS68S0200000_5, Object obj) {
        return AbstractC73672Svk.LJIIJ(new C31866Cf0((String) obj, 0, iDhS68S0200000_5, (byte[]) iDhS68S0200000_5.l0));
    }

    public static final Object apply$2(IDhS68S0200000_5 iDhS68S0200000_5, Object obj) {
        EncryptedUploadMethod encryptedUploadMethod = (EncryptedUploadMethod) iDhS68S0200000_5.l0;
        return encryptedUploadMethod.LJJIIZI((String) obj, encryptedUploadMethod.LJLJLLL, (byte[]) iDhS68S0200000_5.l1);
    }

    public static final Object apply$3(IDhS68S0200000_5 iDhS68S0200000_5, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        o.LJIIIZ(bitmap, "bitmap");
        EmoteModel emoteModel = (EmoteModel) iDhS68S0200000_5.l0;
        emoteModel.emoteResource = new BitmapDrawable((Resources) iDhS68S0200000_5.l1, bitmap);
        return emoteModel;
    }

    public IDhS68S0200000_5(EncryptedUploadMethod encryptedUploadMethod, byte[] bArr, int i) {
        this.$t = i;
        switch (i) {
            case 1:
                this.l1 = encryptedUploadMethod;
                this.l0 = bArr;
                return;
            default:
                this.l0 = encryptedUploadMethod;
                this.l1 = bArr;
                return;
        }
    }

    public IDhS68S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
