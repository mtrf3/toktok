package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.f;
import kotlin.jvm.internal.AqS50S1200000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.KKr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51541KKr extends f {
    public final void LJII(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op_args", str);
            jSONObject.put("alert_id", str2);
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                interfaceC38263Ezz.LIZ("onAlertButtonClickAction", jSONObject);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        f.b bVar = (f.b) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            String title = bVar.getTitle();
            String content = bVar.getContent();
            f.c buttons = bVar.getButtons();
            String id = bVar.getId();
            String text = buttons.getCancel().getText();
            String text2 = buttons.getConfirm().getText();
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                C26227ARb c26227ARb = new C26227ARb(LJIIIIZZ);
                if (!TextUtils.isEmpty(title)) {
                    c26227ARb.LJFF(title);
                }
                if (!TextUtils.isEmpty(content)) {
                    c26227ARb.LIZIZ(content);
                }
                c26227ARb.LJII = false;
                UC0.LIZJ(c26227ARb, new C51542KKs(text2, text, this, id));
                c26227ARb.LIZJ(new AqS50S1200000_8(this, LJIIIIZZ, id, 1));
                c26227ARb.LJI().LIZLLL();
            }
        } catch (Exception e) {
            IGE.LIZ(e, "GetSearchHistoryMethod");
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C31626Cb8.LIZ(c37356ElM, 0, message, 4);
            C16880lQ.LLLLIIL(e);
        }
    }
}
