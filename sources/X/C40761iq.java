package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40761iq extends V1B {
    public long LJLJJL;
    public boolean LJLJJLL;
    public final /* synthetic */ LiveEffect LJLJL;
    public final /* synthetic */ DataChannel LJLJLJ;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        this.LJLJJL = System.currentTimeMillis();
    }

    public C40761iq(LiveEffect liveEffect, DataChannel dataChannel) {
        String str;
        List<String> list;
        List<String> list2;
        this.LJLJL = liveEffect;
        this.LJLJLJ = dataChannel;
        UrlModel urlModel = liveEffect.icon;
        String str2 = null;
        if (urlModel != null && (list2 = urlModel.urlList) != null) {
            str = (String) ORZ.LJLLLL(list2);
        } else {
            str = null;
        }
        C62822Ol8 c62822Ol8 = C15650jR.LIZ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-service>(...)");
        this.LJLJJLL = ((IImageService) value).hh(str);
        UrlModel urlModel2 = liveEffect.icon;
        if (urlModel2 != null && (list = urlModel2.urlList) != null) {
            str2 = (String) ORZ.LJLLLL(list);
        }
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 21);
        Object value2 = c62822Ol8.getValue();
        o.LJIIIIZZ(value2, "<get-service>(...)");
        ((IImageService) value2).Ag(str2, iDqS416S0100000);
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C0G7.LIZ(this.LJLJLJ, this.LJLJL, false, System.currentTimeMillis() - this.LJLJJL);
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        if (this.LJLJJLL) {
            return;
        }
        C0G7.LIZ(this.LJLJLJ, this.LJLJL, true, System.currentTimeMillis() - this.LJLJJL);
    }
}
