package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OXW implements C4RB {
    public final /* synthetic */ JSONObject LIZ;
    public final /* synthetic */ InterfaceC37146Ehy LIZIZ;

    @Override // X.C4RB
    public final void LIZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZIZ(BaseSharePackage sharePackage, String str) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LIZLLL(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        if (o.LJ(sharePackage.extras.getString("share_platform"), "chat_merge")) {
            JSONObject jSONObject = this.LIZ;
            if (jSONObject != null) {
                jSONObject.put("share_code", 1);
            }
            JSONObject jSONObject2 = this.LIZ;
            if (jSONObject2 != null) {
                jSONObject2.put("share_channel", sharePackage.extras.getString("share_platform"));
            }
            InterfaceC37146Ehy interfaceC37146Ehy = this.LIZIZ;
            if (interfaceC37146Ehy != null) {
                interfaceC37146Ehy.LIZIZ(this.LIZ);
            }
        }
    }

    @Override // X.C4RB
    public final void LJII(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.C4RB
    public final void LJIIIIZZ(BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    public OXW(JSONObject jSONObject, InterfaceC37146Ehy interfaceC37146Ehy) {
        this.LIZ = jSONObject;
        this.LIZIZ = interfaceC37146Ehy;
    }

    @Override // X.C4RB
    public final void LJFF(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZ(dialog, baseSharePackage);
    }

    @Override // X.C4RB
    public final void LJI(Dialog dialog, BaseSharePackage baseSharePackage) {
        C113284cW.LIZIZ(dialog, baseSharePackage);
    }
}
