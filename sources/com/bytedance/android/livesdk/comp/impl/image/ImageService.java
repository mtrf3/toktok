package com.bytedance.android.livesdk.comp.impl.image;

import X.BQO;
import X.C30790C6o;
import X.C76800UCe;
import X.C780334l;
import X.C78613UtF;
import X.C78720Uuy;
import X.C79561VKj;
import X.CXF;
import X.InterfaceC88472Yns;
import X.O5T;
import X.ORY;
import X.W8E;
import X.XKX;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.image.IImageService;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ImageService implements IImageService {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final BQO DB() {
        return new C78720Uuy();
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final boolean hh(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return W8E.LJII().LJI().LJII(UriProtector.parse(str));
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final void Ag(String str, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        if (!TextUtils.isEmpty(str)) {
            W8E.LJII().LJI().LJIIIZ(UriProtector.parse(str)).LJ(new CXF(interfaceC88472Yns), C79561VKj.LJLIL);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.image.IImageService
    public final void LJJLIIIJLLLLLLLZ(JSONObject jSONObject, String requestId, boolean z) {
        o.LJIIIZ(requestId, "requestId");
        String optString = jSONObject.optString("biz_tag");
        String optString2 = jSONObject.optString("uri");
        if (!ORY.LJJIJIIJIL(optString, (Object[]) C30790C6o.LIZ.getValue())) {
            return;
        }
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new O5T(jSONObject, optString, z, optString2, null), 2);
    }
}
