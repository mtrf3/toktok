package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.OZq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62122OZq extends AbstractC62121OZp {
    public C62122OZq(C62116OZk c62116OZk) {
        super(c62116OZk);
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String url) {
        int i2;
        java.util.Map map;
        String LJIILIIL = C30591Hz.LJIILIIL(url, "schema_type");
        String LJIILIIL2 = C30591Hz.LJIILIIL(url, "object_id");
        if (TextUtils.isEmpty(LJIILIIL) || TextUtils.isEmpty(LJIILIIL2)) {
            return false;
        }
        try {
            i2 = CastIntegerProtector.parseInt(LJIILIIL);
        } catch (NumberFormatException unused) {
            i2 = 0;
        }
        this.LIZ = C45804HyK.LJFF(i2, LJIILIIL2);
        if (i2 == 1) {
            if (MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAppLinkHandlerV2ActivityClass(EF7.LIZIZ(), url, "QrCode").booleanValue()) {
                return true;
            }
        }
        InterfaceC62128OZw interfaceC62128OZw = this.LIZIZ;
        o.LJIIIZ(url, "url");
        try {
            map = (java.util.Map) new Gson().LJII(C30591Hz.LJIILIIL(url, "meta_params"), new TypeToken<java.util.Map<String, ? extends Object>>() { // from class: X.2Qx
            }.getType());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            map = null;
        }
        return ((C62116OZk) interfaceC62128OZw).LIZ(i2, LJIILIIL2, url, map);
    }
}
