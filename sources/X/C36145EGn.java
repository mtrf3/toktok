package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.poi.PokerBundle;
import fjb.a;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.channel.poker.EffectPokerHandler$geocode$2", f = "EffectPokerHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EGn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36145EGn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C36144EGm LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36145EGn(int i, C36144EGm c36144EGm, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c36144EGm;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36145EGn(this.LJLJI, this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        C36144EGm c36144EGm = this.LJLIL;
        String str = this.LJLILLLLZI;
        c36144EGm.getClass();
        if (str != null) {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("body");
            if (optJSONObject != null) {
                double optDouble = optJSONObject.optDouble("long_data");
                double optDouble2 = optJSONObject.optDouble("lati_data");
                if (!Double.isNaN(optDouble) && !Double.isNaN(optDouble2)) {
                    OSZ osz = new OSZ(Double.valueOf(optDouble), Double.valueOf(optDouble2));
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Effect interface: ");
                    LIZ.append(this.LJLIL.LIZIZ);
                    LIZ.append(" geocode spi call");
                    H78.LJI(X1D.LIZIZ(LIZ));
                    String LIZ2 = EHH.LIZ((Double) osz.getSecond(), (Double) osz.getFirst());
                    LruCache<String, PokerBundle> lruCache = EHH.LIZ;
                    PokerBundle pokerBundle = lruCache.get(LIZ2);
                    lruCache.remove(LIZ2);
                    PokerBundle pokerBundle2 = pokerBundle;
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("type", "POKER");
                    if (pokerBundle2 == null) {
                        i = -1;
                    } else {
                        this.LJLIL.getClass();
                        if (C36144EGm.LJFF(pokerBundle2)) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    }
                    c188727au.LIZLLL(i, "result");
                    FMX.LJIIL("effect_channel_message_result", c188727au.LIZ);
                    if (pokerBundle2 != null) {
                        C36144EGm c36144EGm2 = this.LJLIL;
                        long j = this.LJLJI;
                        c36144EGm2.getClass();
                        String jSONObject = c36144EGm2.LJ(1 ^ (C36144EGm.LJFF(pokerBundle2) ? 1 : 0), pokerBundle2).toString();
                        o.LJIIIIZZ(jSONObject, "generateResponse(\n      …, pokerBundle).toString()");
                        c36144EGm2.LIZLLL(j, jSONObject);
                        return C76800UCe.LIZ;
                    }
                    throw new IllegalAccessException("IPoiService geocode return null");
                }
                throw new IllegalArgumentException("require long or lati is null");
            }
            throw new IllegalArgumentException("require body is null");
        }
        throw new IllegalArgumentException("require arg3 is null");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
