package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public final class OT6 extends AbstractC45338Hqo {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF = "opensdk";
    public int LJI = -1;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    @Override // X.AbstractC45338Hqo
    public final int getType() {
        return 1;
    }

    public OT6() {
    }

    public OT6(Bundle bundle) {
        fromBundle(bundle);
    }

    @Override // X.AbstractC45338Hqo
    public final void fromBundle(Bundle bundle) {
        super.fromBundle(bundle);
        this.LIZ = bundle.getString("_bytedance_params_state");
        this.LIZJ = bundle.getString("_bytedance_params_client_key");
        this.LIZLLL = bundle.getString("_bytedance_params_client_secret");
        this.LIZIZ = bundle.getString("_bytedance_params_redirect_uri");
        this.LJ = bundle.getString("_bytedance_params_next_url");
        this.LJII = bundle.getString("_bytedance_params_scope");
        this.LJIIIIZZ = bundle.getString("_bytedance_params_optional_scope0");
        this.LJIIIZ = bundle.getString("_bytedance_params_optional_scope1");
        this.LJI = bundle.getInt("wap_requested_orientation", -1);
        this.LJFF = bundle.getString("wap_to_native_from_tag", "opensdk");
    }

    @Override // X.AbstractC45338Hqo
    public final void toBundle(Bundle bundle) {
        super.toBundle(bundle);
        bundle.putString("_bytedance_params_state", this.LIZ);
        bundle.putString("_bytedance_params_client_key", this.LIZJ);
        bundle.putString("_bytedance_params_client_secret", this.LIZLLL);
        bundle.putString("_bytedance_params_redirect_uri", this.LIZIZ);
        bundle.putString("_bytedance_params_next_url", this.LJ);
        bundle.putString("_bytedance_params_scope", this.LJII);
        bundle.putString("_bytedance_params_optional_scope0", this.LJIIIIZZ);
        bundle.putString("_bytedance_params_optional_scope1", this.LJIIIZ);
        bundle.putInt("wap_requested_orientation", this.LJI);
        bundle.putString("wap_to_native_from_tag", this.LJFF);
    }
}
