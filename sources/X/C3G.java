package X;

import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C3G {
    public final DataChannel LIZ;
    public final InterfaceC21020s6 LIZIZ;
    public final C11000bw LIZJ;

    public static Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public final void LIZJ(Bitmap bitmap, Cert cert) {
        if (bitmap != null) {
            InterfaceC21020s6 interfaceC21020s6 = this.LIZIZ;
            if (interfaceC21020s6 != null) {
                interfaceC21020s6.LJIILL(bitmap, cert);
                return;
            }
            return;
        }
        InterfaceC21020s6 interfaceC21020s62 = this.LIZIZ;
        if (interfaceC21020s62 == null) {
            return;
        }
        interfaceC21020s62.LIZJ(cert);
    }

    public C3G(DataChannel dataChannel, InterfaceC21020s6 interfaceC21020s6, C11000bw c11000bw) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC21020s6;
        this.LIZJ = c11000bw;
        if (dataChannel != null) {
            dataChannel.mv0(PauseLiveChannel.class, this, new C30657C1l(this));
        }
    }

    public final void LIZIZ(AbstractC39330Fc6 cert, boolean z, InterfaceC65784Pro interfaceC65784Pro) {
        Room room;
        User owner;
        ImageModel avatarThumb;
        C79238V7y c79238V7y;
        o.LJIIIZ(cert, "cert");
        float LJIIL = C15380j0.LJIIL() / C15380j0.LJIIJJI();
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null || (owner = room.getOwner()) == null || (avatarThumb = owner.getAvatarThumb()) == null) {
            return;
        }
        int LJIIL2 = C15380j0.LJIIL();
        int LJIIJJI = C15380j0.LJIIJJI();
        C78739UvH c78739UvH = new C78739UvH(LJIIL);
        final C3H c3h = new C3H(z, interfaceC65784Pro, this, cert);
        if (LJIIL2 > 0 && LJIIJJI > 0) {
            c79238V7y = new C79238V7y(LJIIL2, LJIIJJI);
        } else {
            c79238V7y = null;
        }
        W5O[] LIZLLL = C15620jO.LIZLLL(avatarThumb, c79238V7y, c78739UvH);
        if (LIZLLL == null || LIZLLL.length == 0) {
            return;
        }
        final W4W<C81392Vwy<W5A>> LJ = W8E.LJII().LJI().LJ(LIZLLL[0], null);
        ((AbstractC48384Iyq) LJ).LJ(new AbstractC32209CkX() { // from class: X.21u
            @Override // X.AbstractC32664Crs
            public final void LJ(W4W<C81392Vwy<W5A>> w4w) {
                if (w4w != null) {
                    w4w.close();
                }
                C3I c3i = c3h;
                if (c3i != null) {
                    C15620jO.LIZ.post(new IDRunnableS6S0101000(0, c3i, 27));
                }
            }

            @Override // X.AbstractC32209CkX
            public final void LJI(Bitmap bitmap) {
                if (W4W.this.LIZIZ() && bitmap != null) {
                    C15620jO.LIZ.post(new IDRunnableS0S0201000(0, c3h, Bitmap.createBitmap(bitmap), 11));
                } else {
                    C3I c3i = c3h;
                    if (c3i != null) {
                        C15620jO.LIZ.post(new IDRunnableS6S0101000(0, c3i, 26));
                    }
                }
                W4W.this.close();
            }
        }, C79561VKj.LJLIL);
    }
}
