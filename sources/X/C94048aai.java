package X;

import android.view.View;
import com.bytedance.effectcreatormobile.behaviour.BehaviourImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour;
import com.bytedance.news.common.service.manager.IService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aai, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94048aai implements C0CK {
    public static final C94048aai LIZ = new C94048aai();

    public static final BehaviourImpl LIZIZ() {
        IService LIZ2 = C93892aYC.LIZ(IBehaviour.class);
        if (!(LIZ2 instanceof BehaviourImpl)) {
            LIZ2 = null;
        }
        return (BehaviourImpl) LIZ2;
    }

    @Override // X.C0CK
    public void LIZ(View view, float f) {
        float abs = 1 - Math.abs(f);
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        View findViewById = view.findViewById(R.id.no9);
        o.LJIIIIZZ(findViewById, "page.findViewById<ImageView>(R.id.model_image)");
        findViewById.setAlpha((0.66f * abs) + 0.34f);
        float f2 = (abs * 0.127f) + 0.873f;
        view.setScaleX(f2);
        view.setScaleY(f2);
    }
}
