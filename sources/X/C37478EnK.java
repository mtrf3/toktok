package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pia.core.plugins.RenderingPlugin;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.j;
import com.google.gson.m;

/* renamed from: X.EnK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37478EnK implements BQ6<m> {
    public final /* synthetic */ RenderingPlugin LIZ;

    public C37478EnK(RenderingPlugin renderingPlugin) {
        this.LIZ = renderingPlugin;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BQ6
    public final void accept(m mVar) {
        this.LIZ.LIZJ.accept(GsonProtectorUtils.fromJson(GsonUtils.LIZIZ(), (j) mVar, java.util.Map.class));
    }
}
