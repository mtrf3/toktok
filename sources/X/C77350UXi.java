package X;

import com.bytedance.android.livesdk.hotword.HotWordGiftServiceImpl;
import com.bytedance.keva.Keva;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.UXi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77350UXi implements Keva.OnChangeListener {
    public final /* synthetic */ Keva LIZ;
    public final /* synthetic */ HotWordGiftServiceImpl LIZIZ;

    public C77350UXi(Keva keva, HotWordGiftServiceImpl hotWordGiftServiceImpl) {
        this.LIZ = keva;
        this.LIZIZ = hotWordGiftServiceImpl;
    }

    @Override // com.bytedance.keva.Keva.OnChangeListener
    public final void onChanged(Keva keva, String str) {
        if (o.LJ(keva.name(), this.LIZ.name()) && o.LJ(str, "feature_user_pref")) {
            HotWordGiftServiceImpl hotWordGiftServiceImpl = this.LIZIZ;
            Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = hotWordGiftServiceImpl.LJLJJI.iterator();
            while (it.hasNext()) {
                it.next().invoke(Boolean.valueOf(hotWordGiftServiceImpl.isUserEnabled()));
            }
        }
    }
}
