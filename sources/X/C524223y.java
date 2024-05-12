package X;

import com.bytedance.pitaya.api.feature.store.PTYFeatureStoreInstance;
import org.json.JSONObject;

/* renamed from: X.23y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C524223y extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ JSONObject LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C524223y(JSONObject jSONObject, String str) {
        super(0);
        this.LJLIL = jSONObject;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        this.LJLIL.putOpt("timestamp", Long.valueOf(System.currentTimeMillis() / 1000));
        PTYFeatureStoreInstance.INSTANCE.getFeatureStore().addFeature(this.LJLILLLLZI, this.LJLIL, "global_live_basic");
        return C76800UCe.LIZ;
    }
}
