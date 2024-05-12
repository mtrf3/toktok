package X;

import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R5j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68979R5j extends AbstractC65781Prl implements InterfaceC88472Yns<C10K<Bundle>, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ QTZ LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68979R5j(Activity activity, QTX qtx, JSONObject jSONObject, boolean z) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = activity;
        this.LJLJI = jSONObject;
        this.LJLJJI = qtx;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C10K<Bundle> it) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String string;
        o.LJIIIZ(it, "it");
        if (!this.LJLIL) {
            this.LJLILLLLZI.finish();
        }
        String str6 = "";
        if (R41.LJI()) {
            R41.LJIIL(1, 1, "");
        }
        C69101RAb.LIZIZ(11);
        C69101RAb.LIZIZ(9);
        R41.LJIIIIZZ(R41.LIZJ());
        JSONObject jSONObject = this.LJLJI;
        if (jSONObject != null) {
            str = jSONObject.optString("enter_from");
        } else {
            str = null;
        }
        if (o.LJ("find_account", str)) {
            C2U8.LIZ(new C46427IJz());
            C2U8.LIZ(new C60058Nhe());
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZLLL("enter_method", "find_account");
            c35936E8m.LIZLLL("enter_from", "find_account");
            Bundle LLJJIJI = C16880lQ.LLJJIJI(this.LJLILLLLZI.getIntent());
            if (LLJJIJI == null || (str2 = LLJJIJI.getString("login_panel_type")) == null) {
                str2 = "";
            }
            c35936E8m.LIZLLL("login_panel_type", str2);
            int i = 0;
            c35936E8m.LIZ(0, "is_register");
            c35936E8m.LIZ(0, "error_code");
            c35936E8m.LIZIZ(this.LJLJJI.LIZ, "user_id");
            c35936E8m.LIZ(0, "gms_auto_fill");
            c35936E8m.LIZLLL("enter_type", "find_account");
            c35936E8m.LIZLLL("platform", "verified_env");
            Bundle LLJJIJI2 = C16880lQ.LLJJIJI(this.LJLILLLLZI.getIntent());
            if (LLJJIJI2 == null || (str3 = LLJJIJI2.getString("group_id")) == null) {
                str3 = "";
            }
            c35936E8m.LIZLLL("group_id", str3);
            Bundle LLJJIJI3 = C16880lQ.LLJJIJI(this.LJLILLLLZI.getIntent());
            if (LLJJIJI3 == null || (str4 = LLJJIJI3.getString("author_id")) == null) {
                str4 = "";
            }
            c35936E8m.LIZLLL("author_id", str4);
            Bundle LLJJIJI4 = C16880lQ.LLJJIJI(this.LJLILLLLZI.getIntent());
            if (LLJJIJI4 == null || (str5 = LLJJIJI4.getString("previous_login_method")) == null) {
                str5 = "";
            }
            c35936E8m.LIZLLL("previous_login_method", str5);
            Bundle LLJJIJI5 = C16880lQ.LLJJIJI(this.LJLILLLLZI.getIntent());
            if (LLJJIJI5 != null && (string = LLJJIJI5.getString("prev_login_platform")) != null) {
                str6 = string;
            }
            c35936E8m.LIZLLL("prev_login_platform", str6);
            Bundle LLJJIJI6 = C16880lQ.LLJJIJI(this.LJLILLLLZI.getIntent());
            if (LLJJIJI6 != null) {
                i = LLJJIJI6.getInt("encouraged_platform");
            }
            c35936E8m.LIZ(i, "encouraged_platform");
            C68972R5c.LIZ(c35936E8m);
            FMX.LJIIL("login_success", c35936E8m.LIZ);
        }
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(C10K<Bundle> c10k) {
        invoke2(c10k);
        return C76800UCe.LIZ;
    }
}
