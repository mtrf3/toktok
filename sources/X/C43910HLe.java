package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HLe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43910HLe implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final ShortVideoContext LJLJJI;
    public final InterfaceC82086WJm LJLJJL;
    public final C82632Wbs LJLJJLL;
    public Effect LJLJL;

    static {
        TBT tbt = new TBT(C43910HLe.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public final String LIZIZ(int i) {
        return this.LJLJJL.rX().LJ().LIZIZ.getEffectETData(i);
    }

    public /* synthetic */ C43910HLe(C82622Wbi c82622Wbi, InterfaceC82086WJm interfaceC82086WJm) {
        this(null, null, c82622Wbi, null, interfaceC82086WJm);
    }

    public static void LIZ(C145995oB c145995oB, String str) {
        try {
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(str)).entrySet()) {
                c145995oB.LIZJ(entry.getValue(), entry.getKey());
            }
        } catch (JSONException unused) {
        }
    }

    public C43910HLe(String str, String str2, C82622Wbi diContainer, ShortVideoContext shortVideoContext, InterfaceC82086WJm cameraApiComponent) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = diContainer;
        this.LJLJJI = shortVideoContext;
        this.LJLJJL = cameraApiComponent;
        this.LJLJJLL = UCI.LJI(diContainer, I37.class, null);
    }
}
