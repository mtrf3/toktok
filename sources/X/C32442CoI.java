package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.gift.render.model.Effect;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CoI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32442CoI implements InterfaceC77384UYq<String> {
    public final C32449CoP LIZ;
    public String LIZIZ;
    public final AssetsModel LIZJ;
    public final int LIZLLL;
    public Boolean LJ;

    @Override // X.InterfaceC77384UYq
    public final boolean LIZIZ() {
        long j;
        Boolean bool = this.LJ;
        if (bool != null) {
            return bool.booleanValue();
        }
        C32405Cnh LIZIZ = C32221Ckj.LIZIZ();
        AssetsModel assetsModel = this.LIZJ;
        if (assetsModel != null) {
            j = assetsModel.id;
        } else {
            j = 0;
        }
        LIZIZ.getClass();
        return C32366Cn4.LJFF().LIZ(C32341Cmf.LIZ(j));
    }

    @Override // X.InterfaceC77384UYq
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final String getResult() {
        long j;
        String str = this.LIZIZ;
        if (str == null) {
            C32221Ckj.LIZIZ();
            AssetsModel assetsModel = this.LIZJ;
            if (assetsModel != null) {
                j = assetsModel.id;
            } else {
                j = 0;
            }
            return C32405Cnh.LIZIZ(j);
        }
        return str;
    }

    public C32442CoI(C32449CoP request) {
        AssetsModel assetsModel;
        o.LJIIIZ(request, "request");
        this.LIZ = request;
        Effect effect = request.LIZ;
        if (effect != null) {
            assetsModel = effect.LIZ();
        } else {
            assetsModel = null;
        }
        this.LIZJ = assetsModel;
        this.LIZLLL = request.LIZIZ;
    }

    @Override // X.InterfaceC77384UYq
    public final void LIZ(InterfaceC88472Yns<? super String, C76800UCe> resolve, InterfaceC88472Yns<? super C78163Ulz, C76800UCe> reject) {
        java.util.Map map;
        long j;
        String str;
        java.util.Map<String, String> map2;
        o.LJIIIZ(resolve, "resolve");
        o.LJIIIZ(reject, "reject");
        C32443CoJ c32443CoJ = new C32443CoJ(this, resolve, reject);
        C78160Ulw c78160Ulw = this.LIZ.LIZJ;
        if (c78160Ulw != null && (map2 = c78160Ulw.LJ) != null) {
            map = C113554cx.LJJLIL(map2);
        } else {
            map = null;
        }
        C78160Ulw c78160Ulw2 = this.LIZ.LIZJ;
        if (c78160Ulw2 != null) {
            C77413UZt.LIZLLL(c78160Ulw2, map);
        }
        if (map != null) {
            C78160Ulw c78160Ulw3 = this.LIZ.LIZJ;
            if (c78160Ulw3 != null && c78160Ulw3.LJIILJJIL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_receiver", str);
        }
        C32405Cnh LIZIZ = C32221Ckj.LIZIZ();
        AssetsModel assetsModel = this.LIZJ;
        if (assetsModel != null) {
            j = assetsModel.id;
        } else {
            j = 0;
        }
        int i = this.LIZLLL;
        if (map == null) {
            map = new LinkedHashMap();
        }
        LIZIZ.getClass();
        C32366Cn4.LIZIZ(j, c32443CoJ, i, map, null);
    }
}
