package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Gum, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43036Gum extends AbstractC43038Guo {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        o.LJIIIZ(type, "type");
        JSONObject json = ((InterfaceC43035Gul) xBaseParamModel).getData().toJSON();
        Intent intent = new Intent();
        intent.putExtra("star_atlas_object", json.toString());
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
            C60903NvH.LJIIJJI().LJJJI().LIZLLL().LIZ(LIZLLL, intent, true, false);
        }
    }
}
