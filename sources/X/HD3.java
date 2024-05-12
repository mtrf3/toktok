package X;

import android.graphics.Bitmap;
import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HD3 extends HDA {
    public final C62822Ol8 LJIIL;
    public final C62822Ol8 LJIILIIL;

    public static Object LJII(Bitmap bitmap, String str, InterfaceC67352kd interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (bitmap == null) {
            C78966Uyw.LJJL(null, c84654XKg);
        } else {
            C44729Hgz.LJJJJLI(bitmap, str, Bitmap.CompressFormat.JPEG, 4);
            C78966Uyw.LJJL(str, c84654XKg);
        }
        return c84654XKg.LIZ();
    }

    @Override // X.HDD
    public final void LIZ(InterfaceC65784Pro<C76800UCe> onTakePhotoFinish, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, I4X i4x) {
        String str;
        o.LJIIIZ(onTakePhotoFinish, "onTakePhotoFinish");
        if (!this.LJI.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ((Handler) this.LJIIIIZZ.getValue()).postDelayed((Runnable) this.LJIIJ.getValue(), 600L);
        if (i4x != null && (str = i4x.LJLIL) != null) {
            ((HD2) this.LJIILIIL.getValue()).LIZJ(str);
        }
        XKX.LIZLLL((InterfaceC70422pa) this.LJIIL.getValue(), null, null, new C43660HBo(this, i4x, arrayList, interfaceC88472Yns, onTakePhotoFinish, currentTimeMillis, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HD3(ActivityC45651qj activity, InterfaceC65784Pro<? extends I0N> stickerApiComponentProvider, InterfaceC65784Pro<? extends InterfaceC82086WJm> cameraApiComponentProvider, InterfaceC65784Pro<? extends ShortVideoContext> shortVideoContextProvider, InterfaceC65784Pro<? extends WRP> filterApiComponentProvider, InterfaceC65784Pro<? extends I37> beautyApiComponentProvider, LifecycleOwner lifecycleOwner) {
        super(activity, stickerApiComponentProvider, cameraApiComponentProvider, shortVideoContextProvider, filterApiComponentProvider, beautyApiComponentProvider, lifecycleOwner);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(stickerApiComponentProvider, "stickerApiComponentProvider");
        o.LJIIIZ(cameraApiComponentProvider, "cameraApiComponentProvider");
        o.LJIIIZ(shortVideoContextProvider, "shortVideoContextProvider");
        o.LJIIIZ(filterApiComponentProvider, "filterApiComponentProvider");
        o.LJIIIZ(beautyApiComponentProvider, "beautyApiComponentProvider");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJIIL = C221108m2.LIZIZ(HD6.LJLIL);
        this.LJIILIIL = C221108m2.LIZIZ(new AqS157S0100000_7(shortVideoContextProvider, 507));
    }
}
