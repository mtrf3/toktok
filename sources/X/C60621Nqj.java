package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Nqj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60621Nqj implements InterfaceC60761Nsz {
    @Override // X.InterfaceC60761Nsz
    public final void LIZ(java.util.Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC60761Nsz
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC60761Nsz
    public final View LIZJ() {
        return null;
    }

    @Override // X.InterfaceC60761Nsz
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJI(boolean z) {
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJII(Context context) {
        o.LJIIJ(context, "context");
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIJJI(SparkSchemaParam sparkSchemaParam) {
    }

    @Override // X.InterfaceC60761Nsz
    public final java.util.Map<String, Object> getGlobalProps() {
        return null;
    }

    @Override // X.InterfaceC60761Nsz
    public final void load(String url) {
        o.LJIIJ(url, "url");
    }

    @Override // X.InterfaceC60761Nsz
    public final void onHide() {
    }

    @Override // X.InterfaceC60761Nsz
    public final void onShow() {
    }

    @Override // X.InterfaceC60761Nsz
    public final void reload() {
    }

    @Override // X.InterfaceC60761Nsz
    public final void updateData(java.util.Map<String, ? extends Object> map) {
    }

    @Override // X.InterfaceC60761Nsz
    public final C60737Nsb getHybridContext() {
        return new C60737Nsb();
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJ(String eventName, java.util.Map<String, ? extends Object> map) {
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZJ(this, eventName, map);
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIIZ(String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZIZ(this, eventName, jSONObject);
    }

    @Override // X.InterfaceC60761Nsz
    public final void LJIIJ(String eventName, List<? extends Object> list) {
        o.LJIIJ(eventName, "eventName");
        C60620Nqi.LIZ(this, eventName, list);
    }
}
