package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;

/* renamed from: X.SPa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72038SPa<T> implements InterfaceC64592gB {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public C72038SPa(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C72041SPd.LIZ.getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        if (LJI != null) {
            String key = this.LJLIL;
            int i = this.LJLILLLLZI;
            o.LJIIIZ(key, "key");
            LJI.LJLIL.put(key, Integer.valueOf(i));
            C72042SPe.LIZJ(LJI);
        }
    }
}
