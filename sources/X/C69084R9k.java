package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.R9k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69084R9k extends Throwable {
    public static final C69049R8b Companion = new C69049R8b();
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final EnumC69116RAq LJLJI;
    public final EnumC69113RAn LJLJJI;
    public JSONObject LJLJJL;
    public final String LJLJJLL;

    public final String getDetailErrorMsg() {
        return this.LJLJJLL;
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMsg() {
        return this.LJLILLLLZI;
    }

    public final JSONObject getExtra() {
        return this.LJLJJL;
    }

    public final EnumC69116RAq getScene() {
        return this.LJLJI;
    }

    public final EnumC69113RAn getStep() {
        return this.LJLJJI;
    }

    public final void setExtra(JSONObject jSONObject) {
        this.LJLJJL = jSONObject;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C69084R9k(int i, String str, EnumC69116RAq scene, EnumC69113RAn step, JSONObject jSONObject, String detailErrorMsg) {
        super(str);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(step, "step");
        o.LJIIIZ(detailErrorMsg, "detailErrorMsg");
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = scene;
        this.LJLJJI = step;
        this.LJLJJL = jSONObject;
        this.LJLJJLL = detailErrorMsg;
    }

    public /* synthetic */ C69084R9k(int i, String str, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, JSONObject jSONObject, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, enumC69116RAq, enumC69113RAn, jSONObject, (i2 & 32) != 0 ? "" : str2);
    }
}
