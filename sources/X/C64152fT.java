package X;

import fjb.a;
import java.io.File;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.preload.GeckoMemResourceManager$parseGeckoFiles$2", f = "GeckoMemResourceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64152fT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ JSONObject LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64152fT(String str, InterfaceC67352kd interfaceC67352kd, JSONObject jSONObject) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = jSONObject;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64152fT(this.LJLIL, interfaceC67352kd, this.LJLILLLLZI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (!new File(this.LJLIL).isDirectory()) {
            return C76800UCe.LIZ;
        }
        Iterator<String> keys = this.LJLILLLLZI.keys();
        o.LJIIIIZZ(keys, "json.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null && !ujb.o.LJJJJJL(next)) {
                File file = new File(this.LJLIL, next);
                if (file.exists()) {
                    String name = file.getName();
                    o.LJIIIIZZ(name, "subFile.name");
                    C65012gr.LIZ(file, name);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
